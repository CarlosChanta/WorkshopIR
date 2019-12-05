package StepDefinitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import org.openqa.selenium.WebDriver;

public class Steps {
    private WebDriver driver;

    @Dado("el uso del API para verificar el SKU {string}")
    public void busquedaSKUAPI(String SKU){

    }

    @Entonces("valido si esta disponible")
    public void validarDisponibilidad(){

    }

    @Y("si existe, entro a la ficha del producto")
    public void entrarficha(){

    }

    @Entonces("verifico si se muestran los botones de despacho y retiro deshabilitados")
    public void verificarbotones(){

    }

    @Y("que el boton de consultar stock esté habilitado")
    public void verificarstock(){

    }
}
