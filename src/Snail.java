import java.util.Scanner;

public class Snail {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int depth = s.nextInt();
        int start = 0;
        int days = 1;

        while (start < depth)
        {
            start = start + 7;
            if (start < depth)
            {
                start = start - 2;
                days = days + 1;
            }
        }

        System.out.println(days);

    }
}