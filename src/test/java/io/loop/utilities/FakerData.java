package io.loop.utilities;

import com.github.javafaker.Faker;

public class FakerData {
    /**
     * performs a pause
     * @param typeData
     * @author Igor
     */
    public static String fakerGenerator (String typeData) {
        String data = "";
        Faker faker = new Faker();
        switch (typeData.toLowerCase()) {
            case "firstname":
                data = faker.name().firstName();
                break;
            case "lastname":
                data = faker.name().lastName();
                break;
            case "fullstreetadress":
                data = faker.address().fullAddress();
                break;
            case "street":
                data = faker.address().streetAddress();
                break;
            case "city":
                data = faker.address().city();
                break;
            case "state":
                data = faker.address().state();
                break;
            case "zipcode":
                data = faker.address().zipCode();
                break;
            case "email":
                data = faker.internet().emailAddress();
                break;
            case "phone":
                data = faker.phoneNumber().cellPhone();
                break;
            case "fax":
                data = faker.phoneNumber().cellPhone();
                break;
            case "companyname":
                data = faker.company().name();
                break;
            case "companydba":
                data = faker.company().buzzword();
                break;
            case "ownpart":
                data = "" + faker.number().numberBetween(1, 100);
                break;
            case "ssn":
                data = faker.idNumber().ssnValid();
                break;
            case "cardnumber":
                data = faker.business().creditCardNumber();
                break;
            case "cardexpiry":
                data = faker.business().creditCardExpiry();
                break;
            case "cardcvc":
                data = String.format("%03d", faker.number().numberBetween(100, 999));;
                break;
        }
        return data;
    }
}