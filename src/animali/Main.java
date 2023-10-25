package animali;

public class Main {


    public static void main(String[] args) {

        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();

        faiVolare(passerotto); // Il passerotto può volare
        faiVolare(aquila); // L'aquila può volare
        faiNuotare(delfino); // Il delfino può nuotare
        cane.dorme();
        cane.verso();
        cane.mangia();

    }

    public static void faiVolare(Volo animale) {
        animale.volare();
    }

    public static void faiNuotare(Nuoto animale) {
        animale.nuotare();
    }
}
