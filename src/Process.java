
import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        NumberExercise num = new NumberExercise();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("~~~~~Menu~~~~~");
            System.out.println("1: import Data ");
            System.out.println("2: print Data");
            System.out.println("3: find max number of second ");
            System.out.println("4: delete odd number");
            System.out.println("choose(enter 0 to exit) : ");


            choose = sc.nextInt();
            switch (choose) {
                case 1:
                   num.importData();
                    break;
                case 2:
                    num.prinData();
                    break;
                case 3:
                    num.findMax2();
                    break;
                case 4:
                    num.deleteOddNumber();
                    break;
            }
        } while (choose != 0);
    }
}
