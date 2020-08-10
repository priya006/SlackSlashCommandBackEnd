# SlackSlashCommandBackEnd

## Objective [Phase 1]
On typing `/hello` from a slack channel the web service responds with a message ":wave: Hello! Response from the Bolt Server"

Slack:
-----
1. https://api.slack.com/apps
2. Click Message Bot [Slack App created for this project]
3. Get the 'Signing Secret'
4. Reinstall app. Allow 'Messagebot' APP to access your workspace/Channel
5. Select the 'MessageBot' Post in 'boltapp' channel
6. Click 'Oauth Permissions' in left bar https://api.slack.com/apps/A018893PTT8/oauth? Make your sure app is selected. If you think it is needed click 'Reinstall      app'


Webserver:
--------
1. Go to Run Configurations in intelliJ and update the environement variables.
`SLACK_BOT_TOKEN`=xoxb-;`SLACK_SIGNING_SECRET`=xxxx
2.Start the server by running the class `BackEndServiceForSlackSlashCommand.java`


ngork:
-----
1. CD where ngork is installed and run `./ngrok http 3000` so that you can share your bolt app runnng in you local host to the outside world
2. copy the random host generated ngork. Example: 0a46633dc4aa from `https://0a46633dc4aa.ngrok.io -> http://localhost:3000`
3. From terminal you should see "Session Status online"

How to Reconfigure Slash command (From Slack) Request Url with ngork  generated url:
------------------------------------------------------------------------------------
1. Click the app and click the 'Slash command' from left navigation bar https://api.slack.com/apps/A018893PTT8/slash-commands?
2. paste  the 'Random' host generated in above **step 2.** Example: https://{random}.ngrok.io/slack/events
4. Install App and click Reinstall App button

--> Phase 2 - Make the backend to hit Jira REST API [WIP]


