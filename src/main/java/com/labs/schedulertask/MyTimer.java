package com.labs.schedulertask;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {

	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new MySchedulerTask();
		System.out.println("Delay 5 seconds and run the Job every 1 second");
		timer.schedule(task, 5000, 1000);
	}
}
