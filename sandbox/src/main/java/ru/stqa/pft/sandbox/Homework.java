package ru.stqa.pft.sandbox;

public class Homework {

  public double xyu() {
    Point p1 = new Point();
    p1.x = 5;
    p1.y = 10;

    Point p2 = new Point();
    p2.x = 5;
    p2.y = 10;

    return distance(p1, p2);
  }

  public double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p1.x - p1.y), 2) + Math.pow((p2.x - p2.y), 2));
  }
}
