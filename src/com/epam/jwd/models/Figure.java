package com.epam.jwd.models;

import com.epam.jwd.strategy.FigurePropertyStrategy;

class Figure {

    private FigurePropertyStrategy figurePropertyStrategy;

    public void setFigurePropertyStrategy(FigurePropertyStrategy figurePropertyStrategy) {
        this.figurePropertyStrategy = figurePropertyStrategy;
    }

    public FigurePropertyStrategy getFigurePropertyStrategy() {
        return figurePropertyStrategy;
    }


}
