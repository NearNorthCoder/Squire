/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  org.pf4j.Extension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.hunter.tasks;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import java.time.Instant;
import javax.inject.Inject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.hunter.tasks.CheckingSuppliesTask;
import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.BankingTask;
import gg.squire.hunter.tasks.DrinkingStaminaPotionTask;
import gg.squire.hunter.tasks.FindingHerbiboarTask;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.overlay.HerbiboarInfoBox;

@Extension
@PluginDescriptor(name="Squire Herbiboar")
public class SquireHerbiboarPlugin
extends SquirePlugin {
    private  boolean h;
    
    private static final  Logger a;
    @Inject
    private  HerbiboarInfoBox e;
    
    @Inject
    private  OverlayManager f;
    public static  boolean b;
    @Inject
    private  EventBus j;
    @Inject
    private  i i;
    private  Instant g;
    private  boolean d;
    private static  int c;

    @Provides
    SquireHerbiboarConfig a(ConfigManager configManager) {
        return (SquireHerbiboarConfig)configManager.getConfig(SquireHerbiboarConfig.class);
    }

    public Instant getStarted() {
        return this.g;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    protected void onStop() {
        this.g = null;
        this.h = var2[1];
        c = var2[1];
        this.i.o();
        this.f.remove((Overlay)this.e);
        0;
        this.j.unregister((Object)this.i);
    }

    private static void var3() {
        var2 = new int[6];
        SquireHerbiboarPlugin.var2[0] = 0xBB ^ 0xAB ^ (0x32 ^ 0x26);
        SquireHerbiboarPlugin.var2[1] = (0x7E ^ 0x56 ^ (0x1C ^ 0x62)) & (0xF2 ^ 0x89 ^ (1 ^ 0x2C) ^ -1);
        SquireHerbiboarPlugin.var2[2] = 1;
        SquireHerbiboarPlugin.var2[3] = 2;
        SquireHerbiboarPlugin.var2[4] = 3;
        SquireHerbiboarPlugin.var2[5] = 0xF3 ^ 0xB5 ^ (0xE8 ^ 0xA6);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var4;
        String string = chatMessage.getMessage();
        if (SquireHerbiboarPlugin.var5(string.contains(var1[var2[1]]) ? 1 : 0)) {
            int n2;
            if (SquireHerbiboarPlugin.var6(b)) {
                n2 = var2[2];
                0;
                
            } else {
                b = var2[1];
                n2 = b;
            }
        }
        if (SquireHerbiboarPlugin.var5(var4.contains(var1[var2[2]]) ? 1 : 0)) {
            c += var2[2];
        }
        if (SquireHerbiboarPlugin.var5(var4.contains(var1[var2[3]]) ? 1 : 0)) {
            SquireHerbiboarPlugin var7;
            var7.b(var2[2]);
        }
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var2[0]];
        classArray[SquireHerbiboarPlugin.var2[1]] = CheckingSuppliesTask.class;
        classArray[SquireHerbiboarPlugin.var2[2]] = FindingHerbiboarTask.class;
        classArray[SquireHerbiboarPlugin.var2[3]] = BankingTask.class;
        classArray[SquireHerbiboarPlugin.var2[4]] = DrinkingStaminaPotionTask.class;
        return classArray;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    public boolean g() {
        return this.h;
    }

    private static String var14(String var15, String var16) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var18 = var16.toCharArray();
        int var19 = var2[1];
        char[] var20 = var15.toCharArray();
        int var21 = var20.length;
        int var22 = var2[1];
        while (SquireHerbiboarPlugin.var23(var22, var21)) {
            char var24 = var20[var22];
            var17.append((char)(var24 ^ var18[var19 % var18.length]));
            0;
            ++var19;
            ++var22;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    protected void onStart() {
        this.g = Instant.now();
        this.h = var2[1];
        this.f.add((Overlay)this.e);
        0;
        this.j.register((Object)this.i);
        this.i.n();
    }

    private static void var25() {
        var1 = new String[var2[4]];
        SquireHerbiboarPlugin.var1[SquireHerbiboarPlugin.var2[1]] = "place";
        SquireHerbiboarPlugin.var1[SquireHerbiboarPlugin.var2[2]] = "harvest count";
        SquireHerbiboarPlugin.var1[SquireHerbiboarPlugin.var2[3]] = "sack is empty";
    }

    public static int e() {
        return c;
    }

    static {
        SquireHerbiboarPlugin.var3();
        SquireHerbiboarPlugin.var25();
        a = LoggerFactory.getLogger(SquireHerbiboarPlugin.class);
    }

    private static boolean var23(int n2, int n3) {
        return n2 < n3;
    }

    public boolean f() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }
}

