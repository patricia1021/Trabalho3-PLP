class TransferThread extends Thread
{
  private Banco banco;
  private int contaorigem;
  
  public TransferThread (Banco b, int de) 
  {
    banco = b;
    contaorigem = de;
  }

  public synchronized void run ( )
  {
    try
    {
      while (!interrupted ( ))
      {
        // define a conta destino aleatoriamente
        // define o valor a ser transferido aleatoriamente
        // faz a operação de transferência
        sleep(1000);
      }
    } catch (InterruptedException e) {}
  }
}
