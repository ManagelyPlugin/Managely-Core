package org.managely.ManagelyCore.events.custom;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ManagelyContrabandItemPickupEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();

    private final Player player;
    private final Material item;

    public ManagelyContrabandItemPickupEvent(Player p, Material item){
        this.player = p;
        this.item = item;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList(){
        return HANDLERS;
    }

    public Player getPlayer(){
        return this.player;
    }

    public Material getItem() {
        return item;
    }
}
