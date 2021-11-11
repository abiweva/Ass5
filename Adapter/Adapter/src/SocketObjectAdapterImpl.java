public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket sock = new Socket();

    public Energy get120Energy() {
        return sock.getEnergy();

    }

    public Energy get12Energy() {
        Energy v= sock.getEnergy();
        return convertVolt(v,10);
    }

    public Energy get3Energy() {
        Energy v= sock.getEnergy();
        return convertVolt(v,40);
    }
    private Energy convertVolt(Energy v, int i) {
        return new Energy(v.getEnergy()/i);
    }
}
