package cn.mldn.demo.service.impl;

import cn.mldn.demo.service.INumberService;
import cn.mldn.demo.util.InputUtil;

public class NumberServiceImpl implements INumberService {

	@Override
	public int[] stat(int count) {
		int result [] = new int [2] ; // 定义返回的结果
		int data [] = new int [count] ; // 开辟一个数组
		for (int x = 0 ; x < data.length ; x ++) {	// 数字的循环输入
			data[x] = InputUtil.getInt("请输入第“" + (x + 1) + "”个数字：");
		}
		result[0] = data[0] ;	// 最大值
		result[1] = data[0] ;	// 最小值
		for (int x = 0 ; x < data.length ; x ++) {
			if (data[x] > result[0]) {
				result[0] = data[x] ;
			}
			if (data[x] < result[1]) {
				result[1] = data[x] ;
			}
		}
		return result ;
	}

}
