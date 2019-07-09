
import java.lang.Math;

class TransferThread extends Thread
{
  private Banco banco;
  private Conta contaorigem;
  
  public TransferThread (Banco b, int de) 
  {
    banco = b;
    contaorigem = (Conta) b.getContas().get(de);
  }

  public void run ( )
  {
    try
    {
      for (int i=0; i <10; i++)
      {
        
        do{
            de = (int)((Math.random()*100)%5);
        } while(de < 0 | de > 4);

        double valor = ((Math.random()*100));

        Conta contadestino = (Conta) banco.getContas().get(de);
        System.out.println("Transferencia de "+ valor  + " conta origem: "+ contaorigem.getNome()  
        +" conta destino: " + contadestino.getNome());
        
        banco.transferencia(contaorigem, contadestino, valor);
        // define o valor a ser transferido aleatoriamente
        // faz a operação de transferência
        sleep(1000);
      }
    } catch (InterruptedException e) {}
  }
}
