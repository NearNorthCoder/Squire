/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.util.Log
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.whisperer;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.whisperer.config.SquireWhispererConfig;
import gg.squire.whisperer.overlay.WhispererInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.A;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.B;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.C;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.D;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.E;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.a;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.d;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.g;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.k;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.l;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.m;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.n;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.o;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.p;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.q;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.r;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.s;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.t;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.v;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.x;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.y;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.z;

@SquireUtil
@PluginDescriptor(name="Squire Whisperer", enabledByDefault=false)
public class SquireWhisperer
extends SquirePlugin {
    @Inject
    private /* synthetic */ OverlayManager b;
    @Inject
    private /* synthetic */ EventBus e;
    @Inject
    private /* synthetic */ WhispererInfoBox c;
    private static /* synthetic */ int[] lIlIllIllIIII;
    private static /* synthetic */ String[] lIlIllIlIllII;
    @Inject
    private /* synthetic */ a f;
    private /* synthetic */ int a;
    @Inject
    private /* synthetic */ d d;
    private /* synthetic */ boolean g;

    private static boolean llIIIIIlIlllIlI(int n2) {
        return n2 != 0;
    }

    protected void onStart() {
        this.b.add((Overlay)this.c);
        0;
        this.d.e();
        this.f.a(lIlIllIllIIII[0]);
        this.g = lIlIllIllIIII[0];
        this.e.register((Object)this.d);
    }

    public SquireWhisperer() {
        this.g = lIlIllIllIIII[0];
    }

    static {
        SquireWhisperer.llIIIIIlIlllIIl();
        SquireWhisperer.llIIIIIlIllIlIl();
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);
        0;
        this.e.unregister((Object)this.d);
    }

    public int a() {
        return this.a;
    }

    private static String llIIIIIlIllIlII(String llllllllllllllIllIlIIIlIllIIIlII, String llllllllllllllIllIlIIIlIllIIIIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIlIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIllIIIIll.getBytes(StandardCharsets.UTF_8)), lIlIllIllIIII[9]), "DES");
            Cipher llllllllllllllIllIlIIIlIllIIIllI = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIlIllIIIllI.init(lIlIllIllIIII[3], llllllllllllllIllIlIIIlIllIIIlll);
            return new String(llllllllllllllIllIlIIIlIllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIlIllIIIlIl) {
            llllllllllllllIllIlIIIlIllIIIlIl.printStackTrace();
            return null;
        }
    }

    @Provides
    SquireWhispererConfig a(ConfigManager configManager) {
        return (SquireWhispererConfig)configManager.getConfig(SquireWhispererConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llllllllllllllIllIlIIIlIllIIllII;
        if (SquireWhisperer.llIIIIIlIlllIlI(chatMessage.getMessage().contains(lIlIllIlIllII[lIlIllIllIIII[0]]) ? 1 : 0)) {
            this.a += lIlIllIllIIII[2];
        }
        if (SquireWhisperer.llIIIIIlIlllIlI(llllllllllllllIllIlIIIlIllIIllII.getMessage().contains(lIlIllIlIllII[lIlIllIllIIII[2]]) ? 1 : 0)) {
            SquireWhisperer llllllllllllllIllIlIIIlIllIIllIl;
            llllllllllllllIllIlIIIlIllIIllIl.g = lIlIllIllIIII[2];
            Log.info((String)lIlIllIlIllII[lIlIllIllIIII[3]]);
            llllllllllllllIllIlIIIlIllIIllIl.forceStop();
        }
    }

    private static void llIIIIIlIlllIIl() {
        lIlIllIllIIII = new int[22];
        SquireWhisperer.lIlIllIllIIII[0] = (0x65 ^ 0x37) & ~(0xC1 ^ 0x93);
        SquireWhisperer.lIlIllIllIIII[1] = 0x42 ^ 0x57;
        SquireWhisperer.lIlIllIllIIII[2] = 1;
        SquireWhisperer.lIlIllIllIIII[3] = 2;
        SquireWhisperer.lIlIllIllIIII[4] = 3;
        SquireWhisperer.lIlIllIllIIII[5] = 0x10 ^ 0x14;
        SquireWhisperer.lIlIllIllIIII[6] = 0x6B ^ 0x6E;
        SquireWhisperer.lIlIllIllIIII[7] = 0x3B ^ 0x3D;
        SquireWhisperer.lIlIllIllIIII[8] = 0x8C ^ 0x8B;
        SquireWhisperer.lIlIllIllIIII[9] = 0xA4 ^ 0xAC;
        SquireWhisperer.lIlIllIllIIII[10] = 15 + 135 - 116 + 113 ^ 11 + 149 - 69 + 63;
        SquireWhisperer.lIlIllIllIIII[11] = 0x3A ^ 0x30;
        SquireWhisperer.lIlIllIllIIII[12] = 9 ^ 2;
        SquireWhisperer.lIlIllIllIIII[13] = 110 + 18 - 28 + 50 ^ 131 + 110 - 162 + 75;
        SquireWhisperer.lIlIllIllIIII[14] = 0xA1 ^ 0xAC;
        SquireWhisperer.lIlIllIllIIII[15] = 0x60 ^ 0x6E;
        SquireWhisperer.lIlIllIllIIII[16] = 4 ^ 0xB;
        SquireWhisperer.lIlIllIllIIII[17] = 56 + 119 - 75 + 60 ^ 45 + 69 - 54 + 116;
        SquireWhisperer.lIlIllIllIIII[18] = 0x3D ^ 0x2C;
        SquireWhisperer.lIlIllIllIIII[19] = 68 + 37 - 24 + 48 ^ 67 + 43 - 68 + 105;
        SquireWhisperer.lIlIllIllIIII[20] = 2 ^ (0x82 ^ 0x93);
        SquireWhisperer.lIlIllIllIIII[21] = 0xA ^ 0x1E;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIllIllIIII[1]];
        classArray[SquireWhisperer.lIlIllIllIIII[0]] = m.class;
        classArray[SquireWhisperer.lIlIllIllIIII[2]] = k.class;
        classArray[SquireWhisperer.lIlIllIllIIII[3]] = g.class;
        classArray[SquireWhisperer.lIlIllIllIIII[4]] = l.class;
        classArray[SquireWhisperer.lIlIllIllIIII[5]] = y.class;
        classArray[SquireWhisperer.lIlIllIllIIII[6]] = o.class;
        classArray[SquireWhisperer.lIlIllIllIIII[7]] = p.class;
        classArray[SquireWhisperer.lIlIllIllIIII[8]] = q.class;
        classArray[SquireWhisperer.lIlIllIllIIII[9]] = n.class;
        classArray[SquireWhisperer.lIlIllIllIIII[10]] = r.class;
        classArray[SquireWhisperer.lIlIllIllIIII[11]] = A.class;
        classArray[SquireWhisperer.lIlIllIllIIII[12]] = z.class;
        classArray[SquireWhisperer.lIlIllIllIIII[13]] = x.class;
        classArray[SquireWhisperer.lIlIllIllIIII[14]] = s.class;
        classArray[SquireWhisperer.lIlIllIllIIII[15]] = v.class;
        classArray[SquireWhisperer.lIlIllIllIIII[16]] = B.class;
        classArray[SquireWhisperer.lIlIllIllIIII[17]] = t.class;
        classArray[SquireWhisperer.lIlIllIllIIII[18]] = j.class;
        classArray[SquireWhisperer.lIlIllIllIIII[19]] = C.class;
        classArray[SquireWhisperer.lIlIllIllIIII[20]] = D.class;
        classArray[SquireWhisperer.lIlIllIllIIII[21]] = E.class;
        return classArray;
    }

    private static void llIIIIIlIllIlIl() {
        lIlIllIlIllII = new String[lIlIllIllIIII[4]];
        SquireWhisperer.lIlIllIlIllII[SquireWhisperer.lIlIllIllIIII[0]] = SquireWhisperer."Your Whisperer kill";
        SquireWhisperer.lIlIllIlIllII[SquireWhisperer.lIlIllIllIIII[2]] = SquireWhisperer."Oh dear, you are dead";
        SquireWhisperer.lIlIllIlIllII[SquireWhisperer.lIlIllIllIIII[3]] = SquireWhisperer."Died and no death handler just yet, so just stopping for now";
    }

    private static String llIIIIIlIllIIll(String llllllllllllllIllIlIIIlIlIllIlll, String llllllllllllllIllIlIIIlIlIllIlII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIlIlIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIlIlIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIlIlIlllIIl.init(lIlIllIllIIII[3], llllllllllllllIllIlIIIlIlIlllIlI);
            return new String(llllllllllllllIllIlIIIlIlIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIlIlIlllIII) {
            llllllllllllllIllIlIIIlIlIlllIII.printStackTrace();
            return null;
        }
    }
}

