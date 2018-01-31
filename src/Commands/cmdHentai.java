package Commands;

import java.util.Random;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class cmdHentai implements Command{
	
	String[] hentai = {"https://cdn.discordapp.com/attachments/366657162602348544/375756926707040256/IMG_20171029_100733.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727052463374336/IMG-20171219-WA0030.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727104791511040/IMG-20171219-WA0029.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727133002399745/IMG-20171219-WA0028.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727167684968450/IMG-20171219-WA0027.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727209217097728/IMG-20171219-WA0026.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727251910918145/IMG-20171219-WA0031.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727310316601345/IMG-20171219-WA0032.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727357615505408/IMG-20171219-WA0037.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727449349259274/IMG-20171219-WA0036.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727536787783682/IMG-20171219-WA0035.jpg", "https://hqporner.com/images/porn-categories/hentai.jpg", "https://i.pinimg.com/originals/84/32/ce/8432ce4c8bb80dba4016084293ebf613.jpg", "https://i.pinimg.com/originals/84/32/ce/8432ce4c8bb80dba4016084293ebf613.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727619847585802/IMG-20171219-WA0040.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727619847585802/IMG-20171219-WA0040.jpg", "https://cdn.discordapp.com/attachments/366657162602348544/392727638290202644/IMG-20171219-WA0038.jpg"};

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
	}

	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		String random = (hentai[new Random().nextInt(hentai.length)]);
		if(event.getTextChannel().getName().equalsIgnoreCase("hentai-chat")) {
			event.getTextChannel().sendMessage(random).queue();;
		}else{
			event.getTextChannel().sendMessage("Nur im #hentai channel erlaubt").queue();;
		}
		
	}

	@Override
	public void executed(boolean success, MessageReceivedEvent event) {
		System.out.println(event.getMessage() + "wurde von "+event.getMember().getNickname()+" ausgeführt");
		
	}

	@Override
	public String help() {
		// TODO Auto-generated method stub
		return null;
	}

}
