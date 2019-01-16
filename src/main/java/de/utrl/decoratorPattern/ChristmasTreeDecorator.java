package de.utrl.decoratorPattern;

public abstract class ChristmasTreeDecorator implements ChristmasTree {

    private ChristmasTree christmasTree;

    public ChristmasTreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    public String decorate() {
        return christmasTree.decorate();
    }
}
