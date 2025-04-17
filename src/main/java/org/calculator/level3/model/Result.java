package org.calculator.level3.model;

import org.calculator.level3.enums.OperatorType;

public record Result(Number firstValue, Number secValue, OperatorType type, Number result) {
}
