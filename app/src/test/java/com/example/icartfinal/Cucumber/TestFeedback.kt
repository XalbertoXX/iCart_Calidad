package com.example.icartfinal.Cucumber

import cucumber.api.java.en.Given
import io.cucumber.java8.PendingException
import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import org.mockito.BDDMockito.Then
import javax.annotation.meta.When

@RunWith(Cucumber::class)
    class MyStepDefinitions {
    @Given("^un texto pasado por el cuadro de texto \"([^\"]*)\"$")
    @Throws(Throwable::class)
    fun un_texto_pasado_por_el_cuadro_de_texto_something(strArg1: String?) {
        throw PendingException()
    }

    @When("^pulse a \"([^\"]*)\"$")
    @Throws(Throwable::class)
    fun pulse_a_something(strArg1: String?) {
        throw PendingException()
    }

    @Then("^la salida debería de ser \"([^\"]*)\"$")
    @Throws(Throwable::class)
    fun la_salida_debera_de_ser_something(strArg1: String?) {
        throw PendingException()
    }
}