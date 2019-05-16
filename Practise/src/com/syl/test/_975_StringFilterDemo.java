package com.syl.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * String mgrDeptConfigId ="1092,1032,1072";//配置数据
 * String mgrDeptid = "1072,1083,1032,1029,1098,1092";//用户选择的数据
 * 如何在mgrDeptid中过滤掉mgrDeptConfigId中的值，保证最终得到的结果为"1083,1029,1098"
 * 
 * @author sunyl
 *
 */
public class _975_StringFilterDemo {

	public static void main(String[] args) {
		String mgrDeptConfigId ="1092,1032,1072";//配置数据
		String mgrDeptid = "1072,1083,1032,1029,1098,1092";//用户选择的数据
		
		String result = filter(mgrDeptConfigId,mgrDeptid);
		System.out.println(result);
		
		String resultInOrder = filterInOrder(mgrDeptConfigId,mgrDeptid);
		System.out.println(resultInOrder);
	}
	
	static String filter(String filterString,String needToFilter){
		String [] filterStrings = filterString.split(",");
		String [] needToFilters = needToFilter.split(",");
		HashSet<String> filterStringsSet = new HashSet<String>(Arrays.asList(filterStrings));
		HashSet<String> needToFiltersSet = new HashSet<String>(Arrays.asList(needToFilters));
		needToFiltersSet.removeAll(filterStringsSet);
		String result = needToFiltersSet.toString().replace("[", "").replace(" ", "").replace("]", "");
		return result;
	}
	
	static String filterInOrder(String filterString,String needToFilter){
		String [] filterStrings = filterString.split(",");
		String [] needToFilters = needToFilter.split(",");
		List<String> filterStringsList = Arrays.asList(filterStrings);
		List<String> needToFiltersList = Arrays.asList(needToFilters);
		List<String> resultList = new ArrayList<String>();
		for (String string : needToFiltersList) {
			if(!filterStringsList.contains(string)){
				resultList.add(string);
			}
		}
		String result = resultList.toString().replace("[", "").replace(" ", "").replace("]", "");
		return result;
	}

}
