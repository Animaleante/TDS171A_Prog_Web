package com.tds171a.aula14.exceptions;

@SuppressWarnings("serial")
public class InvalidDividerException extends Exception
{
    public InvalidDividerException()
    {
        super("Divisor inválido.");
    }

    public InvalidDividerException(String message)
    {
        super(message);
    }
}
