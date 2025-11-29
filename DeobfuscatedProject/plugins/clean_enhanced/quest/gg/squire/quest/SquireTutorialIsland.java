/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.events.MenuActionProcessed
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.quest;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.quest.SquireQuesterConfig;
import gg.squire.quest.overlay.QuesterInfoBox;
import java.util.stream.Collectors;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.MenuActionProcessed;
import net.unethicalite.api.items.Equipment;
import gg.squire.quest.UpgradingToMembersTask;
import gg.squire.quest.CompletingTutorialIslandTask;

@PluginDescriptor(name="Squire Tutorial Island", enabledByDefault=false)
public class SquireTutorialIsland
extends SquirePlugin {
    
    private  boolean e;
    @Inject
    private  ConfigManager d;
    private  String f;
    @Inject
    private  OverlayManager a;
    @Inject
    private  EventBus c;
    private  String g;
    
    @Inject
    private  QuesterInfoBox b;

    public String c() {
        return this.g;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public void b(String string) {
        this.g = string;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireTutorialIsland.var1[1]] = CompletingTutorialIslandTask.class;
        classArray[SquireTutorialIsland.var1[2]] = UpgradingToMembersTask.class;
        return classArray;
    }

    @Provides
    SquireQuesterConfig a(ConfigManager configManager) {
        return (SquireQuesterConfig)configManager.getConfig(SquireQuesterConfig.class);
    }

    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        if (SquireTutorialIsland.var4(configButtonClicked.getGroup().equals(var2[var1[1]]) ? 1 : 0)) {
            return;
        }
        String string = configButtonClicked.getKey();
        String string2 = string.replace(var2[var1[2]], var2[var1[0]]);
        String string3 = Equipment.getAll().stream().map(item -> item.getId() + ",").collect(Collectors.joining());
        this.d.setConfiguration(configButtonClicked.getGroup(), string2, string3);
    }

    protected void onStop() {
        this.a.remove((Overlay)this.b);
        0;
    }

    private static void var5() {
        var1 = new int[6];
        SquireTutorialIsland.var1[0] = 2;
        SquireTutorialIsland.var1[1] = (93 + 85 - 58 + 131 ^ 39 + 125 - 27 + 55) & (54 + 126 - 82 + 37 ^ 8 + 78 - -60 + 42 ^ -1);
        SquireTutorialIsland.var1[2] = 1;
        SquireTutorialIsland.var1[3] = 3;
        SquireTutorialIsland.var1[4] = 0x86 ^ 0x82;
        SquireTutorialIsland.var1[5] = 0x2D ^ 0x25;
    }

    protected void onStart() {
        this.g = null;
        this.a.add((Overlay)this.b);
        0;
        this.a((String)null);
    }

    public boolean a() {
        return this.e;
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (SquireTutorialIsland.var3(string.contains(var2[var1[3]]) ? 1 : 0)) {
            this.e = var1[2];
        }
    }

    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        System.out.println(menuActionProcessed);
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    static {
        SquireTutorialIsland.var5();
        SquireTutorialIsland.var18();
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public String b() {
        return this.f;
    }

    private static void var18() {
        var2 = new String[var1[4]];
        SquireTutorialIsland.var2[SquireTutorialIsland.var1[1]] = "squirequester";
        SquireTutorialIsland.var2[SquireTutorialIsland.var1[2]] = ".copy";
        SquireTutorialIsland.var2[SquireTutorialIsland.var1[0]] = SquireTutorialIsland.var12("hCFvp1Dqnms=", "rTKMK");
        SquireTutorialIsland.var2[SquireTutorialIsland.var1[3]] = "grain slides down the chute.";
    }

    public void a(String string) {
        this.f = string;
    }
}

