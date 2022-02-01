public class thow_exception {
    int a =10;
    int b=0;
    public void divide() {
        if (b == 0) {
            throw new ArithmeticException("cannot divide by 0");
        } else {
            System.out.println("can divide");
        }
    }
    public static void main(String[] args) {

        thow_exception t=new thow_exception();
        try{
            t.divide();
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
