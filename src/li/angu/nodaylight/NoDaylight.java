package li.angu.nodaylight;

import li.angu.nodaylight.listener.PlayerMoveListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

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
public class NoDaylight extends JavaPlugin {

    @Override public void onEnable() {

        getServer().getPluginManager().registerEvents(new PlayerMoveListener(), this);

        getLogger().log(Level.INFO, "NoDaylight Plugin v" + getDescription().getVersion() + " started");
    }

    @Override public void onDisable() {
        getLogger().log(Level.INFO, "NoDaylight Plugin v" + getDescription().getVersion() + " stopped");
    }
}
