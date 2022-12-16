package seminar6;

public class Notebook {
    private int id;
    private String brand;
    private int ram;
    private int hdd;
    private String os;

    public Notebook (int id, String brand, int ram, int hdd, String os) {
        this.id = id;
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    }

    public String printf() {
        return String.format("id: %d, brand: %s, ram: %d, hdd: %d, os: %s", 
            this.id, this.brand, this.ram, this.hdd, this.os);
    }

    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public int getHdd() {
        return hdd;
    }

    public int getRam() {
        return ram;
    }
}
