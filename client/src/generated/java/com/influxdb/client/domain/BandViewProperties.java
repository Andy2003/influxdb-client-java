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
import com.influxdb.client.domain.Axes;
import com.influxdb.client.domain.DashboardColor;
import com.influxdb.client.domain.DashboardQuery;
import com.influxdb.client.domain.StaticLegend;
import com.influxdb.client.domain.XYGeom;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BandViewProperties
 */

public class BandViewProperties extends ViewProperties {
  public static final String SERIALIZED_NAME_TIME_FORMAT = "timeFormat";
  @SerializedName(SERIALIZED_NAME_TIME_FORMAT)
  private String timeFormat;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BAND("band");

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
  private TypeEnum type = TypeEnum.BAND;

  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<DashboardQuery> queries = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLORS = "colors";
  @SerializedName(SERIALIZED_NAME_COLORS)
  private List<DashboardColor> colors = new ArrayList<>();

  /**
   * Gets or Sets shape
   */
  @JsonAdapter(ShapeEnum.Adapter.class)
  public enum ShapeEnum {
    CHRONOGRAF_V2("chronograf-v2");

    private String value;

    ShapeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShapeEnum fromValue(String text) {
      for (ShapeEnum b : ShapeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ShapeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShapeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShapeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ShapeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SHAPE = "shape";
  @SerializedName(SERIALIZED_NAME_SHAPE)
  private ShapeEnum shape = ShapeEnum.CHRONOGRAF_V2;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_SHOW_NOTE_WHEN_EMPTY = "showNoteWhenEmpty";
  @SerializedName(SERIALIZED_NAME_SHOW_NOTE_WHEN_EMPTY)
  private Boolean showNoteWhenEmpty;

  public static final String SERIALIZED_NAME_AXES = "axes";
  @SerializedName(SERIALIZED_NAME_AXES)
  private Axes axes = null;

  public static final String SERIALIZED_NAME_STATIC_LEGEND = "staticLegend";
  @SerializedName(SERIALIZED_NAME_STATIC_LEGEND)
  private StaticLegend staticLegend = null;

  public static final String SERIALIZED_NAME_X_COLUMN = "xColumn";
  @SerializedName(SERIALIZED_NAME_X_COLUMN)
  private String xColumn;

  public static final String SERIALIZED_NAME_GENERATE_X_AXIS_TICKS = "generateXAxisTicks";
  @SerializedName(SERIALIZED_NAME_GENERATE_X_AXIS_TICKS)
  private List<String> generateXAxisTicks = new ArrayList<>();

  public static final String SERIALIZED_NAME_X_TOTAL_TICKS = "xTotalTicks";
  @SerializedName(SERIALIZED_NAME_X_TOTAL_TICKS)
  private Integer xTotalTicks;

  public static final String SERIALIZED_NAME_X_TICK_START = "xTickStart";
  @SerializedName(SERIALIZED_NAME_X_TICK_START)
  private Float xTickStart;

  public static final String SERIALIZED_NAME_X_TICK_STEP = "xTickStep";
  @SerializedName(SERIALIZED_NAME_X_TICK_STEP)
  private Float xTickStep;

  public static final String SERIALIZED_NAME_Y_COLUMN = "yColumn";
  @SerializedName(SERIALIZED_NAME_Y_COLUMN)
  private String yColumn;

  public static final String SERIALIZED_NAME_GENERATE_Y_AXIS_TICKS = "generateYAxisTicks";
  @SerializedName(SERIALIZED_NAME_GENERATE_Y_AXIS_TICKS)
  private List<String> generateYAxisTicks = new ArrayList<>();

  public static final String SERIALIZED_NAME_Y_TOTAL_TICKS = "yTotalTicks";
  @SerializedName(SERIALIZED_NAME_Y_TOTAL_TICKS)
  private Integer yTotalTicks;

  public static final String SERIALIZED_NAME_Y_TICK_START = "yTickStart";
  @SerializedName(SERIALIZED_NAME_Y_TICK_START)
  private Float yTickStart;

  public static final String SERIALIZED_NAME_Y_TICK_STEP = "yTickStep";
  @SerializedName(SERIALIZED_NAME_Y_TICK_STEP)
  private Float yTickStep;

  public static final String SERIALIZED_NAME_UPPER_COLUMN = "upperColumn";
  @SerializedName(SERIALIZED_NAME_UPPER_COLUMN)
  private String upperColumn;

  public static final String SERIALIZED_NAME_MAIN_COLUMN = "mainColumn";
  @SerializedName(SERIALIZED_NAME_MAIN_COLUMN)
  private String mainColumn;

  public static final String SERIALIZED_NAME_LOWER_COLUMN = "lowerColumn";
  @SerializedName(SERIALIZED_NAME_LOWER_COLUMN)
  private String lowerColumn;

  /**
   * Gets or Sets hoverDimension
   */
  @JsonAdapter(HoverDimensionEnum.Adapter.class)
  public enum HoverDimensionEnum {
    AUTO("auto"),
    
    X("x"),
    
    Y("y"),
    
    XY("xy");

    private String value;

    HoverDimensionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HoverDimensionEnum fromValue(String text) {
      for (HoverDimensionEnum b : HoverDimensionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HoverDimensionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HoverDimensionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HoverDimensionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HoverDimensionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_HOVER_DIMENSION = "hoverDimension";
  @SerializedName(SERIALIZED_NAME_HOVER_DIMENSION)
  private HoverDimensionEnum hoverDimension;

  public static final String SERIALIZED_NAME_GEOM = "geom";
  @SerializedName(SERIALIZED_NAME_GEOM)
  private XYGeom geom = null;

  public static final String SERIALIZED_NAME_LEGEND_COLORIZE_ROWS = "legendColorizeRows";
  @SerializedName(SERIALIZED_NAME_LEGEND_COLORIZE_ROWS)
  private Boolean legendColorizeRows;

  public static final String SERIALIZED_NAME_LEGEND_HIDE = "legendHide";
  @SerializedName(SERIALIZED_NAME_LEGEND_HIDE)
  private Boolean legendHide;

  public static final String SERIALIZED_NAME_LEGEND_OPACITY = "legendOpacity";
  @SerializedName(SERIALIZED_NAME_LEGEND_OPACITY)
  private Float legendOpacity;

  public static final String SERIALIZED_NAME_LEGEND_ORIENTATION_THRESHOLD = "legendOrientationThreshold";
  @SerializedName(SERIALIZED_NAME_LEGEND_ORIENTATION_THRESHOLD)
  private Integer legendOrientationThreshold;

  public BandViewProperties timeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
    return this;
  }

   /**
   * Get timeFormat
   * @return timeFormat
  **/
  @ApiModelProperty(value = "")
  public String getTimeFormat() {
    return timeFormat;
  }

  public void setTimeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public BandViewProperties queries(List<DashboardQuery> queries) {
    this.queries = queries;
    return this;
  }

  public BandViewProperties addQueriesItem(DashboardQuery queriesItem) {
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  @ApiModelProperty(required = true, value = "")
  public List<DashboardQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<DashboardQuery> queries) {
    this.queries = queries;
  }

  public BandViewProperties colors(List<DashboardColor> colors) {
    this.colors = colors;
    return this;
  }

  public BandViewProperties addColorsItem(DashboardColor colorsItem) {
    this.colors.add(colorsItem);
    return this;
  }

   /**
   * Colors define color encoding of data into a visualization
   * @return colors
  **/
  @ApiModelProperty(required = true, value = "Colors define color encoding of data into a visualization")
  public List<DashboardColor> getColors() {
    return colors;
  }

  public void setColors(List<DashboardColor> colors) {
    this.colors = colors;
  }

   /**
   * Get shape
   * @return shape
  **/
  @ApiModelProperty(required = true, value = "")
  public ShapeEnum getShape() {
    return shape;
  }

  public BandViewProperties note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public BandViewProperties showNoteWhenEmpty(Boolean showNoteWhenEmpty) {
    this.showNoteWhenEmpty = showNoteWhenEmpty;
    return this;
  }

   /**
   * If true, will display note when empty
   * @return showNoteWhenEmpty
  **/
  @ApiModelProperty(required = true, value = "If true, will display note when empty")
  public Boolean getShowNoteWhenEmpty() {
    return showNoteWhenEmpty;
  }

  public void setShowNoteWhenEmpty(Boolean showNoteWhenEmpty) {
    this.showNoteWhenEmpty = showNoteWhenEmpty;
  }

  public BandViewProperties axes(Axes axes) {
    this.axes = axes;
    return this;
  }

   /**
   * Get axes
   * @return axes
  **/
  @ApiModelProperty(required = true, value = "")
  public Axes getAxes() {
    return axes;
  }

  public void setAxes(Axes axes) {
    this.axes = axes;
  }

  public BandViewProperties staticLegend(StaticLegend staticLegend) {
    this.staticLegend = staticLegend;
    return this;
  }

   /**
   * Get staticLegend
   * @return staticLegend
  **/
  @ApiModelProperty(value = "")
  public StaticLegend getStaticLegend() {
    return staticLegend;
  }

  public void setStaticLegend(StaticLegend staticLegend) {
    this.staticLegend = staticLegend;
  }

  public BandViewProperties xColumn(String xColumn) {
    this.xColumn = xColumn;
    return this;
  }

   /**
   * Get xColumn
   * @return xColumn
  **/
  @ApiModelProperty(value = "")
  public String getXColumn() {
    return xColumn;
  }

  public void setXColumn(String xColumn) {
    this.xColumn = xColumn;
  }

  public BandViewProperties generateXAxisTicks(List<String> generateXAxisTicks) {
    this.generateXAxisTicks = generateXAxisTicks;
    return this;
  }

  public BandViewProperties addGenerateXAxisTicksItem(String generateXAxisTicksItem) {
    if (this.generateXAxisTicks == null) {
      this.generateXAxisTicks = new ArrayList<>();
    }
    this.generateXAxisTicks.add(generateXAxisTicksItem);
    return this;
  }

   /**
   * Get generateXAxisTicks
   * @return generateXAxisTicks
  **/
  @ApiModelProperty(value = "")
  public List<String> getGenerateXAxisTicks() {
    return generateXAxisTicks;
  }

  public void setGenerateXAxisTicks(List<String> generateXAxisTicks) {
    this.generateXAxisTicks = generateXAxisTicks;
  }

  public BandViewProperties xTotalTicks(Integer xTotalTicks) {
    this.xTotalTicks = xTotalTicks;
    return this;
  }

   /**
   * Get xTotalTicks
   * @return xTotalTicks
  **/
  @ApiModelProperty(value = "")
  public Integer getXTotalTicks() {
    return xTotalTicks;
  }

  public void setXTotalTicks(Integer xTotalTicks) {
    this.xTotalTicks = xTotalTicks;
  }

  public BandViewProperties xTickStart(Float xTickStart) {
    this.xTickStart = xTickStart;
    return this;
  }

   /**
   * Get xTickStart
   * @return xTickStart
  **/
  @ApiModelProperty(value = "")
  public Float getXTickStart() {
    return xTickStart;
  }

  public void setXTickStart(Float xTickStart) {
    this.xTickStart = xTickStart;
  }

  public BandViewProperties xTickStep(Float xTickStep) {
    this.xTickStep = xTickStep;
    return this;
  }

   /**
   * Get xTickStep
   * @return xTickStep
  **/
  @ApiModelProperty(value = "")
  public Float getXTickStep() {
    return xTickStep;
  }

  public void setXTickStep(Float xTickStep) {
    this.xTickStep = xTickStep;
  }

  public BandViewProperties yColumn(String yColumn) {
    this.yColumn = yColumn;
    return this;
  }

   /**
   * Get yColumn
   * @return yColumn
  **/
  @ApiModelProperty(value = "")
  public String getYColumn() {
    return yColumn;
  }

  public void setYColumn(String yColumn) {
    this.yColumn = yColumn;
  }

  public BandViewProperties generateYAxisTicks(List<String> generateYAxisTicks) {
    this.generateYAxisTicks = generateYAxisTicks;
    return this;
  }

  public BandViewProperties addGenerateYAxisTicksItem(String generateYAxisTicksItem) {
    if (this.generateYAxisTicks == null) {
      this.generateYAxisTicks = new ArrayList<>();
    }
    this.generateYAxisTicks.add(generateYAxisTicksItem);
    return this;
  }

   /**
   * Get generateYAxisTicks
   * @return generateYAxisTicks
  **/
  @ApiModelProperty(value = "")
  public List<String> getGenerateYAxisTicks() {
    return generateYAxisTicks;
  }

  public void setGenerateYAxisTicks(List<String> generateYAxisTicks) {
    this.generateYAxisTicks = generateYAxisTicks;
  }

  public BandViewProperties yTotalTicks(Integer yTotalTicks) {
    this.yTotalTicks = yTotalTicks;
    return this;
  }

   /**
   * Get yTotalTicks
   * @return yTotalTicks
  **/
  @ApiModelProperty(value = "")
  public Integer getYTotalTicks() {
    return yTotalTicks;
  }

  public void setYTotalTicks(Integer yTotalTicks) {
    this.yTotalTicks = yTotalTicks;
  }

  public BandViewProperties yTickStart(Float yTickStart) {
    this.yTickStart = yTickStart;
    return this;
  }

   /**
   * Get yTickStart
   * @return yTickStart
  **/
  @ApiModelProperty(value = "")
  public Float getYTickStart() {
    return yTickStart;
  }

  public void setYTickStart(Float yTickStart) {
    this.yTickStart = yTickStart;
  }

  public BandViewProperties yTickStep(Float yTickStep) {
    this.yTickStep = yTickStep;
    return this;
  }

   /**
   * Get yTickStep
   * @return yTickStep
  **/
  @ApiModelProperty(value = "")
  public Float getYTickStep() {
    return yTickStep;
  }

  public void setYTickStep(Float yTickStep) {
    this.yTickStep = yTickStep;
  }

  public BandViewProperties upperColumn(String upperColumn) {
    this.upperColumn = upperColumn;
    return this;
  }

   /**
   * Get upperColumn
   * @return upperColumn
  **/
  @ApiModelProperty(value = "")
  public String getUpperColumn() {
    return upperColumn;
  }

  public void setUpperColumn(String upperColumn) {
    this.upperColumn = upperColumn;
  }

  public BandViewProperties mainColumn(String mainColumn) {
    this.mainColumn = mainColumn;
    return this;
  }

   /**
   * Get mainColumn
   * @return mainColumn
  **/
  @ApiModelProperty(value = "")
  public String getMainColumn() {
    return mainColumn;
  }

  public void setMainColumn(String mainColumn) {
    this.mainColumn = mainColumn;
  }

  public BandViewProperties lowerColumn(String lowerColumn) {
    this.lowerColumn = lowerColumn;
    return this;
  }

   /**
   * Get lowerColumn
   * @return lowerColumn
  **/
  @ApiModelProperty(value = "")
  public String getLowerColumn() {
    return lowerColumn;
  }

  public void setLowerColumn(String lowerColumn) {
    this.lowerColumn = lowerColumn;
  }

  public BandViewProperties hoverDimension(HoverDimensionEnum hoverDimension) {
    this.hoverDimension = hoverDimension;
    return this;
  }

   /**
   * Get hoverDimension
   * @return hoverDimension
  **/
  @ApiModelProperty(value = "")
  public HoverDimensionEnum getHoverDimension() {
    return hoverDimension;
  }

  public void setHoverDimension(HoverDimensionEnum hoverDimension) {
    this.hoverDimension = hoverDimension;
  }

  public BandViewProperties geom(XYGeom geom) {
    this.geom = geom;
    return this;
  }

   /**
   * Get geom
   * @return geom
  **/
  @ApiModelProperty(required = true, value = "")
  public XYGeom getGeom() {
    return geom;
  }

  public void setGeom(XYGeom geom) {
    this.geom = geom;
  }

  public BandViewProperties legendColorizeRows(Boolean legendColorizeRows) {
    this.legendColorizeRows = legendColorizeRows;
    return this;
  }

   /**
   * Get legendColorizeRows
   * @return legendColorizeRows
  **/
  @ApiModelProperty(value = "")
  public Boolean getLegendColorizeRows() {
    return legendColorizeRows;
  }

  public void setLegendColorizeRows(Boolean legendColorizeRows) {
    this.legendColorizeRows = legendColorizeRows;
  }

  public BandViewProperties legendHide(Boolean legendHide) {
    this.legendHide = legendHide;
    return this;
  }

   /**
   * Get legendHide
   * @return legendHide
  **/
  @ApiModelProperty(value = "")
  public Boolean getLegendHide() {
    return legendHide;
  }

  public void setLegendHide(Boolean legendHide) {
    this.legendHide = legendHide;
  }

  public BandViewProperties legendOpacity(Float legendOpacity) {
    this.legendOpacity = legendOpacity;
    return this;
  }

   /**
   * Get legendOpacity
   * @return legendOpacity
  **/
  @ApiModelProperty(value = "")
  public Float getLegendOpacity() {
    return legendOpacity;
  }

  public void setLegendOpacity(Float legendOpacity) {
    this.legendOpacity = legendOpacity;
  }

  public BandViewProperties legendOrientationThreshold(Integer legendOrientationThreshold) {
    this.legendOrientationThreshold = legendOrientationThreshold;
    return this;
  }

   /**
   * Get legendOrientationThreshold
   * @return legendOrientationThreshold
  **/
  @ApiModelProperty(value = "")
  public Integer getLegendOrientationThreshold() {
    return legendOrientationThreshold;
  }

  public void setLegendOrientationThreshold(Integer legendOrientationThreshold) {
    this.legendOrientationThreshold = legendOrientationThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BandViewProperties bandViewProperties = (BandViewProperties) o;
    return Objects.equals(this.timeFormat, bandViewProperties.timeFormat) &&
        Objects.equals(this.type, bandViewProperties.type) &&
        Objects.equals(this.queries, bandViewProperties.queries) &&
        Objects.equals(this.colors, bandViewProperties.colors) &&
        Objects.equals(this.shape, bandViewProperties.shape) &&
        Objects.equals(this.note, bandViewProperties.note) &&
        Objects.equals(this.showNoteWhenEmpty, bandViewProperties.showNoteWhenEmpty) &&
        Objects.equals(this.axes, bandViewProperties.axes) &&
        Objects.equals(this.staticLegend, bandViewProperties.staticLegend) &&
        Objects.equals(this.xColumn, bandViewProperties.xColumn) &&
        Objects.equals(this.generateXAxisTicks, bandViewProperties.generateXAxisTicks) &&
        Objects.equals(this.xTotalTicks, bandViewProperties.xTotalTicks) &&
        Objects.equals(this.xTickStart, bandViewProperties.xTickStart) &&
        Objects.equals(this.xTickStep, bandViewProperties.xTickStep) &&
        Objects.equals(this.yColumn, bandViewProperties.yColumn) &&
        Objects.equals(this.generateYAxisTicks, bandViewProperties.generateYAxisTicks) &&
        Objects.equals(this.yTotalTicks, bandViewProperties.yTotalTicks) &&
        Objects.equals(this.yTickStart, bandViewProperties.yTickStart) &&
        Objects.equals(this.yTickStep, bandViewProperties.yTickStep) &&
        Objects.equals(this.upperColumn, bandViewProperties.upperColumn) &&
        Objects.equals(this.mainColumn, bandViewProperties.mainColumn) &&
        Objects.equals(this.lowerColumn, bandViewProperties.lowerColumn) &&
        Objects.equals(this.hoverDimension, bandViewProperties.hoverDimension) &&
        Objects.equals(this.geom, bandViewProperties.geom) &&
        Objects.equals(this.legendColorizeRows, bandViewProperties.legendColorizeRows) &&
        Objects.equals(this.legendHide, bandViewProperties.legendHide) &&
        Objects.equals(this.legendOpacity, bandViewProperties.legendOpacity) &&
        Objects.equals(this.legendOrientationThreshold, bandViewProperties.legendOrientationThreshold) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeFormat, type, queries, colors, shape, note, showNoteWhenEmpty, axes, staticLegend, xColumn, generateXAxisTicks, xTotalTicks, xTickStart, xTickStep, yColumn, generateYAxisTicks, yTotalTicks, yTickStart, yTickStep, upperColumn, mainColumn, lowerColumn, hoverDimension, geom, legendColorizeRows, legendHide, legendOpacity, legendOrientationThreshold, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BandViewProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    showNoteWhenEmpty: ").append(toIndentedString(showNoteWhenEmpty)).append("\n");
    sb.append("    axes: ").append(toIndentedString(axes)).append("\n");
    sb.append("    staticLegend: ").append(toIndentedString(staticLegend)).append("\n");
    sb.append("    xColumn: ").append(toIndentedString(xColumn)).append("\n");
    sb.append("    generateXAxisTicks: ").append(toIndentedString(generateXAxisTicks)).append("\n");
    sb.append("    xTotalTicks: ").append(toIndentedString(xTotalTicks)).append("\n");
    sb.append("    xTickStart: ").append(toIndentedString(xTickStart)).append("\n");
    sb.append("    xTickStep: ").append(toIndentedString(xTickStep)).append("\n");
    sb.append("    yColumn: ").append(toIndentedString(yColumn)).append("\n");
    sb.append("    generateYAxisTicks: ").append(toIndentedString(generateYAxisTicks)).append("\n");
    sb.append("    yTotalTicks: ").append(toIndentedString(yTotalTicks)).append("\n");
    sb.append("    yTickStart: ").append(toIndentedString(yTickStart)).append("\n");
    sb.append("    yTickStep: ").append(toIndentedString(yTickStep)).append("\n");
    sb.append("    upperColumn: ").append(toIndentedString(upperColumn)).append("\n");
    sb.append("    mainColumn: ").append(toIndentedString(mainColumn)).append("\n");
    sb.append("    lowerColumn: ").append(toIndentedString(lowerColumn)).append("\n");
    sb.append("    hoverDimension: ").append(toIndentedString(hoverDimension)).append("\n");
    sb.append("    geom: ").append(toIndentedString(geom)).append("\n");
    sb.append("    legendColorizeRows: ").append(toIndentedString(legendColorizeRows)).append("\n");
    sb.append("    legendHide: ").append(toIndentedString(legendHide)).append("\n");
    sb.append("    legendOpacity: ").append(toIndentedString(legendOpacity)).append("\n");
    sb.append("    legendOrientationThreshold: ").append(toIndentedString(legendOrientationThreshold)).append("\n");
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

