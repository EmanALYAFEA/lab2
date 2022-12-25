import java.util.ArrayList;
import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        Random random = new Random();
        A.add(11);
        A.add(12);
        A.add(13);
        A.add(14);
        A.add(15);
        A.add(16);
        A.add(17);
        A.add(18);
        int removedIndex;
        while (!A.isEmpty())
        {
            removedIndex=random.nextInt(A.size());
            System.out.println(A);
            A.remove(removedIndex);}}}