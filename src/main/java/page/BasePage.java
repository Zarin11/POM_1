package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public int generatRandomno(int boundaryNum) {
		Random rnd=new Random();
		int generatedno=rnd.nextInt(boundaryNum);
		return generatedno;
	}
	public void selectfromDrop(WebElement selElemnt, String visibleText) {
		Select sel=new Select(selElemnt);
		sel.selectByVisibleText(visibleText);
	
	}
	
	
	
}
