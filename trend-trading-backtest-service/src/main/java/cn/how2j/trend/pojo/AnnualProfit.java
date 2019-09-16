package cn.how2j.trend.pojo;

import lombok.Data;

@Data
public class AnnualProfit {
 
    private int year;
    private float indexIncome;
    private float trendIncome;
    @Override
    public String toString() {
        return "AnnualProfit [year=" + year + ", indexIncome=" + indexIncome + ", trendIncome=" + trendIncome + "]";
    }
     
}