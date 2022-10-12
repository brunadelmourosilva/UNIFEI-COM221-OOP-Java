package br.unifei.imc.comando;

import br.unifei.imc.comando.Comando;

public class ComandoAtirar implements Comando {

    @Override
    public void executar() {
        System.out.println("Player atirando!");
    }
}
