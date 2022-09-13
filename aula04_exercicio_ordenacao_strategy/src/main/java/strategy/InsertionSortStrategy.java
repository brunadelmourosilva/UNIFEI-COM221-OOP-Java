package strategy;

public class InsertionSortStrategy implements Ordernacao {
    @Override
    public void ordernar(final double[] notas) {
        System.out.println("Ordenando por " + this.getClass().getSimpleName());
        double atual;
        int j, tam = notas.length;
        for (int i = 1; i < tam; i++) {
            atual = notas[i];
            for (j = i; (j > 0) && (atual < notas[j - 1]); j--) {
                notas[j] = notas[j - 1];
            }
            notas[j] = atual;
        }
    }
}
