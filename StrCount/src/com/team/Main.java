package com.team;

import java.io.Console;
import java.util.*;

public class Main {

    public static void main(String[] args) {
     Scanner st = new Scanner(System.in);
     String a= "";
        String b="sdkjhgak";
        int stroks=0;
        int symbs=0;
        int words=0;
        while(!a.equals(".")){
            a = st.nextLine();
            stroks++;
            symbs+=a.length();
            for(int i=1; i<(a.length()-1);i++){
                if(a.charAt(i)==' '){
                    words++;
                }
            }
        }

        System.out.println("Strings: "+(stroks-1));
        System.out.println("Symbols: "+(symbs-1));
        System.out.println("Words: "+(words+stroks-1));
    }
    }
