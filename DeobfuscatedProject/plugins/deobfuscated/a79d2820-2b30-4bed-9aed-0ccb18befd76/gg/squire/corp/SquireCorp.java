/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.NpcLootReceived
 *  net.runelite.client.game.ItemStack
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.game.Prices
 */
package gg.squire.corp;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.c;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.d;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.e;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.f;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.g;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.h;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.i;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.j;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.k;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.l;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.n;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.o;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.p;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.q;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.r;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.s;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.corp.SquireCorpConfig;
import gg.squire.corp.overlay.CorpInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.game.ItemStack;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Prices;

@SquireUtil
@PluginDescriptor(name="Squire Corporeal Beast", description="Kills the corporeal beast", enabledByDefault=false)
public class SquireCorp
extends SquirePlugin {
    private /* synthetic */ int e;
    @Inject
    private /* synthetic */ s a;
    private /* synthetic */ boolean f;
    private /* synthetic */ int i;
    private static /* synthetic */ String[] lIlIlllIlIIl;
    @Inject
    private /* synthetic */ OverlayManager c;
    private /* synthetic */ boolean h;
    private /* synthetic */ boolean g;
    private static /* synthetic */ int[] lIlIlllIlIlI;
    @Inject
    private /* synthetic */ EventBus b;
    @Inject
    private /* synthetic */ CorpInfoBox d;

    public boolean d() {
        return this.h;
    }

    static {
        SquireCorp.lllIIIIlllIIII();
        SquireCorp.lllIIIIllIllll();
    }

    public void c(boolean bl) {
        this.h = bl;
    }

    public boolean b() {
        return this.f;
    }

    private static String lllIIIIllIlllI(String lllllllllllllllIllIIlIIIIIIIlIIl, String lllllllllllllllIllIIlIIIIIIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIIIIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIlIIIIIIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIlIIIIIIIllIl.init(lIlIlllIlIlI[3], lllllllllllllllIllIIlIIIIIIIlllI);
            return new String(lllllllllllllllIllIIlIIIIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIlIIIIIIIllII) {
            lllllllllllllllIllIIlIIIIIIIllII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireCorp.lllIIIIlllIIIl(chatMessage.getMessage().contains(lIlIlllIlIIl[lIlIlllIlIlI[0]]) ? 1 : 0)) {
            this.e += lIlIlllIlIlI[2];
        }
    }

    public int a() {
        return this.e;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    protected void onStop() {
        this.b.unregister((Object)this.a);
        this.c.remove((Overlay)this.d);
        0;
    }

    public void b(boolean bl) {
        this.g = bl;
    }

    public int e() {
        return this.i;
    }

    protected void onStart() {
        this.a.v();
        this.e = lIlIlllIlIlI[0];
        this.f = lIlIlllIlIlI[0];
        this.b.register((Object)this.a);
        this.c.add((Overlay)this.d);
        0;
    }

    private static void lllIIIIllIllll() {
        lIlIlllIlIIl = new String[lIlIlllIlIlI[2]];
        SquireCorp.lIlIlllIlIIl[SquireCorp.lIlIlllIlIlI[0]] = SquireCorp."Your Corporeal Beast kill count is";
    }

    @Provides
    SquireCorpConfig a(ConfigManager configManager) {
        return (SquireCorpConfig)configManager.getConfig(SquireCorpConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIlllIlIlI[1]];
        classArray[SquireCorp.lIlIlllIlIlI[0]] = c.class;
        classArray[SquireCorp.lIlIlllIlIlI[2]] = p.class;
        classArray[SquireCorp.lIlIlllIlIlI[3]] = h.class;
        classArray[SquireCorp.lIlIlllIlIlI[4]] = i.class;
        classArray[SquireCorp.lIlIlllIlIlI[5]] = g.class;
        classArray[SquireCorp.lIlIlllIlIlI[6]] = r.class;
        classArray[SquireCorp.lIlIlllIlIlI[7]] = f.class;
        classArray[SquireCorp.lIlIlllIlIlI[8]] = d.class;
        classArray[SquireCorp.lIlIlllIlIlI[9]] = e.class;
        classArray[SquireCorp.lIlIlllIlIlI[10]] = k.class;
        classArray[SquireCorp.lIlIlllIlIlI[11]] = l.class;
        classArray[SquireCorp.lIlIlllIlIlI[12]] = j.class;
        classArray[SquireCorp.lIlIlllIlIlI[13]] = n.class;
        classArray[SquireCorp.lIlIlllIlIlI[14]] = q.class;
        classArray[SquireCorp.lIlIlllIlIlI[15]] = o.class;
        return classArray;
    }

    private static boolean lllIIIIlllIIIl(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        Iterator lllllllllllllllIllIIlIIIIIIlIlII = npcLootReceived.getItems().iterator();
        while (SquireCorp.lllIIIIlllIIIl(lllllllllllllllIllIIlIIIIIIlIlII.hasNext() ? 1 : 0)) {
            ItemStack lllllllllllllllIllIIlIIIIIIlIIll = (ItemStack)lllllllllllllllIllIIlIIIIIIlIlII.next();
            lllllllllllllllIllIIlIIIIIIlIllI.i += lllllllllllllllIllIIlIIIIIIlIIll.getQuantity() * Prices.getItemPrice((int)lllllllllllllllIllIIlIIIIIIlIIll.getId());
            0;
            if (3 > 0) continue;
            return;
        }
    }

    private static void lllIIIIlllIIII() {
        lIlIlllIlIlI = new int[16];
        SquireCorp.lIlIlllIlIlI[0] = (0xC4 ^ 0x9A ^ (0x7B ^ 0xE)) & (11 + 71 - -36 + 47 ^ 45 + 112 - 116 + 101 ^ -1);
        SquireCorp.lIlIlllIlIlI[1] = 0xF5 ^ 0xA1 ^ (0xEF ^ 0xB4);
        SquireCorp.lIlIlllIlIlI[2] = 1;
        SquireCorp.lIlIlllIlIlI[3] = 2;
        SquireCorp.lIlIlllIlIlI[4] = 3;
        SquireCorp.lIlIlllIlIlI[5] = 74 + 107 - 159 + 177 ^ 126 + 89 - 78 + 58;
        SquireCorp.lIlIlllIlIlI[6] = 0xA3 ^ 0xC3 ^ (0xC1 ^ 0xA4);
        SquireCorp.lIlIlllIlIlI[7] = 0x3D ^ 9 ^ (0x9F ^ 0xAD);
        SquireCorp.lIlIlllIlIlI[8] = 0xD6 ^ 0xBF ^ (0x11 ^ 0x7F);
        SquireCorp.lIlIlllIlIlI[9] = 0x8C ^ 0x84;
        SquireCorp.lIlIlllIlIlI[10] = 0xAD ^ 0xA9 ^ (0x48 ^ 0x45);
        SquireCorp.lIlIlllIlIlI[11] = 0x33 ^ 0x23 ^ (0x65 ^ 0x7F);
        SquireCorp.lIlIlllIlIlI[12] = 52 + 143 - 133 + 110 ^ 166 + 8 - 9 + 2;
        SquireCorp.lIlIlllIlIlI[13] = 0x1B ^ 0x17;
        SquireCorp.lIlIlllIlIlI[14] = 0x22 ^ 0x7D ^ (0xE4 ^ 0xB6);
        SquireCorp.lIlIlllIlIlI[15] = 7 ^ 0x13 ^ (2 ^ 0x18);
    }

    public boolean c() {
        return this.g;
    }

    public SquireCorp() {
        this.e = lIlIlllIlIlI[0];
        this.f = lIlIlllIlIlI[0];
        this.g = lIlIlllIlIlI[0];
        this.h = lIlIlllIlIlI[0];
    }
}

