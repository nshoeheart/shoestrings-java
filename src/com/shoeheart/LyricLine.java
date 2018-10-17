package com.shoeheart;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nathan on 8/8/17.
 *
 * A LyricLine is a Line that solely consists of Lyrics
 */
public class LyricLine extends Line {

    private ArrayList<String> lyrics;

    @Override
    public String toString() {
        StringBuilder line = new StringBuilder();

        for (int i = 0; i < lyrics.size(); i++) {
            line.append(lyrics.get(i));

            if (i < lyrics.size() - 1) {
                line.append(" ");
            }
        }

        return line.toString();
    }

    public LyricLine() {
        lyrics = new ArrayList<>();
    }

    public LyricLine(String line) {
        this.lyrics = new ArrayList<>();
        parseLyrics(line);
    }

    public void editLyrics(String line) {
        lyrics.clear();
        parseLyrics(line);
    }

    private void parseLyrics(String line) {
        lyrics.addAll(Arrays.asList(line.split(" +")));
    }
}
