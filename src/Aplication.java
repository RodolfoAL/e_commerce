import view.InicialMenuView;

public class Aplication {
    public static void main(String[] args) {
        System.out.println("==================================================================");
        System.out.println("                           Bem-vindo à:");
        System.out.println("======================== DUNGEON TREASURE ========================\n");
        System.out.println("                        (You Shall Pass!!)");
        System.out.println("==================================================================");
        System.out.println("   Aqui você irá encontrar precisamente o produto que deseja!");
        System.out.println("------------------------------------------------------------------");

        InicialMenuView inicialMenuView = new InicialMenuView();
        inicialMenuView.inicializeInicialMenu();

    }
}