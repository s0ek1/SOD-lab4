package ui;
import tree.Tree;
import java.util.Random;
public class UIProcessor implements UI {
    Random random = new Random();
    @Override
    public void randomFillTree(Tree<Integer> tree, int num) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            tree.add(random.nextInt(-num, num));
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Времени затрачено: " + time + " миллисекунд");
        System.out.println("Висота дерева: "+tree.getHeight());
        System.out.println();
    }
}
