import java.util.InputMismatchException;
import java.util.Scanner;

public class calculation3 {

    public static void printMenu(){
        System.out.println("====Menu Program====");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculation call = new Calculation();
        boolean repeat = true;
        boolean report = false;
        do{

            try {
                printMenu();
                System.out.print("Select Menu : ");
                int menu = in.nextInt();
                switch (menu){
                    case 1 :
                        System.out.print("Enter the length of the side of the square : ");
                        double side = in.nextDouble();
                        cal.setSquare(side);
                        cal.run();
                        System.out.println();
                        System.out.println("The Calculation result : " + cal.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double rad = in.nextDouble();
                        cal.setCircle(rad);
                        cal.run();
                        System.out.println("The Calculation result : " + cal.getCircle());
                        break;              
    }