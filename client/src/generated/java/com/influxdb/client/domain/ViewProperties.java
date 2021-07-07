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
import com.influxdb.client.domain.Axes;
import com.influxdb.client.domain.BandViewProperties;
import com.influxdb.client.domain.Check;
import com.influxdb.client.domain.CheckViewProperties;
import com.influxdb.client.domain.DashboardColor;
import com.influxdb.client.domain.DashboardQuery;
import com.influxdb.client.domain.DecimalPlaces;
import com.influxdb.client.domain.GaugeViewProperties;
import com.influxdb.client.domain.HeatmapViewProperties;
import com.influxdb.client.domain.HistogramViewProperties;
import com.influxdb.client.domain.LinePlusSingleStatProperties;
import com.influxdb.client.domain.MarkdownViewProperties;
import com.influxdb.client.domain.MosaicViewProperties;
import com.influxdb.client.domain.RenamableField;
import com.influxdb.client.domain.ScatterViewProperties;
import com.influxdb.client.domain.SingleStatViewProperties;
import com.influxdb.client.domain.StaticLegend;
import com.influxdb.client.domain.TableViewProperties;
import com.influxdb.client.domain.TableViewPropertiesTableOptions;
import com.influxdb.client.domain.XYGeom;
import com.influxdb.client.domain.XYViewProperties;
import java.math.BigDecimal;
import java.util.List;

/**
 * ViewProperties
 */

public class ViewProperties {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewProperties {\n");
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

