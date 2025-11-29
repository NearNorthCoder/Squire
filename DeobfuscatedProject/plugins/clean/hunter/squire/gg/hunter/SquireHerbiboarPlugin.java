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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.hunter.tasks.IHelper;
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
        this.h = lllIIllIlIIl[1];
        c = lllIIllIlIIl[1];
        this.i.o();
        this.f.remove((Overlay)this.e);

        this.j.unregister((Object)this.i);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        String string = chatMessage.getMessage();
        if (SquireHerbiboarPlugin.lIIIlIlIlIlIIlI(string.contains(lllIIllIIlll[lllIIllIlIIl[1]]) ? 1 : 0)) {
            int n2;
            if (SquireHerbiboarPlugin.lIIIlIlIlIlIIll(b ? 1 : 0)) {
                n2 = lllIIllIlIIl[2];

                if (3 == 0) {
                    return;
                }
            } else {
                b = lllIIllIlIIl[1];
                n2 = b ? 1 : 0;
            }
        }
        if (SquireHerbiboarPlugin.lIIIlIlIlIlIIlI(var1.contains(lllIIllIIlll[lllIIllIlIIl[2]]) ? 1 : 0)) {
            c += lllIIllIlIIl[2];
        }
        if (SquireHerbiboarPlugin.lIIIlIlIlIlIIlI(var1.contains(lllIIllIIlll[lllIIllIlIIl[3]]) ? 1 : 0)) {
            SquireHerbiboarPlugin var2;
            var2.b(lllIIllIlIIl[2]);
        }
    }

    private static boolean lIIIlIlIlIlIIll(int n2) {
        return n2 == 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIIllIlIIl[0]];
        classArray[SquireHerbiboarPlugin.lllIIllIlIIl[1]] = CheckingSuppliesTask.class;
        classArray[SquireHerbiboarPlugin.lllIIllIlIIl[2]] = FindingHerbiboarTask.class;
        classArray[SquireHerbiboarPlugin.lllIIllIlIIl[3]] = BankingTask.class;
        classArray[SquireHerbiboarPlugin.lllIIllIlIIl[4]] = DrinkingStaminaPotionTask.class;
        return classArray;
    }

    private static boolean lIIIlIlIlIlIIlI(int n2) {
        return n2 != 0;
    }

    public boolean g() {
        return this.h;
    }

        return String.valueOf(var3);
    }

    protected void onStart() {
        this.g = Instant.now();
        this.h = lllIIllIlIIl[1];
        this.f.add((Overlay)this.e);

        this.j.register((Object)this.i);
        this.i.n();
    }

    private static void lIIIlIlIlIlIIII() {
        lllIIllIIlll = new String[lllIIllIlIIl[4]];
        SquireHerbiboarPlugin.lllIIllIIlll[SquireHerbiboarPlugin.lllIIllIlIIl[1]] = "place";
        SquireHerbiboarPlugin.lllIIllIIlll[SquireHerbiboarPlugin.lllIIllIlIIl[2]] = "harvest count";
        SquireHerbiboarPlugin.lllIIllIIlll[SquireHerbiboarPlugin.lllIIllIlIIl[3]] = "sack is empty";
    }

    public static int e() {
        return c;
    }

    static {
        SquireHerbiboarPlugin.lIIIlIlIlIlIIIl();
        SquireHerbiboarPlugin.lIIIlIlIlIlIIII();
        a = LoggerFactory.getLogger(SquireHerbiboarPlugin.class);
    }

    private static boolean lIIIlIlIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean f() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }
}

