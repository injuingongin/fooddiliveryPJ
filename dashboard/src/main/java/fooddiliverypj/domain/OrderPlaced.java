package fooddiliverypj.domain;

import fooddiliverypj.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodId;
    private List<String> options;
    private String address;
    private String customerId;
    private String storeId;
}
