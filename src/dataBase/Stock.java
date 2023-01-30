package dataBase;

import enuns.TypeOfProcucts;
import model.Product;

public class Stock {

    public void storeProducts() {

        Product dadosA = new Product(TypeOfProcucts.ACESSORIO, "Kit de dados RPG", "7 dados azuis perolados", 34.10f);
        Product miniaturaHP = new Product(TypeOfProcucts.ACESSORIO, "Miniatura", "Miniatura humano paladino - impressão 3d", 26.31f);
        Product mousePadD = new Product(TypeOfProcucts.ACESSORIO, "Mousepad", "Mousepad dragão 700 x 350 x 3mm", 37.90f);
        Product canecaSda = new Product(TypeOfProcucts.COZINHA, "Caneca Senhor dos Aneis", "Caneca preta com imagem do mapa da Terra Média", 31.99f);
        Product aventalSm = new Product(TypeOfProcucts.COZINHA, "Avental Superman", "Avental azul com o símbolo do Superman", 75.40f);
        Product aventalMm = new Product(TypeOfProcucts.COZINHA, "Avental Mulher-Maravilha", "Avental com a vestimenta da Mulher-Maravilha", 75.40f);
        Product copoLv = new Product(TypeOfProcucts.COZINHA, "Copo Lanterna Verde", "Copo com o símbolo do Lanterna Verde", 22.50f);
        Product jogoSda = new Product(TypeOfProcucts.JOGO, "Jogo Senhor dos Anéis", "Jogo de tabuleiro O Senhor dos Aneis - Jornada na Terra Média", 650.00f);
        Product jogoZc = new Product(TypeOfProcucts.JOGO, "Jogo Zombicide", "Jogo de tabuleiro Zombicide", 745.45f);
        Product jogoTR = new Product(TypeOfProcucts.JOGO, "Jogo The Resistance", "Jogo de tabuleiro The Resistance", 149.90f);
        Product jogoC = new Product(TypeOfProcucts.JOGO, "Jogo Coup", "Jogo de tabuleiro Coup", 88.63f);
        Product livroDDJ = new Product(TypeOfProcucts.LIVRO, "Livro RPG Dungeons & Dragons", "Livro do Jogador Dungeons & Dragons 5a edição", 197.30f);
        Product livroDDM = new Product(TypeOfProcucts.LIVRO, "Livro RPG Dungeons & Dragons", "Manual dos Monstros Dungeons & Dragons 5a edição", 199.90f);
        Product livroUA = new Product(TypeOfProcucts.LIVRO, "Livro RPG O Um Anel", "Livro de RPG O Um Anel 2a edição", 160.30f);
        Product livroT2 = new Product(TypeOfProcucts.LIVRO, "Livro RPG Tormenta20", "Livro básico de RPG Tormenta20", 399.90f);
        Product camisetaDB = new Product(TypeOfProcucts.VESTUARIO, "Camiseta Dragonball", "Camiseta laranja e azul com símbolo Kame", 54.99f);
        Product jaquetaW = new Product(TypeOfProcucts.VESTUARIO, "Jaqueta Wolverine", "Jaqueta de couro do filme Wolverine", 370.00f);
        Product moletomCZ = new Product(TypeOfProcucts.VESTUARIO, "Moletom Cavaleiros do Zodíaco", "Moletom amarelo-dourado da armadura do signo de Gêmeos ", 199.90f);


    }


}
