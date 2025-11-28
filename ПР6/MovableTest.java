public class MovableTest {
    public static void main(String[] args){
        MovableRectangle rect=new MovableRectangle(0,10,5,0,2,3);
        System.out.println(rect); rect.moveRight(); rect.moveUp(); System.out.println(rect);
    }
}