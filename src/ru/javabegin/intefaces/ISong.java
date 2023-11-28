package ru.javabegin.intefaces;

import ru.javabegin.objects.Author;

public interface ISong {

    String getName();
    Author getAuthor();

    void play();
}
