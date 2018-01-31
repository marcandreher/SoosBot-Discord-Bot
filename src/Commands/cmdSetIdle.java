package Commands;

import Core.Main;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdSetIdle implements Command{

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		Main.builder.setStatus(OnlineStatus.IDLE);
		event.getTextChannel().sendMessage("Der Bot wird nun auf allen Servern mit dem Status **IDLE** versehen!").queue();;
	}

	@Override
	public void executed(boolean success, MessageReceivedEvent event) {
		System.out.println("IDLE wurde ausgeführt");
		
	}

	@Override
	public String help() {
		
		return null;
	}

}
