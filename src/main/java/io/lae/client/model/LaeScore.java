package io.lae.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class LaeScore {
	@SerializedName("numero")
	private String numero = null;
	@SerializedName("valor")
	private String valor = null;
	@SerializedName("minimo")
	private String minimo = null;
	@SerializedName("maximo")
	private String maximo = null;

	public LaeScore numero(String numero) {
		this.numero = numero;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LaeScore valor(String valor) {
		this.valor = valor;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public LaeScore minimo(String minimo) {
		this.minimo = minimo;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getMinimo() {
		return minimo;
	}

	public void setMinimo(String minimo) {
		this.minimo = minimo;
	}

	public LaeScore maximo(String maximo) {
		this.maximo = maximo;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getMaximo() {
		return maximo;
	}

	public void setMaximo(String maximo) {
		this.maximo = maximo;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LaeScore laeScore = (LaeScore) o;
		return Objects.equals(this.numero, laeScore.numero) && Objects.equals(this.valor, laeScore.valor)
				&& Objects.equals(this.minimo, laeScore.minimo) && Objects.equals(this.maximo, laeScore.maximo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, valor, minimo, maximo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LaeScore {\n");

		sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
		sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
		sb.append("    minimo: ").append(toIndentedString(minimo)).append("\n");
		sb.append("    maximo: ").append(toIndentedString(maximo)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
