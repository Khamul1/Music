package ru.javabegin.intefaces;

import ru.javabegin.objects.Song;

import java.util.ArrayList;

public interface IPlaylist {

    // методы-свойства
    ArrayList<ISong> getSongList();

    void addSong(ISong song);
    void playAllSongs();
}
