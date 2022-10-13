public abstract class CondimentCofee extends Beverage{
    Beverage beverage;


    public Size getSize() {
        return beverage.getSize();
    }

    public abstract String getDescription();


}
