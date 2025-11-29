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
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
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
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/* TASK: Farming (Top Floor) -> Farming(Topfloor)Task */
@TaskDesc(name="Farming (Top Floor)", priority=10000, blocking=true)
public class FarmingTopFloorTask
extends U_Unknown {
    private /* synthetic */ n ak;
    private /* synthetic */ n al;
    private static /* synthetic */ String[] lIlIIlIIIIlI;
    private /* synthetic */ int am;
    private static /* synthetic */ int[] lIlIIlIIIIll;

    @Inject
    protected aU(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIlIIIIll[0];
    }

    private static String llIllIIIIIIIII(String var21, String var12) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIlIIlIIIIll[4], var14);
            return new String(var13.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static String llIllIIIIIIIIl(String var19, String var2) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var8 = var2.toCharArray();
        int var1 = lIlIIlIIIIll[2];
        char[] var17 = var19.toCharArray();
        int var9 = var17.length;
        int var4 = lIlIIlIIIIll[2];
        while (aU.llIllIIIIIlIIl(var4, var9)) {
            char var11 = var17[var4];
            var6.append((char)(var11 ^ var8[var1 % var8.length]));
            0;
            ++var1;
            ++var4;
            0;
            if ((146 + 57 - 49 + 4 ^ 1 + 115 - 42 + 81) != 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void llIllIIIIIIIll() {
        lIlIIlIIIIlI = new String[lIlIIlIIIIll[3]];
        aU.lIlIIlIIIIlI[aU.lIlIIlIIIIll[2]] = aU."Walking to end";
        aU.lIlIIlIIIIlI[aU.lIlIIlIIIIll[1]] = aU."Walking to end";
        aU.lIlIIlIIIIlI[aU.lIlIIlIIIIll[4]] = aU."Scavenger beast";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var3;
        aU var18;
        String[] stringArray = new String[lIlIIlIIIIll[1]];
        stringArray[aU.lIlIIlIIIIll[2]] = lIlIIlIIIIlI[lIlIIlIIIIll[4]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aU.llIllIIIIIlIII(nPC)) {
            return null;
        }
        if (aU.llIllIIIIIlIIl(var18.bS.distanceTo((Locatable)var3), lIlIIlIIIIll[5])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    private static boolean llIllIIIIIIlIl(int n2) {
        return n2 != 0;
    }

    private static void llIllIIIIIIlII() {
        lIlIIlIIIIll = new int[7];
        aU.lIlIIlIIIIll[0] = -1;
        aU.lIlIIlIIIIll[1] = 1;
        aU.lIlIIlIIIIll[2] = (0xE3 ^ 0xA7) & ~(0xE2 ^ 0xA6);
        aU.lIlIIlIIIIll[3] = 3;
        aU.lIlIIlIIIIll[4] = 2;
        aU.lIlIIlIIIIll[5] = 0x79 ^ 0x7C;
        aU.lIlIIlIIIIll[6] = 0x14 ^ 0x1C;
    }

    static {
        aU.llIllIIIIIIlII();
        aU.llIllIIIIIIIll();
    }

    private static String llIllIIIIIIIlI(String var15, String var5) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIIll[6]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIlIIlIIIIll[4], var16);
            return new String(var7.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIIIlIII(Object object) {
        return object == null;
    }

    @Override
    public boolean cg() {
        aU var10;
        if (aU.llIllIIIIIIlIl(this.e(this.ak) ? 1 : 0)) {
            return lIlIIlIIIIll[1];
        }
        if (aU.llIllIIIIIIlIl(Reachable.isWalkable((WorldPoint)var10.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var10.al.bs);
            System.out.println(lIlIIlIIIIlI[lIlIIlIIIIll[2]]);
            return lIlIIlIIIIll[1];
        }
        if (aU.llIllIIIIIIlIl(Reachable.isWalkable((WorldPoint)var10.ak.bs) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var10.ak.bt);
            System.out.println(lIlIIlIIIIlI[lIlIIlIIIIll[1]]);
            return lIlIIlIIIIll[1];
        }
        return lIlIIlIIIIll[2];
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIIIIIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIllIIIIIIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIllIIIIIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aU var22;
        if (aU.llIllIIIIIIllI(this.bS.getPlane(), lIlIIlIIIIll[3])) {
            return lIlIIlIIIIll[2];
        }
        var22.ak = var22.co.L();
        var22.am = var22.co.N();
        var22.al = var22.co.M();
        if (aU.llIllIIIIIIlll((Object)var22.ak.bw, (Object)N.FARMING)) {
            bl2 = lIlIIlIIIIll[1];
            0;
            
            }
        } else {
            bl2 = lIlIIlIIIIll[2];
        }
        return bl2;
    }
}

