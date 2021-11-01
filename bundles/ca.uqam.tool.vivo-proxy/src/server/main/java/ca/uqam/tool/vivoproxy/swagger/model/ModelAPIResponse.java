/*
 * VIVO Proxy API
 * Proxy API for VIVO Data Manipulation
 *
 * OpenAPI spec version: 1.0.0 - 2021-10-23
 * Contact: vivo@uqam.ca
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ca.uqam.tool.vivoproxy.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ModelAPIResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-10-26T11:18:52.710-04:00[America/New_York]")public class ModelAPIResponse   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("apiMessage")
  private String apiMessage = null;

  @JsonProperty("IRI-value")
  private String irIValue = null;

  @JsonProperty("VIVO-Message")
  private String viVOMessage = null;

  public ModelAPIResponse code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   **/
  @JsonProperty("code")
  @Schema(description = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ModelAPIResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @JsonProperty("type")
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ModelAPIResponse apiMessage(String apiMessage) {
    this.apiMessage = apiMessage;
    return this;
  }

  /**
   * Get apiMessage
   * @return apiMessage
   **/
  @JsonProperty("apiMessage")
  @Schema(description = "")
  public String getApiMessage() {
    return apiMessage;
  }

  public void setApiMessage(String apiMessage) {
    this.apiMessage = apiMessage;
  }

  public ModelAPIResponse irIValue(String irIValue) {
    this.irIValue = irIValue;
    return this;
  }

  /**
   * The subject IRI of the created statement
   * @return irIValue
   **/
  @JsonProperty("IRI-value")
  @Schema(example = "http://localhost:8080/vivo/individual/n774", description = "The subject IRI of the created statement")
  public String getIrIValue() {
    return irIValue;
  }

  public void setIrIValue(String irIValue) {
    this.irIValue = irIValue;
  }

  public ModelAPIResponse viVOMessage(String viVOMessage) {
    this.viVOMessage = viVOMessage;
    return this;
  }

  /**
   * The transaction message transmitted by the VIVO server
   * @return viVOMessage
   **/
  @JsonProperty("VIVO-Message")
  @Schema(example = "<H1>200 SPARQL update accepted.</H1>", description = "The transaction message transmitted by the VIVO server")
  public String getViVOMessage() {
    return viVOMessage;
  }

  public void setViVOMessage(String viVOMessage) {
    this.viVOMessage = viVOMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAPIResponse _apIResponse = (ModelAPIResponse) o;
    return Objects.equals(this.code, _apIResponse.code) &&
        Objects.equals(this.type, _apIResponse.type) &&
        Objects.equals(this.apiMessage, _apIResponse.apiMessage) &&
        Objects.equals(this.irIValue, _apIResponse.irIValue) &&
        Objects.equals(this.viVOMessage, _apIResponse.viVOMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, apiMessage, irIValue, viVOMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAPIResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    apiMessage: ").append(toIndentedString(apiMessage)).append("\n");
    sb.append("    irIValue: ").append(toIndentedString(irIValue)).append("\n");
    sb.append("    viVOMessage: ").append(toIndentedString(viVOMessage)).append("\n");
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
