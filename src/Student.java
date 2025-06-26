public class Student {
    String name;
    int year;
    String major;


    public Student(String name, int year, String major) {
        this.name = name;
        this.year = year;
        this.major = major;
    }



    public interface StudentFormatter { String format(Student s); }


}

