/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

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
public class GetAllFunctionsResponse implements org.apache.thrift.TBase<GetAllFunctionsResponse, GetAllFunctionsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetAllFunctionsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetAllFunctionsResponse");

  private static final org.apache.thrift.protocol.TField FUNCTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("functions", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetAllFunctionsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetAllFunctionsResponseTupleSchemeFactory());
  }

  private List<Function> functions; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FUNCTIONS((short)1, "functions");

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
        case 1: // FUNCTIONS
          return FUNCTIONS;
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
  private static final _Fields optionals[] = {_Fields.FUNCTIONS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FUNCTIONS, new org.apache.thrift.meta_data.FieldMetaData("functions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Function.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetAllFunctionsResponse.class, metaDataMap);
  }

  public GetAllFunctionsResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetAllFunctionsResponse(GetAllFunctionsResponse other) {
    if (other.isSetFunctions()) {
      List<Function> __this__functions = new ArrayList<Function>(other.functions.size());
      for (Function other_element : other.functions) {
        __this__functions.add(new Function(other_element));
      }
      this.functions = __this__functions;
    }
  }

  public GetAllFunctionsResponse deepCopy() {
    return new GetAllFunctionsResponse(this);
  }

  @Override
  public void clear() {
    this.functions = null;
  }

  public int getFunctionsSize() {
    return (this.functions == null) ? 0 : this.functions.size();
  }

  public java.util.Iterator<Function> getFunctionsIterator() {
    return (this.functions == null) ? null : this.functions.iterator();
  }

  public void addToFunctions(Function elem) {
    if (this.functions == null) {
      this.functions = new ArrayList<Function>();
    }
    this.functions.add(elem);
  }

  public List<Function> getFunctions() {
    return this.functions;
  }

  public void setFunctions(List<Function> functions) {
    this.functions = functions;
  }

  public void unsetFunctions() {
    this.functions = null;
  }

  /** Returns true if field functions is set (has been assigned a value) and false otherwise */
  public boolean isSetFunctions() {
    return this.functions != null;
  }

  public void setFunctionsIsSet(boolean value) {
    if (!value) {
      this.functions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FUNCTIONS:
      if (value == null) {
        unsetFunctions();
      } else {
        setFunctions((List<Function>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FUNCTIONS:
      return getFunctions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FUNCTIONS:
      return isSetFunctions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetAllFunctionsResponse)
      return this.equals((GetAllFunctionsResponse)that);
    return false;
  }

  public boolean equals(GetAllFunctionsResponse that) {
    if (that == null)
      return false;

    boolean this_present_functions = true && this.isSetFunctions();
    boolean that_present_functions = true && that.isSetFunctions();
    if (this_present_functions || that_present_functions) {
      if (!(this_present_functions && that_present_functions))
        return false;
      if (!this.functions.equals(that.functions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_functions = true && (isSetFunctions());
    list.add(present_functions);
    if (present_functions)
      list.add(functions);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetAllFunctionsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFunctions()).compareTo(other.isSetFunctions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFunctions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.functions, other.functions);
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
    StringBuilder sb = new StringBuilder("GetAllFunctionsResponse(");
    boolean first = true;

    if (isSetFunctions()) {
      sb.append("functions:");
      if (this.functions == null) {
        sb.append("null");
      } else {
        sb.append(this.functions);
      }
      first = false;
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetAllFunctionsResponseStandardSchemeFactory implements SchemeFactory {
    public GetAllFunctionsResponseStandardScheme getScheme() {
      return new GetAllFunctionsResponseStandardScheme();
    }
  }

  private static class GetAllFunctionsResponseStandardScheme extends StandardScheme<GetAllFunctionsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetAllFunctionsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FUNCTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list524 = iprot.readListBegin();
                struct.functions = new ArrayList<Function>(_list524.size);
                Function _elem525;
                for (int _i526 = 0; _i526 < _list524.size; ++_i526)
                {
                  _elem525 = new Function();
                  _elem525.read(iprot);
                  struct.functions.add(_elem525);
                }
                iprot.readListEnd();
              }
              struct.setFunctionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetAllFunctionsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.functions != null) {
        if (struct.isSetFunctions()) {
          oprot.writeFieldBegin(FUNCTIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.functions.size()));
            for (Function _iter527 : struct.functions)
            {
              _iter527.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetAllFunctionsResponseTupleSchemeFactory implements SchemeFactory {
    public GetAllFunctionsResponseTupleScheme getScheme() {
      return new GetAllFunctionsResponseTupleScheme();
    }
  }

  private static class GetAllFunctionsResponseTupleScheme extends TupleScheme<GetAllFunctionsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetAllFunctionsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFunctions()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFunctions()) {
        {
          oprot.writeI32(struct.functions.size());
          for (Function _iter528 : struct.functions)
          {
            _iter528.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetAllFunctionsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list529 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.functions = new ArrayList<Function>(_list529.size);
          Function _elem530;
          for (int _i531 = 0; _i531 < _list529.size; ++_i531)
          {
            _elem530 = new Function();
            _elem530.read(iprot);
            struct.functions.add(_elem530);
          }
        }
        struct.setFunctionsIsSet(true);
      }
    }
  }

}

