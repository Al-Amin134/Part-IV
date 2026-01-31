//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MealBulder mealBulder = new MealBulder();
        System.out.println("Preparation of the non veg meal");
        Meal meal = mealBulder.prepareNonVegMeal();
        meal.showItem();
        System.out.println("The total cost for preparing the non veg meal : "+meal.getCost());
    }
}