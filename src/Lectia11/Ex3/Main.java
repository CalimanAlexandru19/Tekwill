package Lectia11.Ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

            String[] skills = {"git", "Scala", "JBoss", "UML"};
            Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);
            String[] methods = {"neural networks", "decision tree", "bayesian algorithms"};
            DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, methods);

            System.out.println(developer.getName() + "\n" + developer.getEmail() + "\n" + developer.getExperience() + "\n" +
                    developer.getMainLanguage() + "\n" + Arrays.toString(developer.getSkills()));

            System.out.println();

            System.out.println(analyst.getName() + "\n" + analyst.getEmail() + "\n" + analyst.getExperience() + "\n" +
                    analyst.isPhd() + "\n" + Arrays.toString(analyst.getMethods()));

    }
}
