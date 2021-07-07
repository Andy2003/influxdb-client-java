/*
 * Influx OSS API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

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
 * Rendered flux that backs the check or notification.
 */
@ApiModel(description = "Rendered flux that backs the check or notification.")

public class FluxResponse {
  public static final String SERIALIZED_NAME_FLUX = "flux";
  @SerializedName(SERIALIZED_NAME_FLUX)
  private String flux;

  public FluxResponse flux(String flux) {
    this.flux = flux;
    return this;
  }

   /**
   * Get flux
   * @return flux
  **/
  @ApiModelProperty(value = "")
  public String getFlux() {
    return flux;
  }

  public void setFlux(String flux) {
    this.flux = flux;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FluxResponse fluxResponse = (FluxResponse) o;
    return Objects.equals(this.flux, fluxResponse.flux);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flux);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FluxResponse {\n");
    sb.append("    flux: ").append(toIndentedString(flux)).append("\n");
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

