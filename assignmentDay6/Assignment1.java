package assignmentDay6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		//Setting path for webDriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Creating instance of WebBrowser
		WebDriver c=new ChromeDriver();
		
		//Maximizing browser
		c.manage().window().maximize();
		
		//Implicity wait
		c.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Opeining URL
		c.get("https://demo.automationtesting.in/Register.html");
		
		//Vaidation of FirstName and LastName
		WebElement firstName=c.findElement(By.cssSelector("input[ng-model='FirstName']"));
		Point firstNamePositon=firstName.getLocation();
		int first_X_cordinate=firstNamePositon.getX();
		int first_Y_cordinate=firstNamePositon.getY();
//		System.out.println("X coordinate of Firstname="+first_X_cordinate);
	//	System.out.println("Y coordinate of Firstname="+first_Y_cordinate);
	
		//LastNAme
		WebElement lastName=c.findElement(By.cssSelector("input[ng-model='LastName']"));
		Point lastNamePositon=lastName.getLocation();
		int last_X_cordinates=lastNamePositon.getX();
		int last_Y_cordinates=lastNamePositon.getY();
		//System.out.println("X coordinate of Lastname="+last_X_cordinates);
		//System.out.println("Y coordinate of Lastname="+last_Y_cordinates);
		System.out.println("***Validation between First Name and Last Name***");
		System.out.println("Is FirstName to the left of LastName="+(first_X_cordinate<last_X_cordinates));

		//Adress element
		WebElement adress=c.findElement(By.cssSelector("textarea[ng-model='Adress']"));
		Point adressPosition=adress.getLocation();
		int X_adress=adressPosition.getX();
		int Y_adress=adressPosition.getY();
		//System.out.println("X coordinate of adress="+X_adress);
		//System.out.println("Y coordinate of adress="+Y_adress);

		System.out.println("***Validation between FirstName and Adress***");
		System.out.println("Is Firstname at upper side of adress="+(first_Y_cordinate<Y_adress));
	
		//Webelements of Male and Female radio 
		WebElement male=c.findElement(By.cssSelector("input[value='Male']"));
		Point malePosition=male.getLocation();
		int male_X_cordinates=malePosition.getX();
		int male_Y_cordinates=malePosition.getY();
		//System.out.println("X coordinate of Firstname="+male_X_cordinates);
		//System.out.println("Y coordinate of Firstname="+male_Y_cordinates);
		
		WebElement female=c.findElement(By.cssSelector("input[value='FeMale']"));
		Point femalePosition=female.getLocation();
		int female_X_cordinates=femalePosition.getX();
		int female_Y_cordinates=femalePosition.getY();
	//	System.out.println("X coordinate of female="+female_X_cordinates);
		//System.out.println("Y coordinate of female="+female_Y_cordinates);

		System.out.println("***Validation between Male and Female Radio button***");
		System.out.println("Is Male  to the left of Female="+(male_X_cordinates<female_X_cordinates));
		
			
		WebElement Cricket=c.findElement(By.cssSelector("input[value='Cricket']"));
		WebElement movies=c.findElement(By.cssSelector("input[value='Movies']"));
		WebElement hockey=c.findElement(By.cssSelector("input[value='Hockey']"));
		Point cricketPos=Cricket.getLocation();
		Point moviesPos=movies.getLocation();
		Point hockeyPos=hockey.getLocation();
		//int X_cricket=cricketPos.getX();
	//	int X_movies=moviesPos.getX();
		//int X_hockey=hockeyPos.getX();
//		System.out.println("X coordinate of cricket="+X_cricket);
	//	System.out.println("X coordinate of movies="+X_movies);
		//System.out.println("X coordinate of hockey="+X_hockey);		
		int Y_cricket=cricketPos.getY();
		int Y_movies=moviesPos.getY();
		int Y_hockey=hockeyPos.getY();
		//System.out.println("Y coordinate of cricket="+Y_cricket);
		//System.out.println("Y coordinate of movies="+Y_movies);
		//System.out.println("Y coordinate of hockey="+Y_hockey);		
		System.out.println("***Validation between Cricket,hockey and movies***");

		System.out.println("Is Cricket ,movies and hockey are below oneanother="+(Y_cricket<Y_movies && Y_movies<Y_hockey));
		
		
	}
	
	
	
	

}
