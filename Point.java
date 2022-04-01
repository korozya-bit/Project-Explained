public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(Point other){
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.x - other.x, 2));
    }

    public double incline(Point other){
        return (other.y - this.y) / (other.x - this.x);
    }

    public String equation(Point other){
        String returnedString = String.format("y = %sX + %s", incline(other),  (incline(other) * (-1) * (this.x)) + this.y);
        return returnedString;
    }

    public static void main(String[] args) {
        Point p1 = new Point(4.4211, 0);
        Point p2 = new Point(0, -8.4);

        System.out.println(p1.equation(p2));
    }
}