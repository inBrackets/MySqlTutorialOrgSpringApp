package org.mysqltutorial.mysqltutorialorgspringapp.orders;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private long orderNumber;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String comments;
    private Long customerNumber;
}