import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(addNum(A,B));
    }

    static int addNum(int num1, int num2) {
        return (num1+num2)*(num1-num2);
    }
}