import movable.Movable;
import movable.MovablePoint;
import movable.Movement;
import movable.Square;
import user.RegularUser;
import user.User;
import user.VipUser;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        MovablePoint mp = new MovablePoint(0,0,1,1);
        Square square = new Square(1,2,2,2);

//        moveObject(mp,Movement.UP);
//        moveObject(square,Movement.DOWN);

        RegularUser regularUser = new RegularUser(1,"A");
        VipUser vipUser = new VipUser(2,"B",15);

//        regularUser.printName();
//        vipUser.printName();



        Customer c1 = new Customer(1,"A",CustomerType.VIP);
        Customer c2 = new Customer(2,"B",CustomerType.REGULAR);
        Customer c3 = new Customer(3,"C",CustomerType.SPECIAL);

//        c1.calculatePriceForCustomer(100);
//        c2.calculatePriceForCustomer(100);
//        c3.calculatePriceForCustomer(100);





    }

    public static void moveObject(Movable obj, Movement movement){
        if (movement == Movement.UP){
            System.out.println("Object was at " + obj);
            obj.moveUp();
            System.out.println("Moved up "  + obj);
        }else if(movement == Movement.DOWN){
            System.out.println("Object was at " + obj);
            obj.moveDown();
            System.out.println("Moved down "  + obj);
        }else if(movement == Movement.LEFT){
            System.out.println("Object was at " + obj);
            obj.moveLeft();
            System.out.println("Moved left "  + obj);
        }else if(movement == Movement.RIGHT){
            System.out.println("Object was at " + obj);
            obj.moveRight();
            System.out.println("Moved right "  + obj);
        }
    }


    public static int weekDay(String day){
        return switch (day) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            default -> 0;
        };
    }



}