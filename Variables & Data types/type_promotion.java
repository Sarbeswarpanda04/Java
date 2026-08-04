public class type_promotion {
    public static void main(String[] args) {
        //Java Auto promptes each byte, short, or char to int
        char a = 'a';
        char b  = 'b';
        System.out.println("a : "+(int)a);
        System.out.println("b : "+(int)b);
        System.out.println("b - a : "+(b-a)); // only works on expression
        System.out.println(a);

        
    }
}
