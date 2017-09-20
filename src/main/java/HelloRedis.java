import redis.clients.jedis.Jedis;

public class HelloRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1");
        jedis.auth("123456");
        System.out.println("Server is running: " + jedis.ping());
        System.out.println("Connection to server successfully");
        jedis.set("title", "helloworld");
        System.out.println(jedis.get("title"));
    }
}
