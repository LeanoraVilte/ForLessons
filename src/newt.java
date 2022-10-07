import java.util.Date;
import java.util.Scanner;

public class newt {
    public static void main(String[] args){
        Date n = new date.today();
    }

    private record date() extends Date {
        public static class today extends Date {
        }
    }
}
