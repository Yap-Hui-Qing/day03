package day03;

public class Link {

    // identify not by type of object but by the characteristics of object
    // public void hit(Monster m) {
    //     m.damage(5);
    // }

    // public void hit(Box b) {
    //     b.setIntegrity(b.getIntegrity() - 5);
    // }

    // accept any object that implements the Damageable interface
    // accept any "Damageable" implementation as a parameter
    public void hit(Damageable d){
        d.damage(5);
    }
}
