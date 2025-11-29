/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.l;

@TaskDesc(name="Blue moon")
public class c
extends Task {
    /* synthetic */ WorldArea E;
    /* synthetic */ WorldArea G;
    /* synthetic */ WorldArea F;
    private final /* synthetic */ SquireMoonsOfPerilConfig z;
    /* synthetic */ WorldArea C;
    /* synthetic */ WorldArea D;
    /* synthetic */ WorldArea I;
    private /* synthetic */ int A;
    /* synthetic */ WorldArea H;
    private static /* synthetic */ int[] lIIIIIIIllIIl;
    /* synthetic */ WorldArea q;
    /* synthetic */ WorldArea B;
    private static /* synthetic */ String[] lIIIIIIIlIllI;

    private static String lIIlIllIllIIIIl(String lllllllllllllllIIIlllllIIlllIIll, String lllllllllllllllIIIlllllIIllIllIl) {
        lllllllllllllllIIIlllllIIlllIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllllIIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlllllIIlllIIIl = new StringBuilder();
        char[] lllllllllllllllIIIlllllIIlllIIII = lllllllllllllllIIIlllllIIllIllIl.toCharArray();
        int lllllllllllllllIIIlllllIIllIllll = lIIIIIIIllIIl[4];
        char[] lllllllllllllllIIIlllllIIllIlIIl = lllllllllllllllIIIlllllIIlllIIll.toCharArray();
        int lllllllllllllllIIIlllllIIllIlIII = lllllllllllllllIIIlllllIIllIlIIl.length;
        int lllllllllllllllIIIlllllIIllIIlll = lIIIIIIIllIIl[4];
        while (c.lIIlIllIlllIlII(lllllllllllllllIIIlllllIIllIIlll, lllllllllllllllIIIlllllIIllIlIII)) {
            char lllllllllllllllIIIlllllIIlllIlII = lllllllllllllllIIIlllllIIllIlIIl[lllllllllllllllIIIlllllIIllIIlll];
            lllllllllllllllIIIlllllIIlllIIIl.append((char)(lllllllllllllllIIIlllllIIlllIlII ^ lllllllllllllllIIIlllllIIlllIIII[lllllllllllllllIIIlllllIIllIllll % lllllllllllllllIIIlllllIIlllIIII.length]));
            "".length();
            ++lllllllllllllllIIIlllllIIllIllll;
            ++lllllllllllllllIIIlllllIIllIIlll;
            "".length();
            if (-"  ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIlllllIIlllIIIl);
    }

    private static void lIIlIllIllIIIlI() {
        lIIIIIIIlIllI = new String[lIIIIIIIllIIl[52]];
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[4]] = c.lIIlIllIlIlIlll("VdcHEgdpXou7YCNAdMw37w==", "YjLIB");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[21]] = c.lIIlIllIlIllIII("lwyoeJbrIEA+7hq8t9LMcQ==", "iSfsZ");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[22]] = c.lIIlIllIlIllIII("PY1ciexFCgs=", "LWbZM");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[23]] = c.lIIlIllIlIlIlll("kUkYxz8XOsZGBqk7MX2AFg==", "PgJTS");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[24]] = c.lIIlIllIlIlIlll("UmylhgsragN6OtygNN95m3ptTWYDfy8R", "tCOyb");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[25]] = c.lIIlIllIlIlIlll("DFgD3E6A9JfqkaWJwu7dzw==", "eGKTW");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[26]] = c.lIIlIllIllIIIIl("OQI1KEEAAmM+ABIIYz4RGxk=", "tmCMa");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[28]] = c.lIIlIllIllIIIIl("GyQVCjsxOQ8M", "ZPakX");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[29]] = c.lIIlIllIlIllIII("fZ3GkpnJiek=", "ileUY");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[30]] = c.lIIlIllIlIlIlll("zGmKyIUqe5s=", "qKAOj");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[31]] = c.lIIlIllIlIllIII("nvxiO+59BptlSHFTps75DxwBZ04Qyq2z", "AvgTa");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[32]] = c.lIIlIllIllIIIIl("Iw0NPzo=", "odjWN");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[35]] = c.lIIlIllIllIIIIl("GQYtblAyADAsF3UbNmIdPAs9LhU=", "UoYBp");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[38]] = c.lIIlIllIlIlIlll("RJuyh10RVTOxF+yqiuSEUw==", "aiylA");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[39]] = c.lIIlIllIlIlIlll("oZ5NC+mKsD4i6FGpSwPI08Vh/VuyxTdQ", "nIcjE");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[40]] = c.lIIlIllIllIIIIl("CAEBJhYi", "IuuGu");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[41]] = c.lIIlIllIlIlIlll("5OnC0XIAg1AAkPGR1+rMvw==", "Fihdu");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[42]] = c.lIIlIllIlIlIlll("HTzkGho/aLQ=", "rIofv");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[43]] = c.lIIlIllIlIlIlll("mQ8RPPuJvOA=", "LKACK");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[44]] = c.lIIlIllIlIlIlll("9ampt/iix7r0QZrrjhrA7Lx80jtCTJIP", "jfJdz");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[45]] = c.lIIlIllIlIllIII("+zkliV3tn9rU4B49DuYocBhqBcW6MrJi", "LXGJI");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[47]] = c.lIIlIllIllIIIIl("JgQgGToG", "upApH");
        c.lIIIIIIIlIllI[c.lIIIIIIIllIIl[48]] = c.lIIlIllIlIllIII("GD8kUkNaYt7L5NnpOIxJoQ==", "blKVl");
    }

    private static boolean lIIlIllIlllIIII(Object object) {
        return object == null;
    }

    private static /* synthetic */ boolean b(Set set, WorldPoint worldPoint) {
        int n;
        if (c.lIIlIllIllIllIl(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && c.lIIlIllIllIllII(set.contains(worldPoint) ? 1 : 0)) {
            n = lIIIIIIIllIIl[21];
            "".length();
            if (null != null) {
                return ((0xC ^ 0x68 ^ (7 ^ 0x7B)) & (82 + 30 - 54 + 76 ^ 45 + 149 - 167 + 131 ^ -" ".length())) != 0;
            }
        } else {
            n = lIIIIIIIllIIl[4];
        }
        return n != 0;
    }

    private static String lIIlIllIlIllIII(String lllllllllllllllIIIlllllIIlIlllII, String lllllllllllllllIIIlllllIIlIllIll) {
        try {
            SecretKeySpec lllllllllllllllIIIlllllIIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllllIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlllllIIllIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlllllIIllIIIII.init(lIIIIIIIllIIl[22], lllllllllllllllIIIlllllIIllIIIIl);
            return new String(lllllllllllllllIIIlllllIIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllllIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlllllIIlIlllll) {
            lllllllllllllllIIIlllllIIlIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlllIIll(int n, int n2) {
        return n > n2;
    }

    private static String lIIlIllIlIlIlll(String lllllllllllllllIIIlllllIIlIlIIIl, String lllllllllllllllIIIlllllIIlIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIIlllllIIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllllIIlIIlllI.getBytes(StandardCharsets.UTF_8)), lIIIIIIIllIIl[29]), "DES");
            Cipher lllllllllllllllIIIlllllIIlIlIIll = Cipher.getInstance("DES");
            lllllllllllllllIIIlllllIIlIlIIll.init(lIIIIIIIllIIl[22], lllllllllllllllIIIlllllIIlIlIlII);
            return new String(lllllllllllllllIIIlllllIIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllllIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlllllIIlIlIIlI) {
            lllllllllllllllIIIlllllIIlIlIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    public c(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.q = new WorldArea(lIIIIIIIllIIl[0], lIIIIIIIllIIl[1], lIIIIIIIllIIl[2], lIIIIIIIllIIl[3], lIIIIIIIllIIl[4]);
        this.B = new WorldArea(new WorldPoint(lIIIIIIIllIIl[5], lIIIIIIIllIIl[6], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[7], lIIIIIIIllIIl[8], lIIIIIIIllIIl[4]));
        this.C = new WorldArea(new WorldPoint(lIIIIIIIllIIl[9], lIIIIIIIllIIl[10], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[11], lIIIIIIIllIIl[12], lIIIIIIIllIIl[4]));
        this.D = new WorldArea(new WorldPoint(lIIIIIIIllIIl[9], lIIIIIIIllIIl[13], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[11], lIIIIIIIllIIl[14], lIIIIIIIllIIl[4]));
        this.E = new WorldArea(new WorldPoint(lIIIIIIIllIIl[5], lIIIIIIIllIIl[15], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[7], lIIIIIIIllIIl[16], lIIIIIIIllIIl[4]));
        this.F = new WorldArea(new WorldPoint(lIIIIIIIllIIl[17], lIIIIIIIllIIl[15], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[18], lIIIIIIIllIIl[16], lIIIIIIIllIIl[4]));
        this.G = new WorldArea(new WorldPoint(lIIIIIIIllIIl[19], lIIIIIIIllIIl[13], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[20], lIIIIIIIllIIl[14], lIIIIIIIllIIl[4]));
        this.H = new WorldArea(new WorldPoint(lIIIIIIIllIIl[19], lIIIIIIIllIIl[10], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[20], lIIIIIIIllIIl[12], lIIIIIIIllIIl[4]));
        this.I = new WorldArea(new WorldPoint(lIIIIIIIllIIl[17], lIIIIIIIllIIl[6], lIIIIIIIllIIl[4]), new WorldPoint(lIIIIIIIllIIl[18], lIIIIIIIllIIl[8], lIIIIIIIllIIl[4]));
        this.z = squireMoonsOfPerilConfig;
    }

    private static int lIIlIllIllIlIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlIllIlllIllI(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIlIllIlllIIlI(int n) {
        return n < 0;
    }

    public EquipmentSetup b() {
        return (EquipmentSetup)this.z.blueMoonGear().selected(EquipmentSetup.class);
    }

    static {
        c.lIIlIllIllIIlll();
        c.lIIlIllIllIIIlI();
    }

    public boolean run() {
        List lllllllllllllllIIIlllllIlIlIIlll2;
        Collection<Object> lllllllllllllllIIIlllllIlIlIlIII;
        Object lllllllllllllllIIIlllllIlIlIlIIl;
        NPC lllllllllllllllIIIlllllIlIlIlIlI;
        c lllllllllllllllIIIlllllIlIlIllIl;
        if (c.lIIlIllIllIllII(this.a(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return lIIIIIIIllIIl[4];
        }
        if (c.lIIlIllIllIllII(lllllllllllllllIIIlllllIlIlIllIl.b().isFullyEquipped() ? 1 : 0)) {
            if (c.lIIlIllIllIllIl(Inventory.isFull() ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIllIIl[21]];
                stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[4]];
                if (c.lIIlIllIllIllIl(Inventory.contains((String[])stringArray) ? 1 : 0) && c.lIIlIllIllIlllI(Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD)) && c.lIIlIllIllIllll(lllllllllllllllIIIlllllIlIlIllIl.b().get(EquipmentInventorySlot.SHIELD))) {
                    String[] stringArray2 = new String[lIIIIIIIllIIl[21]];
                    stringArray2[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[21]];
                    Inventory.getFirst((String[])stringArray2).interact(lIIIIIIIlIllI[lIIIIIIIllIIl[22]]);
                }
            }
            lllllllllllllllIIIlllllIlIlIllIl.b().swap();
        }
        NPC lllllllllllllllIIIlllllIlIlIllII = NPCs.getNearest(nPC -> {
            int n;
            if (c.lIIlIllIlllIllI(nPC.getId(), lIIIIIIIllIIl[51]) && c.lIIlIllIllIllIl(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIIllIIl[21];
                "".length();
                if (-(0x6D ^ 0x47 ^ (0x9A ^ 0xB4)) >= 0) {
                    return ((0x82 ^ 0x84 ^ (0x75 ^ 0x61)) & (136 + 56 - 94 + 65 ^ 78 + 28 - 14 + 85 ^ -" ".length())) != 0;
                }
            } else {
                n = lIIIIIIIllIIl[4];
            }
            return n != 0;
        });
        NPC lllllllllllllllIIIlllllIlIlIlIll = NPCs.getNearest(nPC -> {
            int n;
            if (c.lIIlIllIlllIllI(nPC.getId(), lIIIIIIIllIIl[49]) && c.lIIlIllIlllIllI(nPC.getAnimation(), lIIIIIIIllIIl[50])) {
                n = lIIIIIIIllIIl[21];
                "".length();
                if ("  ".length() <= " ".length()) {
                    return ((0x5E ^ 0x76 ^ (0x11 ^ 9)) & (0x90 ^ 0xBF ^ (0x84 ^ 0x9B) ^ -" ".length())) != 0;
                }
            } else {
                n = lIIIIIIIllIIl[4];
            }
            return n != 0;
        });
        String[] stringArray = new String[lIIIIIIIllIIl[21]];
        stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[23]];
        if (c.lIIlIllIllIllII(Inventory.contains((String[])stringArray) ? 1 : 0) && c.lIIlIllIlllIIII(lllllllllllllllIIIlllllIlIlIllII) && c.lIIlIllIlllIIII(lllllllllllllllIIIlllllIlIlIlIll) && c.lIIlIllIlllIIlI(c.lIIlIllIllIlIlI(Combat.getHealthPercent(), 40.0))) {
            SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[24]];
            lllllllllllllllIIIlllllIlIlIlIlI = TileObjects.getNearest(tileObject -> {
                int n;
                if (c.lIIlIllIllIllIl(tileObject.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[47]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIllIIl[21]];
                    stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[48]];
                    if (c.lIIlIllIllIllIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n = lIIIIIIIllIIl[21];
                        "".length();
                        if (null == null) return n != 0;
                        return ((0x83 ^ 0xB3) & ~(0x16 ^ 0x26)) != 0;
                    }
                }
                n = lIIIIIIIllIIl[4];
                return n != 0;
            });
            if (c.lIIlIllIllIlllI(lllllllllllllllIIIlllllIlIlIlIlI)) {
                lllllllllllllllIIIlllllIlIlIlIlI.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[25]]);
                return lIIIIIIIllIIl[4];
            }
        }
        if (c.lIIlIllIllIlllI(lllllllllllllllIIIlllllIlIlIlIlI = NPCs.getNearest(nPC -> {
            int n;
            if (c.lIIlIllIlllIllI(nPC.getId(), lIIIIIIIllIIl[46]) && c.lIIlIllIllIllIl(this.a(nPC.getWorldLocation()) ? 1 : 0)) {
                n = lIIIIIIIllIIl[21];
                "".length();
                if ("  ".length() == " ".length()) {
                    return ((0xCC ^ 0xC1 ^ (0x99 ^ 0x9F)) & (0xC5 ^ 0x80 ^ (0x8B ^ 0xC5) ^ -" ".length())) != 0;
                }
            } else {
                n = lIIIIIIIllIIl[4];
            }
            return n != 0;
        }))) {
            lllllllllllllllIIIlllllIlIlIlIIl = lllllllllllllllIIIlllllIlIlIllIl.d(lllllllllllllllIIIlllllIlIlIlIlI.getWorldLocation());
            if (c.lIIlIllIllIllII(lllllllllllllllIIIlllllIlIlIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[26]];
                Movement.setDestination((WorldPoint)lllllllllllllllIIIlllllIlIlIlIlI.getWorldLocation());
                return lIIIIIIIllIIl[4];
            }
            if (c.lIIlIllIllIllIl(lllllllllllllllIIIlllllIlIlIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] nArray = new int[lIIIIIIIllIIl[21]];
                nArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIllIIl[27];
                lllllllllllllllIIIlllllIlIlIlIII = NPCs.getNearest((int[])nArray);
                if (c.lIIlIllIllIlllI(lllllllllllllllIIIlllllIlIlIlIII)) {
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[28]];
                    if (c.lIIlIllIllIllIl(l.l() ? 1 : 0) && c.lIIlIllIllIllIl(Inventory.contains(item -> item.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[45]])) ? 1 : 0)) {
                        Inventory.getFirst(item -> item.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[44]])).interact(lIIIIIIIlIllI[lIIIIIIIllIIl[29]]);
                        return lIIIIIIIllIIl[4];
                    }
                    lllllllllllllllIIIlllllIlIlIlIII.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[30]]);
                    return lIIIIIIIllIIl[21];
                }
            }
        }
        if (c.lIIlIllIllIlllI(lllllllllllllllIIIlllllIlIlIllII)) {
            if (c.lIIlIllIllIllII(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
                return lIIIIIIIllIIl[21];
            }
            lllllllllllllllIIIlllllIlIlIlIIl = TileObjects.getNearest(tileObject -> {
                int n;
                if (c.lIIlIllIllIllIl(tileObject.getName().contains(lIIIIIIIlIllI[lIIIIIIIllIIl[42]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIllIIl[21]];
                    stringArray[c.lIIIIIIIllIIl[4]] = lIIIIIIIlIllI[lIIIIIIIllIIl[43]];
                    if (c.lIIlIllIllIllIl(tileObject.hasAction(stringArray) ? 1 : 0) && c.lIIlIllIllIllIl(this.a(tileObject.getWorldLocation()) ? 1 : 0)) {
                        n = lIIIIIIIllIIl[21];
                        "".length();
                        if (((0xA6 ^ 0xBF) & ~(0x5E ^ 0x47)) < "  ".length()) return n != 0;
                        return ((0x6F ^ 0x57) & ~(0x34 ^ 0xC)) != 0;
                    }
                }
                n = lIIIIIIIllIIl[4];
                return n != 0;
            });
            if (c.lIIlIllIllIlllI(lllllllllllllllIIIlllllIlIlIlIIl)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[31]];
                lllllllllllllllIIIlllllIlIlIlIIl.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[32]]);
                return lIIIIIIIllIIl[21];
            }
            if (c.lIIlIllIlllIIII(lllllllllllllllIIIlllllIlIlIlIIl)) {
                lllllllllllllllIIIlllllIlIlIlIII = new WorldPoint(lIIIIIIIllIIl[33], lIIIIIIIllIIl[34], lIIIIIIIllIIl[4]);
                if (c.lIIlIllIlllIIll(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIlllllIlIlIlIII), lIIIIIIIllIIl[24])) {
                    WorldArea lllllllllllllllIIIlllllIlIlIIlll2 = new WorldArea(lIIIIIIIllIIl[5], lIIIIIIIllIIl[6], lIIIIIIIllIIl[24], lIIIIIIIllIIl[23], lIIIIIIIllIIl[4]);
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[35]];
                    Movement.setDestination((WorldPoint)lllllllllllllllIIIlllllIlIlIIlll2.getRandom());
                    return lIIIIIIIllIIl[21];
                }
            }
        }
        if (c.lIIlIllIllIlllI(lllllllllllllllIIIlllllIlIlIlIll)) {
            lllllllllllllllIIIlllllIlIlIlIIl = lllllllllllllllIIIlllllIlIlIllIl.c(lIIIIIIIllIIl[36]);
            lllllllllllllllIIIlllllIlIlIlIII = lllllllllllllllIIIlllllIlIlIllIl.c(lIIIIIIIllIIl[37]);
            lllllllllllllllIIIlllllIlIlIIlll2 = Players.getLocal().getWorldLocation().createWorldArea(lIIIIIIIllIIl[26]).toWorldPointList();
            WorldPoint lllllllllllllllIIIlllllIlIlIIllI = lllllllllllllllIIIlllllIlIlIIlll2.stream().filter(arg_0 -> c.c((Set)lllllllllllllllIIIlllllIlIlIlIIl, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (c.lIIlIllIllIllII(lllllllllllllllIIIlllllIlIlIlIIl.isEmpty() ? 1 : 0) && c.lIIlIllIllIlllI(lllllllllllllllIIIlllllIlIlIIllI)) {
                if (c.lIIlIllIlllIlII(lllllllllllllllIIIlllllIlIlIllIl.A, lIIIIIIIllIIl[22])) {
                    lllllllllllllllIIIlllllIlIlIllIl.A += lIIIIIIIllIIl[21];
                    Time.sleepTicks((int)lIIIIIIIllIIl[21]);
                    "".length();
                    Time.sleep((long)300L);
                    "".length();
                }
                if (c.lIIlIllIlllIlIl(lllllllllllllllIIIlllllIlIlIllIl.A, lIIIIIIIllIIl[22])) {
                    SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[38]];
                    Movement.setDestination((WorldPoint)lllllllllllllllIIIlllllIlIlIIllI);
                    lllllllllllllllIIIlllllIlIlIllIl.A = lIIIIIIIllIIl[4];
                    return lIIIIIIIllIIl[4];
                }
            }
            if (!c.lIIlIllIllIllII(lllllllllllllllIIIlllllIlIlIlIIl.isEmpty() ? 1 : 0) || c.lIIlIllIllIllIl(lllllllllllllllIIIlllllIlIlIlIII.isEmpty() ? 1 : 0)) {
                lllllllllllllllIIIlllllIlIlIllIl.A = lIIIIIIIllIIl[4];
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[39]];
                lllllllllllllllIIIlllllIlIlIlIll.interact(lIIIIIIIlIllI[lIIIIIIIllIIl[40]]);
                return lIIIIIIIllIIl[21];
            }
        }
        if (c.lIIlIllIlllIIII(lllllllllllllllIIIlllllIlIlIlIll)) {
            lllllllllllllllIIIlllllIlIlIlIIl = lllllllllllllllIIIlllllIlIlIllIl.c(lIIIIIIIllIIl[36]);
            lllllllllllllllIIIlllllIlIlIlIII = Players.getLocal().getWorldLocation().createWorldArea(lIIIIIIIllIIl[26]).toWorldPointList();
            lllllllllllllllIIIlllllIlIlIIlll2 = lllllllllllllllIIIlllllIlIlIlIII.stream().filter(arg_0 -> c.b((Set)lllllllllllllllIIIlllllIlIlIlIIl, arg_0)).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (c.lIIlIllIllIllII(lllllllllllllllIIIlllllIlIlIlIIl.isEmpty() ? 1 : 0) && c.lIIlIllIllIlllI(lllllllllllllllIIIlllllIlIlIIlll2)) {
                SquireMoonsOfPeril.g = lIIIIIIIlIllI[lIIIIIIIllIIl[41]];
                Movement.setDestination((WorldPoint)lllllllllllllllIIIlllllIlIlIIlll2);
                lllllllllllllllIIIlllllIlIlIllIl.A = lIIIIIIIllIIl[4];
                return lIIIIIIIllIIl[4];
            }
        }
        return lIIIIIIIllIIl[21];
    }

    /*
     * WARNING - void declaration
     */
    private WorldArea d(WorldPoint worldPoint) {
        void lllllllllllllllIIIlllllIlIIllllI;
        WorldArea[] worldAreaArray = new WorldArea[lIIIIIIIllIIl[29]];
        worldAreaArray[c.lIIIIIIIllIIl[4]] = this.B;
        worldAreaArray[c.lIIIIIIIllIIl[21]] = this.C;
        worldAreaArray[c.lIIIIIIIllIIl[22]] = this.D;
        worldAreaArray[c.lIIIIIIIllIIl[23]] = this.E;
        worldAreaArray[c.lIIIIIIIllIIl[24]] = this.F;
        worldAreaArray[c.lIIIIIIIllIIl[25]] = this.G;
        worldAreaArray[c.lIIIIIIIllIIl[26]] = this.H;
        worldAreaArray[c.lIIIIIIIllIIl[28]] = this.I;
        List<WorldArea> list = Arrays.asList(worldAreaArray);
        WorldArea worldArea = null;
        int lllllllllllllllIIIlllllIlIIlllII = lIIIIIIIllIIl[4];
        while (c.lIIlIllIlllIlII(lllllllllllllllIIIlllllIlIIlllII, lllllllllllllllIIIlllllIlIIllllI.size())) {
            void lllllllllllllllIIIlllllIlIIlllll;
            if (c.lIIlIllIllIllIl(((WorldArea)lllllllllllllllIIIlllllIlIIllllI.get(lllllllllllllllIIIlllllIlIIlllII)).contains((WorldPoint)lllllllllllllllIIIlllllIlIIlllll) ? 1 : 0)) {
                WorldArea lllllllllllllllIIIlllllIlIIlllIl = (WorldArea)lllllllllllllllIIIlllllIlIIllllI.get(lllllllllllllllIIIlllllIlIIlllII);
                "".length();
                if (-(0x94 ^ 0x90) < 0) break;
                return null;
            }
            ++lllllllllllllllIIIlllllIlIIlllII;
            "".length();
            if (-(0x82 ^ 0x86) <= 0) continue;
            return null;
        }
        return worldArea;
    }

    private static boolean lIIlIllIllIlllI(Object object) {
        return object != null;
    }

    private static boolean lIIlIllIlllIlII(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIllIllIllII(int n) {
        return n == 0;
    }

    private static /* synthetic */ boolean c(Set set, WorldPoint worldPoint) {
        int n;
        if (c.lIIlIllIllIllIl(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && c.lIIlIllIllIllII(set.contains(worldPoint) ? 1 : 0)) {
            n = lIIIIIIIllIIl[21];
            "".length();
            if (((0xD ^ 0x38) & ~(0xAF ^ 0x9A)) > (0xB8 ^ 0xBC)) {
                return ((0x15 ^ 0x26) & ~(0x19 ^ 0x2A)) != 0;
            }
        } else {
            n = lIIIIIIIllIIl[4];
        }
        return n != 0;
    }

    private static boolean lIIlIllIllIllIl(int n) {
        return n != 0;
    }

    private static boolean lIIlIllIllIllll(int n) {
        return n <= 0;
    }

    private static void lIIlIllIllIIlll() {
        lIIIIIIIllIIl = new int[53];
        c.lIIIIIIIllIIl[0] = 0xFFFFE5CF & 0x1FBB;
        c.lIIIIIIIllIIl[1] = -(0xFFFFFA6B & 0x4FD5) & (0xFFFFEFFF & Short.MAX_VALUE);
        c.lIIIIIIIllIIl[2] = 27 + 66 - 77 + 119 ^ 46 + 63 - -61 + 4;
        c.lIIIIIIIllIIl[3] = 0x72 ^ 0x57;
        c.lIIIIIIIllIIl[4] = (0x81 ^ 0xA2) & ~(0x59 ^ 0x7A);
        c.lIIIIIIIllIIl[5] = -(0xFFFFFD2A & 0x3AF7) & (0xFFFFBFFF & 0x7DBF);
        c.lIIIIIIIllIIl[6] = 0xFFFFE7EE & 0x3DDD;
        c.lIIIIIIIllIIl[7] = -(0xFFFFA7FD & 0x7A63) & (0xFFFFAFFF & 0x77FF);
        c.lIIIIIIIllIIl[8] = -(0xFFFFFB77 & 0x4E89) & (0xFFFFFFED & 0x6FDF);
        c.lIIIIIIIllIIl[9] = 0xFFFFDFDE & 0x25BD;
        c.lIIIIIIIllIIl[10] = -(0xFFFF92EE & 0x7D13) & (0xFFFFF7EF & 0x3DDF);
        c.lIIIIIIIllIIl[11] = 0xFFFF859D & Short.MAX_VALUE;
        c.lIIIIIIIllIIl[12] = -(0xFFFFF857 & 0xFB9) & (0xFFFFADFF & 0x7FDF);
        c.lIIIIIIIllIIl[13] = -(0xFFFFFA6F & 0x5FB3) & (0xFFFFFFF7 & 0x7FFB);
        c.lIIIIIIIllIIl[14] = 0xFFFFF5D7 & 0x2FFA;
        c.lIIIIIIIllIIl[15] = -(0xFFFFFB39 & 0x44CF) & (0xFFFFF5DB & 0x6FFF);
        c.lIIIIIIIllIIl[16] = 0xFFFFB7FE & 0x6DD5;
        c.lIIIIIIIllIIl[17] = -(0xFFFFEECF & 0x733F) & (0xFFFFF7FF & 0x6FAF);
        c.lIIIIIIIllIIl[18] = 0xFFFFDFE6 & 0x25BB;
        c.lIIIIIIIllIIl[19] = 0xFFFFAFBB & 0x55E7;
        c.lIIIIIIIllIIl[20] = 0xFFFFC7F5 & 0x3DAE;
        c.lIIIIIIIllIIl[21] = " ".length();
        c.lIIIIIIIllIIl[22] = "  ".length();
        c.lIIIIIIIllIIl[23] = "   ".length();
        c.lIIIIIIIllIIl[24] = 0xB9 ^ 0xB0 ^ (0x6B ^ 0x66);
        c.lIIIIIIIllIIl[25] = 0x73 ^ 0x76;
        c.lIIIIIIIllIIl[26] = 0x92 ^ 0x94;
        c.lIIIIIIIllIIl[27] = 0xFFFFF2F5 & 0x3FDF;
        c.lIIIIIIIllIIl[28] = 0xA0 ^ 0xA7;
        c.lIIIIIIIllIIl[29] = 0x2D ^ 0x25;
        c.lIIIIIIIllIIl[30] = 0x6F ^ 0x40 ^ (0x1C ^ 0x3A);
        c.lIIIIIIIllIIl[31] = 0x39 ^ 0x33;
        c.lIIIIIIIllIIl[32] = 0x56 ^ 0x5D;
        c.lIIIIIIIllIIl[33] = 0xFFFFF5AF & 0xFF0;
        c.lIIIIIIIllIIl[34] = 0xFFFFEFCF & 0x35FB;
        c.lIIIIIIIllIIl[35] = 70 + 125 - 159 + 107 ^ 50 + 101 - 47 + 27;
        c.lIIIIIIIllIIl[36] = 0xFFFF8BFB & 0x7ED7;
        c.lIIIIIIIllIIl[37] = 0xFFFFAFD6 & 0x5AFB;
        c.lIIIIIIIllIIl[38] = 0x16 ^ 0x1B;
        c.lIIIIIIIllIIl[39] = 0xC0 ^ 0x81 ^ (0xDE ^ 0x91);
        c.lIIIIIIIllIIl[40] = 0xB0 ^ 0xBF;
        c.lIIIIIIIllIIl[41] = 0xEA ^ 0x97 ^ (0xE9 ^ 0x84);
        c.lIIIIIIIllIIl[42] = 123 + 5 - 122 + 146 ^ 49 + 68 - 64 + 84;
        c.lIIIIIIIllIIl[43] = 0x20 ^ 0x32;
        c.lIIIIIIIllIIl[44] = 0x2D ^ 0x3E;
        c.lIIIIIIIllIIl[45] = 0x77 ^ 0x63;
        c.lIIIIIIIllIIl[46] = -(0xFFFFD7F9 & 0x6D2F) & (0xFFFFF7FF & Short.MAX_VALUE);
        c.lIIIIIIIllIIl[47] = 43 + 2 - -76 + 56 ^ 154 + 50 - 138 + 98;
        c.lIIIIIIIllIIl[48] = 0x32 ^ 0x24;
        c.lIIIIIIIllIIl[49] = -(0xFFFFE55D & 0x1FBB) & (0xFFFFFFFD & 0x37FB);
        c.lIIIIIIIllIIl[50] = -(0xFFFFD2DB & 0x7DE5) & (0xFFFFFFFF & 0x7BD7);
        c.lIIIIIIIllIIl[51] = -(0xFFFFBD3F & 0x4FDD) & (0xFFFFFFFF & 0x3FFF);
        c.lIIIIIIIllIIl[52] = 155 + 93 - 204 + 137 ^ 9 + 98 - -46 + 9;
    }

    protected boolean a(WorldPoint worldPoint) {
        return this.q.contains(worldPoint);
    }

    private Set<WorldPoint> c(int n) {
        HashSet<WorldPoint> hashSet = new HashSet<WorldPoint>();
        Static.getClient().getGraphicsObjects().forEach(graphicsObject -> {
            if (c.lIIlIllIlllIllI(graphicsObject.getId(), n)) {
                hashSet.add(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)graphicsObject.getLocation()));
                "".length();
            }
        });
        return hashSet;
    }

    private static boolean lIIlIllIlllIlIl(int n, int n2) {
        return n >= n2;
    }
}

