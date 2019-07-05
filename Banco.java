import java.util.ArrayList;

public class Banco
{
    private double val_inicio =10000;
    private ArrayList<Conta> contas = new ArrayList<Conta>();
    
    Banco(){
        contas.add(new Conta("Bruno",val_inicio));
        contas.add(new Conta("Kalyl",val_inicio));
        contas.add(new Conta("Marcus",val_inicio));
        contas.add(new Conta("Luciana",val_inicio));
        contas.add(new Conta("Patricia",val_inicio));
    }
        
    public synchronized void transferencia(Conta de,Conta para,double valor)
    {
        while(de.getSaldo() < valor){
            try{
                wait();
            }catch (InterruptedException e){

            }
        }
        
        de.setSaldo(de.getSaldo() - valor);
        para.setSaldo(para.getSaldo()+ valor);

        notify();
    }

    public ArrayList getContas(){
        return contas;
    }
}