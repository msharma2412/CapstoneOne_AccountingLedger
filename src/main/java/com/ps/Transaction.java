package com.ps;
import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction{
    ///then we need to add them
    //this adds them. You would have to get info from the csv file and map it to the transaction array list option.

    private LocalDate date;
    private LocalTime time;
    private String name;
    private Double amount;
    private String debitInfo;

    public Transaction(LocalDate date, LocalTime time, String name, Double amount, String debitInfo) {
        this.date = date;
        this.time = time;
        this.name = name;
        this.amount = amount;
        this.debitInfo = debitInfo;

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDebitInfo() {
        return debitInfo;
    }

    public void setDebitInfo(String debitInfo) {
        this.debitInfo = debitInfo;
    }



    }
}
