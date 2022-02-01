// interface have all abstract method where as abstract class may not have
// all abstract methods
//uses of interface 
/*

*/
interface writer{
    void write();

}
class pen implements writer{
    public void write(){
        System.out.println("this is a pen");
    }
}
class pencil implements writer{
    public void write(){
        System.out.println("this is a pencil");
    }
}
class kit {
    public void dosomething(writer p){
        p.write();
    }
}
class interfaces{
    public static void main(String[] args) {
        kit k=new kit();
        pen p=new pen();
        writer pc=new pencil();
        k.dosomething(pc);
        
    }
}