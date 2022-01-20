package net.sourcewriters.minecraft.vexample;

import java.util.logging.Level;
import java.util.logging.Logger;

import net.sourcewriters.minecraft.vcompat.provider.VersionControl;
import net.sourcewriters.minecraft.vcompat.VersionCompatProvider;
import net.sourcewriters.minecraft.vcompat.updater.CompatApp;
import net.sourcewriters.minecraft.vcompat.updater.Reason;

final class ExampleAppV3 extends CompatApp {

    private final ExamplePlugin plugin;

    public ExampleApp(ExamplePlugin plugin) {
        super(plugin.getName(), 3 /* This indicates the major version that should be looked for */);
        this.plugin = plugin;
    }

    @Override
    protected void onFailed(Reason reason, String message) {
        Logger logger = plugin.getLogger();
        logger.log(Level.SEVERE, "----------------------------------------------------------");
        logger.log(Level.SEVERE, "Failed to startup! (Reason: " + reason.name() + ")");
        logger.log(Level.SEVERE, "==========================================================");
        logger.log(Level.SEVERE, message);
        logger.log(Level.SEVERE, "----------------------------------------------------------");
    }

    @Override
    protected void onReady() {
        VersionControl control = VersionCompatProvider.get().getControl();
        // Write your startup code related to vCompat here
    }

    @Override
    protected void onShutdown() {
        // Write your shutdown code related to vCompat here
    }

}
