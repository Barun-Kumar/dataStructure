import java.util.Arrays;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {
       /* List<Student> list = Arrays.asList(new Student("Varun","1"), new Student("Aman","2") );
        Comparator<Student> com = (s,s2) -> s.getName().compareTo(s2.getName());
        System.out.println(list);
        Collections.sort(list,com);
        System.out.println(list);*/


        List<Integer> list = Arrays.asList(1,4,6,8,2,9);
        //sum of square of all the odd number

        int res=list.stream()
                .filter(number -> number%2!=0)
                .mapToInt(number-> number*2)
                .sum();

        System.out.println(res);






    }

    public static class Student {

        private String name;
        private String id;

        public Student(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }
    }
}
