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

/* TASK: Scavangers (Top Floor) -> Scavangers(Topfloor)Task */
@TaskDesc(name="Scavangers (Top Floor)", priority=10000, blocking=true)
public class ScavangersTopFloorTask
extends U_Unknown {
    private static /* synthetic */ String[] lIIllllllllI;
    private static /* synthetic */ int[] lIIlllllllll;
    private /* synthetic */ n ak;
    private /* synthetic */ n al;
    private /* synthetic */ int am;

    private static void llIlIIllIIIlIl() {
        lIIllllllllI = new String[lIIlllllllll[3]];
        aW.lIIllllllllI[aW.lIIlllllllll[2]] = aW."Walking to end";
        aW.lIIllllllllI[aW.lIIlllllllll[1]] = aW."Walking to end";
        aW.lIIllllllllI[aW.lIIlllllllll[4]] = aW."Scavenger beast";
    }

    private static boolean llIlIIllIIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static String llIlIIllIIIlII(String var6, String var7) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIIlllllllll[4], var12);
            return new String(var5.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void var2;
        aW var9;
        String[] stringArray = new String[lIIlllllllll[1]];
        stringArray[aW.lIIlllllllll[2]] = lIIllllllllI[lIIlllllllll[4]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aW.llIlIIllIIlIll(nPC)) {
            return null;
        }
        if (aW.llIlIIllIIllII(var9.bS.distanceTo((Locatable)var2), lIIlllllllll[5])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static String llIlIIllIIIIll(String var4, String var8) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIlllllllll[6]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(lIIlllllllll[4], var10);
            return new String(var11.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIIlIll(Object object) {
        return object == null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aW var14;
        if (aW.llIlIIllIIlIIl(this.bS.getPlane(), lIIlllllllll[3])) {
            return lIIlllllllll[2];
        }
        var14.ak = var14.co.L();
        var14.am = var14.co.N();
        var14.al = var14.co.M();
        if (aW.llIlIIllIIlIlI((Object)var14.ak.bw, (Object)N.SCAVENGERS)) {
            bl2 = lIIlllllllll[1];
            0;
            if (3 != 3) {
                return false;
            }
        } else {
            bl2 = lIIlllllllll[2];
        }
        return bl2;
    }

    @Override
    public boolean cg() {
        aW var13;
        if (aW.llIlIIllIIIlll(this.e(this.ak) ? 1 : 0)) {
            return lIIlllllllll[1];
        }
        if (aW.llIlIIllIIlIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlllllllll[2];
        }
        if (aW.llIlIIllIIIlll(Reachable.isWalkable((WorldPoint)var13.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var13.al.bs);
            System.out.println(lIIllllllllI[lIIlllllllll[2]]);
            return lIIlllllllll[1];
        }
        if (aW.llIlIIllIIIlll(Reachable.isWalkable((WorldPoint)var13.ak.bs) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var13.ak.bt);
            System.out.println(lIIllllllllI[lIIlllllllll[1]]);
            return lIIlllllllll[1];
        }
        return lIIlllllllll[2];
    }

    private static boolean llIlIIllIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIIllIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIIllIIIlll(int n2) {
        return n2 != 0;
    }

    static {
        aW.llIlIIllIIIllI();
        aW.llIlIIllIIIlIl();
    }

    private static void llIlIIllIIIllI() {
        lIIlllllllll = new int[7];
        aW.lIIlllllllll[0] = -1;
        aW.lIIlllllllll[1] = 1;
        aW.lIIlllllllll[2] = (0x2D ^ 0x16) & ~(0x2C ^ 0x17);
        aW.lIIlllllllll[3] = 3;
        aW.lIIlllllllll[4] = 2;
        aW.lIIlllllllll[5] = 0x15 ^ 8 ^ (0x24 ^ 0x3C);
        aW.lIIlllllllll[6] = 0x8B ^ 0x97 ^ (0xB1 ^ 0xA5);
    }

    private static boolean llIlIIllIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected aW(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIIlllllllll[0];
    }
}

