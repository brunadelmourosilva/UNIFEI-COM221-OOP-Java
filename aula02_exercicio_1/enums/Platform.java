package br.com.brunadelmouro.aula04_exercicio_openCSV.enums;

public enum Platform {

    X360("X360"),
    PS4("PS4"),
    PC("PC");

    private final String platform;

    Platform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }
}
