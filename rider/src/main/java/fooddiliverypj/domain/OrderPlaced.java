package fooddiliverypj.domain;

import fooddiliverypj.domain.*;
import fooddiliverypj.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodId;
    private Object options;
    private String address;
    private String customerId;
    private String storeId;
}
