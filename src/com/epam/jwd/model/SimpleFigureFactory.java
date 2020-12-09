package com.epam.jwd.model;

import com.epam.jwd.factory.FigureFactory;
import com.epam.jwd.service.impl.FigureExistenceAndSelectStrategyPreProcessor;

import java.util.ArrayList;

public enum  SimpleFigureFactory implements FigureFactory {

    INSTANCE;

    public static ArrayList<Figure> figureCash = new ArrayList<>();

    public Figure CreateFigure(FigureType figureType, Point[] arrayPoint) {

        switch (figureType) {
            case LINE:
                return FigureExistenceAndSelectStrategyPreProcessor.INSTANCE.process(new Line(arrayPoint[0], arrayPoint[1]));
            case TRIANGLE:
                return FigureExistenceAndSelectStrategyPreProcessor.INSTANCE.process(new Triangle(arrayPoint[0], arrayPoint[1], arrayPoint[2]));
            case SQUARE:
                return FigureExistenceAndSelectStrategyPreProcessor.INSTANCE.process(new Square(arrayPoint[0], arrayPoint[1], arrayPoint[2], arrayPoint[3]));
            case MULTI_ANGLE_FIGURE:
                return FigureExistenceAndSelectStrategyPreProcessor.INSTANCE.process(new MultiAngleFigure(arrayPoint));
            default:
                return null;
        }
    }
}
