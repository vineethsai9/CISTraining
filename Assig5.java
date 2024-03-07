class praveen{
    void vi(){
        System.out.println("hello");
    }
}
class karthik extends praveen{
    void ka(){
        System.out.println("hello1");
    }
}
class pavanbhai extends karthik{
    void bhai(){
        System.out.println("hello3");
    }
}
public class Assig5 {
    public static void main(String[] args) {
        pavanbhai p=new pavanbhai();
        p.bhai();
        p.ka();
        p.vi();
    }
}
