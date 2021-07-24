package br.edu.utfpr.dv.cep;

import javax.xml.ws.Endpoint;

import br.edu.utfpr.dv.cep.service.CepServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	Endpoint.publish("http://localhost:3000/cep", new CepServiceImpl());
    }
}
