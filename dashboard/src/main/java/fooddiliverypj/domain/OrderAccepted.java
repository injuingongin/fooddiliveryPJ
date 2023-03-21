package fooddiliverypj.domain;

import fooddiliverypj.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private List<String> options;
    private String storeId;
    private String customerId;
}
