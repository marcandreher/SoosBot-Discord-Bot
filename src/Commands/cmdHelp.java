package Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdHelp implements Command{

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		event.getTextChannel().sendMessage("```\nSoosBot Hilfe | Ver. 2.1.4\n"
				+ "\nMusikbot:\n"
				+ "-music play <YouTubeLink> <!-- Spielt Musik -->"
				+ "\n-music stop <!-- Stopt das Jeweilige Lied und Disconectet -->"
				+ "\n-music skip <!-- Überspringt das Lied -->"
				+ "\n-music shuffle <!-- Mischt die Musik -->"
				+ "\n-music info <!-- Zeigt Informationen zum Song -->"
				+ "\n"
				+ "\nSpaß:"
				+ "\n"
				+ "-ping <!-- Macht pong :3 -->"
				+ "\n-pong <!-- Macht ping :3 -->"
				+ "\n-hentai <!-- Zeigt Perverse Bilder :3 -->"
				+ "\n-anime <!-- Zeigt Anime Bilder -->"
				+ "\n-randomytk <!-- Sucht eine YouTube Kacke aus ;D -->"
				+ "\n-kompliment <!-- Gibt dir ein Kompliment -->"
				+ "\n"
				+ "\n"
				+ "Anderes:"
				+ "\n-invite <!-- Lade meinen Bot auf deinen Server -->"
				+ "\n-help <!-- Zeige alle Befehle -->"
				+ "\n-clear <!-- Leert den Chat -->"
				+ "\n-setonline <!-- Setzt den Bot aus Online -->"
				+ "\n-setidle <!-- Setzt den Bot auf Idle -->"
				+ "\n"
				+ "\nSoosBot 2.1.4 | All rights belong to Marc the JDA and Discord```").queue();;
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
