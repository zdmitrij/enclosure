public class MonkeyArrayGenerator {

    public static Monkey[] monkeyArrayGenerator(int s) {
        Monkey[] monkeyArray = new Monkey[s];
        for (int in = 0; in < s - 1; in++) {
            monkeyArray[in] = new Monkey();
        }
        return monkeyArray;
    }
}