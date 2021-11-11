public class SocketclassAdapterImpl extends Socket implements SocketAdapter{

    public Energy get120Energy() {
        return getEnergy();
    }


    public Energy get12Energy() {
        Energy v= getEnergy();
        return convertVolt(v,10);
    }


    public Energy get3Energy() {
        Energy v= getEnergy();
        return convertVolt(v,40);
    }

    private Energy convertVolt(Energy v, int i) {
        return new Energy(v.getEnergy()/i);
    }
}
