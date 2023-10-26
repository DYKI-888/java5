package java5;

public class Main {
    public static void main(String[] args) {
        // Diceクラスのインスタンス
        Dice dice = new Dice();

        boolean check = false;

        while (!check) {
            dice.dice_shuffle();

            check = dice.check_dice();
        }

        System.out.println("ゾロ目が出るまでサイコロを" + dice.count + "回振りました");
    }
}
