package com.example.icartfinal.Cucumber

import cucumber.api.java.en.Given
import io.cucumber.java8.PendingException
import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import org.mockito.BDDMockito.Then
import javax.annotation.meta.When

@RunWith(Cucumber::class)
    class MyStepDefinitions {
    @Given("^que he introducido \"([^\"]*)\" en la lista$")
    @Throws(Throwable::class)
    fun que_he_introducido_something_en_la_lista (strArg1: String) {
        throw PendingException()
    }

    @When("^la lista no lo encuentre$")
    @Throws(Throwable::class)
    fun la_lista_no_lo_encuentre() {
        throw PendingException()
    }

    @Then("^la salida debería de ser \"([^\"]*)\"$")
    @Throws(Throwable::class)
    fun la_salida_debera_de_ser_something(strArg1: String) {
        throw PendingException()
    }

}