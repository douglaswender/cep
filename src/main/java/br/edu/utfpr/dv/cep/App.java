package br.edu.utfpr.dv.cep;

import javax.xml.ws.Endpoint;

public class App 
{
    public static void main( String[] args )
    {
    	Endpoint.publish("http://localhost:8080/cep", null);
    }
}
