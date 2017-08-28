package com.tds171a.aula10.utilitario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util
{
    public static final String PADRAO_DATA = "dd/MM/yyyy";

    public static Date formataData(String dataFormatoString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(PADRAO_DATA);
        sdf.setLenient(false);
        return sdf.parse(dataFormatoString);
    }

    public static String formataData(Date dataFormatoDate) {
//        return new SimpleDateFormat(PADRAO_DATA).format(dataFormatoDate);
        return new SimpleDateFormat("dd/MM/yyyy EEE").format(dataFormatoDate);
    }
}
