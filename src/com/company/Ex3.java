package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		/*
		問. 任意の3桁の整数(100 ～ 999)を標準入力から受け取り、
		100の位、10の位、1の位の数字を足した数を標準出力してください
		例. 入力: 476
		    出力: 17
		 */
		System.out.println("3桁の整数を入力してください");
		// Let's coding!

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();

		int sum = 0;

		List<Integer> list = new ArrayList<>();
		while (num > 0) {
			list.add(num % 10);
			num /= 10;
		}

		for (int i = 0; i < list.size(); i++) {
			sum = list.get(i) + sum;
		}

		System.out.println(sum);
	}
}