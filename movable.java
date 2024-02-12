interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y++;
    }

   
    public void moveDown() {
        y--;
    }

   
    public void moveLeft() {
        x--;
    }

   
    public void moveRight() {
        x++;
    }

   
    public String toString() {
        return "MovablePoint{x=" + x + ", y=" + y + '}';
    }
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int radius) {
        this.center = new MovablePoint(x, y);
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

  
    public void moveDown() {
        center.moveDown();
    }


    public void moveLeft() {
        center.moveLeft();
    }


    public void moveRight() {
        center.moveRight();
    }


    public String toString() {
        return "MovableCircle{center=" + center + ", radius=" + radius + '}';
    }
}

public class movable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2);
        MovableCircle circle = new MovableCircle(0, 0, 3);

        System.out.println("Original Point: " + point);
        point.moveUp();
        System.out.println("Point after moving up: " + point);

        System.out.println("\nOriginal Circle: " + circle);
        circle.moveRight();
        System.out.println("Circle after moving right: " + circle);
    }
}
