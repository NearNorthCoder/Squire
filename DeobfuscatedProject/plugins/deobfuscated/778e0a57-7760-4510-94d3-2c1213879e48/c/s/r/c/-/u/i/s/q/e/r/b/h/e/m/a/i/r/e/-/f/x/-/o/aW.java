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
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Scavangers (Top Floor)", priority=10000, blocking=true)
public class aW
extends U {
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

    private static String llIlIIllIIIlII(String lllllllllllllllIlllIIlllIlIIIlll, String lllllllllllllllIlllIIlllIlIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlllIlIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlllIlIIlIIl.init(lIIlllllllll[4], lllllllllllllllIlllIIlllIlIIlIlI);
            return new String(lllllllllllllllIlllIIlllIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlllIlIIlIII) {
            lllllllllllllllIlllIIlllIlIIlIII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void lllllllllllllllIlllIIlllIlIlllII;
        aW lllllllllllllllIlllIIlllIlIlllIl;
        String[] stringArray = new String[lIIlllllllll[1]];
        stringArray[aW.lIIlllllllll[2]] = lIIllllllllI[lIIlllllllll[4]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aW.llIlIIllIIlIll(nPC)) {
            return null;
        }
        if (aW.llIlIIllIIllII(lllllllllllllllIlllIIlllIlIlllIl.bS.distanceTo((Locatable)lllllllllllllllIlllIIlllIlIlllII), lIIlllllllll[5])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    private static String llIlIIllIIIIll(String lllllllllllllllIlllIIlllIlIlIIlI, String lllllllllllllllIlllIIlllIlIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlllIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIlIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIlllllllll[6]), "DES");
            Cipher lllllllllllllllIlllIIlllIlIlIllI = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllIlIlIllI.init(lIIlllllllll[4], lllllllllllllllIlllIIlllIlIlIlll);
            return new String(lllllllllllllllIlllIIlllIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlllIlIlIlIl) {
            lllllllllllllllIlllIIlllIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIIlIll(Object object) {
        return object == null;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aW lllllllllllllllIlllIIlllIllIIIII;
        if (aW.llIlIIllIIlIIl(this.bS.getPlane(), lIIlllllllll[3])) {
            return lIIlllllllll[2];
        }
        lllllllllllllllIlllIIlllIllIIIII.ak = lllllllllllllllIlllIIlllIllIIIII.co.L();
        lllllllllllllllIlllIIlllIllIIIII.am = lllllllllllllllIlllIIlllIllIIIII.co.N();
        lllllllllllllllIlllIIlllIllIIIII.al = lllllllllllllllIlllIIlllIllIIIII.co.M();
        if (aW.llIlIIllIIlIlI((Object)lllllllllllllllIlllIIlllIllIIIII.ak.bw, (Object)N.SCAVENGERS)) {
            bl2 = lIIlllllllll[1];
            0;
            if (3 != 3) {
                return ((0x41 ^ 0x71) & ~(0x82 ^ 0xB2)) != 0;
            }
        } else {
            bl2 = lIIlllllllll[2];
        }
        return bl2;
    }

    @Override
    public boolean cg() {
        aW lllllllllllllllIlllIIlllIllIIIlI;
        if (aW.llIlIIllIIIlll(this.e(this.ak) ? 1 : 0)) {
            return lIIlllllllll[1];
        }
        if (aW.llIlIIllIIlIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlllllllll[2];
        }
        if (aW.llIlIIllIIIlll(Reachable.isWalkable((WorldPoint)lllllllllllllllIlllIIlllIllIIIlI.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIlllIllIIIlI.al.bs);
            System.out.println(lIIllllllllI[lIIlllllllll[2]]);
            return lIIlllllllll[1];
        }
        if (aW.llIlIIllIIIlll(Reachable.isWalkable((WorldPoint)lllllllllllllllIlllIIlllIllIIIlI.ak.bs) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIlllIllIIIlI.ak.bt);
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

