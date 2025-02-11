package resources;

import beans.Address;
import beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigFile {

    @Bean
    public Address createAddress(){
        Address address = new Address();
        address.setCity("delhi");
        address.setPincode(734014);
        address.setHouseNo(2);
        return address;
    }

    @Bean
    public Student createStudent(){

        Student student = new Student();
        student.setAddress(createAddress());
        student.setName("Ankit");
        student.setRollNo(55);
        return student;
    }
}
