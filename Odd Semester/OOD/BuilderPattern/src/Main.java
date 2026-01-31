//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegmeal = mealBuilder.prepareVegMeal();
        System.out.println("veg Meal Term");
        vegmeal.showItems();
        System.out.println("Total Cost: "+vegmeal.getCost());

        System.out.println("Non veg Meal Term");
        Meal meal1 = mealBuilder.prepareNonVegMeal();
        meal1.showItems();
        System.out.println("Total Cost for non veg meal : "+meal1.getCost());
    }
}