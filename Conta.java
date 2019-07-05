public class Conta
{
    private String nome = new String();
    private double saldo;
    
   public Conta(String nome, double saldo)
   {
        this.nome = nome;
        this.saldo = saldo;
   }

   public double getSaldo(){
       return this.saldo;
   }

   public String getNome(){
       return this.nome;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
}