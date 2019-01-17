package de.utrl.decoratorPattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChristmasTreeDecoratorTest {

    @Test
    public void testGarlandDecorator() {
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        assertEquals("Christmas tree", christmasTree.decorate());
        ChristmasTree garlandedTree = new Garland(christmasTree);
        assertEquals("Christmas tree with Garland", garlandedTree.decorate());
    }
}
