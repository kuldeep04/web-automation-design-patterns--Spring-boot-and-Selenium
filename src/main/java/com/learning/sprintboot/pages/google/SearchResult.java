package com.learning.sprintboot.pages.google;

import com.learning.sprintboot.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Lazy
public class SearchResult extends BasePage {

    @FindBy(css = "div.MjjYud")
    private List<WebElement> results;

    public int getCount(){
       return this.results.size();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((driver1 -> !this.results.isEmpty()));
    }
}
