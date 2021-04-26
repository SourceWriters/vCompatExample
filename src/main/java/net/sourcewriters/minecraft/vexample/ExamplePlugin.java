package net.sourcewriters.minecraft.vexample;

import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin {

    private ExampleApp app;

    @Override
    public void onEnable() {
        (app = new ExampleApp(this)).start();
    }

    @Override
    public void onDisable() {
        app.stop();
    }

}
