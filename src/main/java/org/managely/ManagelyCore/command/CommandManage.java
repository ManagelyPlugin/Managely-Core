package org.managely.ManagelyCore.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.managely.ManagelyCore.ManagelyCore;

import java.util.Arrays;
import java.util.Locale;

public class CommandManage implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(strings[0] == null) return false;
        for(String n : ManagelyCore.moduleList.keySet()){

            if(strings[0].equals(n)){
                String[] args = Arrays.copyOfRange(strings, 1, strings.length);
                System.out.println("yoyo");
                ManagelyCore.moduleList.get(n).manageCommandCalled(commandSender, command, s, args);
            }
        }
        return false;
    }
}
