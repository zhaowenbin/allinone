package com.derun.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import com.derun.webservice.client.wtmd.AnyType2AnyType2AnyTypeMapMapEntry;
import com.derun.webservice.client.wtmd.AnyType2AnyTypeMapEntry;
import com.derun.webservice.client.wtmd.QuesListUpdateReqInfo;
import com.derun.webservice.client.wtmd.QuesListUpdateResInfo;
import com.derun.webservice.client.wtmd.QuesListUpdateService;
import com.derun.webservice.client.wtmd.QuesListUpdateServiceLocator;
import com.derun.webservice.client.wtmd.QuesListUpdateServicePortType;

public class WtmdClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeService();
	}
	
	private static void invokeService() {
		// TODO Auto-generated method stub
		String serviceURI = "http://localhost:8001/taxcarship/services/QuesListUpdateService";
		//测试入参
		QuesListUpdateReqInfo in0 = new QuesListUpdateReqInfo();
		in0.setDownloadSerialNo("2016082418383133800003");
		
		//axis怎么传递map
		AnyType2AnyType2AnyTypeMapMapEntry[] errMap = new AnyType2AnyType2AnyTypeMapMapEntry[1];
		AnyType2AnyType2AnyTypeMapMapEntry errMapO = new AnyType2AnyType2AnyTypeMapMapEntry();
		errMapO.setKey("140004335359");
		errMapO.setValue(new AnyType2AnyTypeMapEntry[1]);
		errMap[0] = errMapO;
		
		in0.setErrMap(errMap);
		in0.setPassword("123456");
		in0.setReqStyle("0"); //0-反馈错误数据  1-请求下载
		in0.setUsername("admin123");
		in0.setPageSize(1);
		try {
			QuesListUpdateService service = new QuesListUpdateServiceLocator();
			QuesListUpdateServicePortType client = service.getQuesListUpdateServiceHttpPort(new URL(serviceURI));
			QuesListUpdateResInfo out = client.loadQuesList(in0);
			System.out.println(out.getReturnCode()+"  <---返回码，下载序列号--->"+out.getDownloadSerialNo());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	

}
