package com.shoeheart;

import java.util.LinkedList;

/**
 * Created by Nathan on 8/8/17.
 */
public class Playlist {

    //todo review schema, maybe create placeholder model with position-song pairs

    public String title;
    private LinkedList<Song> songs;

    public Playlist(String title) {
        this.title = title;
        songs = new LinkedList<>();
    }

    public void addSong(Song song) {
        songs.addLast(song);
    }

    public void insertSong(Song song, int pos) {
        if (pos >= songs.size()) {
            songs.addLast(song);
        } else if (pos <= 0) {
            songs.addFirst(song);
        } else {
            songs.add(pos, song);
        }
    }

    public void swap(int pos1, int pos2) {
        if (!(pos1 > songs.size() || pos1 < 0 || pos2 > songs.size() || pos2 < 0)) {

        }

        //todo real code should throw an exception
    }
}
