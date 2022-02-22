package NewBank;

import java.util.Date;

public class User {
    private String purpose;
    private Date date;
    private int numb;
    private String pasport;

    public User () {}
    public void setPasport (String data) {
        this.purpose = data;
    }
    public void start () {}
    public void SendForm (String purpose, Date date) {}
    public void setNumb(int numb) {
        this.numb = numb;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    public String getPurpose() {
        return purpose;
    }
    public Date getDate() {
        return date;
    }
    public int getNumb() {
        return numb;
    }
}