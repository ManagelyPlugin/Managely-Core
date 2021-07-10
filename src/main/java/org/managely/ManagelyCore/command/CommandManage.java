package org.managely.ManagelyCore.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.managely.ManagelyCore.ManagelyCore;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

public class CommandManage implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(strings[0] == null) return false;
        for(String n : ManagelyCore.moduleList.keySet()){

            if(strings[0].equalsIgnoreCase(n)){
                String[] args = Arrays.copyOfRange(strings, 1, strings.length);
                System.out.println("yoyo");
                Class<? extends Plugin> c = Objects.requireNonNull(Bukkit.getPluginManager().getPlugin("Managely-" + n)).getClass();
                Class[] cArg = new Class[]{CommandSender.class, Command.class, String.class, String[].class};
                try {
                    Method m = c.getMethod("manageCommandCalled", cArg);
                    m.invoke(Bukkit.getPluginManager().getPlugin("Managely-"+n), commandSender, command, s, args);
                    return true;

                } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }
        return false;
    }
}
