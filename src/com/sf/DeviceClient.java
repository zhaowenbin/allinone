package com.sf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class DeviceClient {

	public static void main(String[] args) {
		connServer("127.0.0.1",1004);	//192.168.1.41:1004
	}
	
	private static void connServer(String host, int port) {
		try {
			Socket socket = new Socket(host, port);
			System.out.println("�Ƿ����豸�������ӣ�"+socket.isConnected());
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			
			// ֡ͷ
			byte[] head = { (byte) 0xAA, (byte) 0x85, (byte) 0x10, (byte) 0x55 }; 
			byte deviceID = (byte) 0x00; // �豸ID
			// ��Ϣ���
			byte[] infoType = {(byte) 0x00, (byte) 0x01}; 
			// ��Ϣ����
			byte[] infoLength = {(byte) 0x00, (byte) 0x01}; 
			// ���ݶ�
			byte dataSegment = (byte) 0x01; 
			// У���
			byte tail = (byte) (head[0] ^ head[1] ^ head[2] ^ head[3] ^ deviceID ^ infoType[0] ^ infoType[1] ^ infoLength[0] ^ infoLength[1] ^ dataSegment); 
			// ״̬��ѯָ��֡��ʽ 4+1+2+2+1+1 
			byte[] statusReq = { head[0], head[1], head[2], head[3], deviceID, infoType[0], infoType[1], infoLength[0], infoLength[1], dataSegment, tail };
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
			//���Ͳ�ѯָ��
			bw.write(StrTool.byte2HexStr(statusReq));
			bw.flush();
			
			//���շ���ֵ
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String statusRes = br.readLine();
			System.out.println("������豸״̬��" + statusRes);
			
		} catch (IOException ioe) {
			System.out.println("�豸����ʧ��, ip=" + host + ", port=" + port);
		}
	}  

}
