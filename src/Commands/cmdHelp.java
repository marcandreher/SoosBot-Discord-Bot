package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdHelp implements Command{

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		event.getTextChannel().sendMessage("```\nSoosBot Help | Ver. 2.2.4\n"
				+ "\nMusicbot:\n"
				+ "-music play <YouTubeLink> <!-- Play Music -->"
				+ "\n-music stop <!-- Stop the Song -->"
				+ "\n-music skip <!-- Skip the Song -->"
				+ "\n-music shuffle <!-- Shuffle the Song quere -->"
				+ "\n-music info <!-- Get Information over The Song -->"
				+ "\n"
				+ "\nFun:"
				+ "\n"
				+ "-ping <!-- Make pong :3 -->"
				+ "\n-pong <!-- Make ping :3 -->"
				+ "\n-hentai <!-- Show Hentai -->"
				+ "\n-anime <!-- Show Anime Pictures -->"
				+ "\n-randomytk <!-- Give you Some German poop Videos -->"
				+ "\n-kompliment <!-- Give you a compliment (OLD)-->"
				+ "\n"
				+ "\n"
				+ "Anderes:"
				+ "\n-invite <!-- Use this Bot on your Server -->"
				+ "\n-help <!-- Show all Commands -->"
				+ "\n-clear <!-- Clear the Chat -->"
				+ "\n-setonline <!-- Set the Bot on Online -->"
				+ "\n-setidle <!-- Set the Bot on Idle -->"
				+ "\n"
				+ "\nSoosBot 2.1.4 | All rights belong to Marc the JDA and Discord```").queue();;
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
