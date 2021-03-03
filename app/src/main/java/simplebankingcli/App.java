package simplebankingcli;

import java.util.Scanner;
import simplebankingcli.Account;

public class App
{
    public static void main(String[] args)
    {
        System.out.println("OwO");
        System.out.println("Type something");

        Scanner consoleInput = new Scanner(System.in);
        String userInput = consoleInput.next();

        System.out.println("You wrote: " + userInput);
    }
}
