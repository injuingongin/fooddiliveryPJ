package fooddiliverypj.domain;

import fooddiliverypj.domain.*;
import fooddiliverypj.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Picked extends AbstractEvent {

    private Long id;
}
