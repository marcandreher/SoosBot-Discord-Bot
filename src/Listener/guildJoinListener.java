package Listener;

import net.dv8tion.jda.core.events.guild.GuildJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class guildJoinListener extends ListenerAdapter{
	
	public void onGuildJoin(GuildJoinEvent event) {
		event.getJDA().getTextChannelById(0).sendMessage("Welcome on the Server " + event.getResponseNumber()).queue();;	
		}

}
