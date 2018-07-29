package za.co.technical.assessment.illustration.dto;

public class ServerLocation {

    private String countryCode;
    private String countryName;
    private String region;
    private String regionName;
    private String city;
    private String postalCode;
    private String latitude;
    private String longitude;


    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }
    public String getRegion() {
        return region;
    }
    public String getRegionName() {
        return regionName;
    }
    public String getCity() {
        return city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getLatitude() {
        return latitude;
    }
    public String getLongitude() {
        return longitude;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


}
