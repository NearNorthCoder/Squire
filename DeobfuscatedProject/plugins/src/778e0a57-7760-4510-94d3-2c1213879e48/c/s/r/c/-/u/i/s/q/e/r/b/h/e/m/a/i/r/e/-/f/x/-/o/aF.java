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
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aG;
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
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

@TaskDesc(name="Vasa", priority=10000, blocking=true)
public class aF
extends U {
    private /* synthetic */ int dB;
    private /* synthetic */ NPC dQ;
    private /* synthetic */ WorldPoint dR;
    private /* synthetic */ n ak;
    private /* synthetic */ int am;
    private /* synthetic */ n al;
    private static /* synthetic */ int[] lIlIIIIIIIlI;
    private /* synthetic */ NPC dP;
    private static /* synthetic */ String[] lIlIIIIIIIIl;

    private static void llIlIIlllIIIIl() {
        lIlIIIIIIIIl = new String[lIlIIIIIIIlI[25]];
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[1]] = aF.llIlIIllIllllI("AUc+z2d5n/8=", "YYgCO");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[2]] = aF.llIlIIllIlllll("S2Tn/Tp1S/M=", "YtMGt");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[4]] = aF.llIlIIllIllllI("xmHx/7M/LCOsTG6xZiwwF8YwkaakvUt6ijQ1bZbJcQU=", "QIBdi");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[6]] = aF.llIlIIllIlllll("auZ++SoxCP0=", "VEnQF");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[7]] = aF.llIlIIlllIIIII("OBAnEzcSDT0V", "ydSrT");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[9]] = aF.llIlIIllIllllI("EvDr7CYUNy4=", "dIrDw");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[10]] = aF.llIlIIllIlllll("wnHxI9SVW8EKsrWyrUotaQ==", "uVxsP");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[13]] = aF.llIlIIllIllllI("PJ/qZK4l9I9uNCM8kh50wA==", "kqIWQ");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[14]] = aF.llIlIIllIlllll("xNsWHFTPia8=", "ieATc");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[15]] = aF.llIlIIllIllllI("uHZkA3U10Gg=", "NyNjo");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[16]] = aF.llIlIIlllIIIII("HSIhGjZiNA==", "EGSsU");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[17]] = aF.llIlIIlllIIIII("MBAlJw==", "VyWBQ");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[18]] = aF.llIlIIlllIIIII("DyQnBQE=", "LVHvr");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[19]] = aF.llIlIIllIllllI("o3RMpUjwksw=", "bgZvi");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[20]] = aF.llIlIIllIllllI("xetxJR7puW4=", "GaETv");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[3]] = aF.llIlIIllIllllI("LDH6s8xAlhpdVaXlXBc9xQ==", "nqLaV");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[5]] = aF.llIlIIllIlllll("ltEBvqTDbxI=", "VTcFF");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[21]] = aF.llIlIIlllIIIII("JTkUKjcSPQ==", "uXgYV");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[22]] = aF.llIlIIlllIIIII("NiY1JgQ=", "sHACv");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[23]] = aF.llIlIIllIlllll("67WXCjnCVhc=", "mLSUP");
        aF.lIlIIIIIIIIl[aF.lIlIIIIIIIlI[24]] = aF.llIlIIlllIIIII("ECglJBw=", "BGFOo");
    }

    private static void llIlIIlllIIIlI() {
        lIlIIIIIIIlI = new int[26];
        aF.lIlIIIIIIIlI[0] = -" ".length();
        aF.lIlIIIIIIIlI[1] = (0xB5 ^ 0x87 ^ (0x94 ^ 0x87)) & (0x3A ^ 0 ^ (0x40 ^ 0x5B) ^ -" ".length());
        aF.lIlIIIIIIIlI[2] = " ".length();
        aF.lIlIIIIIIIlI[3] = 0xDF ^ 0x97 ^ (0xF3 ^ 0xB4);
        aF.lIlIIIIIIIlI[4] = "  ".length();
        aF.lIlIIIIIIIlI[5] = 0x45 ^ 0x55;
        aF.lIlIIIIIIIlI[6] = "   ".length();
        aF.lIlIIIIIIIlI[7] = 0xA7 ^ 0xA3;
        aF.lIlIIIIIIIlI[8] = -(0xFFFFB203 & 0x7FFD) & (0xFFFFB7B7 & 0x7F79);
        aF.lIlIIIIIIIlI[9] = 0xAF ^ 0xAA;
        aF.lIlIIIIIIIlI[10] = 0xAA ^ 0xB0 ^ (0xA7 ^ 0xBB);
        aF.lIlIIIIIIIlI[11] = -(0xFFFFE70F & 0x3CF9) & (0xFFFFFDDF & 0x7FEA);
        aF.lIlIIIIIIIlI[12] = 0xFFFFFFFD & 0x2E73;
        aF.lIlIIIIIIIlI[13] = 6 ^ 9 ^ (0xBE ^ 0xB6);
        aF.lIlIIIIIIIlI[14] = 10 + 118 - 68 + 93 ^ 28 + 29 - -70 + 18;
        aF.lIlIIIIIIIlI[15] = 0xA8 ^ 0xA1;
        aF.lIlIIIIIIIlI[16] = 7 ^ 0xD;
        aF.lIlIIIIIIIlI[17] = 0xD7 ^ 0xAB ^ (0xB6 ^ 0xC1);
        aF.lIlIIIIIIIlI[18] = 0x93 ^ 0x9F;
        aF.lIlIIIIIIIlI[19] = 90 + 130 - 72 + 26 ^ 90 + 43 - 78 + 108;
        aF.lIlIIIIIIIlI[20] = 0x90 ^ 0x86 ^ (0x4B ^ 0x53);
        aF.lIlIIIIIIIlI[21] = 0x93 ^ 0x82;
        aF.lIlIIIIIIIlI[22] = 0x74 ^ 0x66;
        aF.lIlIIIIIIIlI[23] = 51 + 183 - 64 + 19 ^ 37 + 169 - 40 + 8;
        aF.lIlIIIIIIIlI[24] = 0x81 ^ 0xBD ^ (0xA4 ^ 0x8C);
        aF.lIlIIIIIIIlI[25] = 81 + 86 - 101 + 113 ^ 85 + 42 - 65 + 104;
    }

    private boolean cT() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aF.llIlIIlllIIlII(tileObject.getName().toLowerCase().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[17]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIIlI[2]];
                stringArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[18]];
                if (aF.llIlIIlllIIlII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[2];
                    "".length();
                    if (-"   ".length() <= 0) return n2 != 0;
                    return ((0x49 ^ 0x77) & ~(7 ^ 0x39)) != 0;
                }
            }
            n2 = lIlIIIIIIIlI[1];
            return n2 != 0;
        });
        if (aF.llIlIIlllIIlll(tileObject2)) {
            System.out.println(lIlIIIIIIIIl[lIlIIIIIIIlI[13]]);
            return lIlIIIIIIIlI[1];
        }
        tileObject2.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[14]]);
        return lIlIIIIIIIlI[2];
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        NPC nPC2 = NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[23]]));
        if (aF.llIlIIlllIIlll(nPC2)) {
            return null;
        }
        List list = Prayers.getOffensive();
        Prayer prayer = Prayer.PROTECT_FROM_MISSILES;
        arrayList.add(prayer);
        "".length();
        arrayList.addAll(list);
        "".length();
        return arrayList;
    }

    private static boolean llIlIIlllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private NPC de() {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (aF.llIlIIlllIIlII(nPC.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIIlI[2]];
                stringArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[5]];
                if (aF.llIlIIlllIIlII(nPC.hasAction(stringArray) ? 1 : 0) && aF.llIlIIlllIIlII(this.ak.a((Locatable)nPC) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[2];
                    "".length();
                    if (" ".length() < (9 ^ 0xD)) return n2 != 0;
                    return ((0x91 ^ 0xAD) & ~(4 ^ 0x38)) != 0;
                }
            }
            n2 = lIlIIIIIIIlI[1];
            return n2 != 0;
        });
    }

    private void dg() {
        WorldPoint worldPoint = this.ak.bq;
    }

    private static String llIlIIllIlllll(String lllllllllllllllIlllIIlIllllIIIlI, String lllllllllllllllIlllIIlIlllIlllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlIllllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIlllIlllll.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIIlI[14]), "DES");
            Cipher lllllllllllllllIlllIIlIllllIIlII = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlIllllIIlII.init(lIlIIIIIIIlI[4], lllllllllllllllIlllIIlIllllIIlIl);
            return new String(lllllllllllllllIlllIIlIllllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlIllllIIIll) {
            lllllllllllllllIlllIIlIllllIIIll.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ int c(NPC nPC, Object object) {
        return nPC.getWorldArea().distanceTo((WorldPoint)object);
    }

    private static boolean llIlIIlllIllII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean dj() {
        aF lllllllllllllllIlllIIllIIIlIlllI;
        void lllllllllllllllIlllIIllIIIlIllIl;
        NPC nPC = this.df();
        if (aF.llIlIIlllIIlll(nPC)) {
            return lIlIIIIIIIlI[1];
        }
        if (aF.llIlIIlllIlIlI(lllllllllllllllIlllIIllIIIlIllIl.getAnimation(), lIlIIIIIIIlI[0])) {
            System.out.print(lIlIIIIIIIIl[lIlIIIIIIIlI[10]]);
            return lIlIIIIIIIlI[1];
        }
        if (aF.llIlIIlllIlIll(lllllllllllllllIlllIIllIIIlIllIl.getWorldArea().distanceTo((Locatable)lllllllllllllllIlllIIllIIIlIlllI.bS), lIlIIIIIIIlI[6])) {
            WorldPoint lllllllllllllllIlllIIllIIIlIllII = lllllllllllllllIlllIIllIIIlIlllI.bS.getWorldLocation().createWorldArea(lIlIIIIIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).max(Comparator.comparingInt(arg_0 -> aF.c((NPC)lllllllllllllllIlllIIllIIIlIllIl, arg_0)).thenComparingDouble(object -> -this.bS.distanceTo((WorldPoint)object))).orElse(null);
            if (aF.llIlIIlllIIlll(lllllllllllllllIlllIIllIIIlIllII)) {
                return lIlIIIIIIIlI[1];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIllIIIlIllII);
            return lIlIIIIIIIlI[2];
        }
        return lIlIIIIIIIlI[1];
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (aF.llIlIIlllIIlII(tileObject.getName().equals(lIlIIIIIIIIl[lIlIIIIIIIlI[21]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIIlI[2]];
                stringArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[22]];
                if (aF.llIlIIlllIIlII(tileObject.hasAction(stringArray) ? 1 : 0) && aF.llIlIIlllIIlII(this.ak.a((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[2];
                    "".length();
                    if (((0x2A ^ 0x7F ^ (0x2C ^ 0x39)) & (127 + 189 - 102 + 33 ^ 19 + 58 - 27 + 133 ^ -" ".length())) < (0x5D ^ 0x15 ^ (0x5A ^ 0x16))) return n2 != 0;
                    return ((0xBD ^ 0xB2 ^ (0x38 ^ 0xC)) & (211 + 198 - 275 + 116 ^ 127 + 123 - 117 + 60 ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIIIIIIIlI[1];
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    private boolean j(boolean bl2) {
        WorldPoint lllllllllllllllIlllIIllIIIlllllI;
        aF lllllllllllllllIlllIIllIIlIIIlII;
        void lllllllllllllllIlllIIllIIlIIIIll;
        this.dP = this.df();
        if (aF.llIlIIlllIIlll(this.dP)) {
            return lIlIIIIIIIlI[1];
        }
        if (aF.llIlIIlllIIlII((int)lllllllllllllllIlllIIllIIlIIIIll) && aF.llIlIIlllIIlII(lllllllllllllllIlllIIllIIlIIIlII.di() ? 1 : 0)) {
            System.out.println(lIlIIIIIIIIl[lIlIIIIIIIlI[4]]);
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIllIIlIIIlII.dd());
            return lIlIIIIIIIlI[2];
        }
        if (aF.llIlIIlllIlIII(lllllllllllllllIlllIIllIIlIIIlII.cq.getTickCount() - lllllllllllllllIlllIIllIIlIIIlII.dB, lIlIIIIIIIlI[2])) {
            lllllllllllllllIlllIIllIIlIIIlII.dP.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[6]]);
            lllllllllllllllIlllIIllIIlIIIlII.dB = lllllllllllllllIlllIIllIIlIIIlII.cq.getTickCount();
            lllllllllllllllIlllIIllIIlIIIlII.dR = lllllllllllllllIlllIIllIIlIIIlII.bS.getWorldLocation();
            System.out.println(lIlIIIIIIIIl[lIlIIIIIIIlI[7]]);
            return lIlIIIIIIIlI[2];
        }
        ArrayList lllllllllllllllIlllIIllIIlIIIIlI = new ArrayList();
        lllllllllllllllIlllIIllIIlIIIIlI.addAll(lllllllllllllllIlllIIllIIlIIIlII.dR.createWorldArea(lIlIIIIIIIlI[2]).toWorldPointList());
        "".length();
        int[] nArray = new int[lIlIIIIIIIlI[2]];
        nArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIlI[8];
        List lllllllllllllllIlllIIllIIlIIIIIl = Projectiles.getAll((int[])nArray);
        WorldPoint lllllllllllllllIlllIIllIIlIIIIII = lllllllllllllllIlllIIllIIlIIIIIl.iterator();
        while (aF.llIlIIlllIIlII(lllllllllllllllIlllIIllIIlIIIIII.hasNext() ? 1 : 0)) {
            Projectile lllllllllllllllIlllIIllIIIllllll = (Projectile)lllllllllllllllIlllIIllIIlIIIIII.next();
            if (aF.llIlIIlllIIlll(lllllllllllllllIlllIIllIIIllllll)) {
                "".length();
                if (null == null) continue;
                return ((0xC0 ^ 0x83) & ~(0x69 ^ 0x2A)) != 0;
            }
            lllllllllllllllIlllIIllIIIlllllI = WorldPoint.fromLocal((Client)lllllllllllllllIlllIIllIIlIIIlII.cq, (LocalPoint)lllllllllllllllIlllIIllIIIllllll.getTarget());
            lllllllllllllllIlllIIllIIlIIIIlI.addAll(lllllllllllllllIlllIIllIIIlllllI.createWorldArea(lIlIIIIIIIlI[2]).toWorldPointList());
            "".length();
            "".length();
            if ("  ".length() <= "  ".length()) continue;
            return ((0x2B ^ 0x35) & ~(0x34 ^ 0x2A)) != 0;
        }
        if (aF.llIlIIlllIIlII(lllllllllllllllIlllIIllIIlIIIIlI.contains(lllllllllllllllIlllIIllIIlIIIlII.bS.getWorldLocation()) ? 1 : 0)) {
            if (aF.llIlIIlllIIlII((int)lllllllllllllllIlllIIllIIlIIIIll)) {
                int n2;
                lllllllllllllllIlllIIllIIlIIIIII = lllllllllllllllIlllIIllIIlIIIlII.dd();
                if (aF.llIlIIlllIIlII(lllllllllllllllIlllIIllIIlIIIlII.cp.vasaToggle() ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[9];
                    "".length();
                    if (-" ".length() > 0) {
                        return ((0x9F ^ 0xAF ^ (0xF7 ^ 0x8F)) & (0x52 ^ 0x33 ^ (0x27 ^ 0xE) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIlIIIIIIIlI[7];
                }
                int lllllllllllllllIlllIIllIIIllllll = n2;
                lllllllllllllllIlllIIllIIIlllllI = lllllllllllllllIlllIIllIIlIIIlII.bS.getWorldLocation().createWorldArea(lIlIIIIIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
                    int n2;
                    if (aF.llIlIIlllIIlII(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aF.llIlIIlllIlIIl(lllllllllllllllIlllIIllIIlIIIIlI.contains(worldPoint) ? 1 : 0)) {
                        n2 = lIlIIIIIIIlI[2];
                        "".length();
                        if (((123 + 94 - 117 + 43 ^ 36 + 96 - 6 + 44) & (5 + 22 - -21 + 98 ^ 10 + 165 - 112 + 120 ^ -" ".length())) < -" ".length()) {
                            return ((0xAE ^ 0xC5 ^ (0x7F ^ 0x37)) & (0xE1 ^ 0x98 ^ (0x79 ^ 0x23) ^ -" ".length())) != 0;
                        }
                    } else {
                        n2 = lIlIIIIIIIlI[1];
                    }
                    return n2 != 0;
                }).min(Comparator.comparingInt(object -> Math.abs(lllllllllllllllIlllIIllIIIllllll - this.dP.getWorldArea().distanceTo((WorldPoint)object))).thenComparingInt(object -> ((WorldPoint)object).distanceToPath(this.cq, lllllllllllllllIlllIIllIIlIIIIII))).orElse(null);
                Movement.setDestination((WorldPoint)lllllllllllllllIlllIIllIIIlllllI);
                return lIlIIIIIIIlI[2];
            }
            lllllllllllllllIlllIIllIIlIIIIII = lllllllllllllllIlllIIllIIlIIIlII.bS.getWorldLocation().createWorldArea(lIlIIIIIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
                int n2;
                if (aF.llIlIIlllIIlII(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && aF.llIlIIlllIlIIl(lllllllllllllllIlllIIllIIlIIIIlI.contains(worldPoint) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[2];
                    "".length();
                    if (" ".length() <= ("  ".length() & ("  ".length() ^ -" ".length()))) {
                        return ((0xDC ^ 0x87 ^ (0x76 ^ 0x6A)) & (1 ^ 0x22 ^ (0x64 ^ 0) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = lIlIIIIIIIlI[1];
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> Math.abs(lIlIIIIIIIlI[7] - this.dP.getWorldArea().distanceTo(worldPoint)))).orElse(null);
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIllIIlIIIIII);
            return lIlIIIIIIIlI[2];
        }
        this.dP.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[9]]);
        return lIlIIIIIIIlI[2];
    }

    static {
        aF.llIlIIlllIIIlI();
        aF.llIlIIlllIIIIl();
    }

    private NPC df() {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (aF.llIlIIlllIIlII(nPC.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[19]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIIlI[2]];
                stringArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIIl[lIlIIIIIIIlI[20]];
                if (aF.llIlIIlllIIlII(nPC.hasAction(stringArray) ? 1 : 0) && aF.llIlIIlllIIlII(this.ak.a((Locatable)nPC) ? 1 : 0)) {
                    n2 = lIlIIIIIIIlI[2];
                    "".length();
                    if ((0x7E ^ 0x7A) == (0x8D ^ 0x89)) return n2 != 0;
                    return ((0x23 ^ 0x15) & ~(0xBD ^ 0x8B)) != 0;
                }
            }
            n2 = lIlIIIIIIIlI[1];
            return n2 != 0;
        });
    }

    private static boolean llIlIIlllIlIII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void var1_1;
        aF lllllllllllllllIlllIIllIIlIIllIl;
        if (aF.llIlIIlllIIlII(Reachable.isWalkable((WorldPoint)this.ak.bt) ? 1 : 0)) {
            if (aF.llIlIIlllIIlIl(Movement.getDestination()) && aF.llIlIIlllIIlII(Movement.getDestination().equals((Object)this.al.bt) ? 1 : 0)) {
                return lIlIIIIIIIlI[1];
            }
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIllIIlIIllIl.al.bs);
            return lIlIIIIIIIlI[2];
        }
        TileObject lllllllllllllllIlllIIllIIlIIllII = lllllllllllllllIlllIIllIIlIIllIl.cR();
        if (aF.llIlIIlllIIlll(lllllllllllllllIlllIIllIIlIIllII)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIllIIlIIllIl.ak.bq.dx(lIlIIIIIIIlI[5]).dy(lIlIIIIIIIlI[5]));
            return lIlIIIIIIIlI[2];
        }
        if (!aF.llIlIIlllIlIIl(lllllllllllllllIlllIIllIIlIIllIl.bS.isMoving() ? 1 : 0) || aF.llIlIIlllIIlII(lllllllllllllllIlllIIllIIlIIllIl.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIIIIIlI[1];
        }
        var1_1.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[2]]);
        return lIlIIIIIIIlI[2];
    }

    private static boolean llIlIIlllIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIlIIlllIIIII(String lllllllllllllllIlllIIlIlllllIlll, String lllllllllllllllIlllIIlIlllllIIIl) {
        lllllllllllllllIlllIIlIlllllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlIlllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIlIlllllIlIl = new StringBuilder();
        char[] lllllllllllllllIlllIIlIlllllIlII = lllllllllllllllIlllIIlIlllllIIIl.toCharArray();
        int lllllllllllllllIlllIIlIlllllIIll = lIlIIIIIIIlI[1];
        char[] lllllllllllllllIlllIIlIllllIllIl = lllllllllllllllIlllIIlIlllllIlll.toCharArray();
        int lllllllllllllllIlllIIlIllllIllII = lllllllllllllllIlllIIlIllllIllIl.length;
        int lllllllllllllllIlllIIlIllllIlIll = lIlIIIIIIIlI[1];
        while (aF.llIlIIlllIlIll(lllllllllllllllIlllIIlIllllIlIll, lllllllllllllllIlllIIlIllllIllII)) {
            char lllllllllllllllIlllIIlIllllllIII = lllllllllllllllIlllIIlIllllIllIl[lllllllllllllllIlllIIlIllllIlIll];
            lllllllllllllllIlllIIlIlllllIlIl.append((char)(lllllllllllllllIlllIIlIllllllIII ^ lllllllllllllllIlllIIlIlllllIlII[lllllllllllllllIlllIIlIlllllIIll % lllllllllllllllIlllIIlIlllllIlII.length]));
            "".length();
            ++lllllllllllllllIlllIIlIlllllIIll;
            ++lllllllllllllllIlllIIlIllllIlIll;
            "".length();
            if ((91 + 10 - 13 + 65 ^ 148 + 142 - 244 + 111) >= (0xED ^ 0x8F ^ (0x19 ^ 0x7F))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIlIlllllIlIl);
    }

    private static boolean llIlIIlllIIllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cU() {
        void var1_1;
        aF lllllllllllllllIlllIIllIIIlIIlIl;
        if (aF.llIlIIlllIIlII(Inventory.isFull() ? 1 : 0)) {
            return lIlIIIIIIIlI[1];
        }
        TileItem lllllllllllllllIlllIIllIIIlIIlII = TileItems.getNearest(tileItem -> {
            int n2;
            if (aF.llIlIIlllIIlII(tileItem.getName().startsWith(lIlIIIIIIIIl[lIlIIIIIIIlI[16]]) ? 1 : 0) && aF.llIlIIlllIIlII(this.ak.a((Locatable)tileItem) ? 1 : 0) && aF.llIlIIlllIIlII(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIlIIIIIIIlI[2];
                "".length();
                if (-(0x49 ^ 0x4D) > 0) {
                    return ((0x79 ^ 0x2C) & ~(0xCB ^ 0x9E)) != 0;
                }
            } else {
                n2 = lIlIIIIIIIlI[1];
            }
            return n2 != 0;
        });
        if (aF.llIlIIlllIIlll(lllllllllllllllIlllIIllIIIlIIlII)) {
            return lIlIIIIIIIlI[1];
        }
        var1_1.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[15]]);
        return lIlIIIIIIIlI[2];
    }

    private boolean di() {
        aF lllllllllllllllIlllIIllIIIllIlll;
        NPC nPC = this.de();
        if (aF.llIlIIlllIIlll(nPC)) {
            return lIlIIIIIIIlI[1];
        }
        WorldPoint lllllllllllllllIlllIIllIIIllIlIl = lllllllllllllllIlllIIllIIIllIlll.dd();
        List lllllllllllllllIlllIIllIIIllIlII = lllllllllllllllIlllIIllIIIllIlll.bS.getWorldLocation().pathTo(lllllllllllllllIlllIIllIIIllIlll.cq, lllllllllllllllIlllIIllIIIllIlIl);
        Iterator lllllllllllllllIlllIIllIIIllIIll = lllllllllllllllIlllIIllIIIllIlII.iterator();
        while (aF.llIlIIlllIIlII(lllllllllllllllIlllIIllIIIllIIll.hasNext() ? 1 : 0)) {
            WorldPoint lllllllllllllllIlllIIllIIIllIIlI = (WorldPoint)lllllllllllllllIlllIIllIIIllIIll.next();
            if (aF.llIlIIlllIIlII(lllllllllllllllIlllIIllIIIllIlll.dP.getWorldArea().contains(lllllllllllllllIlllIIllIIIllIIlI) ? 1 : 0)) {
                return lIlIIIIIIIlI[2];
            }
            "".length();
            if (((0x69 ^ 0x76) & ~(0x5C ^ 0x43)) == 0) continue;
            return ((0x8E ^ 0xB0) & ~(0x4B ^ 0x75) & ~((0xEB ^ 0x89) & ~(0x3A ^ 0x58))) != 0;
        }
        return lIlIIIIIIIlI[1];
    }

    @Inject
    protected aF(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIIIIIIlI[0];
        this.dB = lIlIIIIIIIlI[0];
        this.dR = new WorldPoint(lIlIIIIIIIlI[1], lIlIIIIIIIlI[1], lIlIIIIIIIlI[1]);
    }

    /*
     * WARNING - void declaration
     */
    private WorldPoint dd() {
        void var2_2;
        void lllllllllllllllIlllIIllIIlIlIIll;
        NPC nPC = this.de();
        if (aF.llIlIIlllIIlll(nPC)) {
            return null;
        }
        List lllllllllllllllIlllIIllIIlIlIIlI = lllllllllllllllIlllIIllIIlIlIIll.getWorldArea().getMeleeTiles(Static.getClient()).stream().filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint)).collect(Collectors.toList());
        if (aF.llIlIIlllIIlII(lllllllllllllllIlllIIllIIlIlIIlI.isEmpty() ? 1 : 0)) {
            return null;
        }
        WorldPoint lllllllllllllllIlllIIllIIlIlIIIl = (WorldPoint)lllllllllllllllIlllIIllIIlIlIIlI.get(lIlIIIIIIIlI[1]);
        List lllllllllllllllIlllIIllIIlIlIIII = lllllllllllllllIlllIIllIIlIlIIlI.stream().filter(worldPoint2 -> {
            boolean bl2;
            if (!aF.llIlIIlllIlIlI(worldPoint2.getWorldX(), lllllllllllllllIlllIIllIIlIlIIIl.getWorldX()) || aF.llIlIIlllIllIl(worldPoint2.getWorldY(), lllllllllllllllIlllIIllIIlIlIIIl.getWorldY())) {
                bl2 = lIlIIIIIIIlI[2];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return ((0x61 ^ 0x5D) & ~(0xAF ^ 0x93)) != 0;
                }
            } else {
                bl2 = lIlIIIIIIIlI[1];
            }
            return bl2;
        }).collect(Collectors.toList());
        lllllllllllllllIlllIIllIIlIlIIlI.removeAll(lllllllllllllllIlllIIllIIlIlIIII);
        "".length();
        if (aF.llIlIIlllIlIII(lllllllllllllllIlllIIllIIlIlIIlI.size(), lllllllllllllllIlllIIllIIlIlIIII.size())) {
            return (WorldPoint)lllllllllllllllIlllIIllIIlIlIIII.get(lIlIIIIIIIlI[1]);
        }
        return (WorldPoint)var2_2.get(lIlIIIIIIIlI[1]);
    }

    /*
     * WARNING - void declaration
     */
    private boolean dc() {
        aF lllllllllllllllIlllIIllIIlIlllIl;
        void lllllllllllllllIlllIIllIIlIlllII;
        NPC nPC = this.de();
        NPC nPC2 = this.df();
        if (!aF.llIlIIlllIIlIl(nPC) || aF.llIlIIlllIIlll(nPC2)) {
            return lIlIIIIIIIlI[1];
        }
        if (aF.llIlIIlllIIlII(lllllllllllllllIlllIIllIIlIlllII.isDead() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIllIIlIlllIl.ak.bq.dx(lIlIIIIIIIlI[3]).dy(lIlIIIIIIIlI[3]));
            return lIlIIIIIIIlI[2];
        }
        lllllllllllllllIlllIIllIIlIlllIl.db();
        if (aF.llIlIIlllIIlIl(lllllllllllllllIlllIIllIIlIlllIl.bS.getInteracting()) && aF.llIlIIlllIIlII(lllllllllllllllIlllIIllIIlIlllIl.bS.getInteracting().equals(lllllllllllllllIlllIIllIIlIlllII) ? 1 : 0)) {
            return lIlIIIIIIIlI[1];
        }
        WorldPoint lllllllllllllllIlllIIllIIlIllIlI = lllllllllllllllIlllIIllIIlIlllIl.dd();
        if (aF.llIlIIlllIlIII(lllllllllllllllIlllIIllIIlIlllIl.bS.distanceTo(lllllllllllllllIlllIIllIIlIllIlI), lIlIIIIIIIlI[4])) {
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIllIIlIllIlI);
            return lIlIIIIIIIlI[2];
        }
        nPC.interact(lIlIIIIIIIIl[lIlIIIIIIIlI[1]]);
        return lIlIIIIIIIlI[2];
    }

    private static boolean llIlIIlllIlIIl(int n2) {
        return n2 == 0;
    }

    private static String llIlIIllIllllI(String lllllllllllllllIlllIIlIlllIlIIll, String lllllllllllllllIlllIIlIlllIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlIlllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlIlllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlIlllIlIlll.init(lIlIIIIIIIlI[4], lllllllllllllllIlllIIlIlllIllIII);
            return new String(lllllllllllllllIlllIIlIlllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlIlllIlIllI) {
            lllllllllllllllIlllIIlIlllIlIllI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean cg() {
        aF lllllllllllllllIlllIIllIIllIlllI;
        if (aF.llIlIIlllIIIll(this.bS.distanceTo(this.ak.bs), lIlIIIIIIIlI[2]) && aF.llIlIIlllIIlII(this.cT() ? 1 : 0)) {
            return lIlIIIIIIIlI[2];
        }
        int lllllllllllllllIlllIIllIIllIllIl = aG.dk();
        System.out.println("state: " + aG.dk());
        NPC lllllllllllllllIlllIIllIIllIllII = NPCs.getNearest(nPC -> {
            int n2;
            if (aF.llIlIIlllIIlII(nPC.getName().contains(lIlIIIIIIIIl[lIlIIIIIIIlI[24]]) ? 1 : 0) && aF.llIlIIlllIIlII(this.ak.a((Locatable)nPC) ? 1 : 0)) {
                n2 = lIlIIIIIIIlI[2];
                "".length();
                if (null != null) {
                    return ((0xE3 ^ 0xAE) & ~(0x7D ^ 0x30)) != 0;
                }
            } else {
                n2 = lIlIIIIIIIlI[1];
            }
            return n2 != 0;
        });
        if (aF.llIlIIlllIIlIl(lllllllllllllllIlllIIllIIllIllII)) {
            Movement.setDestination((WorldPoint)lllllllllllllllIlllIIllIIllIllII.getWorldArea().getRandom());
            return lIlIIIIIIIlI[2];
        }
        switch (lllllllllllllllIlllIIllIIllIllIl) {
            case 0: {
                if (aF.llIlIIlllIIlII(lllllllllllllllIlllIIllIIllIlllI.cU() ? 1 : 0)) {
                    return lIlIIIIIIIlI[2];
                }
                return lllllllllllllllIlllIIllIIllIlllI.cS();
            }
            case 3: {
                return lllllllllllllllIlllIIllIIllIlllI.dc();
            }
            case 2: {
                return lllllllllllllllIlllIIllIIllIlllI.j(lIlIIIIIIIlI[2]);
            }
            case 4: {
                return lllllllllllllllIlllIIllIIllIlllI.j(lIlIIIIIIIlI[1]);
            }
            case 1: {
                return lllllllllllllllIlllIIllIIllIlllI.dj();
            }
        }
        return lIlIIIIIIIlI[2];
    }

    public void db() {
        if (aF.llIlIIlllIIlII(this.cj().isFullyEquipped() ? 1 : 0) && aF.llIlIIlllIllII(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            int[] nArray = new int[lIlIIIIIIIlI[4]];
            nArray[aF.lIlIIIIIIIlI[1]] = lIlIIIIIIIlI[11];
            nArray[aF.lIlIIIIIIIlI[2]] = lIlIIIIIIIlI[12];
            if (aF.llIlIIlllIIlII(Equipment.contains((int[])nArray) ? 1 : 0)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FIRST);
            }
        }
    }

    private void dh() {
    }

    private static boolean llIlIIlllIIlIl(Object object) {
        return object != null;
    }

    private static boolean llIlIIlllIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIIlllIIlll(Object object) {
        return object == null;
    }

    @Override
    public EquipmentSetup cj() {
        return s.b(s.e(N.VASA));
    }

    @Override
    public boolean ch() {
        boolean bl2;
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (aF.llIlIIlllIIllI((Object)this.ak.bw, (Object)N.VASA)) {
            bl2 = lIlIIIIIIIlI[2];
            "".length();
            if (" ".length() < 0) {
                return ((0x9F ^ 0xBC ^ (0x38 ^ 0x25)) & (0x77 ^ 0x30 ^ (0x5F ^ 0x26) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = lIlIIIIIIIlI[1];
        }
        return bl2;
    }

    private static boolean llIlIIlllIlIlI(int n2, int n3) {
        return n2 != n3;
    }
}

