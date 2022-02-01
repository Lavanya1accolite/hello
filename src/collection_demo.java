import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class collection_demo {
    public static void main(String[] args) {
        Collection value=new ArrayList();
        value.add(4);
        value.add(6);
        value.add(30);
        System.out.println(value);
        Iterator it=value.iterator();
        System.out.println(it.next());
        List val=new ArrayList();
        val.add(4);
        val.add(6);
        val.add(30);

        for (int i=0;i<val.size();i++){
            System.out.println(val.get(i));
        }
        //or
        for (Object o:val){
            System.out.println(o);
        }
        ArrayList a=new ArrayList();
        a.add(5);
        a.add(6);
        a.add(10);
        System.out.println(a.get(0));
    }
    
}
