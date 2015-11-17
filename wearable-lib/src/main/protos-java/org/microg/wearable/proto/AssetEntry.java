// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/wearable.proto
package org.microg.wearable.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;

public final class AssetEntry extends Message {

  public static final String DEFAULT_KEY = "";
  public static final Integer DEFAULT_UNKNOWN3 = 0;

  @ProtoField(tag = 1, type = STRING)
  public final String key;

  @ProtoField(tag = 2)
  public final Asset value;

  @ProtoField(tag = 3, type = INT32)
  public final Integer unknown3;

  public AssetEntry(String key, Asset value, Integer unknown3) {
    this.key = key;
    this.value = value;
    this.unknown3 = unknown3;
  }

  private AssetEntry(Builder builder) {
    this(builder.key, builder.value, builder.unknown3);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AssetEntry)) return false;
    AssetEntry o = (AssetEntry) other;
    return equals(key, o.key)
        && equals(value, o.value)
        && equals(unknown3, o.unknown3);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = key != null ? key.hashCode() : 0;
      result = result * 37 + (value != null ? value.hashCode() : 0);
      result = result * 37 + (unknown3 != null ? unknown3.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AssetEntry> {

    public String key;
    public Asset value;
    public Integer unknown3;

    public Builder() {
    }

    public Builder(AssetEntry message) {
      super(message);
      if (message == null) return;
      this.key = message.key;
      this.value = message.value;
      this.unknown3 = message.unknown3;
    }

    public Builder key(String key) {
      this.key = key;
      return this;
    }

    public Builder value(Asset value) {
      this.value = value;
      return this;
    }

    public Builder unknown3(Integer unknown3) {
      this.unknown3 = unknown3;
      return this;
    }

    @Override
    public AssetEntry build() {
      return new AssetEntry(this);
    }
  }
}
