package io.lae.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.lae.client.model.CatalogoEstadoCivil;
import io.lae.client.model.CatalogoResidencia;
import io.lae.client.model.CatalogoSexo;
import io.lae.client.model.DomicilioPeticion;


@ApiModel(description = "Datos generales de la persona a consultar.")
public class Persona {
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;
  @SerializedName("primerNombre")
  private String primerNombre = null;
  @SerializedName("segundoNombre")
  private String segundoNombre = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("RFC")
  private String RFC = null;
  @SerializedName("CURP")
  private String CURP = null;
  @SerializedName("nacionalidad")
  private String nacionalidad = null;
  @SerializedName("residencia")
  private CatalogoResidencia residencia = null;
  @SerializedName("estadoCivil")
  private CatalogoEstadoCivil estadoCivil = null;
  @SerializedName("sexo")
  private CatalogoSexo sexo = null;
  @SerializedName("claveElectorIFE")
  private String claveElectorIFE = null;
  @SerializedName("numeroDependientes")
  private Integer numeroDependientes = null;
  @SerializedName("fechaDefuncion")
  private String fechaDefuncion = null;
  @SerializedName("domicilio")
  private DomicilioPeticion domicilio = null;
  public Persona apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "SAHAGUN", required = true, value = "Apellido paterno de la persona. Sin abreviaturas o iniciales")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public Persona apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "ZARAGOZA", required = true, value = "Apellido materno de la persona")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public Persona apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }
   
  @ApiModelProperty(example = "TORRES", value = "Apellido adicional de la persona, si tuviere")
  public String getApellidoAdicional() {
    return apellidoAdicional;
  }
  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }
  public Persona primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }
   
  @ApiModelProperty(example = "ROBERTO", required = true, value = "Primer nombre de la persona")
  public String getPrimerNombre() {
    return primerNombre;
  }
  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }
  public Persona segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }
   
  @ApiModelProperty(example = "MIGUEL", value = "Segundo nombre de la persona")
  public String getSegundoNombre() {
    return segundoNombre;
  }
  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }
  public Persona fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  @ApiModelProperty(example = "2001-01-01", required = true, value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public Persona RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }
   
  @ApiModelProperty(example = "SAZR010101", value = "RFC con homoclave de la persona")
  public String getRFC() {
    return RFC;
  }
  public void setRFC(String RFC) {
    this.RFC = RFC;
  }
  public Persona CURP(String CURP) {
    this.CURP = CURP;
    return this;
  }
   
  @ApiModelProperty(example = "SAZR010101HCMLNS09", value = "CURP de la persona, emitida por RENAPO")
  public String getCURP() {
    return CURP;
  }
  public void setCURP(String CURP) {
    this.CURP = CURP;
  }
  public Persona nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }
   
  @ApiModelProperty(example = "MX", value = "Debe contener la clave de la nacionalidad del consumidor los valores posibles son los siguientes: MX = México.")
  public String getNacionalidad() {
    return nacionalidad;
  }
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
  public Persona residencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoResidencia getResidencia() {
    return residencia;
  }
  public void setResidencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
  }
  public Persona estadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoEstadoCivil getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
  }
  public Persona sexo(CatalogoSexo sexo) {
    this.sexo = sexo;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoSexo getSexo() {
    return sexo;
  }
  public void setSexo(CatalogoSexo sexo) {
    this.sexo = sexo;
  }
  public Persona claveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
    return this;
  }
   
  @ApiModelProperty(example = "000000000000", value = "La clave de elector que se encuentra en el IFE/INE.")
  public String getClaveElectorIFE() {
    return claveElectorIFE;
  }
  public void setClaveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
  }
  public Persona numeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
    return this;
  }
   
  @ApiModelProperty(value = "Número de personas que dependen de la persona.")
  public Integer getNumeroDependientes() {
    return numeroDependientes;
  }
  public void setNumeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
  }
  public Persona fechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
    return this;
  }
   
  @ApiModelProperty(example = "9999-01-01", value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaDefuncion() {
    return fechaDefuncion;
  }
  public void setFechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
  }
  public Persona domicilio(DomicilioPeticion domicilio) {
    this.domicilio = domicilio;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public DomicilioPeticion getDomicilio() {
    return domicilio;
  }
  public void setDomicilio(DomicilioPeticion domicilio) {
    this.domicilio = domicilio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(this.apellidoPaterno, persona.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, persona.apellidoMaterno) &&
        Objects.equals(this.apellidoAdicional, persona.apellidoAdicional) &&
        Objects.equals(this.primerNombre, persona.primerNombre) &&
        Objects.equals(this.segundoNombre, persona.segundoNombre) &&
        Objects.equals(this.fechaNacimiento, persona.fechaNacimiento) &&
        Objects.equals(this.RFC, persona.RFC) &&
        Objects.equals(this.CURP, persona.CURP) &&
        Objects.equals(this.nacionalidad, persona.nacionalidad) &&
        Objects.equals(this.residencia, persona.residencia) &&
        Objects.equals(this.estadoCivil, persona.estadoCivil) &&
        Objects.equals(this.sexo, persona.sexo) &&
        Objects.equals(this.claveElectorIFE, persona.claveElectorIFE) &&
        Objects.equals(this.numeroDependientes, persona.numeroDependientes) &&
        Objects.equals(this.fechaDefuncion, persona.fechaDefuncion) &&
        Objects.equals(this.domicilio, persona.domicilio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(apellidoPaterno, apellidoMaterno, apellidoAdicional, primerNombre, segundoNombre, fechaNacimiento, RFC, CURP, nacionalidad, residencia, estadoCivil, sexo, claveElectorIFE, numeroDependientes, fechaDefuncion, domicilio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    claveElectorIFE: ").append(toIndentedString(claveElectorIFE)).append("\n");
    sb.append("    numeroDependientes: ").append(toIndentedString(numeroDependientes)).append("\n");
    sb.append("    fechaDefuncion: ").append(toIndentedString(fechaDefuncion)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
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
