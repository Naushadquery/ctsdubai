package com.nau.interfacedemos;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("ok buddy");
	}
}

public class ClassDemo {
	static class InnerClass implements Runnable {
		@Override
		public void run() {
			System.out.println("ok buddy inner");
		}
	}

	static int innerValue = 100;
	public static void main(String[] args) {
		int localValue = 40;
		innerValue = 50;
		Runnable runnable = new InnerClass();
		Thread t = new Thread(runnable);
		t.start();
		ok();
		anony();
	}

	private static void anony() {
		
		Runnable runnable = new Runnable() { 
			@Override
			public void run() {
				System.out.println("ok buddy local anonymous");
			}
		};
		
		Thread t = new Thread(runnable);
		t.start();

		Thread t1 = new Thread(runnable);
		t1.start();
		Thread t2 = new Thread(new Runnable() { 
			@Override
			public void run() {
				System.out.println("ok buddy local anonymous object passed");
			}
		});
		t2.start();
	}

	public static void ok() {
		int localValue = 330;
		innerValue =500;
		class LocalClass implements Runnable {
			@Override
			public void run() {
				System.out.println("ok buddy local");
			}
		}
		Runnable runnable = new LocalClass();
		Thread t = new Thread(runnable);
		t.start();
	}

}
