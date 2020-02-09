// Creates a Student class with proper attributes
// Uses Collections to sort multiple Student objects

/**
 * Created by samirriaz on 4/19/17.
 */
import java.util.*;

public class Lab7_yourInitials {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Paul", 25));
        list.add(new Student("Heath", 18));
        list.add(new Student("Caleb", 21));
        list.add(new Student("Gary", 19));

        Collections.sort(list);
        for (int i = 0; i<list.size(); i++) {
            System.out.print(toString(list.get(i)));
        }
        System.out.println();
        Collections.sort(list, new StudentComparatorName());


        for (int i = 0; i<list.size(); i++) {
            System.out.print(toString(list.get(i)));
        }
    }

    static class StudentComparatorName implements Comparator<Student> {
        //takes two arguments as students
        public int compare(Student s, Student x) {
            return s.getName().compareTo(x.getName());
        }
    }
    static class Student implements Comparable<Student> {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }


        //compare by age
        public int compareTo(Student i) {
            if (getAge() > i.getAge()) {
                return 1;
            } else if (getAge()<i.getAge()) {
                return -1;
            } else {
                return 0;
        }
    }
    }
    //returns name and age for a student in the format: [name, age]
    public static String toString(Student x) {
        return "[" +x.getName()+ ", " +x.getAge()+ "]";
    }
}
