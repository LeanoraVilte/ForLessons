import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        double b = s.nextInt();
        int c = s.nextInt();

        if ( a+b <= c || a+c <= b || b+c <= a)
        {
            System.out.println("Треугольник не существует");
        }
        else
        {
            System.out.println("Треугольник существует");
        }


    }
}
