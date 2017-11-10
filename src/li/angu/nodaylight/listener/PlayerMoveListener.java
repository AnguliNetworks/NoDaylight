package li.angu.nodaylight.listener;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/*************************************************************************
 *
 * ANGULI NETWORKS CONFIDENTIAL
 * __________________
 *
 *  [2014] - [2017] Anguli Networks 
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Anguli Networks. The intellectual and 
 * technical concepts contained herein are proprietary to 
 * Anguli Networks and may be covered by German/EU and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Anguli Networks
 *
 * This File belongs to the NoDaylight from Anguli Networks
 */
public class PlayerMoveListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (!event.getFrom().getWorld().getName().equalsIgnoreCase("cave")) {
            return;
        }

        if (event.getTo().getBlock().getLightFromSky() == 0) {
            return;
        }

        if (event.getPlayer().getGameMode() == GameMode.CREATIVE) {
            return;
        }

        event.getPlayer().setHealth(0.0D);

        TextComponent message = new TextComponent("DU VOLLIDIOT! SONNE IST GEFÄHRLICH! HOFFE DU LERNST DARAUS");
        message.setColor(ChatColor.DARK_RED);

        event.getPlayer().spigot().sendMessage(message);
    }

}
