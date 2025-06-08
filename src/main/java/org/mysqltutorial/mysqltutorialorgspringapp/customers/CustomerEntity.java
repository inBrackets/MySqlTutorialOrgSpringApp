package org.mysqltutorial.mysqltutorialorgspringapp.customers;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.mysqltutorial.mysqltutorialorgspringapp.orders.OrderEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_number")
    private int customerNumber;

    @Column(name = "customer_name")
    private String customer_name;

    @Column(name = "contact_last_name")
    private String contact_last_name;

    @Column(name = "contact_first_name")
    private String contact_first_name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private String postal_code;

    @Column(name = "country")
    private String country;

    @Column(name = "sales_rep_employee_number")
    Integer sales_rep_employee_number;

    @Column(name = "credit_limit")
    private BigDecimal credit_limit;

    @OneToMany(mappedBy = "customer")
    @Builder.Default
    private List<OrderEntity> orders = new ArrayList<OrderEntity>();

}
