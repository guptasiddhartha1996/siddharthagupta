package com.OBBE.Testcases;

import java.io.File;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://get.jenkins.io/windows-stable/2.426.1/jenkins.msi");
		
		String downloadpath="C:\\Users\\sigupta\\Downloads";
		String fileName="jenkins.msi";
		
		File file=new File(downloadpath,fileName);
		
		FluentWait<File> wait=new FluentWait<File>(file)
				.withTimeout(Duration.ofMinutes(5))
				.pollingEvery(Duration.ofMillis(200))
				.ignoring(Exception.class)
				.withMessage("File is not downloaded");
		
		try {
			boolean isDownloaded=wait.until(f -> f.canRead());
			
			if(isDownloaded) {
				System.out.println("File is Completely 100% downloaded");
			}
		}
		catch(TimeoutException e) {
			System.out.println("file is not completely downloaded ");
		}

		
		

	}
	
 
	
	
}
