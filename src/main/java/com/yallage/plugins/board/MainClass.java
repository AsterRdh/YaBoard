/**
 *
 */

package com.yallage.plugins.board;

import com.yallage.plugins.board.events.YaPlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("插件SKY已经成功启动");
        getServer().getPluginManager().registerEvents(new YaPlayerJoinEvent(),this);
    }

    @Override
    public void onDisable() {
        System.out.println("插件SKY已经成功关闭");
    }

    public static void main(String[] args) {

    }

}
