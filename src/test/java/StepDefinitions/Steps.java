package StepDefinitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Steps {
    private WebDriver driver;
    By seccionNoDisp = By.xpath("//*[@id=\"content\"]/section/div[2]/div[2]/div[2]/div/div[5]/div");
    By btnRetiro = By.xpath("//*[@id=\"content\"]/section/div[2]/div[2]/div[2]/div/div[6]/div/div[1]");
    By btnDespacho = By.xpath("//*[@id=\"content\"]/section/div[2]/div[2]/div[2]/div/div[6]/div/div[2]");

    @Dado("que tengo que verificar el SKU {string}")
    public void busquedaSKUAPI(String SKU){
        System.out.println("Probando SKU: "+SKU);
    }

    @Entonces("valido si esta disponible")
    public void validarDisponibilidad(){
        System.setProperty("webdriver.chrome.driver","src/test/Resources/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Y("si existe, entro a la ficha del producto {string}")
    public void entrarficha(String URL){
        driver.get(URL);
    }

    @Entonces("verifico si se muestra el mensaje de producto no disponible")
    public void verificarbotones(){
        if (driver.findElement(seccionNoDisp).isDisplayed()) {
            assertTrue(true);
        }else {
            fail();
            driver.quit();
        }
    }

    @Y("verifico si se muestran los botones de despacho y retiro deshabilitados")
    public void verificarstock(){
        if(driver.findElement(btnDespacho).isDisplayed()){
            if(driver.findElement(btnRetiro).isDisplayed()){
                assertTrue(true);
            }else{
                fail();
            }
        }else{
            fail();
        }
        driver.quit();
    }
}
