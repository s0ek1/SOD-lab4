package main;

import tree.Tree;
import ui.UI;
import ui.UIProcessor;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        UI ui = new UIProcessor();
        Tree<Integer> tree = new Tree<>();
        loop:
        while (true) {
            menu();
            int opt = sc.nextInt();
            switch (opt) {
                case 0 -> {break loop;}
                case 1 -> ui.randomFillTree(tree, 100_000);
                case 2 -> ui.randomFillTree(tree, 1_000_000);
            }
        }
    }

    private void menu() {
        System.out.print("""
                            Выберите пункт из меню:
                            [0] - Завершити програму.
                            [1] - Заполнить: 10^5.
                            [1] - Заполнить: 10^6.
                         :""");
    }
}
