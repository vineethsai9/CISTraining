class praveen1{
    void vi(){
        System.out.println("hello");
    }
}
class karthik1 extends praveen1{
    void ka(){
        System.out.println("hello1");
    }
}
class pavanbhai1 extends praveen1{
    void bhai(){
        System.out.println("hello3");
    }
}
public class Assig51 {
    public static void main(String[] args) {
        pavanbhai1 p=new pavanbhai1();
        p.bhai();
        p.ka();
        p.vi();
    }
}
