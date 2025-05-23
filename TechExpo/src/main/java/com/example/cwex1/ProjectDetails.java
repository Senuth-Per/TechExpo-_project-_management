package com.example.cwex1;

import javafx.scene.image.Image;

public class ProjectDetails {
    private final int P_ID;
    private final String P_Name;
    private final String PCAT;
    private final String P_Team;
    private final String P_Des;
    private final String P_Country;
    private Image Logo;


    public ProjectDetails(int P_ID, String P_Name, String PCAT, String P_Team, String P_Des, String P_Country, Image Logo) {
        this.P_ID = P_ID;
        this.P_Name = P_Name;
        this.PCAT = PCAT;
        this.P_Team = P_Team;
        this.P_Des = P_Des;
        this.P_Country = P_Country;
        this.Logo = Logo;
    }
    public int getP_ID() {
        return P_ID;
    }
    public String getP_Name() {
        return P_Name;
    }
    public String getPCAT() {
        return PCAT;
    }
    public String getP_Team() {
        return P_Team;
    }
    public String getP_Des() {
        return P_Des;
    }
    public String getP_Country() {
        return P_Country;
    }
    public Image getLogo() {
        return Logo;
    }
}
