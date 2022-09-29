import java.lang.reflect.Method;

public class Main  {
    public static void main(String[] args) {
        greater g = (int a, int b) -> {
            if (a > b)
                return true;
            else
                return false;
        };
        concatenation c = (String a, String b) -> a + b;
        increment i = (int a) -> ++a;
        convertupper u = (String a) -> a.toUpperCase();
        System.out.println(c.concatMethod("hello", "world"));

        System.out.println(g.max(5, 6));

        System.out.println(i.incrementMethod(5));

        System.out.println(u.convertMethod("hello"));

    }
}
interface concatenation {
    String concatMethod(String a, String b);
}
interface greater {
    boolean max(int a, int b);
}
interface increment {
    int incrementMethod(int a);
}
interface convertupper {
    String convertMethod(String a);
}



