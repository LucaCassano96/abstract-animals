package animali;

public class Delfino extends Animale implements Nuoto{
    @Override
    public void verso() {
        System.out.println("iiiiiiiiiiii");
    }

    @Override
    public void mangia() {
        System.out.println("pesci");
    }

    @Override
    public void nuotare() {
        System.out.println("Sto nuotando");
    }

    @Override
    public String toString() {
        return "Delfino";
    }
}
