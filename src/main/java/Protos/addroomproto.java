// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addroom.proto

package Protos;

public final class addroomproto {
  private addroomproto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LoginRoomRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 token = 1;
    /**
     * <code>required int32 token = 1;</code>
     */
    boolean hasToken();
    /**
     * <code>required int32 token = 1;</code>
     */
    int getToken();

    // required int32 roomnumber = 2;
    /**
     * <code>required int32 roomnumber = 2;</code>
     */
    boolean hasRoomnumber();
    /**
     * <code>required int32 roomnumber = 2;</code>
     */
    int getRoomnumber();
  }
  /**
   * Protobuf type {@code Protos.LoginRoomRequest}
   */
  public static final class LoginRoomRequest extends
      com.google.protobuf.GeneratedMessage
      implements LoginRoomRequestOrBuilder {
    // Use LoginRoomRequest.newBuilder() to construct.
    private LoginRoomRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private LoginRoomRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LoginRoomRequest defaultInstance;
    public static LoginRoomRequest getDefaultInstance() {
      return defaultInstance;
    }

    public LoginRoomRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private LoginRoomRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              token_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              roomnumber_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protos.addroomproto.internal_static_Protos_LoginRoomRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protos.addroomproto.internal_static_Protos_LoginRoomRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Protos.addroomproto.LoginRoomRequest.class, Protos.addroomproto.LoginRoomRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<LoginRoomRequest> PARSER =
        new com.google.protobuf.AbstractParser<LoginRoomRequest>() {
      public LoginRoomRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LoginRoomRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<LoginRoomRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 token = 1;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int token_;
    /**
     * <code>required int32 token = 1;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 token = 1;</code>
     */
    public int getToken() {
      return token_;
    }

    // required int32 roomnumber = 2;
    public static final int ROOMNUMBER_FIELD_NUMBER = 2;
    private int roomnumber_;
    /**
     * <code>required int32 roomnumber = 2;</code>
     */
    public boolean hasRoomnumber() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 roomnumber = 2;</code>
     */
    public int getRoomnumber() {
      return roomnumber_;
    }

    private void initFields() {
      token_ = 0;
      roomnumber_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasToken()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRoomnumber()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, token_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, roomnumber_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, token_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, roomnumber_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Protos.addroomproto.LoginRoomRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Protos.addroomproto.LoginRoomRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Protos.addroomproto.LoginRoomRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Protos.addroomproto.LoginRoomRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Protos.addroomproto.LoginRoomRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Protos.addroomproto.LoginRoomRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Protos.addroomproto.LoginRoomRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Protos.addroomproto.LoginRoomRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Protos.addroomproto.LoginRoomRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Protos.addroomproto.LoginRoomRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Protos.addroomproto.LoginRoomRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Protos.LoginRoomRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements Protos.addroomproto.LoginRoomRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protos.addroomproto.internal_static_Protos_LoginRoomRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protos.addroomproto.internal_static_Protos_LoginRoomRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Protos.addroomproto.LoginRoomRequest.class, Protos.addroomproto.LoginRoomRequest.Builder.class);
      }

      // Construct using Protos.addroomproto.LoginRoomRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        token_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        roomnumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protos.addroomproto.internal_static_Protos_LoginRoomRequest_descriptor;
      }

      public Protos.addroomproto.LoginRoomRequest getDefaultInstanceForType() {
        return Protos.addroomproto.LoginRoomRequest.getDefaultInstance();
      }

      public Protos.addroomproto.LoginRoomRequest build() {
        Protos.addroomproto.LoginRoomRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Protos.addroomproto.LoginRoomRequest buildPartial() {
        Protos.addroomproto.LoginRoomRequest result = new Protos.addroomproto.LoginRoomRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.token_ = token_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.roomnumber_ = roomnumber_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Protos.addroomproto.LoginRoomRequest) {
          return mergeFrom((Protos.addroomproto.LoginRoomRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Protos.addroomproto.LoginRoomRequest other) {
        if (other == Protos.addroomproto.LoginRoomRequest.getDefaultInstance()) return this;
        if (other.hasToken()) {
          setToken(other.getToken());
        }
        if (other.hasRoomnumber()) {
          setRoomnumber(other.getRoomnumber());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasToken()) {
          
          return false;
        }
        if (!hasRoomnumber()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Protos.addroomproto.LoginRoomRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Protos.addroomproto.LoginRoomRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 token = 1;
      private int token_ ;
      /**
       * <code>required int32 token = 1;</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 token = 1;</code>
       */
      public int getToken() {
        return token_;
      }
      /**
       * <code>required int32 token = 1;</code>
       */
      public Builder setToken(int value) {
        bitField0_ |= 0x00000001;
        token_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 token = 1;</code>
       */
      public Builder clearToken() {
        bitField0_ = (bitField0_ & ~0x00000001);
        token_ = 0;
        onChanged();
        return this;
      }

      // required int32 roomnumber = 2;
      private int roomnumber_ ;
      /**
       * <code>required int32 roomnumber = 2;</code>
       */
      public boolean hasRoomnumber() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 roomnumber = 2;</code>
       */
      public int getRoomnumber() {
        return roomnumber_;
      }
      /**
       * <code>required int32 roomnumber = 2;</code>
       */
      public Builder setRoomnumber(int value) {
        bitField0_ |= 0x00000002;
        roomnumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 roomnumber = 2;</code>
       */
      public Builder clearRoomnumber() {
        bitField0_ = (bitField0_ & ~0x00000002);
        roomnumber_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Protos.LoginRoomRequest)
    }

    static {
      defaultInstance = new LoginRoomRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Protos.LoginRoomRequest)
  }

  public interface LoginRoomResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required bool success = 3;
    /**
     * <code>required bool success = 3;</code>
     */
    boolean hasSuccess();
    /**
     * <code>required bool success = 3;</code>
     */
    boolean getSuccess();

    // optional string errormessage = 4;
    /**
     * <code>optional string errormessage = 4;</code>
     */
    boolean hasErrormessage();
    /**
     * <code>optional string errormessage = 4;</code>
     */
    java.lang.String getErrormessage();
    /**
     * <code>optional string errormessage = 4;</code>
     */
    com.google.protobuf.ByteString
        getErrormessageBytes();
  }
  /**
   * Protobuf type {@code Protos.LoginRoomResponse}
   */
  public static final class LoginRoomResponse extends
      com.google.protobuf.GeneratedMessage
      implements LoginRoomResponseOrBuilder {
    // Use LoginRoomResponse.newBuilder() to construct.
    private LoginRoomResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private LoginRoomResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LoginRoomResponse defaultInstance;
    public static LoginRoomResponse getDefaultInstance() {
      return defaultInstance;
    }

    public LoginRoomResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private LoginRoomResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 24: {
              bitField0_ |= 0x00000001;
              success_ = input.readBool();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000002;
              errormessage_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protos.addroomproto.internal_static_Protos_LoginRoomResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protos.addroomproto.internal_static_Protos_LoginRoomResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Protos.addroomproto.LoginRoomResponse.class, Protos.addroomproto.LoginRoomResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<LoginRoomResponse> PARSER =
        new com.google.protobuf.AbstractParser<LoginRoomResponse>() {
      public LoginRoomResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LoginRoomResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<LoginRoomResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required bool success = 3;
    public static final int SUCCESS_FIELD_NUMBER = 3;
    private boolean success_;
    /**
     * <code>required bool success = 3;</code>
     */
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bool success = 3;</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    // optional string errormessage = 4;
    public static final int ERRORMESSAGE_FIELD_NUMBER = 4;
    private java.lang.Object errormessage_;
    /**
     * <code>optional string errormessage = 4;</code>
     */
    public boolean hasErrormessage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string errormessage = 4;</code>
     */
    public java.lang.String getErrormessage() {
      java.lang.Object ref = errormessage_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errormessage_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string errormessage = 4;</code>
     */
    public com.google.protobuf.ByteString
        getErrormessageBytes() {
      java.lang.Object ref = errormessage_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errormessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      success_ = false;
      errormessage_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSuccess()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(3, success_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(4, getErrormessageBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, success_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getErrormessageBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Protos.addroomproto.LoginRoomResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Protos.addroomproto.LoginRoomResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Protos.addroomproto.LoginRoomResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Protos.addroomproto.LoginRoomResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Protos.addroomproto.LoginRoomResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Protos.addroomproto.LoginRoomResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Protos.addroomproto.LoginRoomResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Protos.addroomproto.LoginRoomResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Protos.addroomproto.LoginRoomResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Protos.addroomproto.LoginRoomResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Protos.addroomproto.LoginRoomResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Protos.LoginRoomResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements Protos.addroomproto.LoginRoomResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protos.addroomproto.internal_static_Protos_LoginRoomResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protos.addroomproto.internal_static_Protos_LoginRoomResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Protos.addroomproto.LoginRoomResponse.class, Protos.addroomproto.LoginRoomResponse.Builder.class);
      }

      // Construct using Protos.addroomproto.LoginRoomResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        success_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        errormessage_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protos.addroomproto.internal_static_Protos_LoginRoomResponse_descriptor;
      }

      public Protos.addroomproto.LoginRoomResponse getDefaultInstanceForType() {
        return Protos.addroomproto.LoginRoomResponse.getDefaultInstance();
      }

      public Protos.addroomproto.LoginRoomResponse build() {
        Protos.addroomproto.LoginRoomResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Protos.addroomproto.LoginRoomResponse buildPartial() {
        Protos.addroomproto.LoginRoomResponse result = new Protos.addroomproto.LoginRoomResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.success_ = success_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.errormessage_ = errormessage_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Protos.addroomproto.LoginRoomResponse) {
          return mergeFrom((Protos.addroomproto.LoginRoomResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Protos.addroomproto.LoginRoomResponse other) {
        if (other == Protos.addroomproto.LoginRoomResponse.getDefaultInstance()) return this;
        if (other.hasSuccess()) {
          setSuccess(other.getSuccess());
        }
        if (other.hasErrormessage()) {
          bitField0_ |= 0x00000002;
          errormessage_ = other.errormessage_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSuccess()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Protos.addroomproto.LoginRoomResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Protos.addroomproto.LoginRoomResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required bool success = 3;
      private boolean success_ ;
      /**
       * <code>required bool success = 3;</code>
       */
      public boolean hasSuccess() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bool success = 3;</code>
       */
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>required bool success = 3;</code>
       */
      public Builder setSuccess(boolean value) {
        bitField0_ |= 0x00000001;
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool success = 3;</code>
       */
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = false;
        onChanged();
        return this;
      }

      // optional string errormessage = 4;
      private java.lang.Object errormessage_ = "";
      /**
       * <code>optional string errormessage = 4;</code>
       */
      public boolean hasErrormessage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string errormessage = 4;</code>
       */
      public java.lang.String getErrormessage() {
        java.lang.Object ref = errormessage_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          errormessage_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string errormessage = 4;</code>
       */
      public com.google.protobuf.ByteString
          getErrormessageBytes() {
        java.lang.Object ref = errormessage_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errormessage_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string errormessage = 4;</code>
       */
      public Builder setErrormessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        errormessage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string errormessage = 4;</code>
       */
      public Builder clearErrormessage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        errormessage_ = getDefaultInstance().getErrormessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string errormessage = 4;</code>
       */
      public Builder setErrormessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        errormessage_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Protos.LoginRoomResponse)
    }

    static {
      defaultInstance = new LoginRoomResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Protos.LoginRoomResponse)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Protos_LoginRoomRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Protos_LoginRoomRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Protos_LoginRoomResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Protos_LoginRoomResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\raddroom.proto\022\006Protos\"5\n\020LoginRoomRequ" +
      "est\022\r\n\005token\030\001 \002(\005\022\022\n\nroomnumber\030\002 \002(\005\":" +
      "\n\021LoginRoomResponse\022\017\n\007success\030\003 \002(\010\022\024\n\014" +
      "errormessage\030\004 \001(\tB\026\n\006ProtosB\014addroompro" +
      "to"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Protos_LoginRoomRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Protos_LoginRoomRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Protos_LoginRoomRequest_descriptor,
              new java.lang.String[] { "Token", "Roomnumber", });
          internal_static_Protos_LoginRoomResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_Protos_LoginRoomResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Protos_LoginRoomResponse_descriptor,
              new java.lang.String[] { "Success", "Errormessage", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}