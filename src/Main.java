import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main
{
    public static int power(int body, int pow)
    {
        int multiplier = body;
        for (int i = 1; i < pow; i++)
        {
            body *= multiplier;
        }
        return  body;
    }
    public static String ToUpperCase(String line)
    {
        line = line.toUpperCase();
        printLine(line);
        return line;

    }

    public static void printLine(String line)
    {
        System.out.println(line);
    }
    public static void printChar(char line)
    {
        System.out.print(line);
    }
    public static void printInt(int Numb)
    {
        System.out.println("####printInt####\n"+Numb+"\n####printInt####");
    }
    public static long hypotinus(int A, int B)
    {
        double C=0;
        C = power(A,2)+power(B,2);
        C = Math.sqrt(C);
        return Math.round(C);
    }
    public static boolean Stay_or_Go(String line)
    {
        boolean flag = false;
        line = line.toUpperCase();
        if (line.equals("Y"))
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        return flag;
    }
    public static String  Input(String line)
    {
        Scanner scan = new Scanner(System.in);
        line = scan.nextLine();
        return line;
    }
    public static void reverse_print(String line)
    {
        for (int i = line.length()-1; i >= 0 ; i--)
        {
            printChar(line.charAt(i));
        }
    }

    public static void main(String[] args)
    {

        int variable = 0;
        long hypotinus = 0;
        boolean Staying_in_reverse_program = true,Staying_in_loop = true;
        String Hello="Hi Andrii",line="",text_To_reverse = "",question = "";
        variable = power(5,6);
        printInt(variable);
        printLine("Hi");
        variable = variable % 5;
        Hello = ToUpperCase(Hello);
        hypotinus = hypotinus(3,4);
        printLine("katet A = 3, katet B = 4, hypotinus = "+ hypotinus);


        // #######PART4#######
        /*
        1. Start
        2. I check whether the user agreed to stay in the program, if not, I go to point 8
        3. I explain the principle of operation of the program
        4. I check whether the user agreed to stay in the loop, if not, I go to point 7
        5. I ask the user to write something
        6. I show it in the reverse order
        7. I ask the user if he wants to stay in the program, I go to point 2
        8. end
        */

        while (Staying_in_reverse_program)
        {
            Staying_in_loop = true;
            printLine("Hello, this program will reverse your text and ptrint it back");
            while (Staying_in_loop)
            {
                printLine("print smth that you want to reverse");
                text_To_reverse = Input(text_To_reverse);
                reverse_print(text_To_reverse);
                printLine("\ndo you want to stay in the loop?\n if you want to, print y or Y");
                question = Input(question);
                Staying_in_loop = Stay_or_Go(question);

            }
            printLine("if you want to continue print y or Y, if not you will leave the reverse program");
            question = Input(question);
            Staying_in_reverse_program = Stay_or_Go(question);


        }
        int a=5;
        System.out.println(a/2);

    }


}