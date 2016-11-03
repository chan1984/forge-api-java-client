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
import com.autodesk.client.model.JobStepOutputPayloadAdvanced;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * JobStepOutputPayload
 */

public class JobStepOutputPayload   {
  /**
   * The requested output types. Possible values include `svf`, `thumbnai`, `stl`, `step`, `iges`, or `obj`. For a list of supported types, call the [GET formats](https://developer.autodesk.com/en/docs/model-derivative/v2/reference/http/formats-GET) endpoint.
   */
  public enum TypeEnum {
    SVF("svf"),
    
    THUMBNAIL("thumbnail"),
    
    STL("stl"),
    
    STEP("step"),
    
    IGES("iges"),
    
    OBJ("obj");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("advanced")
  private JobStepOutputPayloadAdvanced advanced = null;

  public JobStepOutputPayload type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The requested output types. Possible values include `svf`, `thumbnai`, `stl`, `step`, `iges`, or `obj`. For a list of supported types, call the [GET formats](https://developer.autodesk.com/en/docs/model-derivative/v2/reference/http/formats-GET) endpoint.
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The requested output types. Possible values include `svf`, `thumbnai`, `stl`, `step`, `iges`, or `obj`. For a list of supported types, call the [GET formats](https://developer.autodesk.com/en/docs/model-derivative/v2/reference/http/formats-GET) endpoint.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public JobStepOutputPayload advanced(JobStepOutputPayloadAdvanced advanced) {
    this.advanced = advanced;
    return this;
  }

   /**
   * Get advanced
   * @return advanced
  **/
  @ApiModelProperty(example = "null", value = "")
  public JobStepOutputPayloadAdvanced getAdvanced() {
    return advanced;
  }

  public void setAdvanced(JobStepOutputPayloadAdvanced advanced) {
    this.advanced = advanced;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStepOutputPayload jobStepOutputPayload = (JobStepOutputPayload) o;
    return Objects.equals(this.type, jobStepOutputPayload.type) &&
        Objects.equals(this.advanced, jobStepOutputPayload.advanced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, advanced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStepOutputPayload {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
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

