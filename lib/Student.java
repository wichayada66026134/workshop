package lib;
public class Student {
    private String name;
    private int christianEra;
    private int softwareTestingScore;

    public Student(String name, int christianEra, int softwareTestingScore) {
        this.name = name;
        this.christianEra = christianEra;
        this.softwareTestingScore = softwareTestingScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return 2024 - christianEra;  
    }

    public String getGrade() {
        if (softwareTestingScore >= 80) {
            return "A";
        } else if (softwareTestingScore >= 75) {
            return "B+";
        } else if (softwareTestingScore >= 70) {
            return "B";
        } else if (softwareTestingScore >= 65) {
            return "C+";
        } else if (softwareTestingScore >= 60) {
            return "C";
        } else if (softwareTestingScore >= 55) {
            return "D+";
        } else if (softwareTestingScore >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public String getOutput() {
        return "Name: " + name + "\n" +
               "Age: " + getAge() + "\n" +
               "Software Testing Grade: " + getGrade();
    }
}
