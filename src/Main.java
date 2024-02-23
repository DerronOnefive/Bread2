/*
 *Author: Derron
 * Class: Main
 * Version: 1.0
 * Date: 2/22/24
 */
public class Main {
    public static void main(String[] args) {
        // Testing SourdoughBread class
        System.out.println("SourdoughBread class testing");
        Sourdough sourdough = new Sourdough(5.00, 1.50, 2.50, 1.00, 1.00, 1.00, 1.00);
        System.out.println(sourdough.getIngredients());
        System.out.println(sourdough.getRecipe());
        sourdough.bake();
        sourdough.bake();
        System.out.println(sourdough);

        // Testing Muffins class
        System.out.println("\nMuffins class testing");
        Muffins muffins = new Muffins(2.00, 1.00, 0.50, 0.75, 2.00, 1.00);
        System.out.println(muffins.getIngredients());
        System.out.println(muffins.getRecipe());
        muffins.bake();
        muffins.bake();
        System.out.println(muffins);

        // Testing Pastries class
        System.out.println("\nPastries class testing");
        Pastries pastries = new Pastries(3.00, 1.50, 0.25, 1.00, 2.00, 0.75);
        System.out.println(pastries.getIngredients());
        System.out.println(pastries.getRecipe());
        pastries.bake();
        pastries.bake();
        System.out.println(pastries);

        // Testing StrawberryShortCake class
        System.out.println("\nStrawberryShortCake class testing");
        StrawberryShortCake shortcake = new StrawberryShortCake(2.50, 1.00, 0.25, 0.50, 1.50, 0.50);
        System.out.println(shortcake.getIngredients());
        System.out.println(shortcake.getRecipe());
        shortcake.bake();
        shortcake.bake();
        System.out.println(shortcake);

        // Testing Bagels class
        System.out.println("\nBagels class testing");
        Bagels bagels = new Bagels(4.00, 1.25, 0.50, 0.50, 1.00, 1.00);
        System.out.println(bagels.getIngredients());
        System.out.println(bagels.getRecipe());
        bagels.bake();
        bagels.bake();
        System.out.println(bagels);
    }
}
