public class SerieCeroImpar {
    public void ImparesCeroFor(int nPosiciones) {
        for (int i = 1; i <= nPosiciones; i++) {
            System.out.print((i % 2 != 0) ? i + " " : 0 + " ");
        }
    }

    public void ImparesCeroDo(int nPosiciones) {
        int cont = 1;
        do {
            System.out.print((cont % 2 != 0) ? cont + " " : 0 + " ");
        } while (cont++ < nPosiciones);
    }

    public void ImparesCeroWhile(int nPosiciones) {
        int cont = 0;
        while (++cont <= nPosiciones) {
            System.out.print((cont % 2 != 0) ? cont + " " : 0 + " ");
        }
    }
}
