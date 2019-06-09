package dev.docbot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
@RestController
public class OrderController {
    @GetMapping("/api/queryOrder")
    public List<String> queryOrder() throws InterruptedException {
        Thread.sleep(ThreadLocalRandom.current().nextInt(2000));
        return Collections.EMPTY_LIST;
    }
    @GetMapping("/api/createOrder")
    public void createOrder() throws InterruptedException {
        Thread.sleep(ThreadLocalRandom.current().nextInt(2000));
    }
    @GetMapping("/api/orderDetail")
    public void orderDetail() throws InterruptedException {

    }
    @GetMapping("/api/exportOrders")
    public void exportOrders() throws InterruptedException {
        Thread.sleep(ThreadLocalRandom.current().nextInt(3000));
    }
}
