/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.plugins.agility;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.AgilityOverlay;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.b;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.d;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.e;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.f;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.g;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.h;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.i;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.j;

@PluginDescriptor(name="Squire Agility", description="Completes agility courses.", enabledByDefault=false, tags={"agility", "course", "marks of grace"})
public class SquireAgilityPlugin
extends SquirePlugin {
    private /* synthetic */ b f;
    private static /* synthetic */ String[] lIllIIIIIll;
    private static /* synthetic */ int[] lIllIIIIlII;
    @Inject
    private /* synthetic */ OverlayManager d;
    private /* synthetic */ int g;
    @Inject
    private /* synthetic */ AgilityOverlay e;

    private static boolean lIIlIlIIllIlII(int n, int n2) {
        return n < n2;
    }

    private static void lIIlIlIIllIIIl() {
        lIllIIIIIll = new String[lIllIIIIlII[2]];
        SquireAgilityPlugin.lIllIIIIIll[SquireAgilityPlugin.lIllIIIIlII[0]] = SquireAgilityPlugin."lap count";
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllIIIIlII[1]];
        classArray[SquireAgilityPlugin.lIllIIIIlII[0]] = d.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[2]] = h.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[3]] = j.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[4]] = e.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[5]] = f.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[6]] = i.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[7]] = g.class;
        return classArray;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireAgilityPlugin.lIIlIlIIllIIll(chatMessage.getMessage().contains(lIllIIIIIll[lIllIIIIlII[0]]) ? 1 : 0)) {
            this.g += lIllIIIIlII[2];
        }
    }

    private static void lIIlIlIIllIIlI() {
        lIllIIIIlII = new int[8];
        SquireAgilityPlugin.lIllIIIIlII[0] = (0xE5 ^ 0xAA) & ~(0x67 ^ 0x28) & ~((0x71 ^ 0x6D) & ~(0x5C ^ 0x40));
        SquireAgilityPlugin.lIllIIIIlII[1] = 0xB1 ^ 0xB6;
        SquireAgilityPlugin.lIllIIIIlII[2] = 1;
        SquireAgilityPlugin.lIllIIIIlII[3] = 2;
        SquireAgilityPlugin.lIllIIIIlII[4] = 3;
        SquireAgilityPlugin.lIllIIIIlII[5] = 61 + 51 - 19 + 98 ^ 118 + 138 - 141 + 72;
        SquireAgilityPlugin.lIllIIIIlII[6] = 0x97 ^ 0x92;
        SquireAgilityPlugin.lIllIIIIlII[7] = 0xA5 ^ 0xA3;
    }

    static {
        SquireAgilityPlugin.lIIlIlIIllIIlI();
        SquireAgilityPlugin.lIIlIlIIllIIIl();
    }

    public void a(b b2) {
        this.f = b2;
    }

    private static boolean lIIlIlIIllIIll(int n) {
        return n != 0;
    }

    public SquireAgilityPlugin() {
        this.g = lIllIIIIlII[0];
    }

    @Provides
    public AgilityConfig a(ConfigManager configManager) {
        return (AgilityConfig)configManager.getConfig(AgilityConfig.class);
    }

    public b a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    protected void onStop() {
        this.d.remove((Overlay)this.e);
        0;
        this.a((b)null);
        this.g = lIllIIIIlII[0];
    }

    protected void onStart() {
        this.d.add((Overlay)this.e);
        0;
        this.a((b)null);
        this.g = lIllIIIIlII[0];
    }

    private static String lIIlIlIIllIIII(String llllllllllllllllIlIlIlIlllIIllII, String llllllllllllllllIlIlIlIlllIIIllI) {
        llllllllllllllllIlIlIlIlllIIllII = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIlIlllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIlIlllIIlIlI = new StringBuilder();
        char[] llllllllllllllllIlIlIlIlllIIlIIl = llllllllllllllllIlIlIlIlllIIIllI.toCharArray();
        int llllllllllllllllIlIlIlIlllIIlIII = lIllIIIIlII[0];
        char[] llllllllllllllllIlIlIlIlllIIIIlI = llllllllllllllllIlIlIlIlllIIllII.toCharArray();
        int llllllllllllllllIlIlIlIlllIIIIIl = llllllllllllllllIlIlIlIlllIIIIlI.length;
        int llllllllllllllllIlIlIlIlllIIIIII = lIllIIIIlII[0];
        while (SquireAgilityPlugin.lIIlIlIIllIlII(llllllllllllllllIlIlIlIlllIIIIII, llllllllllllllllIlIlIlIlllIIIIIl)) {
            char llllllllllllllllIlIlIlIlllIIllIl = llllllllllllllllIlIlIlIlllIIIIlI[llllllllllllllllIlIlIlIlllIIIIII];
            llllllllllllllllIlIlIlIlllIIlIlI.append((char)(llllllllllllllllIlIlIlIlllIIllIl ^ llllllllllllllllIlIlIlIlllIIlIIl[llllllllllllllllIlIlIlIlllIIlIII % llllllllllllllllIlIlIlIlllIIlIIl.length]));
            0;
            ++llllllllllllllllIlIlIlIlllIIlIII;
            ++llllllllllllllllIlIlIlIlllIIIIII;
            0;
            if ((97 + 98 - 188 + 183 ^ 62 + 144 - 25 + 5) >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIlIlllIIlIlI);
    }
}

