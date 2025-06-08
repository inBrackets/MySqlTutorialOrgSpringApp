package org.mysqltutorial.mysqltutorialorgspringapp.customers;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "customerNumber=" + customerNumber +
                ", customer_name='" + customer_name + '\'' +
                ", contact_last_name='" + contact_last_name + '\'' +
                ", contact_first_name='" + contact_first_name + '\'' +
                ", phone='" + phone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", country='" + country + '\'' +
                ", sales_rep_employee_number=" + sales_rep_employee_number +
                ", credit_limit=" + credit_limit +
                '}';
    }
}
