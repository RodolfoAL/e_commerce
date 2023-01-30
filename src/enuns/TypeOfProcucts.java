package enuns;

public enum TypeOfProcucts {

    COZINHA ("cozinha"),
    VESTUARIO ("vestuário"),
    LIVRO ("livro"),
    JOGO ("jogo"),
    ACESSORIO ("Acessório");

    private String descricao;

    TypeOfProcucts (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
