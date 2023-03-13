package com.epam.learngrpc;

import java.io.IOException;

import com.epam.learngrpc.service.PingPongService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class LearnGrpcPingPongApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnGrpcPingPongApplication.class, args);
    }

    /**
     * Runs gRPC server with {@link PingPongService} on startup of the application
     */
    @EventListener(ApplicationReadyEvent.class)
    public void runGrpcServer() throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new PingPongService()).build();

        server.start();
        server.awaitTermination();
    }

}
