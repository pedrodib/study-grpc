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
        EmailCreationResponse.Builder response = EmailCreationResponse.newBuilder();
        Email.Builder email = request.toBuilder();

        email.setId(UUID.randomUUID().toString());

        response.setId(email.getId());
        response.setSuccess(true);
        response.setMessage("Sent");

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getSentEmail(GetEmailById request, StreamObserver<Email> responseObserver) {
        Email.Builder email = Email.newBuilder();

        email.setId(request.getId());
        email.setEmail("pedrohenrique635@hotmail.com");
        email.setReplyTo("contato@pedrodib.dev");
        email.setFrom("contato@pedrodib.dev");
        email.setFromName("Dev Pedro Dib");
        email.setSubject("Este é um teste de gRpc");
        email.setMessage("<h1>Teste</h1>");

        responseObserver.onNext(email.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getEmails(Empty request, StreamObserver<proto.generated.email.Emails> responseObserver) {
        proto.generated.email.Emails.Builder emails = proto.generated.email.Emails.newBuilder();

        Email.Builder email1 = Email.newBuilder();

        email1.setId(UUID.randomUUID().toString());
        email1.setEmail("pedrodib1@pedrodib.dev");
        email1.setReplyTo("contato@pedrodib.dev");
        email1.setFrom("contato@pedrodib.dev");
        email1.setFromName("Dev Pedro Dib");
        email1.setSubject("Este é um teste de gRpc");
        email1.setMessage("<h1>Teste</h1>");

        Email.Builder email2 = Email.newBuilder();

        email2.setId(UUID.randomUUID().toString());
        email2.setEmail("pedrodib2@pedrodib.dev");
        email2.setReplyTo("contato@pedrodib.dev");
        email2.setFrom("contato@pedrodib.dev");
        email2.setFromName("Dev Pedro Dib");
        email2.setSubject("Este é um teste de gRpc");
        email2.setMessage("<h1>Teste</h1>");

        emails.addEmails(email1);
        emails.addEmails(email2);

        responseObserver.onNext(emails.build());
        responseObserver.onCompleted();
    }
}
