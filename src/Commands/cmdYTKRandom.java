package Commands;

import java.util.Random;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdYTKRandom implements Command{
	
	String[] hentai = {"https://www.youtube.com/watch?v=K-HEyIX9UjI", "https://www.youtube.com/watch?v=Cvj0i16Pnco", "https://www.youtube.com/watch?v=-S7coS1o0Lg", "https://www.youtube.com/watch?v=k3BWCHB2QZg", "https://www.youtube.com/watch?v=K4A1F4Tn-Xg", "https://www.youtube.com/watch?v=-8pb6I0kSDM","https://www.youtube.com/watch?v=ljDoxJzV9HA"};

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		String random = (hentai[new Random().nextInt(hentai.length)]);
		event.getTextChannel().sendMessage(random).queue();;
	}

	@Override
	public void executed(boolean success, MessageReceivedEvent event) {
		System.out.println(event.getMessage() + "executed from "+event.getMember().getNickname());
		
	}

	@Override
	public String help() {
		// TODO Auto-generated method stub
		return null;
	}

}
