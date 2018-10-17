package com.shoeheart;

/**
 * Created by Nathan on 8/8/17.
 *
 * A line represents, well, one line of a stanza in a song. This is implemented in three ways:
 *  ChordLine - a line solely consisting of chords
 *  LyricLine - a line solely consisting of lyrics
 *  ChordLyricsLine - a line with lyrics that have chords associated to them
 *
 * The three of these implementations include different structures, but function to store their contents so that they
 * may be flexibly output to displays.
 */
public abstract class Line {
    public abstract String toString(); //this may need to be replaced by some other outputting strategy in the future
}
