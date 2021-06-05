package com.qa.sonam;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {
	
	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		System.out.println("First Testng test");
		
		//store all links
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		/*
		 * //to get all links text linkList.stream().forEach(ele ->
		 * System.out.println(ele.getText()));
		 * 
		 * //to get all links and remove empty space by using filter List<String>
		 * collectList = linkList.stream().filter(ele -> !ele.getText().equals(""))
		 * .map(ele -> ele.getText()).collect(Collectors.toList());
		 * 
		 * collectList.forEach(ele ->System.out.println(ele));
		 */
		
		//find any first link
		String firstlink = linkList.stream().filter(ele -> !ele.getText().equals("")).map(ele ->ele.getText()).findFirst().toString();
		System.out.println(firstlink);
		
		
	}

}
