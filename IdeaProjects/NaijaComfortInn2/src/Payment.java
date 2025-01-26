import java.util.Date;

public class Payment {
    private String paymentId;
    private String amount;
    private Date paymentDate;
    private String roomtype;
    private boolean paymentStatus;


    public Payment(String paymentId, String amount, Date paymentDate, String roomtype, boolean paymentStatus) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.roomtype = roomtype;
        this.paymentStatus = paymentStatus;
    };

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}

