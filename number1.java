import javax.xml.crypto.Data;
import java.util.Date;

public class number1 {
    private Integer id;
    private Date moment;
    private Order Status;

    @Override
    public String toString() {
        return "number1{" +
                "id=" + id +
                ", moment=" + moment +
                ", Status=" + Status +
                '}';
    }

    public number1(){

    }
    public number1(Integer id, Date moment, Order status) {
        this.id = id;
        this.moment = moment;
        Status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Order getStatus() {
        return Status;
    }

    public void setStatus(Order status) {
        Status = status;
    }
}
