package com.example.typhoon.bean;

import java.sql.Timestamp;

public class TpEntity {
    private double centerlng;
    private double centerlat;
    private double lng;
    private double lat;
    private String movedirection;
    private String movespeed;
    private Integer power;
    private Integer pressure;
    private Integer speed;
    private String strong;
    private String name;
    private Timestamp time;
    private Integer timeNumber;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public double getCenterlng(){
        return centerlng;
    }
    public double getCenterlat(){
        return centerlat;
    }
    public double getLng(){
        return lng;
    }
    public double getLat(){
        return lat;
    }
    public String getMovedirection(){
        return movedirection;
    }
    public String getMovespeed(){
        return movespeed;
    }
    public String getStrong(){
        return strong;
    }
    public String getName(){
        return name;
    }
    public Integer getPower(){
        return power;
    }
    public Integer getPressure(){
        return pressure;
    }
    public Integer getSpeed(){
        return speed;
    }
    public Integer getTimeNumber(){
        return timeNumber;
    }
    public Timestamp getTime(){
        return time;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCenterlat(double centerlat) {
        this.centerlat = centerlat;
    }

    public void setCenterlng(double centerlng) {
        this.centerlng = centerlng;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setMovedirection(String movedirection) {
        this.movedirection = movedirection;
    }

    public void setMovespeed(String movespeed) {
        this.movespeed = movespeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public void setStrong(String strong) {
        this.strong = strong;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public void setTimeNumber(Integer timeNumber) {
        this.timeNumber = timeNumber;
    }

}
