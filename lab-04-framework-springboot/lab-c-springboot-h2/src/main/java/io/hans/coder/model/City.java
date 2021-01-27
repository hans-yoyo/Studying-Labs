package io.hans.coder.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * @描述 TODO 类描述
 * @author Hans
 * @created 2021/01/23 16:10
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class City {

    private Long id;

    private String name;

    private int population;

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        City city = (City) obj;

        return population == city.population &&
                Objects.equals(id, city.id) &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, population);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", City.class.getSimpleName() + "[", "]")
                .add("id = " + id)
                .add("name = " + name)
                .add("population = " + population)
                .toString();
    }
}
