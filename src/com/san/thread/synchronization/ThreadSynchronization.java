package com.san.thread.synchronization;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ThreadSynchronization extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//will call t1 and t2 as 2 threads with display method being synchronized
		Display d=new Display();
		MyThread t1=new MyThread(d,"Dhoni");
		MyThread t2=new MyThread(d,"Sachin");
		t1.start();
		t2.start();				
	}
}

class Display{
//Initially, if there is not synchronized block, will print random dhoni,sachin, but after 
	//synchronized key, it will first finish dhoni and then sachin 
	public synchronized void wish(String name){
	for(int i=0;i<=10;i++){
		System.out.println("GM ::"+name);
		
	}
}
}

class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}


