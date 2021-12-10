package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangularTest {
    Rectangular actualRectangular;

    @BeforeEach
    void setUp() { actualRectangular =  new Rectangular (5,5,5.0,5.0);
    }

    @Test
    void computeAreaTest() {
        assertEquals(actualRectangular.computeArea(5.0,5.0), 25.0, 0.01 );
    }

    @Test
    void computeCircumferenceTest() {
        assertEquals(actualRectangular.computeCirumference(5.0,5.0), 20, 0.01 );
    }
}

