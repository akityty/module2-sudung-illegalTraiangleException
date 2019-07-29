import java.util.Scanner;

public class Main {
    public static void Traiangle (int a, int b, int c) throws IllegalTraiangleException{
        if(a<=0||b<=0||c<=0){
            System.out.println("value should large than zero");
        }else if(a+b<=c||a+c<=b||b+c<=a){
            System.out.println("not a Traiangle");
        }else{
            int perimeter = a+b+c;
            System.out.println("perimeter of Traiangle is "+perimeter);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scanner.nextInt();
        System.out.println("Input a: ");
        int b = scanner.nextInt();
        System.out.println("Input a: ");
        int c = scanner.nextInt();
        try {
            Traiangle(a,b,c);
        }catch (IllegalTraiangleException e){
            System.out.println(e.getErrorMessage());
        }
    }
}
