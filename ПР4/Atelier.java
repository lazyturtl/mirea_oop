public class Atelier {
    public static void dressMan(Clothes[] clothes) {
        System.out.println("=== Мужская одежда ===");
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                ((MenClothing) c).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        System.out.println("=== Женская одежда ===");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) {
                ((WomenClothing) c).dressWomen();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 1500, "чёрный"),
                new Pants(Size.L, 2000, "синий"),
                new Skirt(Size.S, 1700, "красный"),
                new Tie(Size.XS, 800, "зелёный")
        };

        dressMan(clothes);
        dressWomen(clothes);
    }
}