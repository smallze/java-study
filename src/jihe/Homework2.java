package jihe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zzs
 * @date 2021/7/14 8:28
 */
public class Homework2 {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", new BigDecimal(300000)));
        carList.add(new Car("奥迪", new BigDecimal(200000)));
        carList.add(new Car("奔驰", new BigDecimal(500000)));
        System.out.println(carList);
        carList.remove(0);
        System.out.println("remove 0" + carList);
        System.out.println("contains 奥迪？ " + carList.contains(new Car("奥迪", new BigDecimal(200000))));
        System.out.println("carlist is empty?" + carList.isEmpty());
        carList.clear();
        System.out.println("carlist clear" + carList);
        List<Car> newCarList = new ArrayList<>();
        newCarList.add(new Car("凯迪拉克", new BigDecimal(200000)));
        newCarList.add(new Car("法拉利", new BigDecimal(2000000)));
        carList.addAll(newCarList);
        System.out.println("addAll " + newCarList);
        System.out.println(carList.containsAll(carList));
        carList.removeAll(carList);
        System.out.println("removeAll" + carList);
    }
}

class Car {
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Car(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        return price != null ? price.equals(car.price) : car.price == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}