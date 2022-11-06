package com.gl.labsession3_Q1;

import java.util.Scanner;
import java.util.Stack;

public class BalanceCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the input brackets");
		String input = sc.next();
		isBalanced(input);

	}

	public static void isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char value = s.charAt(i);
			if (value == '(' || value == '[' || value == '{') {
				stack.push(value);
			} else {
				if (stack.isEmpty()) {
					System.out.println("Not balanced");
					return;
				}
				char top = stack.peek();
				if ((top == '(' && value == ')') || (top == '{' && value == '}') || (top == '[' && value == ']')) {
					stack.pop();
				}
			}
		}
		if (stack.isEmpty()) {
			System.out.println("balanced");
		} else {
			System.out.println("Not balanced");
		}

	}

}
