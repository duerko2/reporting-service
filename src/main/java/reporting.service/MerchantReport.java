package reporting.service;

import java.util.List;

public class MerchantReport {

    private List<Payment> paymentList;
    public List<Payment> getPaymentList() {return paymentList;}
    public void setPaymentList(List<Payment> paymentList) {this.paymentList = paymentList;}

}
