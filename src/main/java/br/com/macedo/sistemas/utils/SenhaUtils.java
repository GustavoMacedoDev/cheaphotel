package br.com.macedo.sistemas.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

	public static String gerarBCript(String senha) {
		if(senha == null) {
			return senha;
		}
		
		BCryptPasswordEncoder bCryptPasswordEncoder  = new BCryptPasswordEncoder(); 
		return bCryptPasswordEncoder.encode(senha);
	}
	
	public static boolean senhaValida(String senha, String senhaEncoded) {
		BCryptPasswordEncoder bCryptPasswordEncoder  = new BCryptPasswordEncoder(); 
		return bCryptPasswordEncoder.matches(senha, senhaEncoded);
	}
	
}
