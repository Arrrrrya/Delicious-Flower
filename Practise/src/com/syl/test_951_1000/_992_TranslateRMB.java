package com.syl.test_951_1000;

import java.util.HashMap;
import java.util.Map;

/**
 * to±àĞ´Ò»¸ö³ÌĞò,½«¸¡µãÊı×ª»»³ÉÈËÃñ±Ò¶Á·¨×Ö·û´®,ÀıÈç,½«1006.333×ª»»ÎªÒ¼Ç§ÁãÂ½ÔªÈş½Ç¡£
 * 
 * @author syl
 * @syl the bug is not what you see,but what it is.
 */
public class _992_TranslateRMB {

	public String transRMBFromNumbertoChinese(String inPutRmb) {
		Map<String, String> rmbMap = new HashMap<String, String>();
		rmbMap.put("0", "Áã");
		rmbMap.put("1", "Ò¼");
		rmbMap.put("2", "·¡");
		rmbMap.put("3", "Èş");
		rmbMap.put("4", "ËÁ");
		rmbMap.put("5", "Îé");
		rmbMap.put("6", "Â½");
		rmbMap.put("7", "Æâ");
		rmbMap.put("8", "°Æ");
		rmbMap.put("9", "¾Á");

		StringBuilder sb = new StringBuilder();
		String yuan = inPutRmb.split("\\.")[0];
		String jiao = inPutRmb.split("\\.")[1].substring(0, 1);

		// Îé¾Á¾Á¾Á¾Á
		// ¾ÁÇ§¾Á°Ù¾ÁÊ®¾Á
		int yuanLenth = yuan.length();
		for (int i = 0; i < yuanLenth; i++) {
			sb.append(rmbMap.get(yuan.charAt(i) + ""));
		}
		for (int i = yuanLenth; i > 0; i--) {
			if (i - 1 > 0 && ((i - 1) / 1 == 1||(i - 1) / 5 == 1))
				sb.insert(i - 1, i - 1 > 0 ? "Ê°" : "");
			if (i - 2 > 0 && ((i - 2) / 2 == 1||(i - 2) / 1 == 1))
				sb.insert(i - 2, i - 2 > 0 ? "°Ù" : "");
			if (i - 3 > 0 && ((i - 3) / 3 == 1||(i - 3) / 1 == 1))
				sb.insert(i - 3, i - 3 > 0 ? "Ç§" : "");
			if (i - 4 > 0 && ((i - 4) / 4 == 1||(i - 4) / 1 == 1))
				sb.insert(i - 4, i - 4 > 0 ? "Íò" : "");
			if (i - 8 > 0 && ((i - 8) / 8 == 1||(i - 8) / 1 == 1))
				sb.insert(i - 8, i - 8 > 0 ? "ÒÚ" : "");
		}

		sb.append("Ôª").append(rmbMap.get(jiao) + "½Ç");
		String outPutRmb = sb.toString();
		for (int i = 0; i < sb.length(); i++) {
			outPutRmb = outPutRmb.toString()
					.replace("ÁãÔª", "Ôª")
					.replace("ÁãÁã", "Áã")
					.replace("ÁãÊ°", "Áã")
					.replace("Áã°Ù", "Áã")
					.replace("ÁãÇ§", "Áã")
					.replace("ÁãÍò", "Áã")
					.replace("ÁãÒÚ", "Áã");

		}
		return outPutRmb;
	}

	public static void main(String[] args) {
		System.out.println(new _992_TranslateRMB().transRMBFromNumbertoChinese("10000.321"));
	}
}