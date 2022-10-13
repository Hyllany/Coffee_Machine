public class Mocha extends CondimentCofee{

    public Mocha(Beverage beverage){
       this.beverage= beverage;
    }

    public double cost() {
        if (beverage.size == Size.TALL) {
            return beverage.cost() + 0.3;
        } else if (beverage.size == Size.GRANDE) {
            return beverage.cost() + 0.35;
        } else if (beverage.size == Size.VENTI) {
            return beverage.cost() + 0.40;
        } return beverage.cost()+ 0.2;
    }

    public String getDescription() {
        return beverage.getDescription() + " + Mocha";
    }

}
