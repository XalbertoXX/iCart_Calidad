package com.example.icartfinal.Cucumber

import io.cucumber.java8.PendingException
import org.mockito.BDDMockito.Then
import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import javax.annotation.meta.When


@RunWith(Cucumber::class)
    class MyStepDefinitions {
    @When("^I press \"([^\"]*)\"$")
    @Throws(Throwable::class)
    fun i_press_something(strArg1: String) {
        throw PendingException()
    }

    @Then("^I press \"([^\"]*)\"$")
    @Throws(Throwable::class)
    fun i_press_something(strArg1: String) {
        throw PendingException()
    }
}