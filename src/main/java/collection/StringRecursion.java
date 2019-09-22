package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringRecursion {

    public static void main(String[] args) {
        System.out.println("");
        String sequence ="abbccddee";
        char[] sqAry = sequence.toCharArray();
        reverString(sqAry,0,sqAry.length-1);
        frequency(sqAry);
    }

    private static void frequency(char[] sqAry) {
        Map<Character,Integer> hmap = new LinkedHashMap<>();
        for (char x:sqAry) {
            if(hmap.containsKey(x))
            {   int fre = hmap.get(x);
                hmap.put(x,++fre);
            }else {
                hmap.put(x,1);
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = hmap.entrySet().iterator();
        while(it.hasNext()){
            sb.append(it.next());
            System.out.println(sb);
        }
    }

    private static void reverString(char[] sqAry, int i, int j) {
                if(1<=j) {
                    //swap(sqAry,i,j);
                    //reverString(sqAry,i+1,j-1);
                }
    }
}
