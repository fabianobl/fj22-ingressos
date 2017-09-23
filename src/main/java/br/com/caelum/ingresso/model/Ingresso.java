package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

public class Ingresso {
	
	private Sessao sessao;
	private BigDecimal preco;
	private Lugar lugar;
	
	/**
	 * @deprecated hibernate only
	 */
		public Ingresso (){
		
	}
	
	public Ingresso(Sessao sessao, Desconto tipoDeDesconto, Lugar lugar) {
		this.sessao = sessao;
		this.preco = tipoDeDesconto.aplicarDescontoSobre(sessao.getPreco());
		this.setLugar(lugar);
		
	}
	
	public Sessao getSessao() {
		return sessao;
		
	}
	
	public BigDecimal getPreco() {
		return preco;
		
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

}
