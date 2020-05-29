package io.lae.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.lae.client.model.CatalogoSegmento;
import io.lae.client.model.Persona;

public class PeticionPersona {
  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;
  @SerializedName("segmento")
  private CatalogoSegmento segmento = null;
  @SerializedName("persona")
  private Persona persona = null;
  public PeticionPersona folioOtorgante(String folioOtorgante) {
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
  public PeticionPersona segmento(CatalogoSegmento segmento) {
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
  public PeticionPersona persona(Persona persona) {
    this.persona = persona;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public Persona getPersona() {
    return persona;
  }
  public void setPersona(Persona persona) {
    this.persona = persona;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeticionPersona peticionPersona = (PeticionPersona) o;
    return Objects.equals(this.folioOtorgante, peticionPersona.folioOtorgante) &&
        Objects.equals(this.segmento, peticionPersona.segmento) &&
        Objects.equals(this.persona, peticionPersona.persona);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioOtorgante, segmento, persona);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeticionPersona {\n");
    
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    segmento: ").append(toIndentedString(segmento)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
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
