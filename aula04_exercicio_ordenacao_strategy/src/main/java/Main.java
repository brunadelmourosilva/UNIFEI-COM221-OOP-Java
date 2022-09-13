import service.BibliotecaService;
import strategy.BubbleSortStrategy;
import strategy.InsertionSortStrategy;
import strategy.SelectionSortStrategy;

public class Main {

    public static void main(String[] args) {

        double[] notas = {2, 10, 1, 4, 0};

        BibliotecaService bibliotecaService = new BibliotecaService();

        bibliotecaService.setOrdernacao(new BubbleSortStrategy());
        bibliotecaService.apresentarNotasOrdenadas(notas);

        System.out.println("---------------------------------");

        bibliotecaService.setOrdernacao(new InsertionSortStrategy());
        bibliotecaService.apresentarNotasOrdenadas(notas);

        System.out.println("---------------------------------");

        bibliotecaService.setOrdernacao(new SelectionSortStrategy());
        bibliotecaService.apresentarNotasOrdenadas(notas);
    }
}
