package com.epam.jwd.strategy;

import com.epam.jwd.models.Figure;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NotSquareStrategy implements FigurePropertyStrategy {

    private static NotSquareStrategy instance;

    private NotSquareStrategy(){
    }

    public static synchronized NotSquareStrategy getInstance(){
        if (instance == null){
            instance = new NotSquareStrategy();
        }
        return instance;
    }

    @Override
    public Logger getLogg(){
        return LogManager.getLogger(NotSquareStrategy.class);
    }

    @Override
    public String getTriangleInfo(Figure triangle){
        return triangle.getCoordInfo() + ".  Perimetr = " + triangle.perimCalc() + ".  Area = " + triangle.areaCalc();
    }

    @Override
    public String getLineInfo(Figure line){
        return line.getCoordInfo() + ".  LineLength = " + line.perimCalc();
    }

    @Override
    public String getSquareInfo(Figure square){
        return square.getCoordInfo() + "  is just rectangle, but is not square";
    }

}
