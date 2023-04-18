package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, int capacity, String discType) {
        this.setName(name);
        this.setSpinRateLowRange(570);
        this.setSpinRateHighRange(1600);
        this.setCapacity(capacity);
        this.setDiscType(discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVDs spin from " + getSpinRateLowRange() + " to " + getSpinRateHighRange() + " RPM.");
    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public void write() {

    }


// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
