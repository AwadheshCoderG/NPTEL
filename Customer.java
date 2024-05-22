package NPTEL;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("First Constructor");
    }

    public Customer(){
        this("Awadhesh", 30000l, "abc@xyz.com");
        System.out.println("Second Constructor");
    }

    public Customer(String name, String email){
        this(name, 20000l, email);
        System.out.println("Third Constructor");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


    public static void main(String[] args) {
        Customer account1 = new Customer("Abhishek",50000,"abcd@xyz.com");
        Customer account3 = new Customer("Abhay","asdf@xyz.com");
        Customer account2 = new Customer();
    }
}
