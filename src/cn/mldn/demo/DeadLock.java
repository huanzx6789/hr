package cn.mldn.demo;
public class DeadLock implements Runnable {
	private Jian jj = new Jian() ;
	private XiaoQiang xq = new XiaoQiang() ;
	@Override
	public void run() {
		jj.say(xq);
	}
	public DeadLock() {
		new Thread(this).start();
		xq.say(jj);
	}
	public static void main(String[] args) {
		new DeadLock() ;
	}
}
class Jian {
	public synchronized void say(XiaoQiang xq) {
		System.out.println("阿健说：此路是我开，要想从此过，留下10块钱。");
		xq.get();
	}
	public synchronized void get() {
		System.out.println("阿健说：得到了10块钱，可以买饭吃了，于是让出了路。");
	}
}
class XiaoQiang {
	public synchronized void say(Jian jj) {
		System.out.println("小强说：让我先跑，我再给你钱。");
		jj.get();
	}
	public synchronized void get() {
		System.out.println("小强说：逃过了一劫，可以继续送快餐了。");
	}
}

