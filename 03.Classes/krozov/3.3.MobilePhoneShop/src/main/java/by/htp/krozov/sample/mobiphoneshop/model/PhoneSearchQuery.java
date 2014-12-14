package by.htp.krozov.sample.mobiphoneshop.model;

/**
 * Created by krozov on 14.12.14.
 */
public class PhoneSearchQuery {
    private String vendor;
    private int worktime;
    private double screenSize;
    private OS os;
    private boolean smartphone;
    private int price;

    private IP ip;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getWorktime() {
        return worktime;
    }

    public void setWorktime(int worktime) {
        this.worktime = worktime;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public boolean isSmartphone() {
        return smartphone;
    }

    public void setSmartphone(boolean smartphone) {
        this.smartphone = smartphone;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public IP getIp() {
        return ip;
    }

    public void setIp(IP ip) {
        this.ip = ip;
    }

    public static boolean checkCriteria(Object queryProp, Object phoneProp) {
        return queryProp == null || queryProp.equals(phoneProp);
    }
}
