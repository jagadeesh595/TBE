package com.ns.tbe.model.relationships;

import org.neo4j.springframework.data.core.schema.RelationshipProperties;

@RelationshipProperties
public class BonusPeriod {
    private int processingYear;
    private int processingMonth;
    private int processingCycle;

    public int getProcessingYear() {
        return processingYear;
    }

    public void setProcessingYear(int processingYear) {
        this.processingYear = processingYear;
    }

    public int getProcessingMonth() {
        return processingMonth;
    }

    public void setProcessingMonth(int processingMonth) {
        this.processingMonth = processingMonth;
    }

    public int getProcessingCycle() {
        return processingCycle;
    }

    public void setProcessingCycle(int processingCycle) {
        this.processingCycle = processingCycle;
    }
}
