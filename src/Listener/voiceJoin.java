package Listener;



import net.dv8tion.jda.core.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class voiceJoin extends ListenerAdapter{
	
	public void onGuildVoiceJoin(GuildVoiceJoinEvent event) {
        event.getGuild().getTextChannelsByName("bot-alerts", true).get(0).sendMessage(
                ""+ event.getVoiceState().getMember().getUser().getName() + " Joined the Voicechat: " + event.getChannelJoined().getName()
        ).queue();
    }

}
