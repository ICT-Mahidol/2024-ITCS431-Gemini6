package com.example.demo.model;
public class SciencePlanRequest {
    public String creator;
    public String submitter;
    public double fundingInUSD;
    public String objectives;
    public String starSystem;
    public String startDate;
    public String endDate;
    public String telescopeLocation;

    public String fileType;
    public String fileQuality;
    public String colorType;
    public double contrast;
    public double brightness;
    public double saturation;
    public double highlights;
    public double exposure;
    public double shadows;
    public double whites;
    public double blacks;
    public double hue;
    public double sharpness;

    public void setCreator(String username) {
    }

    public String getCreator() {
        return creator;
    }

}
