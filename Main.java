class Main {
    public static void main(String args[]){
        Banco banco = new Banco();
        TransferThread transfer1 = new TransferThread(banco, 0);
        TransferThread transfer2 = new TransferThread(banco, 1);
        TransferThread transfer3 = new TransferThread(banco, 2);
        TransferThread transfer4 = new TransferThread(banco, 3);
        TransferThread transfer5 = new TransferThread(banco, 4);

        transfer1.start();
        transfer2.start();
        transfer3.start();
        transfer4.start();
        transfer5.start();

        try{
            transfer1.join();
            transfer2.join();
            transfer3.join();
            transfer4.join();
            transfer5.join();
        } catch (InterruptedException e){
        }


    }


}