package beans;

public class Student {
    private int rollNo;
    private String name;
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
