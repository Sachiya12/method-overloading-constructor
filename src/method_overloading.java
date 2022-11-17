public class method_overloading {

    static int life(){
        int n=12345;
        System.out.println(n);
        return n;

    }
    static void life(int x,String y){
        x = 54;
        y="abc";
        System.out.println(x+" and "+y);

    }
    static void life(String b){
        b="54abc";
        System.out.println(b);

    }
    static void life(double m){
        m =3.89;
        System.out.println(m);

    }
    public static void main(String[] args) {
        life();
        life(25,"ggg");
        life("hjjhj");
        life(2.2);

    }
}
