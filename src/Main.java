import java.nio.charset.CoderResult;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        //Test für Ex.01)
        System.out.println(Arrays.toString(CoursePhase.values()));
        System.out.println(CoursePhase.FINISHED.getMessage());
        System.out.println(CoursePhase.ONGOING.getMessage());
        System.out.println(CoursePhase.NOT_STARTED.getMessage());


        //Ex.02)

        Student student = new Student("Jonas", 3, "CS");
        Student student1 = new Student("Max", 3, "Bio");


        Student.StudentFormatter studentFormatter = s -> "Name " + student.name + " Year " + student.year;
        Student.StudentFormatter studentFormatter1 = s -> student.name + " studies " + student.major + " in Year " + student.year;


        System.out.println(studentFormatter.format(student));
        System.out.println(studentFormatter1.format(student));
        System.out.println(studentFormatter.format(student1));
        System.out.println(studentFormatter1.format(student1));



        //Ex.03)
        Movie movie = new Movie("Shrek", 9.5, 2000);
        Movie movie1 = new Movie("Cars", 8.5, 2002);
        Movie movie2 = new Movie("Mulan", 7, 2010);
        Movie movie3 = new Movie("Bambi", 10, 2004);
        Movie movie4 = new Movie("Rapunzel", 7.5, 2015);


        Movie[] movies = {movie, movie1, movie2, movie3, movie4};

        Arrays.stream(movies)
                .filter(m -> m.rating >= 8.5)
                .sorted(Comparator.comparing(Movie::getYear).thenComparing(Movie::getRating).reversed())
                .forEach(m -> System.out.println(m.getTitle() + " - " + m.getRating()));

    }
}