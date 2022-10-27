package indi.grey.ch5;

public class ProcessControlDemo {

	public static void main(String[] args) {

		int temp = 10;

		// 標準for迴圈
		// LABEL 用法
		LOOP_1: for (int i = 0; i < temp; i++) {
			LOOP_2: for (int j = 0; j < temp; j++) {

				System.out.println("abc");
				if (j == i) {
					break LOOP_1;
					// continue;
				}
			}
		}

		// foreach 寫法 快捷提示輸入
		Integer[] intArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (Integer number : intArray) {
			System.out.println(number);
		}

	}
}
