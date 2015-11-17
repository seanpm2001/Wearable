// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/wearable.proto
package org.microg.wearable.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;

public final class ChannelRequest extends Message {

  public static final Integer DEFAULT_VERSION = 0;
  public static final Integer DEFAULT_ORIGIN = 0;

  @ProtoField(tag = 2)
  public final ChannelControlRequest channelControlRequest;

  @ProtoField(tag = 3)
  public final ChannelDataRequest channelDataRequest;

  @ProtoField(tag = 4)
  public final ChannelDataAckRequest channelDataAckRequest;

  @ProtoField(tag = 6, type = INT32)
  public final Integer version;

  @ProtoField(tag = 7, type = INT32)
  public final Integer origin;

  public ChannelRequest(ChannelControlRequest channelControlRequest, ChannelDataRequest channelDataRequest, ChannelDataAckRequest channelDataAckRequest, Integer version, Integer origin) {
    this.channelControlRequest = channelControlRequest;
    this.channelDataRequest = channelDataRequest;
    this.channelDataAckRequest = channelDataAckRequest;
    this.version = version;
    this.origin = origin;
  }

  private ChannelRequest(Builder builder) {
    this(builder.channelControlRequest, builder.channelDataRequest, builder.channelDataAckRequest, builder.version, builder.origin);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ChannelRequest)) return false;
    ChannelRequest o = (ChannelRequest) other;
    return equals(channelControlRequest, o.channelControlRequest)
        && equals(channelDataRequest, o.channelDataRequest)
        && equals(channelDataAckRequest, o.channelDataAckRequest)
        && equals(version, o.version)
        && equals(origin, o.origin);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = channelControlRequest != null ? channelControlRequest.hashCode() : 0;
      result = result * 37 + (channelDataRequest != null ? channelDataRequest.hashCode() : 0);
      result = result * 37 + (channelDataAckRequest != null ? channelDataAckRequest.hashCode() : 0);
      result = result * 37 + (version != null ? version.hashCode() : 0);
      result = result * 37 + (origin != null ? origin.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ChannelRequest> {

    public ChannelControlRequest channelControlRequest;
    public ChannelDataRequest channelDataRequest;
    public ChannelDataAckRequest channelDataAckRequest;
    public Integer version;
    public Integer origin;

    public Builder() {
    }

    public Builder(ChannelRequest message) {
      super(message);
      if (message == null) return;
      this.channelControlRequest = message.channelControlRequest;
      this.channelDataRequest = message.channelDataRequest;
      this.channelDataAckRequest = message.channelDataAckRequest;
      this.version = message.version;
      this.origin = message.origin;
    }

    public Builder channelControlRequest(ChannelControlRequest channelControlRequest) {
      this.channelControlRequest = channelControlRequest;
      return this;
    }

    public Builder channelDataRequest(ChannelDataRequest channelDataRequest) {
      this.channelDataRequest = channelDataRequest;
      return this;
    }

    public Builder channelDataAckRequest(ChannelDataAckRequest channelDataAckRequest) {
      this.channelDataAckRequest = channelDataAckRequest;
      return this;
    }

    public Builder version(Integer version) {
      this.version = version;
      return this;
    }

    public Builder origin(Integer origin) {
      this.origin = origin;
      return this;
    }

    @Override
    public ChannelRequest build() {
      return new ChannelRequest(this);
    }
  }
}
