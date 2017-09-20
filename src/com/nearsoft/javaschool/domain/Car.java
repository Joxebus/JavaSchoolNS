package com.nearsoft.javaschool.domain;

import com.nearsoft.javaschool.enums.CarType;

public class Car {

    private String plates;
    private CarType type;

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Car car = (Car) o;

        if (plates != null ? !plates.equals(car.plates) : car.plates != null)
            return false;
        return type == car.type;
    }

    @Override
    public int hashCode() {
        int result = plates != null ? plates.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
