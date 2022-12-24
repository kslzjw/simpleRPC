package client;

import com.zjw.rpc.idl.Hello.HelloRequest;
import com.zjw.rpc.idl.Hello.HelloResponse;
import com.zjw.rpc.idl.Hello.HelloService;
import com.zjw.rpc.core.client.RpcClientProxy;

public class TestClient {
    public static void main(String[] args) {
        // 获取RpcService
        RpcClientProxy proxy = new RpcClientProxy();
        HelloService helloService = proxy.getService(HelloService.class);
        // 构造出请求对象HelloRequest
        HelloRequest helloRequest = new HelloRequest("tom");
        // rpc调用并返回结果对象HelloResponse
        HelloResponse helloResponse = helloService.hello(helloRequest);
        // 从HelloResponse中获取msg
        String helloMsg = helloResponse.getMsg();
        // 打印msg
        System.out.println(helloMsg);

        // 调用hi方法
        HelloResponse hiResponse = helloService.hi(helloRequest);
        String hiMsg = hiResponse.getMsg();
        System.out.println(hiMsg);

    }
}
