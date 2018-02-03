package Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.security.auth.login.LoginException;

import Commands.cmdAnime;
import Commands.cmdClear;
import Commands.cmdHelp;
import Commands.cmdHentai;
import Commands.cmdInvite;
import Commands.cmdMusic;
import Commands.cmdPing;
import Commands.cmdPong;
import Commands.cmdSetIdle;
import Commands.cmdSetOnline;
import Commands.cmdYTKRandom;
import Listener.CommandListener;
import Listener.guildJoinListener;
import Listener.readyListener;
import Listener.voiceJoin;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class Main {
	
	public static JDABuilder builder = new JDABuilder(AccountType.BOT);
	
	public static void main (String[] args) {
		
		System.out.println("--------------------------------");
		System.out.println("- SoosBot 2.1.4                -");
		System.out.println("- Development by MarcPlay      -");
		System.out.println("- use -help                    -");
		System.out.println("--------------------------------");
		System.out.println("\n");
		
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    Scanner sc = new Scanner(br);
		
		builder.setToken("Forget it Please xD");
		builder.setGame(Game.playing("-help [Ver. 2.1.4]"));
		builder.setAutoReconnect(true);
		builder.setStatus(OnlineStatus.ONLINE);
		
		
		builder.addEventListener(new CommandListener());
		builder.addEventListener(new readyListener());
		builder.addEventListener(new guildJoinListener());builder.addEventListener(new guildJoinListener());
		builder.addEventListener(new voiceJoin());
		
		
		commandHandler.commands.put("ping", new cmdPing());
		commandHandler.commands.put("pong", new cmdPong());
		commandHandler.commands.put("help", new cmdHelp());
		commandHandler.commands.put("hentai", new cmdHentai());
		commandHandler.commands.put("invite", new cmdInvite());
		commandHandler.commands.put("randomytk", new cmdYTKRandom());
		commandHandler.commands.put("music", new cmdMusic());
		commandHandler.commands.put("clear", new cmdClear());
		commandHandler.commands.put("anime", new cmdAnime());
		commandHandler.commands.put("setidle", new cmdSetIdle());
		commandHandler.commands.put("setonline", new cmdSetOnline());
		
		
		
		try {
			@SuppressWarnings("unused")
			JDA jda = builder.buildBlocking();
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RateLimitedException e) {
			
		}
		
	

	
	}
	

}
