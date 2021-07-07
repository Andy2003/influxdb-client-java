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
 * RoutesQuery
 */

public class RoutesQuery {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_AST = "ast";
  @SerializedName(SERIALIZED_NAME_AST)
  private String ast;

  public static final String SERIALIZED_NAME_ANALYZE = "analyze";
  @SerializedName(SERIALIZED_NAME_ANALYZE)
  private String analyze;

  public static final String SERIALIZED_NAME_SUGGESTIONS = "suggestions";
  @SerializedName(SERIALIZED_NAME_SUGGESTIONS)
  private String suggestions;

  public RoutesQuery self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public RoutesQuery ast(String ast) {
    this.ast = ast;
    return this;
  }

   /**
   * Get ast
   * @return ast
  **/
  @ApiModelProperty(value = "")
  public String getAst() {
    return ast;
  }

  public void setAst(String ast) {
    this.ast = ast;
  }

  public RoutesQuery analyze(String analyze) {
    this.analyze = analyze;
    return this;
  }

   /**
   * Get analyze
   * @return analyze
  **/
  @ApiModelProperty(value = "")
  public String getAnalyze() {
    return analyze;
  }

  public void setAnalyze(String analyze) {
    this.analyze = analyze;
  }

  public RoutesQuery suggestions(String suggestions) {
    this.suggestions = suggestions;
    return this;
  }

   /**
   * Get suggestions
   * @return suggestions
  **/
  @ApiModelProperty(value = "")
  public String getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(String suggestions) {
    this.suggestions = suggestions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutesQuery routesQuery = (RoutesQuery) o;
    return Objects.equals(this.self, routesQuery.self) &&
        Objects.equals(this.ast, routesQuery.ast) &&
        Objects.equals(this.analyze, routesQuery.analyze) &&
        Objects.equals(this.suggestions, routesQuery.suggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, ast, analyze, suggestions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutesQuery {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    ast: ").append(toIndentedString(ast)).append("\n");
    sb.append("    analyze: ").append(toIndentedString(analyze)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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

