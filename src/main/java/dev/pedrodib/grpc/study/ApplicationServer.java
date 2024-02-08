package dev.pedrodib.grpc.study;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class ApplicationServer {
    private static final Logger logger = Logger.getLogger(ApplicationServer.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50052).addService(new dev.pedrodib.grpc.study.services.EmailService()).build();

        server.start();

        logger.info("Server started on Port " + server.getPort());

        server.awaitTermination();
    }
}
