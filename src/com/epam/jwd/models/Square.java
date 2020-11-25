package com.epam.jwd.models;

import com.epam.jwd.strategy.EqualPointsStrategy;
import com.epam.jwd.strategy.ExistStrategy;
import com.epam.jwd.strategy.NotSquareStrategy;
import com.epam.jwd.strategy.SameLineStrategy;

public class Square extends Figure {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Square(Point pointA, Point pointB, Point pointC, Point pointD){
       this.pointA = pointA;
       this.pointB = pointB;
       this.pointC = pointC;
       this.pointD = pointD;

        if (pointA.samePoint(pointB)
                ||pointA.samePoint(pointC)
                ||pointA.samePoint(pointD)
                ||pointB.samePoint(pointC)
                ||pointB.samePoint(pointD)
                ||pointC.samePoint(pointD)) {
            this.setFigurePropertyStrategy(new EqualPointsStrategy());
        } else if (pointA.IsOnSameLine(pointB,pointC)
                 ||pointB.IsOnSameLine(pointC,pointD)
                 ||pointC.IsOnSameLine(pointD,pointA)
                 ||pointD.IsOnSameLine(pointA,pointB)){
            this.setFigurePropertyStrategy(new SameLineStrategy());
        } else if (pointA.lengthToPoint(pointB)==pointB.lengthToPoint(pointC)
                && pointB.lengthToPoint(pointC)==pointC.lengthToPoint(pointD)
                && pointC.lengthToPoint(pointD)==pointD.lengthToPoint(pointA)
                && pointA.lengthToPoint(pointC)==pointB.lengthToPoint(pointD)){
            this.setFigurePropertyStrategy(new ExistStrategy());
        } else {
            this.setFigurePropertyStrategy(new NotSquareStrategy());
        }

    }

    public double perimCalc() {
        return pointA.lengthToPoint(pointB) + pointB.lengthToPoint(pointC)
                + pointC.lengthToPoint(pointD) + pointD.lengthToPoint(pointA);
    }

    public double areaCalc(){
        return 25;
    }

    public String getCoordInfo(){
        return "Square (x1,y1;  x2,y2;  x3,y3;  x4,y4):  "
                + pointA.GetX() + "," + pointA.GetY() + ";  "
                + pointB.GetX() + "," + pointB.GetY() + ";  "
                + pointC.GetX() + "," + pointC.GetY() + ";  "
                + pointD.GetX() + "," + pointD.GetY();
    }

    @Override
    public String toString() {
        return this.getFigurePropertyStrategy().getSquareInfo(this);
    }

}