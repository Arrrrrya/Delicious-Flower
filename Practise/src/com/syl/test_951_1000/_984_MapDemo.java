package com.syl.test_951_1000;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @question 给定["a","b","a","b","c","a","b"]字符串数组,然后使用Map的key来保存数组中字符串元素,
 *           value保存该字符串元素的出现次数,最后统计出各字符串元素的出现次数。
 * @link https://www.nowcoder.com/questionTerminal/88afe7e4a0054330a2a91c121d9b61df
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _984_MapDemo {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Map count(String[] strArray) {
		Map map = new HashMap();
		for (int i = 0; i < strArray.length; i++) {
			if (map.containsKey(strArray[i])) {
				map.put(strArray[i], (int) map.get(strArray[i]) + 1);
			} else {
				map.put(strArray[i], 1);
			}
		}
		return map;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		String[] strArray = { "a", "b", "a", "b", "c", "a", "b" };
		Map resultMap = new _984_MapDemo().count(strArray);

		Set<String> set = resultMap.keySet();
		for (String str : set) {
			System.out.println(str + ":" + resultMap.get(str));
		}
	}
}
