package classes;

import java.util.Collection;

public class Cargo {
    private Long cargo_ID;
    private int count;
    private String name;
    private Collection<Unit> unit;

    public Cargo() {
    }

    public Long getCargo_ID() {
        return cargo_ID;
    }

    public void setCargo_ID(Long cargo_ID) {
        this.cargo_ID = cargo_ID;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//

    public Collection<Unit> getUnit() {
        return unit;
    }

    public void setUnit(Collection<Unit> unit) {
        this.unit = unit;
    }
}
