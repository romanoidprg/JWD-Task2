package com.epam.jwd.strategy;

import com.epam.jwd.models.Line;
import com.epam.jwd.models.Square;
import com.epam.jwd.models.Triangle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExistStrategy implements FigurePropertyStrategy {

    @Override
    public Logger getLogg(){
        return LogManager.getLogger(ExistStrategy.class);
    }

    @Override
    public String getTriangleInfo(Triangle triangle){
        return triangle.getCoordInfo() + ".  Perimetr = " + triangle.perimCalc() + ".  Area = " + triangle.areaCalc();
    }

    @Override
    public String getLineInfo(Line line){
        return line.getCoordInfo() + ".  LineLength = " + line.perimCalc();
    }

    @Override
    public String getSquareInfo(Square square){
        return square.getCoordInfo() + ".  Perimetr = " + square.perimCalc() + ".  Area = " + square.areaCalc();
    }

}
