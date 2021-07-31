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
import ca.uqam.tool.vivoproxy.swagger.client.model.ConceptLabel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Concept
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-31T08:37:04.234-04:00[America/New_York]")
public class Concept {
  @SerializedName("IRI")
  private String IRI = null;

  @SerializedName("labels")
  private List<ConceptLabel> labels = new ArrayList<ConceptLabel>();

  public Concept IRI(String IRI) {
    this.IRI = IRI;
    return this;
  }

   /**
   * Get IRI
   * @return IRI
  **/
  @Schema(example = "http://purl.org/uqam.ca/vocabulary/expertise#semanticweb", required = true, description = "")
  public String getIRI() {
    return IRI;
  }

  public void setIRI(String IRI) {
    this.IRI = IRI;
  }

  public Concept labels(List<ConceptLabel> labels) {
    this.labels = labels;
    return this;
  }

  public Concept addLabelsItem(ConceptLabel labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @Schema(required = true, description = "")
  public List<ConceptLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<ConceptLabel> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Concept concept = (Concept) o;
    return Objects.equals(this.IRI, concept.IRI) &&
        Objects.equals(this.labels, concept.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IRI, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Concept {\n");
    
    sb.append("    IRI: ").append(toIndentedString(IRI)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
