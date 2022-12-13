package tests;

import java.util.Random;

public class TestData {
    static Random random = new Random;


    public static String genderRandom() {
        String[] gender = {"Male", "Female", "Other"};
        int index = random.nextInt(gender.length);
        return gender[index];
    }

    public static String monthRandom() {
        String[] month = {"January", "Febuary", "March", "Aprile", "May", "June",
                "July", "Auguste", "September", "November", "October", "December"};
        int index = random.nextInt(month.length);
        return month[index];
    }

    public static String sobjectRandom() {
        String[] sobject = {"English", "Chemistry", "Computer Science", "Commerce",
                "Economic", "Social Studies"};
        int index = random.nextInt(sobject.length);
        return sobject[index];
    }
}
