package lab21;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = new ArrayList<>(list1);
        List<String> list3 =  Arrays.asList("L", "I", "S","T3");
        list2.add(String.valueOf(list3));
        System.out.println(list2);
        list2.sort();
    }
}
