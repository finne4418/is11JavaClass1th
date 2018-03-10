package practice;

import java.util.*;

class Stock extends ArrayList<Integer> {
    public void push(int element) {
        if (this.size() < 10) {
            this.add(element);
        } else {
            System.out.println("スタックが満杯です");
        }
    }
    public void pop() {
        if (this.size() > 0) {
            int element = this.get(this.size() - 1);
            System.out.println(element + "を取り出しました");
            this.remove(this.size() - 1);
        } else {
            System.out.println("スタックは空です");
        }
    }
    public void print() {
        for (int i = 0; i < this.size(); i++ ) {
            System.out.println("[" + i + "] " + this.get(i));
        }
    }
}
public class Practice03 {
    private static Stock stock = new Stock();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        title();
    }
    private static void title() {
        System.out.println("0:終了\n1:push\n2:pop\n3:スタックの出力");
        int command = sc.nextInt();
        if (command == 0) {
            System.out.println("プログラムを終了します");
            System.exit(0);
        } else if (command == 1) {
            System.out.println("pushするデータを入力してください");
            stock.push(sc.nextInt());
            System.out.println();
            title();
        } else if (command == 2) {
            stock.pop();
            System.out.println();
            title();
        } else {
            stock.print();
            System.out.println();
            title();
        }
    }
}
