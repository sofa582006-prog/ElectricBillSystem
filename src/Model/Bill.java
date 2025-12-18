/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author yousef
 */
public class Bill {
    private String billId;
    private String meterCode;
    private String month;
    private String year;
    private double reading;
    private double consumption;
    private double amount;
    private boolean paid;

    public Bill(String billId, String meterCode,String year, String month, double reading,
                double consumption, double amount, boolean paid) {

        this.billId = billId;
        this.meterCode = meterCode;
        this.month = month;
        this.year = year;
        this.reading = reading;
        this.consumption = consumption;
        this.amount = amount;
        this.paid = paid;
    }

    @Override
    public String toString() {
        return billId + "|" + meterCode + "|"+year+ "|"+ month + "|" + reading + "|" +
                consumption + "|" + amount + "|" + paid;
    }
    public void setPaid(boolean paid) {
    this.paid = paid;
}

public boolean isPaid() {
    return paid;
}

public double getAmount() {
    return amount;
}
public void setAmount(double amount)
    {
        this.amount=amount;
    }

public void updateReading(double newReading) {
    this.reading = newReading;
}
public String getBillId() { return billId; }
public String getMeterCode() { return meterCode; }
public String getYear() {return year;}
public String getMonth() { return month; }
public double getReading() { return reading; }
public double getConsumption() { return consumption; }
}

/*   // شكل   (file)
billId|meterCode|year|month|reading|consumption|amount|paid
1001|1022|2025-01|380|60|120.5|false
1002|8841|2025-01|30|30|22.5|true
1003|1022|2025-02|420|40|85|false

*/
