abstract class human{
    //we cannot create the object of abstract clas
    //if there are abstract method in class the class must be abstract

    public abstract void eat();
    public void walk(){

    }
}
class man extends human{
    // if the class extends abstract class it is compulsory to define all the abstract methods
    //else the current class will become abstract class
    public void eat(){
        System.out.println("man is eating");

    }

}
class woman extends human{
    // if the class extends abstract class it is compulsory to define all the abstract methods
    //else the current class will become abstract class
    public void eat(){
        System.out.println("woman is eating");

    }

}
public class Abstract_class_demo {
    public static void main(String[] args) {
        human obj=new man();
        obj.eat();
        human obj1=new woman();
        obj1.eat();
        
        
    }
    
}
