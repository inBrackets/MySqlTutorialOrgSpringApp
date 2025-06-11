package org.mysqltutorial.mysqltutorialorgspringapp.orders;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date orderDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date requiredDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date shippedDate;
    private String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String comments;
    private Long customerNumber;
}