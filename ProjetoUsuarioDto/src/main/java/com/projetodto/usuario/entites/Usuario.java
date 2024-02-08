package com.projetodto.usuario.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name = "usuario")
	public
	class Usuario{
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull
		@NotBlank
		private String nome;
		
		@NotNull
		@NotBlank
		private String senha;
		
		private String permissao;
		
		public Usuario(String nome, String senha) {
			this.nome = nome;
			this.senha = senha;	
		
		
	}

}
