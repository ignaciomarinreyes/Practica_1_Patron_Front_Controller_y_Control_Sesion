package business;

public class Address {
    private String street;
    private String number;
    private String cp;
    private String locality;
    private String autonomousCommunity;

    public Address(String street, String number, String cp, String locality, String autonomousCommunity) {
        this.street = street;
        this.number = number;
        this.cp = cp;
        this.locality = locality;
        this.autonomousCommunity = autonomousCommunity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getAutonomousCommunity() {
        return autonomousCommunity;
    }

    public void setAutonomousCommunity(String autonomousCommunity) {
        this.autonomousCommunity = autonomousCommunity;
    }
  
}
