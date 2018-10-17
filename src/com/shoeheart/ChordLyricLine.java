package com.shoeheart;

/**
 * A ChordLyricLine is a line of lyrics which is annotated by one or more chords. These chords are specifically
 * associated with a particular lyric to allow for flexibility when the line is output to a display.
 */
public class ChordLyricLine extends Line {
    @Override
    public String toString() {
        return "ChordLyricLine{}";
    }
}
