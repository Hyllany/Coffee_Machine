public class Soy extends CondimentCofee{
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost(){
        if (beverage.size == Size.TALL) {
            return beverage.cost() + 0.2;
        } else if (beverage.size == Size.GRANDE) {
            return beverage.cost() + 0.25;
        } else if (beverage.size == Size.VENTI) {
            return beverage.cost() + 0.30;
        } return beverage.cost() + 0.10;
    }
    public String getDescription(){
        return beverage.getDescription() + " + Soy";
    }
}
