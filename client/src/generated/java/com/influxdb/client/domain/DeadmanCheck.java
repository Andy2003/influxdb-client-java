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
import com.influxdb.client.domain.CheckBase;
import com.influxdb.client.domain.CheckBaseLinks;
import com.influxdb.client.domain.CheckStatusLevel;
import com.influxdb.client.domain.DashboardQuery;
import com.influxdb.client.domain.Label;
import com.influxdb.client.domain.TaskStatusType;
import com.influxdb.client.domain.ThresholdCheckTags;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * DeadmanCheck
 */

public class DeadmanCheck extends Check {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DEADMAN("deadman");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.DEADMAN;

  public static final String SERIALIZED_NAME_TIME_SINCE = "timeSince";
  @SerializedName(SERIALIZED_NAME_TIME_SINCE)
  private String timeSince;

  public static final String SERIALIZED_NAME_STALE_TIME = "staleTime";
  @SerializedName(SERIALIZED_NAME_STALE_TIME)
  private String staleTime;

  public static final String SERIALIZED_NAME_REPORT_ZERO = "reportZero";
  @SerializedName(SERIALIZED_NAME_REPORT_ZERO)
  private Boolean reportZero;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private CheckStatusLevel level = null;

  public static final String SERIALIZED_NAME_EVERY = "every";
  @SerializedName(SERIALIZED_NAME_EVERY)
  private String every;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private String offset;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<ThresholdCheckTags> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS_MESSAGE_TEMPLATE = "statusMessageTemplate";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE_TEMPLATE)
  private String statusMessageTemplate;

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public DeadmanCheck timeSince(String timeSince) {
    this.timeSince = timeSince;
    return this;
  }

   /**
   * String duration before deadman triggers.
   * @return timeSince
  **/
  @ApiModelProperty(value = "String duration before deadman triggers.")
  public String getTimeSince() {
    return timeSince;
  }

  public void setTimeSince(String timeSince) {
    this.timeSince = timeSince;
  }

  public DeadmanCheck staleTime(String staleTime) {
    this.staleTime = staleTime;
    return this;
  }

   /**
   * String duration for time that a series is considered stale and should not trigger deadman.
   * @return staleTime
  **/
  @ApiModelProperty(value = "String duration for time that a series is considered stale and should not trigger deadman.")
  public String getStaleTime() {
    return staleTime;
  }

  public void setStaleTime(String staleTime) {
    this.staleTime = staleTime;
  }

  public DeadmanCheck reportZero(Boolean reportZero) {
    this.reportZero = reportZero;
    return this;
  }

   /**
   * If only zero values reported since time, trigger an alert
   * @return reportZero
  **/
  @ApiModelProperty(value = "If only zero values reported since time, trigger an alert")
  public Boolean getReportZero() {
    return reportZero;
  }

  public void setReportZero(Boolean reportZero) {
    this.reportZero = reportZero;
  }

  public DeadmanCheck level(CheckStatusLevel level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public CheckStatusLevel getLevel() {
    return level;
  }

  public void setLevel(CheckStatusLevel level) {
    this.level = level;
  }

  public DeadmanCheck every(String every) {
    this.every = every;
    return this;
  }

   /**
   * Check repetition interval.
   * @return every
  **/
  @ApiModelProperty(value = "Check repetition interval.")
  public String getEvery() {
    return every;
  }

  public void setEvery(String every) {
    this.every = every;
  }

  public DeadmanCheck offset(String offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Duration to delay after the schedule, before executing check.
   * @return offset
  **/
  @ApiModelProperty(value = "Duration to delay after the schedule, before executing check.")
  public String getOffset() {
    return offset;
  }

  public void setOffset(String offset) {
    this.offset = offset;
  }

  public DeadmanCheck tags(List<ThresholdCheckTags> tags) {
    this.tags = tags;
    return this;
  }

  public DeadmanCheck addTagsItem(ThresholdCheckTags tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags to write to each status.
   * @return tags
  **/
  @ApiModelProperty(value = "List of tags to write to each status.")
  public List<ThresholdCheckTags> getTags() {
    return tags;
  }

  public void setTags(List<ThresholdCheckTags> tags) {
    this.tags = tags;
  }

  public DeadmanCheck statusMessageTemplate(String statusMessageTemplate) {
    this.statusMessageTemplate = statusMessageTemplate;
    return this;
  }

   /**
   * The template used to generate and write a status message.
   * @return statusMessageTemplate
  **/
  @ApiModelProperty(value = "The template used to generate and write a status message.")
  public String getStatusMessageTemplate() {
    return statusMessageTemplate;
  }

  public void setStatusMessageTemplate(String statusMessageTemplate) {
    this.statusMessageTemplate = statusMessageTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeadmanCheck deadmanCheck = (DeadmanCheck) o;
    return Objects.equals(this.type, deadmanCheck.type) &&
        Objects.equals(this.timeSince, deadmanCheck.timeSince) &&
        Objects.equals(this.staleTime, deadmanCheck.staleTime) &&
        Objects.equals(this.reportZero, deadmanCheck.reportZero) &&
        Objects.equals(this.level, deadmanCheck.level) &&
        Objects.equals(this.every, deadmanCheck.every) &&
        Objects.equals(this.offset, deadmanCheck.offset) &&
        Objects.equals(this.tags, deadmanCheck.tags) &&
        Objects.equals(this.statusMessageTemplate, deadmanCheck.statusMessageTemplate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, timeSince, staleTime, reportZero, level, every, offset, tags, statusMessageTemplate, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeadmanCheck {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    timeSince: ").append(toIndentedString(timeSince)).append("\n");
    sb.append("    staleTime: ").append(toIndentedString(staleTime)).append("\n");
    sb.append("    reportZero: ").append(toIndentedString(reportZero)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    every: ").append(toIndentedString(every)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    statusMessageTemplate: ").append(toIndentedString(statusMessageTemplate)).append("\n");
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

