import java.util.Scanner;

public class Converter {public static void main(String[] ar
    gs) {
        Scanner s = new Scanner(System.in);
        while (true) {
            String st = s.nextLine();
            if (st.equals("stop")) {
                break;
            }
            System.out.println(st);
        }
    }
}
