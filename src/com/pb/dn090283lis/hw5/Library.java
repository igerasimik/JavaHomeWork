package com.pb.dn090283lis.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Приключения", "Иванов И. И.", 2000);
        books[1] = new Book("Словарь", "Сидоров А. В", 1980);
        books[2] = new Book("Энциклопедия", "Гусев К. В.", 2010);
        Reader n789 = new Reader();
        Reader[] allReaders = new Reader[3];
        n789.setCallNumber("098297726");
        n789.setDateOfBirth("09.02.1983");
        n789.setFullName("Петров В.В.");
        n789.setFaculty("Финансовый");
        n789.setNumberLibraryCard("007");
        allReaders[0] = n789;
        allReaders[1] = new Reader();
        allReaders[2] = new Reader();
        allReaders[1].setFullName("Рудянова Т.Н.");
        allReaders[2].setFullName("Баранова В.В.");

        System.out.println("Все читатели:");
        for (int i = 0; i < allReaders.length; i++)
            System.out.println(allReaders[i].toString());

        System.out.println("\nВсе книги:");
        for (int i = 0; i < books.length; i++)
            System.out.println(books[i].toString());

        System.out.println("\ntakeBook(int num)");
        allReaders[0].takeBook(3);

        System.out.println("\ntakeBook(String ... ars)");
        allReaders[0].takeBook("Приключения", "Словарь", "Энциклопедия");

        System.out.println("\ntakeBook(Book ... books)");
        allReaders[0].takeBook(books)
        ;

        System.out.println("\nreturnBook(int num)");
        allReaders[0].returnBook(3);

        System.out.println("\nreturnBook(String ... ars)");
        allReaders[0].returnBook("Приключения", "Словарь", "Энциклопедия");

        System.out.println("\nreturnBook(Book ... books)");
        allReaders[0].returnBook(books)
        ;
    }
}

