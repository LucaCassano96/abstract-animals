package animali;

public class Cane extends Animale{

    @Override
    public void verso() {
        System.out.println("bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("carne");
    }

    @Override
    public String toString() {
        return "Cane";
    }
}
