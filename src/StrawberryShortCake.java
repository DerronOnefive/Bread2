/*
*Author: Derron
* Class: StrawberryShortCake
* Version: 1.0
* Date: 2/22/24
 */
// StrawberryShortCake subclass
public class StrawberryShortCake extends Bread {
    // Constructor
    public StrawberryShortCake(double flour, double water, double salt, double sugar, double bakingPowder,
                               double yeast) {
        super(flour, water, salt, sugar, bakingPowder, yeast, "Strawberry Shortcake");
        this.recipe = "1. Preheat the oven to 425°F (220°C) and grease a round cake pan.\n" +
                "2. In a large bowl, whisk together flour, sugar, baking powder, and salt.\n" +
                "3. Cut in cold butter until the mixture resembles coarse crumbs.\n" +
                "4. Stir in milk until a soft dough forms.\n" +
                "5. Press the dough into the prepared cake pan.\n" +
                "6. Bake for 15-20 minutes, or until golden brown.\n" +
                "7. Allow the shortcake to cool completely.\n" +
                "8. To assemble, slice the shortcake in half horizontally and layer with whipped cream and sliced strawberries.\n" +
                "9. Replace the top layer of shortcake and garnish with additional whipped cream and strawberries.";
    }
}
