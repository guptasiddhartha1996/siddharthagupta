package com.OBBE.Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	
	public static final int MAX_X = 400;
	public static final int MAX_Y = 400;


	public static void main(String[] args) throws AWTException, InterruptedException {
		
		Robot robot = new Robot();
		Random random= new Random();																			
		while(true) {
			robot.mouseMove(random.nextInt(MAX_X),random.nextInt(MAX_Y));
			System.out.println("Running mover ... ");
			int testinterval=50000+random.nextInt(50000);
			Thread.sleep(random.nextInt(testinterval));
		}
		
		
		
	}

}
