package org.opencps.backend.statisticmgt.util;
import org.junit.Test;
import org.opencps.backend.statisticmgt.constant.Constants;
import org.opencps.backend.statisticmgt.util.QueryUtil;

import static org.junit.Assert.*;
/**
 * @author trungnt
 *
 */
public class QueryUtilTest {
	@Test
	public void testGetSQLQueryTemplate() {
	
		//String sqlQueryTemplate = QueryUtil.getSQLQueryTemplate(1, Constants.COUNT);
		
		//System.out.println("type:1|subtype:count " + sqlQueryTemplate);
		
		//assertTrue(sqlQueryTemplate.length() > 0);
		
		//sqlQueryTemplate = QueryUtil.getSQLQueryTemplate(1, Constants.LIST);
		
		//System.out.println("type:1|subtype:list " + sqlQueryTemplate);
		
		//assertTrue(sqlQueryTemplate.length() > 0);
		
		//sqlQueryTemplate = QueryUtil.getSQLQueryTemplate(1, Constants.GROUP_COUNT);
		
		//System.out.println("type:1|subtype:group_count " + sqlQueryTemplate);
		
		//assertTrue(sqlQueryTemplate.length() > 0);
	}
	
	@Test
	public void test() {
		//boolean result = QueryUtil.test1("processing", "processing");
		//assertTrue(result);
		//result = QueryUtil.test2("processing_202", "processing_202");
		//assertTrue(result);
		//createlog(Class, msg,type)
		String[] a = QueryUtil.test3("");
		
		System.out.println(a[0]);
		
		assertTrue(a != null && a.length > 0);
		
		System.out.println("4 " +Thread.currentThread().getId() + "|" + Thread.currentThread().getName() + "|" + Thread.currentThread().getContextClassLoader().getClass().getName());
	}
}
