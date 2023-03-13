package com.epam.learngrpc.client.java;

import com.epam.learngrpc.PingPongServiceGrpc;
import com.epam.learngrpc.PingRequest;
import com.epam.learngrpc.PongResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Java-based gRPC client that is responsible for sending the requests
 */
public class PingPongClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        PingPongServiceGrpc.PingPongServiceBlockingStub stub = PingPongServiceGrpc.newBlockingStub(channel);

        PongResponse pongResponse = stub.pingPong(PingRequest.newBuilder()
                .setMessage("Ping!")
                .setSource("Java client")
                .build());

        System.out.println(pongResponse);

        channel.shutdown();
    }

}