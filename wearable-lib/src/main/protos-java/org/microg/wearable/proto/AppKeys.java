// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/wearable.proto
package org.microg.wearable.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class AppKeys extends Message {

  public static final List<AppKey> DEFAULT_APPKEYS = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED, messageType = AppKey.class)
  public final List<AppKey> appKeys;

  public AppKeys(List<AppKey> appKeys) {
    this.appKeys = immutableCopyOf(appKeys);
  }

  private AppKeys(Builder builder) {
    this(builder.appKeys);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AppKeys)) return false;
    return equals(appKeys, ((AppKeys) other).appKeys);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = appKeys != null ? appKeys.hashCode() : 1);
  }

  public static final class Builder extends Message.Builder<AppKeys> {

    public List<AppKey> appKeys;

    public Builder() {
    }

    public Builder(AppKeys message) {
      super(message);
      if (message == null) return;
      this.appKeys = copyOf(message.appKeys);
    }

    public Builder appKeys(List<AppKey> appKeys) {
      this.appKeys = checkForNulls(appKeys);
      return this;
    }

    @Override
    public AppKeys build() {
      return new AppKeys(this);
    }
  }
}
