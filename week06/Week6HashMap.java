import java.util.HashMap;

public class Week6HashMap {
    
    Week6HashMap()
    {

    }


    void addAndSort (HashMap<Integer,Integer> hashmap, int value)
    {
       //Store the index at where to insert the value
       int indexVal = 0;
       //Iterate through the list to find the value
       for(int i = 0; i < hashmap.size(); ++i)
       {
           //If value in list is lower than value skip to next
           if(hashmap.get(i) < value)
           {
               indexVal = i+1;
               continue;
           }
           //Found value store index and break loop
           indexVal = i;
           break;
       }
       //Insert into list
       hashmap.put(indexVal, value);
        System.out.println(hashmap);
    }

    void swapValues(HashMap<Integer,Integer> hashmap, int value, int secondValue)
    {
        int x = hashmap.get(value);
        int y = hashmap.get(secondValue);

        hashmap.replace(value,y);
        hashmap.replace(secondValue, x);

        System.out.println(hashmap);
    }

    void findValue(HashMap<Integer,Integer> hashmap, int value)
    {
        if(hashmap.containsValue(value))
        {
            for(int i : hashmap.values())
            {
                if(i == value)
                {
                    System.out.println("Value is at key: "+ hashmap.keySet());
                    break;
                } 
            }
        }
        else
            System.out.println(-1);
    }
}
