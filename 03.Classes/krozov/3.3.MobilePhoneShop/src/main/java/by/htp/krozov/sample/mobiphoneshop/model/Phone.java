package by.htp.krozov.sample.mobiphoneshop.model;

/**
 * Created by krozov on 14.12.14.
 */
public class Phone {
    private final String vendor;
    private final String model;

    private final int worktime;
    private final double screenSize;
    private final OS os;
    private final boolean smartphone;
    private final int price;

    private final IP ip;

    public Phone(String vendor,
                 String model,
                 int worktime,
                 double screenSize,
                 OS os,
                 boolean smartphone,
                 int price,
                 IP ip) {
        this.vendor = vendor;
        this.model = model;
        this.worktime = worktime;
        this.screenSize = screenSize;
        this.os = os;
        this.smartphone = smartphone;
        this.price = price;
        this.ip = ip;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public int getWorktime() {
        return worktime;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public OS getOs() {
        return os;
    }

    public boolean isSmartphone() {
        return smartphone;
    }

    public int getPrice() {
        return price;
    }

    public IP getIp() {
        return ip;
    }
}
