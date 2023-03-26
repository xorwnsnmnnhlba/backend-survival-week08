package kr.megaptera.assignment.models;

import com.github.f4b6a3.tsid.TsidCreator;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ProductId implements Serializable {

    private String id;

    public static ProductId of(String id) {
        return new ProductId(id);
    }

    public static ProductId generate() {
        return new ProductId(TsidCreator.getTsid().toString());
    }

    @Override
    public String toString() {
        return id;
    }

}