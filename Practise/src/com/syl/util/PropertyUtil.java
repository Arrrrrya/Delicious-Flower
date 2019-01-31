package com.syl.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * 
 * @question 读取常量properties文件
 * @link
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class PropertyUtil {
	@SuppressWarnings("rawtypes")
	private Map map = null;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void loadFile() {
		map = new HashMap();
		try {
			Properties p = new Properties();
			p.load(PropertyUtil.class.getClassLoader().getResourceAsStream("com/syl/property/params.properties"));
			Iterator it = p.keySet().iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				String value = p.getProperty(key);
				map.put(key, value);
			}
			System.out.println("---have loaded data: " + map.size() + "---");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getValue(String str) {
		if (map == null) {
			loadFile();
		}
		return (String) map.get(str);
	}

	public static void main(String[] args) {
		PropertyUtil p = new PropertyUtil();
		System.out.println("name: " + p.getValue("name"));
		System.out.println("age: " + p.getValue("age"));// 17
		System.out.println("gender: " + p.getValue("gender"));
	}
}