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

package ca.uqam.tool.vivoproxy.swagger.model;

import java.util.Objects;
import ca.uqam.tool.vivoproxy.swagger.model.LinguisticLabel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Organization
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-09-23T15:01:20.517-04:00[America/New_York]")public class Organization   {
  @JsonProperty("organizationType")
  private String organizationType = null;

  @JsonProperty("names")
  private List<LinguisticLabel> names = new ArrayList<LinguisticLabel>();

  public Organization organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

  /**
   * Get organizationType
   * @return organizationType
   **/
  @JsonProperty("organizationType")
  @Schema(example = "http://vivoweb.org/ontology/core#University", required = true, description = "")
  @NotNull
  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public Organization names(List<LinguisticLabel> names) {
    this.names = names;
    return this;
  }

  public Organization addNamesItem(LinguisticLabel namesItem) {
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   **/
  @JsonProperty("names")
  @Schema(required = true, description = "")
  @NotNull
  @Valid
  public List<LinguisticLabel> getNames() {
    return names;
  }

  public void setNames(List<LinguisticLabel> names) {
    this.names = names;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.organizationType, organization.organizationType) &&
        Objects.equals(this.names, organization.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationType, names);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
