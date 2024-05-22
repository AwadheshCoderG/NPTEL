package NPTEL;

public class SmartKitchen {
    private CoffeeMaker brewMaker;
    private DishWasher dishWasher;
    private Refrigerator iceBox;
    public SmartKitchen(){
        brewMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaker() {
        return brewMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return  iceBox;
    }

    public void addWater(){
        brewMaker.setHasWorkToDo(true);
    }

    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaker.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaker.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class Refrigerator{
    boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Food is stored in Refrigerator");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker{
    boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Coffee is brewing....");
            hasWorkToDo = false;
        }
    }

}

class DishWasher{
    boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Dishwasher is working....");
            hasWorkToDo = false;
        }
    }
}