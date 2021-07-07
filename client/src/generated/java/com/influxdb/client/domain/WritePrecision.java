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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets WritePrecision
 */
@JsonAdapter(WritePrecision.Adapter.class)
public enum WritePrecision {
  
  MS("ms"),
  
  S("s"),
  
  US("us"),
  
  NS("ns");

  private String value;

  WritePrecision(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WritePrecision fromValue(String text) {
    for (WritePrecision b : WritePrecision.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WritePrecision> {
    @Override
    public void write(final JsonWriter jsonWriter, final WritePrecision enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WritePrecision read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WritePrecision.fromValue(String.valueOf(value));
    }
  }
}

