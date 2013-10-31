package br.com.MDSGPP.ChamadaParlamentar.model;

public class Deputados {
	
	//atributs to our class
	private int idDoParlamentar;
	private int matricula;
	private int ideCadastro;
	private String nomeCivilDoParlamentar;
	private String nomeDeTratamentoDoParlamentar;
	private String sexo;
	private String uf;
	private String partido;
	private String numeroDoGabinete;
	private String anexo;
	private String telefone;
	private String email;

	//constructor to our class
	public Deputados() {
		
	}
	
	public Deputados(int idParlamentar, int matricula, int ideCadastro, String nomeCivil,
			String nomeTratamento, String sexo, String uf, String partido, String numeroGabinete,
			String anexo, String telefone, String email) {
		
		this.idDoParlamentar = idParlamentar;
		this.matricula = matricula;
		this.ideCadastro = ideCadastro;
		this.nomeCivilDoParlamentar = nomeCivil;
		this.nomeDeTratamentoDoParlamentar = nomeTratamento;
		this.sexo = sexo;
		this.uf = uf;
		this.partido = partido;
		this.numeroDoGabinete = numeroGabinete;
		this.anexo = anexo;
		this.telefone = telefone;
		this.email = email;
	}

	//geters and setters
	public int getIdDoParlamentar() {
		return idDoParlamentar;
	}

	public void setIdDoParlamentar(int idDoParlamentar) {
		this.idDoParlamentar = idDoParlamentar;
	}

	public String getNomeCivilDoParlamentar() {
		return nomeCivilDoParlamentar;
	}

	public void setNomeCivilDoParlamentar(String nomeCivilDoParlamentar) {
		this.nomeCivilDoParlamentar = nomeCivilDoParlamentar;
	}

	public String getNomeDeTratamentoDoParlamentar() {
		return nomeDeTratamentoDoParlamentar;
	}

	public void setNomeDeTratamentoDoParlamentar(
			String nomeDeTratamentoDoParlamentar) {
		this.nomeDeTratamentoDoParlamentar = nomeDeTratamentoDoParlamentar;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getNumeroDoGabinete() {
		return numeroDoGabinete;
	}

	public void setNumeroDoGabinete(String numeroDoGabinete) {
		this.numeroDoGabinete = numeroDoGabinete;
	}

	public String getAnexo() {
		return anexo;
	}

	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdeCadastro() {
		return ideCadastro;
	}

	public void setIdeCadastro(int ideCadastro) {
		this.ideCadastro = ideCadastro;
	}
	//and of the getters and setters
	
}
