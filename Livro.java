
package com.mycompany.livraria;

public class Livro {
    
    private String title;
    private String author;
    private int pages;
    private String isbn;
    private float price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public void registerBook(String title, String author, int pages, String isbn, float price) {
        
        setTitle(title);
        setAuthor(author);
        setPages(pages);
        setIsbn(isbn);
        setPrice(price);
        
    }
    
    public void showInfos() {
        
        System.out.println("\nTITULO: " + getTitle());
        System.out.println("AUTOR: " + getAuthor());
        System.out.println("PAGINAS: " + getPages());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("PREÇO: " + getPrice() + "\n");
        
    }
    
}
