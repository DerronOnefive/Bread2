/*
 *Author: Derron
 * Class: Muffins
 * Version: 1.0
 * Date: 2/22/24
 */
// Muffins subclass
public class Muffins extends Bread {
    // Constructor
    public Muffins(double flour, double water, double salt, double sugar, double bakingPowder, double yeast) {
        super(flour, water, salt, sugar, bakingPowder, yeast, "Muffins");
        this.recipe = "1. Preheat the oven to 375°F (190°C) and grease a muffin tin or line with paper liners.\n" +
                "2. In a large bowl, mix together flour, baking powder, salt, and sugar.\n" +
                "3. In another bowl, beat together eggs, milk, and melted butter.\n" +
                "4. Pour the wet ingredients into the dry ingredients and mix until just combined.\n" +
                "5. Fold in any additional ingredients such as berries or chocolate chips.\n" +
                "6. Spoon the batter into the prepared muffin tin, filling each cup about 2/3 full.\n" +
                "7. Bake for 18-20 minutes, or until a toothpick inserted into the center comes out clean.\n" +
                "8. Allow the muffins to cool in the tin for a few minutes before transferring to a wire rack to cool completely.";
    }
}
