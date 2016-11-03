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
 * Advanced options for &#x60;iges&#x60; type.
 */
@ApiModel(description = "Advanced options for `iges` type.")

public class JobIgesOutputPayloadAdvanced   {
  @JsonProperty("tolerance")
  private Float tolerance = 0.001f;

  /**
   * Possible values are `bounded`, `trimmed` and `wireframe`. By default it is set to bounded surface.
   */
  public enum SurfaceTypeEnum {
    BOUNDED("bounded"),
    
    TRIMMED("trimmed"),
    
    WIREFRAME("wireframe");

    private String value;

    SurfaceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("surfaceType")
  private SurfaceTypeEnum surfaceType = SurfaceTypeEnum.BOUNDED;

  /**
   * Export the sheet body to IGES. `open`, `shell`, `surface` or `wireframe`. By default, it is set to `surface`.
   */
  public enum SheetTypeEnum {
    OPEN("open"),
    
    SURFACE("surface"),
    
    SHELL("shell"),
    
    WIREFRAME("wireframe");

    private String value;

    SheetTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("sheetType")
  private SheetTypeEnum sheetType = SheetTypeEnum.SURFACE;

  /**
   * Export the solid body to IGES `solid`, `surface` or `wireframe`. By default, it is set to `solid`.
   */
  public enum SolidTypeEnum {
    SOLID("solid"),
    
    SURFACE("surface"),
    
    WIREFRAME("wireframe");

    private String value;

    SolidTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("solidType")
  private SolidTypeEnum solidType = SolidTypeEnum.SOLID;

  public JobIgesOutputPayloadAdvanced tolerance(Float tolerance) {
    this.tolerance = tolerance;
    return this;
  }

   /**
   * Possible values are between `0` and `1`. By default it is set at 0.001.
   * @return tolerance
  **/
  @ApiModelProperty(example = "null", value = "Possible values are between `0` and `1`. By default it is set at 0.001.")
  public Float getTolerance() {
    return tolerance;
  }

  public void setTolerance(Float tolerance) {
    this.tolerance = tolerance;
  }

  public JobIgesOutputPayloadAdvanced surfaceType(SurfaceTypeEnum surfaceType) {
    this.surfaceType = surfaceType;
    return this;
  }

   /**
   * Possible values are `bounded`, `trimmed` and `wireframe`. By default it is set to bounded surface.
   * @return surfaceType
  **/
  @ApiModelProperty(example = "null", value = "Possible values are `bounded`, `trimmed` and `wireframe`. By default it is set to bounded surface.")
  public SurfaceTypeEnum getSurfaceType() {
    return surfaceType;
  }

  public void setSurfaceType(SurfaceTypeEnum surfaceType) {
    this.surfaceType = surfaceType;
  }

  public JobIgesOutputPayloadAdvanced sheetType(SheetTypeEnum sheetType) {
    this.sheetType = sheetType;
    return this;
  }

   /**
   * Export the sheet body to IGES. `open`, `shell`, `surface` or `wireframe`. By default, it is set to `surface`.
   * @return sheetType
  **/
  @ApiModelProperty(example = "null", value = "Export the sheet body to IGES. `open`, `shell`, `surface` or `wireframe`. By default, it is set to `surface`.")
  public SheetTypeEnum getSheetType() {
    return sheetType;
  }

  public void setSheetType(SheetTypeEnum sheetType) {
    this.sheetType = sheetType;
  }

  public JobIgesOutputPayloadAdvanced solidType(SolidTypeEnum solidType) {
    this.solidType = solidType;
    return this;
  }

   /**
   * Export the solid body to IGES `solid`, `surface` or `wireframe`. By default, it is set to `solid`.
   * @return solidType
  **/
  @ApiModelProperty(example = "null", value = "Export the solid body to IGES `solid`, `surface` or `wireframe`. By default, it is set to `solid`.")
  public SolidTypeEnum getSolidType() {
    return solidType;
  }

  public void setSolidType(SolidTypeEnum solidType) {
    this.solidType = solidType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobIgesOutputPayloadAdvanced jobIgesOutputPayloadAdvanced = (JobIgesOutputPayloadAdvanced) o;
    return Objects.equals(this.tolerance, jobIgesOutputPayloadAdvanced.tolerance) &&
        Objects.equals(this.surfaceType, jobIgesOutputPayloadAdvanced.surfaceType) &&
        Objects.equals(this.sheetType, jobIgesOutputPayloadAdvanced.sheetType) &&
        Objects.equals(this.solidType, jobIgesOutputPayloadAdvanced.solidType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tolerance, surfaceType, sheetType, solidType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobIgesOutputPayloadAdvanced {\n");
    
    sb.append("    tolerance: ").append(toIndentedString(tolerance)).append("\n");
    sb.append("    surfaceType: ").append(toIndentedString(surfaceType)).append("\n");
    sb.append("    sheetType: ").append(toIndentedString(sheetType)).append("\n");
    sb.append("    solidType: ").append(toIndentedString(solidType)).append("\n");
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

