package domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String addressId;
    private String city;
}
