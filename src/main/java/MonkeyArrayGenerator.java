public class MonkeyArrayGenerator {

    public static Monkey[] monkeyArrayGenerator(int s) {
        Monkey[] monkeyArray = new Monkey[s];
        for (int in = 0; in < monkeyArray.length; in++) {
            monkeyArray[in] = new Monkey();
            System.out.println("TEST Generated monkey in array with index " + in + " x is "
                    + monkeyArray[in].getX() + " y is " + monkeyArray[in].getY());
        }
        return monkeyArray;
    }
}