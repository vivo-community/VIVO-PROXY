/*
 * VIVO Proxy API
 * Proxy API for VIVO Data Manipulation
 *
 * OpenAPI spec version: 1.0.0
 * Contact: vivo@uqam.ca
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ca.uqam.tool.vivoproxy.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PositionOfPerson
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-06-25T02:54:30.467-04:00")
public class PositionOfPerson {
  @SerializedName("personIRI")
  private String personIRI = null;

  @SerializedName("organisationIRI")
  private String organisationIRI = null;

  @SerializedName("organisationLabel")
  private String organisationLabel = null;

  @SerializedName("positionTitleLabel")
  private String positionTitleLabel = null;

  @SerializedName("positionTypeIRI")
  private String positionTypeIRI = null;

  @SerializedName("vivoOrganisationTypeIRI")
  private String vivoOrganisationTypeIRI = null;

  @SerializedName("startField_year")
  private String startFieldYear = null;

  @SerializedName("endField_year")
  private String endFieldYear = null;

  public PositionOfPerson personIRI(String personIRI) {
    this.personIRI = personIRI;
    return this;
  }

   /**
   * Get personIRI
   * @return personIRI
  **/
  @ApiModelProperty(example = "http://localhost:8080/vivo/individual/n774", value = "")
  public String getPersonIRI() {
    return personIRI;
  }

  public void setPersonIRI(String personIRI) {
    this.personIRI = personIRI;
  }

  public PositionOfPerson organisationIRI(String organisationIRI) {
    this.organisationIRI = organisationIRI;
    return this;
  }

   /**
   * Get organisationIRI
   * @return organisationIRI
  **/
  @ApiModelProperty(example = "http://localhost:8080/vivo/individual/n4762", value = "")
  public String getOrganisationIRI() {
    return organisationIRI;
  }

  public void setOrganisationIRI(String organisationIRI) {
    this.organisationIRI = organisationIRI;
  }

  public PositionOfPerson organisationLabel(String organisationLabel) {
    this.organisationLabel = organisationLabel;
    return this;
  }

   /**
   * Get organisationLabel
   * @return organisationLabel
  **/
  @ApiModelProperty(example = "Harvard University", value = "")
  public String getOrganisationLabel() {
    return organisationLabel;
  }

  public void setOrganisationLabel(String organisationLabel) {
    this.organisationLabel = organisationLabel;
  }

  public PositionOfPerson positionTitleLabel(String positionTitleLabel) {
    this.positionTitleLabel = positionTitleLabel;
    return this;
  }

   /**
   * Get positionTitleLabel
   * @return positionTitleLabel
  **/
  @ApiModelProperty(example = "Professor", value = "")
  public String getPositionTitleLabel() {
    return positionTitleLabel;
  }

  public void setPositionTitleLabel(String positionTitleLabel) {
    this.positionTitleLabel = positionTitleLabel;
  }

  public PositionOfPerson positionTypeIRI(String positionTypeIRI) {
    this.positionTypeIRI = positionTypeIRI;
    return this;
  }

   /**
   * Get positionTypeIRI
   * @return positionTypeIRI
  **/
  @ApiModelProperty(example = "http://vivoweb.org/ontology/core#FacultyPosition", value = "")
  public String getPositionTypeIRI() {
    return positionTypeIRI;
  }

  public void setPositionTypeIRI(String positionTypeIRI) {
    this.positionTypeIRI = positionTypeIRI;
  }

  public PositionOfPerson vivoOrganisationTypeIRI(String vivoOrganisationTypeIRI) {
    this.vivoOrganisationTypeIRI = vivoOrganisationTypeIRI;
    return this;
  }

   /**
   * Get vivoOrganisationTypeIRI
   * @return vivoOrganisationTypeIRI
  **/
  @ApiModelProperty(example = "http://vivoweb.org/ontology/core#University", value = "")
  public String getVivoOrganisationTypeIRI() {
    return vivoOrganisationTypeIRI;
  }

  public void setVivoOrganisationTypeIRI(String vivoOrganisationTypeIRI) {
    this.vivoOrganisationTypeIRI = vivoOrganisationTypeIRI;
  }

  public PositionOfPerson startFieldYear(String startFieldYear) {
    this.startFieldYear = startFieldYear;
    return this;
  }

   /**
   * Get startFieldYear
   * @return startFieldYear
  **/
  @ApiModelProperty(value = "")
  public String getStartFieldYear() {
    return startFieldYear;
  }

  public void setStartFieldYear(String startFieldYear) {
    this.startFieldYear = startFieldYear;
  }

  public PositionOfPerson endFieldYear(String endFieldYear) {
    this.endFieldYear = endFieldYear;
    return this;
  }

   /**
   * Get endFieldYear
   * @return endFieldYear
  **/
  @ApiModelProperty(value = "")
  public String getEndFieldYear() {
    return endFieldYear;
  }

  public void setEndFieldYear(String endFieldYear) {
    this.endFieldYear = endFieldYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionOfPerson positionOfPerson = (PositionOfPerson) o;
    return Objects.equals(this.personIRI, positionOfPerson.personIRI) &&
        Objects.equals(this.organisationIRI, positionOfPerson.organisationIRI) &&
        Objects.equals(this.organisationLabel, positionOfPerson.organisationLabel) &&
        Objects.equals(this.positionTitleLabel, positionOfPerson.positionTitleLabel) &&
        Objects.equals(this.positionTypeIRI, positionOfPerson.positionTypeIRI) &&
        Objects.equals(this.vivoOrganisationTypeIRI, positionOfPerson.vivoOrganisationTypeIRI) &&
        Objects.equals(this.startFieldYear, positionOfPerson.startFieldYear) &&
        Objects.equals(this.endFieldYear, positionOfPerson.endFieldYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personIRI, organisationIRI, organisationLabel, positionTitleLabel, positionTypeIRI, vivoOrganisationTypeIRI, startFieldYear, endFieldYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionOfPerson {\n");
    
    sb.append("    personIRI: ").append(toIndentedString(personIRI)).append("\n");
    sb.append("    organisationIRI: ").append(toIndentedString(organisationIRI)).append("\n");
    sb.append("    organisationLabel: ").append(toIndentedString(organisationLabel)).append("\n");
    sb.append("    positionTitleLabel: ").append(toIndentedString(positionTitleLabel)).append("\n");
    sb.append("    positionTypeIRI: ").append(toIndentedString(positionTypeIRI)).append("\n");
    sb.append("    vivoOrganisationTypeIRI: ").append(toIndentedString(vivoOrganisationTypeIRI)).append("\n");
    sb.append("    startFieldYear: ").append(toIndentedString(startFieldYear)).append("\n");
    sb.append("    endFieldYear: ").append(toIndentedString(endFieldYear)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

