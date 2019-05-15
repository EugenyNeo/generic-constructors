package generic;

import java.io.Serializable;

public class Entry {
    private String data;
    private int rank;

    public String getData() {
        return data;
    }

    public <E extends Rankable & Serializable> Entry(E element) {
        this.data = element.toString();
        this.rank = element.getRank();
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Entry(String data, int rank) {
        this.data = data;
        this.rank = rank;


    }
}
