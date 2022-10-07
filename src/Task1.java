import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String score = scanner.nextLine();


        if (score.equalsIgnoreCase("0")) {
            System.out.println("Проигрыш");
        } else if (score.equalsIgnoreCase("1")) {
            System.out.println("Ничья");
        } else if (score.equalsIgnoreCase("3")) {
            System.out.println("Выигрыш");
        } else {
            System.out.println("Неверный счет");
        }//результат футбольного матча
    }
}
