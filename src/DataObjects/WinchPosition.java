/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObjects;

/**
 * This class stores info on the position of the winch
 *
 * @author dbennett3
 */
public class WinchPosition {
    String name;
    String runwayParent;
    int altitude;
    int latitude;
    int longitude;
    String optionalInfo;
    
    public WinchPosition(String name, String parent, int altitude, int latitude, int longitude, String optional) {
        this.name = name;
        this.runwayParent = parent;
        this.altitude = altitude;
        this.latitude = latitude;
        this.longitude = longitude;
        this.optionalInfo = optional;
    }
    
    public String getName() {
        return name;
    }
    
    public String getParent() {
        return runwayParent;
    }
    
    public int getAltitude() {
        return altitude;
    }
    
    public int getLatitude() {
        return latitude;
    }
    
    public int getLongitude() {
        return longitude;
    }
    
    public String getOptionalInfo() {
        return optionalInfo;
    }
}