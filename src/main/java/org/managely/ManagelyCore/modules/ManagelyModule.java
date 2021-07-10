package org.managely.ManagelyCore.modules;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class ManagelyModule extends JavaPlugin {

    public abstract void manageCommandCalled(CommandSender commandSender, Command command, String s, String[] strings);
}
