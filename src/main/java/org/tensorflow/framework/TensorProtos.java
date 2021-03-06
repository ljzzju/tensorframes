// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/tensor.proto

package org.tensorflow.framework;

public final class TensorProtos {
  private TensorProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TensorProto_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_TensorProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&tensorflow/core/framework/tensor.proto" +
      "\022\ntensorflow\032,tensorflow/core/framework/" +
      "tensor_shape.proto\032%tensorflow/core/fram" +
      "ework/types.proto\"\265\002\n\013TensorProto\022#\n\005dty" +
      "pe\030\001 \001(\0162\024.tensorflow.DataType\0222\n\014tensor" +
      "_shape\030\002 \001(\0132\034.tensorflow.TensorShapePro" +
      "to\022\026\n\016version_number\030\003 \001(\005\022\026\n\016tensor_con" +
      "tent\030\004 \001(\014\022\025\n\tfloat_val\030\005 \003(\002B\002\020\001\022\026\n\ndou" +
      "ble_val\030\006 \003(\001B\002\020\001\022\023\n\007int_val\030\007 \003(\005B\002\020\001\022\022" +
      "\n\nstring_val\030\010 \003(\014\022\030\n\014scomplex_val\030\t \003(\002",
      "B\002\020\001\022\025\n\tint64_val\030\n \003(\003B\002\020\001\022\024\n\010bool_val\030" +
      "\013 \003(\010B\002\020\001B*\n\030org.tensorflow.frameworkB\014T" +
      "ensorProtosP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.TensorShapeProtos.getDescriptor(),
          org.tensorflow.framework.TypesProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_TensorProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_TensorProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_TensorProto_descriptor,
        new java.lang.String[] { "Dtype", "TensorShape", "VersionNumber", "TensorContent", "FloatVal", "DoubleVal", "IntVal", "StringVal", "ScomplexVal", "Int64Val", "BoolVal", });
    org.tensorflow.framework.TensorShapeProtos.getDescriptor();
    org.tensorflow.framework.TypesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
