package ru.javabegin;

import ru.javabegin.objects.Author;
import ru.javabegin.objects.Playlist;
import ru.javabegin.objects.Song;

public class Main {
    public static void main(String[] args) {

        // список авторов
        Author author1 = new Author("Чайковский");
        Author author2 = new Author("Вивальди");
        Author author3 = new Author("Киркоров");
        Author author4 = new Author("Sting");
        Author author5 = new Author("Queen");

        // список песен с авторами
        Song song1 = new Song("Щелкунчик", author1);
        Song song2 = new Song("Лебединое озеро", author2);
        Song song3 = new Song("Времена года", author3);
        Song song4 = new Song ("Цвет настроения синий", author4);
        Song song5 = new Song("Shape of My Heart", author5);
        Song song6 = new Song("Show must go on", author5);
        Song song7 = new Song("We will rock you", author5);

        // заполняем плейлист
        Playlist playlist = new Playlist();
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);
        playlist.addSong(song6);
        playlist.addSong(song7);

        // проиграть все песни

        playlist.playAllSongs();
    }
}