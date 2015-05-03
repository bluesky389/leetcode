import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhezhe Chen on 5/2/2015.
 */
public class test {
  public static void main(String args[])
  {
    System.out.println("Hello World");
    method();
  }

  public static void method() {
    System.out.println("test method");
    List<Integer> integers = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      integers.add(i);
    }

    System.out.print(integers);
  }
}
