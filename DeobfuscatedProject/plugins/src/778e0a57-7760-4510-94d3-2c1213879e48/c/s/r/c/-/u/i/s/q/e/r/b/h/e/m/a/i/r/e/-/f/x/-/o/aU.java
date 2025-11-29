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

@TaskDesc(name="Farming (Top Floor)", priority=10000, blocking=true)
public class aU
extends U {
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

    private static String llIllIIIIIIIII(String lllllllllllllllIllIlllIlIIIIIlll, String lllllllllllllllIllIlllIlIIIIlIII) {
        try {
            SecretKeySpec lllllllllllllllIllIlllIlIIIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIlIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlllIlIIIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlllIlIIIIlIll.init(lIlIIlIIIIll[4], lllllllllllllllIllIlllIlIIIIllII);
            return new String(lllllllllllllllIllIlllIlIIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlllIlIIIIlIlI) {
            lllllllllllllllIllIlllIlIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static String llIllIIIIIIIIl(String lllllllllllllllIllIlllIIlllIllII, String lllllllllllllllIllIlllIIlllIIllI) {
        lllllllllllllllIllIlllIIlllIllII = new String(Base64.getDecoder().decode(lllllllllllllllIllIlllIIlllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlllIIlllIlIlI = new StringBuilder();
        char[] lllllllllllllllIllIlllIIlllIlIIl = lllllllllllllllIllIlllIIlllIIllI.toCharArray();
        int lllllllllllllllIllIlllIIlllIlIII = lIlIIlIIIIll[2];
        char[] lllllllllllllllIllIlllIIlllIIIlI = lllllllllllllllIllIlllIIlllIllII.toCharArray();
        int lllllllllllllllIllIlllIIlllIIIIl = lllllllllllllllIllIlllIIlllIIIlI.length;
        int lllllllllllllllIllIlllIIlllIIIII = lIlIIlIIIIll[2];
        while (aU.llIllIIIIIlIIl(lllllllllllllllIllIlllIIlllIIIII, lllllllllllllllIllIlllIIlllIIIIl)) {
            char lllllllllllllllIllIlllIIlllIllIl = lllllllllllllllIllIlllIIlllIIIlI[lllllllllllllllIllIlllIIlllIIIII];
            lllllllllllllllIllIlllIIlllIlIlI.append((char)(lllllllllllllllIllIlllIIlllIllIl ^ lllllllllllllllIllIlllIIlllIlIIl[lllllllllllllllIllIlllIIlllIlIII % lllllllllllllllIllIlllIIlllIlIIl.length]));
            "".length();
            ++lllllllllllllllIllIlllIIlllIlIII;
            ++lllllllllllllllIllIlllIIlllIIIII;
            "".length();
            if ((146 + 57 - 49 + 4 ^ 1 + 115 - 42 + 81) != 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlllIIlllIlIlI);
    }

    private static void llIllIIIIIIIll() {
        lIlIIlIIIIlI = new String[lIlIIlIIIIll[3]];
        aU.lIlIIlIIIIlI[aU.lIlIIlIIIIll[2]] = aU.llIllIIIIIIIII("y+7NjhG+xSmHqgF5hQIbKA==", "ADcVp");
        aU.lIlIIlIIIIlI[aU.lIlIIlIIIIll[1]] = aU.llIllIIIIIIIIl("ESwaHyMoKlYAJWYoGBA=", "FMvtJ");
        aU.lIlIIlIIIIlI[aU.lIlIIlIIIIll[4]] = aU.llIllIIIIIIIlI("xrU+kksI0H2NBOYvxF3Cqw==", "AjbKK");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        void lllllllllllllllIllIlllIlIIIlIIIl;
        aU lllllllllllllllIllIlllIlIIIlIIlI;
        String[] stringArray = new String[lIlIIlIIIIll[1]];
        stringArray[aU.lIlIIlIIIIll[2]] = lIlIIlIIIIlI[lIlIIlIIIIll[4]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aU.llIllIIIIIlIII(nPC)) {
            return null;
        }
        if (aU.llIllIIIIIlIIl(lllllllllllllllIllIlllIlIIIlIIlI.bS.distanceTo((Locatable)lllllllllllllllIllIlllIlIIIlIIIl), lIlIIlIIIIll[5])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    private static boolean llIllIIIIIIlIl(int n2) {
        return n2 != 0;
    }

    private static void llIllIIIIIIlII() {
        lIlIIlIIIIll = new int[7];
        aU.lIlIIlIIIIll[0] = -" ".length();
        aU.lIlIIlIIIIll[1] = " ".length();
        aU.lIlIIlIIIIll[2] = (0xE3 ^ 0xA7) & ~(0xE2 ^ 0xA6);
        aU.lIlIIlIIIIll[3] = "   ".length();
        aU.lIlIIlIIIIll[4] = "  ".length();
        aU.lIlIIlIIIIll[5] = 0x79 ^ 0x7C;
        aU.lIlIIlIIIIll[6] = 0x14 ^ 0x1C;
    }

    static {
        aU.llIllIIIIIIlII();
        aU.llIllIIIIIIIll();
    }

    private static String llIllIIIIIIIlI(String lllllllllllllllIllIlllIIlllllIlI, String lllllllllllllllIllIlllIIlllllIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIlllIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIIlllllIIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIIll[6]), "DES");
            Cipher lllllllllllllllIllIlllIIlllllllI = Cipher.getInstance("DES");
            lllllllllllllllIllIlllIIlllllllI.init(lIlIIlIIIIll[4], lllllllllllllllIllIlllIIllllllll);
            return new String(lllllllllllllllIllIlllIIlllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlllIIllllllIl) {
            lllllllllllllllIllIlllIIllllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIIIlIII(Object object) {
        return object == null;
    }

    @Override
    public boolean cg() {
        aU lllllllllllllllIllIlllIlIIIlIlll;
        if (aU.llIllIIIIIIlIl(this.e(this.ak) ? 1 : 0)) {
            return lIlIIlIIIIll[1];
        }
        if (aU.llIllIIIIIIlIl(Reachable.isWalkable((WorldPoint)lllllllllllllllIllIlllIlIIIlIlll.ak.bt) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlllIlIIIlIlll.al.bs);
            System.out.println(lIlIIlIIIIlI[lIlIIlIIIIll[2]]);
            return lIlIIlIIIIll[1];
        }
        if (aU.llIllIIIIIIlIl(Reachable.isWalkable((WorldPoint)lllllllllllllllIllIlllIlIIIlIlll.ak.bs) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlllIlIIIlIlll.ak.bt);
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
        aU lllllllllllllllIllIlllIlIIIlIlIl;
        if (aU.llIllIIIIIIllI(this.bS.getPlane(), lIlIIlIIIIll[3])) {
            return lIlIIlIIIIll[2];
        }
        lllllllllllllllIllIlllIlIIIlIlIl.ak = lllllllllllllllIllIlllIlIIIlIlIl.co.L();
        lllllllllllllllIllIlllIlIIIlIlIl.am = lllllllllllllllIllIlllIlIIIlIlIl.co.N();
        lllllllllllllllIllIlllIlIIIlIlIl.al = lllllllllllllllIllIlllIlIIIlIlIl.co.M();
        if (aU.llIllIIIIIIlll((Object)lllllllllllllllIllIlllIlIIIlIlIl.ak.bw, (Object)N.FARMING)) {
            bl2 = lIlIIlIIIIll[1];
            "".length();
            if (null != null) {
                return ((0x8D ^ 0x92) & ~(0xA9 ^ 0xB6)) != 0;
            }
        } else {
            bl2 = lIlIIlIIIIll[2];
        }
        return bl2;
    }
}

