import java.time.LocalDate;

enum CustomerType{ REGULAR, VIP, SPECIAL }

public class Customer {

    private int id;
    private String name;
    private CustomerType customerType;

    private LocalDate registeredDate;

    public Customer(int id, String name, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.customerType = customerType;
        this.registeredDate = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public void calculatePriceForCustomer(double price){
        if (this.customerType == CustomerType.REGULAR){
            System.out.println("You need to pay " + price);
        }else if (this.customerType == CustomerType.VIP){
            System.out.println("You need to pay " + ( price - price/10 ));
        }else{
            System.out.println("You need to pay " + ( price - price/20 ));
        }
    }

    public void checkIfCanBeNotRegular(){
        if(this.customerType == CustomerType.REGULAR && LocalDate.now().getYear() - registeredDate.getYear() >= 2){
            this.customerType = CustomerType.SPECIAL;
        }else if(this.customerType == CustomerType.SPECIAL && LocalDate.now().getYear() - registeredDate.getYear() >= 5){
            this.customerType = CustomerType.VIP;
        }
    }
}
