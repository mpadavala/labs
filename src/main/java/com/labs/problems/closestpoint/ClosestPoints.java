package com.labs.problems.closestpoint;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

/*
 * Given an array on N Points, Find the K closest points to the origin in 2D
 */
public class ClosestPoints {
	
	public static void main(String[] args){
		
		int numberOfClosestPointsNeeded = 2;
		
		Point origin = new Point(0,0);
		List<Point> points = new ArrayList<>();
		points.add(new Point(1,1));
		points.add(new Point(1,3));
		points.add(new Point(-1,-2));
		points.add(new Point(-1,2));
		points.add(new Point(1,-1));
		points.add(new Point(3,-1));
		points.add(new Point(0,-1));
		points.add(new Point(-1,3));
		points.add(new Point(2,2));
		points.add(new Point(-1.1f,0));
		
		Collection<Point> result = getClosestPoints(numberOfClosestPointsNeeded, origin, points);
		System.out.println(numberOfClosestPointsNeeded + " closest points to the origin are ...");
		for(Point point : result){
			System.out.println(point);
		}
	}
	
	private static Collection<Point> getClosestPoints(int numberOfClosestPointsNeeded, Point origin, List<Point> points){
		
		PriorityQueue<Point> queue = new PriorityQueue<>(numberOfClosestPointsNeeded, new PointsCompartor());
		
		for(Point point : points){
			double distance = getDistanceSquare(origin, point);
			point.setDistanceFromOrigin(distance);
			System.out.println(point);
			if (queue.size() < numberOfClosestPointsNeeded) {
                queue.offer(point);
			}else if(point.compareTo(queue.peek()) < 0){
				queue.poll();
				queue.offer(point);
			}
		}
		return queue;
		
	}
	
	private static double getDistanceSquare(Point origin, Point second){
		return Math.pow((second.getX()-origin.getX()), 2) + Math.pow((second.getY()-origin.getY()), 2);
	}
}
