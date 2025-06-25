package com.learning.sprintboot.conditionalOnExpression;

import com.learning.sprintboot.SpringBaseTestNGTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CarTest extends SpringBaseTestNGTest {

    @Autowired
    public Car car;

    @Test
    public void testSpeed(){
        this.car.run();
    }
}
