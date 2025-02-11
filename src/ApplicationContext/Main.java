package ApplicationContext;


import beans.Address;
import beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resources.JavaConfigFile;


public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
        Student student = (Student) context.getBean(Student.class);
        Address address = (Address) context.getBean(Address.class);
        System.out.println(address.toString());
        student.display();
    }
}
