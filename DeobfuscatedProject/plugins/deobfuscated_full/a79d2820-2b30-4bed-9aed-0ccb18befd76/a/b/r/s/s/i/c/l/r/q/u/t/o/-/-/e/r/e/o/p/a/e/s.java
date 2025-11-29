/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.GameState
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ActorDeath
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

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
public class s {
    private /* synthetic */ boolean A;
    private /* synthetic */ int C;
    private static /* synthetic */ int[] lIlIlllIlIII;
    private final /* synthetic */ Map<Integer, Integer> y;
    private /* synthetic */ Actor z;
    private /* synthetic */ boolean B;
    private static /* synthetic */ String[] lIlIlllIIlll;
    private final /* synthetic */ Map<Integer, Integer> x;
    @Inject
    /* synthetic */ SquireCorpConfig o;

    public int r() {
        return this.x.getOrDefault(lIlIlllIlIII[0], lIlIlllIlIII[1]);
    }

    private static String lllIIIIllIIIll(String var18, String var9) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlIlllIlIII[11], var13);
            return new String(var7.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void a(ActorDeath actorDeath) {
        if (s.lllIIIIllIlIll(actorDeath.getActor().getName().equals(lIlIlllIIlll[lIlIlllIlIII[11]]) ? 1 : 0)) {
            return;
        }
        this.x.clear();
        this.y.clear();
    }

    public boolean p() {
        boolean bl;
        if (s.lllIIIIllIIllI(this.y.getOrDefault(lIlIlllIlIII[7], lIlIlllIlIII[1]), lIlIlllIlIII[8])) {
            bl = lIlIlllIlIII[3];
            0;
            if (-1 >= 0) {
                return false;
            }
        } else {
            bl = lIlIlllIlIII[1];
        }
        return bl;
    }

    private static boolean lllIIIIllIlIIl(int n2) {
        return n2 != 0;
    }

    static {
        s.lllIIIIllIIlIl();
        s.lllIIIIllIIlII();
    }

    public boolean n() {
        boolean bl;
        if (s.lllIIIIllIIllI(this.x.getOrDefault(lIlIlllIlIII[0], lIlIlllIlIII[1]), lIlIlllIlIII[2])) {
            bl = lIlIlllIlIII[3];
            0;
            if (-(0 ^ 4) >= 0) {
                return false;
            }
        } else {
            bl = lIlIlllIlIII[1];
        }
        return bl;
    }

    public int q() {
        return this.y.getOrDefault(lIlIlllIlIII[7], lIlIlllIlIII[1]);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        s var1;
        void var6;
        if (s.lllIIIIllIlIlI(hitsplatApplied.getActor(), this.z)) {
            return;
        }
        if (s.lllIIIIllIlIll(var6.getHitsplat().getAmount())) {
            return;
        }
        if (s.lllIIIIllIlIll(var6.getHitsplat().isMine() ? 1 : 0)) {
            return;
        }
        if (s.lllIIIIllIlIll(var1.A ? 1 : 0)) {
            return;
        }
        this.x.compute(this.C, (n2, n3) -> {
            int n4;
            if (s.lllIIIIllIllIl(n3)) {
                n4 = lIlIlllIlIII[3];
                0;
                if (-(0x9D ^ 0x99) > 0) {
                    return null;
                }
            } else {
                void var12;
                n4 = var12.intValue() + lIlIlllIlIII[3];
            }
            return n4;
        });
        0;
        this.y.compute(this.C, (n2, n3) -> {
            int n4;
            if (s.lllIIIIllIllIl(n3)) {
                n4 = hitsplatApplied.getHitsplat().getAmount();
                0;
                
                }
            } else {
                HitsplatApplied var2;
                void var3;
                n4 = var3.intValue() + var2.getHitsplat().getAmount();
            }
            return n4;
        });
        0;
    }

    private static void lllIIIIllIIlII() {
        lIlIlllIIlll = new String[lIlIlllIlIII[12]];
        s.lIlIlllIIlll[s.lIlIlllIlIII[1]] = s."Corporeal Beast";
        s.lIlIlllIIlll[s.lIlIlllIlIII[3]] = s."Corporeal Beast";
        s.lIlIlllIIlll[s.lIlIlllIlIII[11]] = s."Corporeal Beast";
    }

    private static boolean lllIIIIllIllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIIIIllIllIl(Object object) {
        return object == null;
    }

    public boolean o() {
        boolean bl;
        if (s.lllIIIIllIIllI(this.x.getOrDefault(lIlIlllIlIII[4], lIlIlllIlIII[1]) + this.x.getOrDefault(lIlIlllIlIII[5], lIlIlllIlIII[1]), lIlIlllIlIII[6])) {
            bl = lIlIlllIlIII[3];
            0;
            if (1 != 1) {
                return false;
            }
        } else {
            bl = lIlIlllIlIII[1];
        }
        return bl;
    }

    public s() {
        this.x = new HashMap<Integer, Integer>();
        this.y = new HashMap<Integer, Integer>();
    }

    public void v() {
        this.x.clear();
        this.y.clear();
    }

    private static String lllIIIIllIIIlI(String var4, String var17) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIlIlllIlIII[13]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIlIlllIlIII[11], var16);
            return new String(var14.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIllIlIII(int n2) {
        return n2 > 0;
    }

    public int u() {
        s var11;
        String[] stringArray = new String[lIlIlllIlIII[3]];
        stringArray[s.lIlIlllIlIII[1]] = lIlIlllIIlll[lIlIlllIlIII[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (s.lllIIIIllIIlll(nPC) && s.lllIIIIllIIllI(nPC.getHealthRatio(), lIlIlllIlIII[9]) && s.lllIIIIllIlIII(nPC.getHealthRatio())) {
            return lIlIlllIlIII[10];
        }
        if (s.lllIIIIllIlIIl(var11.n() ? 1 : 0)) {
            return lIlIlllIlIII[0];
        }
        if (s.lllIIIIllIlIIl(var11.o() ? 1 : 0)) {
            return lIlIlllIlIII[4];
        }
        if (s.lllIIIIllIlIIl(var11.p() ? 1 : 0)) {
            return lIlIlllIlIII[7];
        }
        return lIlIlllIlIII[10];
    }

    private static boolean lllIIIIllIIlll(Object object) {
        return object != null;
    }

    private static void lllIIIIllIIlIl() {
        lIlIlllIlIII = new int[14];
        s.lIlIlllIlIII[0] = -(0xFFFFCDFA & 0x7AF7) & (0xFFFFFDFD & 0x7FFB);
        s.lIlIlllIlIII[1] = (9 ^ 0x1C) & ~(0 ^ 0x15);
        s.lIlIlllIlIII[2] = 91 + 185 - 175 + 89 ^ 141 + 59 - 98 + 84;
        s.lIlIlllIlIII[3] = 1;
        s.lIlIlllIlIII[4] = -(0xFFFFBFB3 & 0x634D) & (0xFFFFEFDF & 0x7FFB);
        s.lIlIlllIlIII[5] = -(0xFFFFAF76 & 0x74AF) & (0xFFFFFFFF & 0x3E7F);
        s.lIlIlllIlIII[6] = 0x76 ^ 0x71;
        s.lIlIlllIlIII[7] = 0xFFFFEF1D & 0x3EFE;
        s.lIlIlllIlIII[8] = 0xFFFFA7D2 & 0x59BD;
        s.lIlIlllIlIII[9] = (0xC2 ^ 0x80) + ((0x16 ^ 0xF) & ~(0x42 ^ 0x5B)) - -(0x71 ^ 0x7C) + (0x15 ^ 0x52);
        s.lIlIlllIlIII[10] = -1;
        s.lIlIlllIlIII[11] = 2;
        s.lIlIlllIlIII[12] = 3;
        s.lIlIlllIlIII[13] = 0x56 ^ 0x5E;
    }

    public EquipmentSetup t() {
        s var8;
        String[] stringArray = new String[lIlIlllIlIII[3]];
        stringArray[s.lIlIlllIlIII[1]] = lIlIlllIIlll[lIlIlllIlIII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (s.lllIIIIllIIlll(nPC) && s.lllIIIIllIIllI(nPC.getHealthRatio(), lIlIlllIlIII[9]) && s.lllIIIIllIlIII(nPC.getHealthRatio())) {
            return null;
        }
        if (s.lllIIIIllIlIIl(var8.n() ? 1 : 0)) {
            return (EquipmentSetup)var8.o.dwhLoadout().selected(EquipmentSetup.class);
        }
        if (s.lllIIIIllIlIIl(var8.o() ? 1 : 0)) {
            return (EquipmentSetup)var8.o.arcLightLoadout().selected(EquipmentSetup.class);
        }
        if (s.lllIIIIllIlIIl(var8.p() ? 1 : 0)) {
            return (EquipmentSetup)var8.o.bgsLoadout().selected(EquipmentSetup.class);
        }
        return null;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.z = Players.getLocal().getInteracting();
        this.A = this.B;
        this.B = Combat.isSpecEnabled();
        this.C = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId();
    }

    private static boolean lllIIIIllIlIlI(Object object, Object object2) {
        return object != object2;
    }

    public int s() {
        return this.x.getOrDefault(lIlIlllIlIII[4], lIlIlllIlIII[1]) + this.x.getOrDefault(lIlIlllIlIII[5], lIlIlllIlIII[1]);
    }

    private static boolean lllIIIIllIlIll(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (!s.lllIIIIllIlIlI(gameStateChanged.getGameState(), GameState.CONNECTION_LOST) || s.lllIIIIllIllII(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            s var5;
            var5.v();
        }
    }
}

