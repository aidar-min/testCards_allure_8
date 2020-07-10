package com.easyqa.qa.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class ProjectDashboardPage {

    @FindBy(xpath = "//h2[.='Project Overview']")
    public SelenideElement projectOverwiew;

    @FindBy(xpath = "//span[@class='icon-issues-icon']")
    public SelenideElement issuesLink;

    @FindBy(xpath = "//header[@id='head_menu']//a[@href='/user/edit']")
    public SelenideElement userLink;


    @Step
    public void checkProjectDashboardPage(){
        projectOverwiew.shouldBe(Condition.visible);
    }

    @Step
    public IssuesPage openIssues(){
        issuesLink.click();
        return page(IssuesPage.class);
    }



}
