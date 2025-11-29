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

/* TASK: Thieving -> ThievingTask */
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

    private static String llIllIIllIllll(String var19, String var21) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIlIIllIIIII[11], var1);
            return new String(var8.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
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
                return false;
            }
        } else {
            bl2 = lIlIIllIIIII[7];
        }
        return bl2;
    }

    private static boolean llIllIIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIllIIlllIIII(String var17, String var13) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var12 = var13.toCharArray();
        int var20 = lIlIIllIIIII[7];
        char[] var25 = var17.toCharArray();
        int var18 = var25.length;
        int var6 = lIlIIllIIIII[7];
        while (bk.llIllIIlllIllI(var6, var18)) {
            char var9 = var25[var6];
            var10.append((char)(var9 ^ var12[var20 % var12.length]));
            0;
            ++var20;
            ++var6;
            0;
            if (((0x5F ^ 4) & ~(0x3C ^ 0x67)) >= -1) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    @Override
    public boolean cg() {
        bk var23;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (bk.llIllIIllllIlI(nPC.getName().contains(lIlIIlIlllll[lIlIIllIIIII[16]]) ? 1 : 0) && (!bk.llIllIIlllllII(nPC.getAnimation(), lIlIIllIIIII[17]) || bk.llIllIIlllllIl(nPC.getId(), lIlIIllIIIII[2]))) {
                n2 = lIlIIllIIIII[6];
                0;
                if ((0xC6 ^ 0xC2) <= 0) {
                    return false;
                }
            } else {
                n2 = lIlIIllIIIII[7];
            }
            return n2 != 0;
        });
        if (bk.llIllIIlllIlII(nPC2)) {
            return this.cS();
        }
        int var11 = lIlIIllIIIII[3] - var23.co.J() + (lIlIIllIIIII[4] - Skills.getLevel((Skill)Skill.THIEVING)) / lIlIIllIIIII[5];
        if (bk.llIllIIlllIlIl(var11)) {
            int[] nArray = new int[lIlIIllIIIII[6]];
            nArray[bk.lIlIIllIIIII[7]] = lIlIIllIIIII[8];
            int var15 = Inventory.getCount((boolean)lIlIIllIIIII[6], (int[])nArray);
            if (!bk.llIllIIlllIllI(var15, var11) || bk.llIllIIlllIlll(var15, lIlIIllIIIII[9])) {
                TileObject var7 = TileObjects.getNearest(tileObject -> {
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
                if (bk.llIllIIllllIII(var7)) {
                    return lIlIIllIIIII[7];
                }
                if (!bk.llIllIIllllIIl(var23.bS.isMoving() ? 1 : 0) || bk.llIllIIllllIlI(var23.bS.isAnimating() ? 1 : 0)) {
                    return lIlIIllIIIII[7];
                }
                var7.interact(lIlIIlIlllll[lIlIIllIIIII[7]]);
                return lIlIIllIIIII[6];
            }
            if (bk.llIllIIllllIlI(Inventory.isFull() ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIllIIIII[6]];
                nArray2[bk.lIlIIllIIIII[7]] = lIlIIllIIIII[8];
                if (bk.llIllIIllllIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    var23.co.x();
                    0;
                    return lIlIIllIIIII[6];
                }
            }
            int[] nArray3 = new int[lIlIIllIIIII[6]];
            nArray3[bk.lIlIIllIIIII[7]] = lIlIIllIIIII[1];
            TileObject var7 = TileObjects.getNearest((int[])nArray3);
            if (bk.llIllIIllllIII(var7)) {
                return lIlIIllIIIII[7];
            }
            if (!bk.llIllIIllllIIl(var23.bS.isMoving() ? 1 : 0) || bk.llIllIIllllIlI(var23.bS.isAnimating() ? 1 : 0)) {
                return lIlIIllIIIII[7];
            }
            var7.interact(lIlIIlIlllll[lIlIIllIIIII[6]]);
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
        bk var2;
        if (bk.llIllIIllllIlI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (bk.llIllIIlllIlII(Movement.getDestination()) && bk.llIllIIllllIlI(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIllIIIII[7];
            }
            Movement.setDestination((WorldPoint)var2.al.bs);
            return lIlIIllIIIII[6];
        }
        TileObject var3 = var2.cR();
        if (bk.llIllIIllllIII(var3)) {
            Movement.setDestination((WorldPoint)var2.ak.bq.dx(lIlIIllIIIII[10]).dy(lIlIIllIIIII[10]));
            return lIlIIllIIIII[6];
        }
        if (!bk.llIllIIllllIIl(var2.bS.isMoving() ? 1 : 0) || bk.llIllIIllllIlI(var2.bS.isAnimating() ? 1 : 0)) {
            return lIlIIllIIIII[7];
        }
        var1_1.interact(lIlIIlIlllll[lIlIIllIIIII[11]]);
        return lIlIIllIIIII[6];
    }

    private static String llIllIIlllIIIl(String var14, String var22) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), lIlIIllIIIII[18]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIlIIllIIIII[11], var16);
            return new String(var5.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
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

