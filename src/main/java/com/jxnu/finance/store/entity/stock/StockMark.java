package com.jxnu.finance.store.entity.stock;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Setter
@Getter
@ToString
public class StockMark {
    private String stockCode;
    private String stockName;
    private String pe;
    private String pb;
    private String stockUrl;
    private Date createTime;
    private String totalMarketValue;   //总市值
    private String netWorth;           //净资产
    private String netProfit;          //净利润
    private String grossProfitMargin;  //毛利率
    private String netInterestRate;    //净利率
    private String roe;                //ROE
    private String subject;            //行业
    private String price;
    private String futurePrice;        //未来价格
    private String totalShare;         //总份额
    private String shareOut;           //股息
    private String shareOutRatio;      //股息率
    private int quarter;               //季度
}
