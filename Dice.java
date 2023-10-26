package java5;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    // サイコロの数
    public int num = set_dice_num();;
    // サイコロの目の配列
    public int[] roll = new int[this.num];

    // Randomクラスのインスタンス
    private Random rng = new Random();
    // サイコロを振った回数
    public int count = 0;

    // サイコロの目を出力する
    private void print_roll() {
        for (int i : this.roll) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    // サイコロの目がゾロ目か確かめる
    public boolean check_dice() {
        print_roll();
        this.count++;

        for (int roll : this.roll) {
            if (this.roll[0] != roll) {
                return false;
            }
        }

        return true;
    }

    // サイコロの目をシャッフルする
    public void dice_shuffle() {
        for (int i = 0; i < this.num; i++) {
            this.roll[i] = this.rng.nextInt(6) + 1;
        }
    }

    // サイコロの数を入力する
    private static int set_dice_num() {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        while (true) {
            try {
                num = scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("数値を入力してください");
                continue;
            }
        }

        scan.close();

        return num;
    }
}
