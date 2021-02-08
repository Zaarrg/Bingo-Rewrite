package functions;

import java.util.ArrayList;
import java.util.Random;
import main.main;

public class RandomItems {

    public static int getRandomInt(final int min, final int max) {
        final Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static ArrayList<Integer> getRandomNonRepeatingIntegers(final int size, final int min, final int max) {
        final ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (numbers.size() < size) {
            final int random = getRandomInt(min, max);
            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }
        return numbers;
    }


    public static void getRandomItems() {
        items.Items.getItems();
        main.items.clear();
        main.items.addAll(main.itemlist);
        final int size = main.items.size() - 1;
        final ArrayList<Integer> list = getRandomNonRepeatingIntegers(9, 0, size);
        main.b1 = main.items.get(list.get(0));
        main.b2 = main.items.get(list.get(1));
        main.b3 = main.items.get(list.get(2));
        main.b4 = main.items.get(list.get(3));
        main.b5 = main.items.get(list.get(4));
        main.b6 = main.items.get(list.get(5));
        main.b7 = main.items.get(list.get(6));
        main.b8 = main.items.get(list.get(7));
        main.b9 = main.items.get(list.get(8));
        if (RandomEnchantment.Wahrscheinlichkeit > 0.0) {
            RandomEnchantment.randomEnchantment();
        }
        main.randomized = true;
    }

}
