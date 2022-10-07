import java.util.Scanner;

public class Task {
            public static void main(String[] args) {

                Scanner s = new Scanner(System.in);

                int i;
                double dept = s.nextDouble();

                for (i = 0; i < 4; i++)
                {
                    double pay = dept*0.1;
                    double end = dept-pay;
                    dept = end;
                }
                System.out.println(dept);
            }
        }

