package co.com.cliente.proyecto.test.stepdefinition;

import co.com.cliente.proyecto.test.business.BusinessController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsEjemplo {

    public BusinessController businessController = new BusinessController();


    @Given("^que quiero autenticarme en el portal de compras$")
    public void que_quiero_autenticarme_en_el_portal_de_compras() throws Throwable {
        businessController.iniciarAplicacion(0, "http://www.automationpractice.com", "EjemploPrueba", "Funcionalidad_001");
    }

    @When("^ingreso mis credenciales de acceso$")
    public void ingreso_mis_credenciales_de_acceso() throws Throwable {
        businessController.autenticacion("manuel.salas@sofka.com.co", "12345");
    }

    @Then("^ingreso a mi cuenta$")
    public void ingreso_a_mi_cuenta() throws Throwable {
        businessController.verifySigIn();

    }
}
