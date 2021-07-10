package org.managely.ManagelyCore.modules;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public interface ManagelyModule {

    void manageCommandCalled(CommandSender commandSender, Command command, String s, String[] strings);
}
