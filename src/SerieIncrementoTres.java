public class SerieIncrementoTres {
    public void IncrementoTresFor(int nPosiciones) {
        for (int i = 0, numero = 1; i < nPosiciones; numero += 3, i++) {
            System.out.print(numero + " ");
        }
    }

    public void IncrementoTresDo(int nPosiciones) {
        int cont = 0, numero = 1;
        do {
            System.out.print(numero + " ");
            numero += 3;
            ;
        } while (++cont < nPosiciones);
    }

    public void IncrementoTresWhile(int nPosiciones) {
        int cont = 0, numero = 1;
        while (cont++ < nPosiciones) {
            System.out.print(numero + " ");
            numero += 3;
        }
    }
}
