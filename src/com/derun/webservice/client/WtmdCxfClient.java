package com.derun.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.derun.webservice.client.cxf.AnyType2AnyTypeMap;
import com.derun.webservice.client.cxf.QuesListUpdateReqInfo;
import com.derun.webservice.client.cxf.QuesListUpdateResInfo;
import com.derun.webservice.client.cxf.QuesListUpdateService;
import com.derun.webservice.client.cxf.QuesListUpdateServicePortType;


public class WtmdCxfClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeService();
		
//		HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
//		List<String> ls = new ArrayList<String>();
//		ls.add("erads");
//		hm.put("123", ls);
//		Iterator<Entry<String, List<String>>> iter = hm.entrySet().iterator();
//		while (iter.hasNext()) {
//			Entry<String, List<String>> entry = iter.next();
//			List<String> valList = entry.getValue();
//			System.out.println(valList);
//		}
//		System.exit(0);
		
//		//map转成AnyType2AnyTypeMap
//		HashMap<String,List<String>> map = new HashMap<String,List<String>>();
//		List<String> list = new ArrayList<String>();
//		list.add("error1");
//		list.add("error2");
//		map.put("1", list);
//		AnyType2AnyTypeMap am2tm = new WtmdCxfClient().MapToAnyMap(map);
//		System.out.println(am2tm.getEntry().size());
//		
//		//AnyType2AnyTypeMap赋值
//		AnyType2AnyTypeMap errMap = new AnyType2AnyTypeMap();
//		List<AnyType2AnyTypeMap.Entry> entry = errMap.getEntry();
//		AnyType2AnyTypeMap.Entry e = new com.derun.webservice.client.wtmdcxf.AnyType2AnyTypeMap.Entry();
//		e.setKey("2016082418383133800004");
//		List<String> errList = new ArrayList<String>();
//		errList.add("第1列错误");
//		errList.add("第2列错误");
//		e.setValue(errList);
//		entry.add(e);
//		System.out.println(errMap.getEntry().size());
		
	}
	
	private static void invokeService() {
		// TODO Auto-generated method stub
		String serviceURI = "http://localhost:8001/taxcarship/services/QuesListUpdateService";
		//测试入参
		QuesListUpdateReqInfo in0 = new QuesListUpdateReqInfo();
		in0.setDownloadSerialNo("2016082418383133800003");
		
		AnyType2AnyTypeMap errMap = new AnyType2AnyTypeMap();
		List<AnyType2AnyTypeMap.Entry> entry = errMap.getEntry();
		AnyType2AnyTypeMap.Entry e = new com.derun.webservice.client.cxf.AnyType2AnyTypeMap.Entry();
		e.setKey("140004335359-2013");
		e.setValue("错误信息");
		entry.add(e);
		
		in0.setErrMap(errMap);
		in0.setReqStyle("0"); //0-反馈错误数据  1-请求下载
		in0.setPageSize(1);
		in0.setPassword("123456");
		in0.setUsername("admin123");
		
		try {
			
			QuesListUpdateService service = new QuesListUpdateService(new URL(serviceURI));
			QuesListUpdateServicePortType client = service.getQuesListUpdateServiceHttpPort();
			QuesListUpdateResInfo out = client.loadQuesList(in0);
			System.out.println(out.getReturnCode()+"  <---返回码，下载序列号--->"+out.getDownloadSerialNo());
			
		} catch (MalformedURLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		
		
	}
	
	
	private static AnyType2AnyTypeMap MapToAnyMap(HashMap<String,List<String>> map){
		AnyType2AnyTypeMap at2am = new AnyType2AnyTypeMap();
		List<AnyType2AnyTypeMap.Entry> list = at2am.getEntry();
		Iterator<Entry<String, List<String>>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			AnyType2AnyTypeMap.Entry ey = new AnyType2AnyTypeMap.Entry();
			Entry<String, List<String>> entry =  it.next();
			ey.setKey(entry.getKey());
			ey.setValue(entry.getValue());
			list.add(ey);
		}
		return at2am;
	}

	private Map AnyMapToMap(AnyType2AnyTypeMap at2am) {
		Map map = new HashMap();
		Iterator itt = at2am.getEntry().iterator();
		while (itt.hasNext()) {
			AnyType2AnyTypeMap.Entry entry = (com.derun.webservice.client.cxf.AnyType2AnyTypeMap.Entry) itt.next();
			map.put(entry.getKey().toString(), entry.getValue());
		}
		return map;
	}

}
