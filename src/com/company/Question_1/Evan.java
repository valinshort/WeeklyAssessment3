package com.company.Question_1;

public class Evan {


    private String hair;
    private String shoes;

    public Evan() {
    }

    public Evan(String hair, String shoes, String friends) {
        this.hair = hair;
        this.shoes = shoes;
        this.friends = friends;

    }

    public String getHair() {

        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public String getFriends() {
        return friends;
    }

    public void setFriends(String friends) {
        this.friends = friends;
    }

    private String friends;
}
