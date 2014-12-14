package by.htp.krozov.sample.mobiphoneshop.model;

/**
 * Created by krozov on 14.12.14.
 */
public class IP {
    private int solidParticleProtection;
    private int liquidIngressProtection;

    public IP(int solidParticleProtection, int liquidIngressProtection) {
        this.solidParticleProtection = solidParticleProtection;
        this.liquidIngressProtection = liquidIngressProtection;
    }

    public int getSolidParticleProtection() {
        return solidParticleProtection;
    }

    public int getLiquidIngressProtection() {
        return liquidIngressProtection;
    }
}
