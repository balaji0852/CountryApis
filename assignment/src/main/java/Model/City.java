package Model;

public class City {
    private int id;
    private String city;
    private int cid;
    private int sid;
    private String State;


    public City(int id, String city, int cid, int sid, String state) {
        this.id = id;
        this.city = city;
        this.cid = cid;
        this.sid = sid;
        State = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
