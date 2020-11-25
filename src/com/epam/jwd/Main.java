package com.epam.jwd;

import com.epam.jwd.models.Line;
import com.epam.jwd.models.Point;
import com.epam.jwd.models.Square;
import com.epam.jwd.models.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    public static void main(String[] args) {

        Point[] arrayPoint = {new Point(0,0),
                              new Point(0,4),
                              new Point(4,4),
                              new Point(4,1)};

        Line[] arrayLine = {new Line(arrayPoint[0], arrayPoint[1]),
                            new Line(arrayPoint[1],arrayPoint[2])};

        Triangle[] arrayTriangle = {new Triangle(arrayPoint[0],arrayPoint[1],arrayPoint[2]),
                                    new Triangle(arrayPoint[2],arrayPoint[1],arrayPoint[3])};

        Square[] arraySquare = {new Square(arrayPoint[0],arrayPoint[1],arrayPoint[2],arrayPoint[3])};


        arrayLine[0].getFigurePropertyStrategy().getLogg().log
                (arrayLine[0].getFigurePropertyStrategy().getLogg().getLevel(),arrayLine[0].toString());
        //System.out.println(arrayTriangle[0].toString());
        //System.out.println(arraySquare[0].toString());

    }

}
