package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.cox.SquireChambersConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GameState;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
@Singleton
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/l.class */
public class C0037l {
    private /* synthetic */ boolean bn;
    private static /* synthetic */ int[] lIlIIIlIIlll;
    private static /* synthetic */ String[] lIlIIIlIIIIl;
    private /* synthetic */ int bp;
    private /* synthetic */ boolean bo;
    private /* synthetic */ Actor bm;
    @Inject
    /* synthetic */ SquireChambersConfig k;
    private final /* synthetic */ Map<Integer, Integer> bk = new HashMap();
    private final /* synthetic */ Map<Integer, Integer> bl = new HashMap();

    private static boolean llIlIllIIIIIlI(int i, int i2) {
        return i < i2;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (!llIlIllIIIIIll(gameStateChanged.getGameState(), GameState.CONNECTION_LOST) || llIlIllIIIIlIl(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean aL() {
        if (llIlIllIIIIIlI(this.bk.getOrDefault(Integer.valueOf(lIlIIIlIIlll[0]), Integer.valueOf(lIlIIIlIIlll[1])).intValue(), lIlIIIlIIlll[2]) && llIlIllIIIIIlI(this.bk.getOrDefault(Integer.valueOf(lIlIIIlIIlll[3]), Integer.valueOf(lIlIIIlIIlll[1])).intValue(), lIlIIIlIIlll[2]) && llIlIllIIIIIlI(this.bk.getOrDefault(Integer.valueOf(lIlIIIlIIlll[4]), Integer.valueOf(lIlIIIlIIlll[1])).intValue(), lIlIIIlIIlll[2])) {
            ?? r0 = lIlIIIlIIlll[2];
            "".length();
            return (-(32 ^ 36)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIIlIIlll[1];
    }

    private static void llIlIlIlIllllI() {
        lIlIIIlIIIIl = new String[lIlIIIlIIlll[2]];
        lIlIIIlIIIIl[lIlIIIlIIlll[1]] = llIlIlIlIlllIl("zfN9FJcNUN3BGdnDuNIHmw==", "ymKPY");
    }

    private static boolean llIlIllIIIIlll(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        if (llIlIllIIIIIll(hitsplatApplied.getActor(), this.bm) || llIlIllIIIIlII(hitsplatApplied.getHitsplat().getAmount()) || llIlIllIIIIlII(hitsplatApplied.getHitsplat().isMine() ? 1 : 0) || llIlIllIIIIlII(this.bn ? 1 : 0)) {
            return;
        }
        this.bk.compute(Integer.valueOf(this.bp), num, num2 -> {
            int intValue;
            if (llIlIllIIIIllI(num2)) {
                intValue = lIlIIIlIIlll[2];
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else {
                intValue = num2.intValue() + lIlIIIlIIlll[2];
            }
            return Integer.valueOf(intValue);
        });
        "".length();
        this.bl.compute(Integer.valueOf(this.bp), num3, num4 -> {
            int intValue;
            if (llIlIllIIIIllI(num4)) {
                intValue = hitsplatApplied.getHitsplat().getAmount();
                "".length();
                if ("  ".length() < (((182 ^ 188) ^ (76 ^ 113)) & (((((47 + 12) - 6) + 101) ^ (((12 + 21) - (-35)) + 105)) ^ (-" ".length())))) {
                    return null;
                }
            } else {
                intValue = num4.intValue() + hitsplatApplied.getHitsplat().getAmount();
            }
            return Integer.valueOf(intValue);
        });
        "".length();
    }

    private static void llIlIllIIIIIIl() {
        lIlIIIlIIlll = new int[7];
        lIlIIIlIIlll[0] = (-(((238 + 77) - 99) + 29)) & (-16388) & 30207;
        lIlIIIlIIlll[1] = ((37 ^ 34) ^ (98 ^ 89)) & (((20 ^ 65) ^ (70 ^ 47)) ^ (-" ".length()));
        lIlIIIlIIlll[2] = " ".length();
        lIlIIIlIIlll[3] = (-2257) & 23259;
        lIlIIIlIIlll[4] = (-((-4466) & 20851)) & (-4321) & 32509;
        lIlIIIlIIlll[5] = (-((-53) & 629)) & (-261) & 30717;
        lIlIIIlIIlll[6] = "  ".length();
    }

    private static boolean llIlIllIIIIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIlIllIIIIllI(Object obj) {
        return obj == null;
    }

    private static String llIlIlIlIlllIl(String lllllllllllllllIlllIIIIlIIIlIlll, String lllllllllllllllIlllIIIIlIIIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIlIIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIIIlIIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIIIlIIIllIIl.init(lIlIIIlIIlll[6], secretKeySpec);
            return new String(lllllllllllllllIlllIIIIlIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIIIlIIIllIII) {
            lllllllllllllllIlllIIIIlIIIllIII.printStackTrace();
            return null;
        }
    }

    @Subscribe(priority = 2.1474836E9f)
    public void a(GameObjectDespawned gameObjectDespawned) {
        if (!llIlIllIIIIllI(gameObjectDespawned.getGameObject()) && llIlIllIIIIlll(gameObjectDespawned.getGameObject().getId(), lIlIIIlIIlll[5])) {
            w();
        }
    }

    private static boolean llIlIllIIIIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIlIllIIIIlII(int i) {
        return i == 0;
    }

    @Subscribe(priority = 2.1474836E9f)
    public void a(GameObjectSpawned gameObjectSpawned) {
        if (llIlIllIIIIllI(gameObjectSpawned.getGameObject())) {
            return;
        }
        double lllllllllllllllIlllIIIIlIIlIIlIl = gameObjectSpawned.getGameObject().getId();
        switch (lllllllllllllllIlllIIIIlIIlIIlIl) {
            case 1.47627E-319d:
            case 1.4763E-319d:
                w();
                return;
            default:
                return;
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.bm = Players.getLocal().getInteracting();
        this.bn = this.bo;
        this.bo = Combat.isSpecEnabled();
        this.bp = Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId();
    }

    public void w() {
        System.out.println(lIlIIIlIIIIl[lIlIIIlIIlll[1]]);
        this.bk.clear();
        this.bl.clear();
    }

    static {
        llIlIllIIIIIIl();
        llIlIlIlIllllI();
    }
}
