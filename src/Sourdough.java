/*
 *Author: Derron
 * Class: Sourdough
 * Version: 1.0
 * Date: 2/22/24
 */
public class Sourdough extends Bread {
    private double sourdoughStarter;

    // Constructor
    public Sourdough(double flour, double water, double salt, double sugar, double bakingPowder, double yeast,
                     double sourdoughStarter) {
        super(flour, water, salt, sugar, bakingPowder, yeast, "Sourdough Bread");
        this.sourdoughStarter = sourdoughStarter;
        this.recipe = "1. Mix flour, water, salt, sugar, baking powder, yeast, and ripe sourdough starter.\n" +
                "2. Make the dough\n" +
                "3. Bulk Rise\n" +
                "4. Stretch and fold the dough\n" +
                "5. Cut and shape the dough\n" +
                "6. Second rise\n" +
                "7. Preheat the oven to 450°F towards the tail end of the second rise.\n" +
                "8. Spray the loaf with lukewarm water.\n" +
                "9. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n" +
                "10. Remove the bread from the oven.\n" +
                "11. Let the bread cool until good to eat.";
    }
}
