package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    //2. —оздайте модель Car с трем€ произвольными пол€ми.
    private String manufacturer;

    private int series;

    private String color;

    public Car() {

    }

    public Car(String manufacturer, int series, String color) {
        this.manufacturer = manufacturer;
        this.series = series;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
