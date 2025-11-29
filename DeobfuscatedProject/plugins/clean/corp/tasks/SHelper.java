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
package gg.squire.corp.tasks;

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
public class SHelper {
    private  boolean A;
    private  int C;
    
    private final  Map<Integer, Integer> y;
    private  Actor z;
    private  boolean B;
    
    private final  Map<Integer, Integer> x;
    @Inject
     SquireCorpConfig o;

    public int r() {
        return this.x.getOrDefault(lIlIlllIlIII[0], lIlIlllIlIII[1]);
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
        void var2;
        if (s.lllIIIIllIlIlI(hitsplatApplied.getActor(), this.z)) {
            return;
        }
        if (s.lllIIIIllIlIll(var2.getHitsplat().getAmount())) {
            return;
        }
        if (s.lllIIIIllIlIll(var2.getHitsplat().isMine() ? 1 : 0)) {
            return;
        }
        if (s.lllIIIIllIlIll(var1.A ? 1 : 0)) {
            return;
        }
        this.x.compute(this.C, (n2, n3) -> {
            int n4;
            if (s.lllIIIIllIllIl(n3)) {
                n4 = lIlIlllIlIII[3];

                if (-(0x9D ^ 0x99) > 0) {
                    return null;
                }
            } else {
                void var3;
                n4 = var3.intValue() + lIlIlllIlIII[3];
            }
            return n4;
        });

        this.y.compute(this.C, (n2, n3) -> {
            int n4;
            if (s.lllIIIIllIllIl(n3)) {
                n4 = hitsplatApplied.getHitsplat().getAmount();

                }
            } else {
                HitsplatApplied var4;
                void var5;
                n4 = var5.intValue() + var4.getHitsplat().getAmount();
            }
            return n4;
        });

    }

    private static void lllIIIIllIIlII() {
        lIlIlllIIlll = new String[lIlIlllIlIII[12]];
        s.lIlIlllIIlll[s.lIlIlllIlIII[1]] = "Corporeal Beast";
        s.lIlIlllIIlll[s.lIlIlllIlIII[3]] = "Corporeal Beast";
        s.lIlIlllIIlll[s.lIlIlllIlIII[11]] = "Corporeal Beast";
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

            if (1 != 1) {
                return false;
            }
        } else {
            bl = lIlIlllIlIII[1];
        }
        return bl;
    }

    public SHelper() {
        this.x = new HashMap<Integer, Integer>();
        this.y = new HashMap<Integer, Integer>();
    }

    public void v() {
        this.x.clear();
        this.y.clear();
    }

    private static boolean lllIIIIllIlIII(int n2) {
        return n2 > 0;
    }

    public int u() {
        s var6;
        String[] stringArray = new String[lIlIlllIlIII[3]];
        stringArray[s.lIlIlllIlIII[1]] = lIlIlllIIlll[lIlIlllIlIII[3]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (s.lllIIIIllIIlll(nPC) && s.lllIIIIllIIllI(nPC.getHealthRatio(), lIlIlllIlIII[9]) && s.lllIIIIllIlIII(nPC.getHealthRatio())) {
            return lIlIlllIlIII[10];
        }
        if (s.lllIIIIllIlIIl(var6.n() ? 1 : 0)) {
            return lIlIlllIlIII[0];
        }
        if (s.lllIIIIllIlIIl(var6.o() ? 1 : 0)) {
            return lIlIlllIlIII[4];
        }
        if (s.lllIIIIllIlIIl(var6.p() ? 1 : 0)) {
            return lIlIlllIlIII[7];
        }
        return lIlIlllIlIII[10];
    }

    private static boolean lllIIIIllIIlll(Object object) {
        return object != null;
    }

    public EquipmentSetup t() {
        s var7;
        String[] stringArray = new String[lIlIlllIlIII[3]];
        stringArray[s.lIlIlllIlIII[1]] = lIlIlllIIlll[lIlIlllIlIII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (s.lllIIIIllIIlll(nPC) && s.lllIIIIllIIllI(nPC.getHealthRatio(), lIlIlllIlIII[9]) && s.lllIIIIllIlIII(nPC.getHealthRatio())) {
            return null;
        }
        if (s.lllIIIIllIlIIl(var7.n() ? 1 : 0)) {
            return (EquipmentSetup)var7.o.dwhLoadout().selected(EquipmentSetup.class);
        }
        if (s.lllIIIIllIlIIl(var7.o() ? 1 : 0)) {
            return (EquipmentSetup)var7.o.arcLightLoadout().selected(EquipmentSetup.class);
        }
        if (s.lllIIIIllIlIIl(var7.p() ? 1 : 0)) {
            return (EquipmentSetup)var7.o.bgsLoadout().selected(EquipmentSetup.class);
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

    public int SHelper() {
        return this.x.getOrDefault(lIlIlllIlIII[4], lIlIlllIlIII[1]) + this.x.getOrDefault(lIlIlllIlIII[5], lIlIlllIlIII[1]);
    }

    private static boolean lllIIIIllIlIll(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (!s.lllIIIIllIlIlI(gameStateChanged.getGameState(), GameState.CONNECTION_LOST) || s.lllIIIIllIllII(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            s var8;
            var8.v();
        }
    }
}

