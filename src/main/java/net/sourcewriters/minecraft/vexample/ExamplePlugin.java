package net.sourcewriters.minecraft.vexample;

import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin {

    private ExampleApp app;

    @Override
    public void onLoad() {
        app = new ExampleApp(this);
    }

    @Override
    public void onEnable() {
        app.start();
    }

    @Override
    public void onDisable() {
        app.stop();
    }

}
