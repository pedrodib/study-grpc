package proto.generated.email;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: email.proto")
public final class EmailServiceGrpc {

  private EmailServiceGrpc() {}

  public static final String SERVICE_NAME = "dev.pedrodib.proto.EmailService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.generated.email.Email,
      proto.generated.email.EmailCreationResponse> getSendEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmail",
      requestType = proto.generated.email.Email.class,
      responseType = proto.generated.email.EmailCreationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.generated.email.Email,
      proto.generated.email.EmailCreationResponse> getSendEmailMethod() {
    io.grpc.MethodDescriptor<proto.generated.email.Email, proto.generated.email.EmailCreationResponse> getSendEmailMethod;
    if ((getSendEmailMethod = EmailServiceGrpc.getSendEmailMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getSendEmailMethod = EmailServiceGrpc.getSendEmailMethod) == null) {
          EmailServiceGrpc.getSendEmailMethod = getSendEmailMethod = 
              io.grpc.MethodDescriptor.<proto.generated.email.Email, proto.generated.email.EmailCreationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dev.pedrodib.proto.EmailService", "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.generated.email.Email.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.generated.email.EmailCreationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("SendEmail"))
                  .build();
          }
        }
     }
     return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.generated.email.GetEmailById,
      proto.generated.email.Email> getGetSentEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSentEmail",
      requestType = proto.generated.email.GetEmailById.class,
      responseType = proto.generated.email.Email.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.generated.email.GetEmailById,
      proto.generated.email.Email> getGetSentEmailMethod() {
    io.grpc.MethodDescriptor<proto.generated.email.GetEmailById, proto.generated.email.Email> getGetSentEmailMethod;
    if ((getGetSentEmailMethod = EmailServiceGrpc.getGetSentEmailMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getGetSentEmailMethod = EmailServiceGrpc.getGetSentEmailMethod) == null) {
          EmailServiceGrpc.getGetSentEmailMethod = getGetSentEmailMethod = 
              io.grpc.MethodDescriptor.<proto.generated.email.GetEmailById, proto.generated.email.Email>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dev.pedrodib.proto.EmailService", "GetSentEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.generated.email.GetEmailById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.generated.email.Email.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("GetSentEmail"))
                  .build();
          }
        }
     }
     return getGetSentEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.generated.email.Emails> getGetEmailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmails",
      requestType = com.google.protobuf.Empty.class,
      responseType = proto.generated.email.Emails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.generated.email.Emails> getGetEmailsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, proto.generated.email.Emails> getGetEmailsMethod;
    if ((getGetEmailsMethod = EmailServiceGrpc.getGetEmailsMethod) == null) {
      synchronized (EmailServiceGrpc.class) {
        if ((getGetEmailsMethod = EmailServiceGrpc.getGetEmailsMethod) == null) {
          EmailServiceGrpc.getGetEmailsMethod = getGetEmailsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, proto.generated.email.Emails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dev.pedrodib.proto.EmailService", "GetEmails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.generated.email.Emails.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailServiceMethodDescriptorSupplier("GetEmails"))
                  .build();
          }
        }
     }
     return getGetEmailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmailServiceStub newStub(io.grpc.Channel channel) {
    return new EmailServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmailServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmailServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmailServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmailServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EmailServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendEmail(proto.generated.email.Email request,
        io.grpc.stub.StreamObserver<proto.generated.email.EmailCreationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEmailMethod(), responseObserver);
    }

    /**
     */
    public void getSentEmail(proto.generated.email.GetEmailById request,
        io.grpc.stub.StreamObserver<proto.generated.email.Email> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSentEmailMethod(), responseObserver);
    }

    /**
     */
    public void getEmails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.generated.email.Emails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEmailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.generated.email.Email,
                proto.generated.email.EmailCreationResponse>(
                  this, METHODID_SEND_EMAIL)))
          .addMethod(
            getGetSentEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.generated.email.GetEmailById,
                proto.generated.email.Email>(
                  this, METHODID_GET_SENT_EMAIL)))
          .addMethod(
            getGetEmailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                proto.generated.email.Emails>(
                  this, METHODID_GET_EMAILS)))
          .build();
    }
  }

  /**
   */
  public static final class EmailServiceStub extends io.grpc.stub.AbstractStub<EmailServiceStub> {
    private EmailServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmailServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendEmail(proto.generated.email.Email request,
        io.grpc.stub.StreamObserver<proto.generated.email.EmailCreationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSentEmail(proto.generated.email.GetEmailById request,
        io.grpc.stub.StreamObserver<proto.generated.email.Email> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSentEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.generated.email.Emails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEmailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmailServiceBlockingStub extends io.grpc.stub.AbstractStub<EmailServiceBlockingStub> {
    private EmailServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmailServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.generated.email.EmailCreationResponse sendEmail(proto.generated.email.Email request) {
      return blockingUnaryCall(
          getChannel(), getSendEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.generated.email.Email getSentEmail(proto.generated.email.GetEmailById request) {
      return blockingUnaryCall(
          getChannel(), getGetSentEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.generated.email.Emails getEmails(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetEmailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmailServiceFutureStub extends io.grpc.stub.AbstractStub<EmailServiceFutureStub> {
    private EmailServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmailServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.generated.email.EmailCreationResponse> sendEmail(
        proto.generated.email.Email request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.generated.email.Email> getSentEmail(
        proto.generated.email.GetEmailById request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSentEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.generated.email.Emails> getEmails(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEmailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EMAIL = 0;
  private static final int METHODID_GET_SENT_EMAIL = 1;
  private static final int METHODID_GET_EMAILS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmailServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmailServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EMAIL:
          serviceImpl.sendEmail((proto.generated.email.Email) request,
              (io.grpc.stub.StreamObserver<proto.generated.email.EmailCreationResponse>) responseObserver);
          break;
        case METHODID_GET_SENT_EMAIL:
          serviceImpl.getSentEmail((proto.generated.email.GetEmailById) request,
              (io.grpc.stub.StreamObserver<proto.generated.email.Email>) responseObserver);
          break;
        case METHODID_GET_EMAILS:
          serviceImpl.getEmails((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<proto.generated.email.Emails>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmailServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.generated.email.EmailProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmailService");
    }
  }

  private static final class EmailServiceFileDescriptorSupplier
      extends EmailServiceBaseDescriptorSupplier {
    EmailServiceFileDescriptorSupplier() {}
  }

  private static final class EmailServiceMethodDescriptorSupplier
      extends EmailServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmailServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EmailServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmailServiceFileDescriptorSupplier())
              .addMethod(getSendEmailMethod())
              .addMethod(getGetSentEmailMethod())
              .addMethod(getGetEmailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
