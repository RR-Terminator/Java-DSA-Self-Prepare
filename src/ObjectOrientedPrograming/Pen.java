package ObjectOrientedPrograming;

public class Pen {
    public static void main(String[] args) {
        PenProperties p1 = new PenProperties();
        System.out.println(p1);
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(1);
        System.out.println(p1.getTip());
    }
}
