# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ping-pong.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0fping-pong.proto\x12\x12\x63om.epam.learngrpc\".\n\x0bPingRequest\x12\x0f\n\x07message\x18\x01 \x01(\t\x12\x0e\n\x06source\x18\x02 \x01(\t\"/\n\x0cPongResponse\x12\x0f\n\x07message\x18\x01 \x01(\t\x12\x0e\n\x06source\x18\x02 \x01(\t2`\n\x0fPingPongService\x12M\n\x08pingPong\x12\x1f.com.epam.learngrpc.PingRequest\x1a .com.epam.learngrpc.PongResponseB\x02P\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ping_pong_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'P\001'
  _PINGREQUEST._serialized_start=39
  _PINGREQUEST._serialized_end=85
  _PONGRESPONSE._serialized_start=87
  _PONGRESPONSE._serialized_end=134
  _PINGPONGSERVICE._serialized_start=136
  _PINGPONGSERVICE._serialized_end=232
# @@protoc_insertion_point(module_scope)