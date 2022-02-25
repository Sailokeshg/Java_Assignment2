package com.designpatterns.structural.decorator;

public class TableShader extends  TableDecorator{

    public TableShader(Table decoratedTable) {
        super(decoratedTable);
    }
     public void render(){
        decoratedTable.render();
        setShading(decoratedTable);
     }

     public void setShading(Table decoratedTable){
         System.out.println("Shading added");
     }

}
