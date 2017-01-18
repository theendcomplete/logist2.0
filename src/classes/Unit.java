package classes;

import java.util.HashSet;
import java.util.Set;

public class Unit {
    private Long id;
    private String name;
    private Set Units = new HashSet();

    public Unit() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getUnits() {
        return Units;
    }

    public void setUnits(Set units) {
        Units = units;
    }
}
