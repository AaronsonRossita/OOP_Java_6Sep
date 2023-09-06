package user;

public class VipUser extends User{

    private int discount;

    public VipUser(int id, String name, int discount) {
        super(id, name);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public void printName() {
        System.out.println("VIP user named " + this.getName());
    }
}
