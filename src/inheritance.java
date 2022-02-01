class Calculator{
    public int add(int i,int j){
        return i+j;
    }
}
class CalcAdv extends Calculator{
    public int sub(int i,int j){
        return Math.abs(i-j);
    }
}
class VCalc extends CalcAdv{
    public int mul(int i,int j){
        return i*j;
    }
}

public class inheritance {
    public static void main(String[] args){
        CalcAdv c1=new CalcAdv();
        int result=c1.add(2, 3);
        System.out.println(result+" "+c1.sub(7, 3));
    }
}
