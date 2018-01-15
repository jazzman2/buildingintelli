package sk.jazzman.buildingintelli.domain;

import java.sql.Timestamp;

/**
 * Measured value
 */
public class ItMeasured extends It {
    private final Double valueMeasured;
    private final Double valueTransformed;
    private final String unitMeasured;
    private final String unitTransformed;
    private final Timestamp logDate;

    public ItMeasured(Long id, Double valueMeasured, Double valueTransformed, String unitMeasured, String unitTransformed, Timestamp logDate) {
        super(id);
        this.valueMeasured = valueMeasured;
        this.valueTransformed = valueTransformed;
        this.unitMeasured = unitMeasured;
        this.unitTransformed = unitTransformed;
        this.logDate = logDate;
    }

    public Double getValueMeasured() {
        return valueMeasured;
    }

    public Double getValueTransformed() {
        return valueTransformed;
    }

    public Timestamp getLogDate() {
        return logDate;
    }

    public String getUnitMeasured() {
        return unitMeasured;
    }

    public String getUnitTransformed() {
        return unitTransformed;
    }
}
