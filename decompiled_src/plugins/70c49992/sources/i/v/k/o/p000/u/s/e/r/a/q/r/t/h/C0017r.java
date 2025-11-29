package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Handling house", priority = 84, register = true, blocking = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/r.class */
public class C0017r extends AbstractC0014o {
    private static /* synthetic */ String[] lIlIlIllIlIII;
    private /* synthetic */ int bX;
    private static /* synthetic */ int[] lIlIlIllIlIIl;
    private /* synthetic */ boolean bW;

    private static boolean lIlllllllIlIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lIlllllllIlIlII();
        lIlllllllIlIIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (lIlllllllIllIlI(animationChanged.getActor().getAnimation(), lIlIlIllIlIIl[4])) {
            this.bW = lIlIlIllIlIIl[3];
        }
    }

    private static boolean lIlllllllIlIllI(int i2) {
        return i2 != 0;
    }

    private static void lIlllllllIlIIll() {
        lIlIlIllIlIII = new String[lIlIlIllIlIIl[5]];
        lIlIlIllIlIII[lIlIlIllIlIIl[0]] = lIlllllllIlIIIl("nMCYAix0Sw6N3hgnb/K7dQ==", "tjZRl");
        lIlIlIllIlIII[lIlIlIllIlIIl[3]] = lIlllllllIlIIlI("9vlopzA4QsgoEPCZl3EB4g==", "fTMek");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.AbstractC0014o
    public boolean run() {
        if (!lIlllllllIlIlIl(S() ? 1 : 0) || lIlllllllIlIlIl(T().needsToBank() ? 1 : 0)) {
            return lIlIlIllIlIIl[0];
        }
        if (!lIlllllllIlIllI(R() ? 1 : 0) && !lIlllllllIlIlIl(House.isInside() ? 1 : 0)) {
            if (!lIlllllllIlIllI(Players.getLocal().isIdle() ? 1 : 0) || lIlllllllIlIlll(Static.getClient().getGameState(), GameState.LOADING)) {
                return lIlIlIllIlIIl[0];
            }
            if (lIlllllllIlIllI(House.isPoolDrinkUseful() ? 1 : 0)) {
                return House.drinkFromPool();
            }
            if (lIlllllllIllIII(House.getJewelryBox())) {
                return lIlIlIllIlIIl[0];
            }
            if (lIlllllllIlIllI(Widgets.isVisible(Widgets.get(lIlIlIllIlIIl[1], lIlIlIllIlIIl[0])) ? 1 : 0)) {
                Keyboard.type(lIlIlIllIlIIl[2]);
                return lIlIlIllIlIIl[3];
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIlllllllIllIIl(tileObject.getName()) && lIlllllllIlIllI(tileObject.getName().contains(lIlIlIllIlIII[lIlIlIllIlIIl[3]]) ? 1 : 0)) {
                    ?? r0 = lIlIlIllIlIIl[3];
                    "".length();
                    return (-"   ".length()) >= 0 ? ((((116 + 35) - 134) + 117) ^ (((103 + 19) - 109) + 123)) & (((61 ^ 100) ^ (226 ^ 181)) ^ (-" ".length())) : r0;
                }
                return lIlIlIllIlIIl[0];
            });
            if (lIlllllllIllIIl(nearest)) {
                nearest.interact(lIlIlIllIlIII[lIlIlIllIlIIl[0]]);
                return lIlIlIllIlIIl[3];
            }
            return lIlIlIllIlIIl[0];
        }
        return lIlIlIllIlIIl[0];
    }

    private static boolean lIlllllllIllIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlllllllIllIlI(int i2, int i3) {
        return i2 == i3;
    }

    private static String lIlllllllIlIIlI(String llllllllllllllIllIlIlIIIllIlllIl, String llllllllllllllIllIlIlIIIllIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIllIlllII.getBytes(StandardCharsets.UTF_8)), lIlIlIllIlIIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIllIlIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIIIllIllllI) {
            llllllllllllllIllIlIlIIIllIllllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.AbstractC0014o
    public boolean Q() {
        return lIlIlIllIlIIl[0];
    }

    private static String lIlllllllIlIIIl(String llllllllllllllIllIlIlIIIllIIlllI, String llllllllllllllIllIlIlIIIllIIllll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIIIllIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIIIllIlIIlI.init(lIlIlIllIlIIl[5], llllllllllllllIllIlIlIIIllIlIIll);
            return new String(llllllllllllllIllIlIlIIIllIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIIIllIlIIIl) {
            llllllllllllllIllIlIlIIIllIlIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected C0017r(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    private static void lIlllllllIlIlII() {
        lIlIlIllIlIIl = new int[7];
        lIlIlIllIlIIl[0] = (40 ^ 75) & ((96 ^ 3) ^ (-1));
        lIlIlIllIlIIl[1] = (-((-538) & 22171)) & (-8497) & 30719;
        lIlIlIllIlIIl[2] = 172 ^ 159;
        lIlIlIllIlIIl[3] = " ".length();
        lIlIlIllIlIIl[4] = (-((-3593) & 28447)) & (-97) & 32255;
        lIlIlIllIlIIl[5] = "  ".length();
        lIlIlIllIlIIl[6] = 85 ^ 93;
    }

    private static boolean lIlllllllIllIII(Object obj) {
        return obj == null;
    }

    private static boolean lIlllllllIlIlIl(int i2) {
        return i2 == 0;
    }
}
