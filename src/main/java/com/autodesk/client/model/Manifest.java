/**
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. From visualizing data to 3D printing, take advantage of Autodesk’s expertise in design and engineering.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: forge.help@autodesk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.autodesk.client.model;

import java.util.Objects;
import com.autodesk.client.model.ManifestDerivative;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Manifest
 */

public class Manifest   {
  @JsonProperty("urn")
  private String urn = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("progress")
  private String progress = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("hasThumbnail")
  private Boolean hasThumbnail = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("derivatives")
  private List<ManifestDerivative> derivatives = new ArrayList<ManifestDerivative>();

  public Manifest urn(String urn) {
    this.urn = urn;
    return this;
  }

   /**
   * The Base64 (URL safe) encoded source file URN
   * @return urn
  **/
  @ApiModelProperty(example = "null", required = true, value = "The Base64 (URL safe) encoded source file URN")
  public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public Manifest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of this JSON object
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "Type of this JSON object")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Manifest progress(String progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Overall progress for all translation jobs in the manifest. Possible values are: `complete` or `##%` 
   * @return progress
  **/
  @ApiModelProperty(example = "null", required = true, value = "Overall progress for all translation jobs in the manifest. Possible values are: `complete` or `##%` ")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }

  public Manifest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Overall status for translation jobs in the “manifest”. Possible values are: `pending`, `success`, `inprogress`, `failed` and `timeout` 
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "Overall status for translation jobs in the “manifest”. Possible values are: `pending`, `success`, `inprogress`, `failed` and `timeout` ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Manifest hasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
    return this;
  }

   /**
   * Indicates if a thumbnail has been generated for the source file URN
   * @return hasThumbnail
  **/
  @ApiModelProperty(example = "null", required = true, value = "Indicates if a thumbnail has been generated for the source file URN")
  public Boolean getHasThumbnail() {
    return hasThumbnail;
  }

  public void setHasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
  }

  public Manifest region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Region 
   * @return region
  **/
  @ApiModelProperty(example = "null", value = "Region ")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Manifest derivatives(List<ManifestDerivative> derivatives) {
    this.derivatives = derivatives;
    return this;
  }

   /**
   * Requested output files for the source file URN
   * @return derivatives
  **/
  @ApiModelProperty(example = "null", required = true, value = "Requested output files for the source file URN")
  public List<ManifestDerivative> getDerivatives() {
    return derivatives;
  }

  public void setDerivatives(List<ManifestDerivative> derivatives) {
    this.derivatives = derivatives;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manifest manifest = (Manifest) o;
    return Objects.equals(this.urn, manifest.urn) &&
        Objects.equals(this.type, manifest.type) &&
        Objects.equals(this.progress, manifest.progress) &&
        Objects.equals(this.status, manifest.status) &&
        Objects.equals(this.hasThumbnail, manifest.hasThumbnail) &&
        Objects.equals(this.region, manifest.region) &&
        Objects.equals(this.derivatives, manifest.derivatives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urn, type, progress, status, hasThumbnail, region, derivatives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manifest {\n");
    
    sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hasThumbnail: ").append(toIndentedString(hasThumbnail)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    derivatives: ").append(toIndentedString(derivatives)).append("\n");
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

