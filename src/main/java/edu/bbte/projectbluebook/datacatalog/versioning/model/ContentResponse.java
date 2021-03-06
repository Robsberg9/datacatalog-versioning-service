package edu.bbte.projectbluebook.datacatalog.versioning.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the properties of a file in an Azure Blob Container at a specific time.
 */
@ApiModel(description = "Describes the properties of a file in an Azure Blob Container at a specific time.")

public class ContentResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("lastModified")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastModified;

  @JsonProperty("size")
  private Integer size;

  public ContentResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the content.
   * @return id
  */
  @ApiModelProperty(required = true, value = "The unique identifier of the content.")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContentResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the blob in the container.
   * @return name
  */
  @ApiModelProperty(example = "users.csv", required = true, value = "The name of the blob in the container.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContentResponse lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date when the blob was last modified.
   * @return lastModified
  */
  @ApiModelProperty(example = "2020-12-02T12:51:33Z", required = true, value = "The date when the blob was last modified.")
  @NotNull

  @Valid

  public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  public ContentResponse size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The size of the blob in bytes.
   * minimum: 0
   * @return size
  */
  @ApiModelProperty(example = "176", value = "The size of the blob in bytes.")

@Min(0)
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentResponse contentResponse = (ContentResponse) o;
    return Objects.equals(this.id, contentResponse.id) &&
        Objects.equals(this.name, contentResponse.name) &&
        Objects.equals(this.lastModified, contentResponse.lastModified) &&
        Objects.equals(this.size, contentResponse.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastModified, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

