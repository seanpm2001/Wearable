// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/wearable.proto
package org.microg.wearable.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.BYTES;

public final class ChannelDataRequest extends Message {

  public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
  public static final Boolean DEFAULT_FINALMESSAGE = false;

  @ProtoField(tag = 1)
  public final ChannelDataHeader header;

  @ProtoField(tag = 2, type = BYTES)
  public final ByteString payload;

  @ProtoField(tag = 3, type = BOOL)
  public final Boolean finalMessage;

  public ChannelDataRequest(ChannelDataHeader header, ByteString payload, Boolean finalMessage) {
    this.header = header;
    this.payload = payload;
    this.finalMessage = finalMessage;
  }

  private ChannelDataRequest(Builder builder) {
    this(builder.header, builder.payload, builder.finalMessage);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ChannelDataRequest)) return false;
    ChannelDataRequest o = (ChannelDataRequest) other;
    return equals(header, o.header)
        && equals(payload, o.payload)
        && equals(finalMessage, o.finalMessage);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = header != null ? header.hashCode() : 0;
      result = result * 37 + (payload != null ? payload.hashCode() : 0);
      result = result * 37 + (finalMessage != null ? finalMessage.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ChannelDataRequest> {

    public ChannelDataHeader header;
    public ByteString payload;
    public Boolean finalMessage;

    public Builder() {
    }

    public Builder(ChannelDataRequest message) {
      super(message);
      if (message == null) return;
      this.header = message.header;
      this.payload = message.payload;
      this.finalMessage = message.finalMessage;
    }

    public Builder header(ChannelDataHeader header) {
      this.header = header;
      return this;
    }

    public Builder payload(ByteString payload) {
      this.payload = payload;
      return this;
    }

    public Builder finalMessage(Boolean finalMessage) {
      this.finalMessage = finalMessage;
      return this;
    }

    @Override
    public ChannelDataRequest build() {
      return new ChannelDataRequest(this);
    }
  }
}
