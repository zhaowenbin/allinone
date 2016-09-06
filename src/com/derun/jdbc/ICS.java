package com.derun.jdbc;

import com.derun.jdbc.db.ExeSQL;

public class ICS {
	
	static ExeSQL es = new ExeSQL();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		query() ;
	}
	
	private static void query() {
		// TODO Auto-generated method stub
		try {
			StringBuffer str = new StringBuffer();			
			str.append(" select count(1) ");
			str.append("       from ");
			str.append("       ( ");
			str.append("        select distinct b.c17 id,b.c07 zm,count(1) num,sum(c14) hjje from allt b ");
			str.append("       where 1=1 ");
			str.append("        and b.c11='2016年1月' ");
			str.append("        group by b.c17,b.c07 ");
			str.append("       )main, ");
			str.append("       ( ");
			str.append("                 select a.c01 id,b.c07 zm,count(1) num , ");
			str.append("                     sum( ");
			str.append("                           case b.c07  ");
			str.append("                             when '人力资源费-五险一金-住房公积金' then  to_number(a.C16) ");
			str.append("                               when '人力资源费-五险一金-养老保险' then  to_number(a.C18) ");
			str.append("                                 when '人力资源费-五险一金-失业保险' then  to_number(replace(replace(a.C20,')',''),'(','')) ");
			str.append("                                   when '人力资源费-五险一金-工伤保险' then  to_number(a.C22) ");
			str.append("                                     when '人力资源费-五险一金-医疗保险' then  to_number(a.C23) ");
			str.append("                                       when '人力资源费-五险一金-生育保险' then  to_number(a.C24) ");
			str.append("                                         when '人力资源费-员工管理费' then  to_number(a.C29) ");
			str.append("                                           when '人力资源费-餐补' then  to_number(a.C32) ");
			str.append("                                             when '人力资源费-商业保险-商业医疗保险' then  to_number(a.C32) ");
			str.append("                                               when '人力资源费-奖金' then  to_number(a.C32) ");
			str.append("                                                 when '人力资源费-绩效工资' then  to_number(a.C32) ");
			str.append("                                                   when '人力资源费-职工薪金（D）' then  to_number(a.C09) ");
			str.append("                                                     when '人力资源费-职工薪金-正式员工' then  to_number(a.C09) ");
			str.append("                                                end ");
			str.append("                       ) hjje ");
			str.append("                       from AM01 a,ALLT b ");
			str.append("                     where 1=1 ");
			str.append("                     and a.c01=b.c17 ");
			str.append("                     and b.c11='2016年1月' ");
			str.append("                     group by a.c01,b.c07 ");
			str.append("       )month ");
			str.append("  ");
			str.append("       where main.id=month.id ");
			str.append("       and main.zm=month.zm ");
			str.append("       and to_number(main.hjje)=to_number(month.hjje) ");
			str.append("       order by id,zm ");

			System.out.println(es.getOneValue(str.toString()));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
