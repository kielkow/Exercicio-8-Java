package exercicio8;

public class Conta {
    
    public double saldo;
    public String cliente;
    public String documento;

    public Conta(double saldo, String cliente, String documento) {
        this.saldo = saldo;
        this.cliente = cliente;
        this.documento = documento;
    }

    public Conta() {
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double s){
        saldo = s;
    }
    
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String c){
        cliente = c;
    }
    
    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String d){
        documento = d;
    }
    
    
    
    public void depositar(double v){
        this.setSaldo(saldo + v);
    }
    
    public void sacar(double v){
        this.setSaldo(saldo - v);
    }
    
    public void status(){
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Cliente: " + this.getCliente());
        System.out.println("Documento: " + this.getDocumento());
    }
}
