package com.co.automationDemoTesting.tasks;

import com.co.automationDemoTesting.userinterfaces.HomePage;
import com.co.automationDemoTesting.userinterfaces.RegisterPage;
import cucumber.api.java.af.En;
import cucumber.api.java.es.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_SKIP_SIGNIN),
                Enter.theValue("William").into(RegisterPage.TXT_FIRSTNAME),
                Enter.theValue("Neira").into(RegisterPage.TXT_LASTNAME),
                Enter.theValue("Mi casa").into(RegisterPage.TXT_ADDRESS),
                Enter.theValue("Email1234@gmail.com").into(RegisterPage.TXT_EMAIL),
                Enter.theValue("3209635210").into(RegisterPage.TXT_PHONE),
                Click.on(RegisterPage.BTN_GENDER_MALE),
                Click.on(RegisterPage.BTN_HOBBIES_CRICKET),
                Click.on(RegisterPage.BTN_HOBBIES_MOVIES),
                Click.on(RegisterPage.BTN_HOBBIES_HOCKEY),
                Click.on(RegisterPage.LIST_LANGUAGE_SPANISH),
                Click.on(RegisterPage.LIST_LANGUAGE_ENGLISH)


        );

    }
    public static Register registerUser(){
        return Tasks.instrumented(Register.class);
    }
}
