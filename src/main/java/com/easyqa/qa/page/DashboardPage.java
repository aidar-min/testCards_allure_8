package com.easyqa.qa.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class DashboardPage {

    @FindBy(xpath = "//a[@href='/user/edit']")
    public SelenideElement profileLink;

    @FindBy(xpath = "//a[@href='/projects']")
    public SelenideElement myProjectsLink;

    @FindBy(xpath = "//a[@href='/user/edit']")
    public SelenideElement userEdit;


    @Step
    public void checkUserAuthorized(){
        profileLink.shouldBe(Condition.visible);
    }

    @Step
    public ProjectsPage openMyProjects(){
        myProjectsLink.click();
        return Selenide.page(ProjectsPage.class);
    }


}
