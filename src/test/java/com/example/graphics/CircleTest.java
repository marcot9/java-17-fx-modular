package com.example.graphics;

import com.example.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
        Circle actualCircle;

        @BeforeEach
        void setUp() { actualCircle =  new Circle (5.0,5.0,6.0);
        }

        @Test
        void computeAreaTest() {
            assertEquals(actualCircle.computeArea(10,5), 10*Math.PI, 0.01 );
        }

        @Test
        void computeCircumferenceTest() {
            assertEquals(actualCircle.computeCirumference(10,5), 2* 10 * Math.PI, 0.01 );
        }

}
