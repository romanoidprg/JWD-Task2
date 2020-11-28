package com.epam.jwd;

import com.epam.jwd.model.FigureFabric;
import com.epam.jwd.model.FigureType;
import com.epam.jwd.model.Point;
import com.epam.jwd.model.Figure;

public class Main {

    public static void main(String[] args) {

        FigureFabric figureFabric = new FigureFabric();

        Point[] arrayPoint = {
                new Point(0,0),
                new Point(4,1),
                new Point(5,5),
                new Point(4,0),
                new Point(5,6),
                new Point(4,5)
        };

        Point[] arrayPointMAF = {
                new Point(1,0),
                new Point(26,1),
                new Point(5,5),
                new Point(3,13),
                new Point(5,6)
        };

        Figure[] arrayLine = {
                figureFabric.CreateFigure(FigureType.LINE, new Point[]{arrayPoint[0],arrayPoint[1]}),
                figureFabric.CreateFigure(FigureType.LINE, new Point[]{arrayPoint[1],arrayPoint[2]}),
                figureFabric.CreateFigure(FigureType.LINE, new Point[]{arrayPoint[0],arrayPoint[1]})
        };



        Figure[] arrayTriangle = {
                figureFabric.CreateFigure(FigureType.TRIANGLE, new Point[]{arrayPoint[0],arrayPoint[1],arrayPoint[2]}),
                figureFabric.CreateFigure(FigureType.TRIANGLE, new Point[]{arrayPoint[2],arrayPoint[3], arrayPoint[3]})
        };

        Figure[] arraySquare = {
                figureFabric.CreateFigure(FigureType.SQUARE,
                        new Point[]{arrayPoint[0],arrayPoint[1],arrayPoint[2],arrayPoint[3]})};

        Figure[] arrayMAF = {
                figureFabric.CreateFigure(FigureType.MULTI_ANGLE_FIGURE, arrayPoint),
                figureFabric.CreateFigure(FigureType.MULTI_ANGLE_FIGURE, arrayPointMAF),
        };


        int i = 0;
        do {
           arrayPoint[i].infoLogg();
           i++;
        } while (i<arrayPoint.length);

        for (Figure line: arrayLine){
            line.infoLogg();
        }

        for (Figure triangle: arrayTriangle){
            triangle.infoLogg();
        }

        for (Figure square: arraySquare){
            square.infoLogg();
        }

        for (Figure mAF: arrayMAF){
            mAF.infoLogg();
        }

    }

}
