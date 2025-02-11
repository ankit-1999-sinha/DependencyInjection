package beans;

public class Student {
    private int rollNo;
    private String name;
    private Address address;

    public void setRollNo(int rollNo) {
        System.out.println("setter method for rollNo");
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        System.out.println("setter method for name");
        this.name = name;
    }

    public void setAddress(Address address) {
        System.out.println("setter method for address");
        this.address = address;
    }

    public  void display(){
        System.out.println(rollNo + name + address);
    }
}
