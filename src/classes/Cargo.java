package classes;

import java.util.HashSet;
import java.util.Set;

public class Cargo {
    private Long id;
    private int count;
    private String name;
    private Unit unit;
    private Set Cargos = new HashSet();

    public Cargo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
