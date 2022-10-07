import java.util.Scanner;

public class Double {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int i;
        int dept = s.nextInt();
        s.close();
        if(dept % 2 == 0)
        {
            System.out.println("ODD");
        }
        else {
            System.out.println("EVEN");
        }


    }
}
