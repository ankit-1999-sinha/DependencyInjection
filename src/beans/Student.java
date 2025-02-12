package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private int rollNo;
    private String name;

    @Autowired
    @Qualifier("createAddress")
    private Address address;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public  void display(){
        System.out.println(rollNo + name + address);
    }
}
