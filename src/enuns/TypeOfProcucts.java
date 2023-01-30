package enuns;

public enum TypeOfProcucts {

    COZINHA ("cozinha"),
    VESTUARIO ("vestuário"),
    LIVRO ("livro"),
    JOGO ("jogo"),
    ACESSORIO ("acessório");

    private String description;

    TypeOfProcucts (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
