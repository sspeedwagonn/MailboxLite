package net.civicraft.mailboxLite;

import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;

public class Mailbox {
    private Player mailboxOwner;
    private ArrayList<Mail> mail;

    public void openMailbox(Player player) {
        ChestGui gui = new ChestGui(3, mailboxOwner.getName() + "'s Mailbox");

        //display mail in mailbox

        gui.show(player);
    }
}
