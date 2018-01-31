package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdInvite implements Command{

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		event.getTextChannel().sendMessage("https://discordapp.com/api/oauth2/authorize?client_id=393054051765321749&permissions=267387969&scope=bot").queue();;
	}

	@Override
	public void executed(boolean success, MessageReceivedEvent event) {
		System.out.println(event.getMessage() + "wurde von "+event.getMember().getNickname()+" ausgeführt");
		
	}

	@Override
	public String help() {
		
		return null;
	}

}
