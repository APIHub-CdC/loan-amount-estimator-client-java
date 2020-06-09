package io.lae.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class PeticionFolioConsulta {
	@SerializedName("folioOtorgante")
	private String folioOtorgante = null;
	@SerializedName("segmento")
	private CatalogoSegmento segmento = null;
	@SerializedName("folioConsulta")
	private String folioConsulta = null;

	public PeticionFolioConsulta folioOtorgante(String folioOtorgante) {
		this.folioOtorgante = folioOtorgante;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public String getFolioOtorgante() {
		return folioOtorgante;
	}

	public void setFolioOtorgante(String folioOtorgante) {
		this.folioOtorgante = folioOtorgante;
	}

	public PeticionFolioConsulta segmento(CatalogoSegmento segmento) {
		this.segmento = segmento;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public CatalogoSegmento getSegmento() {
		return segmento;
	}

	public void setSegmento(CatalogoSegmento segmento) {
		this.segmento = segmento;
	}

	public PeticionFolioConsulta folioConsulta(String folioConsulta) {
		this.folioConsulta = folioConsulta;
		return this;
	}

	@ApiModelProperty(required = true, value = "Folio de la consulta")
	public String getFolioConsulta() {
		return folioConsulta;
	}

	public void setFolioConsulta(String folioConsulta) {
		this.folioConsulta = folioConsulta;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PeticionFolioConsulta peticionFolioConsulta = (PeticionFolioConsulta) o;
		return Objects.equals(this.folioOtorgante, peticionFolioConsulta.folioOtorgante)
				&& Objects.equals(this.segmento, peticionFolioConsulta.segmento)
				&& Objects.equals(this.folioConsulta, peticionFolioConsulta.folioConsulta);
	}

	@Override
	public int hashCode() {
		return Objects.hash(folioOtorgante, segmento, folioConsulta);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PeticionFolioConsulta {\n");

		sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
		sb.append("    segmento: ").append(toIndentedString(segmento)).append("\n");
		sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
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
