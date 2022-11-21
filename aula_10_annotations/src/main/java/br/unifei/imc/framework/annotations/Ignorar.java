package br.unifei.imc.framework.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Retention(RetentionPolicy.SOURCE) //retida somente no código fonte, em tempo de compilação
//@Retention(RetentionPolicy.CLASS) //retida no bytecode do Java, antes de ir para a JVM
//@Target(ElementType.METHOD) //disponível para métodos
//@Target({ElementType.METHOD, ElementType.FIELD}) //disponível para métodos e campos
@Retention(RetentionPolicy.RUNTIME) //disponível em tempo de execução
@Target(ElementType.FIELD) //disponível para campos
public @interface Ignorar {

    //int param();
}
