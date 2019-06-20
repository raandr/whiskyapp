package com.example.whisky;

import java.time.Year;
import java.time.YearMonth;
import java.util.Date;
import java.util.Locale;

public abstract class Drink {
    protected Drink() {
    }

    public enum DrinkType {
        WHISKY,
        RUM,
        WINE,
        BEER,
        SAUTERN,
        PORT_WINE,
        UNKNOWN
    }

    protected Locale locale;

    protected String drinkFullName;
    protected DrinkType drinkType;
    protected Date bottlingDate;
    protected Year bottlingYear;
    protected YearMonth bottlingYearMonth;

    public enum DatingAccuracy {
        DATE,
        YEAR,
        YEAR_MONTH
    }

    private DatingAccuracy datingAccuracy;

    public DatingAccuracy getDatingAccuracy() {
        return datingAccuracy;
    }



    public void Drink() {
        drinkType = DrinkType.UNKNOWN;
        locale = Locale.UK;

    }
}
