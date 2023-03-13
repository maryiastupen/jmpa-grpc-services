import grpc

import ping_pong_pb2
import ping_pong_pb2_grpc


def run():
    with grpc.insecure_channel('localhost:8080') as channel:
        stub = ping_pong_pb2_grpc.PingPongServiceStub(channel)
        response = stub.pingPong(ping_pong_pb2.PingRequest(message='Ping!', source='Python client'))
    print(response.message)


if __name__ == "__main__":
    run()
