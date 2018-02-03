package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdPong implements Command{

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		event.getTextChannel().sendMessage("Ping!").queue();;
	}

	@Override
	public void executed(boolean success, MessageReceivedEvent event) {
		System.out.println(event.getMessage() + "executed from "+event.getMember().getNickname());
	}

	@Override
	public String help() {
		
		return null;
	}

}
