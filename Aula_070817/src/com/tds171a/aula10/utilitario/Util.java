package com.tds171a.aula10.utilitario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util
{
    public static final String PADRAO_DATA = "dd/MM/yyyy";

    public static Date formataData(String dataFormatoString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(PADRAO_DATA);
        return sdf.parse(dataFormatoString);
    }

    public static String formataData(Date dataFormatoDate) {
        SimpleDateFormat sdf = new SimpleDateFormat(PADRAO_DATA);
        return sdf.format(dataFormatoDate);
    }
}
