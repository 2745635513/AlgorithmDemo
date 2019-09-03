package com.frace.cn.hack_rank;

import java.util.concurrent.locks.*;

public class TEST {
	private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

	public static void main(String[] args)  {
		final TEST test = new TEST();

		new Thread(){
			public void run() {
				test.get(Thread.currentThread());
			};
		}.start();

		new Thread(){
			public void run() {
				test.get(Thread.currentThread());
			};
		}.start();

	}

	public synchronized void get(Thread thread) {
		long start = System.currentTimeMillis();
		while(System.currentTimeMillis() - start <= 1) {
			System.out.println(thread.getName()+"正在进行读操作");
		}
		System.out.println(thread.getName()+"读操作完毕");
	}

}
