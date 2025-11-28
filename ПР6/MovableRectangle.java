public class MovableRectangle implements Movable {
    private MovablePoint topLeft,bottomRight;
    public MovableRectangle(int x1,int y1,int x2,int y2,int xs,int ys){
        topLeft=new MovablePoint(x1,y1,xs,ys); bottomRight=new MovablePoint(x2,y2,xs,ys); }
    public boolean speedTest(){ return topLeft.getXSpeed()==bottomRight.getXSpeed()&&topLeft.getYSpeed()==bottomRight.getYSpeed(); }
    public void moveUp(){ topLeft.moveUp(); bottomRight.moveUp(); }
    public void moveDown(){ topLeft.moveDown(); bottomRight.moveDown(); }
    public void moveLeft(){ topLeft.moveLeft(); bottomRight.moveLeft(); }
    public void moveRight(){ topLeft.moveRight(); bottomRight.moveRight(); }
    public String toString(){ return "Rect[topLeft="+topLeft+",bottomRight="+bottomRight+"]"; }
}