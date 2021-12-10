package tm;

public class CustomerTM {
    private String cid;
    private String name;
    private String address;
    private String contact;

    public CustomerTM(String cid, String name, String address, String contact) {
        this.cid = cid;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public CustomerTM() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
