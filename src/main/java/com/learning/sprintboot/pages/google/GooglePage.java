package com.learning.sprintboot.pages.google;

import com.learning.sprintboot.pages.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class GooglePage extends BasePage {

    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private SearchResult searchResult;

    public SearchComponent getSearchComponent(){
        return searchComponent;
    }

    public SearchResult getSearchResult(){
        return searchResult;
    }

    @Value("${application.url}")
    private String url;

    public void goTo(){
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.get(url);
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }
}
