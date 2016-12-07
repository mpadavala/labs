package com.labs.problems.closestpoint;

import java.util.Comparator;

public class PointsCompartor implements Comparator<Point>{

	@Override
	public int compare(Point o1, Point o2) {
		return  Double.valueOf(o2.getDistanceFromOrigin()).compareTo(o1.getDistanceFromOrigin());
	}

}
