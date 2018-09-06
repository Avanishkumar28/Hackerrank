package av.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TowerRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int i = 0; i < testCase; i++) {
			int numberOfTower = sc.nextInt();
			int numberOfAgnet = sc.nextInt();
			Point[] towerArray = new Point[numberOfTower];
			Point[] agentArray = new Point[numberOfAgnet];
			for (int j = 0; j < numberOfTower; j++) {
				towerArray[j] = new Point(new Coordinate(sc.nextDouble(), sc.nextDouble()),0.0);
			}
			for (int j = 0; j < numberOfAgnet; j++) {
				agentArray[j] = new Point(new Coordinate(sc.nextDouble(), sc.nextDouble()), 0.0);
			}
			calculateTowerRange(towerArray, agentArray);
		}
		sc.close();

	}

	private static void calculateTowerRange(Point[] towerArray, Point[] agentArray) {
		for (Point agent : agentArray) {
			findRange(agent, towerArray);
		}
		
		Arrays.sort(agentArray, (a,b) -> b.getRange().compareTo(a.getRange()));
			
		double towerRange = 0.0;
		if (towerArray.length > 1) {
			 towerRange = findTowerRange(towerArray);
		}
		
		if (towerRange < agentArray[0].getRange()) {
			towerRange = agentArray[0].getRange();
		}
		System.out.println((long) Math.ceil(towerRange));
	}

	private static double findTowerRange(Point[] towerArray) {
		double minAgentRange = Double.MAX_VALUE;
		for (int i = 0; i < towerArray.length; i++) {
			 minAgentRange = Double.MAX_VALUE;
			for (int j = 0; j < towerArray.length; j++) {
				if(i != j) {
					double distance = findDistance(towerArray[i].getCoordinate(),towerArray[j].getCoordinate());
					if(minAgentRange > distance)
						minAgentRange = distance;
				}
				
			}
			towerArray[i].setRange(minAgentRange);
		}
		Arrays.sort(towerArray, new Comparator<Point>() {
			public int compare(Point a, Point b) {
				return b.getRange().compareTo(a.getRange());
			}
		});
		return towerArray[0].getRange();
	}

	private static void findRange(Point agent, Point[] towerArray) {
		double minAgentRange = Double.MAX_VALUE;
		for (Point towerCoordinate : towerArray) {
			double result = findDistance(towerCoordinate.getCoordinate(), agent.getCoordinate());
			if (minAgentRange > result)
				minAgentRange = result;
		}
		agent.setRange(minAgentRange);
	}

	private static double findDistance(Coordinate agentCoordinate, Coordinate coordinate) {
		return Math.sqrt(Math.pow((coordinate.getX() - agentCoordinate.getX()), 2)
				+ Math.pow((coordinate.getY() - agentCoordinate.getY()), 2));
	}

}

class Coordinate {
	private double x;
	private double y;

	public Coordinate() {
		super();
	}

	public Coordinate(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}

class Point {
	private Coordinate coordinate;
	private Double range;

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Double getRange() {
		return range;
	}

	public void setRange(Double range) {
		this.range = range;
	}

	public Point(Coordinate coordinate, Double range) {
		super();
		this.coordinate = coordinate;
		this.range = range;
	}

}
