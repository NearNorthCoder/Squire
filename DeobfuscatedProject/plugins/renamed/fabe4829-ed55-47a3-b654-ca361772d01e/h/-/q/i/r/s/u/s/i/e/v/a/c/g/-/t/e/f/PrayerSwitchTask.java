/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.BEnum;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.c_Unknown;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.f_Unknown;
import h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.n_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

/* TASK: Prayer Switch Task -> PrayerswitchtaskTask */
@TaskDesc(name="Prayer Switch Task", priority=100)
public class PrayerSwitchTask
extends Task {
    static final /* synthetic */ int af;
    private final /* synthetic */ n ae;
    private final /* synthetic */ SquireFightCavesConfig ad;
    private static /* synthetic */ int[] llIIlIIIIIlI;
    private final /* synthetic */ f ac;
    private static /* synthetic */ String[] llIIlIIIIIIl;

    private static String llllIlllllIIIl(String var31, String var3) {
        try {
            SecretKeySpec var30 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var28 = Cipher.getInstance("Blowfish");
            var28.init(llIIlIIIIIlI[17], var30);
            return new String(var28.doFinal(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static void llllIlllllIIll() {
        llIIlIIIIIIl = new String[llIIlIIIIIlI[3]];
        k.llIIlIIIIIIl[k.llIIlIIIIIlI[0]] = k."Generating tiles";
        k.llIIlIIIIIIl[k.llIIlIIIIIlI[9]] = k."In jad fight";
        k.llIIlIIIIIIl[k.llIIlIIIIIlI[17]] = k."Cave entrance";
        k.llIIlIIIIIIl[k.llIIlIIIIIlI[5]] = k."Leave";
    }

    private static boolean llllIllllllllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllIllllllIIl(int n2, int n3) {
        return n2 > n3;
    }

    public static boolean a(Prayer prayer) {
        boolean bl;
        if (k.llllIlllllllIl(Vars.getBit((int)prayer.getVarbit()), llIIlIIIIIlI[9])) {
            bl = llIIlIIIIIlI[9];
            0;
            if (3 < -1) {
                return false;
            }
        } else {
            bl = llIIlIIIIIlI[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (k.llllIlllllIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            Prayers.disableAll();
            return llIIlIIIIIlI[0];
        }
        if (k.llllIlllllIllI(n.al)) {
            k var29;
            var29.sleep(llIIlIIIIIlI[1]);
            System.out.println(llIIlIIIIIIl[llIIlIIIIIlI[0]]);
            n.al = TileObjects.getNearest(tileObject -> {
                int n2;
                if (k.llllIlllllllII(tileObject.getName().equalsIgnoreCase(llIIlIIIIIIl[llIIlIIIIIlI[17]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIIlIIIIIlI[9]];
                    stringArray[k.llIIlIIIIIlI[0]] = llIIlIIIIIIl[llIIlIIIIIlI[5]];
                    if (k.llllIlllllllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIIlIIIIIlI[9];
                        0;
                        if (2 == 2) return n2 != 0;
                        return (2 & ~2) != 0;
                    }
                }
                n2 = llIIlIIIIIlI[0];
                return n2 != 0;
            }).getWorldLocation();
            System.out.println("Start: " + String.valueOf(n.al));
            n.am = new WorldPoint(n.al.getX(), n.al.getY() - llIIlIIIIIlI[2], n.al.getPlane());
            n.an = new WorldPoint(n.al.getX() + llIIlIIIIIlI[3], n.al.getY() - llIIlIIIIIlI[4], n.al.getPlane());
            n.ao = new WorldPoint(n.al.getX() + llIIlIIIIIlI[5], n.al.getY() - llIIlIIIIIlI[6], n.al.getPlane());
            n.aq = new WorldPoint(n.al.getX(), n.al.getY() - llIIlIIIIIlI[7], n.al.getPlane());
            n.ap = new WorldPoint(n.al.getX() + llIIlIIIIIlI[5], n.al.getY() - llIIlIIIIIlI[8], n.al.getPlane());
            SquireFightCavesPlugin.j += llIIlIIIIIlI[9];
        }
        ArrayList<Prayer> var10 = new ArrayList<Prayer>();
        var10.addAll(Prayers.getRangePrayers());
        0;
        NPC lllllllllllllllIlIlIIIIIlIIlllll = NPCs.getNearest((int[])c.p);
        NPC lllllllllllllllIlIlIIIIIlIIllllI = NPCs.getNearest((int[])c.q);
        NPC lllllllllllllllIlIlIIIIIlIIlllIl = NPCs.getNearest((int[])c.r);
        NPC var12 = NPCs.getNearest((int[])c.s);
        NPC var4 = NPCs.getNearest((int[])c.t);
        NPC var22 = NPCs.getNearest((int[])c.u);
        NPC var23 = NPCs.getNearest((int[])c.v);
        if (k.llllIlllllIlll(f.p(), llIIlIIIIIlI[10])) {
            if (k.llllIllllllIII(f.D, llIIlIIIIIlI[11])) {
                var10.add(Prayer.PROTECT_FROM_MELEE);
                0;
            }
            if (k.llllIllllllIIl(f.p(), llIIlIIIIIlI[11]) && k.llllIllllllIlI(f.p(), llIIlIIIIIlI[12]) && k.llllIllllllIlI(f.p(), llIIlIIIIIlI[13]) && k.llllIllllllIlI(f.p(), llIIlIIIIIlI[14])) {
                if (!k.llllIlllllIlIl(f.a(Static.getClient(), b.BLOB, Players.getLocal()) ? 1 : 0) || !k.llllIlllllIlIl(f.a(Static.getClient(), b.SMALL_BLOB, Players.getLocal()) ? 1 : 0) || !k.llllIlllllIlIl(f.a(Static.getClient(), b.MELEER, Players.getLocal()) ? 1 : 0) || k.llllIlllllIlll(f.r(), llIIlIIIIIlI[9]) && k.llllIllllllIll(var4) && k.llllIlllllllII(n.c(var4.getWorldArea().toWorldPointList()) ? 1 : 0)) {
                    var10.add(Prayer.PROTECT_FROM_MELEE);
                    0;
                }
                if (!k.llllIlllllIlIl(f.a(Static.getClient(), b.RANGER, Players.getLocal()) ? 1 : 0) || k.llllIlllllIlll(f.u(), llIIlIIIIIlI[9]) && k.llllIllllllIll(var12) && k.llllIlllllIllI(var22)) {
                    var10.add(Prayer.PROTECT_FROM_MISSILES);
                    0;
                }
                if (!k.llllIlllllIlIl(f.a(Static.getClient(), b.MAGER, Players.getLocal()) ? 1 : 0) || k.llllIlllllIlll(f.t(), llIIlIIIIIlI[9]) && k.llllIllllllIll(var22)) {
                    var10.add(Prayer.PROTECT_FROM_MAGIC);
                    0;
                }
            }
            if (k.llllIlllllllIl(f.p(), llIIlIIIIIlI[12])) {
                var10.add(Prayer.PROTECT_FROM_MISSILES);
                0;
            }
            if (k.llllIlllllllIl(f.p(), llIIlIIIIIlI[13])) {
                var10.add(Prayer.PROTECT_FROM_MELEE);
                0;
            }
            if (k.llllIlllllllIl(f.p(), llIIlIIIIIlI[14])) {
                var10.add(Prayer.PROTECT_FROM_MAGIC);
                0;
            }
        }
        if (k.llllIllllllIll(var23)) {
            System.out.println(llIIlIIIIIIl[llIIlIIIIIlI[9]]);
            if (k.llllIlllllllIl(var23.getAnimation(), llIIlIIIIIlI[15])) {
                var10.add(Prayer.PROTECT_FROM_MAGIC);
                0;
                0;
                if ((0x16 ^ 0x12) < 0) {
                    return false;
                }
            } else {
                var10.add(Prayer.PROTECT_FROM_MISSILES);
                0;
            }
        }
        k.a((List<Prayer>)var1_1);
        0;
        return llIIlIIIIIlI[0];
    }

    @Inject
    public k(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.ac = f2;
        this.ad = squireFightCavesConfig;
        this.ae = n2;
    }

    private static void llllIlllllIlII() {
        llIIlIIIIIlI = new int[20];
        k.llIIlIIIIIlI[0] = (9 + 54 - -71 + 93 ^ 34 + 43 - 42 + 153) & (88 + 131 - 159 + 146 ^ 80 + 131 - 118 + 52 ^ -1);
        k.llIIlIIIIIlI[1] = 9 ^ 0xC;
        k.llIIlIIIIIlI[2] = 0x6B ^ 0x72;
        k.llIIlIIIIIlI[3] = 0x31 ^ 0x57 ^ (0x2A ^ 0x48);
        k.llIIlIIIIIlI[4] = 0xF ^ 0x78 ^ (0xCD ^ 0xA7);
        k.llIIlIIIIIlI[5] = 3;
        k.llIIlIIIIIlI[6] = 0xE4 ^ 0xC7;
        k.llIIlIIIIIlI[7] = 0x13 ^ 0xB;
        k.llIIlIIIIIlI[8] = 0x1C ^ 0xE;
        k.llIIlIIIIIlI[9] = 1;
        k.llIIlIIIIIlI[10] = 0x8F ^ 0xB0;
        k.llIIlIIIIIlI[11] = 0x1A ^ 0x4C ^ (9 ^ 0x59);
        k.llIIlIIIIIlI[12] = 0xFF ^ 0xBA ^ (0xCF ^ 0x84);
        k.llIIlIIIIIlI[13] = 0xBA ^ 0xA4;
        k.llIIlIIIIIlI[14] = 0x18 ^ 0x38 ^ (0x34 ^ 0x2A);
        k.llIIlIIIIIlI[15] = -(0xFFFFDFCB & 0x64BE) & (0xFFFFCFF9 & 0x7EEF);
        k.llIIlIIIIIlI[16] = 33 + 109 - 104 + 175 ^ 55 + 28 - 23 + 117;
        k.llIIlIIIIIlI[17] = 2;
        k.llIIlIIIIIlI[18] = -(0xFFFFB6E7 & 0x4D5B) & (0xFFFFFECF & 0x6D7F);
        k.llIIlIIIIIlI[19] = 0x5E ^ 0x56;
    }

    private static boolean llllIlllllIllI(Object object) {
        return object == null;
    }

    private static Map<Prayer, List<Prayer>> y() {
        HashMap<Prayer, List<Prayer>> hashMap = new HashMap<Prayer, List<Prayer>>();
        hashMap.put(Prayer.AUGURY, List.of(Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY, Prayer.EAGLE_EYE, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.MYSTIC_MIGHT, List.of(Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY, Prayer.EAGLE_EYE, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.RIGOUR, List.of(Prayer.AUGURY, Prayer.PIETY, Prayer.CHIVALRY, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.EAGLE_EYE, List.of(Prayer.AUGURY, Prayer.PIETY, Prayer.CHIVALRY, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.PIETY, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.CHIVALRY, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));
        0;
        hashMap.put(Prayer.ULTIMATE_STRENGTH, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.PIETY, Prayer.CHIVALRY));
        0;
        hashMap.put(Prayer.STEEL_SKIN, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY));
        0;
        hashMap.put(Prayer.INCREDIBLE_REFLEXES, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.PIETY, Prayer.CHIVALRY));
        0;
        hashMap.put(Prayer.PROTECT_FROM_MELEE, List.of(Prayer.PROTECT_FROM_MAGIC, Prayer.PROTECT_FROM_MISSILES));
        0;
        hashMap.put(Prayer.PROTECT_FROM_MAGIC, List.of(Prayer.PROTECT_FROM_MELEE, Prayer.PROTECT_FROM_MISSILES));
        0;
        hashMap.put(Prayer.PROTECT_FROM_MISSILES, List.of(Prayer.PROTECT_FROM_MELEE, Prayer.PROTECT_FROM_MAGIC));
        0;
        return hashMap;
    }

    private static boolean llllIllllllIll(Object object) {
        return object != null;
    }

    private static boolean llllIllllllIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String llllIlllllIIII(String var34, String var9) {
        var34 = new String(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var17 = var9.toCharArray();
        int var11 = llIIlIIIIIlI[0];
        char[] var21 = var34.toCharArray();
        int var36 = var21.length;
        int var7 = llIIlIIIIIlI[0];
        while (k.llllIlllllIlll(var7, var36)) {
            char var16 = var21[var7];
            var13.append((char)(var16 ^ var17[var11 % var17.length]));
            0;
            ++var11;
            ++var7;
            0;
            if (2 > 1) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean llllIlllllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llllIlllllIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(List<Prayer> list) {
        void var1_1;
        if (k.llllIlllllllIl(Rand.nextInt((int)llIIlIIIIIlI[0], (int)llIIlIIIIIlI[16]), llIIlIIIIIlI[9])) {
            return llIIlIIIIIlI[0];
        }
        HashSet var35 = new HashSet();
        Map<Prayer, List<Prayer>> var18 = k.y();
        Prayer[] var33 = Prayer.values();
        int var8 = var33.length;
        int var2 = llIIlIIIIIlI[0];
        while (k.llllIlllllIlll(var2, var8)) {
            List<Prayer> var26;
            Prayer var25 = var33[var2];
            if (k.llllIlllllIlIl(var26.contains(var25) ? 1 : 0) && k.llllIlllllllII(k.a(var25) ? 1 : 0)) {
                Prayers.toggle((Prayer)var25, (boolean)llIIlIIIIIlI[9]);
                var35.addAll(var18.getOrDefault(var25, Collections.emptyList()));
                0;
            }
            ++var2;
            0;
            if (1 <= (0xC ^ 8)) continue;
            return false;
        }
        boolean bl = k.a(list, llIIlIIIIIlI[0], (Set<Prayer>)var1_1);
        k.a(list, llIIlIIIIIlI[9], (Set<Prayer>)var1_1);
        0;
        return bl;
    }

    private static boolean llllIlllllllIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(List<Prayer> list, boolean bl, Set<Prayer> set) {
        int n2 = llIIlIIIIIlI[0];
        Iterator<Prayer> var24 = list.iterator();
        while (true) {
            void var5;
            void var15;
            int var19;
            if (k.llllIlllllIlIl(var24.hasNext() ? 1 : 0)) {
                return var19 != 0;
            }
            Prayer var37 = var24.next();
            if (!k.llllIllllllllI(var37, Prayer.PROTECT_ITEM) || k.llllIlllllIlIl((int)var15) && !k.llllIlllllIlIl(var5.contains(var37) ? 1 : 0)) continue;
            if (k.llllIlllllIlIl(k.a(var37) ? 1 : 0) && k.llllIlllllIlIl((int)var15)) {
                if (k.llllIlllllIlIl(k.a(var37) ? 1 : 0)) {
                    var19 = llIIlIIIIIlI[9];
                    0;
                    if ((3 & (3 ^ -1)) > 0) {
                        return ((0x54 ^ 0x53 ^ (0xBC ^ 0xAB)) & (0 + 122 - 31 + 44 ^ 110 + 41 - 54 + 54 ^ -1)) != 0;
                    }
                }
            } else {
                Prayers.toggle((Prayer)var37, (boolean)llIIlIIIIIlI[9]);
            }
            0;
            if (((0xC8 ^ 0xC5 ^ (0x4F ^ 0x71)) & (123 + 155 - 198 + 99 ^ 78 + 42 - 79 + 87 ^ -1)) >= 2) break;
        }
        return ((3 + 136 - -26 + 25 ^ 118 + 46 - 49 + 37) & (0x14 ^ 0x4F ^ (0x19 ^ 0x64) ^ -1)) != 0;
    }

    static {
        k.llllIlllllIlII();
        k.llllIlllllIIll();
        af = llIIlIIIIIlI[18];
    }

    private static boolean llllIlllllllII(int n2) {
        return n2 != 0;
    }

    private static String llllIlllllIIlI(String var1, String var6) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIIlIIIIIlI[19]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llIIlIIIIIlI[17], var20);
            return new String(var14.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllllllIlI(int n2, int n3) {
        return n2 != n3;
    }
}

