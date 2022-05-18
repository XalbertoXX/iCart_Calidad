package com.example.icartfinal.Cucumber

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith;

@RunWith(
    Cucumber.class)
    @CucumberOptions()
    class MyStepDefinitions {

    @Given("^que he introducido \"([^\"]*)\" en la lista$")
    fun que_he_introducido_something_en_la_lista (strArg1: String) {
        throw io.cucumber.java8.PendingException()
    }

    @When("^la lista no lo encuentre$")
    fun la_lista_no_lo_encuentre() {
        throw io.cucumber.java8.PendingException()
    }

    @Then("^la salida debería de ser \"([^\"]*)\"$")
    fun la_salida_debera_de_ser_something(strArg1: String) {
        throw io.cucumber.java8.PendingException()
    }

}