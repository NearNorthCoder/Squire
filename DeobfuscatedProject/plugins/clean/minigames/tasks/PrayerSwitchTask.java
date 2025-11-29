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
package gg.squire.minigames.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import gg.squire.minigames.tasks.GameEnum;
import gg.squire.minigames.tasks.CHelper;
import gg.squire.minigames.tasks.FHelper;
import gg.squire.minigames.tasks.NHelper;
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

@TaskDesc(name="Prayer Switch Task", priority=100)
public class PrayerSwitchTask
extends Task {
    static final  int af;
    private final  n ae;
    private final  SquireFightCavesConfig ad;
    
    private final  f ac;

    private static void llllIlllllIIll() {
        llIIlIIIIIIl = new String[llIIlIIIIIlI[3]];
        k.llIIlIIIIIIl[k.llIIlIIIIIlI[0]] = "Generating tiles";
        k.llIIlIIIIIIl[k.llIIlIIIIIlI[9]] = "In jad fight";
        k.llIIlIIIIIIl[k.llIIlIIIIIlI[17]] = "Cave entrance";
        k.llIIlIIIIIIl[k.llIIlIIIIIlI[5]] = "Leave";
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
            k var1;
            var1.sleep(llIIlIIIIIlI[1]);
            System.out.println(llIIlIIIIIIl[llIIlIIIIIlI[0]]);
            n.al = TileObjects.getNearest(tileObject -> {
                int n2;
                if (k.llllIlllllllII(tileObject.getName().equalsIgnoreCase(llIIlIIIIIIl[llIIlIIIIIlI[17]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIIlIIIIIlI[9]];
                    stringArray[k.llIIlIIIIIlI[0]] = llIIlIIIIIIl[llIIlIIIIIlI[5]];
                    if (k.llllIlllllllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIIlIIIIIlI[9];

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
        ArrayList<Prayer> var2 = new ArrayList<Prayer>();
        var2.addAll(Prayers.getRangePrayers());

        NPC var3 = NPCs.getNearest((int[])c.p);
        NPC var4 = NPCs.getNearest((int[])c.q);
        NPC var5 = NPCs.getNearest((int[])c.r);
        NPC var6 = NPCs.getNearest((int[])c.s);
        NPC var7 = NPCs.getNearest((int[])c.t);
        NPC var8 = NPCs.getNearest((int[])c.u);
        NPC var9 = NPCs.getNearest((int[])c.v);
        if (k.llllIlllllIlll(f.p(), llIIlIIIIIlI[10])) {
            if (k.llllIllllllIII(f.D, llIIlIIIIIlI[11])) {
                var2.add(Prayer.PROTECT_FROM_MELEE);

            }
            if (k.llllIllllllIIl(f.p(), llIIlIIIIIlI[11]) && k.llllIllllllIlI(f.p(), llIIlIIIIIlI[12]) && k.llllIllllllIlI(f.p(), llIIlIIIIIlI[13]) && k.llllIllllllIlI(f.p(), llIIlIIIIIlI[14])) {
                if (!k.llllIlllllIlIl(f.a(Static.getClient(), b.BLOB, Players.getLocal()) ? 1 : 0) || !k.llllIlllllIlIl(f.a(Static.getClient(), b.SMALL_BLOB, Players.getLocal()) ? 1 : 0) || !k.llllIlllllIlIl(f.a(Static.getClient(), b.MELEER, Players.getLocal()) ? 1 : 0) || k.llllIlllllIlll(f.r(), llIIlIIIIIlI[9]) && k.llllIllllllIll(var7) && k.llllIlllllllII(n.c(var7.getWorldArea().toWorldPointList()) ? 1 : 0)) {
                    var2.add(Prayer.PROTECT_FROM_MELEE);

                }
                if (!k.llllIlllllIlIl(f.a(Static.getClient(), b.RANGER, Players.getLocal()) ? 1 : 0) || k.llllIlllllIlll(f.u(), llIIlIIIIIlI[9]) && k.llllIllllllIll(var6) && k.llllIlllllIllI(var8)) {
                    var2.add(Prayer.PROTECT_FROM_MISSILES);

                }
                if (!k.llllIlllllIlIl(f.a(Static.getClient(), b.MAGER, Players.getLocal()) ? 1 : 0) || k.llllIlllllIlll(f.t(), llIIlIIIIIlI[9]) && k.llllIllllllIll(var8)) {
                    var2.add(Prayer.PROTECT_FROM_MAGIC);

                }
            }
            if (k.llllIlllllllIl(f.p(), llIIlIIIIIlI[12])) {
                var2.add(Prayer.PROTECT_FROM_MISSILES);

            }
            if (k.llllIlllllllIl(f.p(), llIIlIIIIIlI[13])) {
                var2.add(Prayer.PROTECT_FROM_MELEE);

            }
            if (k.llllIlllllllIl(f.p(), llIIlIIIIIlI[14])) {
                var2.add(Prayer.PROTECT_FROM_MAGIC);

            }
        }
        if (k.llllIllllllIll(var9)) {
            System.out.println(llIIlIIIIIIl[llIIlIIIIIlI[9]]);
            if (k.llllIlllllllIl(var9.getAnimation(), llIIlIIIIIlI[15])) {
                var2.add(Prayer.PROTECT_FROM_MAGIC);

                if ((0x16 ^ 0x12) < 0) {
                    return false;
                }
            } else {
                var2.add(Prayer.PROTECT_FROM_MISSILES);

            }
        }
        k.a((List<Prayer>)var1_1);

        return llIIlIIIIIlI[0];
    }

    @Inject
    public PrayerSwitchTask(f f2, SquireFightCavesConfig squireFightCavesConfig, n n2) {
        this.ac = f2;
        this.ad = squireFightCavesConfig;
        this.ae = n2;
    }

    private static boolean llllIlllllIllI(Object object) {
        return object == null;
    }

    private static Map<Prayer, List<Prayer>> y() {
        HashMap<Prayer, List<Prayer>> hashMap = new HashMap<Prayer, List<Prayer>>();
        hashMap.put(Prayer.AUGURY, List.of(Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY, Prayer.EAGLE_EYE, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));

        hashMap.put(Prayer.MYSTIC_MIGHT, List.of(Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY, Prayer.EAGLE_EYE, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));

        hashMap.put(Prayer.RIGOUR, List.of(Prayer.AUGURY, Prayer.PIETY, Prayer.CHIVALRY, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));

        hashMap.put(Prayer.EAGLE_EYE, List.of(Prayer.AUGURY, Prayer.PIETY, Prayer.CHIVALRY, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));

        hashMap.put(Prayer.PIETY, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));

        hashMap.put(Prayer.CHIVALRY, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES, Prayer.STEEL_SKIN));

        hashMap.put(Prayer.ULTIMATE_STRENGTH, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.PIETY, Prayer.CHIVALRY));

        hashMap.put(Prayer.STEEL_SKIN, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.PIETY, Prayer.CHIVALRY));

        hashMap.put(Prayer.INCREDIBLE_REFLEXES, List.of(Prayer.AUGURY, Prayer.RIGOUR, Prayer.EAGLE_EYE, Prayer.MYSTIC_MIGHT, Prayer.PIETY, Prayer.CHIVALRY));

        hashMap.put(Prayer.PROTECT_FROM_MELEE, List.of(Prayer.PROTECT_FROM_MAGIC, Prayer.PROTECT_FROM_MISSILES));

        hashMap.put(Prayer.PROTECT_FROM_MAGIC, List.of(Prayer.PROTECT_FROM_MELEE, Prayer.PROTECT_FROM_MISSILES));

        hashMap.put(Prayer.PROTECT_FROM_MISSILES, List.of(Prayer.PROTECT_FROM_MELEE, Prayer.PROTECT_FROM_MAGIC));

        return hashMap;
    }

    private static boolean llllIllllllIll(Object object) {
        return object != null;
    }

    private static boolean llllIllllllIII(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var10);
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
        HashSet var11 = new HashSet();
        Map<Prayer, List<Prayer>> var12 = k.y();
        Prayer[] var13 = Prayer.values();
        int var14 = var13.length;
        int var15 = llIIlIIIIIlI[0];
        while (k.llllIlllllIlll(var15, var14)) {
            List<Prayer> var16;
            Prayer var17 = var13[var15];
            if (k.llllIlllllIlIl(var16.contains(var17) ? 1 : 0) && k.llllIlllllllII(k.a(var17) ? 1 : 0)) {
                Prayers.toggle((Prayer)var17, (boolean)llIIlIIIIIlI[9]);
                var11.addAll(var12.getOrDefault(var17, Collections.emptyList()));

            }
            ++var15;

            if (1 <= (0xC ^ 8)) continue;
            return false;
        }
        boolean bl = k.a(list, llIIlIIIIIlI[0], (Set<Prayer>)var1_1);
        k.a(list, llIIlIIIIIlI[9], (Set<Prayer>)var1_1);

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
        Iterator<Prayer> var18 = list.iterator();
        while (true) {
            void var19;
            void var20;
            int var21;
            if (k.llllIlllllIlIl(var18.hasNext() ? 1 : 0)) {
                return var21 != 0;
            }
            Prayer var22 = var18.next();
            if (!k.llllIllllllllI(var22, Prayer.PROTECT_ITEM) || k.llllIlllllIlIl((int)var20) && !k.llllIlllllIlIl(var19.contains(var22) ? 1 : 0)) continue;
            if (k.llllIlllllIlIl(k.a(var22) ? 1 : 0) && k.llllIlllllIlIl((int)var20)) {
                if (k.llllIlllllIlIl(k.a(var22) ? 1 : 0)) {
                    var21 = llIIlIIIIIlI[9];

                    if ((3 & (3 ^ -1)) > 0) {
                        return ((0x54 ^ 0x53 ^ (0xBC ^ 0xAB)) & (0 + 122 - 31 + 44 ^ 110 + 41 - 54 + 54 ^ -1)) != 0;
                    }
                }
            } else {
                Prayers.toggle((Prayer)var22, (boolean)llIIlIIIIIlI[9]);
            }

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

    private static boolean llllIllllllIlI(int n2, int n3) {
        return n2 != n3;
    }
}

