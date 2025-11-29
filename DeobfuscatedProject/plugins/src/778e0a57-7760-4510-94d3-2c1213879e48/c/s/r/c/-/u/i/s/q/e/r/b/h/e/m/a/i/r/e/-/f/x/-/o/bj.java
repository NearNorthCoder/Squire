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
 *  net.runelite.api.Projectile
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Ice Demon", priority=10000, blocking=true)
public class bj
extends U {
    private final /* synthetic */ int eo = 29742;
    private /* synthetic */ n al;
    private /* synthetic */ n ak;
    private static /* synthetic */ int[] lIlIIIllIlll;
    private final /* synthetic */ int ep = 7603;
    private final /* synthetic */ int eq = 1324;
    private /* synthetic */ int am;
    private static /* synthetic */ String[] lIlIIIllIllI;

    private static boolean llIlIlllIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (bj.llIlIlllIIIlIl((Object)this.ak.bw, (Object)N.ICE_DEMON)) {
            bl2 = lIlIIIllIlll[7];
            "".length();
            if ("  ".length() < ((226 + 138 - 174 + 41 ^ 115 + 20 - 86 + 121) & (0x5A ^ 0x4F ^ (0x3B ^ 0x63) ^ -" ".length()))) {
                return ((79 + 106 - 72 + 29 ^ 137 + 56 - 83 + 75) & (0xE1 ^ 0xBD ^ (0xEA ^ 0x81) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = lIlIIIllIlll[8];
        }
        return bl2;
    }

    @Inject
    protected bj(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIIllIlll[0];
        this.eo = lIlIIIllIlll[1];
        this.ep = lIlIIIllIlll[2];
        this.eq = lIlIIIllIlll[3];
    }

    private static boolean llIlIlllIIIIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIllIllI[lIlIIIllIlll[31]]));
        NPC nPC3 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIllIllI[lIlIIIllIlll[30]]));
        if (bj.llIlIlllIIIIII(nPC2) && bj.llIlIlllIIIIIl(nPC3)) {
            void lllllllllllllllIllIlllllIlIIIlIl;
            arrayList.addAll(Prayers.getOffensive());
            "".length();
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
            return lllllllllllllllIllIlllllIlIIIlIl;
        }
        return null;
    }

    private boolean ex() {
        if (bj.llIlIlllIIIlII(Inventory.contains(item -> {
            int n2;
            if (bj.llIlIllIllllll(item.getName().contains(lIlIIIllIllI[lIlIIIllIlll[25]]) ? 1 : 0) && bj.llIlIlllIIIlII(item.getName().contains(lIlIIIllIllI[lIlIIIllIlll[26]]) ? 1 : 0) && bj.llIlIlllIIIllI(item.getId(), lIlIIIllIlll[27])) {
                n2 = lIlIIIllIlll[7];
                "".length();
                if (null != null) {
                    return ((0x5E ^ 0x1F ^ (0x1C ^ 0x19)) & (0x33 ^ 0x47 ^ (0x77 ^ 0x47) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIIIllIlll[8];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            if (bj.llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                this.co.x();
                "".length();
                return lIlIIIllIlll[7];
            }
            TileObject lllllllllllllllIllIlllllIIlllIll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bj.llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[24]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIllIlll[7]];
                    stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[14]];
                    if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIllIlll[7];
                        "".length();
                        if (null == null) return n2 != 0;
                        return ((0xF9 ^ 0xBB) & ~(0x5E ^ 0x1C)) != 0;
                    }
                }
                n2 = lIlIIIllIlll[8];
                return n2 != 0;
            });
            if (bj.llIlIlllIIIIII(lllllllllllllllIllIlllllIIlllIll)) {
                return lIlIIIllIlll[8];
            }
            lllllllllllllllIllIlllllIIlllIll.interact(lIlIIIllIllI[lIlIIIllIlll[20]]);
            return lIlIIIllIlll[7];
        }
        String[] stringArray = new String[lIlIIIllIlll[7]];
        stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[21]];
        if (bj.llIlIlllIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (bj.llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                bj lllllllllllllllIllIlllllIIllllII;
                lllllllllllllllIllIlllllIIllllII.co.x();
                "".length();
                return lIlIIIllIlll[7];
            }
            TileObject lllllllllllllllIllIlllllIIlllIll = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bj.llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[22]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIllIlll[7]];
                    stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[23]];
                    if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIllIlll[7];
                        "".length();
                        if (" ".length() <= "  ".length()) return n2 != 0;
                        return ((0xF2 ^ 0xAD) & ~(0xD0 ^ 0x8F)) != 0;
                    }
                }
                n2 = lIlIIIllIlll[8];
                return n2 != 0;
            });
            if (bj.llIlIlllIIIIII(lllllllllllllllIllIlllllIIlllIll)) {
                return lIlIIIllIlll[8];
            }
            lllllllllllllllIllIlllllIIlllIll.interact(lIlIIIllIllI[lIlIIIllIlll[19]]);
            return lIlIIIllIlll[7];
        }
        return lIlIIIllIlll[8];
    }

    static {
        bj.llIlIllIllllIl();
        bj.llIlIllIllllII();
    }

    private static String llIlIllIlllIlI(String lllllllllllllllIllIlllllIIIIlIII, String lllllllllllllllIllIlllllIIIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIlllllIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllllIIIIIlll.getBytes(StandardCharsets.UTF_8)), lIlIIIllIlll[20]), "DES");
            Cipher lllllllllllllllIllIlllllIIIIllII = Cipher.getInstance("DES");
            lllllllllllllllIllIlllllIIIIllII.init(lIlIIIllIlll[9], lllllllllllllllIllIlllllIIIIllIl);
            return new String(lllllllllllllllIllIlllllIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllllIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlllllIIIIlIll) {
            lllllllllllllllIllIlllllIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static String llIlIllIlllIIl(String lllllllllllllllIllIlllllIIIlIlIl, String lllllllllllllllIllIlllllIIIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIlllllIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllllIIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlllllIIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlllllIIIllIIl.init(lIlIIIllIlll[9], lllllllllllllllIllIlllllIIIllIlI);
            return new String(lllllllllllllllIllIlllllIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllllIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlllllIIIllIII) {
            lllllllllllllllIllIlllllIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlllIIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlllIIIIII(Object object) {
        return object == null;
    }

    private static void llIlIllIllllII() {
        lIlIIIllIllI = new String[lIlIIIllIlll[37]];
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[8]] = bj.llIlIllIlllIIl("4qLDo9u2whoilSBEPU1GjLqpoIcp5t3l0+ssa6TyQuMolqXVa/tOladwJ9X2JI/qXU1Cc6tVXHY=", "MZsVS");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[7]] = bj.llIlIllIlllIlI("hI1YSyXY5C5c5Q4etUN9Rw==", "cIkPR");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[9]] = bj.llIlIllIlllIll("AjUELwso", "CApNh");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[12]] = bj.llIlIllIlllIll("JjgeJjA=", "jQyND");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[13]] = bj.llIlIllIlllIll("IBoVMw==", "crzCC");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[6]] = bj.llIlIllIlllIll("CQUHBCY=", "LksaT");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[15]] = bj.llIlIllIlllIlI("AEP0YofuZseh8GMlCbAk8jRp6pCeK8vM", "rxbDr");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[16]] = bj.llIlIllIlllIIl("vY3/GDekR4jZNc5OARVM7Q==", "ztrAA");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[20]] = bj.llIlIllIlllIll("ES07IA==", "ELPEF");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[21]] = bj.llIlIllIlllIIl("X8V6J2pUyWVygrPVDQNH7A==", "gCLeq");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[19]] = bj.llIlIllIlllIll("EC4BPQ==", "DOjXJ");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[22]] = bj.llIlIllIlllIlI("88fF9JJzW/zpdvQsd3KDSw==", "tUiAZ");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[23]] = bj.llIlIllIlllIlI("Fs+FXGLWMoQ=", "zSCrm");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[24]] = bj.llIlIllIlllIIl("lBeobI3NEGE2cf1OH3fG/w==", "KWNyO");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[14]] = bj.llIlIllIlllIlI("GRjOLA0MV3M=", "NfPwk");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[25]] = bj.llIlIllIlllIIl("OsbPnNcsgVI=", "CQAdP");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[26]] = bj.llIlIllIlllIlI("ZYECeKu8+Jk=", "HZTYK");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[28]] = bj.llIlIllIlllIll("BwUpBzYwAQ==", "WdZtW");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[29]] = bj.llIlIllIlllIIl("jCzrYnUmBmg=", "YosJY");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[30]] = bj.llIlIllIlllIIl("TjLYGL1R9+MO+pm2/HLUxw==", "myfEe");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[31]] = bj.llIlIllIlllIll("GBIIIDk0Hwk=", "QqmFP");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[32]] = bj.llIlIllIlllIlI("P9yv7ybkzAU=", "HTlsG");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[33]] = bj.llIlIllIlllIlI("j8afJQrBK/Y=", "gCPlN");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[34]] = bj.llIlIllIlllIlI("xsX8zuv5qL4=", "DYgAR");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[35]] = bj.llIlIllIlllIll("DyYkPSI=", "COCUV");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[36]] = bj.llIlIllIlllIIl("MNAk9DbH94sPJm88DNzfXg==", "nCSyG");
        bj.lIlIIIllIllI[bj.lIlIIIllIlll[11]] = bj.llIlIllIlllIll("OyYfJQsXKx4=", "rEzCb");
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (bj.llIlIllIllllll(tileObject.getName().equals(lIlIIIllIllI[lIlIIIllIlll[28]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIllIlll[7]];
                stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[29]];
                if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0) && bj.llIlIllIllllll(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIllIlll[7];
                    "".length();
                    if (((135 + 79 - 141 + 67 ^ 154 + 172 - 152 + 8) & (0x13 ^ 0x15 ^ (0x86 ^ 0xBA) ^ -" ".length())) < " ".length()) return n2 != 0;
                    return ((78 + 84 - 144 + 180 ^ 19 + 144 - 47 + 31) & (64 + 87 - 38 + 36 ^ 130 + 73 - 196 + 185 ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIIIllIlll[8];
            return n2 != 0;
        });
    }

    private static boolean llIlIlllIIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIlIllIllllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllIlllllI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        bj lllllllllllllllIllIlllllIlIIIIII;
        if (bj.llIlIllIllllll(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (bj.llIlIlllIIIIIl(Movement.getDestination()) && bj.llIlIllIllllll(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIIllIlll[8];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlllllIlIIIIII.al.bs);
            return lIlIIIllIlll[7];
        }
        TileObject lllllllllllllllIllIlllllIIllllll = lllllllllllllllIllIlllllIlIIIIII.cR();
        if (bj.llIlIlllIIIIII(lllllllllllllllIllIlllllIIllllll)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlllllIlIIIIII.ak.bq.dx(lIlIIIllIlll[14]).dy(lIlIIIllIlll[14]));
            return lIlIIIllIlll[7];
        }
        if (!bj.llIlIlllIIIlII(lllllllllllllllIllIlllllIlIIIIII.bS.isMoving() ? 1 : 0) || bj.llIlIllIllllll(lllllllllllllllIllIlllllIlIIIIII.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIllIlll[8];
        }
        var1_1.interact(lIlIIIllIllI[lIlIIIllIlll[6]]);
        return lIlIIIllIlll[7];
    }

    private static boolean llIlIlllIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIlIllIlllIll(String lllllllllllllllIllIllllIlllllIlI, String lllllllllllllllIllIllllIllllIlII) {
        lllllllllllllllIllIllllIlllllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIllIllllIlllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllllIlllllIII = new StringBuilder();
        char[] lllllllllllllllIllIllllIllllIlll = lllllllllllllllIllIllllIllllIlII.toCharArray();
        int lllllllllllllllIllIllllIllllIllI = lIlIIIllIlll[8];
        char[] lllllllllllllllIllIllllIllllIIII = lllllllllllllllIllIllllIlllllIlI.toCharArray();
        int lllllllllllllllIllIllllIlllIllll = lllllllllllllllIllIllllIllllIIII.length;
        int lllllllllllllllIllIllllIlllIlllI = lIlIIIllIlll[8];
        while (bj.llIlIlllIIIIlI(lllllllllllllllIllIllllIlllIlllI, lllllllllllllllIllIllllIlllIllll)) {
            char lllllllllllllllIllIllllIlllllIll = lllllllllllllllIllIllllIllllIIII[lllllllllllllllIllIllllIlllIlllI];
            lllllllllllllllIllIllllIlllllIII.append((char)(lllllllllllllllIllIllllIlllllIll ^ lllllllllllllllIllIllllIllllIlll[lllllllllllllllIllIllllIllllIllI % lllllllllllllllIllIllllIllllIlll.length]));
            "".length();
            ++lllllllllllllllIllIllllIllllIllI;
            ++lllllllllllllllIllIllllIlllIlllI;
            "".length();
            if ("  ".length() == "  ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIllllIlllllIII);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void lllllllllllllllIllIlllllIlIIllIl;
        bj lllllllllllllllIllIlllllIlIlIIII;
        void lllllllllllllllIllIlllllIlIIlllI;
        void lllllllllllllllIllIlllllIlIIllll;
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIllIllI[lIlIIIllIlll[11]]));
        NPC nPC3 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIllIllI[lIlIIIllIlll[36]]));
        int n2 = lIlIIIllIlll[4] - this.co.K() + (lIlIIIllIlll[5] - Skills.getLevel((Skill)Skill.WOODCUTTING)) / lIlIIIllIlll[6];
        if (bj.llIlIllIlllllI(n2) && bj.llIlIllIllllll(this.ex() ? 1 : 0)) {
            return lIlIIIllIlll[7];
        }
        if (bj.llIlIlllIIIIII(lllllllllllllllIllIlllllIlIIllll) && bj.llIlIlllIIIIII(lllllllllllllllIllIlllllIlIIlllI)) {
            return lllllllllllllllIllIlllllIlIlIIII.cS();
        }
        if (bj.llIlIlllIIIIIl(lllllllllllllllIllIlllllIlIIlllI) && bj.llIlIllIllllll(lllllllllllllllIllIlllllIlIIlllI.isDead() ? 1 : 0)) {
            System.out.println(lIlIIIllIllI[lIlIIIllIlll[8]]);
            lllllllllllllllIllIlllllIlIlIIII.co.g(lIlIIIllIlll[5]);
        }
        if (bj.llIlIlllIIIIII(lllllllllllllllIllIlllllIlIIllll)) {
            Projectile lllllllllllllllIllIlllllIlIIllII = Projectiles.getNearest(projectile -> {
                int n2;
                if (bj.llIlIlllIIIlll(projectile.getId(), lIlIIIllIlll[3]) && bj.llIlIllIllllll(this.bS.getWorldLocation().createWorldArea(lIlIIIllIlll[7]).toWorldPointList().contains(WorldPoint.fromLocal((Client)this.cq, (LocalPoint)projectile.getTarget())) ? 1 : 0)) {
                    n2 = lIlIIIllIlll[7];
                    "".length();
                    if (null != null) {
                        return ((0x34 ^ 0x60) & ~(0x1E ^ 0x4A)) != 0;
                    }
                } else {
                    n2 = lIlIIIllIlll[8];
                }
                return n2 != 0;
            });
            if (bj.llIlIlllIIIIII(lllllllllllllllIllIlllllIlIIllII)) {
                if (bj.llIlIlllIIIIIl(lllllllllllllllIllIlllllIlIlIIII.bS.getInteracting()) && bj.llIlIllIllllll(lllllllllllllllIllIlllllIlIlIIII.bS.getInteracting().getName().contains(lIlIIIllIllI[lIlIIIllIlll[7]]) ? 1 : 0)) {
                    return lIlIIIllIlll[8];
                }
                lllllllllllllllIllIlllllIlIIlllI.interact(lIlIIIllIllI[lIlIIIllIlll[9]]);
                return lIlIIIllIlll[7];
            }
            System.out.println(WorldPoint.fromLocal((Client)lllllllllllllllIllIlllllIlIlIIII.cq, (LocalPoint)lllllllllllllllIllIlllllIlIIllII.getTarget()));
            System.out.println(lllllllllllllllIllIlllllIlIlIIII.bS.getWorldLocation());
            Movement.setDestination((WorldPoint)lllllllllllllllIllIlllllIlIlIIII.cX());
            return lIlIIIllIlll[7];
        }
        if (bj.llIlIllIlllllI((int)lllllllllllllllIllIlllllIlIIllIl)) {
            TileObject lllllllllllllllIllIlllllIlIIlIll2;
            int[] nArray = new int[lIlIIIllIlll[7]];
            nArray[bj.lIlIIIllIlll[8]] = lIlIIIllIlll[10];
            int lllllllllllllllIllIlllllIlIIllII = Inventory.getCount((boolean)lIlIIIllIlll[7], (int[])nArray);
            if (!bj.llIlIlllIIIIlI(lllllllllllllllIllIlllllIlIIllII, (int)lllllllllllllllIllIlllllIlIIllIl) || bj.llIlIlllIIIIll(lllllllllllllllIllIlllllIlIIllII, lIlIIIllIlll[11])) {
                TileObject lllllllllllllllIllIlllllIlIIlIll2 = TileObjects.getNearest(tileObject -> {
                    int n2;
                    if (bj.llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[34]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIllIlll[7]];
                        stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[35]];
                        if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                            n2 = lIlIIIllIlll[7];
                            "".length();
                            if (-"  ".length() <= 0) return n2 != 0;
                            return ((0x1D ^ 0x58 ^ (0x4C ^ 0x1B)) & (0x54 ^ 5 ^ (0x27 ^ 0x64) ^ -" ".length())) != 0;
                        }
                    }
                    n2 = lIlIIIllIlll[8];
                    return n2 != 0;
                });
                if (bj.llIlIlllIIIIII(lllllllllllllllIllIlllllIlIIlIll2)) {
                    return lIlIIIllIlll[8];
                }
                if (!bj.llIlIlllIIIlII(lllllllllllllllIllIlllllIlIlIIII.bS.isMoving() ? 1 : 0) || bj.llIlIllIllllll(lllllllllllllllIllIlllllIlIlIIII.bS.isAnimating() ? 1 : 0)) {
                    return lIlIIIllIlll[8];
                }
                lllllllllllllllIllIlllllIlIIlIll2.interact(lIlIIIllIllI[lIlIIIllIlll[12]]);
                return lIlIIIllIlll[7];
            }
            if (bj.llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIIllIlll[7]];
                nArray2[bj.lIlIIIllIlll[8]] = lIlIIIllIlll[10];
                if (bj.llIlIlllIIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    lllllllllllllllIllIlllllIlIlIIII.co.x();
                    "".length();
                    return lIlIIIllIlll[7];
                }
            }
            if (bj.llIlIlllIIIIII(lllllllllllllllIllIlllllIlIIlIll2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (bj.llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[32]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIllIlll[7]];
                    stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[33]];
                    if (bj.llIlIllIllllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIllIlll[7];
                        "".length();
                        if ("   ".length() > "  ".length()) return n2 != 0;
                        return ((0xA6 ^ 0xAA ^ (0x4D ^ 9)) & (7 + 31 - 1 + 215 ^ 23 + 167 - 123 + 113 ^ -" ".length())) != 0;
                    }
                }
                n2 = lIlIIIllIlll[8];
                return n2 != 0;
            }))) {
                return lIlIIIllIlll[8];
            }
            if (!bj.llIlIlllIIIlII(lllllllllllllllIllIlllllIlIlIIII.bS.isMoving() ? 1 : 0) || bj.llIlIllIllllll(lllllllllllllllIllIlllllIlIlIIII.bS.isAnimating() ? 1 : 0)) {
                return lIlIIIllIlll[8];
            }
            lllllllllllllllIllIlllllIlIIlIll2.interact(lIlIIIllIllI[lIlIIIllIlll[13]]);
        }
        return lIlIIIllIlll[7];
    }

    private static boolean llIlIlllIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private WorldPoint cX() {
        System.out.println(lIlIIIllIllI[lIlIIIllIlll[15]]);
        String[] stringArray = new String[lIlIIIllIlll[7]];
        stringArray[bj.lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[16]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        List list = new WorldArea(nPC.getWorldLocation().dx(lIlIIIllIlll[17]).dy(lIlIIIllIlll[17]), lIlIIIllIlll[15], lIlIIIllIlll[15]).toWorldPointList();
        List list2 = new WorldArea(nPC.getWorldLocation().dx(lIlIIIllIlll[18]).dy(lIlIIIllIlll[18]), lIlIIIllIlll[19], lIlIIIllIlll[19]).toWorldPointList();
        list2.removeIf(worldPoint -> list.contains(worldPoint));
        "".length();
        WorldPoint worldPoint2 = list2.stream().filter(worldPoint -> {
            int n2;
            if (bj.llIlIllIllllll(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && bj.llIlIlllIIIIIl(Projectiles.getNearest(projectile -> {
                int n2;
                if (bj.llIlIlllIIIlll(projectile.getId(), lIlIIIllIlll[3]) && bj.llIlIlllIIIlII(worldPoint.createWorldArea(lIlIIIllIlll[7]).contains(WorldPoint.fromLocal((Client)this.cq, (LocalPoint)projectile.getTarget())) ? 1 : 0)) {
                    n2 = lIlIIIllIlll[7];
                    "".length();
                    if ("   ".length() < " ".length()) {
                        return ((0x29 ^ 0x6F) & ~(0x2D ^ 0x6B)) != 0;
                    }
                } else {
                    n2 = lIlIIIllIlll[8];
                }
                return n2 != 0;
            }))) {
                n2 = lIlIIIllIlll[7];
                "".length();
                if ("   ".length() == 0) {
                    return ((0x46 ^ 0x67) & ~(0xA6 ^ 0x87)) != 0;
                }
            } else {
                n2 = lIlIIIllIlll[8];
            }
            return n2 != 0;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.bS))).orElse(null);
        System.out.println("Safespot: " + String.valueOf(worldPoint2) + " | player: " + String.valueOf(this.bS.getWorldLocation()));
        return worldPoint2;
    }

    private static boolean llIlIlllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public EquipmentSetup cj() {
        return s.b(s.e(N.ICE_DEMON));
    }

    private static void llIlIllIllllIl() {
        lIlIIIllIlll = new int[38];
        bj.lIlIIIllIlll[0] = -" ".length();
        bj.lIlIIIllIlll[1] = -(0xFFFFDBDB & 0x2F66) & (0xFFFFFF7F & 0x7FEF);
        bj.lIlIIIllIlll[2] = 0xFFFFFDB7 & 0x1FFB;
        bj.lIlIIIllIlll[3] = -(0xFFFFD591 & 0x3A7F) & (0xFFFFBF7D & 0x55BE);
        bj.lIlIIIllIlll[4] = 2 + 157 - 136 + 158 ^ 130 + 112 - 121 + 10;
        bj.lIlIIIllIlll[5] = 157 + 246 - 368 + 217 ^ 114 + 137 - 114 + 15;
        bj.lIlIIIllIlll[6] = 0 + 41 - 39 + 138 ^ 41 + 52 - 17 + 61;
        bj.lIlIIIllIlll[7] = " ".length();
        bj.lIlIIIllIlll[8] = (165 + 96 - 188 + 108 ^ 100 + 17 - -10 + 58) & (87 + 57 - 8 + 50 ^ 169 + 28 - 129 + 114 ^ -" ".length());
        bj.lIlIIIllIlll[9] = "  ".length();
        bj.lIlIIIllIlll[10] = 0xFFFFF3FF & 0x5D3F;
        bj.lIlIIIllIlll[11] = 0x66 ^ 0x7C;
        bj.lIlIIIllIlll[12] = "   ".length();
        bj.lIlIIIllIlll[13] = 159 + 87 - 196 + 125 ^ 147 + 49 - 59 + 34;
        bj.lIlIIIllIlll[14] = 67 + 151 - 183 + 134 ^ 138 + 56 - 117 + 90;
        bj.lIlIIIllIlll[15] = 37 + 34 - -43 + 69 ^ 90 + 5 - 86 + 168;
        bj.lIlIIIllIlll[16] = 93 + 20 - 73 + 101 ^ 4 + 15 - 18 + 137;
        bj.lIlIIIllIlll[17] = -"  ".length();
        bj.lIlIIIllIlll[18] = -(0xA9 ^ 0xB1 ^ (0x31 ^ 0x2D));
        bj.lIlIIIllIlll[19] = 0x26 ^ 0x2C;
        bj.lIlIIIllIlll[20] = 0xB5 ^ 0xBD;
        bj.lIlIIIllIlll[21] = 0x77 ^ 0x7E;
        bj.lIlIIIllIlll[22] = 0x58 ^ 0x53;
        bj.lIlIIIllIlll[23] = 0x4F ^ 0x56 ^ (0x55 ^ 0x40);
        bj.lIlIIIllIlll[24] = 0x64 ^ 0x69;
        bj.lIlIIIllIlll[25] = 0x39 ^ 0x7C ^ (0x7F ^ 0x35);
        bj.lIlIIIllIlll[26] = 0xB1 ^ 0xA1;
        bj.lIlIIIllIlll[27] = 0xFFFFFDCE & 0x72BB;
        bj.lIlIIIllIlll[28] = 0xB9 ^ 0xA8;
        bj.lIlIIIllIlll[29] = 98 + 5 - 90 + 128 ^ 104 + 23 - 47 + 79;
        bj.lIlIIIllIlll[30] = 0x16 ^ 0x36 ^ (0x8F ^ 0xBC);
        bj.lIlIIIllIlll[31] = 29 + 104 - 129 + 126 ^ 35 + 59 - 71 + 127;
        bj.lIlIIIllIlll[32] = 1 ^ 0x14;
        bj.lIlIIIllIlll[33] = 0x8E ^ 0x98;
        bj.lIlIIIllIlll[34] = 0x53 ^ 0x44;
        bj.lIlIIIllIlll[35] = 0x6C ^ 0x74;
        bj.lIlIIIllIlll[36] = 64 + 72 - 71 + 79 ^ 82 + 22 - 71 + 104;
        bj.lIlIIIllIlll[37] = 0x99 ^ 0x82;
    }
}

