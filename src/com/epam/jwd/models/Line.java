package com.epam.jwd.models;

import com.epam.jwd.strategy.EqualPointsStrategy;
import com.epam.jwd.strategy.ExistStrategy;

public class Line extends Figure {
    private Point pointA;
    private Point pointB;

    public Line(Point pA, Point pB){
        pointA = pA;
        pointB = pB;
        if (pointA.samePoint(pointB)) {
            this.setFigurePropertyStrategy(new EqualPointsStrategy());
        } else {
            this.setFigurePropertyStrategy(new ExistStrategy());
        }
    }

    public double perimCalc() {
        return pointA.lengthToPoint(pointB);
    }

    public String getCoordInfo(){
        return "Line (x1,y1;  x2,y2):  "
                + pointA.GetX() + "," + pointA.GetY() + ";  "
                + pointB.GetX() + "," + pointB.GetY();
    }

    @Override
    public String toString() {
        return this.getFigurePropertyStrategy().getLineInfo(this);
    }
}
