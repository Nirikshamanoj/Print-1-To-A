import java.util.Scanner;
public class Print1ToA {
    static void printNumbers(int A) {
        if (A == 1){
            System.out.print(1 + " ");
            return;
        }
        printNumbers(A - 1);
        System.out.print(A + " ");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        printNumbers(n);

    }
}
