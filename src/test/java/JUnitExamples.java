import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitExamples {

    @BeforeAll
     static void beforAll (){
        System.out.println ("  Here is beforAll()");

    }
    @BeforeEach
    void beforEach() {
        System.out.println ("  Here is beforEach");
    }

    @Test
    void firstTest(){
        System.out.println("  Here is firstTest");
    }
    @Test

    void secondTest(){
        System.out.println("  Here is secondTest");

    }
}
