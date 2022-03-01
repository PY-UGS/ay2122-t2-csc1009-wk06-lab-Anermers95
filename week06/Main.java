import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        int max = 9999;
        int min = 1000;
        int random_int = 0;
        Week6LinkedList wk6ll = new Week6LinkedList();
        Week6HashMap wk6hm = new Week6HashMap();
        
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(1,3,5,7,9,11));
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hm2 = new HashMap<Integer,Integer>();
        
        //Linked list
        wk6ll.addAndSort(linkedList, 1);
        wk6ll.Swap(linkedList, 0, linkedList.size()-1);
        
        for(int i = 0 ; i < 500; ++i)
        {
            random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            linkedList2.add(random_int);
            System.out.print(random_int + ",");
        }
        random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        wk6ll.findValue(linkedList2, random_int);

        //HashMap
        hm.put(0, 1);
        hm.put(1, 3);
        hm.put(2, 5);
        hm.put(3, 7);
        hm.put(4, 9);
        hm.put(5, 11);

        wk6hm.addAndSort(hm,6);
        wk6hm.swapValues(hm, 0, 5);
        
        for(int i = 0 ; i < 500; ++i)
        {
            random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            //random_int = 5;
            hm2.put(i,random_int);
            System.out.print(random_int + ",");
        }
        random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        wk6hm.findValue(hm2, random_int);


      


        




        
    }
    
}