/*
*Author: Derron
* Class: Bagels
* Version: 1.0
* Date: 2/22/24
 */
// Bagels subclass
public class Bagels extends Bread {
    // Constructor
    public Bagels(double flour, double water, double salt, double sugar, double bakingPowder, double yeast) {
        super(flour, water, salt, sugar, bakingPowder, yeast, "Bagels");
        this.recipe = "1. Dissolve yeast and sugar in warm water and let it sit until foamy.\n" +
                "2. In a large bowl, mix together flour, salt, and baking powder.\n" +
                "3. Stir in the yeast mixture until a dough forms.\n" +
                "4. Knead the dough on a floured surface until smooth and elastic.\n" +
                "5. Divide the dough into equal portions and shape each portion into a bagel shape.\n" +
                "6. Place the bagels on a greased baking sheet and let them rise for about 20 minutes.\n" +
                "7. Preheat the oven to 425°F (220°C).\n" +
                "8. Bring a large pot of water to a boil and carefully drop the bagels in, boiling for about 1 minute on each side.\n" +
                "9. Remove the bagels from the water and place them back on the baking sheet.\n" +
                "10. Bake the bagels in the preheated oven for 20-25 minutes, or until golden brown.\n" +
                "11. Allow the bagels to cool before slicing and serving.";
    }
}