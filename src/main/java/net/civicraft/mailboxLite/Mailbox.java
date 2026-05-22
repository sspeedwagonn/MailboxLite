package net.civicraft.mailboxLite;

import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.pane.Pane;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;
import com.github.stefvanschie.inventoryframework.pane.util.Slot;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;

public class Mailbox {
    private static Player mailboxOwner;
    private ArrayList<Mail> mail;

    public static Player getMailboxOwner() {
        return mailboxOwner;
    }

    public static void openMailbox(Player player) {
        ChestGui gui = new ChestGui(3, mailboxOwner.getName() + "'s Mailbox");
        StaticPane pane = new StaticPane(9, 3, Pane.Priority.HIGHEST);
        //display mail in mailbox
        for (int i = 0; i < gui.getRows() * 9; i++) {
            pane.addItem(mail.get(i), Slot.fromIndex(i));
            //fix this
        }

        gui.addPane(Slot.fromIndex(0), pane);

        gui.show(player);
    }
}
