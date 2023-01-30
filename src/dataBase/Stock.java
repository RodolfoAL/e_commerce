package dataBase;

import enuns.TypeOfProcucts;
import model.Product;
import static dataBase.StockDataBase.addProducts;

public class Stock {

    public void storeProducts() {

        Product dadosA = new Product(TypeOfProcucts.ACESSORIO, "Kit de dados RPG", "7 dados azuis perolados", 34.10f);
        addProducts(dadosA);
        Product miniaturaHP = new Product(TypeOfProcucts.ACESSORIO, "Miniatura", "Miniatura humano paladino - impressão 3d", 26.31f);
        addProducts(miniaturaHP);
        Product mousePadD = new Product(TypeOfProcucts.ACESSORIO, "Mousepad", "Mousepad dragão 700 x 350 x 3mm", 37.90f);
        addProducts(mousePadD);
        Product canecaSda = new Product(TypeOfProcucts.COZINHA, "Caneca Senhor dos Aneis", "Caneca preta com imagem do mapa da Terra Média", 31.99f);
        addProducts(canecaSda);
        Product aventalSm = new Product(TypeOfProcucts.COZINHA, "Avental Superman", "Avental azul com o símbolo do Superman", 75.40f);
        addProducts(aventalSm);
        Product aventalMm = new Product(TypeOfProcucts.COZINHA, "Avental Mulher-Maravilha", "Avental com a vestimenta da Mulher-Maravilha", 75.40f);
        addProducts(aventalMm);
        Product copoLv = new Product(TypeOfProcucts.COZINHA, "Copo Lanterna Verde", "Copo com o símbolo do Lanterna Verde", 22.50f);
        addProducts(copoLv);
        Product jogoSda = new Product(TypeOfProcucts.JOGO, "Jogo Senhor dos Anéis", "Jogo de tabuleiro O Senhor dos Aneis - Jornada na Terra Média", 650.00f);
        addProducts(jogoSda);
        Product jogoZc = new Product(TypeOfProcucts.JOGO, "Jogo Zombicide", "Jogo de tabuleiro Zombicide", 745.45f);
        addProducts(jogoZc);
        Product jogoTR = new Product(TypeOfProcucts.JOGO, "Jogo The Resistance", "Jogo de tabuleiro The Resistance", 149.90f);
        addProducts(jogoTR);
        Product jogoC = new Product(TypeOfProcucts.JOGO, "Jogo Coup", "Jogo de tabuleiro Coup", 88.63f);
        addProducts(jogoC);
        Product livroDDJ = new Product(TypeOfProcucts.LIVRO, "Livro RPG Dungeons & Dragons", "Livro do Jogador Dungeons & Dragons 5a edição", 197.30f);
        addProducts(livroDDJ);
        Product livroDDM = new Product(TypeOfProcucts.LIVRO, "Livro RPG Dungeons & Dragons", "Manual dos Monstros Dungeons & Dragons 5a edição", 199.90f);
        addProducts(livroDDM);
        Product livroUA = new Product(TypeOfProcucts.LIVRO, "Livro RPG O Um Anel", "Livro de RPG O Um Anel 2a edição", 160.30f);
        addProducts(livroUA);
        Product livroT2 = new Product(TypeOfProcucts.LIVRO, "Livro RPG Tormenta20", "Livro básico de RPG Tormenta20", 399.90f);
        addProducts(livroT2);
        Product camisetaDB = new Product(TypeOfProcucts.VESTUARIO, "Camiseta Dragonball", "Camiseta laranja e azul com símbolo Kame", 54.99f);
        addProducts(camisetaDB);
        Product jaquetaW = new Product(TypeOfProcucts.VESTUARIO, "Jaqueta Wolverine", "Jaqueta de couro do filme Wolverine", 370.00f);
        addProducts(jaquetaW);
        Product moletomCZ = new Product(TypeOfProcucts.VESTUARIO, "Moletom Cavaleiros do Zodíaco", "Moletom amarelo-dourado da armadura do signo de Gêmeos ", 199.90f);
        addProducts(moletomCZ);


    }


}
