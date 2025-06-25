package com.learning.sprintboot.conditionalOnExpression;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("${car.speed} <=60")
public class Civic implements Car{
    @Override
    public void run() {
        System.out.println("I'm civic, and the speed is 55 mph");
    }
}
