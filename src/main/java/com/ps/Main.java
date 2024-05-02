package com.ps;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Transaction> transactions = new ArrayList<>();
        //Transactions include info such as date,time,amount,type of transaction, description. How do I add time?
        // add the constructor. Add a constructor that will take the value. Use the print writer
        //local date and time would be given in one operator or string and would be seperated by a line.
       transactions.add(new Transaction("2024-30-04", "Birthday Gift", 100.00, "Deposit"));
     transactions.add(new Transaction("2024-01-04", "Math textbook ", -50.00, "Withdrawal"));
 transactions.add(new Transaction("2024-20-04", "Paycheck", 349.00, "Deposit"));
//create a constructor, csv file, fix local date and time,

        //Sample menu to go to options
        System.out.println("Welcome to the Moneywise app ");
        System.out.println("Please your option");
        System.out.println("1.D-Deposit , 2.P-Make a payment , 3.L-View Ledger, 4.E- Exit");
        // providing client options on what they would like to do
        int userINPUT = Integer.parseInt(scanner.nextLine());
        // we would recieved user input.Use switch statement to between options.

        switch (userINPUT) {
            case 1:
                System.out.println(" Please enter your deposit");
                String date = scanner.nextLine();

                System.out.println("Name of deposit");
                String name = scanner.nextLine();

                System.out.println("How much is the deposit: ");
                Double amount = Double.valueOf(scanner.nextLine());

                System.out.println("Please enter debit amount");
                String debitInfo = scanner.nextLine();
                break;

            case 2:
                System.out.println(" Please enter your payment");
                String datepayment = scanner.nextLine();

                System.out.println("Name of payment ");
                String namepayment = scanner.nextLine();

                System.out.println("How much is the payment :  ");
                Double amountpayment = Double.valueOf(scanner.nextLine());

                System.out.println("Please enter debit payment ");
                String debitInfopayment = scanner.nextLine();

                break;

            case 3:
                System.out.println(" Please enter your Ledger information ");

                String dateledger = scanner.nextLine();

                System.out.println("Name of payment on ledger  ");
                String nameledger = scanner.nextLine();

                System.out.println("How much is the payment on ledger  :  ");
                Double amountledger = Double.valueOf(scanner.nextLine());

                System.out.println("Please enter debit ledger");
                String debitInfoledger = scanner.nextLine();
// need to have information to save to csv file



                    System.out.println("testing to see if this prints inside try catch block");
                    File file = new File("transactions.csv");

                    try(FileWriter fileWriter = new FileWriter(file,true);
//                    BufferedWriter bufWriter = new BufferedWriter(new FileWriter("transactions.csv"));
                    PrintWriter printer = new PrintWriter(fileWriter);){
                    printer.println("Date, Name, Amount , DebitInfo \n");
                    // writer our trasnaction
                    for (Transaction transaction : transactions) {

                        ;

                        //provide the current that we are on
                        LocalDate today = LocalDate.now();
                        System.out.println("Today is " + today);

                        LocalTime currentTime = LocalTime.now();
                        System.out.println("The current time is :" + currentTime);

//                        transactions.add(new Transaction("", "Rent", 200.00, "Deposit"));


                        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//2024-04-25 10:25:08
                        //String timestamp = LocalDateTime.now().format(formatter);

                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;



                }


    }

    public static void readTransactionFile() {
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("transactions.csv"));
            //read each line of the file // and is going to add it to an array list
            String line;
            while ((line = bufReader.readLine()) != null) {
                // create array type string // this is called escape character \\
                String[] splitLine = line.split("\\|");

                //this will read the date from the file and put it into the array list
                // array is called splitline
                LocalDate date = LocalDate.parse(splitLine[0]);
                LocalTime time = LocalTime.parse(splitLine[1]);
                String name = splitLine[2];
                Double amount = Double.parseDouble(splitLine[3]);
                String debitInfo = splitLine[4];

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
