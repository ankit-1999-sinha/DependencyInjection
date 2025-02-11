package resources;

import beans.Address;
import beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigFile {

    @Bean
    public Address createAddress(){
        Address address = new Address(2,"delhi",734014);

        return address;
    }

    @Bean
    public Student createStudent(){

        Student student = new Student(2,"ankit",createAddress());

        return student;
    }
}
