package com.labs.problems.closestpoint;

public class Point implements Comparable<Point>{
	private float x;
	private float y;
	private double distanceFromOrigin;
	
	
	public float getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getDistanceFromOrigin() {
		return distanceFromOrigin;
	}

	public void setDistanceFromOrigin(double distanceFromOrigin) {
		this.distanceFromOrigin = distanceFromOrigin;
	}

	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", distanceFromOrigin=" + distanceFromOrigin + "]";
	}

	@Override
	public int compareTo(Point input) {
		return  Double.valueOf(this.distanceFromOrigin).compareTo(input.distanceFromOrigin);
	}
	
	
}
