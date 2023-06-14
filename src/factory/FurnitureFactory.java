package factory;

public class FurnitureFactory {
    public Furniture furnitureFactory(FurnitureTypes types) {
        Furniture furniture = null;

        switch (types) {
            case TABLE:
                furniture = new Table();
                break;
            case WARDROBE:
                furniture = new Wardrobe();
                break;
            case SOFA:
                furniture = new Sofa();
                break;
            case CHAIR:
                furniture = new Chair();
                break;
        }
        return furniture;
    }
}
