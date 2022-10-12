package br.unifei.imc.controle;

import br.unifei.imc.comando.*;
import lombok.Setter;

public class Controle {

    @Setter
    Comando btnA, btnB, btnC, btnD;

    public Controle() {
        //controle inicializado com as seguintes configurações
        this.btnA = new ComandoAtirar();
        this.btnB = new ComandoPular();
        this.btnC = new ComandoAgachar();
        this.btnD = new ComandoCorrer();
    }

    public void apertarBtnA() {
        btnA.executar();
    }
    public void apertarBtnB() {
        btnB.executar();
    }

    public void apertarBtnC() {
        btnC.executar();
    }

    public void apertarBtnD() {
        btnD.executar();
    }
}
