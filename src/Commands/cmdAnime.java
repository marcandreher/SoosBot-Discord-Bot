package Commands;

import java.util.Random;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdAnime implements Command{
	
	String[] anime = {"https://cdn.discordapp.com/attachments/336262265026248707/376530441169010688/Image__873707_1506896225.jpeg", "https://cdn.discordapp.com/attachments/336262265026248707/376530440690991104/Rndr_87.png", "https://cdn.discordapp.com/attachments/336262265026248707/376530440158445573/misaki_shokuhou.png", "https://cdn.discordapp.com/attachments/336262265026248707/376530440158445572/Rndr_110.png","https://cdn.discordapp.com/attachments/336262265026248707/376530439541620737/Image__788421_1509017858.jpeg","https://cdn.discordapp.com/attachments/336262265026248707/376530439105544194/Screenshot_2017-10-27-22-50-45.png", "https://cdn.discordapp.com/attachments/336262265026248707/376530439105544192/render_5__3.png", "https://cdn.discordapp.com/attachments/336262265026248707/376530210008596480/IMG-20171105-WA0055.jpg", "https://cdn.discordapp.com/attachments/336262265026248707/376530209408548885/IMG-20171105-WA0025.jpg","https://cdn.discordapp.com/attachments/336262265026248707/376161272669929472/dsf.png", "https://cdn.discordapp.com/attachments/336262265026248707/376160951243767828/Image__618156_1509451790.jpeg","https://cdn.discordapp.com/attachments/336262265026248707/376155264321323018/IMG-20171102-WA0151.jpg"};

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		String random = (anime[new Random().nextInt(anime.length)]);
		event.getTextChannel().sendMessage(random).queue();;
		
	}

	@Override
	public void executed(boolean success, MessageReceivedEvent event) {
		System.out.println("Anime wurde ausgeführt");
		
	}

	@Override
	public String help() {
		System.out.println("Anime wurde ausgeführt");
		return null;
	}
	

}
