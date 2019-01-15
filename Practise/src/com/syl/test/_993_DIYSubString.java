package com.syl.test;

import java.util.ArrayList;

/*
 * to实现一个按字节来截取字符串的子串的方法,功能类似于String类的substring()方法.
 * String类是按字符截取的,例如"中国abc",substring(1,3), 将返回"国a"。这里要求按字节截取,一个英文字符当一个字节,一个中文字符当两个字节
 * 
 * @author syl
 * @syl the bug is not what you see,but what it is.
 */
public class _993_DIYSubString {

	public String mySubString(String strToBeSub, int beginByteIndex, int endByteIndex) {
		if (null == strToBeSub || "" == strToBeSub || beginByteIndex < 0 || beginByteIndex > endByteIndex) {
			return "";
		}
		if (endByteIndex > strToBeSub.getBytes().length) {
			endByteIndex = strToBeSub.getBytes().length;
		}

		ArrayList<String> strs = new ArrayList<String>();
		for (int i = 0; i < strToBeSub.length(); i++) {
			strs.add(strToBeSub.charAt(i) + "");
		}
		int strsSize = strs.size();

		if (beginByteIndex > 0) {
			int removeLength = 0;
			int removeFlag = 0;
			int strToBeSubLength = strToBeSub.length();
			for (int i = 0; i < strToBeSubLength; i++) {
				removeLength += strs.get(i).getBytes().length;
				if (removeLength == beginByteIndex || removeLength == beginByteIndex + 1) {
					removeFlag = i + 1;
					break;
				}
			}
			for (int i = 0; i < removeFlag; i++) {
				strs.remove(0);
			}
			strsSize = strs.size();
		}

		int subLength = 0;
		int subFlag = 0;
		for (int i = 0; i < strsSize; i++) {
			subLength += strs.get(i).getBytes().length;
			if (subLength == (endByteIndex - beginByteIndex) || subLength == (endByteIndex - beginByteIndex - 1)) {
				subFlag = i + 1;
				break;
			}
		}
		for (int i = strs.size() - 1; i > subFlag; i--) {
			strs.remove(i);
		}
		strsSize = strs.size();

		strToBeSub = "";
		for (int i = 0; i < strsSize; i++) {
			strToBeSub += strs.get(i);
		}
		return strToBeSub;
	}

	public static void main(String[] args) {
//		System.out.println(new _007_DIYSubString().mySubString("bugIsbug", 3, 5));
		System.out.println(new _993_DIYSubString().mySubString("虫子is虫子", 0, 1));
	}

}
