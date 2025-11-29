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
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n_Unknown;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Shamans -> ShamansTask */
@TaskDesc(name="Shamans", priority=10000, blocking=true)
public class ShamansTask
extends U_Unknown {
    private static /* synthetic */ String[] lIlIlIlIlIII;
    private /* synthetic */ n ak;
    private /* synthetic */ n al;
    private static /* synthetic */ int[] lIlIlIlIlIIl;
    private /* synthetic */ int am;

    static {
        aD.llIllllIIIIIlI();
        aD.llIllllIIIIIIl();
    }

    private static boolean llIllllIIIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aD var4;
        if (aD.llIllllIIIIllI(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aD.llIllllIIIIlll(Movement.getDestination()) && aD.llIllllIIIIllI(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIlIlIlIIl[2];
            }
            Movement.setDestination((WorldPoint)var4.al.bs);
            return lIlIlIlIlIIl[1];
        }
        TileObject var13 = var4.cR();
        if (aD.llIllllIIIIlII(var13)) {
            Movement.setDestination((WorldPoint)var4.ak.bq.dx(lIlIlIlIlIIl[4]).dy(lIlIlIlIlIIl[4]));
            return lIlIlIlIlIIl[1];
        }
        if (!aD.llIllllIIIlIII(var4.bS.isMoving() ? 1 : 0) || aD.llIllllIIIIllI(var4.bS.isAnimating() ? 1 : 0)) {
            return lIlIlIlIlIIl[2];
        }
        var1_1.interact(lIlIlIlIlIII[lIlIlIlIlIIl[2]]);
        return lIlIlIlIlIIl[1];
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aD.llIllllIIIIllI(tileObject.getName().equals(lIlIlIlIlIII[lIlIlIlIlIIl[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIlIlIIl[1]];
                stringArray[aD.lIlIlIlIlIIl[2]] = lIlIlIlIlIII[lIlIlIlIlIIl[5]];
                if (aD.llIllllIIIIllI(tileObject.hasAction(stringArray) ? 1 : 0) && aD.llIllllIIIIllI(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIlIlIlIIl[1];
                    0;
                    if (((0x5A ^ 8) & ~(0xDF ^ 0x8D)) == ((0x55 ^ 0x77) & ~(0x40 ^ 0x62))) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIlIlIIl[2];
            return n2 != 0;
        });
    }

    @Inject
    protected aD(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIlIlIlIIl[0];
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static String llIlllIlllllll(String var22, String var2) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIIl[8]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIlIlIlIlIIl[5], var19);
            return new String(var17.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static String llIllllIIIIIII(String var11, String var14) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var15 = var14.toCharArray();
        int var7 = lIlIlIlIlIIl[2];
        char[] var20 = var11.toCharArray();
        int var3 = var20.length;
        int var18 = lIlIlIlIlIIl[2];
        while (aD.llIllllIIIlIIl(var18, var3)) {
            char var9 = var20[var18];
            var1.append((char)(var9 ^ var15[var7 % var15.length]));
            0;
            ++var7;
            ++var18;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean llIllllIIIIlll(Object object) {
        return object != null;
    }

    private static boolean llIllllIIIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlllIllllllI(String var21, String var23) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIlIlIlIlIIl[5], var8);
            return new String(var16.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllIIIlIII(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean cg() {
        return lIlIlIlIlIIl[1];
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aD.llIllllIIIIIll((Object)this.ak.bw, (Object)N.SHAMANS)) {
            bl2 = lIlIlIlIlIIl[1];
            0;
            
            }
        } else {
            bl2 = lIlIlIlIlIIl[2];
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        aD var6;
        void var12;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (aD.llIllllIIIIllI(nPC.getName().contains(lIlIlIlIlIII[lIlIlIlIlIIl[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIlIlIIl[1]];
                stringArray[aD.lIlIlIlIlIIl[2]] = lIlIlIlIlIII[lIlIlIlIlIIl[7]];
                if (aD.llIllllIIIIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIlIlIIl[1];
                    0;
                    if (2 > 1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIlIlIIl[2];
            return n2 != 0;
        });
        if (aD.llIllllIIIIlII(nPC2)) {
            return null;
        }
        if (aD.llIllllIIIIlIl(var12.getWorldLocation().distanceTo((Locatable)var6.bS), lIlIlIlIlIIl[3])) {
            return null;
        }
        return Prayers.getOffensive();
    }

    private static void llIllllIIIIIIl() {
        lIlIlIlIlIII = new String[lIlIlIlIlIIl[3]];
        aD.lIlIlIlIlIII[aD.lIlIlIlIlIIl[2]] = aD."Enter";
        aD.lIlIlIlIlIII[aD.lIlIlIlIlIIl[1]] = aD."Passage";
        aD.lIlIlIlIlIII[aD.lIlIlIlIlIIl[5]] = aD."Enter";
        aD.lIlIlIlIlIII[aD.lIlIlIlIlIIl[6]] = aD."Guardian";
        aD.lIlIlIlIlIII[aD.lIlIlIlIlIIl[7]] = aD."Attack";
    }

    private static boolean llIllllIIIIlII(Object object) {
        return object == null;
    }

    private static boolean llIllllIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIllllIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIllllIIIIIlI() {
        lIlIlIlIlIIl = new int[9];
        aD.lIlIlIlIlIIl[0] = -1;
        aD.lIlIlIlIlIIl[1] = 1;
        aD.lIlIlIlIlIIl[2] = (136 + 79 - 192 + 131 ^ 31 + 103 - 103 + 152) & (64 + 40 - 68 + 129 ^ 112 + 117 - 188 + 95 ^ -1);
        aD.lIlIlIlIlIIl[3] = 7 ^ 2;
        aD.lIlIlIlIlIIl[4] = 0xD5 ^ 0xC5;
        aD.lIlIlIlIlIIl[5] = 2;
        aD.lIlIlIlIlIIl[6] = 3;
        aD.lIlIlIlIlIIl[7] = 0xAE ^ 0xAA;
        aD.lIlIlIlIlIIl[8] = 0xB1 ^ 0x82 ^ (0x7A ^ 0x41);
    }
}

