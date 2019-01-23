package com.syl.test;

/**
 * 
 * @question test for try/catch/finally/Exception
 * @link  
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _982_TryCatchDemo {

	static void testTryCatch() {
		try {
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch: " + e.toString());
		} finally {
			System.out.println("finally");
		}
	}

	static void testTryCatch2() {
		try {
			System.out.println("try");
			int a = Integer.parseInt("a");
			System.out.println("a: " + a);
		} catch (Exception e) {
			System.out.println("catch: " + e.toString());
		} finally {
			System.out.println("finally");
		}
	}

	static void testTryCatch3() {
		try {
			System.out.println("try");
			int b = 5 / 0;
			System.out.println("b: " + b);
		} catch (NumberFormatException e) {
			System.out.println("catchNumberFormatException: " + e.toString());
		} catch (Exception e) {
			System.out.println("catch: " + e.toString());
		} finally {
			System.out.println("finally");
		}
	}

	static void testTryCatch4() {
		Exception myException = new Exception("test Excetion, nothing is wrong with your code.");
		try {
			System.out.println("try");
			throw myException;
		} catch (NumberFormatException e) {
			System.out.println("catchNumberFormatException: " + e.toString());
		} catch (Exception e) {
			System.out.println("catch: " + e.toString());
		} finally {
			System.out.println("finally");
		}
	}

	static void testTryCatch5() throws Exception {
		Exception myException = new Exception("test Excetion, nothing is wrong with your code.");
		try {
			System.out.println("try");
			throw myException;
		} catch (NumberFormatException e) {
			System.out.println("catchNumberFormatException: " + e.toString());
		} catch (Exception e) {
			System.out.println("catch: " + e.toString());
			throw myException;
		} finally {
			System.out.println("finally");
		}
	}

	public static void main(String[] args) {
		System.out.println("----111----");
		System.out.println("start");
		testTryCatch();
		System.out.println("end");

		System.out.println("----222----");
		System.out.println("start");
		testTryCatch2();
		System.out.println("end");

		System.out.println("----333----");
		System.out.println("start");
		testTryCatch3();
		System.out.println("end");

		System.out.println("----444----");
		System.out.println("start");
		testTryCatch4();
		System.out.println("end");

		System.out.println("----555----");
		System.out.println("start");
		try {
			testTryCatch5();
		} catch (Exception e) {
			System.out.println("testTryCatch5: " + e.toString());
		}
		System.out.println("end");
	}
}
