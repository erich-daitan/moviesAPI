package br.com.maykmoreira.apiexample.customException;

public class MovieNotFoundException extends Exception{
    public MovieNotFoundException(String message){
        super(message);
    }
}
