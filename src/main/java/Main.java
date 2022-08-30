import br.com.brunadelmouro.vendedores.Baruk;

public class Main {

    public static void main(String[] args) {


        var baruk = new Baruk(100, 20);

        var comprador = new Comprador(baruk);
        comprador.compra(5, baruk);
        comprador.compra(4, baruk);
        comprador.compra(6, baruk);
    }
}
