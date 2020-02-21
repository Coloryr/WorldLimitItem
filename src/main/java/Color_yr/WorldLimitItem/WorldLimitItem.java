package Color_yr.WorldLimitItem;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class WorldLimitItem extends JavaPlugin {

    public static Plugin WorldLimitItem;
    public static Logger log;
    public static final String version = "1.0.0";

    public static final String Use = "WorldUse";
    public static final String NoUse = "WorldNoUse";

    @Override
    public void onEnable() {
        WorldLimitItem = this;
        log = getLogger();

        log.info("§d[WorldLimitItem]§e正在启动，感谢使用，本插件交流群：571239090");

        Bukkit.getPluginManager().registerEvents(new Event(), this);

        log.info("§d[WorldLimitItem]§e已启动-" + version);

    }

    @Override
    public void onDisable() {
        log.info("§d[WorldLimitItem]§e已停止，感谢使用");
    }
}
