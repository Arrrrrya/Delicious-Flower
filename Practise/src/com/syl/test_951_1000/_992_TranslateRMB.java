package com.syl.test_951_1000;

import java.util.HashMap;
import java.util.Map;

/**
 * to��дһ������,��������ת��������Ҷ����ַ���,����,��1006.333ת��ΪҼǧ��½Ԫ���ǡ�
 * 
 * @author syl
 * @syl the bug is not what you see,but what it is.
 */
public class _992_TranslateRMB {

	public String transRMBFromNumbertoChinese(String inPutRmb) {
		Map<String, String> rmbMap = new HashMap<String, String>();
		rmbMap.put("0", "��");
		rmbMap.put("1", "Ҽ");
		rmbMap.put("2", "��");
		rmbMap.put("3", "��");
		rmbMap.put("4", "��");
		rmbMap.put("5", "��");
		rmbMap.put("6", "½");
		rmbMap.put("7", "��");
		rmbMap.put("8", "��");
		rmbMap.put("9", "��");

		StringBuilder sb = new StringBuilder();
		String yuan = inPutRmb.split("\\.")[0];
		String jiao = inPutRmb.split("\\.")[1].substring(0, 1);

		// ���������
		// ��ǧ���پ�ʮ��
		int yuanLenth = yuan.length();
		for (int i = 0; i < yuanLenth; i++) {
			sb.append(rmbMap.get(yuan.charAt(i) + ""));
		}
		for (int i = yuanLenth; i > 0; i--) {
			if (i - 1 > 0 && ((i - 1) / 1 == 1||(i - 1) / 5 == 1))
				sb.insert(i - 1, i - 1 > 0 ? "ʰ" : "");
			if (i - 2 > 0 && ((i - 2) / 2 == 1||(i - 2) / 1 == 1))
				sb.insert(i - 2, i - 2 > 0 ? "��" : "");
			if (i - 3 > 0 && ((i - 3) / 3 == 1||(i - 3) / 1 == 1))
				sb.insert(i - 3, i - 3 > 0 ? "ǧ" : "");
			if (i - 4 > 0 && ((i - 4) / 4 == 1||(i - 4) / 1 == 1))
				sb.insert(i - 4, i - 4 > 0 ? "��" : "");
			if (i - 8 > 0 && ((i - 8) / 8 == 1||(i - 8) / 1 == 1))
				sb.insert(i - 8, i - 8 > 0 ? "��" : "");
		}

		sb.append("Ԫ").append(rmbMap.get(jiao) + "��");
		String outPutRmb = sb.toString();
		for (int i = 0; i < sb.length(); i++) {
			outPutRmb = outPutRmb.toString()
					.replace("��Ԫ", "Ԫ")
					.replace("����", "��")
					.replace("��ʰ", "��")
					.replace("���", "��")
					.replace("��ǧ", "��")
					.replace("����", "��")
					.replace("����", "��");

		}
		return outPutRmb;
	}

	public static void main(String[] args) {
		System.out.println(new _992_TranslateRMB().transRMBFromNumbertoChinese("10000.321"));
	}
}