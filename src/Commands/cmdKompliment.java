package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdKompliment implements Command{

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		event.getTextChannel().sendMessage(event.getAuthor().getName() + " ist Wunderschön").queue();;
	}

	@Override
	public void executed(boolean success, MessageReceivedEvent event) {
		System.out.println("[INFO:] Kompliment wurde ausgeführt");
		
	}

	@Override
	public String help() {
		
		return null;
	}

}
