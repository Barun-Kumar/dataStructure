package thread.threadLocal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadLocalTest {


    public static void main(String[] args) throws InterruptedException {
        ExecutorService executors = Executors.newFixedThreadPool(10);
        long startTime=System.currentTimeMillis();
      //  StudentService studentService= new StudentService();
        int count=0;
        while (count<2) {
            for (int i = 1; i <= 3; i++) {
               // Thread.sleep(1000);
                StudentRunnable task = new StudentRunnable(Long.valueOf(i),ServiceThreadLocal.getServiceThreadLocal().get());
               // System.out.println(task);
                executors.submit(task);
            }
            count++;
        }
        while(!executors.isTerminated()){
            executors.shutdown();
            continue;
        }

        long endTime=System.currentTimeMillis();
        System.out.println("==================="+(endTime-startTime));
    }

}

class ServiceThreadLocal{

    private static ThreadLocal<StudentService> serviceThreadLocal = new ThreadLocal<StudentService>(){
        @Override
        public StudentService initialValue(){
            return new StudentService();
        }
        @Override
        public StudentService get(){
            return super.get();
        }
    };

    public static ThreadLocal<StudentService> getServiceThreadLocal() {
        return serviceThreadLocal;
    }
}

class StudentRunnable implements Runnable{
    Long studentId;
    private StudentService studentService;

    public StudentRunnable(Long studentId,StudentService studentService) {
        this.studentId = studentId;
        this.studentService=studentService;
    }


    public void run(){
        System.out.println(studentService);
        String date =studentService.getStudentDateOfBirth(studentId);
        System.out.println(Thread.currentThread().getName()+"-> "+date);
    }

}


class StudentService{
    StudentDao dao = new StudentDao();
    public String getStudentDateOfBirth(Long id){
        System.out.println(dao);
        Student s=dao.getStudent(id);
        DateFormat df= new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(df);
        return df.format(s.getDob());
    }

}


class StudentDao{
    static Map<Long, Student> studentMap;
    public Student getStudent(Long id){
        return studentMap.get(id);
    }

    static {
        studentMap = new HashMap<>();
        Student varun =new Student(1L,"Varun",new Date("05/01/1988"));
        Student rahul=new Student(2L,"Rahul",new Date("05/01/1990"));
        Student yash=new Student(3L,"Yash",new Date("05/01/1995"));
        studentMap.put(1L,varun);
        studentMap.put(2L,rahul);
        studentMap.put(3L,yash);
    }
}

class Student{
    private Long id;
    private String name;
    private Date dob;

    public Student(long id, String name, Date dob) {
        this.id=id;
        this.name=name;
        this.dob=dob;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}

