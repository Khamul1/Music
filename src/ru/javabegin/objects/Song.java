package ru.javabegin.objects;

import ru.javabegin.intefaces.ISong;

public class Song implements ISong {

    public Song() {
    }
    private String name; // название песни
    private Author author; // автор песни (ссылка на объект)

    public Song(String name, Author author) {
        this.name = name;
        this.author = author;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println(String.format("Играет песня: %s, автор: %s", name, author.getName()));
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
