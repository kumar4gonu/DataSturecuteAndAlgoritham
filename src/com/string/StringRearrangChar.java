package com.string;

import java.util.PriorityQueue;

public class StringRearrangChar {
    public static void main(String[] args) {
      String str = "bbbaacc";
      arrang(str);
    }

    public static void arrang(String str){
         int len = str.length();

         int count[] = new int[26];

         for(int i = 0 ;i < len;i++){
             count[str.charAt(i) - 'a']++;
         }



        // PriorityQueue<Key> pq = new PriorityQueue<>(new KeyComparator());
        PriorityQueue<Key> pq = new PriorityQueue<>(new Key());

         for(char c = 'a'; c < 'z';c++){
             int val = c - 'a';
             if(count[val] > 0){
                 pq.add(new Key(count[val], c));
             }
         }

         String result = "";
         Key prev = new Key(-1,'#');
         while(pq.size() !=0){

             Key k = pq.peek();
             pq.poll();
             result = result + k.ch;

             if(prev.freq > 0)
                  pq.add(prev);
             k.freq --;
             prev = k;


         }

        System.out.println(result);
    }
}

