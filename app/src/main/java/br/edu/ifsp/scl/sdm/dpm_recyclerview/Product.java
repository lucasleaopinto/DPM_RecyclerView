package br.edu.ifsp.scl.sdm.dpm_recyclerview;

public class Product {

    private int id;
    private String title;
    private String shortdesc;
    private double rate;
    private double price;
    private int image;

    public Product(int id, String title, String shortdesc, double rate, double price, int image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rate = rate;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public double getRate() {
        return rate;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
