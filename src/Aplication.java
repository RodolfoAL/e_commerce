import dataBase.Stock;
import view.InicialMenuView;
import static dataBase.SimulatedClients.simulate;

public class Aplication {
    public static void main(String[] args) {
        System.out.println("==================================================================");
        System.out.println("                           Bem-vindo à:");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> DUNGEON TREASURE <<<<<<<<<<<<<<<<<<<<<<<<\n");

        System.out.println("                        (You Shall Pass!!)");
        System.out.println("   (Aqui você irá encontrar precisamente o produto que deseja!)");
        System.out.println("==================================================================");

        Stock stock = new Stock();
        stock.storeProducts();
        simulate();
        
        InicialMenuView inicialMenuView = new InicialMenuView();
        inicialMenuView.inicializeInicialMenu();

    }
}