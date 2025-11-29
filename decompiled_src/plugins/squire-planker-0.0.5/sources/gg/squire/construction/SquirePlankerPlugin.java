package gg.squire.construction;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.construction.overlay.PlankerInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.p.n.s.r.a.p000.q.e.l.r.e.i.u.b;
import k.p.n.s.r.a.p000.q.e.l.r.e.i.u.c;
import k.p.n.s.r.a.p000.q.e.l.r.e.i.u.d;
import k.p.n.s.r.a.p000.q.e.l.r.e.i.u.e;
import k.p.n.s.r.a.p000.q.e.l.r.e.i.u.f;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.managers.interaction.InteractionManager;
@PluginDescriptor(name = "Squire Plank Maker", enabledByDefault = false, description = "Makes Planks.")
/* loaded from: squire-planker-0.0.5.jar:gg/squire/construction/SquirePlankerPlugin.class */
public class SquirePlankerPlugin extends SquirePlugin {
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
        lllllIlllIIl[0] = 157 ^ 152;
        lllllIlllIIl[1] = (35 ^ 39) & ((25 ^ 29) ^ (-1));
        lllllIlllIIl[2] = " ".length();
        lllllIlllIIl[3] = "  ".length();
        lllllIlllIIl[4] = "   ".length();
        lllllIlllIIl[5] = (((38 + 57) - (-35)) + 63) ^ (((163 + 58) - 186) + 162);
    }

    private static void lIIlIIlllIlIlIl() {
        lllllIlllIII = new String[lllllIlllIIl[2]];
        lllllIlllIII[lllllIlllIIl[1]] = lIIlIIlllIlIlII("8SUsbBrCVHoLExL1bzc8RzAPYpXYhvFdT8zRzNaLT0id0Tus6FkkEQ==", "TgbxB");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        boolean z;
        if (lIIlIIlllIlIlll(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            ?? r1 = lllllIlllIIl[2];
            "".length();
            z = r1;
            if ((((249 ^ 165) ^ (88 ^ 95)) & (((205 ^ 174) ^ (130 ^ 186)) ^ (-" ".length()))) != 0) {
                return;
            }
        } else {
            z = lllllIlllIIl[1];
        }
        setPaused(z);
    }

    public static int b() {
        return b;
    }

    private static String lIIlIIlllIlIlII(String lllllllllllllllIIlIlIIIIIlIllIII, String lllllllllllllllIIlIlIIIIIlIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllIlllIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIIIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlIIIIIlIllIIl) {
            lllllllllllllllIIlIlIIIIIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlllIlIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static long c() {
        return c;
    }

    protected Class<?>[] tasks() {
        return this.d;
    }

    @Provides
    SquirePlankerConfig a(ConfigManager configManager) {
        return (SquirePlankerConfig) configManager.getConfig(SquirePlankerConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v9 */
    protected void onStart() {
        boolean z;
        this.f.add(this.g);
        "".length();
        System.out.println(lllllIlllIII[lllllIlllIIl[1]]);
        if (lIIlIIlllIlIlll(Game.getState(), GameState.LOGIN_SCREEN)) {
            ?? r1 = lllllIlllIIl[2];
            "".length();
            z = r1;
            if (0 != 0) {
                return;
            }
        } else {
            z = lllllIlllIIl[1];
        }
        setPaused(z);
        this.h = Instant.now();
        InteractionManager.setHelper((boolean) lllllIlllIIl[2]);
    }

    public static int a() {
        return a;
    }

    static {
        lIIlIIlllIlIllI();
        lIIlIIlllIlIlIl();
    }

    public SquirePlankerPlugin() {
        Class<?>[] clsArr = new Class[lllllIlllIIl[0]];
        clsArr[lllllIlllIIl[1]] = c.class;
        clsArr[lllllIlllIIl[2]] = d.class;
        clsArr[lllllIlllIIl[3]] = f.class;
        clsArr[lllllIlllIIl[4]] = b.class;
        clsArr[lllllIlllIIl[5]] = e.class;
        this.d = clsArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    protected void onStop() {
        InteractionManager.setHelper((boolean) lllllIlllIIl[1]);
        this.f.remove(this.g);
        "".length();
    }

    public Instant getStarted() {
        return this.h;
    }
}
