package de.utrl.decoratorPattern;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChristmasTreeDecoratorTest {

    @Test
    public void testDecorator() {
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        assertEquals("Christmas tree", christmasTree.decorate());
        ChristmasTree garlandedTree = new Garland(christmasTree);
        assertEquals("Christmas tree with Garland", garlandedTree.decorate());
    }
}
