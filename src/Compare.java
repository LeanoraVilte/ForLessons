import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();

        if (Math.abs(b-a) < 0.00001)
            {
                System.out.println("Числа равны");
            }
        else
             {
                 System.out.println("Числа не равны");
             }
    }

}
