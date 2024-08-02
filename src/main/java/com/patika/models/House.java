package com.patika.models;

public class House {
    private String type;
    private double price;
    private double size;
    private int rooms;
    private int halls;

    public House(String type, double price, double size, int rooms, int halls) {
        this.type = type;
        this.price = price;
        this.size = size;
        this.rooms = rooms;
        this.halls = halls;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    public int getRooms() {
        return rooms;
    }

    public int getHalls() {
        return halls;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", rooms=" + rooms +
                ", halls=" + halls +
                '}';
    }
}
