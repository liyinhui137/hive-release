/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.serde2.thrift.test;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-4-25")
public class IntString implements org.apache.thrift.TBase<IntString, IntString._Fields>, java.io.Serializable, Cloneable, Comparable<IntString> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("IntString");

  private static final org.apache.thrift.protocol.TField MYINT_FIELD_DESC = new org.apache.thrift.protocol.TField("myint", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MY_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("myString", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField UNDERSCORE_INT_FIELD_DESC = new org.apache.thrift.protocol.TField("underscore_int", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new IntStringStandardSchemeFactory());
    schemes.put(TupleScheme.class, new IntStringTupleSchemeFactory());
  }

  private int myint; // required
  private String myString; // required
  private int underscore_int; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MYINT((short)1, "myint"),
    MY_STRING((short)2, "myString"),
    UNDERSCORE_INT((short)3, "underscore_int");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MYINT
          return MYINT;
        case 2: // MY_STRING
          return MY_STRING;
        case 3: // UNDERSCORE_INT
          return UNDERSCORE_INT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MYINT_ISSET_ID = 0;
  private static final int __UNDERSCORE_INT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MYINT, new org.apache.thrift.meta_data.FieldMetaData("myint", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MY_STRING, new org.apache.thrift.meta_data.FieldMetaData("myString", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UNDERSCORE_INT, new org.apache.thrift.meta_data.FieldMetaData("underscore_int", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(IntString.class, metaDataMap);
  }

  public IntString() {
  }

  public IntString(
    int myint,
    String myString,
    int underscore_int)
  {
    this();
    this.myint = myint;
    setMyintIsSet(true);
    this.myString = myString;
    this.underscore_int = underscore_int;
    setUnderscore_intIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IntString(IntString other) {
    __isset_bitfield = other.__isset_bitfield;
    this.myint = other.myint;
    if (other.isSetMyString()) {
      this.myString = other.myString;
    }
    this.underscore_int = other.underscore_int;
  }

  public IntString deepCopy() {
    return new IntString(this);
  }

  @Override
  public void clear() {
    setMyintIsSet(false);
    this.myint = 0;
    this.myString = null;
    setUnderscore_intIsSet(false);
    this.underscore_int = 0;
  }

  public int getMyint() {
    return this.myint;
  }

  public void setMyint(int myint) {
    this.myint = myint;
    setMyintIsSet(true);
  }

  public void unsetMyint() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MYINT_ISSET_ID);
  }

  /** Returns true if field myint is set (has been assigned a value) and false otherwise */
  public boolean isSetMyint() {
    return EncodingUtils.testBit(__isset_bitfield, __MYINT_ISSET_ID);
  }

  public void setMyintIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MYINT_ISSET_ID, value);
  }

  public String getMyString() {
    return this.myString;
  }

  public void setMyString(String myString) {
    this.myString = myString;
  }

  public void unsetMyString() {
    this.myString = null;
  }

  /** Returns true if field myString is set (has been assigned a value) and false otherwise */
  public boolean isSetMyString() {
    return this.myString != null;
  }

  public void setMyStringIsSet(boolean value) {
    if (!value) {
      this.myString = null;
    }
  }

  public int getUnderscore_int() {
    return this.underscore_int;
  }

  public void setUnderscore_int(int underscore_int) {
    this.underscore_int = underscore_int;
    setUnderscore_intIsSet(true);
  }

  public void unsetUnderscore_int() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UNDERSCORE_INT_ISSET_ID);
  }

  /** Returns true if field underscore_int is set (has been assigned a value) and false otherwise */
  public boolean isSetUnderscore_int() {
    return EncodingUtils.testBit(__isset_bitfield, __UNDERSCORE_INT_ISSET_ID);
  }

  public void setUnderscore_intIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UNDERSCORE_INT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MYINT:
      if (value == null) {
        unsetMyint();
      } else {
        setMyint((Integer)value);
      }
      break;

    case MY_STRING:
      if (value == null) {
        unsetMyString();
      } else {
        setMyString((String)value);
      }
      break;

    case UNDERSCORE_INT:
      if (value == null) {
        unsetUnderscore_int();
      } else {
        setUnderscore_int((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MYINT:
      return Integer.valueOf(getMyint());

    case MY_STRING:
      return getMyString();

    case UNDERSCORE_INT:
      return Integer.valueOf(getUnderscore_int());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MYINT:
      return isSetMyint();
    case MY_STRING:
      return isSetMyString();
    case UNDERSCORE_INT:
      return isSetUnderscore_int();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IntString)
      return this.equals((IntString)that);
    return false;
  }

  public boolean equals(IntString that) {
    if (that == null)
      return false;

    boolean this_present_myint = true;
    boolean that_present_myint = true;
    if (this_present_myint || that_present_myint) {
      if (!(this_present_myint && that_present_myint))
        return false;
      if (this.myint != that.myint)
        return false;
    }

    boolean this_present_myString = true && this.isSetMyString();
    boolean that_present_myString = true && that.isSetMyString();
    if (this_present_myString || that_present_myString) {
      if (!(this_present_myString && that_present_myString))
        return false;
      if (!this.myString.equals(that.myString))
        return false;
    }

    boolean this_present_underscore_int = true;
    boolean that_present_underscore_int = true;
    if (this_present_underscore_int || that_present_underscore_int) {
      if (!(this_present_underscore_int && that_present_underscore_int))
        return false;
      if (this.underscore_int != that.underscore_int)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_myint = true;
    list.add(present_myint);
    if (present_myint)
      list.add(myint);

    boolean present_myString = true && (isSetMyString());
    list.add(present_myString);
    if (present_myString)
      list.add(myString);

    boolean present_underscore_int = true;
    list.add(present_underscore_int);
    if (present_underscore_int)
      list.add(underscore_int);

    return list.hashCode();
  }

  @Override
  public int compareTo(IntString other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMyint()).compareTo(other.isSetMyint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMyint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.myint, other.myint);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMyString()).compareTo(other.isSetMyString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMyString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.myString, other.myString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnderscore_int()).compareTo(other.isSetUnderscore_int());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnderscore_int()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.underscore_int, other.underscore_int);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("IntString(");
    boolean first = true;

    sb.append("myint:");
    sb.append(this.myint);
    first = false;
    if (!first) sb.append(", ");
    sb.append("myString:");
    if (this.myString == null) {
      sb.append("null");
    } else {
      sb.append(this.myString);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("underscore_int:");
    sb.append(this.underscore_int);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class IntStringStandardSchemeFactory implements SchemeFactory {
    public IntStringStandardScheme getScheme() {
      return new IntStringStandardScheme();
    }
  }

  private static class IntStringStandardScheme extends StandardScheme<IntString> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, IntString struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MYINT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.myint = iprot.readI32();
              struct.setMyintIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MY_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.myString = iprot.readString();
              struct.setMyStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UNDERSCORE_INT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.underscore_int = iprot.readI32();
              struct.setUnderscore_intIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, IntString struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MYINT_FIELD_DESC);
      oprot.writeI32(struct.myint);
      oprot.writeFieldEnd();
      if (struct.myString != null) {
        oprot.writeFieldBegin(MY_STRING_FIELD_DESC);
        oprot.writeString(struct.myString);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(UNDERSCORE_INT_FIELD_DESC);
      oprot.writeI32(struct.underscore_int);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class IntStringTupleSchemeFactory implements SchemeFactory {
    public IntStringTupleScheme getScheme() {
      return new IntStringTupleScheme();
    }
  }

  private static class IntStringTupleScheme extends TupleScheme<IntString> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, IntString struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMyint()) {
        optionals.set(0);
      }
      if (struct.isSetMyString()) {
        optionals.set(1);
      }
      if (struct.isSetUnderscore_int()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMyint()) {
        oprot.writeI32(struct.myint);
      }
      if (struct.isSetMyString()) {
        oprot.writeString(struct.myString);
      }
      if (struct.isSetUnderscore_int()) {
        oprot.writeI32(struct.underscore_int);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, IntString struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.myint = iprot.readI32();
        struct.setMyintIsSet(true);
      }
      if (incoming.get(1)) {
        struct.myString = iprot.readString();
        struct.setMyStringIsSet(true);
      }
      if (incoming.get(2)) {
        struct.underscore_int = iprot.readI32();
        struct.setUnderscore_intIsSet(true);
      }
    }
  }

}

