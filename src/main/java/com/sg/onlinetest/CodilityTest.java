package com.sg.onlinetest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CodilityTest {

    public static void main(String[] args) {
        System.out.println("Allah is enough");


    }

    public int solution(int[] A) {
        // code in Java SE 8
        int len = A.length;
        int min1 = A[0];
        int min2 = A[1];
        int min3 = A[2];
        int pos1 = 0;
        int pos2 = 1;
        int pos3 = 2;
        if(min1>min2){
            swap(A,min1,min2);
            int tempPos = pos1;
            pos1 =pos2;
            pos2 =tempPos;

        }
        if(min2>min3){
            swap(A,min2,min3);
            int tempPos = pos2;
            pos2 =pos3;
            pos3 =tempPos;
        }
        if(min1>min2){
            swap(A, min1,min2);
            int tempPos = pos1;
            pos1 =pos2;
            pos2 =tempPos;
        }
        //Now we have ordered mins: min1 <= mins <= min3
        for(int p=3; p<len; p++){
            if(min1 > A[p]){
                min1 = A[p];
                pos1 = p;
            } else if(min2 > A[p]){
                min2 = A[p];
                pos2 = p;
            } else if(min3 > A[p]){
                min3 = A[p];
                pos3 = p;
            }
        }

        //We kept ordered mins: min1 <= mins <= min3
        if(Math.abs(pos1-pos2) == 1){
            return min1+min3;
        }else{
            return min1+min2;
        }
    }

    void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] =a[y];
        a[y]=temp;

    }
}




/*String text ="We test coders. Give us a try";
        //String text ="Forget  CVs..Save time . x x";
        String[] sb = text.split("\\.");
        int i=0;
        Map<Integer,String> treeMap = new TreeMap<>();
        while(i<= sb.length-1){
            String singleSentance = sb[i].trim();
            singleSentance  =singleSentance.replace(".","");
            singleSentance =singleSentance.replace("  "," ");
            String[] words  = singleSentance.split(" ");
            treeMap.put(words.length,singleSentance);
           i++;
        }
        Integer lagestWords =((TreeMap<Integer, String>) treeMap).lastEntry().getKey();*/
