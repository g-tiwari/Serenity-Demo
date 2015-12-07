package com.gaurav.serenity.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.gaurav.serenity.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Google home page")
    public void givenTheUserIsOnTheGooogleHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user search for the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the word '$definition' in all results")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

}
