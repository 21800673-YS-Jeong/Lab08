package edu.handong.csee.java.hw2.converters;

/**
 * This is interface for converters
 * @author YunSeok Jeong
 */
public interface Convertible {
    /**
     * This method sets value.
     * @param fromValue a number for conversting
     */
    public void setFromValue(double fromValue);

    /**
     *This method returns value.
     * @return value
     */
    public double getConvertedValue();

    /**
     * This method converts a unit into the other unit.
     */
    public void convert();

}