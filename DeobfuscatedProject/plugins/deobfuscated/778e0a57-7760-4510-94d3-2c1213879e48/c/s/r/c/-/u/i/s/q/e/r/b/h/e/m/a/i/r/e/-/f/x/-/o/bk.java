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
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
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
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Thieving", priority=10000, blocking=true)
public class bk
extends U {
    private static /* synthetic */ int[] lIlIIllIIIII;
    private /* synthetic */ int am;
    private final /* synthetic */ int es = 7603;
    private /* synthetic */ n ak;
    private final /* synthetic */ int er = 29742;
    private static /* synthetic */ String[] lIlIIlIlllll;
    private /* synthetic */ n al;

    private static String llIllIIllIllll(String lllllllllllllllIllIllIIlIIlllIII, String lllllllllllllllIllIllIIlIIllIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIlIIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIlIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIIlIIlllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIIlIIlllIlI.init(lIlIIllIIIII[11], lllllllllllllllIllIllIIlIIlllIll);
            return new String(lllllllllllllllIllIllIIlIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIlIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIlIIlllIIl) {
            lllllllllllllllIllIllIIlIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIlllIlIl(int n2) {
        return n2 > 0;
    }

    @Inject
    protected bk(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIllIIIII[0];
        this.er = lIlIIllIIIII[1];
        this.es = lIlIIllIIIII[2];
    }

    static {
        bk.llIllIIlllIIll();
        bk.llIllIIlllIIlI();
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    private static boolean llIllIIlllllII(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIllIIlllIIlI() {
        lIlIIlIlllll = new String[lIlIIllIIIII[18]];
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[7]] = bk."Deposit";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[6]] = bk."Open";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[11]] = bk."Enter";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[12]] = bk."Passage";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[13]] = bk."Enter";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[14]] = bk."Trough";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[15]] = bk."Deposit";
        bk.lIlIIlIlllll[bk.lIlIIllIIIII[16]] = bk."Corrupted scavenger";
    }

    private static boolean llIllIIllllIII(Object object) {
        return object == null;
    }

    private static boolean llIllIIlllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllIIlllllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIllIIlllIlII(Object object) {
        return object != null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (bk.llIllIIllllIll((Object)this.ak.bw, (Object)N.THIEVING)) {
            bl2 = lIlIIllIIIII[6];
            0;
            if (-2 > 0) {
                return ((0x2D ^ 0x1F) & ~(0xB1 ^ 0x83)) != 0;
            }
        } else {
            bl2 = lIlIIllIIIII[7];
        }
        return bl2;
    }

    private static boolean llIllIIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIllIIlllIIII(String lllllllllllllllIllIllIIlIlIlIlIl, String lllllllllllllllIllIllIIlIlIllIIl) {
        lllllllllllllllIllIllIIlIlIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIIlIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIIlIlIllIII = new StringBuilder();
        char[] lllllllllllllllIllIllIIlIlIlIlll = lllllllllllllllIllIllIIlIlIllIIl.toCharArray();
        int lllllllllllllllIllIllIIlIlIlIllI = lIlIIllIIIII[7];
        char[] lllllllllllllllIllIllIIlIlIlIIII = lllllllllllllllIllIllIIlIlIlIlIl.toCharArray();
        int lllllllllllllllIllIllIIlIlIIllll = lllllllllllllllIllIllIIlIlIlIIII.length;
        int lllllllllllllllIllIllIIlIlIIlllI = lIlIIllIIIII[7];
        while (bk.llIllIIlllIllI(lllllllllllllllIllIllIIlIlIIlllI, lllllllllllllllIllIllIIlIlIIllll)) {
            char lllllllllllllllIllIllIIlIlIllIll = lllllllllllllllIllIllIIlIlIlIIII[lllllllllllllllIllIllIIlIlIIlllI];
            lllllllllllllllIllIllIIlIlIllIII.append((char)(lllllllllllllllIllIllIIlIlIllIll ^ lllllllllllllllIllIllIIlIlIlIlll[lllllllllllllllIllIllIIlIlIlIllI % lllllllllllllllIllIllIIlIlIlIlll.length]));
            0;
            ++lllllllllllllllIllIllIIlIlIlIllI;
            ++lllllllllllllllIllIllIIlIlIIlllI;
            0;
            if (((0x5F ^ 4) & ~(0x3C ^ 0x67)) >= -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllIIlIlIllIII);
    }

    @Override
    public boolean cg() {
        bk lllllllllllllllIllIllIIlIlllIlll;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bk.llIllIIllllIlI(nPC.getName().contains(lIlIIlIlllll[lIlIIllIIIII[16]]) ? 1 : 0) && (!bk.llIllIIlllllII(nPC.getAnimation(), lIlIIllIIIII[17]) || bk.llIllIIlllllIl(nPC.getId(), lIlIIllIIIII[2]))) {
                n2 = lIlIIllIIIII[6];
                0;
                if ((0xC6 ^ 0xC2) <= 0) {
                    return ((0xAE ^ 0x9F) & ~(0xAF ^ 0x9E)) != 0;
                }
            } else {
                n2 = lIlIIllIIIII[7];
            }
            return n2 != 0;
        });
        if (bk.llIllIIlllIlII(nPC2)) {
            return this.cS();
        }
        int lllllllllllllllIllIllIIlIlllIlIl = lIlIIllIIIII[3] - lllllllllllllllIllIllIIlIlllIlll.co.J() + (lIlIIllIIIII[4] - Skills.getLevel((Skill)Skill.THIEVING)) / lIlIIllIIIII[5];
        if (bk.llIllIIlllIlIl(lllllllllllllllIllIllIIlIlllIlIl)) {
            int[] nArray = new int[lIlIIllIIIII[6]];
            nArray[bk.lIlIIllIIIII[7]] = lIlIIllIIIII[8];
            int lllllllllllllllIllIllIIlIlllIlII = Inventory.getCount((boolean)lIlIIllIIIII[6], (int[])nArray);
            if (!bk.llIllIIlllIllI(lllllllllllllllIllIllIIlIlllIlII, lllllllllllllllIllIllIIlIlllIlIl) || bk.llIllIIlllIlll(lllllllllllllllIllIllIIlIlllIlII, lIlIIllIIIII[9])) {
                TileObject lllllllllllllllIllIllIIlIlllIIll = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (bk.llIllIIllllIlI(tileObject.getName().contains(lIlIIlIlllll[lIlIIllIIIII[14]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIllIIIII[6]];
                        stringArray[bk.lIlIIllIIIII[7]] = lIlIIlIlllll[lIlIIllIIIII[15]];
                        if (bk.llIllIIllllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIlIIllIIIII[6];
                            0;
                            if (((172 + 178 - 303 + 187 ^ 57 + 153 - 187 + 155) & (126 + 38 - 47 + 108 ^ 13 + 173 - 3 + 2 ^ -1)) <= 0) return n2 != 0;
                            return ((0x69 ^ 0x58 ^ (0x30 ^ 0x3A)) & (0x47 ^ 0x41 ^ (0x1E ^ 0x23) ^ -1)) != 0;
                        }
                    }
                    n2 = lIlIIllIIIII[7];
                    return n2 != 0;
                });
                if (bk.llIllIIllllIII(lllllllllllllllIllIllIIlIlllIIll)) {
                    return lIlIIllIIIII[7];
                }
                if (!bk.llIllIIllllIIl(lllllllllllllllIllIllIIlIlllIlll.bS.isMoving() ? 1 : 0) || bk.llIllIIllllIlI(lllllllllllllllIllIllIIlIlllIlll.bS.isAnimating() ? 1 : 0)) {
                    return lIlIIllIIIII[7];
                }
                lllllllllllllllIllIllIIlIlllIIll.interact(lIlIIlIlllll[lIlIIllIIIII[7]]);
                return lIlIIllIIIII[6];
            }
            if (bk.llIllIIllllIlI(Inventory.isFull() ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIllIIIII[6]];
                nArray2[bk.lIlIIllIIIII[7]] = lIlIIllIIIII[8];
                if (bk.llIllIIllllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllIllIllIIlIlllIlll.co.x();
                    0;
                    return lIlIIllIIIII[6];
                }
            }
            int[] nArray3 = new int[lIlIIllIIIII[6]];
            nArray3[bk.lIlIIllIIIII[7]] = lIlIIllIIIII[1];
            TileObject lllllllllllllllIllIllIIlIlllIIll = TileObjects.getNearest((int[])nArray3);
            if (bk.llIllIIllllIII(lllllllllllllllIllIllIIlIlllIIll)) {
                return lIlIIllIIIII[7];
            }
            if (!bk.llIllIIllllIIl(lllllllllllllllIllIllIIlIlllIlll.bS.isMoving() ? 1 : 0) || bk.llIllIIllllIlI(lllllllllllllllIllIllIIlIlllIlll.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIIIII[7];
            }
            lllllllllllllllIllIllIIlIlllIIll.interact(lIlIIlIlllll[lIlIIllIIIII[6]]);
            return lIlIIllIIIII[6];
        }
        this.cS();
        0;
        return lIlIIllIIIII[6];
    }

    private static boolean llIllIIllllIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIllIIllllIlI(int n2) {
        return n2 != 0;
    }

    private static void llIllIIlllIIll() {
        lIlIIllIIIII = new int[19];
        bk.lIlIIllIIIII[0] = -1;
        bk.lIlIIllIIIII[1] = -(0xFFFFD7FD & 0x2BD3) & (0xFFFFF7FF & 0x7FFE);
        bk.lIlIIllIIIII[2] = 0xFFFFFFFF & 0x1DB3;
        bk.lIlIIllIIIII[3] = 0x40 ^ 0xD ^ (0xB ^ 0x58);
        bk.lIlIIllIIIII[4] = 0xAD ^ 0xA8 ^ (0x4C ^ 0x2D);
        bk.lIlIIllIIIII[5] = 114 + 8 - -19 + 41 ^ 61 + 72 - -13 + 42;
        bk.lIlIIllIIIII[6] = 1;
        bk.lIlIIllIIIII[7] = (0x17 ^ 0x7B ^ (1 ^ 0x65)) & (0xE ^ 0x60 ^ (1 ^ 0x67) ^ -1);
        bk.lIlIIllIIIII[8] = -(0xFFFFB67F & 0x6BE3) & (0xFFFFF7FF & 0x7BF7);
        bk.lIlIIllIIIII[9] = 3 ^ 0x1C ^ (0x4C ^ 0x45);
        bk.lIlIIllIIIII[10] = 0xBF ^ 0xB1;
        bk.lIlIIllIIIII[11] = 2;
        bk.lIlIIllIIIII[12] = 3;
        bk.lIlIIllIIIII[13] = 0x83 ^ 0x87;
        bk.lIlIIllIIIII[14] = 0x2B ^ 0x2E;
        bk.lIlIIllIIIII[15] = 0x2F ^ 0x7D ^ (0xCE ^ 0x9A);
        bk.lIlIIllIIIII[16] = 0xF ^ 8;
        bk.lIlIIllIIIII[17] = -(0xFFFFEFBF & 0x3275) & (0xFFFFFF7F & 0x3FFD);
        bk.lIlIIllIIIII[18] = 0x7F ^ 0x77;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        bk lllllllllllllllIllIllIIlIllIlllI;
        if (bk.llIllIIllllIlI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (bk.llIllIIlllIlII(Movement.getDestination()) && bk.llIllIIllllIlI(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIllIIIII[7];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIllIIlIllIlllI.al.bs);
            return lIlIIllIIIII[6];
        }
        TileObject lllllllllllllllIllIllIIlIllIllIl = lllllllllllllllIllIllIIlIllIlllI.cR();
        if (bk.llIllIIllllIII(lllllllllllllllIllIllIIlIllIllIl)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIllIllIIlIllIlllI.ak.bq.dx(lIlIIllIIIII[10]).dy(lIlIIllIIIII[10]));
            return lIlIIllIIIII[6];
        }
        if (!bk.llIllIIllllIIl(lllllllllllllllIllIllIIlIllIlllI.bS.isMoving() ? 1 : 0) || bk.llIllIIllllIlI(lllllllllllllllIllIllIIlIllIlllI.bS.isAnimating() ? 1 : 0)) {
            return lIlIIllIIIII[7];
        }
        var1_1.interact(lIlIIlIlllll[lIlIIllIIIII[11]]);
        return lIlIIllIIIII[6];
    }

    private static String llIllIIlllIIIl(String lllllllllllllllIllIllIIlIlIIIlIl, String lllllllllllllllIllIllIIlIlIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIlIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIIllIIIII[18]), "DES");
            Cipher lllllllllllllllIllIllIIlIlIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIllIllIIlIlIIIlll.init(lIlIIllIIIII[11], lllllllllllllllIllIllIIlIlIIlIII);
            return new String(lllllllllllllllIllIllIIlIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIllIIlIlIIIllI) {
            lllllllllllllllIllIllIIlIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIllllIIl(int n2) {
        return n2 == 0;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (bk.llIllIIllllIlI(tileObject.getName().equals(lIlIIlIlllll[lIlIIllIIIII[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIllIIIII[6]];
                stringArray[bk.lIlIIllIIIII[7]] = lIlIIlIlllll[lIlIIllIIIII[13]];
                if (bk.llIllIIllllIlI(tileObject.hasAction(stringArray) ? 1 : 0) && bk.llIllIIllllIlI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIllIIIII[6];
                    0;
                    if (2 > -1) return n2 != 0;
                    return ((0xE3 ^ 0xC7 ^ (0x22 ^ 0x3A)) & (0x71 ^ 0x25 ^ (0x13 ^ 0x7B) ^ -1)) != 0;
                }
            }
            n2 = lIlIIllIIIII[7];
            return n2 != 0;
        });
    }
}

