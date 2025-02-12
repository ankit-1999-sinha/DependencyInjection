package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private int rollNo;
    private String name;

    @Autowired
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
