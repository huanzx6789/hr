package cn.mldn.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputUtil {
	private InputUtil () {}
	/**
	 * 实现键盘接收数字的操作
	 * @param prompt 提示信息
	 * @return 一个可以使用的数字
	 */
	public static int getInt(String prompt) { 
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)) ;
		int num = 0 ;
		boolean flag = true ;
		while (flag) {
			System.out.print(prompt); // 打印提示信息
			String str = null ; 
			try {
				str = buf.readLine() ;
				if (str.matches("\\d+")) {
					num = Integer.parseInt(str) ;
					flag = false ;
				} else {
					System.out.println("输入的内容不是数字！");
				}
			} catch (IOException e) {
				System.out.println("输入的内容不是数字！");
			}
		}
		return num ;
	}
}
