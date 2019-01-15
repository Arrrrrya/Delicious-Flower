package com.syl.test;

import java.math.*;

/**
 * to编写一个程序,将浮点数转换成人民币读法字符串,例如,将1006.333转换为壹千零陆元叁角。
 * 
 * @author https://www.nowcoder.com/profile/123295334
 * @syl the bug is not what you see,but what it is.
 */
public class _008_TransRMB {
	public String[] RMBNumber = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾", "佰", "仟", "万", "亿" };

	public String conversion(double inputMoney) {
		BigDecimal money = new BigDecimal(inputMoney + "");
		String transResult = "人民币";
		String[] num = (money + "").split("\\.");
		System.out.println("integerPart:" + num[0]);
		System.out.println("decimalPart:" + num[1]);

		String[] integerPart = new String[(int) Math.ceil(num[0].length() * 1.0 / 4)];// Math.ceil为向上取整

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
				transResult += "元";
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
				if (ans.length() >= 2 && ans.charAt(ans.length() - 2) == '零') {
					ans.deleteCharAt(ans.length() - 1);
				}
			} else {
				if (i != integerPart.length() - 1)
					ans.append(RMBNumber[12 - (4 - integerPart.length()) - i]);
			}
			if (ans.length() > 1 && ans.charAt(0) == '零')
				ans.deleteCharAt(0);
			if (ans.length() > 1 && ans.charAt(ans.length() - 1) == '零')
				ans.deleteCharAt(ans.length() - 1);
		}
		return new String(ans);
	}

	public String transDecimalPart(String decimalPart) {
		String ans = "";
		String buf = decimalPart.substring(0, 2);
		if (buf.equals("00"))
			return "整";
		else {
			if (buf.charAt(0) != '0')
				ans += RMBNumber[Integer.valueOf(decimalPart.charAt(0) - '0')] + "角";
			if (buf.charAt(1) != 0)
				ans += RMBNumber[Integer.valueOf(decimalPart.charAt(1) - '0')] + "分";
		}
		return ans;
	}

	public static void main(String[] args) {
		_008_TransRMB test = new _008_TransRMB();
		System.out.println(test.conversion(151121.15));

	}

}
