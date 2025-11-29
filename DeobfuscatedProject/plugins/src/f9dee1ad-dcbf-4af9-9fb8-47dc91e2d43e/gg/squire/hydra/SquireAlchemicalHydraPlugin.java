/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.hydra;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.overlay.HydraOverlayPanel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import u.i.r.d.s.e.r.q.y.a.h.-.A;
import u.i.r.d.s.e.r.q.y.a.h.-.B;
import u.i.r.d.s.e.r.q.y.a.h.-.C;
import u.i.r.d.s.e.r.q.y.a.h.-.a;
import u.i.r.d.s.e.r.q.y.a.h.-.e;
import u.i.r.d.s.e.r.q.y.a.h.-.m;
import u.i.r.d.s.e.r.q.y.a.h.-.n;
import u.i.r.d.s.e.r.q.y.a.h.-.o;
import u.i.r.d.s.e.r.q.y.a.h.-.p;
import u.i.r.d.s.e.r.q.y.a.h.-.q;
import u.i.r.d.s.e.r.q.y.a.h.-.r;
import u.i.r.d.s.e.r.q.y.a.h.-.s;
import u.i.r.d.s.e.r.q.y.a.h.-.t;
import u.i.r.d.s.e.r.q.y.a.h.-.u;
import u.i.r.d.s.e.r.q.y.a.h.-.v;
import u.i.r.d.s.e.r.q.y.a.h.-.w;
import u.i.r.d.s.e.r.q.y.a.h.-.x;
import u.i.r.d.s.e.r.q.y.a.h.-.y;
import u.i.r.d.s.e.r.q.y.a.h.-.z;

@SquireUtil
@PluginDescriptor(name="Squire Hydra", description="Does stuff for the Alchemical Hydra", enabledByDefault=false, tags={"boss", "alchemical", "hydra", "prayer"})
public class SquireAlchemicalHydraPlugin
extends SquirePlugin {
    @Inject
    private /* synthetic */ a a;
    @Inject
    private /* synthetic */ SquireAlchemicalHydraConfig d;
    @Inject
    private /* synthetic */ HydraOverlayPanel g;
    private static /* synthetic */ int[] llllIlIIIIIl;
    @Inject
    private /* synthetic */ m f;
    private /* synthetic */ boolean h;
    @Inject
    private /* synthetic */ e b;
    @Inject
    private /* synthetic */ OverlayManager e;
    @Inject
    private /* synthetic */ EventBus c;
    private static /* synthetic */ String[] llllIlIIIIII;

    private static boolean lIIlIIIIIllIlII(Object object, Object object2) {
        return object != object2;
    }

    public a a() {
        return this.a;
    }

    protected void onStop() {
        this.e.remove((Overlay)this.f);
        "".length();
        this.e.remove((Overlay)this.g);
        "".length();
        this.c.unregister((Object)this.a);
        this.c.unregister((Object)this.b);
    }

    private static void lIIlIIIIIllIIlI() {
        llllIlIIIIII = new String[llllIlIIIIIl[2]];
        SquireAlchemicalHydraPlugin.llllIlIIIIII[SquireAlchemicalHydraPlugin.llllIlIIIIIl[1]] = SquireAlchemicalHydraPlugin.lIIlIIIIIllIIIl("S7LKu6hgl2CzmmN4ZVH5prgkENktZoQ2", "UIUfR");
    }

    @Provides
    SquireAlchemicalHydraConfig a(ConfigManager configManager) {
        return (SquireAlchemicalHydraConfig)configManager.getConfig(SquireAlchemicalHydraConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llllIlIIIIIl[0]];
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[1]] = x.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[2]] = w.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[3]] = s.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[4]] = n.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[5]] = u.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[6]] = v.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[7]] = t.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[8]] = A.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[9]] = B.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[10]] = z.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[11]] = r.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[12]] = o.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[13]] = p.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[14]] = q.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[15]] = y.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[16]] = C.class;
        return classArray;
    }

    public boolean c() {
        return this.h;
    }

    protected void onStart() {
        this.a.h();
        this.a(llllIlIIIIIl[1]);
        this.c.register((Object)this.a);
        this.c.register((Object)this.b);
        this.e.add((Overlay)this.f);
        "".length();
        this.e.add((Overlay)this.g);
        "".length();
    }

    static {
        SquireAlchemicalHydraPlugin.lIIlIIIIIllIIll();
        SquireAlchemicalHydraPlugin.lIIlIIIIIllIIlI();
    }

    public e b() {
        return this.b;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllIIlIlIIllIllIllII;
        if (SquireAlchemicalHydraPlugin.lIIlIIIIIllIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String lllllllllllllllIIlIlIIllIllIlIll = lllllllllllllllIIlIlIIllIllIllII.getMessage();
        if (SquireAlchemicalHydraPlugin.lIIlIIIIIllIlIl(lllllllllllllllIIlIlIIllIllIlIll.contains(llllIlIIIIII[llllIlIIIIIl[1]]) ? 1 : 0)) {
            SquireAlchemicalHydraPlugin lllllllllllllllIIlIlIIllIllIllIl;
            lllllllllllllllIIlIlIIllIllIllIl.a(llllIlIIIIIl[2]);
        }
    }

    private static String lIIlIIIIIllIIIl(String lllllllllllllllIIlIlIIllIllIIIIl, String lllllllllllllllIIlIlIIllIllIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIllIllIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIllIllIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIllIllIIlIl.init(llllIlIIIIIl[3], lllllllllllllllIIlIlIIllIllIIllI);
            return new String(lllllllllllllllIIlIlIIllIllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIllIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIllIllIIlII) {
            lllllllllllllllIIlIlIIllIllIIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIllIIll() {
        llllIlIIIIIl = new int[17];
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[0] = 0x89 ^ 0x99;
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[1] = (0x7C ^ 0x47) & ~(0x42 ^ 0x79);
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[2] = " ".length();
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[3] = "  ".length();
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[4] = "   ".length();
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[5] = 0xED ^ 0xC2 ^ (0xBA ^ 0x91);
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[6] = 0x31 ^ 0x64 ^ (0x2F ^ 0x7F);
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[7] = 0x3C ^ 7 ^ (0xBF ^ 0x82);
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[8] = 78 + 29 - 101 + 163 ^ 142 + 74 - 166 + 124;
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[9] = 111 + 32 - 18 + 27 ^ 51 + 38 - 82 + 137;
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[10] = 0x10 ^ 0x19;
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[11] = 0xAD ^ 0xA7;
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[12] = 0xCC ^ 0xC7;
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[13] = 0x7F ^ 0x4F ^ (0xA6 ^ 0x9A);
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[14] = 0x6D ^ 0x60;
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[15] = 0xCB ^ 0xBB ^ (0x46 ^ 0x38);
        SquireAlchemicalHydraPlugin.llllIlIIIIIl[16] = 0xBF ^ 0xB0;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    private static boolean lIIlIIIIIllIlIl(int n2) {
        return n2 != 0;
    }
}

