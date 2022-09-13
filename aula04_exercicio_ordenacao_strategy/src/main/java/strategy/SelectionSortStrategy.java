package strategy;

public class SelectionSortStrategy implements Ordernacao {
    @Override
    public void ordernar(final double[] notas) {
        System.out.println("Ordenando por " + this.getClass().getSimpleName());
        int menor;
        double aux;
        int tam = notas.length;
        for (int i = 0; i < tam - 1; i++) {
            menor = i;
            for (int j = i + 1; j < tam; j++) {
                if (notas[j] < notas[menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                aux = notas[i];
                notas[i] = notas[menor];
                notas[menor] = aux;
            }
        }
    }
}
