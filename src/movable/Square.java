package movable;

public class Square implements Movable {

    MovablePoint a;
    MovablePoint b;
    MovablePoint c;
    MovablePoint d;

    public Square(int aX, int aY, int bX, int bY) {
        this.a = new MovablePoint(aX,aY,1,1);
        this.b = new MovablePoint(bX,bY,1,1);
        this.c = new MovablePoint(bX,bX-aX,1,1);
        this.d = new MovablePoint(aX,bX-aX,1,1);
    }

    @Override
    public String toString() {
        return String.format("a = (%s, %s), b = (%s, %s), c = (%s, %s), d = (%s, %s)",a.x,a.y,b.x,b.y,c.x,c.y,d.x,d.y);
    }

    @Override
    public void moveUp() {
        a.moveUp();
        b.moveUp();
        c.moveUp();
        d.moveUp();
    }

    @Override
    public void moveDown() {
        a.moveDown();
        b.moveDown();
        c.moveDown();
        d.moveDown();
    }

    @Override
    public void moveRight() {
        a.moveRight();
        b.moveRight();
        c.moveRight();
        d.moveRight();
    }

    @Override
    public void moveLeft() {
        a.moveLeft();
        b.moveLeft();
        c.moveLeft();
        d.moveLeft();
    }
}
