package org.mysqltutorial.mysqltutorialorgspringapp.orderdetails;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.mysqltutorial.mysqltutorialorgspringapp.orders.OrderEntity;
import org.mysqltutorial.mysqltutorialorgspringapp.products.ProductEntity;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "orderdetails")
public class OrderDetailsEntity {

    @EmbeddedId
    private OrderDetailsEntityEmbeddedId embeddedId;

    @ManyToOne
    @MapsId("orderNumber")
    @JoinColumn(name = "order_number")
    private OrderEntity order;

    @ManyToOne
    @MapsId("productCode")
    @JoinColumn(name = "product_code")
    private ProductEntity product;

    @Column(name = "quantity_ordered")
    private int quantityOrdered;

    @Column(name = "price_each")
    private BigDecimal priceEach;

    @Column(name = "order_line_number")
    private int orderLineNumber;
}
