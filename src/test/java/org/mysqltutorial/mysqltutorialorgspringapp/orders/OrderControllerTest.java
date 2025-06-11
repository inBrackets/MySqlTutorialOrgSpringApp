package org.mysqltutorial.mysqltutorialorgspringapp.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;
import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Tests for {@link OrderController }
 */
@WebMvcTest(OrderController.class)
@Import(OrderControllerTestConfig.class)
class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private OrderService orderService;

    @Test
    void testGetOrderById_shouldReturnOrderWhenFound() throws Exception {
        OrderDto dto = OrderDto.builder()
                .orderNumber(123)
                .orderDate(new Date())
                .status("SHIPPED")
                .comments("Fast delivery")
                .build();

        when(orderService.getOrderById(123L)).thenReturn(Optional.of(dto));

        mockMvc.perform(get("/orders/id/123"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.orderNumber").value(dto.getOrderNumber()))
                .andExpect(jsonPath("$.status").value(dto.getStatus()))
                .andExpect(jsonPath("$.comments").value(dto.getComments()));
    }

    @Test
    void testGetOrderById_shouldReturn404WhenNotFound() throws Exception {
        when(orderService.getOrderById(999L)).thenReturn(Optional.empty());

        mockMvc.perform(get("/orders/id/999"))
                .andExpect(status().isNotFound());
    }
}