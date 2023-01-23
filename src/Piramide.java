public class Piramide {
    public static void main(String[] args) {
     int a = 0;
     while (a<10)
     {
         if (a == 0 || a == 9) {
             int b = 0;

             while (b <20) {
                 System.out.print("B");
                 b++;
             }
             System.out.println();
             }
         else
         {
             System.out.print("B" + "                  " + "B");
             System.out.println();
         }
         a++;
         }

     }
    }

