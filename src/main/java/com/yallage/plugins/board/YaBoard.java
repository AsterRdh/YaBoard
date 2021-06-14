package com.yallage.plugins.board;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class YaBoard {
    public static void creatBoard(Player player){
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();
        Objective objective=scoreboard.registerNewObjective("name","dummy","玩家");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score nameScore=objective.getScore("玩家名称 "+player.getDisplayName());
        nameScore.setScore(1);
        

        player.setScoreboard(scoreboard);
    }
}
