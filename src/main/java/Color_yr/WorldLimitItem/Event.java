package Color_yr.WorldLimitItem;

import net.minecraft.server.v1_15_R1.NBTTagCompound;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.*;

public class Event implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onUse(PlayerInteractEvent e) {
        ItemStack item = e.getItem();
        if (item == null || item.getType().isAir()) {
            return;
        }
        NBTTagCompound NBT = NBTRead.NBT_get(item);
        String world = e.getPlayer().getWorld().getName();
        if (NBT.hasKey(WorldLimitItem.Use)) {
            String temp = NBT.getString(WorldLimitItem.Use);
            if (!temp.equalsIgnoreCase(world)) {
                e.setCancelled(true);
            }
        } else if (NBT.hasKey(WorldLimitItem.NoUse)) {
            String temp = NBT.getString(WorldLimitItem.Use);
            if (temp.equalsIgnoreCase(world)) {
                e.setCancelled(true);
            }
        }
    }
}
