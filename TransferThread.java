
import java.lang.Math;

class TransferThread extends Thread
{
  private Banco banco;
  private Conta contaorigem;
  private int de;
  
  public TransferThread (Banco b, int de) 
  {
    banco = b;
    contaorigem = (Conta) b.getContas().get(de);
  }

  public void run ()
  {
    try
    {
      for (int i=0; i <10; i++)
      {
        
        do{
            de = (int)((Math.random()*100)%5);
        } while(de < 0 | de > 4 | banco.getConta(de).getNome().equals(contaorigem.getNome()));
        //validação para verificar se a conta de destino não é a mesma que a conta origem
        double valor = ((Math.random()*100));

        Conta contadestino = (Conta) banco.getContas().get(de);
        System.out.println(contaorigem.getNome() + " transferiu R$"+ String.format("%.2f", valor) +" para a conta de " 
        + contadestino.getNome());
          banco.transferencia(contaorigem, contadestino, valor);
        // define o valor a ser transferido aleatoriamente
        // faz a operação de transferência
        sleep(1000);
      }
    } catch (InterruptedException e) {}
  }
}
