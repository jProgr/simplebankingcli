package simplebankingcli;

import java.util.Scanner;
import simplebankingcli.Account;

class Menu
{
    private Scanner consoleInput;

    Menu()
    {
        consoleInput = new Scanner(System.in);
    }

    public void start()
    {
        showWelcome();
        Account account = bootAccount();

        int option = 0;
        while (option != 4)
        {
            showMenu();

            try { option = Integer.parseInt(getUserInput()); }
            catch (NumberFormatException e)
            {
                showError();
                continue;
            }

            interactWithAccount(account, option);
        }

        showFarewell();
    }

    private String getUserInput()
    {
        String name = consoleInput.next();
    }

    private void showWelcome()
    {
        System.out.println("Hello");
        System.out.println("==================");
    }

    private Account bootAccount()
    {
        System.out.println("Open an account with your name: ");

        return new Account(getUserInput());
    }

    private void showMenu()
    {
        System.out.println("Select an option: ");
        System.out.println("==================");

        System.out.println("1 - Check balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");
    }

    private void showError()
    {
        System.out.println("Not a valid option");
    }

    private void showFarewell()
    {
        System.out.println("==================");
        System.out.println("Bye bye");
    }

    private void interactWithAccount(Account account, int option)
    {
        if (option == 1)
        {
            System.out.println("Your balance is: " + account.getBalance());
        }

        if (option == 2)
        {
            System.out.println("Please type an amount to deposit");
        }
    }
}
