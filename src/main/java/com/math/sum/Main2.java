package com.math.sum;

import java.util.Scanner;

public class Main2 {

	/**
	 * 求200000以下的所有质数之和。
	 */

	public static void main(String[] args) {

		/*
		 * if (args.length < 2) { usage(); if (!"--type".equals(args[0])) { usage(); } }
		 * 
		 * String algo = args[1];
		 */

		System.out.println("Please enter the method used：[algo1|algo2]");
		Scanner scanner = new Scanner(System.in);
		String algo = "";
		if(scanner.hasNext()) {
			algo = scanner.next();
		}
		scanner.close();
		int n = 200000;
		switch (algo) {
		case "algo1":
			System.out.println("==Method 1 calculation results:" + sum1(n));
			break;
		case "algo2":
			System.out.println("==Method 2 calculation results:" + sum2(n));
			break;
		default:
			//usage();
			System.out.println("Unsupported methods:" + algo);
		}
	}

	private static void usage() {
		System.out.println("Usage method : java -jar sum-0.0.1-SNAPSHOT.jar --type [algo1|algo2]");
		System.exit(1);
	}

	/**
	 * 不考虑性能的循环判断整除
	 * Cyclic Judgment Dividing Without Consideration of Performance
	 * @param n
	 * @return
	 */
	private static long sum1(int n) {
		long sum = 2;
		for (int i = 3; i <= n; i += 2) {
			int j = 3;
			for (; j < i; j += 2) {
				if (i % j == 0 || j * j > i) {
					break;
				}
			}
			if (j * j > i) {
				sum += i;
			}
		}
		return sum;
	}

	/**
	 * 筛选法，从小到大逐步筛去i(i从2开始)的倍数。此方法循环次数比方法一少故较快
	 * Screening method, step by step from small to large to screen multiples of I (i from 2).This method has fewer cycles than the first method, so it is faster.
	 * @param n
	 * @return
	 */
	private static long sum2(int n) {
		long sum = 0;
		int[] arr = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = 1;
		}
		arr[0] = 0;
		arr[1] = 0;
		int c = 1;
		for (int i = 2; i <= n; i++) {
			if (arr[i] > 0) {
				arr[c++] = i;
			}
			for (int j = i * 2; j <= n; j += i) {
				arr[j] = 0;
			}
		}
		for (int i = 0; i < c; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
