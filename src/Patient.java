public class Patient {
    private String patient_id;
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String porvince;
    private String postal_code;

    public Patient(String patient_id, String first_name, String last_name, String address, String city, String porvince, String postal_code) {
        this.patient_id = patient_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.porvince = porvince;
        this.postal_code = postal_code;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPorvince() {
        return porvince;
    }

    public void setPorvince(String porvince) {
        this.porvince = porvince;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
    
}
