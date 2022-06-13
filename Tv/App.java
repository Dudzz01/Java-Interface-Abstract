package Aparelhos;
public class App {
    public static void main(String[] args) throws Exception {
        Tablet tb_1 = new Tablet();
        Tv tv_1 = new Tv();

        tb_1.acessoInt();
        tb_1.baixarApp();

        tv_1.acessoInt();
        tv_1.baixarApp();
        tv_1.desligar();
        tv_1.ligar();
    }
}
