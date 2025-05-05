package plugin.slowAreaTp;

import command.GebieteCommand;
import listener.GebieteListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlowAreaTp extends JavaPlugin {
    private static SlowAreaTp instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("SlowAreaTp plugin has been enabled!");


        getCommand("gebiete").setExecutor(new GebieteCommand());


        getServer().getPluginManager().registerEvents(new GebieteListener(), this);


        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("SlowAreaTp plugin has been disabled!");
    }

    public static SlowAreaTp getInstance() {
        return instance;
    }
}