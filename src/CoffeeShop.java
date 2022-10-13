public class CoffeeShop {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage.setSize(Beverage.Size.VENTI);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1.setSize(Beverage.Size.TALL);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.Size.TALL);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $"+ beverage2.cost());
    }
}
