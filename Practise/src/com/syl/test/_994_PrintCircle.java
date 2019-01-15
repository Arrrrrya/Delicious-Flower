package com.syl.test;

/**
 * 
 * @question 通过API文档查询Math类的方法，打印出近似圆，只要给定不同半径，圆的大小随之发生改变
 * @link https://www.nowcoder.com/questionTerminal/9a65beb4bcf3462588e81dd203ecbf5a
 *
 * @author https://blog.csdn.net/yangxiucheng520/article/details/77097269
 * @syl the bug is not what you see,but what it is.
 */
public class _994_PrintCircle {

	public void getCircle(int r) {
		// to 定义y为圆的纵坐标,其中y=y+2是让设置纵坐标的步长，可以调整椭圆的“胖瘦”
		for (int y = 0; y <= 2 * r; y = y + 2) {
			long x = Math.round(r - Math.sqrt(2 * r * y - y * y));
			for (int i = 0; i <= 2 * r; i++) {
				// i==x是指某一个纵坐标对应的一个横坐标，i==2*r-x 是指该纵坐标对应的第二个横坐标
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
