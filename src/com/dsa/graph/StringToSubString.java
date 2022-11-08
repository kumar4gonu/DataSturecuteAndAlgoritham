package com.dsa.graph;

public class StringToSubString {
    public static void main(String[] args) {
        String[] arr1 = { "for", "geek","rig", "kaf" };
        int len = arr1.length;

        for(int i=0;i< len;i++){
            String st = arr1[i];

            System.out.println(st.charAt(0));
            System.out.println(st.charAt(st.length() -1 ));
           // System.out.println('a');
            System.out.println(st.charAt(0) - 'a');
            System.out.println(st.charAt(st.length() -1 ) - 'a');

            System.out.println("-------------------------");
        }

    }
}
