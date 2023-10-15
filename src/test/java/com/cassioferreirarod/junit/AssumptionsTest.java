package com.cassioferreirarod.junit;

import static org.junit.jupiter.api.Assumptions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
    @Test
    void validarAlgoSomenteNoUsuarioCassio() {
        assumeFalse("cassi".equals(System.getenv("USER")));
        assertEquals(10,5+5);
    }
}