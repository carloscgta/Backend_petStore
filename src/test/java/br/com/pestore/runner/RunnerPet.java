package br.com.pestore.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.pestore.steps" }, 
                 features = {"./src/test/resources/br/com/pestore/features" } 
                 ,tags = {"@criarPet"})
public class RunnerPet {

	

}
