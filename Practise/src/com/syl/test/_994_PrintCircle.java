package com.syl.test;

/**
 * 
 * @question ͨ��API�ĵ���ѯMath��ķ�������ӡ������Բ��ֻҪ������ͬ�뾶��Բ�Ĵ�С��֮�����ı�
 * @link https://www.nowcoder.com/questionTerminal/9a65beb4bcf3462588e81dd203ecbf5a
 *
 * @author https://blog.csdn.net/yangxiucheng520/article/details/77097269
 * @syl the bug is not what you see,but what it is.
 */
public class _994_PrintCircle {

	public void getCircle(int r) {
		// to ����yΪԲ��������,����y=y+2��������������Ĳ��������Ե�����Բ�ġ����ݡ�
		for (int y = 0; y <= 2 * r; y = y + 2) {
			long x = Math.round(r - Math.sqrt(2 * r * y - y * y));
			for (int i = 0; i <= 2 * r; i++) {
				// i==x��ָĳһ���������Ӧ��һ�������꣬i==2*r-x ��ָ���������Ӧ�ĵڶ���������
				if (i == x || i == 2 * r - x) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		new _994_PrintCircle().getCircle(5);

	}

}
