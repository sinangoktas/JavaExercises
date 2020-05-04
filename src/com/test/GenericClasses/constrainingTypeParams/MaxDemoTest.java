package com.test.GenericClasses.constrainingTypeParams;

import com.main.GenericClasses.constrainingTypeParams.MaxDemo;
import org.junit.Test;

import java.awt.*;

class MaxDemoTest {

    MaxDemo maxDemo = new MaxDemo();

    @Test
    void maxDemoTest() {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW };
        Integer[] squares = { 1, 4, 9, 16, 64, 36 };

        assert maxDemo.max(words) == "little";
        assert maxDemo.max(squares) == 64;
        // colours are not comparable
    }

}