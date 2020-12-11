package com.company;

public class Ex1 {

	public static void main(String[] args) {
		//TODO 問1. 標準出力に Hello World と出力してください。
		System.out.println("問1");
		System.out.println("Hello World");
		System.out.println("\n");

		//TODO 問2. 変数 str に 文字列"Hello world"を代入し、標準出力で、Helloのみを出力してください。
		System.out.println("問2");
		String str = "Hello world";
		System.out.println(str.substring(6));
		System.out.println("\n");

		//TODO 問3. 以下の浮動小数点型の変数PIを、整数型にして標準出力に出力してください。
		System.out.println("問3");
		double PI = 3.14;
		System.out.println((int) PI);
		System.out.println("\n");

		//TODO 問4. 以下の配列を、for文を使って、偶数番目の要素のみ標準出力で出力してください。
		System.out.println("問4");
		String[] sweets = { "Anko", "Banana", "Cupcake", "Donut", "Eclair", "Froyo" };
		for (int i = 0; i < sweets.length; i++) {
			if ((i % 2) == 0) {
				System.out.println(sweets[i]);
			}
		}
	}
}