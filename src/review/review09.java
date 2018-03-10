package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class review09 {
    public static void main(String[] args) {
        String[] subjects = { "プログラミング", "ネットワーク", "資格対策" };

        List<TestScore> scores = new ArrayList<>();

        for (String subject : subjects) {
            System.out.println(subject + "の点数を入力してください");
            scores.add(new TestScore(subject, inputScore()));
        }

        double gpa = 0;
        // tabを可変長にすればきれいに出力できるが、そこまでしない。
        for (TestScore score : scores) {
            System.out.println(score.getSubject() + "\t" + score.getRank());
            gpa += score.getGPA();
        }
        System.out.println("GPA\t" + gpa / scores.size());
    }

    private static int inputScore() {
        // 呼ばれるたびにインスタンス化するのはちょっと微妙な気がするけど気にしない
        Scanner sc = new Scanner(System.in);
        while (true) {
            int score = sc.nextInt();

            if (score >= 0 && score <= 100) {
                return score;
            }
            else {
                System.out.println("範囲外です");
            }
        }
    }
}

class TestScore {
    private String subject;
    private char rank;

    TestScore(String subject, int score) {
        this.subject = subject;
        setRank(score);
    }

    private void setRank(int score) {
        rank = score >= 90 ? 'S' :
               score >= 80 ? 'A' :
               score >= 70 ? 'B' :
               score >= 60 ? 'C' : 'D';
    }

    public String getSubject() {
        return subject;
    }

    public char getRank() {
        return rank;
    }

    public int getGPA() {
        return rank == 'S' ? 4 :
               rank == 'A' ? 3 :
               rank == 'B' ? 2 :
               rank == 'C' ? 1 :
               rank == 'D' ? 0 : -1; //-1 is never used
    }
}