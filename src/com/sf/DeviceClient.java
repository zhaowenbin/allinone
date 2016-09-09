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
			System.out.println("是否与设备建立连接："+socket.isConnected());
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			
			// 帧头
			byte[] head = { (byte) 0xAA, (byte) 0x85, (byte) 0x10, (byte) 0x55 }; 
			byte deviceID = (byte) 0x00; // 设备ID
			// 信息类别
			byte[] infoType = {(byte) 0x00, (byte) 0x01}; 
			// 信息长度
			byte[] infoLength = {(byte) 0x00, (byte) 0x01}; 
			// 数据段
			byte dataSegment = (byte) 0x01; 
			// 校验和
			byte tail = (byte) (head[0] ^ head[1] ^ head[2] ^ head[3] ^ deviceID ^ infoType[0] ^ infoType[1] ^ infoLength[0] ^ infoLength[1] ^ dataSegment); 
			// 状态查询指令帧格式 4+1+2+2+1+1 
			byte[] statusReq = { head[0], head[1], head[2], head[3], deviceID, infoType[0], infoType[1], infoLength[0], infoLength[1], dataSegment, tail };
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
			//发送查询指令
			bw.write(StrTool.byte2HexStr(statusReq));
			bw.flush();
			
			//接收返回值
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String statusRes = br.readLine();
			System.out.println("服务端设备状态：" + statusRes);
			
		} catch (IOException ioe) {
			System.out.println("设备连接失败, ip=" + host + ", port=" + port);
		}
	}  

}
