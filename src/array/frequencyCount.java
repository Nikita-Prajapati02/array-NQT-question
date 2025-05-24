//Count frequency of each element in the array
package array;

import java.util.HashMap;
import java.util.Map;

public class frequencyCount {
    public static void main(String[] args) {

        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times ");
        }
    }
}
