public class StartProgramm {
    public static void main(String[] args) {
        Monkey[] ma = MonkeyArrayGenerator.monkeyArrayGenerator(10);
        System.out.println(ma.toString());
        MoveAndCloseDetection.moverAndDetector(ma);
    }
}
