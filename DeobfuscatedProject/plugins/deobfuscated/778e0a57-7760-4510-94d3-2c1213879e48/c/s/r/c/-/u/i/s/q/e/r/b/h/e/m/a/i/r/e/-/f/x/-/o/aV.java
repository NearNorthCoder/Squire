/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Scavangers (Prep)", priority=10000, blocking=true)
public class aV
extends U {
    private /* synthetic */ n al;
    private /* synthetic */ n ak;
    private static /* synthetic */ String[] lIlIIlIIllII;
    private /* synthetic */ int am;
    private static /* synthetic */ int[] lIlIIlIIllIl;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        aV lllllllllllllllIllIllIllIlIIllll;
        if (aV.llIllIIIllIlII(this.e(this.ak) ? 1 : 0)) {
            return lIlIIlIIllIl[1];
        }
        int[] nArray = new int[lIlIIlIIllIl[1]];
        nArray[aV.lIlIIlIIllIl[2]] = lIlIIlIIllIl[3];
        if (aV.llIllIIIllIlIl(Inventory.getCount((boolean)lIlIIlIIllIl[1], (int[])nArray), lIlIIlIIllIl[4])) {
            int[] nArray2 = new int[lIlIIlIIllIl[1]];
            nArray2[aV.lIlIIlIIllIl[2]] = lIlIIlIIllIl[5];
            if (aV.llIllIIIllIlIl(Inventory.getCount((boolean)lIlIIlIIllIl[1], (int[])nArray2), lIlIIlIIllIl[6])) {
                if (aV.llIllIIIllIlII(Reachable.isWalkable((WorldPoint)lllllllllllllllIllIllIllIlIIllll.ak.bt) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)lllllllllllllllIllIllIllIlIIllll.al.bs);
                    return lIlIIlIIllIl[1];
                }
                if (aV.llIllIIIllIlII(Reachable.isWalkable((WorldPoint)lllllllllllllllIllIllIllIlIIllll.ak.bs) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)lllllllllllllllIllIllIllIlIIllll.ak.bt);
                    System.out.println(lIlIIlIIllII[lIlIIlIIllIl[2]]);
                    return lIlIIlIIllIl[1];
                }
                return lIlIIlIIllIl[2];
            }
        }
        if (aV.llIllIIIllIlII(Inventory.isFull() ? 1 : 0)) {
            lllllllllllllllIllIllIllIlIIllll.co.x();
            0;
            return lIlIIlIIllIl[1];
        }
        TileItem lllllllllllllllIllIllIllIlIIlllI = TileItems.getNearest(tileItem -> {
            int n2;
            if (aV.llIllIIIllIlII(this.ak.a((Locatable)tileItem) ? 1 : 0) && (!aV.llIllIIIlllIIl(tileItem.getId(), lIlIIlIIllIl[3]) || aV.llIllIIIlllIll(tileItem.getId(), lIlIIlIIllIl[5]))) {
                n2 = lIlIIlIIllIl[1];
                0;
                if (null != null) {
                    return ((0x8E ^ 0x86) & ~(0x71 ^ 0x79)) != 0;
                }
            } else {
                n2 = lIlIIlIIllIl[2];
            }
            return n2 != 0;
        });
        if (aV.llIllIIIllIllI(lllllllllllllllIllIllIllIlIIlllI)) {
            if (aV.llIllIIIllIlII(lllllllllllllllIllIllIllIlIIllll.bS.isMoving() ? 1 : 0)) {
                return lIlIIlIIllIl[2];
            }
            lllllllllllllllIllIllIllIlIIlllI.interact(lIlIIlIIllII[lIlIIlIIllIl[1]]);
            return lIlIIlIIllIl[1];
        }
        String[] stringArray = new String[lIlIIlIIllIl[1]];
        stringArray[aV.lIlIIlIIllIl[2]] = lIlIIlIIllII[lIlIIlIIllIl[7]];
        NPC lllllllllllllllIllIllIllIlIIllIl = NPCs.getNearest((String[])stringArray);
        if (aV.llIllIIIllIlll(lllllllllllllllIllIllIllIlIIllIl)) {
            WorldPoint lllllllllllllllIllIllIllIlIIllII = lllllllllllllllIllIllIllIlIIllll.ak.br.getCenter();
            if (aV.llIllIIIlllIII(lllllllllllllllIllIllIllIlIIllII.distanceTo((Locatable)lllllllllllllllIllIllIllIlIIllll.bS), lIlIIlIIllIl[8])) {
                return lIlIIlIIllIl[2];
            }
            System.out.println(lIlIIlIIllII[lIlIIlIIllIl[9]]);
            Movement.setDestination((WorldPoint)lllllllllllllllIllIllIllIlIIllII);
            return lIlIIlIIllIl[1];
        }
        if (aV.llIllIIIllIllI(lllllllllllllllIllIllIllIlIIllll.bS.getInteracting()) && aV.llIllIIIllIlII(lllllllllllllllIllIllIllIlIIllll.bS.getInteracting().getName().contains(lIlIIlIIllII[lIlIIlIIllIl[6]]) ? 1 : 0)) {
            return lIlIIlIIllIl[2];
        }
        var2_2.interact(lIlIIlIIllII[lIlIIlIIllIl[10]]);
        System.out.println(lIlIIlIIllII[lIlIIlIIllIl[11]]);
        return lIlIIlIIllIl[1];
    }

    @Override
    public EquipmentSetup cj() {
        return s.bb();
    }

    private static boolean llIllIIIlllIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    protected aV(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIlIIllIl[0];
    }

    private static boolean llIllIIIllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIIIllIlll(Object object) {
        return object == null;
    }

    private static boolean llIllIIIlllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static void llIllIIIllIIll() {
        lIlIIlIIllIl = new int[14];
        aV.lIlIIlIIllIl[0] = -1;
        aV.lIlIIlIIllIl[1] = 1;
        aV.lIlIIlIIllIl[2] = (0x3F ^ 0x63 ^ (0x2F ^ 0x75)) & (0xFF ^ 0x99 ^ (0xC6 ^ 0xA6) ^ -1);
        aV.lIlIIlIIllIl[3] = -(0xFFFFBC79 & 0x6FD7) & (0xFFFFFDFF & Short.MAX_VALUE);
        aV.lIlIIlIIllIl[4] = 0x19 ^ 9;
        aV.lIlIIlIIllIl[5] = 0xFFFFDDAE & 0x73FF;
        aV.lIlIIlIIllIl[6] = 0x9C ^ 0x98;
        aV.lIlIIlIIllIl[7] = 2;
        aV.lIlIIlIIllIl[8] = 54 + 60 - -12 + 54 ^ 48 + 49 - 60 + 153;
        aV.lIlIIlIIllIl[9] = 3;
        aV.lIlIIlIIllIl[10] = 0xA ^ 0xF;
        aV.lIlIIlIIllIl[11] = (0x92 ^ 0xC0) & ~(0x69 ^ 0x3B) ^ (0x6A ^ 0x6C);
        aV.lIlIIlIIllIl[12] = 15 + 46 - -105 + 17 ^ 153 + 20 - 48 + 51;
        aV.lIlIIlIIllIl[13] = 0x31 ^ 0x39;
    }

    static {
        aV.llIllIIIllIIll();
        aV.llIllIIIllIIlI();
    }

    private static String llIllIIIllIIII(String lllllllllllllllIllIllIllIIIlIIll, String lllllllllllllllIllIllIllIIIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIllIllIllIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIllIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIllIIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIllIIIlIlll.init(lIlIIlIIllIl[7], lllllllllllllllIllIllIllIIIllIII);
            return new String(lllllllllllllllIllIllIllIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIllIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIllIIIlIllI) {
            lllllllllllllllIllIllIllIIIlIllI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aV lllllllllllllllIllIllIllIlIIlIlI;
        if (aV.llIllIIIlllIIl(this.bS.getPlane(), lIlIIlIIllIl[7])) {
            return lIlIIlIIllIl[2];
        }
        lllllllllllllllIllIllIllIlIIlIlI.ak = lllllllllllllllIllIllIllIlIIlIlI.co.L();
        lllllllllllllllIllIllIllIlIIlIlI.am = lllllllllllllllIllIllIllIlIIlIlI.co.N();
        lllllllllllllllIllIllIllIlIIlIlI.al = lllllllllllllllIllIllIllIlIIlIlI.co.M();
        if (aV.llIllIIIlllIlI((Object)lllllllllllllllIllIllIllIlIIlIlI.ak.bw, (Object)N.SCAVENGERS)) {
            bl2 = lIlIIlIIllIl[1];
            0;
            if (null != null) {
                return ((0x43 ^ 0x6D) & ~(0x93 ^ 0xBD)) != 0;
            }
        } else {
            bl2 = lIlIIlIIllIl[2];
        }
        return bl2;
    }

    private static boolean llIllIIIllIllI(Object object) {
        return object != null;
    }

    private static boolean llIllIIIllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIllIIIllIIIl(String lllllllllllllllIllIllIllIIllIlll, String lllllllllllllllIllIllIllIIllIIIl) {
        lllllllllllllllIllIllIllIIllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIllIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIllIIllIlIl = new StringBuilder();
        char[] lllllllllllllllIllIllIllIIllIlII = lllllllllllllllIllIllIllIIllIIIl.toCharArray();
        int lllllllllllllllIllIllIllIIllIIll = lIlIIlIIllIl[2];
        char[] lllllllllllllllIllIllIllIIlIllIl = lllllllllllllllIllIllIllIIllIlll.toCharArray();
        int lllllllllllllllIllIllIllIIlIllII = lllllllllllllllIllIllIllIIlIllIl.length;
        int lllllllllllllllIllIllIllIIlIlIll = lIlIIlIIllIl[2];
        while (aV.llIllIIIlllIII(lllllllllllllllIllIllIllIIlIlIll, lllllllllllllllIllIllIllIIlIllII)) {
            char lllllllllllllllIllIllIllIIlllIII = lllllllllllllllIllIllIllIIlIllIl[lllllllllllllllIllIllIllIIlIlIll];
            lllllllllllllllIllIllIllIIllIlIl.append((char)(lllllllllllllllIllIllIllIIlllIII ^ lllllllllllllllIllIllIllIIllIlII[lllllllllllllllIllIllIllIIllIIll % lllllllllllllllIllIllIllIIllIlII.length]));
            0;
            ++lllllllllllllllIllIllIllIIllIIll;
            ++lllllllllllllllIllIllIllIIlIlIll;
            0;
            if ((0x8C ^ 0xC2 ^ (0x6D ^ 0x26)) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIllIIllIlIl);
    }

    private static void llIllIIIllIIlI() {
        lIlIIlIIllII = new String[lIlIIlIIllIl[13]];
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[2]] = aV."Walking to end";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[1]] = aV."Take";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[7]] = aV."Scavenger beast";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[9]] = aV."walking to center";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[6]] = aV."Scavenger beast";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[10]] = aV."Attack";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[11]] = aV."attacking";
        aV.lIlIIlIIllII[aV.lIlIIlIIllIl[12]] = aV."Scavenger beast";
    }

    private static boolean llIllIIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void lllllllllllllllIllIllIllIlIIIllI;
        aV lllllllllllllllIllIllIllIlIIIlll;
        String[] stringArray = new String[lIlIIlIIllIl[1]];
        stringArray[aV.lIlIIlIIllIl[2]] = lIlIIlIIllII[lIlIIlIIllIl[12]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aV.llIllIIIllIlll(nPC)) {
            return null;
        }
        if (aV.llIllIIIlllIII(lllllllllllllllIllIllIllIlIIIlll.bS.distanceTo((Locatable)lllllllllllllllIllIllIllIlIIIllI), lIlIIlIIllIl[10])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    private static boolean llIllIIIlllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIllIIIlIllll(String lllllllllllllllIllIllIllIIlIIIlI, String lllllllllllllllIllIllIllIIIlllll) {
        try {
            SecretKeySpec lllllllllllllllIllIllIllIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIllIIIlllll.getBytes(StandardCharsets.UTF_8)), lIlIIlIIllIl[13]), "DES");
            Cipher lllllllllllllllIllIllIllIIlIIlII = Cipher.getInstance("DES");
            lllllllllllllllIllIllIllIIlIIlII.init(lIlIIlIIllIl[7], lllllllllllllllIllIllIllIIlIIlIl);
            return new String(lllllllllllllllIllIllIllIIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIllIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIllIIlIIIll) {
            lllllllllllllllIllIllIllIIlIIIll.printStackTrace();
            return null;
        }
    }
}

