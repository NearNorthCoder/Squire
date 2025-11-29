package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import gg.squire.corp.SquireCorpConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
@Singleton
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.s  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/s.class */
public class s {
    private /* synthetic */ boolean A;
    private /* synthetic */ int C;
    private static /* synthetic */ int[] lIlIlllIlIII;
    private /* synthetic */ Actor z;
    private /* synthetic */ boolean B;
    private static /* synthetic */ String[] lIlIlllIIlll;
    @Inject
    /* synthetic */ SquireCorpConfig o;
    private final /* synthetic */ Map<Integer, Integer> x = new HashMap();
    private final /* synthetic */ Map<Integer, Integer> y = new HashMap();

    public int r() {
        return this.x.getOrDefault(Integer.valueOf(lIlIlllIlIII[0]), Integer.valueOf(lIlIlllIlIII[1])).intValue();
    }

    private static String lllIIIIllIIIll(String lllllllllllllllIllIIlIIIIIlllIlI, String lllllllllllllllIllIIlIIIIIlllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIIIIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlllIlIII[11], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIIIIlllIll) {
            lllllllllllllllIllIIlIIIIIlllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIllIIllI(int i, int i2) {
        return i < i2;
    }

    @Subscribe
    public void a(ActorDeath actorDeath) {
        if (lllIIIIllIlIll(actorDeath.getActor().getName().equals(lIlIlllIIlll[lIlIlllIlIII[11]]) ? 1 : 0)) {
            return;
        }
        this.x.clear();
        this.y.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean p() {
        if (lllIIIIllIIllI(this.y.getOrDefault(Integer.valueOf(lIlIlllIlIII[7]), Integer.valueOf(lIlIlllIlIII[1])).intValue(), lIlIlllIlIII[8])) {
            ?? r0 = lIlIlllIlIII[3];
            "".length();
            return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlllIlIII[1];
    }

    private static boolean lllIIIIllIlIIl(int i) {
        return i != 0;
    }

    static {
        lllIIIIllIIlIl();
        lllIIIIllIIlII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean n() {
        if (lllIIIIllIIllI(this.x.getOrDefault(Integer.valueOf(lIlIlllIlIII[0]), Integer.valueOf(lIlIlllIlIII[1])).intValue(), lIlIlllIlIII[2])) {
            ?? r0 = lIlIlllIlIII[3];
            "".length();
            return (-(0 ^ 4)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlllIlIII[1];
    }

    public int q() {
        return this.y.getOrDefault(Integer.valueOf(lIlIlllIlIII[7]), Integer.valueOf(lIlIlllIlIII[1])).intValue();
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        if (lllIIIIllIlIlI(hitsplatApplied.getActor(), this.z) || lllIIIIllIlIll(hitsplatApplied.getHitsplat().getAmount()) || lllIIIIllIlIll(hitsplatApplied.getHitsplat().isMine() ? 1 : 0) || lllIIIIllIlIll(this.A ? 1 : 0)) {
            return;
        }
        this.x.compute(Integer.valueOf(this.C), num, num2 -> {
            int intValue;
            if (lllIIIIllIllIl(num2)) {
                intValue = lIlIlllIlIII[3];
                "".length();
                if ((-(157 ^ 153)) > 0) {
                    return null;
                }
            } else {
                intValue = num2.intValue() + lIlIlllIlIII[3];
            }
            return Integer.valueOf(intValue);
        });
        "".length();
        this.y.compute(Integer.valueOf(this.C), num3, num4 -> {
            int intValue;
            if (lllIIIIllIllIl(num4)) {
                intValue = hitsplatApplied.getHitsplat().getAmount();
                "".length();
                if (0 != 0) {
                    return null;
                }
            } else {
                intValue = num4.intValue() + hitsplatApplied.getHitsplat().getAmount();
            }
            return Integer.valueOf(intValue);
        });
        "".length();
    }

    private static void lllIIIIllIIlII() {
        lIlIlllIIlll = new String[lIlIlllIlIII[12]];
        lIlIlllIIlll[lIlIlllIlIII[1]] = lllIIIIllIIIlI("FHZB+Qw6CKLIqvbhj939lQ==", "BNMpe");
        lIlIlllIIlll[lIlIlllIlIII[3]] = lllIIIIllIIIll("GbLJ7874zPFRvSIzE55wtw==", "vYQgS");
        lIlIlllIIlll[lIlIlllIlIII[11]] = lllIIIIllIIIll("ZcR9+7+bY683YhuD9Xs7+A==", "HiYSW");
    }

    private static boolean lllIIIIllIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllIIIIllIllIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean o() {
        if (lllIIIIllIIllI(this.x.getOrDefault(Integer.valueOf(lIlIlllIlIII[4]), Integer.valueOf(lIlIlllIlIII[1])).intValue() + this.x.getOrDefault(Integer.valueOf(lIlIlllIlIII[5]), Integer.valueOf(lIlIlllIlIII[1])).intValue(), lIlIlllIlIII[6])) {
            ?? r0 = lIlIlllIlIII[3];
            "".length();
            return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlllIlIII[1];
    }

    public void v() {
        this.x.clear();
        this.y.clear();
    }

    private static String lllIIIIllIIIlI(String lllllllllllllllIllIIlIIIIlIIIlll, String lllllllllllllllIllIIlIIIIlIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIIIIlIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), lIlIlllIlIII[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlllIlIII[11], lllllllllllllllIllIIlIIIIlIIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIIIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIIIIlIIlIII) {
            lllllllllllllllIllIIlIIIIlIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIllIlIII(int i) {
        return i > 0;
    }

    public int u() {
        String[] strArr = new String[lIlIlllIlIII[3]];
        strArr[lIlIlllIlIII[1]] = lIlIlllIIlll[lIlIlllIlIII[3]];
        NPC nearest = NPCs.getNearest(strArr);
        return (lllIIIIllIIlll(nearest) && lllIIIIllIIllI(nearest.getHealthRatio(), lIlIlllIlIII[9]) && lllIIIIllIlIII(nearest.getHealthRatio())) ? lIlIlllIlIII[10] : lllIIIIllIlIIl(n() ? 1 : 0) ? lIlIlllIlIII[0] : lllIIIIllIlIIl(o() ? 1 : 0) ? lIlIlllIlIII[4] : lllIIIIllIlIIl(p() ? 1 : 0) ? lIlIlllIlIII[7] : lIlIlllIlIII[10];
    }

    private static boolean lllIIIIllIIlll(Object obj) {
        return obj != null;
    }

    private static void lllIIIIllIIlIl() {
        lIlIlllIlIII = new int[14];
        lIlIlllIlIII[0] = (-((-12806) & 31479)) & (-515) & 32763;
        lIlIlllIlIII[1] = (9 ^ 28) & ((0 ^ 21) ^ (-1));
        lIlIlllIlIII[2] = (((91 + 185) - 175) + 89) ^ (((141 + 59) - 98) + 84);
        lIlIlllIlIII[3] = " ".length();
        lIlIlllIlIII[4] = (-((-16461) & 25421)) & (-4129) & 32763;
        lIlIlllIlIII[5] = (-((-20618) & 29871)) & (-1) & 15999;
        lIlIlllIlIII[6] = 118 ^ 113;
        lIlIlllIlIII[7] = (-4323) & 16126;
        lIlIlllIlIII[8] = (-22574) & 22973;
        lIlIlllIlIII[9] = (((194 ^ 128) + ((22 ^ 15) & ((66 ^ 91) ^ (-1)))) - (-(113 ^ 124))) + (21 ^ 82);
        lIlIlllIlIII[10] = -" ".length();
        lIlIlllIlIII[11] = "  ".length();
        lIlIlllIlIII[12] = "   ".length();
        lIlIlllIlIII[13] = 86 ^ 94;
    }

    public EquipmentSetup t() {
        String[] strArr = new String[lIlIlllIlIII[3]];
        strArr[lIlIlllIlIII[1]] = lIlIlllIIlll[lIlIlllIlIII[1]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lllIIIIllIIlll(nearest) && lllIIIIllIIllI(nearest.getHealthRatio(), lIlIlllIlIII[9]) && lllIIIIllIlIII(nearest.getHealthRatio())) {
            return null;
        }
        if (lllIIIIllIlIIl(n() ? 1 : 0)) {
            return (EquipmentSetup) this.o.dwhLoadout().selected(EquipmentSetup.class);
        }
        if (lllIIIIllIlIIl(o() ? 1 : 0)) {
            return (EquipmentSetup) this.o.arcLightLoadout().selected(EquipmentSetup.class);
        }
        if (lllIIIIllIlIIl(p() ? 1 : 0)) {
            return (EquipmentSetup) this.o.bgsLoadout().selected(EquipmentSetup.class);
        }
        return null;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.z = Players.getLocal().getInteracting();
        this.A = this.B;
        this.B = Combat.isSpecEnabled();
        this.C = Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId();
    }

    private static boolean lllIIIIllIlIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    public int s() {
        return this.x.getOrDefault(Integer.valueOf(lIlIlllIlIII[4]), Integer.valueOf(lIlIlllIlIII[1])).intValue() + this.x.getOrDefault(Integer.valueOf(lIlIlllIlIII[5]), Integer.valueOf(lIlIlllIlIII[1])).intValue();
    }

    private static boolean lllIIIIllIlIll(int i) {
        return i == 0;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (!lllIIIIllIlIlI(gameStateChanged.getGameState(), GameState.CONNECTION_LOST) || lllIIIIllIllII(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            v();
        }
    }
}
