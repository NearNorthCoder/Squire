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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.p.n.s.r.a.-.q.e.l.r.e.i.u.b;
import k.p.n.s.r.a.-.q.e.l.r.e.i.u.c;
import k.p.n.s.r.a.-.q.e.l.r.e.i.u.d;
import k.p.n.s.r.a.-.q.e.l.r.e.i.u.e;
import k.p.n.s.r.a.-.q.e.l.r.e.i.u.f;
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
    private static /* synthetic */ long c;
    @Inject
    private /* synthetic */ OverlayManager f;
    public static /* synthetic */ int a;
    public static /* synthetic */ int b;
    private /* synthetic */ Instant h;
    private static /* synthetic */ int[] lllllIlllIIl;
    @Inject
    private /* synthetic */ SquirePlankerConfig e;
    @Inject
    private /* synthetic */ PlankerInfoBox g;
    private static /* synthetic */ String[] lllllIlllIII;
    private final /* synthetic */ Class<?>[] d;

    private static void lIIlIIlllIlIllI() {
        lllllIlllIIl = new int[6];
        SquirePlankerPlugin.lllllIlllIIl[0] = 0x9D ^ 0x98;
        SquirePlankerPlugin.lllllIlllIIl[1] = (0x23 ^ 0x27) & ~(0x19 ^ 0x1D);
        SquirePlankerPlugin.lllllIlllIIl[2] = " ".length();
        SquirePlankerPlugin.lllllIlllIIl[3] = "  ".length();
        SquirePlankerPlugin.lllllIlllIIl[4] = "   ".length();
        SquirePlankerPlugin.lllllIlllIIl[5] = 38 + 57 - -35 + 63 ^ 163 + 58 - 186 + 162;
    }

    private static void lIIlIIlllIlIlIl() {
        lllllIlllIII = new String[lllllIlllIIl[2]];
        SquirePlankerPlugin.lllllIlllIII[SquirePlankerPlugin.lllllIlllIIl[1]] = SquirePlankerPlugin.lIIlIIlllIlIlII("8SUsbBrCVHoLExL1bzc8RzAPYpXYhvFdT8zRzNaLT0id0Tus6FkkEQ==", "TgbxB");
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        boolean bl;
        if (SquirePlankerPlugin.lIIlIIlllIlIlll(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            bl = lllllIlllIIl[2];
            "".length();
            if (((0xF9 ^ 0xA5 ^ (0x58 ^ 0x5F)) & (0xCD ^ 0xAE ^ (0x82 ^ 0xBA) ^ -" ".length())) != 0) {
                return;
            }
        } else {
            bl = lllllIlllIIl[1];
        }
        this.setPaused(bl);
    }

    public static int b() {
        return b;
    }

    private static String lIIlIIlllIlIlII(String lllllllllllllllIIlIlIIIIIlIlIllI, String lllllllllllllllIIlIlIIIIIlIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIIIIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIIIIlIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIIIIlIllIlI.init(lllllIlllIIl[3], lllllllllllllllIIlIlIIIIIlIllIll);
            return new String(lllllllllllllllIIlIlIIIIIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIIIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIIIIlIllIIl) {
            lllllllllllllllIIlIlIIIIIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlllIlIlll(Object object, Object object2) {
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
        "".length();
        System.out.println(lllllIlllIII[lllllIlllIIl[1]]);
        if (SquirePlankerPlugin.lIIlIIlllIlIlll(Game.getState(), GameState.LOGIN_SCREEN)) {
            bl = lllllIlllIIl[2];
            "".length();
            if (null != null) {
                return;
            }
        } else {
            bl = lllllIlllIIl[1];
        }
        this.setPaused(bl);
        this.h = Instant.now();
        InteractionManager.setHelper((boolean)lllllIlllIIl[2]);
    }

    public static int a() {
        return a;
    }

    static {
        SquirePlankerPlugin.lIIlIIlllIlIllI();
        SquirePlankerPlugin.lIIlIIlllIlIlIl();
    }

    public SquirePlankerPlugin() {
        Class[] classArray = new Class[lllllIlllIIl[0]];
        classArray[SquirePlankerPlugin.lllllIlllIIl[1]] = c.class;
        classArray[SquirePlankerPlugin.lllllIlllIIl[2]] = d.class;
        classArray[SquirePlankerPlugin.lllllIlllIIl[3]] = f.class;
        classArray[SquirePlankerPlugin.lllllIlllIIl[4]] = b.class;
        classArray[SquirePlankerPlugin.lllllIlllIIl[5]] = e.class;
        this.d = classArray;
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)lllllIlllIIl[1]);
        this.f.remove((Overlay)this.g);
        "".length();
    }

    public Instant getStarted() {
        return this.h;
    }
}

