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
		// 模拟服务端设备
		startServer1();	//192.168.1.41:1004
	}

	/**
	 * 监控主机1启动运行
	 * @throws IOException
	 */
	@SuppressWarnings("static-access")
	private static void startServer1() {
		// 光端机服务端监控主机1
        
        try {
        	ServerSocket ss=new ServerSocket(1004);  //从本机指定端口监听客户端连接
        	System.out.println("启动服务器....");  
        	Socket s=ss.accept();  //与客户端建立连接
        	System.out.println("客户端:"+s.getInetAddress().getLocalHost()+"已连接到服务器");  
        	//接收客户端数据
        	BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream())); 
        	String statusReq = br.readLine();  
        	System.out.println("客户端请求查询状态指令："+statusReq);
        	
        	if(statusReq!=null){  //判断请求类型（服务端的事情，客户端不考虑）      		
        		//光端机内部根据客户端请求处理......
        		//向客户端发送返回数据
        		// 帧头
        		byte[] head = { (byte) 0xAA, (byte) 0x85, (byte) 0x10, (byte) 0x55 }; 
        		byte deviceID = (byte) 0x00; // 设备ID
        		// 信息类别
        		byte[] infoType = {(byte) 0x00, (byte) 0x01}; 
        		// 信息长度
        		byte[] infoLength = {(byte) 0x00, (byte) 0x03}; 
        		// 数据段（需求中查询状态返回值中"数据段"没明白，无所谓了，客户端无视）
        		byte[] dataSegment = {(byte) 0xA1, (byte) 0xA2, (byte) 0xA3}; 
        		// 校验和
        		byte tail = (byte) (head[0] ^ head[1] ^ head[2] ^ head[3] ^ deviceID ^ infoType[0] ^ infoType[1] ^ infoLength[0] ^ infoLength[1] ^ dataSegment[0] ^ dataSegment[1] ^ dataSegment[2]); 
        		
        		// 模拟状态查询指令返回值
        		byte[] statusRes = { head[0], head[1], head[2], head[3], deviceID, infoType[0], infoType[1], infoLength[0], infoLength[1], dataSegment[0], dataSegment[1], dataSegment[2], tail };
        		
        		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));  
        		bw.write(StrTool.byte2HexStr(statusRes));	//状态查询指令返回值帧格式
        		bw.flush();//发送
        	}
		} catch (IOException e) {  
            e.printStackTrace();  
        }  
  
     
	}
	
	

}
