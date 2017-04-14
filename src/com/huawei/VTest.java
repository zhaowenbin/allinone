package com.huawei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.derun.jdbc.db.ExeSQL;

public class VTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		vinCheck("UU6JA69691D713820");
//		vinCheck("LFMBEK4BXB0052043");
//		vinCheck("SYJKCCSVINMNSXX65");
//		vinCheck("BIGBANGLOVEVIP145");
//		vinCheck("LL3AHCDL8DA003286");
//		vinCheck("LL3AHCDL8DA003286");
//		vinCheck("LJDBAA15570011588");
//		checkDate();
//		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
//		Date date = sim.parse("2016-03-18");
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(date);
		Map<String,Object> map = new HashMap<String,Object>();
		VTest carinfo = (VTest)map.get("HD");
		System.out.println(carinfo);
		System.exit(0);
	}
	
	private static void checkDate() {
		// TODO Auto-generated method stub
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			Date aDate = sdf.parse("20161224");
			System.out.println(aDate.before(today));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * 车架号加权验证
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static boolean vinCheck(String vin){
		boolean checkRes = false;
		try {
			vin = vin.toUpperCase();
			char[] vinC = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','J','K','L','M','N','P','R','S','T','U','V','W','X','Y','Z'};
			int[] vinValue = {0,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,1,2,3,4,5,7,9,2,3,4,5,6,7,8,9};
			HashMap hm = new HashMap();
			for(int i=0; i<vinC.length; i++){
				hm.put(vinC[i], vinValue[i]);
			}
			int[] jqz = {8,7,6,5,4,3,2,10,0,9,8,7,6,5,4,3,2};
			if(vin==null || vin.length()!=17){
				System.out.println("车架号只有"+vin.length()+"位");
			}
			int sum = 0;
			for(int j=0; j<vin.length(); j++){
				sum+=Integer.parseInt(hm.get(vin.toCharArray()[j]).toString())*jqz[j];
			}
			if((sum%11==10 && vin.toCharArray()[8]=='X') || (sum%11 == Integer.parseInt(hm.get(vin.toCharArray()[8]).toString()))){
				System.out.println("校验正确");
				checkRes = true;
			}else{
				System.out.println("校验错误");
			}
		} catch (Exception e) {
			System.out.println("校验错误"+e.getMessage());
		}
		return checkRes;
	}
	
	/**
	 * 输入一个字符串，将其各个字符对应的ASCII值加5后，输出结果。
 	      程序要求：该字符串只包含小写字母，若其值加5后的字符值大于'z',将其转换成从a开始的字符
	 */
	private String q1(String str1) {
		// TODO Auto-generated method stub
		String str2 = "";
		char[] charArr1 = str1.toCharArray();
		

		return str2;
	}
	
	private static void insertOtherCharacter(){
		String sql = "INSERT INTO SYJK_CCS_CCSQRRCJBXX(TAXQUERYNO,TAXPRINTNO,TAXCONFIRMNO,CALCTAXFLAG,LICENSEPLATENO,LICENSEPLATETYPE,MOTORTYPECODE,ENGINENO,VIN,MADEFACTORY,MOTORUSAGETYPECODE,NOLICENSEFLAG,MODEL,FIRSTREGISTERDATE,VEHICLETYPE,RATEDPASSENGERCAPACITY,TONNAGE,WHOLEWEIGHT,DISPLACEMENT,POWER,FUELTYPE,VEHICLEOWNERNAME,CREDENTIALNO,CREDENTIALCODE,ADDRESS,PHONENO,TAXAMOUNT_FLAG,ANNUALTAXDUE,SUMTAXDEFAULT,SUMOVERDUE,SUMTAX,LOGINNAME,REVENUECODE,SJCJRQ,SJCJFS,SPECIALCARTYPE,DECLAREDSTATUS,STATUSDATE,INSURESTARTDATE,INSUREENDDATE,CARMATCHID)VALUES('1PICC210200A20161122163908166939','1PICC210200G20161122164313742045','1PICC210200B20161122164313742045','1',null,null,null,null,null,null,null,null,null,TO_DATE(null,'yyyy-MM-dd'),null,0,0.0,0.0,0.0,0.0,null,'BlZONGORalphDesiré','999999999','99',null,null,'2',420.0,0.0,0.0,420.0,'admin2102','22102000000',TO_DATE('2016-11-22','yyyy-MM-dd'),'0',null,'0',TO_DATE('2016-11-22','yyyy-MM-dd'),TO_DATE('2016-11-23','yyyy-MM-dd'),TO_DATE('2017-11-23','yyyy-MM-dd'),'0')";
		ExeSQL es = new ExeSQL();
		boolean bl = es.execUpdateSQL(sql);
		System.out.println(bl);
	}

}
