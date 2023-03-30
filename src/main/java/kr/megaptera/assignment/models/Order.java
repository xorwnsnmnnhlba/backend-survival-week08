package kr.megaptera.assignment.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class Order {

    @EmbeddedId
    private OrderId id;

    private String recipientName;

    @Embedded
    private Address address;

    private String recipientPhone;

    private LocalDateTime orderDateTime;

    private LocalDateTime recipientDateTime;

    private String userId;

    @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems = new ArrayList<>();

}
