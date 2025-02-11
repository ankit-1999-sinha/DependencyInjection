package ApplicationContext;

import beans.Address;
import beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        String fileLoc = "resources/spring.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(fileLoc);
        Student student = (Student) context.getBean("stdId");
        Address address = (Address) context.getBean("addId");
        System.out.println(address.toString());
        student.display();

    }
}
