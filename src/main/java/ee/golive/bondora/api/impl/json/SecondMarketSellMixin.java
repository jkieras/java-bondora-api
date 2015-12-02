package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonProperty;

abstract class SecondMarketSellMixin extends BondoraObjectMixin {

    @JsonProperty("LoanPartId")
    private String loanPartId;

    @JsonProperty("DesiredDiscountRate")
    private Integer desiredDiscountRate;
}