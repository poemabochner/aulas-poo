package br.org.serratec.maps;

import java.util.HashMap;
import java.util.Map;
public class Exemplo1Maps {

	public static void main(String[] args) {
		Map<String, String> estados = new HashMap<>();
		estados.put("AC", "ACRE");
		estados.put("RJ", "Rio de Janeiro");
		
		System.out.println("---Retorna a chave do mapa---");
		
		for (String string : estados.keySet()) {
			System.out.println(string);
		}
		
		System.out.println("---Retorna os valores do mapa---");
		for (String string : estados.values()) {
			System.out.println(string);
		}
		System.out.println("---Retorna as chaves e valores do mapa---");
		for (Map.Entry<String, String> mapa : estados.entrySet()) {
			System.out.println(mapa.getKey()+"-"+mapa.getValue());
			
		}
	}

}
