/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.thieving;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.thieving.SquirePlunderConfig;
import gg.squire.thieving.overlay.PlunderInfoBox;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.d;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.e;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.f;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.g;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.h;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.i;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.j;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.l;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.m;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.n;

@PluginDescriptor(name="Squire Pyramid Plunder", enabledByDefault=false)
public class SquirePlunder
extends SquirePlugin {
    @Inject
    private /* synthetic */ PlunderInfoBox b;
    private static /* synthetic */ String[] llllllIlIlII;
    @Inject
    private /* synthetic */ SquirePlunderConfig a;
    private static /* synthetic */ int[] llllllIlIlIl;
    @Inject
    private /* synthetic */ a c;
    private /* synthetic */ InventorySetup f;
    @Inject
    private /* synthetic */ EventBus d;
    @Inject
    private /* synthetic */ OverlayManager e;

    protected void onStop() {
        this.d.unregister((Object)this.c);
        this.e.remove((Overlay)this.b);
        0;
    }

    private static void lIIlIlIIIllIIlI() {
        llllllIlIlII = new String[llllllIlIlIl[2]];
        SquirePlunder.llllllIlIlII[SquirePlunder.llllllIlIlIl[1]] = SquirePlunder."Plunder started";
    }

    static {
        SquirePlunder.lIIlIlIIIllIIll();
        SquirePlunder.lIIlIlIIIllIIlI();
    }

    @Provides
    SquirePlunderConfig a(ConfigManager configManager) {
        return (SquirePlunderConfig)configManager.getConfig(SquirePlunderConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llllllIlIlIl[0]];
        classArray[SquirePlunder.llllllIlIlIl[1]] = e.class;
        classArray[SquirePlunder.llllllIlIlIl[2]] = d.class;
        classArray[SquirePlunder.llllllIlIlIl[3]] = n.class;
        classArray[SquirePlunder.llllllIlIlIl[4]] = m.class;
        classArray[SquirePlunder.llllllIlIlIl[5]] = f.class;
        classArray[SquirePlunder.llllllIlIlIl[6]] = h.class;
        classArray[SquirePlunder.llllllIlIlIl[7]] = j.class;
        classArray[SquirePlunder.llllllIlIlIl[8]] = i.class;
        classArray[SquirePlunder.llllllIlIlIl[9]] = l.class;
        classArray[SquirePlunder.llllllIlIlIl[10]] = g.class;
        return classArray;
    }

    private static String lIIlIlIIIllIIIl(String var8, String var10) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var1 = var10.toCharArray();
        int var2 = llllllIlIlIl[1];
        char[] var9 = var8.toCharArray();
        int var6 = var9.length;
        int var4 = llllllIlIlIl[1];
        while (SquirePlunder.lIIlIlIIIllIlIl(var4, var6)) {
            char var3 = var9[var4];
            var5.append((char)(var3 ^ var1[var2 % var1.length]));
            0;
            ++var2;
            ++var4;
            0;
            if (((76 + 89 - 119 + 114 ^ 13 + 19 - -145 + 5) & (39 + 91 - 28 + 48 ^ 119 + 5 - 6 + 10 ^ -1)) > -1) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a();
    }

    private static void lIIlIlIIIllIIll() {
        llllllIlIlIl = new int[11];
        SquirePlunder.llllllIlIlIl[0] = 0x8E ^ 0x95 ^ (0x7E ^ 0x6F);
        SquirePlunder.llllllIlIlIl[1] = (0x2B ^ 0x64 ^ (0xA ^ 0x58)) & (0xD3 ^ 0x95 ^ (0xD2 ^ 0x89) ^ -1);
        SquirePlunder.llllllIlIlIl[2] = 1;
        SquirePlunder.llllllIlIlIl[3] = 2;
        SquirePlunder.llllllIlIlIl[4] = 3;
        SquirePlunder.llllllIlIlIl[5] = 0x47 ^ 0x43;
        SquirePlunder.llllllIlIlIl[6] = 0x97 ^ 0x92;
        SquirePlunder.llllllIlIlIl[7] = 0xC0 ^ 0xC6;
        SquirePlunder.llllllIlIlIl[8] = 99 + 106 - 191 + 165 ^ 105 + 121 - 171 + 125;
        SquirePlunder.llllllIlIlIl[9] = 0x58 ^ 0x50;
        SquirePlunder.llllllIlIlIl[10] = 96 + 144 - 120 + 83 ^ 29 + 7 - -30 + 128;
    }

    private static boolean lIIlIlIIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public InventorySetup b() {
        return this.f;
    }

    protected void onStart() {
        this.d.register((Object)this.c);
        this.e.add((Overlay)this.b);
        0;
        System.out.println(llllllIlIlII[llllllIlIlIl[1]]);
        this.a();
    }

    private void a() {
        SquirePlunder var7;
        this.f = new InventorySetup();
        if (SquirePlunder.lIIlIlIIIllIlII(this.a.foodAmount())) {
            this.f.add(this.a.foodID(), this.a.foodAmount());
            0;
        }
        if (SquirePlunder.lIIlIlIIIllIlII(var7.a.antiAmount())) {
            var7.f.add(item -> item.getName().startsWith(this.a.antiPoison()), var7.a.antiAmount());
            0;
        }
    }

    private static boolean lIIlIlIIIllIlII(int n2) {
        return n2 != 0;
    }
}

