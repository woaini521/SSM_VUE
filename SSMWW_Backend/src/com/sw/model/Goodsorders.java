package com.sw.model;

import java.math.BigDecimal;
import java.util.Date;

public class Goodsorders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorders.orderid
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    private Integer orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorders.ordercode
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    private String ordercode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorders.confirmdate
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    private Date confirmdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorders.countprice
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    private BigDecimal countprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorders.saleid
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    private Integer saleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorders.addressid
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    private Integer addressid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goodsorders.orderstate
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    private String orderstate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorders.orderid
     *
     * @return the value of goodsorders.orderid
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public Integer getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorders.orderid
     *
     * @param orderid the value for goodsorders.orderid
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorders.ordercode
     *
     * @return the value of goodsorders.ordercode
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public String getOrdercode() {
        return ordercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorders.ordercode
     *
     * @param ordercode the value for goodsorders.ordercode
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorders.confirmdate
     *
     * @return the value of goodsorders.confirmdate
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public Date getConfirmdate() {
        return confirmdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorders.confirmdate
     *
     * @param confirmdate the value for goodsorders.confirmdate
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public void setConfirmdate(Date confirmdate) {
        this.confirmdate = confirmdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorders.countprice
     *
     * @return the value of goodsorders.countprice
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public BigDecimal getCountprice() {
        return countprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorders.countprice
     *
     * @param countprice the value for goodsorders.countprice
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public void setCountprice(BigDecimal countprice) {
        this.countprice = countprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorders.saleid
     *
     * @return the value of goodsorders.saleid
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public Integer getSaleid() {
        return saleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorders.saleid
     *
     * @param saleid the value for goodsorders.saleid
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public void setSaleid(Integer saleid) {
        this.saleid = saleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorders.addressid
     *
     * @return the value of goodsorders.addressid
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorders.addressid
     *
     * @param addressid the value for goodsorders.addressid
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goodsorders.orderstate
     *
     * @return the value of goodsorders.orderstate
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public String getOrderstate() {
        return orderstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goodsorders.orderstate
     *
     * @param orderstate the value for goodsorders.orderstate
     *
     * @mbg.generated Sun Sep 02 15:46:59 CST 2018
     */
    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
    }
}