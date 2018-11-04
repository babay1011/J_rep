import java.util.ArrayList;
import java.util.List;

public class Runner {


    public static void main(String[] args) {

        int [] arr = new int[10];
        SomeClass smth = new SomeClass();

        List<Integer> arrList = smth.somethingWithList(arr);

        for (int i=0; i<10; i++){
        System.out.println(smth.getCounter());

    };

}
