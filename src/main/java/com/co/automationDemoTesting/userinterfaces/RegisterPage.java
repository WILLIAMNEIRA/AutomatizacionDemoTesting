package com.co.automationDemoTesting.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target TXT_FIRSTNAME = Target.the("Ingrese aqui su Nombre").locatedBy("//input[@placeholder='First Name']");
    public static final Target TXT_LASTNAME = Target.the("Ingrese aqui su Apellido").locatedBy("//input[@placeholder='Last Name']");
    public static final Target TXT_ADDRESS = Target.the("Ingrese aqui su Direccion").locatedBy("//textarea[@ng-model='Adress']");
    public static final Target TXT_EMAIL = Target.the("Ingrese aqui su Correo Electronico").locatedBy("//input[@ng-model='EmailAdress']");
    public static final Target TXT_PHONE = Target.the("Ingrese aqui su Telefono").locatedBy("//input[@ng-model='Phone']");
    public static final Target BTN_GENDER_MALE = Target.the("Seleccione aqui su genero(Male)").locatedBy("//input[@value='Male']");
    public static final Target BTN_GENDER_FEMALE = Target.the("Seleccione aqui su genero(Female)").locatedBy("//input[@value='FeMale']");
    public static final Target BTN_HOBBIES_CRICKET = Target.the("Seleccione aqui su Hobbies(Cricket)").locatedBy("//input[@id='checkbox1']");
    public static final Target BTN_HOBBIES_MOVIES = Target.the("Seleccione aqui su Hobbies(Movies)").locatedBy("//input[@id='checkbox2']");
    public static final Target BTN_HOBBIES_HOCKEY = Target.the("Seleccione aqui su Hobbies(Hockey)").locatedBy("//input[@id='checkbox3']");
    public static final Target LIST_LANGUAGES = Target.the("Seleccione aqui su Idioma)").locatedBy("//div[@id='msdd']");
    public static final Target SELECT_SKILLS = Target.the("Seleccione aqui sus Habilidades)").locatedBy("//select[@id='Skills']");
    public static final Target SELECT_COUNTRY = Target.the("Seleccione aqui su pais)").locatedBy("//span[@id='select2-country-container']");
    public static final Target SELECT_DATEOFBIRTH_YEAR = Target.the("Seleccione aqui su (Año) de nacimiento)").locatedBy("//select[@id='yearbox']");
    public static final Target SELECT_DATEOFBIRTH_DAY = Target.the("Seleccione aqui su (Dia) de nacimiento)").locatedBy("//select[@id='daybox']");
    public static final Target TXT_PASSWORD = Target.the("Ingrese aqui su contraseña)").locatedBy("//input[@id='firstpassword']");
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Ingrese aqui su  Confirmación de Contraseña)").locatedBy("//input[@id='secondpassword']");
    public static final Target BTN_SUBMIT = Target.the("Clic Boton Submit)").locatedBy("//button[@id='submitbtn']");

}
