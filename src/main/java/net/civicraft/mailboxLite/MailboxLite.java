package net.civicraft.mailboxLite;

import org.bukkit.plugin.java.JavaPlugin;

public final class MailboxLite extends JavaPlugin {
    private static MailboxLite instance;

    @Override
    public void onEnable() {
        instance = this;
        // Plugin startup logic
    }

    public static MailboxLite getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        instance = null;
        // Plugin shutdown logic
    }
}
