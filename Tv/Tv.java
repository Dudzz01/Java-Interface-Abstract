package Aparelhos;
public class Tv implements Smart,Basico{

    @Override
    public void ligar() {
        // TODO Auto-generated method 
        System.out.println("Liguei TV");
        
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        System.out.println("Desliguei TV");
    }

    @Override
    public void acessoInt() {
        // TODO Auto-generated method stub
        System.out.println("TV com acesso a internet");
    }

    @Override
    public void baixarApp() {
        // TODO Auto-generated method stub
        System.out.println("TV baixou app");

    }
    
}
