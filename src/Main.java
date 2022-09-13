import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

            public static void main(String[] args) {
                String A = "Hello ";
                String B = "New ";
                String C = "World!";

                System.out.println(A + B + C);//конкантенация строк

                int d, f, e;
                d = 1;
                f = 3;
                e = d + f;
                System.out.println(e);//математика: суммирование

                d = 6;
                f = 4;
                int w = d * f;
                System.out.println(w);//математика: умножение

                A = "your name " +
                        " ";
                d = 42;
                System.out.println(A + d);//контантенация: строка + число

                int x = 8;
                int y = x * x;
                System.out.println(y);//begin2 - первый вариант

                int l = 9;
                int j = 2;
                System.out.println("Площадь квадрата равна " + Math.pow(l, j));//begin2 - второй вариант

                int r = 100;
                int length = r * 4;
                System.out.println("Длина сторон квадрата равна " + length);//begin 1

                l = 5;
                j = 10;
                int s = l * j;
                length = (l + j) * 2;
                System.out.println("Площадь прямоугольника равна " + s);
                System.out.println("Длина длин сторон прямоугольника равна " + length);//begin 3

                double p = 3.14;
                int D = 3;
                double L = p * D;
                System.out.println("Длина окружности равна " + L);//begin 4

                l = 4;
                int v = l * l * l;
                s = 6 * (l * l);
                System.out.println("Длина сторон куба равна " + s);//begin 5
                System.out.println("Объем куба равен " + v);//begin 5

                int a, b, c;
                a = 2;
                b = 3;
                c = 5;
                v = a * b * c;
                s = 2 * (a * b + b * c + a * c);
                System.out.println("Длина сторон параллелипипеда равна " + s);//begin 6
                System.out.println("Объем параллелипипеда равен " + v);//begin 6

                r = 5;
                L = p * (r * 2);
                double S = p * (r * r);
                System.out.println("Длина окружности равна " + L);//begin 7
                System.out.println("Площадь круга равна " + S);//begin 7

                a = 6;
                b = 4;
                int mean = (a + b) / 2;
                System.out.println("Среднеарифмтическое a и b равно " + mean);//begin 8 - в java 5/2 будет 2 (NotaBene!!!)

                int T = 2;
                int Y = 3;
                int G = T * Y;
                int O = (int) Math.sqrt(G);
                System.out.println("Среднегеометрическое a и b равно " + O);//begin 9 (под вопросом - некоторые значения считает неправильно)

                int ax = 6;
                b = 3;
                int sum = (ax * ax) + (b * b);
                int sub = (ax * ax) - (b * b);
                int mlt = (ax * ax) * (b * b);
                int div = (ax * ax) / (b * b);
                System.out.println(sum);//begin 10
                System.out.println(sub);//begin 10
                System.out.println(mlt);//begin 10
                System.out.println(div);//begin 10

                a = -6;
                b = -3;
                int sum1 = abs(a) + abs(b);
                int sub1 = abs(a) - abs(b);
                int mlt1 = abs(a) * abs(b);
                int div1 = abs(a) / abs(b);
                System.out.println(sum1);//begin 11
                System.out.println(sub1);//begin 11
                System.out.println(mlt1);//begin 11
                System.out.println(div1);//begin 11

                int tr0 = 3;
                int tr1 = 4;
                double gip = Math.sqrt((tr0 * tr0) + (tr1 * tr1));
                double per = tr0 + tr1 + gip;
                System.out.println(gip);//begin 12
                System.out.println(per);//begin 12

                int R1 = 3;
                int R2 = 2;
                double s1 = (R1 * 2) * p;
                double s2 = (R2 * 2) * p;
                double s3 = s1 - s2;
                System.out.println(s3);//begin 13
                System.out.println(s1);//для контроля
                System.out.println(s2);//для контроля

                double r1 = L / p / 2;
                double sr1 = p * (r1 * r1);
                System.out.println(r1);//begin 14
                System.out.println(sr1);//begin 14
                double c1 = sr1 / 25;
                System.out.println("Контроль: " + c1);//для контроля

                double S1 = 79.5;
                double S0 = S1 / p;
                double D1 = Math.sqrt(S0) * 2;
                System.out.println("Диаметр: " + D1);//Begin 15
                double L1 = D1 * p;
                System.out.println("Длина окружности: " + L1);//Begin 15

                int x1 = 6;
                int x2 = 9;
                int x3 = abs(x2 - x1);
                System.out.println("Расстояние: " + x3);//begin 16 - длина отрезка

                int x4 = 7;
                int x5 = 9;
                int x6 = 12;
                int AC = abs(x6 - x4);
                int BC = abs(x6 - x5);
                int ACBC = AC + BC;
                System.out.println("Cумма отрезков: " + ACBC);//begin 17

                int x7 = 7;
                x5 = 11;
                x6 = 9;
                int xABC = abs(x6 - x7) * abs(x5 - x6);
                System.out.println("Произведение отрезков: " + xABC);//begin 18

                x1 = 3;
                int y1 = 5;
                x2 = 8;
                int y2 = 1;
                int w1 = abs(x2 - x1);
                int l1 = abs(y1 - y2);
                int lp = w1 * 2 + l1 * 2;
                int sp = w1 * l1;
                System.out.println("Длина периметра: " + lp);//begin 19
                System.out.println("Площадь: " + sp);//begin 19

                int px = 8;
                int py = 2;
                int px1 = 10;
                int py1 = 3;
                double lxy0 = (px1 - px) * (px1 - px);
                //System.out.println(lxy0);//контроль1
                double lxy1 = (py1 - py) * (py1 - py);
                //System.out.println(lxy1);//контроль2
                double lxy2 = Math.sqrt(lxy0 + lxy1);
                System.out.println(lxy2);//begin 20


                //begin 21 в данном примере мы не будем проверять, что треугольник это треугольник, а будем использовать Пифагову тройку 3, 4, 5
                px = 1;
                py = 1;
                px1 = 5;
                py1 = 4; //A (px, py), B (px1, py), C (px1, py1)

                //AB
                double lxy3 = (px1 - px) * (px1 - px);
                //System.out.println(lxy3);//контроль1
                double lxy4 = (py - py) * (py - py);
                //System.out.println(lxy4);//контроль2
                double lxy5 = Math.sqrt(lxy3 + lxy4);
                System.out.println(lxy5);

                //BC
                double lxy6 = (px1 - px1) * (px1 - px1);
                //System.out.println(lxy6);//контроль1
                double lxy7 = (py1 - py) * (py1 - py);
                //System.out.println(lxy7);//контроль2
                double lxy8 = Math.sqrt(lxy6 + lxy7);
                System.out.println(lxy8);

                //CA
                double lxy9 = (px1 - px) * (px1 - px);
                //System.out.println(lxy9);//контроль1
                double lxy10 = (py1 - py) * (py1 - py);
                //System.out.println(lxy10);//контроль2
                double lxy11 = Math.sqrt(lxy9 + lxy10);
                System.out.println(lxy11);

                double p1 = lxy5 + lxy8 + lxy11;//периметр
                double p2 = (lxy5 + lxy8 + lxy11) / 2;
                double p3 = Math.sqrt(p2 * (p2 - lxy5) * (p2 - lxy8) * (p2 - lxy11));//площадь
                System.out.println(p1);
                System.out.println(p3);

                a = 3;
                b = 8;
                System.out.println("A = " + a + ", B = " + b);//show variables
                a = b;
                b = a;
                System.out.println("New A = " + a + ", new B = " + b);//Begin 22


                a = 3;
                b = 8;
                c = 0;
                int temp = c;
                System.out.println("A = " + a + ", B = " + b + ", C = " + c);//show variables
                c = b;
                b = a;
                a = temp;
                System.out.println("New A = " + a + ", new B = " + b + ", New C = " + c);//Begin 23


                a = 3;
                b = 8;
                c = 0;
                int temp1 = c;
                int temp2 = b;
                System.out.println("A = " + a + ", B = " + b + ", C = " + c);//show variables
                c = a;
                b = temp1;
                a = temp2;
                System.out.println("New A = " + a + ", new B = " + b + ", New C = " + c);//Begin 24

                x = 2;
                x1 = (int) Math.pow(x, 6);
                x2 = 3 * x1;//первый член
                x3 = 6 * (int) Math.pow(x, 2);
                y = x2 - x3 - 7;
                System.out.println(y);//begin 25

                x = 5;
                int x0 = x - 3;
                x1 = (int) Math.pow(x0, 6);
                x2 = 4 * x1;//first
                x3 = (int) Math.pow(x0, 3);
                x4 = 7 * x3;//second
                y = x2 - x4 + 2;
                System.out.println(y);//begin 26

                double double1 = 10;
                double double2 = 0;
                double double3 = double1 / double2;
                System.out.println(double3);//divide by Zero


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
                    }
                //результат футбольного матча

                double lb = 1;
                while (lb < 11) {
                    double gr = lb * 453;
                    double kilo = gr / 1000;
                    System.out.println(lb + " фунт/а/ов равен/равно/равны " + kilo + " килограмм/а");
                    lb++;
                }

            }
        }