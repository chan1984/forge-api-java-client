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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Advanced options for &#x60;stl&#x60; type.
 */
@ApiModel(description = "Advanced options for `stl` type.")

public class JobStlOutputPayloadAdvanced   {
  /**
   * Default format is `binary`. Possible values are `binary` or `ascii`.
   */
  public enum FormatEnum {
    BINARY("binary"),
    
    ASCII("ascii");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("format")
  private FormatEnum format = FormatEnum.BINARY;

  @JsonProperty("exportColor")
  private Boolean exportColor = true;

  /**
   * `single` (default): creates one STL file for all the input files (assembly file)  `multiple`: creates a separate STL file for each object 
   */
  public enum ExportFileStructureEnum {
    SINGLE("single"),
    
    MULTIPLE("multiple");

    private String value;

    ExportFileStructureEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("exportFileStructure")
  private ExportFileStructureEnum exportFileStructure = ExportFileStructureEnum.SINGLE;

  public JobStlOutputPayloadAdvanced format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Default format is `binary`. Possible values are `binary` or `ascii`.
   * @return format
  **/
  @ApiModelProperty(example = "null", value = "Default format is `binary`. Possible values are `binary` or `ascii`.")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public JobStlOutputPayloadAdvanced exportColor(Boolean exportColor) {
    this.exportColor = exportColor;
    return this;
  }

   /**
   * Color is exported by default. If set to `true`, color is exported. If set to `false`, color is not exported.
   * @return exportColor
  **/
  @ApiModelProperty(example = "null", value = "Color is exported by default. If set to `true`, color is exported. If set to `false`, color is not exported.")
  public Boolean getExportColor() {
    return exportColor;
  }

  public void setExportColor(Boolean exportColor) {
    this.exportColor = exportColor;
  }

  public JobStlOutputPayloadAdvanced exportFileStructure(ExportFileStructureEnum exportFileStructure) {
    this.exportFileStructure = exportFileStructure;
    return this;
  }

   /**
   * `single` (default): creates one STL file for all the input files (assembly file)  `multiple`: creates a separate STL file for each object 
   * @return exportFileStructure
  **/
  @ApiModelProperty(example = "null", value = "`single` (default): creates one STL file for all the input files (assembly file)  `multiple`: creates a separate STL file for each object ")
  public ExportFileStructureEnum getExportFileStructure() {
    return exportFileStructure;
  }

  public void setExportFileStructure(ExportFileStructureEnum exportFileStructure) {
    this.exportFileStructure = exportFileStructure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStlOutputPayloadAdvanced jobStlOutputPayloadAdvanced = (JobStlOutputPayloadAdvanced) o;
    return Objects.equals(this.format, jobStlOutputPayloadAdvanced.format) &&
        Objects.equals(this.exportColor, jobStlOutputPayloadAdvanced.exportColor) &&
        Objects.equals(this.exportFileStructure, jobStlOutputPayloadAdvanced.exportFileStructure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, exportColor, exportFileStructure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStlOutputPayloadAdvanced {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    exportColor: ").append(toIndentedString(exportColor)).append("\n");
    sb.append("    exportFileStructure: ").append(toIndentedString(exportFileStructure)).append("\n");
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

