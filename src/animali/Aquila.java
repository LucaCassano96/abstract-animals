package animali;

public class Aquila extends Animale implements Volo{
    @Override
    public void verso() {
        System.out.println("we we");
    }

    @Override
    public void mangia() {
        System.out.println("topolini");
    }

    @Override
    public void volare() {
        System.out.println("Sto volando");
    }

    @Override
    public String toString() {
        return "Aquila";
    }
}
