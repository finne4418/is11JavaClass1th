package chapter08.Exam08_03_03;

class Translation {
    private String[] months = { "睦月", "如月", "弥生", "卯月", "皐月", "水無月", "文月",
                        "葉月", "長月", "神無月", "霜月", "師走" };

    void jpLocalize(int index) {
        if (index > 0 && index < 13)
            System.out.println(months[index - 1]);
        else
            System.out.println("1~12までの値を入力してください");
    }
}
