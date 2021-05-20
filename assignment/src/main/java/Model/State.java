package Model;

public class State {
    private int id;
    private String State;
    private int Cid;
    private String Country;

    public State(int id, String state, int cid, String country) {
        this.id = id;
        State = state;
        Cid = cid;
        Country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
