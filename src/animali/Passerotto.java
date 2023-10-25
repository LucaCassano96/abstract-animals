package animali;

public class Passerotto extends Animale implements Volo{
    @Override
    public void verso() {
        System.out.println("pio pio");
    }

    @Override
    public void mangia() {
        System.out.println("insetti");
    }


    @Override
    public void volare() {
        System.out.println("Sto volando!!");
    }

    @Override
    public String toString() {
        return "Passerotto";
    }
}
