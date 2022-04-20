package com.springframework.msscbeerservices.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedFate;

    private String Name;
    private BeerStyleEnum Beerstyle;

    private Long upc;

    private BigDecimal price;

    private Integer qunatityOnHand;

}
