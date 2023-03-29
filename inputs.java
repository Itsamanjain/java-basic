import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {

        // taking input from user for thr rollno:-
        System.out.print("enter your rollno:");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("your roll no.is " + rollno);

        //your marks input :-

        System.out.print("enter your marks:");
        float marks = input.nextFloat();
        System.out.println("your marks is : "+marks);

    }
}
