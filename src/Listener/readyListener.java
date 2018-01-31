package Listener;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class readyListener extends ListenerAdapter{
	
	public void onReady(ReadyEvent event) {
		
		String out = "\nDieser Bot läuft auf folgenen Server: \n";
		
		for (Guild g : event.getJDA().getGuilds()) {
			out += g.getName()+"("+g.getId()+","+g.getIdLong()+") \n";
			
			System.out.println(out);
			
		}
		
		
	}

}
