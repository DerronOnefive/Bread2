/*
 *Author: Derron
 * Class: Pastries
 * Version: 1.0
 * Date: 2/22/24
 */

// Pastries subclass
public class Pastries extends Bread {
    // Constructor
    public Pastries(double flour, double water, double salt, double sugar, double bakingPowder, double yeast) {
        super(flour, water, salt, sugar, bakingPowder, yeast, "Pastries");
        this.recipe = "1. Preheat the oven to 375°F (190°C) and line a baking sheet with parchment paper.\n" +
                "2. Roll out the pastry dough on a floured surface to the desired thickness.\n" +
                "3. Cut the dough into shapes using cookie cutters or a knife.\n" +
                "4. Place the pastries on the prepared baking sheet.\n" +
                "5. Brush the tops of the pastries with egg wash for a golden finish.\n" +
                "6. Bake in the preheated oven for 12-15 minutes, or until the pastries are puffed up and golden brown.\n" +
                "7. Allow the pastries to cool slightly before serving.";
    }
}

