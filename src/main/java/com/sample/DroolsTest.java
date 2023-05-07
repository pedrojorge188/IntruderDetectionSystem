package com.sample;

import java.io.FileInputStream;
import java.util.Scanner;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsTest {

    public static final void main(String[] args) {
    	try {
    		
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	//Pergunta numero de telefone e numero do contrato do Dono
        	Scanner palavra = new Scanner(System.in, "ISO-8859-1");
        	
        	//System.out.println("Numero do Contrato: ");
            String Contrato = "123";	//palavra.nextLine();
            //System.out.println("Numero de telefone: ");
            String Telefone = "961726421";	//palavra.nextLine();

        	// Cria os objetos      	
        	Scanner ler = new Scanner(new FileInputStream("Objects1.txt"));
        	String linha = ler.nextLine();
        	
        	while(ler.hasNextLine()) {
        		linha = ler.nextLine();
        		String [] temp = linha.split(";");
        		
        		HouseSection hs = new HouseSection(temp[0]);
        		
        		kSession.insert(hs);
        		
        		if(temp[1].equals("sim")) {
        			Animal an = new Animal(hs);
        			kSession.insert(an);
        			
	        		if(temp[2].equals("sim")) {
	        			Collar cl = new Collar(an);
	        			kSession.insert(cl);
	        		}
        		}
        		
        		if(temp[3].equals("sim")) {
        			Camera cm = new Camera(true, hs);
        			kSession.insert(cm);
        		}
        		
        		if(temp[4].equals("sim")) {
        			if(temp[5].equals("sim")) {
        				Outsider out = new Outsider(hs, true);
        				kSession.insert(out);
        			}
        			else {
        				Outsider out = new Outsider(hs, false);
        				kSession.insert(out);
        			}
        		}
        		
        		if(temp[6].equals("sim")) {
        			Owner ow = new Owner(hs, Telefone, Contrato);
        			kSession.insert(ow);
        		}
        		
        		
        		if(temp[7].equals("sim")) {
        			Sensor sen = new Sensor(true, hs);
        			kSession.insert(sen);
        		}
        	}
        	
        	// Dispara as regras
        	kSession.fireAllRules();

        	// Fecha a sessão
        	kSession.dispose();
        	
        	
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
