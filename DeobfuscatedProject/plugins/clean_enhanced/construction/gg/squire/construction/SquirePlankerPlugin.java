/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.GameState
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.construction;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.construction.SquirePlankerConfig;
import gg.squire.construction.overlay.PlankerInfoBox;
import java.time.Instant;
import gg.squire.construction.BankingTask;
import gg.squire.construction.MakingPlanksTask;
import gg.squire.construction.MakingPlanksTask;
import gg.squire.construction.TeleportingTask;
import gg.squire.construction.CastingPlankMakeTask;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.managers.interaction.InteractionManager;

@PluginDescriptor(name="Squire Plank Maker", enabledByDefault=false, description="Makes Planks.")
public class SquirePlankerPlugin
extends SquirePlugin {
    private static  long c;
    @Inject
    private  OverlayManager f;
    public static  int a;
    public static  int b;
    private  Instant h;
    
    @Inject
    private  SquirePlankerConfig e;
    @Inject
    private  PlankerInfoBox g;
    
    private final  Class<?>[] d;

    private static void var3() {
        var1 = new int[6];
        SquirePlankerPlugin.var1[0] = 0x9D ^ 0x98;
        SquirePlankerPlugin.var1[1] = (0x23 ^ 0x27) & ~(0x19 ^ 0x1D);
        SquirePlankerPlugin.var1[2] = 1;
        SquirePlankerPlugin.var1[3] = 2;
        SquirePlankerPlugin.var1[4] = 3;
        SquirePlankerPlugin.var1[5] = 38 + 57 - -35 + 63 ^ 163 + 58 - 186 + 162;
    }

    private static void var4() {
        var2 = new String[var1[2]];
        SquirePlankerPlugin.var2[SquirePlankerPlugin.var1[1]] = "Squire Plank Maker has been started";
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        boolean bl;
        if (SquirePlankerPlugin.var5(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            bl = var1[2];
            0;
            if (((0xF9 ^ 0xA5 ^ (0x58 ^ 0x5F)) & (0xCD ^ 0xAE ^ (0x82 ^ 0xBA) ^ -1)) != 0) {
                return;
            }
        } else {
            bl = var1[1];
        }
        this.setPaused(bl);
    }

    public static int b() {
        return b;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var5(Object object, Object object2) {
        return object == object2;
    }

    public static long c() {
        return c;
    }

    protected Class<?>[] tasks() {
        return this.d;
    }

    @Provides
    SquirePlankerConfig a(ConfigManager configManager) {
        return (SquirePlankerConfig)configManager.getConfig(SquirePlankerConfig.class);
    }

    protected void onStart() {
        boolean bl;
        this.f.add((Overlay)this.g);
        0;
        System.out.println(var2[var1[1]]);
        if (SquirePlankerPlugin.var5(Game.getState(), GameState.LOGIN_SCREEN)) {
            bl = var1[2];
            0;
            if null != null {
                return;
            }
        } else {
            bl = var1[1];
        }
        this.setPaused(bl);
        this.h = Instant.now();
        InteractionManager.setHelper((boolean)var1[2]);
    }

    public static int a() {
        return a;
    }

    static {
        SquirePlankerPlugin.var3();
        SquirePlankerPlugin.var4();
    }

    public SquirePlankerPlugin() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquirePlankerPlugin.var1[1]] = MakingPlanksTask.class;
        classArray[SquirePlankerPlugin.var1[2]] = MakingPlanksTask.class;
        classArray[SquirePlankerPlugin.var1[3]] = CastingPlankMakeTask.class;
        classArray[SquirePlankerPlugin.var1[4]] = BankingTask.class;
        classArray[SquirePlankerPlugin.var1[5]] = TeleportingTask.class;
        this.d = classArray;
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)var1[1]);
        this.f.remove((Overlay)this.g);
        0;
    }

    public Instant getStarted() {
        return this.h;
    }
}

