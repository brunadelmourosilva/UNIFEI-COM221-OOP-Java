package br.com.brunadelmouro.aula04_exercicio_openCSV.enums;

public enum Publisher {
    NINTENDO("Nintendo"),
    SONY("Sony"),
    ACTIVISION("Activision"),
    UBISOFT("Ubisoft");

    private final String publisher;

    Publisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}
