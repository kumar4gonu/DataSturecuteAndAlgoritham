package com.string;

import java.util.Comparator;

public class Key implements Comparator<Key>{
    int freq;
    char ch;
    public Key(int freq, char ch){
        this.ch = ch;
        this.freq = freq;
    }

    Key(){}
    public int compare(Key k1, Key k2){
        if(k1.freq < k2.freq)
            return 1;
        else if(k1.freq > k2.freq)
            return -1;
        else
            return 0;
    }
}
