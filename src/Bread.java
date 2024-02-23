/*
 *Author: Derron
 * Class: Bread
 * Version: 1.0
 * Date: 2/22/24
 */
public class Bread {
    protected double flour;
    protected double water;
    protected double salt;
    protected double sugar;
    protected double bakingPowder;
    protected double yeast;
    protected String breadName;
    protected String state;
    protected String recipe;

    // Default constructor
    public Bread() {
        this.flour = 0;
        this.water = 0;
        this.salt = 0;
        this.sugar = 0;
        this.bakingPowder = 0;
        this.yeast = 0;
        this.state = "not baked";
        this.recipe = "";
    }

    // Constructor with all parameters
    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast,
                 String breadName) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = "not baked";
    }

    // Getter and setter methods are defined below this line
    // Getter and setter methods for all instance variables
    // Getter and setter methods for flour
    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    // Getter and setter methods for water
    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    // Getter and setter methods for salt
    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    // Getter and setter methods for sugar
    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    // Getter and setter methods for baking powder
    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    // Getter and setter methods for yeast
    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }
    // Getter and setter methods for bread name
    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }
    // Getter and setter methods for state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Method to bake the bread
    public void bake() {
        if (!this.state.equals("baked")) {
            System.out.println("Baking the " + this.breadName);
            this.state = "baked";
        } else {
            System.out.println("Can't bake, " + this.breadName + " is already baked.");
        }
    }

    // Method to get ingredients
    public String getIngredients() {
        return "Ingredients of " + this.breadName + " are:\n" +
                this.flour + " cups of flour\n" +
                this.water + " cups of water\n" +
                this.salt + " tsps of salt\n" +
                this.sugar + " cups of sugar\n" +
                this.bakingPowder + " tsps of baking powder\n" +
                this.yeast + " tsps of yeast";
    }

    // Method to get recipe
    public String getRecipe() {
        return "A recipe of " + this.breadName + ":\n" + this.recipe;
    }

    // toString method
    public String toString() {
        return this.breadName + " is " + this.state;
    }
}
