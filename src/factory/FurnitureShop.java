package factory;

public class FurnitureShop {
    private final FurnitureFactory furnitureFactory;

    public FurnitureShop(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public Furniture orderFurniture(FurnitureTypes types) {
        Furniture furniture = furnitureFactory.furnitureFactory(types);
        furniture.furnitureAssembly();
        furniture.furnitureForSale();
        System.out.println("Your furniture is ready!");
        return furniture;
    }
}
