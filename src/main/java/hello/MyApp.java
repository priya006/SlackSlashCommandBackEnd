package hello;

import com.slack.api.bolt.App;
import com.slack.api.bolt.AppConfig;
import com.slack.api.bolt.jetty.SlackAppServer;


public class MyApp {
    public static void main(String[] args) throws Exception {

        //export SLACK_BOT_TOKEN= "xoxb-your-token";
        //manual slashcommand app , messagebot

        //xoxb-404612894081-1310882225040-IB7ftXBmP2i56oFV0Zwrxtvj
        //7e4cc308ccbb743582549125a17ed881 Signing Secret

        App app = new App();



        app.command("/hello", (req, ctx) -> {
            return ctx.ack(":wave: Hello!");
        });

    SlackAppServer server = new SlackAppServer(app);
    server.start(); // http://localhost:3000    /slack/events

    }
}
