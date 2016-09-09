package com.sf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DeviceServer {

	public static void main(String[] args) throws IOException {
		// ģ�������豸
		startServer1();	//192.168.1.41:1004
	}

	/**
	 * �������1��������
	 * @throws IOException
	 */
	@SuppressWarnings("static-access")
	private static void startServer1() {
		// ��˻�����˼������1
        
        try {
        	ServerSocket ss=new ServerSocket(1004);  //�ӱ���ָ���˿ڼ����ͻ�������
        	System.out.println("����������....");  
        	Socket s=ss.accept();  //��ͻ��˽�������
        	System.out.println("�ͻ���:"+s.getInetAddress().getLocalHost()+"�����ӵ�������");  
        	//���տͻ�������
        	BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream())); 
        	String statusReq = br.readLine();  
        	System.out.println("�ͻ��������ѯ״ָ̬�"+statusReq);
        	
        	if(statusReq!=null){  //�ж��������ͣ�����˵����飬�ͻ��˲����ǣ�      		
        		//��˻��ڲ����ݿͻ���������......
        		//��ͻ��˷��ͷ�������
        		// ֡ͷ
        		byte[] head = { (byte) 0xAA, (byte) 0x85, (byte) 0x10, (byte) 0x55 }; 
        		byte deviceID = (byte) 0x00; // �豸ID
        		// ��Ϣ���
        		byte[] infoType = {(byte) 0x00, (byte) 0x01}; 
        		// ��Ϣ����
        		byte[] infoLength = {(byte) 0x00, (byte) 0x03}; 
        		// ���ݶΣ������в�ѯ״̬����ֵ��"���ݶ�"û���ף�����ν�ˣ��ͻ������ӣ�
        		byte[] dataSegment = {(byte) 0xA1, (byte) 0xA2, (byte) 0xA3}; 
        		// У���
        		byte tail = (byte) (head[0] ^ head[1] ^ head[2] ^ head[3] ^ deviceID ^ infoType[0] ^ infoType[1] ^ infoLength[0] ^ infoLength[1] ^ dataSegment[0] ^ dataSegment[1] ^ dataSegment[2]); 
        		
        		// ģ��״̬��ѯָ���ֵ
        		byte[] statusRes = { head[0], head[1], head[2], head[3], deviceID, infoType[0], infoType[1], infoLength[0], infoLength[1], dataSegment[0], dataSegment[1], dataSegment[2], tail };
        		
        		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));  
        		bw.write(StrTool.byte2HexStr(statusRes));	//״̬��ѯָ���ֵ֡��ʽ
        		bw.flush();//����
        	}
		} catch (IOException e) {  
            e.printStackTrace();  
        }  
  
     
	}
	
	

}
