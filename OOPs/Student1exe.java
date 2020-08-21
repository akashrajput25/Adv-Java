package OOPs;

import java.util.HashMap;
import java.util.Map;

public class Student1exe {
    public static void main(String[] args) {
        Student1 s1 = new Student1("CSIT-1");
        Student1 s2 = new Student1("CSIT-1");
        System.out.println(s1.equals(s2));
        Map<Student1 , Details> StudentDetails = new HashMap<Student1 , Details>();

        StudentDetails.put(s1,new Details());
        StudentDetails.put(s2,new Details());

        System.out.println(StudentDetails.size());

    }
}