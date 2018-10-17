package com.shoeheart;

import java.util.ArrayList;

/**
 * Created by Nathan on 8/8/17.
 *
 * A ChordLine is a Line that solely consists of Chords.
 */
public class ChordLine extends Line {

    private ArrayList<Chord> chords;

    @Override
    public String toString() {
        return "ChordLine{}";
    }
}
