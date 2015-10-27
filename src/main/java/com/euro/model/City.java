package com.euro.model;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Vaibhav Dwivedi
 */
public class City {
    
    private String _id;
    private String key;
    private String name;
    private String fullName;
    private String iata_airport_code;
    private String type;
    private String country;
    private geoPosition geo_position;
    private String locationId;
    private boolean inEurope;
    private String countryCode;
    private boolean coreCountry;
    private String distance;

    public City() {
    }

    @JsonCreator
    public City(@JsonProperty("_id") String _id, 
                @JsonProperty("key") String key, 
                @JsonProperty("name") String name, 
                @JsonProperty("fullName") String fullName, 
                @JsonProperty("iata_airport_code") String iata_airport_code, 
                @JsonProperty("type") String type, 
                @JsonProperty("country") String country, 
                @JsonProperty("geo_position") geoPosition geo_position, 
                @JsonProperty("locationId") String locationId, 
                @JsonProperty("inEurope") boolean inEurope, 
                @JsonProperty("countryCode") String countryCode, 
                @JsonProperty("coreCountry") boolean coreCountry, 
                @JsonProperty("distance") String distance) {
        this._id = _id;
        this.key = key;
        this.name = name;
        this.fullName = fullName;
        this.iata_airport_code = iata_airport_code;
        this.type = type;
        this.country = country;
        this.geo_position = geo_position;
        this.locationId = locationId;
        this.inEurope = inEurope;
        this.countryCode = countryCode;
        this.coreCountry = coreCountry;
        this.distance = distance;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIata_airport_code() {
        return iata_airport_code;
    }

    public void setIata_airport_code(String iata_airport_code) {
        this.iata_airport_code = iata_airport_code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public geoPosition getGeo_position() {
        return geo_position;
    }

    public void setGeo_position(geoPosition geo_position) {
        this.geo_position = geo_position;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public boolean isInEurope() {
        return inEurope;
    }

    public void setInEurope(boolean inEurope) {
        this.inEurope = inEurope;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isCoreCountry() {
        return coreCountry;
    }

    public void setCoreCountry(boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
    
    
    public static class geoPosition {
    
    private String latitude;
    private String longitude;

    public geoPosition() {
    }
    
    
    @JsonCreator
    public geoPosition(@JsonProperty("latitude") String latitude,
                        @JsonProperty("longitude") String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    
    
    
    
}

    
    
    
}
