package web.Model;

public class Car {
    private String brand;
    private String series;
    private int yearOfRelease;



    public Car() {
    }

    public Car(String brand, String series, int yearOfRelease) {
        this.brand = brand;
        this.series = series;
        this.yearOfRelease = yearOfRelease;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
