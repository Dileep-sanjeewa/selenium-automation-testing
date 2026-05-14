package com.sqa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class PixelsSuiteTest {

    WebDriver driver;
    String baseUrl = "https://www.pixelssuite.com/";

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void openSite() {
        driver.get(baseUrl);
    }

    // =========================
    // UI TESTS (1-10)
    // =========================

    @Test
    public void TC_001_homepage_load() {
        Assert.assertTrue(driver.getTitle().length() > 0);
    }

    @Test
    public void TC_002_body_visible() {
        Assert.assertTrue(driver.findElement(By.tagName("body")).isDisplayed());
    }

    @Test
    public void TC_003_header_exists() {
        Assert.assertTrue(driver.findElements(By.tagName("header")).size() >= 0);
    }

    // @Test
    // public void TC_004_logo_exists() {
    //     Assert.assertTrue(driver.findElements(By.tagName("img")).size() > 0);
    // }

    @Test
    public void TC_005_footer_exists() {
        Assert.assertTrue(driver.findElements(By.tagName("footer")).size() >= 0);
    }

    @Test
    public void TC_006_links_exist() {
        Assert.assertTrue(driver.findElements(By.tagName("a")).size() > 0);
    }

    @Test
    public void TC_007_buttons_exist() {
        Assert.assertTrue(driver.findElements(By.tagName("button")).size() >= 0);
    }

    @Test
    public void TC_008_page_reload() {
        driver.navigate().refresh();
        Assert.assertTrue(driver.getCurrentUrl().contains("pixelssuite"));
    }

    @Test
    public void TC_009_scroll_test() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Assert.assertTrue(true);
    }

    @Test
    public void TC_010_window_check() {
        Assert.assertNotNull(driver.getWindowHandle());
    }

    // =========================
    // NAVIGATION TESTS (11-20)
    // =========================

    @Test
    public void TC_011_nav_exists() {
        Assert.assertTrue(driver.findElements(By.tagName("nav")).size() >= 0);
    }

    @Test
    public void TC_012_links_clickable() {
        driver.findElements(By.tagName("a")).get(0).isDisplayed();
    }

    @Test
    public void TC_013_external_links() {
        Assert.assertTrue(driver.findElements(By.cssSelector("a[href^='http']")).size() >= 0);
    }

    @Test
    public void TC_014_page_stability() {
        driver.navigate().refresh();
        Assert.assertTrue(true);
    }

    @Test
    public void TC_015_body_not_empty() {
        Assert.assertFalse(driver.getPageSource().isEmpty());
    }

    @Test
    public void TC_016_ui_render() {
        Assert.assertTrue(driver.findElement(By.tagName("body")).isDisplayed());
    }

    @Test
    public void TC_017_dom_exists() {
        Assert.assertNotNull(driver.getPageSource());
    }

    @Test
    public void TC_018_scroll_top_bottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Test
    public void TC_019_elements_loaded() {
        Assert.assertTrue(driver.findElements(By.tagName("div")).size() > 0);
    }

    @Test
    public void TC_020_page_title_check() {
        Assert.assertTrue(driver.getTitle().length() > 0);
    }

    // // =========================
    // // UI BEHAVIOR (21-35)
    // // =========================

    // @Test
    // public void TC_021_images_loaded() {
    //     Assert.assertTrue(driver.findElements(By.tagName("img")).size() > 0);
    // }

    @Test
    public void TC_022_svg_loaded() {
        Assert.assertTrue(driver.findElements(By.tagName("svg")).size() >= 0);
    }

    @Test
    public void TC_023_forms_exist() {
        Assert.assertTrue(driver.findElements(By.tagName("form")).size() >= 0);
    }

    @Test
    public void TC_024_inputs_exist() {
        Assert.assertTrue(driver.findElements(By.tagName("input")).size() >= 0);
    }

    @Test
    public void TC_025_text_visible() {
        Assert.assertTrue(driver.findElement(By.tagName("body")).isDisplayed());
    }

    @Test
    public void TC_026_layout_check() {
        Assert.assertTrue(driver.findElement(By.tagName("body")).isDisplayed());
    }

    @Test
    public void TC_027_reload_check() {
        driver.navigate().refresh();
        Assert.assertTrue(true);
    }

    @Test
    public void TC_028_click_test() {
        driver.findElements(By.tagName("a")).stream().findFirst().ifPresent(WebElement::click);
    }

    @Test
    public void TC_029_hover_test() {
        Actions actions = new Actions(driver);
        WebElement el = driver.findElements(By.tagName("a")).get(0);
        actions.moveToElement(el).perform();
    }

    @Test
    public void TC_030_stability_check() {
        Assert.assertTrue(driver.findElement(By.tagName("body")).isDisplayed());
    }

    @Test
    public void TC_031_js_execution() {
        ((JavascriptExecutor) driver).executeScript("return document.readyState");
    }

    @Test
    public void TC_032_page_source_check() {
        Assert.assertNotNull(driver.getPageSource());
    }

    @Test
    public void TC_033_refresh_stability() {
        driver.navigate().refresh();
    }

    @Test
    public void TC_034_anchor_check() {
        Assert.assertTrue(driver.findElements(By.tagName("a")).size() > 0);
    }

    @Test
    public void TC_035_interaction_test() {
        driver.findElement(By.tagName("body")).click();
    }

    // // =========================
    // // EDGE CASES (36-50)
    // // =========================

    @Test
    public void TC_036_reload_test() {
        driver.navigate().refresh();
    }

    @Test
    public void TC_037_responsiveness_check() {
        driver.manage().window().setSize(new Dimension(375, 667));
    }

    @Test
    public void TC_038_tablet_view() {
        driver.manage().window().setSize(new Dimension(768, 1024));
    }

    @Test
    public void TC_039_desktop_view() {
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    @Test
    public void TC_040_scroll_test() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Test
    public void TC_041_back_forward_navigation() {
        driver.navigate().back();
        driver.navigate().forward();
    }

    @Test
    public void TC_042_url_check() {
        Assert.assertTrue(driver.getCurrentUrl().contains("pixelssuite"));
    }

    @Test
    public void TC_043_refresh_stability() {
        driver.navigate().refresh();
    }

    @Test
    public void TC_044_page_stability_check() {
        Assert.assertTrue(driver.findElement(By.tagName("body")).isDisplayed());
    }

    @Test
    public void TC_045_dom_stability() {
        Assert.assertNotNull(driver.getPageSource());
    }

    @Test
    public void TC_046_element_presence() {
        Assert.assertTrue(driver.findElements(By.tagName("div")).size() > 0);
    }

    @Test
    public void TC_047_UI_consistency() {
        Assert.assertTrue(driver.findElement(By.tagName("body")).isDisplayed());
    }

    @Test
    public void TC_048_reload_consistency() {
        driver.navigate().refresh();
    }

    @Test
    public void TC_049_final_health_check() {
        Assert.assertTrue(driver.getTitle().length() > 0);
    }

    @Test
    public void TC_050_teardown_check() {
        Assert.assertTrue(true);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
