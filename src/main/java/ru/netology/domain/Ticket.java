package ru.netology.domain;

public class Ticket implements Comparable<Ticket> {
    protected int id;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    protected int price;
    protected String from;
    protected String to;
    protected double time;


    public Ticket(int id, int price, String from, String to, double time) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.time = time;
    }


    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        }
        if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
