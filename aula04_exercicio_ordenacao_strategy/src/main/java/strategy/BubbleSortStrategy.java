package strategy;

public class BubbleSortStrategy implements Ordernacao {
    @Override
    public void ordernar(final double[] notas) {

        System.out.println("Ordenando por " + this.getClass().getSimpleName());
        double aux, fim = notas.length;
        boolean continua = false;
        do {
            continua = false;
            for (int i = 0; i < fim - 1; i++) {
                if (notas[i] > notas[i + 1]) {
                    aux = notas[i];
                    notas[i] = notas[i + 1];
                    notas[i + 1] = aux;
                    continua = true;
                }
            }
            fim--;
        } while (continua != false);
    }
}
