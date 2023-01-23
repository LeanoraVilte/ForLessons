import java.util.Scanner;

public class BankProcent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double kredit = s.nextDouble();
        double procent = s.nextDouble();
        double years = s.nextDouble();

        double total = years*(procent/100)*kredit + kredit;
        System.out.println(total);

        double peryear = kredit/years + (procent/100)*kredit;
        System.out.println(peryear);

        double permonth = peryear/12;
        System.out.println(permonth);

        double control = permonth*(years*12);
        System.out.println(control);

    }
}
