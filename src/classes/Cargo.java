package classes;

import java.util.HashSet;
import java.util.Set;

public class Cargo {
    private Long cargo_ID;
    private int count;
    private String name;
    private Unit unit;
    private Set Cargos = new HashSet();

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

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Set getCargos() {
        return Cargos;
    }

    public void setCargos(Set cargos) {
        Cargos = cargos;
    }
}
