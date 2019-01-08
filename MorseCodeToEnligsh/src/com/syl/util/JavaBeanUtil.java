package com.syl.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.syl.daomain.MorseCode;

/**
 * toolName bean转换为map
 * 
 * @author arya
 * 
 */

public class JavaBeanUtil {

	@SuppressWarnings("rawtypes")
	public static Map<String, Object> convertBeanToMap(Object bean)
			throws IntrospectionException, IllegalAccessException, InvocationTargetException {

		Class type = bean.getClass();
		Map<String, Object> returnMap = new HashMap<String, Object>();
		BeanInfo beanInfo = Introspector.getBeanInfo(type);

		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (int i = 0; i < propertyDescriptors.length; i++) {
			PropertyDescriptor descriptor = propertyDescriptors[i];
			String propertyName = descriptor.getName();
			if (!propertyName.equals("class")) {
				Method readMethod = descriptor.getReadMethod();
				Object result = readMethod.invoke(bean, new Object[0]);
				if (result != null) {
					returnMap.put(propertyName, result);
				} else {
					returnMap.put(propertyName, "");
				}
			}
		}
		return returnMap;
	}

	public static void main(String[] args) {
		// 将所有摩斯密码放入map
		Map<String, Object> codeMap = new HashMap<String, Object>();
		MorseCode code = new MorseCode();
		try {
			codeMap = JavaBeanUtil.convertBeanToMap(code);
		} catch (IllegalAccessException | InvocationTargetException | IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (String key : codeMap.keySet()) {
			// map.keySet()返回的是所有key的值
			String value = (String) codeMap.get(key);// 得到每个key对应value的值
			System.out.println(key + ":" + value);
		}
	}

}
