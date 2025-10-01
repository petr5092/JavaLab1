import java.util.*;


public class ArrayNum {
    public static void main(String[] args) {
      double[] data1 = {Math.random(), Math.random()};  
      System.out.println(Arrays.toString(data1));
      Random rand = new Random();
      double[] data2 = {rand.nextDouble(), rand.nextDouble()};  
      System.out.println(Arrays.toString(data2));
      
    }
}
