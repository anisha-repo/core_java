//program which shows the use of HashSet and iterator
import java.util.*;
public class HS_Hashset {
    public static void main(String[] arg)
    {
        //creation of HashSet to store String
        HashSet<Integer> hs = new HashSet<>();
        
        //store some string elements
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);

        //view the HashSet

        System.out.println("hash Set="+hs);

        //add an iterator to hs.

        Iterator it = hs.iterator();
        
       // display element by element by using iterator
       System.out.println("element using iterator:-");
       while(it.hasNext())
       {
            Integer t =(int)it.next();
            System.out.println(t);
       }


    }
}
