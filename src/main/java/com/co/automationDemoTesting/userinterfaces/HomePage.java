package com.co.automationDemoTesting.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {


    public static  final Target BTN_SIGNIN = Target.the("Boton de Sign in").locatedBy("//button[@id='btn1']");
    public static  final Target BTN_SKIP_SIGNIN = Target.the("Boton de Sign in").locatedBy("//button[@id='btn2']");
}
