import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class stud{
    int rollno,marks;
    String name;
    public stud(int rollno,int marks,String name){
        super();
        this.rollno=rollno;
        this.marks=marks;
        this.name=name;
    }
}
public class student_demo {
    public static void main(String[] args) {
        List<stud> studs=new ArrayList<>();
        studs.add(new stud(1,56,"yuvan"));
        studs.add(new stud(2,90,"rahul"));
        studs.add(new stud(3,45,"Rahul"));
        studs.add(new stud(4,23,"Nivit"));
        studs.add(new stud(5,87,"Ram"));

        for (stud s: studs){
            System.out.println(s.name);
        }
    }
}
