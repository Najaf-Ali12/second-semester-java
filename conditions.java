//created a java programme in which we take two numbers from user and also operation symbol and then will perform operations
import java.util.Scanner;
public class conditions{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);       //creates a new object of the class scanner
        int number=scanner.nextInt();   //continuosuly use this to get more inputs
        int n2=scanner.nextInt();
        char opt=scanner.next().charAt(0);    //word index is due to vscode  will accept any datatype and result value at 0
        if (opt=='+'){
            System.out.println(number+n2);
        }
        else if (opt=='-'){
            System.out.println(number-n2);
        }
        else if (opt=='*'){
            System.out.println(number*n2);
        }
        else if (opt=='/'){
            System.out.println(number/n2);
        }
    }

    //classname objectname=new classname(System.in);   to create an object
    //Data type variable=object.keyword()   nextint is used to get 
    //in java single quote is for single characters and double quote is for strings(plural characters)
}