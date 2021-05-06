package edu.handong.csee.java.hw2.converters;

/**
 * A class built on 'Convertible' interface.
 * When this class gets the value of KM, it changes to the value of M and returns it.
 * @author YunSeok Jeong
 * @see Convertible
 */
public class KMToMConverter implements Convertible {
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
     * This method convert KM value to M value.
     */
    public void convert() {
        this.value = this.value * 1000;
    }
}