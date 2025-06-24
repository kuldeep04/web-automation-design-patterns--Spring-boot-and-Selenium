package com.learning.sprintboot;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(classes = SprintbootApplication.class)
@SpringBootTest
public class SpringBaseTestNGTest extends AbstractTestNGSpringContextTests {
}
