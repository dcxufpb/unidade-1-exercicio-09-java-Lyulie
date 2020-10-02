package com.example.project;

public class Loja {

    private String nomeLoja;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String estado;
    private String cep;
    private String telefone;
    private String observacao;
    private String cnpj;
    private String inscricaoEstadual;

    public Loja(String nomeLoja, String logradouro, int numero, String complemento, String bairro, String municipio,
            String estado, String cep, String telefone, String observacao, String cnpj, String inscricaoEstadual) {
        this.nomeLoja = nomeLoja;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.observacao = observacao;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getCep() {
        return this.cep;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getObservacao() {
        return this.observacao;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public static boolean isNullEmpty(String text) {
		try{
			int k = text.length();
		} catch (NullPointerException npe) {
			return true;
		}
		return text.isEmpty();
	}

    public String dadosLojaObjeto() {
		// Implemente aqui
		if(isNullEmpty(getNomeLoja()))
			throw new RuntimeException("O campo nome da loja é obrigatório");

		if(isNullEmpty(getLogradouro()))
			throw new RuntimeException("O campo logradouro do endereço é obrigatório");
		
		if(isNullEmpty(getMunicipio()))
			throw new RuntimeException("O campo município do endereço é obrigatório");
		
		if(isNullEmpty(getEstado()))
			throw new RuntimeException("O campo estado do endereço é obrigatório");
		
		if(isNullEmpty(getCnpj()))
			throw new RuntimeException("O campo cnpj da loja é obrigatório");
	
		if(isNullEmpty(getInscricaoEstadual()))
			throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");

		String _logradouro = getLogradouro() + ", ";
		
		String _numero = (getNumero() <= 0)? "s/n" : String.format("%d", getNumero());
		
		String _complemento = isNullEmpty(getComplemento())? "" : " " + getComplemento();
		
		String _bairro = isNullEmpty(getBairro())? "" : getBairro() + " - ";
		
		String _municipio = getMunicipio() + " - ";
		
		String _cep = isNullEmpty(getCep())? "" : "CEP:" + getCep();

		String _telefone = isNullEmpty(getTelefone())? "" : "Tel " + getTelefone();
		_telefone = (!_telefone.isEmpty() && !_cep.isEmpty())? " " + _telefone : _telefone;
		
		String _observacao = isNullEmpty(getObservacao())? "" : getObservacao();
						
		String _cnpj = "CNPJ: " + getCnpj();
		
		String _inscricao_estadual = "IE: " + getInscricaoEstadual();

		String output = getNomeLoja() + "\n";
		output += _logradouro + _numero + _complemento  + "\n";
		output += _bairro + _municipio + getEstado() + "\n";
		output +=  _cep + _telefone + "\n";
		output +=  _observacao + "\n";
		output +=  _cnpj + "\n";
		output +=  _inscricao_estadual + "\n";

		return output.replace("\n", System.lineSeparator());
	}

}