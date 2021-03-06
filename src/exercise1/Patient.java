package exercise1;

public class Patient {

    // variables

    private String patient_id;
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String province;
    private String postal_code;

    //constructor

    public Patient(String patient_id, String first_name, String last_name, String address, String city, String province, String postal_code) {
        this.patient_id = patient_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postal_code = postal_code;
    }

    //getter and setter methods

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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    //return patient information method

    public String getPatientInfo() {
        return "exercise1.Patient ID= " + getPatient_id() + "\n" + "First name= " + getFirst_name() + "\n" + "Last name= " + getLast_name() + "\n" + "Address= " + getAddress() + "\n" + "City= " + getCity() + "\n" + "Province= " + getProvince() + "\n" + "Postal Code= " + getPostal_code() + "\n";
    }
}
