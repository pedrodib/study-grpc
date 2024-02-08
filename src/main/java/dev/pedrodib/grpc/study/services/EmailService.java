package dev.pedrodib.grpc.study.services;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import proto.generated.email.Email;
import proto.generated.email.EmailCreationResponse;
import proto.generated.email.EmailServiceGrpc;
import proto.generated.email.GetEmailById;

import java.util.UUID;

public class EmailService extends EmailServiceGrpc.EmailServiceImplBase {

    @Override
    public void sendEmail(Email request, StreamObserver<EmailCreationResponse> responseObserver) {
        // Sent Email
        Email.Builder email = request.toBuilder().setId(UUID.randomUUID().toString());
        EmailCreationResponse.Builder response = EmailCreationResponse.newBuilder()
            .setId(email.getId())
            .setSuccess(true)
            .setMessage("Sent");

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getSentEmail(GetEmailById request, StreamObserver<Email> responseObserver) {
        Email.Builder email = Email.newBuilder()
            .setId(request.getId())
            .setEmail("pedrohenrique635@hotmail.com")
            .setReplyTo("contato@pedrodib.dev")
            .setFrom("contato@pedrodib.dev")
            .setFromName("Dev Pedro Dib")
            .setSubject("Este é um teste de gRpc")
            .setMessage("<h1>Teste</h1>");


        responseObserver.onNext(email.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getEmails(Empty request, StreamObserver<proto.generated.email.Emails> responseObserver) {
        proto.generated.email.Emails.Builder emails = proto.generated.email.Emails.newBuilder();

        emails.addEmails(Email.newBuilder()
            .setId(UUID.randomUUID().toString())
            .setEmail("pedrodib1@pedrodib.dev")
            .setReplyTo("contato@pedrodib.dev")
            .setFrom("contato@pedrodib.dev")
            .setFromName("Dev Pedro Dib")
            .setSubject("Este é um teste de gRpc")
            .setMessage("<h1>Teste</h1>"));

        emails.addEmails(Email.newBuilder()
            .setId(UUID.randomUUID().toString())
            .setEmail("pedrodib2@pedrodib.dev")
            .setReplyTo("contato@pedrodib.dev")
            .setFrom("contato@pedrodib.dev")
            .setFromName("Dev Pedro Dib")
            .setSubject("Este é um teste de gRpc")
            .setMessage("<h1>Teste</h1>"));

        responseObserver.onNext(emails.build());
        responseObserver.onCompleted();
    }
}
