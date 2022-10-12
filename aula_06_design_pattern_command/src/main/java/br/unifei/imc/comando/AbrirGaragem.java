package br.unifei.imc.comando;

import br.unifei.imc.dispositivos.Garagem;

public class AbrirGaragem implements Comando{

   Garagem g;

   public AbrirGaragem(Garagem g){
       this.g = g;
   }

    @Override
    public void executar() {
        g.abrir();
    }
}
