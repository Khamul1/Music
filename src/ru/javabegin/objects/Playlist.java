package ru.javabegin.objects;

import ru.javabegin.intefaces.IPlaylist;
import ru.javabegin.intefaces.ISong;

import java.util.ArrayList;

public class Playlist implements IPlaylist {

    private ArrayList<ISong> songList = new ArrayList<>(); // сразу создаем пустая коллекция для хранения

    @Override
    public void addSong(ISong song) {
        songList.add(song);
    }

    @Override
    public void playAllSongs() {

        for (ISong song : songList){ // проигрывает все песни  в цикле
            song.play();
        }
    }

    @Override
    public ArrayList<ISong> getSongList() {
        return songList;
    }

}

