package com.shubhamawasthi.ds.array;

public class ReverseStringsInSentence {
	public static void main(String[] args) {
		String name = "shubham awasthi is a software development engineer at amazon";
		String str[] = name.split(" ");
		String resArr[] = new String[str.length];

		for (int i = 0; i <= str.length - 1; i++) {
			resArr[i] = reverseName(str[i]);
		}

		for (int i = 0; i <= resArr.length - 1; i++) {
			System.out.print(resArr[i] + " ");
		}

	}

	private static String reverseName(String name) {
		char strArr[] = name.toCharArray();
		String res = "";
		for (int i = strArr.length - 1; i >= 0; i--) {
			res = res + strArr[i];
		}
		return res;
	}
}