package factory;

public class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(new FurnitureFactory());
        shop.orderFurniture(FurnitureTypes.CHAIR);
    }
}