package com.sg.onlinetest;

public class BrutForceIndex {

    public static void main(String[] args) {
        String[] first= new String[]{"a","b","c","d","f","d","e"};
        String[] secound = new String[]{"f","d"};
        int x = findIndex(first,secound);
        System.out.println(x);

    }
    static int findIndex(String[] first, String[] secount){
        int i=0;int j=0;
        int index=99;
        boolean indexValue = false;
            while(i< first.length && j<secount.length ){
                if(first[i] == secount[j]&& j<=i){
                    //if(!indexValue){
                       // indexValue=true;
                        index=i;
                   // }
                    i++;j++;
                }else{
                    i++;
                    j=0;
                    index=99;
                    indexValue =false;
                }
            }
        return index;
    }
}
