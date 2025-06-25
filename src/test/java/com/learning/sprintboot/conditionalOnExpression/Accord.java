package com.learning.sprintboot.conditionalOnExpression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("${car.speed} >=70")
public class Accord implements Car{
    @Override
    public void run() {
        System.out.println("I'm Accord, and speed is 80 mph");
    }
}
