import java.util.*;

public class generics_trial {
    public static void main(String[] args) {
        List<Integer> val=new ArrayList<Integer>();
        val.add(404);
        val.add(609);
        val.add(702);
        Comparator<Integer> c=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10){
                    return 1;
                }else {
                    return -1;
                }

            }
        };
        Collections.sort(val,c);
        Collections.reverse(val);
        Collections.shuffle(val);
        System.out.println(val);
    }
}
