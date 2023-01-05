public class MoveAndCloseDetection {
    public static int moveX(int x, int randomStart, int randomEnd) {
        boolean runX = true;
        int coordinateX = x;
        int randomNumberX = randomStart + (int) Math.random() * randomEnd;
        coordinateX += randomNumberX;
        return coordinateX;
    }

    public static int moveY(int y, int randomStart, int randomEnd) {
            boolean runY = true;
            int coordinateY = y;
            int randomNumberY = randomStart + (int) Math.random() * randomEnd;
            coordinateY += randomNumberY;
            return coordinateY;
    }

    public static void moverAndDetector(Monkey[] array) {
        while (true) {
        for (int index = 0; index < array.length; index++) {
            array[index].setX(moveX(array[index].getX(), 0, 3));
            array[index].setY(moveY(array[index].getY(), 0, 3));
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int closeIs = (int) (Math.sqrt(Math.pow(array[j].getX() - array[i].getX(), 2)
                + Math.pow(array[j].getY() - array[i].getY(), 2)));
                if (closeIs <= 1) {
                System.out.println("Monkeys with indexes " + i + " and " + j + " close is " + closeIs);
                }
            }
        }
        }
    }
}