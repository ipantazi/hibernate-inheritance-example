package core.basesyntax.model.machine;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class Car extends Machine {
    private int horsePower;
    private String model;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{"
                + "id=" + super.getId()
                + ", year=" + super.getYear()
                + ", maker=" + super.getMaker()
                + ", horsePower=" + horsePower
                + ", model=" + model
                + '}';
    }
}
