package com.Alejandro.Amanda.Gonzalo.Parkinator.Users.integration;

import static org.junit.api.Assertions.assertAll;
import static org.junit.api.Assertions.assertEquals;
import static org.junit.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import io.micrometer.core.annotation.TimedSet;



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class userIntegrationTest {
    @Value("${local.server.port}")
    private  int port;
    private static ChromeDriver chromeDriver;
    @BeforeAll
    public static void prepareWebDriver() {

        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        chromeDriver = new ChromeDriver(options);
        
    }

@Test
public void checkUserListDisplayed(){
    chromeDriver.get("http://localhost:"+port+"/");
    String Title = chromeDriver.getTitle();

    WebElement table = chromeDriver.findElement(By.className("table"));
    WebElement button = chromeDriver.findElement(By.id("users-button-create"));
    WebElement heading = chromeDriver.findElement(By.id("users-title"));
    String headingText = heading.getText();


    assertAll("comprobar",
    
    () ->{assertEquals("Usuarios", Title);},
    () ->{assertNotNull(button);},
    () ->{assertEquals("Usuarios", heading);},
    () ->{assertNotNull(table);}
    );

    chromeDriver.quit();
}


@Test
public void checkUsersIndexIsDisplayed(){
    chromeDriver.get("http://localhost:"+port+"/");

    chromeDriver.findElement(By.id("to-users-link")).click();
    String Title = chromeDriver.getTitle();
    WebElement usersButton = chromeDriver.findElement(By.id("users-button-create"));
    WebElement usersHeading = chromeDriver.findElement(By.id("users-title"));
    String usersHeadingText = usersHeading.getText();

    assertAll("comprobar usuarios",
    
    () ->{assertNotNull(usersButton);},
    () ->{assertEquals("Usuarios", Title);},
    () ->{assertEquals("Usuarios", usersHeading);}
    );

    chromeDriver.quit();

}

@Test
public void checkCreateUsersIsDisplayed(){
    chromeDriver.get("http://localhost:"+port+"/");
    chromeDriver.findElement(By.id("users-button-create")).click();
    String Title = chromeDriver.getTitle();
    WebElement buttonSubmit = chromeDriver.findElement(By.id("user-create-button-submit"));
    assertAll("comprobar crear usuarios",
    
    () ->{assertEquals("Crear uuario", Title);},
    () ->{assertNotNull(buttonSubmit);}

    );

    chromeDriver.quit();

}
}
