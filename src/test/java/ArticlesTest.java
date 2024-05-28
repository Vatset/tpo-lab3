import org.junit.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class ArticlesTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void articles() {
    driver.get("https://dfiles.ru/");
    driver.manage().window().setSize(new Dimension(1102, 717));
    driver.findElement(By.id("menu-item-3016")).click();
    driver.findElement(By.cssSelector("#top-menu > #menu-item-3016 > a")).click();
  }
}
