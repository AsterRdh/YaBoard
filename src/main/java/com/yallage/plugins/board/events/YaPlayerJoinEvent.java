package com.yallage.plugins.board.events;

import com.yallage.plugins.board.YaBoard;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class YaPlayerJoinEvent implements Listener {
    public YaPlayerJoinEvent() {

    }

    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage("王家 啊大苏打");
        Player player=event.getPlayer();
        YaBoard.creatBoard(player);
    }
}
