/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.a;
import a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.s;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Attacking corporeal beast")
@Singleton
public class h
extends a {
    private static /* synthetic */ String[] lIlIlllllIIl;
    @Inject
    private /* synthetic */ SquireCorp p;
    @Inject
    private /* synthetic */ s a;
    private static /* synthetic */ int[] lIlIlllllIlI;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        h lllllllllllllllIllIIIllIlIlIIIlI;
        if (h.lllIIIlIllIIII(this.a.u(), lIlIlllllIlI[0])) {
            return lIlIlllllIlI[1];
        }
        NPC lllllllllllllllIllIIIllIlIlIIIIl = lllllllllllllllIllIIIllIlIlIIIlI.f();
        if (!h.lllIIIlIllIIIl(lllllllllllllllIllIIIllIlIlIIIIl) || !h.lllIIIlIllIIlI(Reachable.isInteractable((Locatable)lllllllllllllllIllIIIllIlIlIIIIl) ? 1 : 0) || h.lllIIIlIllIIlI(lllllllllllllllIllIIIllIlIlIIIIl.isDead() ? 1 : 0)) {
            return lIlIlllllIlI[1];
        }
        Player lllllllllllllllIllIIIllIlIlIIIII = Players.getNearest(player -> {
            int n2;
            if (h.lllIIIlIlllIII(player, Players.getLocal()) && h.lllIIIlIllIllI(player.getInteracting(), lllllllllllllllIllIIIllIlIlIIIIl) && h.lllIIIlIllIlIl(player.isFriend() ? 1 : 0)) {
                n2 = lIlIlllllIlI[2];
                0;
                if (1 >= 2) {
                    return ((0xC5 ^ 0xAC ^ (0x25 ^ 0x48)) & (0x12 ^ 0x75 ^ (0x10 ^ 0x73) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlllllIlI[1];
            }
            return n2 != 0;
        });
        if (h.lllIIIlIllIIIl(lllllllllllllllIllIIIllIlIlIIIII)) {
            lllllllllllllllIllIIIllIlIlIIIlI.p.c(lIlIlllllIlI[2]);
            return lIlIlllllIlI[1];
        }
        if (h.lllIIIlIllIIll(Combat.getCurrentHealth(), lIlIlllllIlI[3])) {
            TeleportLoader.enterHouse();
            0;
            return lIlIlllllIlI[1];
        }
        if (h.lllIIIlIllIlII(Combat.getSpecEnergy(), lIlIlllllIlI[4]) && h.lllIIIlIllIIlI(lllllllllllllllIllIIIllIlIlIIIlI.a(lllllllllllllllIllIIIllIlIlIIIIl) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlllllIlI[2]];
            stringArray[h.lIlIlllllIlI[1]] = lIlIlllllIIl[lIlIlllllIlI[1]];
            Item lllllllllllllllIllIIIllIlIIlllll = Inventory.getFirst((String[])stringArray);
            if (h.lllIIIlIllIIIl(lllllllllllllllIllIIIllIlIIlllll)) {
                lllllllllllllllIllIIIllIlIIlllll.interact(lIlIlllllIIl[lIlIlllllIlI[2]]);
            }
            if (h.lllIIIlIllIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                Combat.toggleSpec();
            }
            0;
            if (3 >= (157 + 48 - 44 + 6 ^ 15 + 110 - 120 + 158)) {
                return ((43 + 81 - 30 + 140 ^ 68 + 3 - -97 + 21) & (94 + 154 - 220 + 185 ^ 97 + 62 - 34 + 5 ^ -1)) != 0;
            }
        } else if (h.lllIIIlIllIlII(Combat.getSpecEnergy(), lIlIlllllIlI[5]) && h.lllIIIlIllIlIl(lllllllllllllllIllIIIllIlIlIIIlI.a(lllllllllllllllIllIIIllIlIlIIIIl) ? 1 : 0)) {
            int[] nArray = new int[lIlIlllllIlI[2]];
            nArray[h.lIlIlllllIlI[1]] = lIlIlllllIlI[6];
            Item lllllllllllllllIllIIIllIlIIlllll = Inventory.getFirst((int[])nArray);
            if (h.lllIIIlIllIIIl(lllllllllllllllIllIIIllIlIIlllll)) {
                lllllllllllllllIllIIIllIlIIlllll.interact(lIlIlllllIIl[lIlIlllllIlI[7]]);
            }
            if (h.lllIIIlIllIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                Combat.toggleSpec();
            }
            0;
            if (1 != 1) {
                return ((0xB4 ^ 0xB1) & ~(0x7F ^ 0x7A)) != 0;
            }
        } else {
            EquipmentSetup lllllllllllllllIllIIIllIlIIlllll = (EquipmentSetup)lllllllllllllllIllIIIllIlIlIIIlI.o.fightLoadout().selected(EquipmentSetup.class);
            if (h.lllIIIlIllIlIl(Gear.isEquipped((int[])lllllllllllllllIllIIIllIlIIlllll.getIds()) ? 1 : 0)) {
                Gear.swapTo((EquipmentSetup)lllllllllllllllIllIIIllIlIIlllll);
                0;
            }
        }
        if (h.lllIIIlIllIllI(Players.getLocal().getInteracting(), lllllllllllllllIllIIIllIlIlIIIIl)) {
            return lIlIlllllIlI[1];
        }
        var1_1.interact(lIlIlllllIIl[lIlIlllllIlI[8]]);
        return lIlIlllllIlI[2];
    }

    private static boolean lllIIIlIllIllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(NPC nPC) {
        int n2;
        void lllllllllllllllIllIIIllIlIIlllIl;
        String[] stringArray = new String[lIlIlllllIlI[2]];
        stringArray[h.lIlIlllllIlI[1]] = lIlIlllllIIl[lIlIlllllIlI[9]];
        if (h.lllIIIlIllIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIlllllIlI[2]];
            stringArray2[h.lIlIlllllIlI[1]] = lIlIlllllIIl[lIlIlllllIlI[10]];
            if (h.lllIIIlIllIlIl(Equipment.contains((String[])stringArray2) ? 1 : 0)) {
                return lIlIlllllIlI[1];
            }
        }
        if (h.lllIIIlIllIIll(lllllllllllllllIllIIIllIlIIlllIl.getHealthRatio(), lIlIlllllIlI[11]) && h.lllIIIlIllIlll(lllllllllllllllIllIIIllIlIIlllIl.getHealthRatio(), lIlIlllllIlI[2])) {
            n2 = lIlIlllllIlI[2];
            0;
            if (((4 ^ 0x1A ^ (0xD ^ 0x5A)) & (0xA8 ^ 0xB0 ^ (0xC2 ^ 0x93) ^ -1)) != 0) {
                return ((0xF ^ 0x44 ^ (8 ^ 2)) & (0x59 ^ 0x6B ^ (0xFE ^ 0x8D) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIlllllIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lllIIIlIllIIlI(int n2) {
        return n2 != 0;
    }

    private static void lllIIIlIlIllll() {
        lIlIlllllIlI = new int[14];
        h.lIlIlllllIlI[0] = -1;
        h.lIlIlllllIlI[1] = (0x53 ^ 0x21 ^ (0x44 ^ 0x7A)) & (24 + 158 - 97 + 114 ^ 114 + 88 - 88 + 25 ^ -1);
        h.lIlIlllllIlI[2] = 1;
        h.lIlIlllllIlI[3] = 0x22 ^ 0x49 ^ (0xC2 ^ 0x84);
        h.lIlIlllllIlI[4] = 0xB4 ^ 0xAA;
        h.lIlIlllllIlI[5] = 0x32 ^ 0;
        h.lIlIlllllIlI[6] = 0xFFFFAE7E & 0x7F9D;
        h.lIlIlllllIlI[7] = 2;
        h.lIlIlllllIlI[8] = 3;
        h.lIlIlllllIlI[9] = 0x6C ^ 0x68;
        h.lIlIlllllIlI[10] = 0x1C ^ 0x19;
        h.lIlIlllllIlI[11] = 23 + 131 - 61 + 107;
        h.lIlIlllllIlI[12] = 0x34 ^ 0x64 ^ (0xE5 ^ 0xB3);
        h.lIlIlllllIlI[13] = 8 ^ 0x4E ^ (0x1A ^ 0x54);
    }

    private static boolean lllIIIlIlllIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIIIlIllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllIIIlIlIllIl(String lllllllllllllllIllIIIllIIlllIlII, String lllllllllllllllIllIIIllIIlllIIll) {
        lllllllllllllllIllIIIllIIlllIlII = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIllIIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIllIIlllIIlI = new StringBuilder();
        char[] lllllllllllllllIllIIIllIIlllIIIl = lllllllllllllllIllIIIllIIlllIIll.toCharArray();
        int lllllllllllllllIllIIIllIIlllIIII = lIlIlllllIlI[1];
        char[] lllllllllllllllIllIIIllIIllIlIlI = lllllllllllllllIllIIIllIIlllIlII.toCharArray();
        int lllllllllllllllIllIIIllIIllIlIIl = lllllllllllllllIllIIIllIIllIlIlI.length;
        int lllllllllllllllIllIIIllIIllIlIII = lIlIlllllIlI[1];
        while (h.lllIIIlIllIIll(lllllllllllllllIllIIIllIIllIlIII, lllllllllllllllIllIIIllIIllIlIIl)) {
            char lllllllllllllllIllIIIllIIlllIlIl = lllllllllllllllIllIIIllIIllIlIlI[lllllllllllllllIllIIIllIIllIlIII];
            lllllllllllllllIllIIIllIIlllIIlI.append((char)(lllllllllllllllIllIIIllIIlllIlIl ^ lllllllllllllllIllIIIllIIlllIIIl[lllllllllllllllIllIIIllIIlllIIII % lllllllllllllllIllIIIllIIlllIIIl.length]));
            0;
            ++lllllllllllllllIllIIIllIIlllIIII;
            ++lllllllllllllllIllIIIllIIllIlIII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIIIllIIlllIIlI);
    }

    private static boolean lllIIIlIllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIIIlIllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllIIIlIlIllII(String lllllllllllllllIllIIIllIlIIIllll, String lllllllllllllllIllIIIllIlIIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIIIllIlIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIllIlIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIllIlIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIllIlIIlIIll.init(lIlIlllllIlI[7], lllllllllllllllIllIIIllIlIIlIlII);
            return new String(lllllllllllllllIllIIIllIlIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIllIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIllIlIIlIIlI) {
            lllllllllllllllIllIIIllIlIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static void lllIIIlIlIlllI() {
        lIlIlllllIIl = new String[lIlIlllllIlI[12]];
        h.lIlIlllllIIl[h.lIlIlllllIlI[1]] = h."Crystal halberd";
        h.lIlIlllllIIl[h.lIlIlllllIlI[2]] = h."Wield";
        h.lIlIlllllIIl[h.lIlIlllllIlI[7]] = h."Wield";
        h.lIlIlllllIIl[h.lIlIlllllIlI[8]] = h."Attack";
        h.lIlIlllllIIl[h.lIlIlllllIlI[9]] = h."Crystal halberd";
        h.lIlIlllllIIl[h.lIlIlllllIlI[10]] = h."Crystal halberd";
    }

    private static boolean lllIIIlIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIIIlIlIlIll(String lllllllllllllllIllIIIllIlIIIIIlI, String lllllllllllllllIllIIIllIlIIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIIllIlIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIllIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIlllllIlI[13]), "DES");
            Cipher lllllllllllllllIllIIIllIlIIIIllI = Cipher.getInstance("DES");
            lllllllllllllllIllIIIllIlIIIIllI.init(lIlIlllllIlI[7], lllllllllllllllIllIIIllIlIIIIlll);
            return new String(lllllllllllllllIllIIIllIlIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIllIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIllIlIIIIlIl) {
            lllllllllllllllIllIIIllIlIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIllIIIl(Object object) {
        return object != null;
    }

    static {
        h.lllIIIlIlIllll();
        h.lllIIIlIlIlllI();
    }
}

