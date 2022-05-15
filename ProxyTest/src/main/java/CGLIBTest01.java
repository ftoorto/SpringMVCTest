public class CGLIBTest01 {
    public static void main(String[] args) {
        HelloMethod helloMethod=(HelloMethod) (new HelloServiceInterceptor().getProxy(HelloMethod.class));
        helloMethod.hello("张三");
        helloMethod.hello("cgi动态代理");
    }
}
