package hello.dooing;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

public class DoSomething {

    public void hello() {
        out.println("hello");
        out.println("hello2");
        out.println("hello3");
        out.println("bug fix!!");
        out.println("bug fix 2!!");
    }

    public static void main(String[] args) {
        out.println("args = " + args);
        final List<Integer> list = List.of(1, 2, 3);
        final ArrayList<Integer> integers = new ArrayList<>(list);
        out.println("integers = " + integers);
    }
}
