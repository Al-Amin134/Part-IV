public class MealBulder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
       Meal meal1 = new Meal();
        meal1.addItem(new ChickenBurger());
        meal1.addItem(new Pepsi());
        return meal1;
    }

}
