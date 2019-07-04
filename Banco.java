import java.util.ArrayList;

public class Banco
{
    ArrayList<Conta> contas = new ArrayList();
    
    public void transferencia(Conta de,Conta para,double valor)
    {
        wait();
        notify();
    }
}

