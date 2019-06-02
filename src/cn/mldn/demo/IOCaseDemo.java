package cn.mldn.demo;

import cn.mldn.demo.factory.Factory;
import cn.mldn.demo.service.INumberService;

public class IOCaseDemo {
	public static void main(String[] args) {
		INumberService numberService = Factory.getInstance() ;
		int result [] = numberService.stat(5) ;
		System.out.println("最大值：" + result[0] + "、最小值：" + result[1]);
	}
}
