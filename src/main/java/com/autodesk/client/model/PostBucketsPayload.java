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
import com.autodesk.client.model.PostBucketsPayloadAllow;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Bucket Payload Body Structure
 */
@ApiModel(description = "Bucket Payload Body Structure")

public class PostBucketsPayload   {
  @JsonProperty("bucketKey")
  private String bucketKey = null;

  @JsonProperty("allow")
  private List<PostBucketsPayloadAllow> allow = new ArrayList<PostBucketsPayloadAllow>();

  /**
   * [Data retention policy](https://developer.autodesk.com/en/docs/data/v2/overview/retention-policy/)  Acceptable values: `transient`, `temporary` or `persistent` 
   */
  public enum PolicyKeyEnum {
    TRANSIENT("transient"),
    
    TEMPORARY("temporary"),
    
    PERSISTENT("persistent");

    private String value;

    PolicyKeyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("policyKey")
  private PolicyKeyEnum policyKey = null;

  public PostBucketsPayload bucketKey(String bucketKey) {
    this.bucketKey = bucketKey;
    return this;
  }

   /**
   * Bucket key
   * @return bucketKey
  **/
  @ApiModelProperty(example = "null", required = true, value = "Bucket key")
  public String getBucketKey() {
    return bucketKey;
  }

  public void setBucketKey(String bucketKey) {
    this.bucketKey = bucketKey;
  }

  public PostBucketsPayload allow(List<PostBucketsPayloadAllow> allow) {
    this.allow = allow;
    return this;
  }

   /**
   * 
   * @return allow
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PostBucketsPayloadAllow> getAllow() {
    return allow;
  }

  public void setAllow(List<PostBucketsPayloadAllow> allow) {
    this.allow = allow;
  }

  public PostBucketsPayload policyKey(PolicyKeyEnum policyKey) {
    this.policyKey = policyKey;
    return this;
  }

   /**
   * [Data retention policy](https://developer.autodesk.com/en/docs/data/v2/overview/retention-policy/)  Acceptable values: `transient`, `temporary` or `persistent` 
   * @return policyKey
  **/
  @ApiModelProperty(example = "null", required = true, value = "[Data retention policy](https://developer.autodesk.com/en/docs/data/v2/overview/retention-policy/)  Acceptable values: `transient`, `temporary` or `persistent` ")
  public PolicyKeyEnum getPolicyKey() {
    return policyKey;
  }

  public void setPolicyKey(PolicyKeyEnum policyKey) {
    this.policyKey = policyKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostBucketsPayload postBucketsPayload = (PostBucketsPayload) o;
    return Objects.equals(this.bucketKey, postBucketsPayload.bucketKey) &&
        Objects.equals(this.allow, postBucketsPayload.allow) &&
        Objects.equals(this.policyKey, postBucketsPayload.policyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketKey, allow, policyKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostBucketsPayload {\n");
    
    sb.append("    bucketKey: ").append(toIndentedString(bucketKey)).append("\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    policyKey: ").append(toIndentedString(policyKey)).append("\n");
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

