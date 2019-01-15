package com.syl.test;

import java.math.*;

/**
 * to��дһ������,��������ת��������Ҷ����ַ���,����,��1006.333ת��ΪҼǧ��½Ԫ���ǡ�
 * 
 * @author https://www.nowcoder.com/profile/123295334
 * @syl the bug is not what you see,but what it is.
 */
public class _008_TransRMB {
	public String[] RMBNumber = { "��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��", "ʰ", "��", "Ǫ", "��", "��" };

	public String conversion(double inputMoney) {
		BigDecimal money = new BigDecimal(inputMoney + "");
		String transResult = "�����";
		String[] num = (money + "").split("\\.");
		System.out.println("integerPart:" + num[0]);
		System.out.println("decimalPart:" + num[1]);

		String[] integerPart = new String[(int) Math.ceil(num[0].length() * 1.0 / 4)];// Math.ceilΪ����ȡ��

		int startIndex = 0;
		int endIndex = 0;
		if (num[0].length() % 4 == 0)
			endIndex = 4;
		else
			endIndex = num[0].length() - num[0].length() / 4 * 4;
		for (int i = 0; i < integerPart.length; i++) {
			integerPart[i] = num[0].substring(startIndex, endIndex);
			System.out.println(integerPart[i]);
			startIndex = endIndex;
			endIndex = startIndex + 4;
		}

		for (int i = 0; i < integerPart.length; i++) {
			transResult += transIntegerPart(integerPart[i] + "");
			if (i != integerPart.length - 1) {
				transResult += RMBNumber[RMBNumber.length - 1 - i - (3 - integerPart.length)];
			} else {
				transResult += "Ԫ";
			}
		}

		transResult += transDecimalPart(num[1]);
		return transResult;
	}

	public String transIntegerPart(String integerPart) {
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < integerPart.length(); i++) {
			ans.append(RMBNumber[Integer.valueOf(integerPart.charAt(i) - '0')]);
			if (Integer.valueOf(integerPart.charAt(i) - '0') == 0) {
				if (ans.length() >= 2 && ans.charAt(ans.length() - 2) == '��') {
					ans.deleteCharAt(ans.length() - 1);
				}
			} else {
				if (i != integerPart.length() - 1)
					ans.append(RMBNumber[12 - (4 - integerPart.length()) - i]);
			}
			if (ans.length() > 1 && ans.charAt(0) == '��')
				ans.deleteCharAt(0);
			if (ans.length() > 1 && ans.charAt(ans.length() - 1) == '��')
				ans.deleteCharAt(ans.length() - 1);
		}
		return new String(ans);
	}

	public String transDecimalPart(String decimalPart) {
		String ans = "";
		String buf = decimalPart.substring(0, 2);
		if (buf.equals("00"))
			return "��";
		else {
			if (buf.charAt(0) != '0')
				ans += RMBNumber[Integer.valueOf(decimalPart.charAt(0) - '0')] + "��";
			if (buf.charAt(1) != 0)
				ans += RMBNumber[Integer.valueOf(decimalPart.charAt(1) - '0')] + "��";
		}
		return ans;
	}

	public static void main(String[] args) {
		_008_TransRMB test = new _008_TransRMB();
		System.out.println(test.conversion(151121.15));

	}

}
