package user;

import java.time.LocalDate;

public class RegularUser extends User{

    private LocalDate registerDate;

    public RegularUser(int id, String name) {
        super(id, name);
        registerDate = LocalDate.now();
    }

    @Override
    public void printName() {
        System.out.println("Regular user named " + this.getName());
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }


}
