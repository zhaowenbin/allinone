package com.sf;

public class StrTool {
	
	/** 
	 * �ַ���ת����ʮ�������ַ��� 
	 */  
	  
	public static String str2HexStr(String str) {  
	  
	    char[] chars = "0123456789ABCDEF".toCharArray();  
	    StringBuilder sb = new StringBuilder("");  
	    byte[] bs = str.getBytes();  
	    int bit;  
	    for (int i = 0; i < bs.length; i++) {  
	        bit = (bs[i] & 0x0f0) >> 4;  
	        sb.append(chars[bit]);  
	        bit = bs[i] & 0x0f;  
	        sb.append(chars[bit]);  
	    }  
	    return sb.toString();  
	}  
	  
	/** 
	 *  
	 * ʮ������ת���ַ��� 
	 */  
	  
	public static String hexStr2Str(String hexStr) {  
		hexStr = hexStr.toUpperCase();
	    String str = "0123456789ABCDEF";  
	    char[] hexs = hexStr.toCharArray();  
	    byte[] bytes = new byte[hexStr.length() / 2];  
	    int n;  
	    for (int i = 0; i < bytes.length; i++) {  
	        n = str.indexOf(hexs[2 * i]) * 16;  
	        n += str.indexOf(hexs[2 * i + 1]);  
	        bytes[i] = (byte) (n & 0xff);  
	    }  
	    return new String(bytes);  
	}  
	  
	/** 
	 * bytesת����ʮ�������ַ��� 
	 */  
	public static String byte2HexStr(byte[] b) {  
	    String hs = "";  
	    String stmp = "";  
	    for (int n = 0; n < b.length; n++) {  
	        stmp = (Integer.toHexString(b[n] & 0XFF));  
	        if (stmp.length() == 1)  
	            hs = hs + "0" + stmp;  
	        else  
	            hs = hs + stmp;  
	    }  
	    return hs.toUpperCase();  
	}  
	  
	private static byte uniteBytes(String src0, String src1) {  
	    byte b0 = Byte.decode("0x" + src0).byteValue();  
	    b0 = (byte) (b0 << 4);  
	    byte b1 = Byte.decode("0x" + src1).byteValue();  
	    byte ret = (byte) (b0 | b1);  
	    return ret;  
	}  
	  
	/** 
	 * ʮ�������ַ���ת����bytes
	 */  
	public static byte[] hexStr2Bytes(String src) {  
	    int m = 0, n = 0;  
	    int l = src.length() / 2;  
	    System.out.println(l);  
	    byte[] ret = new byte[l];  
	    for (int i = 0; i < l; i++) {  
	        m = i * 2 + 1;  
	        n = m + 1;  
	        ret[i] = uniteBytes(src.substring(i * 2, m), src.substring(m, n));  
	    }  
	    return ret;  
	} 
	
	public static void main(String[] args) {
		byte[] head={(byte)0xAA, (byte)0x85, (byte)0x10, (byte)0x55};	//֡ͷ
		byte deviceID = (byte)0x00;	//�豸ID
		byte infoType = (byte)0x0001;	//��Ϣ���
		byte infoLength = (byte)0x0001;	//��Ϣ����
		byte dataSegment = (byte)0x01;	//���ݶ�
		byte tail = (byte) (head[0]^head[1]^head[2]^head[3]^deviceID^infoType^infoLength^dataSegment);	//У���
		byte[] statusReq = {(byte)0xAA, (byte)0x85, (byte)0x10, (byte)0x55,deviceID,infoType,infoLength,dataSegment,tail};
		System.out.println(tail);
	}

}
