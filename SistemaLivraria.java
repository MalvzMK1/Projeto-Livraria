
package com.mycompany.livraria;

import java.util.Scanner;

public class SistemaLivraria {
    
    public static void main(String args[]) {
        Livro objBook = new Livro();
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.println("\nESCOLHA UMA OPÇÃO");
            System.out.println("1 - CADASTRAR LIVRO");
            System.out.println("2 - EXIBIR DADOS DO LIVRO");
            System.out.println("3 - SAIR\n");
            byte option = scan.nextByte();
            
            switch(option) {
                case 1: 
                    System.out.println("DIGITE UM TÍTULO: ");
                    String title = scan.next();
                    System.out.println("\nNOME DO AUTOR: ");
                    String author = scan.next();
                    System.out.println("\nNUMERO DE PÁGINAS: ");
                    int pages = scan.nextInt();
                    System.out.println("\nISBN: ");
                    String isbn = scan.next();
                    System.out.println("\nPREÇO DO LIVRO: ");
                    float price = scan.nextFloat();

                    objBook.registerBook(title, author, pages, isbn, price);
                    break;
                    
                case 2:
                    objBook.showInfos();
                    break;
                
                case 3:
                    System.out.println("Obrigado por usar o sistema :D");
                    System.exit(0);
                    
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
                    
            }
            System.out.println("Deseja continuar? [S/N]");
            String op = scan.next();
            if(op.equals("N")) {
                System.exit(0);
            }
        }
    }
}