package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.Project.*;
import static org.example.ProjectOperation.authorization;
import static org.example.ProjectOperation.logOut;
import static org.example.WebDriver.ProjectWebDriver.getChromeDriver;
import static org.example.WebDriver.ProjectWebDriver.webDriverStart;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //запуск
        webDriverStart("https://www.russianfood.com");
        //авторизация
        authorization();

        //переключение на вкладку "Статьи"
        WebElement tabArticles = getChromeDriver().findElement(By.xpath("//a[text()=\"Статьи\"]"));
        tabArticles.click();
        Thread.sleep(2000);
        //переключение на вкладку "Наша Кухня"
        WebElement tabOurKitchen = getChromeDriver().findElement(By.xpath("//td/a[contains(text(),\"Наша\") and contains(text(),\"Кухня\")]"));
        tabOurKitchen.click();
        Thread.sleep(2000);
        //переключение на вкладку "СуперПоиск"
        WebElement tabSuperSearch = getChromeDriver().findElement(By.xpath("//td/a[contains(text(),\"Супер\") and contains(text(),\"Поиск\")]"));
        tabSuperSearch.click();
        Thread.sleep(2000);
        //переключение на вкладку "Рассылки"
        WebElement tabSending = getChromeDriver().findElement(By.xpath("//a[text()=\"Рассылки\"]"));
        tabSending.click();
        Thread.sleep(2000);
        //переключение на вкладку "Рецепты"
        WebElement tabRecipe = getChromeDriver().findElement(By.xpath("//a[text()=\"Рецепты\"]"));
        tabRecipe.click();
        Thread.sleep(2000);
        //Выбор категории РецептыНапитков.Сбитель
        WebElement chapterSbiten = getChromeDriver().findElement(By.xpath("//a[text()=\"Сбитень\"]"));
        chapterSbiten.click();
        Thread.sleep(2000);
        //Выбор первого в списке
        WebElement recipeList_firstItem = getChromeDriver().findElement(By.xpath("//div[@class=\"recipe_list_new\"]//div[@itemprop=\"itemListElement\"][1]//a[@itemprop=\"url\"]"));
        recipeList_firstItem.click();
        Thread.sleep(2000);

        //разлогин
        logOut();
    }
}