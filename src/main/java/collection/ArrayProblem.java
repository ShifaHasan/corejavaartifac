package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayProblem {

    public static void main(String[] args) {
        System.out.println("Allah is enough");
        int[] a ={3,2,1,2,3};
        firstElementRepeat(a);
    }

    private static void firstElementRepeat(int[] a) {
        Map<Integer,Integer> store = new LinkedHashMap<>();//order should be maintian.
        int i=0;
        while(i<a.length){
            if(store.containsKey(a[i])){
                int value =store.get(a[i]); //(get the value amd set a -ve if first time it get repeat, for next time we ignore as we've alreay find  )
                if(value >=0 )
                store.put(a[i],-(value));
            }else{
                store.put(a[i],i+1); //store index value start from 1,
                // as mark +ve for first time finding, if get repeat(duplicate) then -ve after that ignore.

            }
            i++;
        }
        System.out.println(store);
        int value = store.entrySet().stream().
                filter(x->x.getValue()<0).
                map(y->y.getKey()).findFirst().get();
        System.out.println(value);
    }
}
