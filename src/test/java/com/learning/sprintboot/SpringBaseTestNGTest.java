package com.learning.sprintboot;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(classes = SprintbootApplication.class)
@SpringBootTest
@Lazy
public class SpringBaseTestNGTest extends AbstractTestNGSpringContextTests {
}
