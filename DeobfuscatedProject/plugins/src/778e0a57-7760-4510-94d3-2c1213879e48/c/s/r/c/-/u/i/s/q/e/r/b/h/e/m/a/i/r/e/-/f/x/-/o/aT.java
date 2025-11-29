/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
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
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Finishing floor", priority=10000, blocking=true)
public class aT
extends U {
    private static /* synthetic */ String[] lIlIIIlIIIll;
    private /* synthetic */ n ak;
    private static /* synthetic */ int[] lIlIIIlIIlII;

    private static boolean llIlIlIlllIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIlllIlIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        aT lllllllllllllllIlllIIIIllIIlIIIl;
        if (aT.llIlIlIlllIIlI(u.bf() ? 1 : 0)) {
            return lIlIIIlIIlII[1];
        }
        lllllllllllllllIlllIIIIllIIlIIIl.ak = lllllllllllllllIlllIIIIllIIlIIIl.co.L();
        if (aT.llIlIlIlllIlII((Object)lllllllllllllllIlllIIIIllIIlIIIl.ak.bw, (Object)N.END)) {
            bl2 = lIlIIIlIIlII[0];
            "".length();
            if ((0x6B ^ 0x2B ^ (0xCB ^ 0x8F)) < -" ".length()) {
                return ((178 + 162 - 254 + 123 ^ 6 + 115 - 9 + 81) & (0xFB ^ 0x9A ^ (0xED ^ 0x9C) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = lIlIIIlIIlII[1];
        }
        return bl2;
    }

    private static boolean llIlIlIlllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlIlllIIll(Object object) {
        return object == null;
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    protected boolean dX() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aT.llIlIlIlllIIIl(tileObject.getName().equals(lIlIIIlIIIll[lIlIIIlIIlII[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIlII[0]];
                stringArray[aT.lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[5]];
                if (aT.llIlIlIlllIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aT.llIlIlIlllIIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIlIIlII[0];
                    "".length();
                    if (null == null) return n2 != 0;
                    return ((0x81 ^ 0xB2 ^ (0x9D ^ 0x8E)) & (0xCD ^ 0x81 ^ (0xE6 ^ 0x8A) ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIIIlIIlII[1];
            return n2 != 0;
        });
        if (aT.llIlIlIlllIIll(tileObject2)) {
            return lIlIIIlIIlII[1];
        }
        if (aT.llIlIlIlllIlIl(Movement.getRunEnergy(), lIlIIIlIIlII[2])) {
            return lIlIIIlIIlII[1];
        }
        tileObject2.interact(lIlIIIlIIIll[lIlIIIlIIlII[3]]);
        return lIlIIIlIIlII[0];
    }

    private static boolean llIlIlIlllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIlIllIlllI() {
        lIlIIIlIIIll = new String[lIlIIIlIIlII[10]];
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[1]] = aT.llIlIlIllIlIll("Ch0TDT4=", "OsghL");
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[0]] = aT.llIlIlIllIllII("pSJJphjDeC4=", "fLLBK");
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[3]] = aT.llIlIlIllIllII("tb2z7d3IG8c=", "YoXgu");
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[4]] = aT.llIlIlIllIllIl("UyRZaeK9C1rdcMeUBRRa7g==", "tZhOe");
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[5]] = aT.llIlIlIllIllII("HVQ6dQT2lDk=", "VTkJL");
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[6]] = aT.llIlIlIllIllIl("6JI1uo33jPM=", "vyUsi");
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[7]] = aT.llIlIlIllIlIll("EzsaPxc=", "VUnZe");
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[8]] = aT.llIlIlIllIlIll("ARUEIg==", "IzhGI");
        aT.lIlIIIlIIIll[aT.lIlIIIlIIlII[9]] = aT.llIlIlIllIlIll("DgkGFRk=", "Kgrpk");
    }

    static {
        aT.llIlIlIllIllll();
        aT.llIlIlIllIlllI();
    }

    private static String llIlIlIllIllII(String lllllllllllllllIlllIIIIlIlIlIlII, String lllllllllllllllIlllIIIIlIlIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIIlIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIlIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIIIlIlIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIIIlIlIlIllI.init(lIlIIIlIIlII[3], lllllllllllllllIlllIIIIlIlIlIlll);
            return new String(lllllllllllllllIlllIIIIlIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIIIlIlIlIlIl) {
            lllllllllllllllIlllIIIIlIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String llIlIlIllIllIl(String lllllllllllllllIlllIIIIlIlllIlll, String lllllllllllllllIlllIIIIlIlllIllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIIlIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIIlIlllIllI.getBytes(StandardCharsets.UTF_8)), lIlIIIlIIlII[9]), "DES");
            Cipher lllllllllllllllIlllIIIIlIllllIll = Cipher.getInstance("DES");
            lllllllllllllllIlllIIIIlIllllIll.init(lIlIIIlIIlII[3], lllllllllllllllIlllIIIIlIlllllII);
            return new String(lllllllllllllllIlllIIIIlIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIIlIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIIIlIllllIlI) {
            lllllllllllllllIlllIIIIlIllllIlI.printStackTrace();
            return null;
        }
    }

    private static void llIlIlIllIllll() {
        lIlIIIlIIlII = new int[11];
        aT.lIlIIIlIIlII[0] = " ".length();
        aT.lIlIIIlIIlII[1] = (0x19 ^ 0x2E ^ (0x91 ^ 0x83)) & (72 + 118 - 120 + 69 ^ 54 + 116 - 115 + 119 ^ -" ".length());
        aT.lIlIIIlIIlII[2] = 0xEF ^ 0x81 ^ (0x6B ^ 0x39);
        aT.lIlIIIlIIlII[3] = "  ".length();
        aT.lIlIIIlIIlII[4] = "   ".length();
        aT.lIlIIIlIIlII[5] = 0x4A ^ 0x18 ^ (0xD8 ^ 0x8E);
        aT.lIlIIIlIIlII[6] = 0x61 ^ 0x64;
        aT.lIlIIIlIIlII[7] = 59 + 147 - 190 + 182 ^ 129 + 53 - 79 + 89;
        aT.lIlIIIlIIlII[8] = 0x5A ^ 0x5D;
        aT.lIlIIIlIIlII[9] = 64 + 15 - -11 + 54 ^ 72 + 123 - 72 + 29;
        aT.lIlIIIlIIlII[10] = 0xCB ^ 0xC2;
    }

    private static boolean llIlIlIlllIlII(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    protected aT(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        aT lllllllllllllllIlllIIIIllIIlIlIl;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aT.llIlIlIlllIIIl(tileObject.getName().contains(lIlIIIlIIIll[lIlIIIlIIlII[8]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIlII[0]];
                stringArray[aT.lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[9]];
                if (aT.llIlIlIlllIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aT.llIlIlIlllIIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIlIIlII[0];
                    "".length();
                    if (null == null) return n2 != 0;
                    return ((0xB4 ^ 0x98) & ~(0x55 ^ 0x79)) != 0;
                }
            }
            n2 = lIlIIIlIIlII[1];
            return n2 != 0;
        });
        if (aT.llIlIlIlllIIII(tileObject2) && aT.llIlIlIlllIIIl(Reachable.isInteractable((Locatable)tileObject2) ? 1 : 0)) {
            void lllllllllllllllIlllIIIIllIIlIlII;
            if (aT.llIlIlIlllIIIl(this.dX() ? 1 : 0)) {
                return lIlIIIlIIlII[0];
            }
            if (aT.llIlIlIlllIIlI(Movement.shouldWalk() ? 1 : 0)) {
                return lIlIIIlIIlII[0];
            }
            lllllllllllllllIlllIIIIllIIlIlII.interact(lIlIIIlIIIll[lIlIIIlIIlII[1]]);
            return lIlIIIlIIlII[0];
        }
        TileObject lllllllllllllllIlllIIIIllIIlIIll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aT.llIlIlIlllIIIl(tileObject.getName().equals(lIlIIIlIIIll[lIlIIIlIIlII[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIlIIlII[0]];
                stringArray[aT.lIlIIIlIIlII[1]] = lIlIIIlIIIll[lIlIIIlIIlII[7]];
                if (aT.llIlIlIlllIIIl(tileObject.hasAction(stringArray) ? 1 : 0) && aT.llIlIlIlllIIIl(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIlIIlII[0];
                    "".length();
                    if ("  ".length() > " ".length()) return n2 != 0;
                    return ((16 + 88 - -78 + 56 ^ 98 + 176 - 151 + 60) & (56 + 90 - -35 + 63 ^ 50 + 150 - 27 + 0 ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIIIlIIlII[1];
            return n2 != 0;
        });
        if (aT.llIlIlIlllIIll(lllllllllllllllIlllIIIIllIIlIIll)) {
            return lIlIIIlIIlII[1];
        }
        var2_2.interact(lIlIIIlIIIll[lIlIIIlIIlII[0]]);
        return lIlIIIlIIlII[0];
    }

    private static String llIlIlIllIlIll(String lllllllllllllllIlllIIIIlIllIIlII, String lllllllllllllllIlllIIIIlIllIlIII) {
        lllllllllllllllIlllIIIIlIllIIlII = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIIlIllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIIIlIllIIlll = new StringBuilder();
        char[] lllllllllllllllIlllIIIIlIllIIllI = lllllllllllllllIlllIIIIlIllIlIII.toCharArray();
        int lllllllllllllllIlllIIIIlIllIIlIl = lIlIIIlIIlII[1];
        char[] lllllllllllllllIlllIIIIlIlIlllll = lllllllllllllllIlllIIIIlIllIIlII.toCharArray();
        int lllllllllllllllIlllIIIIlIlIllllI = lllllllllllllllIlllIIIIlIlIlllll.length;
        int lllllllllllllllIlllIIIIlIlIlllIl = lIlIIIlIIlII[1];
        while (aT.llIlIlIlllIllI(lllllllllllllllIlllIIIIlIlIlllIl, lllllllllllllllIlllIIIIlIlIllllI)) {
            char lllllllllllllllIlllIIIIlIllIlIlI = lllllllllllllllIlllIIIIlIlIlllll[lllllllllllllllIlllIIIIlIlIlllIl];
            lllllllllllllllIlllIIIIlIllIIlll.append((char)(lllllllllllllllIlllIIIIlIllIlIlI ^ lllllllllllllllIlllIIIIlIllIIllI[lllllllllllllllIlllIIIIlIllIIlIl % lllllllllllllllIlllIIIIlIllIIllI.length]));
            "".length();
            ++lllllllllllllllIlllIIIIlIllIIlIl;
            ++lllllllllllllllIlllIIIIlIlIlllIl;
            "".length();
            if (" ".length() >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIIIlIllIIlll);
    }

    private static boolean llIlIlIlllIIII(Object object) {
        return object != null;
    }
}

