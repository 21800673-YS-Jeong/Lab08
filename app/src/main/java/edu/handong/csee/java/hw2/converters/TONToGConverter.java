package edu.handong.csee.java.hw2.converters;

/**
 * A class built on 'Convertible' interface.
 * When this class gets the value of TON, it changes to the value of G and returns it.
 * @author YunSeok Jeong
 * @see Convertible
 */
public class TONToGConverter implements Convertible {
    private double value;

    /**
     * This method sets value.
     * @param fromValue a number for converting
     */
    public void setFromValue(double fromValue) {
        this.value = fromValue;
    }

    /**
     * This method returns value.
     * @return value
     */
    public double getConvertedValue() {
        return this.value;
    }

    /**
     * This method convert TON value to G value.
     */
    public void convert() {
        this.value = this.value * 1000000;
    }
}