package day03;

public class Main {
    public static void main(String[] args) {

        Monster m = new Monster();
        m.setName("Kaiju no 8");
        m.setHitPoints(100);

        System.out.println(m);
        
        Link link = new Link();
        link.hit(m);

        System.out.println(m);

        System.out.println("--------\n");

        Godzilla g = new Godzilla();

        System.out.println(g);
        link.hit(g);
        System.out.println(g);

        System.out.println("--------\n");

        Box b = new Box();
        link.hit(b);
        System.out.println(b);

        System.out.println("--------\n");
        // if variable is declared to be the type of an interface,
        // its value can reference any object that is instantiated from any class that implements the interface
        Damageable d = b;
        System.out.println(d); 

        // cannot instantiate interfaces
        // Damageable ddd = new Damageable();

        System.out.println("--------\n");

        Damageable dd = new Monster();
        System.out.println(dd);
        dd = new Godzilla();
        System.out.println(dd);


    
    }
}
