package com.example.we21.palindromechecker;

import android.text.Editable;

/**
 * Created by Asus on 6/4/2017.
 */

public class palidromecheker {

    private String input;

    public palidromecheker(){
        input="";
    }



    public boolean check(String in){
        input = in;
        int i;
        int size=input.length();
        Stack st=new Stack(size);
        for(i=0;i<size;i++){
            st.push(input.charAt(i));
        }
        String r="";

        while(!st.isEmpty()){
            r=r+st.pop();
        }
        return r.equals(input);

    }

}
