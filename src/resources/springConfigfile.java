package resources;

import beans.Address;
import beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class springConfigfile {

    @Bean
    public Address createAddress(){
        Address address = new Address();
        address.setHouseNo(2);
        address.setCity("delhi");
        address.setPincode(734014);
        return address;
    }

    @Bean
    public Address createAddress2(){
        Address address = new Address();
        address.setHouseNo(4);
        address.setCity("chandigarh");
        address.setPincode(7555);
        return address;
    }

    @Bean
    public Student createStudent(){

        Student student = new Student();
        //student.setAddress(createAddress()); // manually DI
        student.setName("Ankit");
        student.setRollNo(55);
        return student;
    }
}
