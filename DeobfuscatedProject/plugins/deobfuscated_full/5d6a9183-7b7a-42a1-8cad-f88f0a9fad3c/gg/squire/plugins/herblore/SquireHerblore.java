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
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.plugins.herblore;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.plugins.herblore.HerbloreConfig;
import gg.squire.plugins.herblore.overlay.HerbloreInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.a;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.f;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.h;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.i;

@PluginDescriptor(name="Squire Herblore", enabledByDefault=false, description="Does Herblore stuff")
public class SquireHerblore
extends SquirePlugin {
    @Inject
    private /* synthetic */ OverlayManager d;
    @Inject
    private /* synthetic */ HerbloreConfig b;
    private final /* synthetic */ Class<?>[] a;
    private static /* synthetic */ String[] lllIlIIIllll;
    private static /* synthetic */ int[] lllIlIIlIIII;
    @Inject
    private /* synthetic */ HerbloreInfoBox c;

    private static void lIIIlIlllIllIIl() {
        lllIlIIlIIII = new int[5];
        SquireHerblore.lllIlIIlIIII[0] = 3;
        SquireHerblore.lllIlIIlIIII[1] = (0x69 ^ 0x7B) & ~(5 ^ 0x17);
        SquireHerblore.lllIlIIlIIII[2] = 1;
        SquireHerblore.lllIlIIlIIII[3] = 2;
        SquireHerblore.lllIlIIlIIII[4] = 0x57 ^ 0xB ^ (0x66 ^ 0x32);
    }

    public SquireHerblore() {
        Class[] classArray = new Class[lllIlIIlIIII[0]];
        classArray[SquireHerblore.lllIlIIlIIII[1]] = h.class;
        classArray[SquireHerblore.lllIlIIlIIII[2]] = f.class;
        classArray[SquireHerblore.lllIlIIlIIII[3]] = i.class;
        this.a = classArray;
    }

    public boolean a() {
        boolean bl;
        if (!SquireHerblore.lIIIlIlllIllIlI((Object)this.b.method(), (Object)r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c.ALL_STAGES) || SquireHerblore.lIIIlIlllIllIll((Object)this.b.method(), (Object)r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c.ALL_STAGES_ALL_HERBS)) {
            bl = lllIlIIlIIII[2];
            0;
            if ((5 ^ 0x2F ^ (0xA2 ^ 0x8D)) == 0) {
                return ((31 + 26 - -19 + 54 ^ 171 + 133 - 134 + 26) & (0x31 ^ 0x28 ^ (0x7D ^ 0x22) ^ -1)) != 0;
            }
        } else {
            bl = lllIlIIlIIII[1];
        }
        return bl;
    }

    protected Class<?>[] tasks() {
        return this.a;
    }

    private static String lIIIlIlllIlIlll(String var2, String var1) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lllIlIIlIIII[4]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lllIlIIlIIII[3], var4);
            return new String(var3.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
        this.getEventBus().post((Object)new a(this.b.method(), this.b.herb(), this.b.potion()));
        this.d.remove((Overlay)this.c);
        0;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        if (SquireHerblore.lIIIlIlllIlllII(configChanged.getGroup().equals(lllIlIIIllll[lllIlIIlIIII[1]]) ? 1 : 0)) {
            return;
        }
        this.getEventBus().post((Object)new a(this.b.method(), this.b.herb(), this.b.potion()));
    }

    protected void onStart() {
        this.getEventBus().post((Object)new a(this.b.method(), this.b.herb(), this.b.potion()));
        this.d.add((Overlay)this.c);
        0;
    }

    private static void lIIIlIlllIllIII() {
        lllIlIIIllll = new String[lllIlIIlIIII[2]];
        SquireHerblore.lllIlIIIllll[SquireHerblore.lllIlIIlIIII[1]] = SquireHerblore."squireherblore";
    }

    private static boolean lIIIlIlllIlllII(int n) {
        return n == 0;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        boolean bl;
        if (SquireHerblore.lIIIlIlllIllIll(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            bl = lllIlIIlIIII[2];
            0;
            if (((153 + 123 - 230 + 165 ^ 102 + 61 - 162 + 146) & (157 + 85 - 92 + 100 ^ 116 + 36 - 75 + 109 ^ -1)) != 0) {
                return;
            }
        } else {
            bl = lllIlIIlIIII[1];
        }
        this.setPaused(bl);
    }

    static {
        SquireHerblore.lIIIlIlllIllIIl();
        SquireHerblore.lIIIlIlllIllIII();
    }

    private static boolean lIIIlIlllIllIll(Object object, Object object2) {
        return object == object2;
    }

    @Provides
    HerbloreConfig a(ConfigManager configManager) {
        return (HerbloreConfig)configManager.getConfig(HerbloreConfig.class);
    }

    private static boolean lIIIlIlllIllIlI(Object object, Object object2) {
        return object != object2;
    }
}

