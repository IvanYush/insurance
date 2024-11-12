package com.javacademy.insurance;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

/**
 * Страховой договор
 */
public class InsuranceContract {
    private Integer number; //номер договора
    private BigDecimal price = ZERO; //стоимость страховки
    private BigDecimal amountOfCoverage = ZERO; //сумма покрытия
    private String currency; //валюта договора
    private String name; //ФИО клиента
    private String country; //страна действия
    private String typeOfInsurance; //тип страховки: медицинское страхование или защита от грабежа
    private boolean isPaid; //оплачен или нет


}
