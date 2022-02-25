package com.designpatterns.structural.decorator;

public abstract  class TableDecorator implements  Table{
    protected Table decoratedTable;

    protected TableDecorator(Table decoratedTable) {
        this.decoratedTable = decoratedTable;
    }

    public void render(){
        decoratedTable.render();
    }
}
