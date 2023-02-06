import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0, num, i, count = 0 ;
        double average;
        System.out.print("Enter a number: ");
        num = input.nextInt();

        for (i = 1; i <= num; i++){
            if (i % 3 == 0 && i % 4 == 0){
                total += i;
                count++;
                }

            }
        if (num > 11){
            System.out.print("Average is: " + total/count);
        }
        else
            System.out.print("Average is: 0");
        }

        }

