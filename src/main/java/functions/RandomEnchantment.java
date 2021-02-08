package functions;

import org.bukkit.enchantments.Enchantment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import main.main;

public class RandomEnchantment {

    static List<Enchantment> possibleb1;
    static List<Enchantment> possibleb2;
    static List<Enchantment> possibleb3;
    static List<Enchantment> possibleb4;
    static List<Enchantment> possibleb5;
    static List<Enchantment> possibleb6;
    static List<Enchantment> possibleb7;
    static List<Enchantment> possibleb8;
    static List<Enchantment> possibleb9;
    public static double Wahrscheinlichkeit;

    static {
        RandomEnchantment.possibleb1 = new ArrayList<Enchantment>();
        RandomEnchantment.possibleb2 = new ArrayList<Enchantment>();
        RandomEnchantment.possibleb3 = new ArrayList<Enchantment>();
        RandomEnchantment.possibleb4 = new ArrayList<Enchantment>();
        RandomEnchantment.possibleb5 = new ArrayList<Enchantment>();
        RandomEnchantment.possibleb6 = new ArrayList<Enchantment>();
        RandomEnchantment.possibleb7 = new ArrayList<Enchantment>();
        RandomEnchantment.possibleb8 = new ArrayList<Enchantment>();
        RandomEnchantment.possibleb9 = new ArrayList<Enchantment>();
        RandomEnchantment.Wahrscheinlichkeit = 0.0;
    }

    public static double Wahrscheinlichkeit() {
        final double r = RandomEnchantment.Wahrscheinlichkeit + 0.05;
        final double f = Math.round(r * 100.0) / 100.0;
        return RandomEnchantment.Wahrscheinlichkeit = f;
    }

    public static String InProzent() {
        final double p = RandomEnchantment.Wahrscheinlichkeit * 100.0;
        final int k = (int)p;
        final String f = String.valueOf(k) + "%";
        return f;
    }

    public static void randomEnchantment() {
        Enchantment[] values;
        for (int length = (values = Enchantment.values()).length, i = 0; i < length; ++i) {
            final Enchantment ench = values[i];
            if (ench.canEnchantItem(main.b1)) {
                RandomEnchantment.possibleb1.add(ench);
            }
            if (ench.canEnchantItem(main.b2)) {
                RandomEnchantment.possibleb2.add(ench);
            }
            if (ench.canEnchantItem(main.b3)) {
                RandomEnchantment.possibleb3.add(ench);
            }
            if (ench.canEnchantItem(main.b4)) {
                RandomEnchantment.possibleb4.add(ench);
            }
            if (ench.canEnchantItem(main.b5)) {
                RandomEnchantment.possibleb5.add(ench);
            }
            if (ench.canEnchantItem(main.b6)) {
                RandomEnchantment.possibleb6.add(ench);
            }
            if (ench.canEnchantItem(main.b7)) {
                RandomEnchantment.possibleb7.add(ench);
            }
            if (ench.canEnchantItem(main.b8)) {
                RandomEnchantment.possibleb8.add(ench);
            }
            if (ench.canEnchantItem(main.b9)) {
                RandomEnchantment.possibleb9.add(ench);
            }
        }
        final Random rand = new Random();
        final boolean val1 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
        final boolean val2 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
        final boolean val3 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
        final boolean val4 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
        final boolean val5 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
        final boolean val6 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
        final boolean val7 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
        final boolean val8 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
        final boolean val9 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
        if (RandomEnchantment.possibleb1.size() >= 1 && val1) {
            Collections.shuffle(RandomEnchantment.possibleb1);
            final Enchantment chosen = RandomEnchantment.possibleb1.get(0);
            main.b1.addEnchantment(chosen, 1 + (int)(Math.random() * (chosen.getMaxLevel() - 1 + 1)));
        }
        if (RandomEnchantment.possibleb2.size() >= 1 && val2) {
            Collections.shuffle(RandomEnchantment.possibleb2);
            final Enchantment chosen = RandomEnchantment.possibleb2.get(0);
            main.b2.addEnchantment(chosen, 1 + (int)(Math.random() * (chosen.getMaxLevel() - 1 + 1)));
        }
        if (RandomEnchantment.possibleb3.size() >= 1 && val3) {
            Collections.shuffle(RandomEnchantment.possibleb3);
            final Enchantment chosen = RandomEnchantment.possibleb3.get(0);
            main.b3.addEnchantment(chosen, 1 + (int)(Math.random() * (chosen.getMaxLevel() - 1 + 1)));
        }
        if (RandomEnchantment.possibleb4.size() >= 1 && val4) {
            Collections.shuffle(RandomEnchantment.possibleb4);
            final Enchantment chosen = RandomEnchantment.possibleb4.get(0);
            main.b4.addEnchantment(chosen, 1 + (int)(Math.random() * (chosen.getMaxLevel() - 1 + 1)));
        }
        if (RandomEnchantment.possibleb5.size() >= 1 && val5) {
            Collections.shuffle(RandomEnchantment.possibleb5);
            final Enchantment chosen = RandomEnchantment.possibleb5.get(0);
            main.b5.addEnchantment(chosen, 1 + (int)(Math.random() * (chosen.getMaxLevel() - 1 + 1)));
        }
        if (RandomEnchantment.possibleb6.size() >= 1 && val6) {
            Collections.shuffle(RandomEnchantment.possibleb6);
            final Enchantment chosen = RandomEnchantment.possibleb6.get(0);
            main.b6.addEnchantment(chosen, 1 + (int)(Math.random() * (chosen.getMaxLevel() - 1 + 1)));
        }
        if (RandomEnchantment.possibleb7.size() >= 1 && val7) {
            Collections.shuffle(RandomEnchantment.possibleb7);
            final Enchantment chosen = RandomEnchantment.possibleb7.get(0);
            main.b7.addEnchantment(chosen, 1 + (int)(Math.random() * (chosen.getMaxLevel() - 1 + 1)));
        }
        if (RandomEnchantment.possibleb8.size() >= 1 && val8) {
            Collections.shuffle(RandomEnchantment.possibleb8);
            final Enchantment chosen = RandomEnchantment.possibleb8.get(0);
            main.b8.addEnchantment(chosen, 1 + (int)(Math.random() * (chosen.getMaxLevel() - 1 + 1)));
        }
        if (RandomEnchantment.possibleb9.size() >= 1 && val9) {
            Collections.shuffle(RandomEnchantment.possibleb9);
            final Enchantment chosen = RandomEnchantment.possibleb9.get(0);
            main.b9.addEnchantment(chosen, 1 + (int)(Math.random() * (chosen.getMaxLevel() - 1 + 1)));
        }
    }
}
