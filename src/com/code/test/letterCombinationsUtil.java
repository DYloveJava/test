package com.code.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 生成组合
 * 
 * @author dingyu 2020.1.8
 */
public class letterCombinationsUtil {

	public static ArrayList<String> letterCombinationsUtil(int[] number, int n, String[] table) {
		// 存储生成的字母组合
		ArrayList<String> list = new ArrayList<>();

		Queue<String> q = new LinkedList<>();
		q.add("");

		while (!q.isEmpty()) {
			String s = q.remove();
			// 如果生成完整单词并加入集合
			if (s.length() == n)
				list.add(s);
			else {
				String val = table[number[s.length()]];
				for (int i = 0; i < val.length(); i++) {
					q.add(s + val.charAt(i));
				}
			}
		}
		return list;
	}


	public static void letterCombinations(int[] number, int n) {
		String[] table = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		ArrayList<String> list = letterCombinationsUtil(number, n, table);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	public static void main(String args[]) {
		int[] number = { 2,3};
		int n = number.length;
		letterCombinations(number, n);
	}
}
