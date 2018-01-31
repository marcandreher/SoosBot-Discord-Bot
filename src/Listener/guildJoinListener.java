package Listener;

import net.dv8tion.jda.core.events.guild.GuildJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class guildJoinListener extends ListenerAdapter{
	
	public void onGuildJoin(GuildJoinEvent event) {
		event.getJDA().getTextChannelById(0).sendMessage("Herzlich willkommen auf meinem Server " + event.getResponseNumber()).queue();;	
		}

}
