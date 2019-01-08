package com.syl.util;

/**
 * toolName �ַ������й��� 1.strΪ��Ҫ���л��е��ַ��������룬����ΪString 2.lenΪÿ�����ٳ��Ƚ��л��У��Ǳ��룬����Ϊint��Ĭ��Ϊ50
 * 
 * @author arya
 *
 */
public class ChangeLineUtil {
	public static String changeLine(String str, int len) {
		StringBuilder sb = new StringBuilder(str);
		int n = sb.length() / len;
		if (n > 0) {
			// ��Ϊ���뻻�з���ʹ�ַ����������ӣ���˱�����ַ������濪ʼ����
			for (int i = n; i > 0; i--) {
				sb.insert(i * len, "\r\n");
			}
		}
		return sb.toString();
	}

	public static String changeLine(String str) {
		StringBuilder sb = new StringBuilder(str);
		int n = sb.length() / 50;
		if (n > 0) {
			for (int i = n; i > 0; i--) {
				sb.insert(i * 50, "\r\n");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "12345678901234567890123456789012345678901";
		System.out.println("str���ȣ�" + str.length());

		System.out.println("---��ʼ����---");
		System.out.println(ChangeLineUtil.changeLine(str));
		System.out.println("---�������---");

		System.out.println("str����2��" + ChangeLineUtil.changeLine(str).length());

	}
}
