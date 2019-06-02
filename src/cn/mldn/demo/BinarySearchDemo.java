package cn.mldn.demo;

class Banary {
	public static int search(int[] data, int length, int index, int x, int count) {
		if (x > data[length - 1] || x < data[0] || count < 0) {
			return -1;
		}
		if (data[index] == x) {
			return index;
		}
		if (data[index] > x) {
			length = index;
			index = index / 2;
			count--;
			return search(data, length, index, x, count);
		} else {
			index = (length - index) / 2 + index;
			count--;
			return search(data, length, index, x, count);
		}
	}
}

public class BinarySearchDemo {
	public static void main(String args[]) {
		int[] test = new int[] { 1, 2, 22, 5, 6, 7, 9, 10 };
		int count = (int) (Math.log(test.length) / Math.log(2) + 1); // 时间复杂度加1
		int length = test.length;
		int index = length / 2;
		java.util.Arrays.sort(test);
		for (int x = 0; x < test.length; x++) {
			System.out.println(Banary.search(test, length, index, test[x], count));
		}
		System.out.println(Banary.search(test, length, index, 3, count));
		System.out.println(Banary.search(test, length, index, 8, count));
		System.out.println(Banary.search(test, length, index, 22, count));
		System.out.println(Banary.search(test, length, index, 0, count));
	}
}
