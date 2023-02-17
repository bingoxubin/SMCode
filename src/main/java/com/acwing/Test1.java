package com.acwing;

/**
 * @author bingoabin
 * @date 2023/2/13 15:21
 * @Description:
 */
public class Test1 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// while( n-- > 0){
		int res = 0;
		// 	String s = sc.nextLine();
		String s = "aaaaabbbbbcccccccccccdddddd";
		int num = 1;
		char ch = '\0';
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) num++;
			else num = 1;

			if (num > res) {
				res = num;
				ch = s.charAt(i);
			}
		}
		System.out.println(res);
		System.out.printf("%c %d\n", ch, res);
		// }
	}
}
