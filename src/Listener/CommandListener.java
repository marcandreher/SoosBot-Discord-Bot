package Listener;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import Core.commandHandler;

public class CommandListener extends ListenerAdapter {

    @SuppressWarnings({ "deprecation" })
	@Override
    public void onMessageReceived(MessageReceivedEvent event) {

        if (event.getMessage().getContent().startsWith("-") && event.getMessage().getAuthor().getId() != event.getJDA().getSelfUser().getId()) {
            commandHandler.handleCommand(commandHandler.parser.parse(event.getMessage().getContent(), event));
        }

    }
}
