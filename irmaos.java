package Pacote;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Irmaos {

	public static void main(String[] args) {
		List<Integer> irmaosNaHora = leArquivo("C:\\Workspace\\Eclipse\\atividade_26.09\\src\\Pacote\\numero");
		String irmaoAtrasado = resolver(irmaosNaHora);
		System.out.println("O atrasado é o: "+irmaoAtrasado);
	}
	
	public static List<Integer> leArquivo(String filename){
		BufferedReader reader = null;
	    List<Integer> numeros =new ArrayList<>();
		try {
		    File file = new File(filename);
		    reader = new BufferedReader(new FileReader(file));
		
		    String line;
		    while ((line = reader.readLine()) != null) {
		    	String[] itens = line.split(" ");
		    	for(String item: itens) {
		    		numeros.add(Integer.parseInt(item));
		    	}
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        reader.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
		return numeros;
	}
	
	public static String resolver(List<Integer> irmaosNaHora) {
		int irmao=0, ultimo =0;;
		 
        for (int i=0; i<irmaosNaHora.size();i++) {
        	if ((ultimo+1) != irmaosNaHora.get(i)) {
        		irmao = ultimo + 1;
        		break;
        	}
        	 ultimo = irmaosNaHora.get(i);
        }
        
        if (irmao == 0) {
        	irmao=irmaosNaHora.get(irmaosNaHora.size()-1) +1;
        }
        
        return nomear(irmao);
	}

	private static String nomear(int irmao) {
		String resp = "";
		switch(irmao) {
		case 1:
			resp = "Mais novo";
			break;
		case 2:
			resp = "Do meio";
			break;
		case 3:
			resp = "Mais velho";
			break;
		default:
			resp = "Resposta incorreta";
			break;
		}
		return resp;
	}
}

