public class Magazine {
    public static void printMagazines(Printable[]arr){for(Printable p:arr)if(p instanceof Journal j)System.out.println(j.getName());}
}