
public class exception_handling {
    public static void main(String[] args) {
        try{
            int []a=new int [6];
            a[9]=9;

            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("caused an arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("caused an out of bounds exception");
        }
        catch (Exception e){
            System.out.println("Unknown Exception");
        }
        finally{
            System.out.println("have a nice day");
        }
        
        
    }
    
}
