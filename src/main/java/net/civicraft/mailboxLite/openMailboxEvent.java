package net.civicraft.mailboxLite;

import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;

public class openMailboxEvent {
    @EventHandler
    public void onOpenMailboxEvent(PlayerInteractEvent event) {
        if (!event.getAction().isRightClick()) return;

        if (MailboxLite.getInstance().getConfig().getBoolean("open-others-mailbox")) {
            Mailbox.openMailbox(event.getPlayer());
        } else {
            if (Mailbox.getMailboxOwner() == event.getPlayer()) {
                Mailbox.openMailbox(event.getPlayer());
            } else {
                event.getPlayer().sendMessage(Component.text("[Mailbox] This mailbox does not belong to you!"));
            }
        }
    }
}
