public class AdapterPatternTest  {
    public static void main(String[] args) {

        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
        Energy v3 = getVolt(sockAdapter,3);
        Energy v12 = getVolt(sockAdapter,12);
        Energy v120 = getVolt(sockAdapter,120);
        System.out.println();
        System.out.println("v3 volts using Class Adapter="+v3.getEnergy());
        System.out.println("v12 volts using Object Adapter="+v12.getEnergy());
        System.out.println("v120 volts using Object Adapter="+v120.getEnergy());
    }

    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketclassAdapterImpl();
        Energy v3 = getVolt(sockAdapter,3);
        Energy v12 = getVolt(sockAdapter,12);
        Energy v120 = getVolt(sockAdapter,120);
        System.out.println("v3 volts using Class Adapter="+v3.getEnergy());
        System.out.println("v12 volts using Class Adapter="+v12.getEnergy());
        System.out.println("v120 volts using Class Adapter="+v120.getEnergy());
    }

    private static Energy getVolt(SocketAdapter sockAdapter, int i) {
        switch (i){
            case 3: return sockAdapter.get3Energy();
            case 12: return sockAdapter.get12Energy();
            case 120: return sockAdapter.get120Energy();
            default: return sockAdapter.get120Energy();
        }
    }
}
