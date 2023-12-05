package application;

import model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE O NUMERO DA CONTA");
        int number = sc.nextInt();
        System.out.println("NOME DO TITULAR DA CONTA");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("INICIAL BALANCE");
        double balance = sc.nextDouble();
        System.out.println("LIMITE DE SAQUE");
        double withdrawLimit = sc.nextDouble();
        Account acc = new Account(number, holder,balance,withdrawLimit);
        System.out.println();
        System.out.println("informe a quantia de saque");
        double amount= sc.nextDouble();
        acc.withdraw(amount);
        System.out.println("NOVO SALDO " + acc.getBalance());
        try{
            acc.withdraw(amount);
            System.out.printf("novo saldo %.2f " , acc.getBalance());
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


        sc.close();
    }
}
