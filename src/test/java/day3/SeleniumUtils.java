package day3;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SeleniumUtils {

    public static List<String> getElementsText(List<WebElement> list){

        List<String> actual = new ArrayList<>();

        list.forEach(s -> actual.add(s.getText()));

        return actual;

    }
}
