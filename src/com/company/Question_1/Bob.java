package com.company.Question_1;

public class Bob extends Evan  {




    public Bob(String hair, String shoes, String hobbies) {
        this.hair = hair;
        this.shoes = shoes;
        this.hobbies = hobbies;
    }

    public Bob() {
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

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    private String hair;
    private String shoes;
    private String hobbies;

}
