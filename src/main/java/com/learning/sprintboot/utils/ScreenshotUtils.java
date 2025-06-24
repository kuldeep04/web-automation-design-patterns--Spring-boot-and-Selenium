package com.learning.sprintboot.utils;

import com.google.common.util.concurrent.Uninterruptibles;
import jakarta.annotation.PostConstruct;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Duration;

@Lazy
@Component
public class ScreenshotUtils {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}/img.png")
    private Path path;

    @PostConstruct
    public void init(){
      for(int i=0;i<10;i++){
          try{
              System.out.println("Sleeping...");
              Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(2));
          }catch (Exception e){
              throw new RuntimeException("something wrong has happened "+e.getMessage());
          }
      }
    }

    public void takeScreenShot() throws IOException {
        File file  = this.driver.getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(file, this.path.toFile());
    }
}
