package exercicio8;
public class Exercicio8 {

    public static void main(String[] args) {
        
        Conta conta = new Conta();
        
        conta.setSaldo(1000);
        conta.setCliente("Matheus");
        conta.setDocumento("37311362-6");
        
        
        conta.sacar(500);
        conta.depositar(600);
        
        
        conta.status();
        
    }
    
}
