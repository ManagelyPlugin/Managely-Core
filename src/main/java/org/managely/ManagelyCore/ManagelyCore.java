package org.managely.ManagelyCore;


import org.bukkit.plugin.java.JavaPlugin;
import org.managely.ManagelyCore.command.CommandManage;
import org.managely.ManagelyCore.modules.ManagelyModule;

import java.util.HashMap;

public class ManagelyCore extends JavaPlugin {
    public static HashMap<String, ManagelyModule> moduleList = new HashMap<>();

    @Override
    public void onEnable(){
        saveDefaultConfig();
        this.getCommand("manage").setExecutor(new CommandManage());

    }

    public static boolean registerModule(String name, ManagelyModule m){
        if(moduleList.containsKey(name)) return false;

        moduleList.put(name, m);

        return true;
    }
}

