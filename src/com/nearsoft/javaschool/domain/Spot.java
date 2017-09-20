package com.nearsoft.javaschool.domain;

public class Spot {

    private int numberOfSpot;
    private Car car;
    private boolean status; // busy true available false

    public int getNumberOfSpot() {
        return numberOfSpot;
    }

    public void setNumberOfSpot(int numberOfSpot) {
        this.numberOfSpot = numberOfSpot;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Spot spot = (Spot) o;

        if (numberOfSpot != spot.numberOfSpot)
            return false;
        if (status != spot.status)
            return false;
        return car != null ? car.equals(spot.car) : spot.car == null;
    }

    @Override
    public int hashCode() {
        int result = numberOfSpot;
        result = 31 * result + (car != null ? car.hashCode() : 0);
        result = 31 * result + (status ? 1 : 0);
        return result;
    }
}
