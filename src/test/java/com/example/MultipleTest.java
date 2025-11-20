package com.example;

import io.qase.junit5.QaseId;
import io.qase.junit5.QaseIds;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultipleTest{

    @Test
    @QaseIds({1,2.3})
    public void testWithMultipleIds() {
        // Example test logic
        int sum = 2 + 3;
        
        // Simple assertion
        assertTrue(sum == 5, "Sum should be 5");
    }
}    