package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algorithm3 {
	public static void main(String[] args) throws Exception {

		System.out.println("開始");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] param = input.split(" ");

		String type = null;
		Integer sum = 0;
		//入力パラメータ順に処理を行う
		for (int idx = 0; idx < param.length; idx++) {
			//入力パラメータが＋かーの場合変数に格納する
			if (param[idx].equals("+") || param[idx].equals("-")) {
				//演算子をtypeに代入
				type = param[idx];
			} else {
				//
				Integer num = Integer.parseInt(param[idx]);
				//演算子が空ではなかったら
				if (type != null) {
					//＋だったらsum + numをしsumに代入
					if (type.equals("+")) {
						sum = sum + num;
						//ーだったらsum - numをしsumに代入
					} else if (type.equals("-")) {
						sum = sum - num;
					}
				} else {
					sum = num;
				}
			}
		}
		System.out.println(sum);
	}

}