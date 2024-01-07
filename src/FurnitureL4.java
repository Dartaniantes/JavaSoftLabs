import java.util.Arrays;

public class FurnitureL4 {
    private double width;
    private double height;
    private double length;
    private String name;
    private String color;

    public FurnitureL4(double width, double height, double length, String name, String color) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.name = name;
        this.color = color;
    }

    public static void sortArrs(){
        FurnitureL4[] furniture = {
                new FurnitureL4(13,18,26, "Chair","Green"),
                new FurnitureL4(150,280,246, "Sofa", "Brown"),
                new FurnitureL4(170,120,230, "Table", "Red"),
                new FurnitureL4(24,67,24, "Vase", "Blue"),
                new FurnitureL4(13,340,340, "Carpet", "Purple")};

        Arrays.sort(furniture, (f1, f2) -> f1.width > f2.width ? 1 : -1);
        System.out.println("Furniture ascending sorted by width:");
        showFurniture(furniture);

        Arrays.sort(furniture, (f1, f2) -> f1.length > f2.length ? -1 : 1);
        System.out.println("Furniture descending sorted by length:");
        showFurniture(furniture);
    }

    public String toString(){
        return color + " " + name + "(w:" + width + ", h:"  +  height + ", l:" + length  + ")";
    }

    public static void showFurniture(FurnitureL4[] furniture){
        for (FurnitureL4 f: furniture)
            System.out.println(f);
        System.out.println();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
