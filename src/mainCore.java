public class mainCore {
    MonLyThuyet test1;
    MonThucHanh test2;
    MonDoAN test3;

    public void inputVal() {
        test1 = new MonLyThuyet();
        test2 = new MonThucHanh();
        test3 = new MonDoAN();

        test1.input();
        test2.input();
        test3.input();
    }

    public void outputVal() {
        test1.output();
        test2.output();
        test3.output();
    }

    public static void main(String[] args) {
        mainCore run = new mainCore();
        run.inputVal();
        run.outputVal();
    }
}
