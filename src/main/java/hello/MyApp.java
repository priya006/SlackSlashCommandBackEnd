package hello;

import com.slack.api.bolt.App;
import com.slack.api.bolt.AppConfig;
import com.slack.api.bolt.jetty.SlackAppServer;

public class MyApp {
    public static  void main(String[] args) throws Exception {

        AppConfig appConfig = new AppConfig();
        App app = new App();
        app.command("/hello", (req, ctx) -> {
            return ctx.ack(":wave: Hello! Response from the Bolt Server");
        });

    SlackAppServer server = new SlackAppServer(app);
    server.start(); // http://localhost:3000    /slack/events

    }
}
