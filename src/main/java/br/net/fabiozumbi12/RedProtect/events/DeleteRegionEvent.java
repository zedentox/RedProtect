package br.net.fabiozumbi12.RedProtect.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import br.net.fabiozumbi12.RedProtect.Region;

public class DeleteRegionEvent extends Event implements Cancellable {
	private static final HandlerList handlers = new HandlerList();
	private Region region;
	private Player player;
	private boolean isCancelled = false;
	
	public DeleteRegionEvent(Region region, Player p){
		this.region = region;
		this.player = p;
	}
	
	public Player getPlayer(){
		return this.player;
	}
	
	public Region getRegion(){
		return this.region;
	}
		
	@Override
	public boolean isCancelled() {
		return this.isCancelled;
	}

	@Override
	public void setCancelled(boolean arg0) {
		this.isCancelled = arg0;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }

}
