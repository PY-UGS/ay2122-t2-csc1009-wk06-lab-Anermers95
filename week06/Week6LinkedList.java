import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Week6LinkedList {


    Week6LinkedList()
    {
        
    }

    void addAndSort(LinkedList<Integer> linkedList, int value)
    {

        System.out.println(linkedList);
        linkedList.add(value);

        Collections.sort(linkedList);
        System.out.println(linkedList);
    }

    void Swap(LinkedList<Integer> linkedList, int indexOne, int indexTwo)
    {   
        int x = linkedList.get(indexOne);
        int y = linkedList.get(indexTwo);

        linkedList.set(indexOne, y);
        linkedList.set(indexTwo, x);

        System.out.println(linkedList);
    }

    void findValue(LinkedList<Integer> linkedList, int searchVal)
    {
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < linkedList.size(); ++i)
        {
            if(linkedList.get(i) == searchVal)
                temp.add(i);
        }

        if(temp.isEmpty())
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println("The element is found in index(s): "+ temp);
        }
    }



    
}
