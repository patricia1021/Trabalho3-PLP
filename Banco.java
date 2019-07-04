import java.util.ArrayList;

public class Banco
{
    double const val_inicio =10000;
    ArrayList<Conta> contas = new ArrayList(5);
    
    contas.add("Bruno";val_inicio);
    contas.add("Kalyl";val_inicio);
    contas.add("Marcus";val_inicio);
    contas.add("Luciana";val_inicio);
    contas.add("Patricia";val_inicio);
        
    public synchronized void transferencia(Conta de,Conta para,double valor)
    {
        while(de.getSaldo() < valor)
            wait();
        
        de.setSaldo(de.getSaldo() - valor);
        para.setSaldo(para.getSaldo()+ valor);

        notify();
    }
}
