package de.utrl.decoratorPattern;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChristmasTreeDecoratorTest {

    @Test
    public void testDecorator() {
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        assertEquals("demo", christmasTree.decorate());
    }
}
