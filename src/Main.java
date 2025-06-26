import java.nio.charset.CoderResult;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(CoursePhase.values()));
        System.out.println(CoursePhase.FINISHED.getMessage());
        System.out.println(CoursePhase.ONGOING.getMessage());
        System.out.println(CoursePhase.NOT_STARTED.getMessage());



        ;
    }
}