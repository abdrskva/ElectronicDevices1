package com.example.electronicdevices1;

public class Laptop extends Device {
    private int ramSize;
    private String processorType;

    public Laptop(String name, double price, double weight, int ramSize, String processorType) {
        super(DeviceType.LAPTOP, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    // Getters and setters
    public int getRamSize() { return ramSize; }
    public void setRamSize(int ramSize) { this.ramSize = ramSize; }

    public String getProcessorType() { return processorType; }
    public void setProcessorType(String processorType) { this.processorType = processorType; }
}
