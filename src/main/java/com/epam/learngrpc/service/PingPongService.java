package com.epam.learngrpc.service;

import com.epam.learngrpc.PingPongServiceGrpc;
import com.epam.learngrpc.PingRequest;
import com.epam.learngrpc.PongResponse;
import io.grpc.stub.StreamObserver;

/**
 * gRPC service that extends generated {@link PingPongServiceGrpc.PingPongServiceImplBase}
 */
public class PingPongService extends PingPongServiceGrpc.PingPongServiceImplBase {

    /**
     * Generates and sends response when {@link PingRequest} is acquired
     *
     * @param request ping request
     * @param responseObserver response observer
     */
    @Override
    public void pingPong(PingRequest request, StreamObserver<PongResponse> responseObserver) {
        System.out.println(request.getMessage());

        PongResponse response = PongResponse.newBuilder()
                .setMessage("Pong!")
                .setSource("Java server")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
