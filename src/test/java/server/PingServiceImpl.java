package server;

import com.zjw.rpc.idl.Ping.PingRequest;
import com.zjw.rpc.idl.Ping.PingResponse;
import com.zjw.rpc.idl.Ping.PingService;

public class PingServiceImpl implements PingService {

    @Override
    public PingResponse ping(PingRequest request) {
        String name = request.getName();
        String retMsg = "pong: " + name;
        PingResponse response = new PingResponse(retMsg);
        return response;
    }
}
