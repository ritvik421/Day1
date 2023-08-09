class Check {

}
class Calculator {
    int num =5 ;
    public int add(int n1,int n2){
        return n1+n2 ;
    }
}
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int num1 = 7,num2=8 ;
        Calculator obj= new Calculator() ;
        Calculator obj1= new Calculator() ;
        obj1.num= 22 ;
        int res=obj.add(num1,num2) ;
        System.out.println(res) ;
        System.out.println(obj.num) ;
        System.out.println(obj1.num) ;
        String a_string = "Ritvik" ;
        System.out.println("My name is "+ a_string);
    }
}