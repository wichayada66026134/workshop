package lib;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test //TC001
    public void testPeter() {
        Student student1 = new Student("Peter", 1998, 85);
        assertEquals("Peter", student1.getName());
        assertEquals(26, student1.getAge());
        assertEquals("A", student1.getGrade());
        assertEquals("Name: Peter\nAge: 26\nSoftware Testing Grade: A", student1.getOutput());
    }

    @Test //TC002
    public void testJohn() {
        Student student2 = new Student("John", 2000, 78);
        assertEquals("John", student2.getName());
        assertEquals(24, student2.getAge());
        assertEquals("B+", student2.getGrade());
        assertEquals("Name: John\nAge: 24\nSoftware Testing Grade: B+", student2.getOutput());
    }

    @Test //TC003
    public void testSarah() {
        Student student3 = new Student("Sarah", 1995, 71);
        assertEquals("Sarah", student3.getName());
        assertEquals(29, student3.getAge());
        assertEquals("B", student3.getGrade());
        assertEquals("Name: Sarah\nAge: 29\nSoftware Testing Grade: B", student3.getOutput());
    }

    @Test //TC004
    public void testAlex() {
        Student student4 = new Student("Alex", 2002, 66);
        assertEquals("Alex", student4.getName());
        assertEquals(22, student4.getAge());
        assertEquals("C+", student4.getGrade());
        assertEquals("Name: Alex\nAge: 22\nSoftware Testing Grade: C+", student4.getOutput());
    }

    @Test //TC005
    public void testEmma() {
        Student student5 = new Student("Emma", 1990, 63);
        assertEquals("Emma", student5.getName());
        assertEquals(34, student5.getAge());
        assertEquals("C", student5.getGrade());
        assertEquals("Name: Emma\nAge: 34\nSoftware Testing Grade: C", student5.getOutput());
    }

    @Test //TC006
    public void testMichael() {
        Student student6 = new Student("Michael", 2005, 57);
        assertEquals("Michael", student6.getName());
        assertEquals(19, student6.getAge());
        assertEquals("D+", student6.getGrade());
        assertEquals("Name: Michael\nAge: 19\nSoftware Testing Grade: D+", student6.getOutput());
    }

    @Test //TC007
    public void testOlivia() {
        Student student7 = new Student("Olivia", 1997, 50);
        assertEquals("Olivia", student7.getName());
        assertEquals(27, student7.getAge());
        assertEquals("D", student7.getGrade());
        assertEquals("Name: Olivia\nAge: 27\nSoftware Testing Grade: D", student7.getOutput());
    }

    @Test //TC008
    public void testLiam() {
        Student student8 = new Student("Liam", 1999, 32);
        assertEquals("Liam", student8.getName());
        assertEquals(25, student8.getAge());
        assertEquals("F", student8.getGrade());
        assertEquals("Name: Liam\nAge: 25\nSoftware Testing Grade: F", student8.getOutput());
    }
}
