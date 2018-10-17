package com.shoeheart;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nathan on 8/8/17.
 *
 * Songs are a collection of stanzas stored as a set, meaning each stanza is unique. This model contains the relative
 * chords and lyrics of a song, but not the specific key/capo or order in which the stanzas are sung. This information
 * is stored in an Arrangement.
 */
public class Song {

    public Artist artist;
    public String title;

    public User createdBy;

    public Set<Stanza> stanzas;

    public Song(Artist artist, String title, User createdBy) {
        this.stanzas = new HashSet<>();
    }
}
