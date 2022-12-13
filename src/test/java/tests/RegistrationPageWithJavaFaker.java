package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static tests.TestData.genderRandom;
import static tests.TestData.sobjectRandom;

public class RegistrationPageWithJavaFaker extends TestBase {

    @Test
    void StudentRegistrationForm() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String gender = genderRandom();
        String phone = faker.phoneNumber().subscriberNumber(10);
        String birthDay = faker.date().toString();
        String birthMonth = faker.;
        String birthYear = faker.;
        String firstSubjects = sobjectRandom();
        String secondSubjects = sobjectRandom();
        String hobbies = faker.su;
        String picture = "dog.jpeg";
        String currentAddress = faker.address().fullAddress();


        registrationPage.openPage()
                .setFirstName(firstName)    
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhone(phone)
                .setBirthDate(birthDay, birthMonth, birthYear)
                .setSubjects(firstSubjects, secondSubjects)
                .setHobbies(hobbies)
                .uploadPicture(picture)
                .setAddress(currentAddress)
                .setState()
                .setCity()
                .submitForm()
                .verifyResultsModalAppears()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", phone)
                .verifyResult("Date of Birth", "30 June,2008")
                .verifyResult("Subjects", "English, Maths")
                .verifyResult("Hobbies", "Music")
                .verifyResult("Picture", "dog.jpeg")
                .verifyResult("Address", currentAddress)
                .verifyResult("State and City", "Rajasthan Jaiselmer");
        //checking the data after sending
    }
}
