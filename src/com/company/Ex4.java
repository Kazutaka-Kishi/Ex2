package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		/*
		問. ３つの整数を標準入力で受け取り、"どれか一つ" が0より大きかったらtrue
		    どれも0より小さければfalse となるようなプログラムを書いてください。
		 例. 入力: 1 0 -1
		     出力: true
		     入力: 1 1 1
		     出力: false
		 */
		System.out.println("３つの数字を入力してください 数字はそれぞれスペースで区切ること。");
		Scanner scanner = new Scanner(System.in);

		// Let's coding!!

		// 入力した値を配列に格納する
		int[] numList = new int[3];
		for (int i = 0; i < numList.length; i++) {
			numList[i] = scanner.nextInt();
		}
		scanner.close();

		// 昇順に並び替える
		Arrays.sort(numList);

		for (int i = 0; i < numList.length; i++) {
			if (numList[i] > 0) {
				// 値が0より大きい場合
				if (i == numList.length - 1) {
					// 配列最後の値であればtrue
					System.out.println(true);
					break;
				} else {
					// 昇順で並び替えたため、配列の途中の値でればfalse
					System.out.println(false);
					break;
				}
			}

			if (i == numList.length - 1) {
				// 配列最後まで0より大きい値がなければfalse
				System.out.println(false);
			}
		}
	}
}