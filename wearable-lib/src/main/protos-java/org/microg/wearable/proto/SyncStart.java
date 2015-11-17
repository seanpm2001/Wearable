// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/wearable.proto
package org.microg.wearable.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Label.REPEATED;

public final class SyncStart extends Message {

  public static final Long DEFAULT_RECEIVEDSEQID = 0L;
  public static final List<SyncTableEntry> DEFAULT_SYNCTABLE = Collections.emptyList();
  public static final Integer DEFAULT_VERSION = 0;

  @ProtoField(tag = 1, type = INT64)
  public final Long receivedSeqId;

  @ProtoField(tag = 2, label = REPEATED, messageType = SyncTableEntry.class)
  public final List<SyncTableEntry> syncTable;

  @ProtoField(tag = 3, type = INT32)
  public final Integer version;

  public SyncStart(Long receivedSeqId, List<SyncTableEntry> syncTable, Integer version) {
    this.receivedSeqId = receivedSeqId;
    this.syncTable = immutableCopyOf(syncTable);
    this.version = version;
  }

  private SyncStart(Builder builder) {
    this(builder.receivedSeqId, builder.syncTable, builder.version);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SyncStart)) return false;
    SyncStart o = (SyncStart) other;
    return equals(receivedSeqId, o.receivedSeqId)
        && equals(syncTable, o.syncTable)
        && equals(version, o.version);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = receivedSeqId != null ? receivedSeqId.hashCode() : 0;
      result = result * 37 + (syncTable != null ? syncTable.hashCode() : 1);
      result = result * 37 + (version != null ? version.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<SyncStart> {

    public Long receivedSeqId;
    public List<SyncTableEntry> syncTable;
    public Integer version;

    public Builder() {
    }

    public Builder(SyncStart message) {
      super(message);
      if (message == null) return;
      this.receivedSeqId = message.receivedSeqId;
      this.syncTable = copyOf(message.syncTable);
      this.version = message.version;
    }

    public Builder receivedSeqId(Long receivedSeqId) {
      this.receivedSeqId = receivedSeqId;
      return this;
    }

    public Builder syncTable(List<SyncTableEntry> syncTable) {
      this.syncTable = checkForNulls(syncTable);
      return this;
    }

    public Builder version(Integer version) {
      this.version = version;
      return this;
    }

    @Override
    public SyncStart build() {
      return new SyncStart(this);
    }
  }
}
