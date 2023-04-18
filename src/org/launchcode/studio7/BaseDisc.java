package org.launchcode.studio7;

public abstract class BaseDisc {
    private int spinRateLowRange;
    private int spinRateHighRange;
    private int capacity;
    private String discType;
    private String name;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpinRateLowRange() {
        return spinRateLowRange;
    }

    public void setSpinRateLowRange(int spinRateLowRange) {
        this.spinRateLowRange = spinRateLowRange;
    }

    public int getSpinRateHighRange() {
        return spinRateHighRange;
    }

    public void setSpinRateHighRange(int spinRateHighRange) {
        this.spinRateHighRange = spinRateHighRange;
    }
}
