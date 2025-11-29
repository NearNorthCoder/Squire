/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.GameState
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

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
public class l_Unknown {
    private /* synthetic */ boolean bn;
    private final /* synthetic */ Map<Integer, Integer> bk;
    private static /* synthetic */ int[] lIlIIIlIIlll;
    private static /* synthetic */ String[] lIlIIIlIIIIl;
    private final /* synthetic */ Map<Integer, Integer> bl;
    private /* synthetic */ int bp;
    private /* synthetic */ boolean bo;
    private /* synthetic */ Actor bm;
    @Inject
    /* synthetic */ SquireChambersConfig k;

    private static boolean llIlIllIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (!l.llIlIllIIIIIll(gameStateChanged.getGameState(), GameState.CONNECTION_LOST) || l.llIlIllIIIIlIl(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            l var10;
            var10.w();
        }
    }

    public boolean aL() {
        int n2;
        if (l.llIlIllIIIIIlI(this.bk.getOrDefault(lIlIIIlIIlll[0], lIlIIIlIIlll[1]), lIlIIIlIIlll[2]) && l.llIlIllIIIIIlI(this.bk.getOrDefault(lIlIIIlIIlll[3], lIlIIIlIIlll[1]), lIlIIIlIIlll[2]) && l.llIlIllIIIIIlI(this.bk.getOrDefault(lIlIIIlIIlll[4], lIlIIIlIIlll[1]), lIlIIIlIIlll[2])) {
            n2 = lIlIIIlIIlll[2];
            0;
            if (-(0x20 ^ 0x24) > 0) {
                return false;
            }
        } else {
            n2 = lIlIIIlIIlll[1];
        }
        return n2 != 0;
    }

    private static void llIlIlIlIllllI() {
        lIlIIIlIIIIl = new String[lIlIIIlIIlll[2]];
        l.lIlIIIlIIIIl[l.lIlIIIlIIlll[1]] = l."resetting specs";
    }

    private static boolean llIlIllIIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        l var7;
        void var2;
        if (l.llIlIllIIIIIll(hitsplatApplied.getActor(), this.bm)) {
            return;
        }
        if (l.llIlIllIIIIlII(var2.getHitsplat().getAmount())) {
            return;
        }
        if (l.llIlIllIIIIlII(var2.getHitsplat().isMine() ? 1 : 0)) {
            return;
        }
        if (l.llIlIllIIIIlII(var7.bn ? 1 : 0)) {
            return;
        }
        this.bk.compute(this.bp, (n2, n3) -> {
            int n4;
            if (l.llIlIllIIIIllI(n3)) {
                n4 = lIlIIIlIIlll[2];
                0;
                
                }
            } else {
                void var4;
                n4 = var4.intValue() + lIlIIIlIIlll[2];
            }
            return n4;
        });
        0;
        this.bl.compute(this.bp, (n2, n3) -> {
            int n4;
            if (l.llIlIllIIIIllI(n3)) {
                n4 = hitsplatApplied.getHitsplat().getAmount();
                0;
                if (2 < ((0xB6 ^ 0xBC ^ (0x4C ^ 0x71)) & (47 + 12 - 6 + 101 ^ 12 + 21 - -35 + 105 ^ -1))) {
                    return null;
                }
            } else {
                HitsplatApplied var8;
                void var6;
                n4 = var6.intValue() + var8.getHitsplat().getAmount();
            }
            return n4;
        });
        0;
    }

    private static void llIlIllIIIIIIl() {
        lIlIIIlIIlll = new int[7];
        l.lIlIIIlIIlll[0] = -(238 + 77 - 99 + 29) & (0xFFFFBFFC & 0x75FF);
        l.lIlIIIlIIlll[1] = (0x25 ^ 0x22 ^ (0x62 ^ 0x59)) & (0x14 ^ 0x41 ^ (0x46 ^ 0x2F) ^ -1);
        l.lIlIIIlIIlll[2] = 1;
        l.lIlIIIlIIlll[3] = 0xFFFFF72F & 0x5ADB;
        l.lIlIIIlIIlll[4] = -(0xFFFFEE8E & 0x5173) & (0xFFFFEF1F & 0x7EFD);
        l.lIlIIIlIIlll[5] = -(0xFFFFFFCB & 0x275) & (0xFFFFFEFB & 0x77FD);
        l.lIlIIIlIIlll[6] = 2;
    }

    private static boolean llIlIllIIIIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlIllIIIIllI(Object object) {
        return object == null;
    }

    private static String llIlIlIlIlllIl(String var11, String var15) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIIIlIIlll[6], var16);
            return new String(var1.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(GameObjectDespawned gameObjectDespawned) {
        void var9;
        if (l.llIlIllIIIIllI(gameObjectDespawned.getGameObject())) {
            return;
        }
        int var14 = var9.getGameObject().getId();
        if (l.llIlIllIIIIlll(var14, lIlIIIlIIlll[5])) {
            l var12;
            var12.w();
        }
    }

    public l() {
        this.bk = new HashMap<Integer, Integer>();
        this.bl = new HashMap<Integer, Integer>();
    }

    private static boolean llIlIllIIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIllIIIIlII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var3;
        if (l.llIlIllIIIIllI(gameObjectSpawned.getGameObject())) {
            return;
        }
        int var13 = var3.getGameObject().getId();
        switch (var13) {
            case 29880: 
            case 29881: {
                l var5;
                var5.w();
            }
        }
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.bm = Players.getLocal().getInteracting();
        this.bn = this.bo;
        this.bo = Combat.isSpecEnabled();
        this.bp = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON).getId();
    }

    public void w() {
        System.out.println(lIlIIIlIIIIl[lIlIIIlIIlll[1]]);
        this.bk.clear();
        this.bl.clear();
    }

    static {
        l.llIlIllIIIIIIl();
        l.llIlIlIlIllllI();
    }
}

