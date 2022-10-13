public class Whip extends CondimentCofee{

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost(){
        if (beverage.size == Size.TALL) {
            return beverage.cost() + 0.6;
        } else if (beverage.size == Size.GRANDE) {
            return beverage.cost() + 0.65;
        } else if (beverage.size == Size.VENTI) {
            return beverage.cost() + 0.70;
        } return beverage.cost() + 0.50;
    }

    public String getDescription(){
        return beverage.getDescription() + " + Whip";
    }
}
