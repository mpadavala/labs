package com.labs.schedulertask;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {

	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new MySchedulerTask();
		timer.schedule(task, 5000, 1000);
	}
}
