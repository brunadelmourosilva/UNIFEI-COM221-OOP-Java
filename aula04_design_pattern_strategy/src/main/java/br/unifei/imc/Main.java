package br.unifei.imc;


import br.unifei.imc.interfaces.voar.VooFoguete;
import br.unifei.imc.models.Marreco;
import br.unifei.imc.models.Pato;

public class Main {
    public static void main(String[] args) {

        //var patos = FabricaPatos.geraPatos();

        Pato marreco = new Marreco();
        marreco.setVoar(new VooFoguete());
        marreco.voar();
    }
}