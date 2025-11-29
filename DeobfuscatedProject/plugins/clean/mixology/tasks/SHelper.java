/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.mixology.tasks;

import gg.squire.mixology.SquireMixology;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.mixology.tasks.GameEnum;

public class SHelper {

    private static final  WorldArea af;
    public static final  ThreadLocalRandom ae;

    /*
     * WARNING - void declaration
     */
    public static boolean h() {
        void var1;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int var2 = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(var2, (int)var1)) {
            void var3;
            void var4 = var3[var2];
            int[] nArray = new int[llllllllllIl[2]];
            nArray[s.llllllllllIl[1]] = var4.o();
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllllllllIl[2];
            }
            ++var2;

            if (-2 <= 0) continue;
            return (((0xBE ^ 0xB4) & ~(0xC ^ 6) ^ (0x6F ^ 0x37)) & (7 + 154 - 16 + 63 ^ 43 + 46 - 8 + 55 ^ -1)) != 0;
        }
        return llllllllllIl[1];
    }

    /*
     * WARNING - void declaration
     */
    public static int b(String string) {
        void var5;
        String var6;
        void var7;
        String string2 = Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[3]).getText().replaceAll(lllllllllIIl[llllllllllIl[1]], lllllllllIIl[llllllllllIl[2]]).trim();
        String string3 = Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[5]).getText().replaceAll(lllllllllIIl[llllllllllIl[3]], lllllllllIIl[llllllllllIl[0]]).trim();
        String string4 = Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[6]).getText().replaceAll(lllllllllIIl[llllllllllIl[5]], lllllllllIIl[llllllllllIl[7]]).trim();
        if (s.lIIlIlIllllIlIl(string2.equals(string) ? 1 : 0)) {
            return Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[2]).getSpriteId();
        }
        if (s.lIIlIlIllllIlIl(var7.equals(var6) ? 1 : 0)) {
            return Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[0]).getSpriteId();
        }
        if (s.lIIlIlIllllIlIl(var5.equals(var6) ? 1 : 0)) {
            return Widgets.get((int)llllllllllIl[4], (int)llllllllllIl[3]).getChild(llllllllllIl[7]).getSpriteId();
        }
        return llllllllllIl[8];
    }

    /*
     * WARNING - void declaration
     */
    public static t d(String string) {
        void var8;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int var9 = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(var9, (int)var8)) {
            String var10;
            void var11;
            void var12 = var11[var9];
            if (s.lIIlIlIllllIlIl(var12.a().equalsIgnoreCase(var10) ? 1 : 0)) {
                return var12;
            }
            ++var9;

            if (3 >= 0) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static t a(t ... tArray) {
        void var13;
        t t2 = null;
        int n2 = llllllllllIl[1];
        t[] tArray2 = tArray;
        int n3 = tArray2.length;
        int var14 = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(var14, (int)var13)) {
            int var15;
            void var16;
            void var17 = var16[var14];
            if (s.lIIlIlIllllIIlI(var17) && s.lIIlIlIllllIllI(var17.p(), var15)) {
                var15 = var17.p();
                void var18 = var17;
            }
            ++var14;

            if (((30 + 19 - 27 + 105 ^ (0x24 ^ 0x76)) & (1 + 124 - 29 + 58 ^ 125 + 37 - 31 + 52 ^ -1)) == 0) continue;
            return null;
        }
        return t2;
    }

        return String.valueOf(var19);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean f() {
        void var20;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int var21 = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(var21, (int)var20)) {
            block4: {
                block3: {
                    void var22;
                    void var23 = var22[var21];
                    int[] nArray = new int[llllllllllIl[2]];
                    nArray[s.llllllllllIl[1]] = var23.n();
                    if (!s.lIIlIlIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block3;
                    int[] nArray2 = new int[llllllllllIl[2]];
                    nArray2[s.llllllllllIl[1]] = var23.o();
                    if (!s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block4;
                }
                return llllllllllIl[2];
            }
            ++var21;

            if ((0x14 ^ 0x11) > 0) continue;
            return false;
        }
        return llllllllllIl[1];
    }

    public static boolean i() {
        if (s.lIIlIlIlllllIlI(Vars.getBit((int)llllllllllIl[33]))) {
            return llllllllllIl[2];
        }
        if (s.lIIlIlIlllllIlI(Vars.getBit((int)llllllllllIl[34]))) {
            return llllllllllIl[2];
        }
        if (s.lIIlIlIlllllIlI(Vars.getBit((int)llllllllllIl[35]))) {
            return llllllllllIl[2];
        }
        return llllllllllIl[1];
    }

    private static boolean lIIlIlIllllIlIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int e(String string) {
        void var24;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int var25 = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(var25, (int)var24)) {
            String var26;
            void var27;
            void var28 = var27[var25];
            if (s.lIIlIlIllllIlIl(var28.a().equalsIgnoreCase(var26) ? 1 : 0)) {
                return var28.o();
            }
            ++var25;

            if (-3 < 0) continue;
            return (0xBD ^ 0x84) & ~(0x46 ^ 0x7F);
        }
        return llllllllllIl[8];
    }

    static {
        s.lIIlIlIllllIIIl();
        s.lIIlIlIllllIIII();
        ae = ThreadLocalRandom.current();
        af = new WorldArea(llllllllllIl[41], llllllllllIl[42], llllllllllIl[27], llllllllllIl[40], llllllllllIl[1]);
    }

    private static boolean lIIlIlIllllIlll(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIlllllIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIlIlllllIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public static t a(String string, String string2, String string3, String string4) {
        String var29;
        void var30;
        void var31;
        Object var32;
        void var33;
        t t3;
        ArrayList<t> arrayList = new ArrayList<t>();
        if (s.lIIlIlIllllIIlI(string2) && s.lIIlIlIllllIIlI((Object)(t3 = s.d(string2)))) {
            arrayList.add(t3);

        }
        if (s.lIIlIlIllllIIlI(var33) && s.lIIlIlIllllIIlI(var32 = s.d((String)var33))) {
            var31.add(var32);

        }
        if (s.lIIlIlIllllIIlI(var30) && s.lIIlIlIllllIIlI(var32 = s.d((String)var30))) {
            var31.add(var32);

        }
        if (s.lIIlIlIllllIIll((var32 = var31.stream().filter(t2 -> t2.q().equalsIgnoreCase(var29)).collect(Collectors.toList())).isEmpty() ? 1 : 0)) {
            return var32.stream().max(Comparator.comparingInt(t::p)).orElse(null);
        }
        return arrayList.stream().max(Comparator.comparingInt(t::p)).orElse(null);
    }

    public static t a(String string, String string2, String string3) {
        t t2 = s.a(string);
        t t3 = s.a(string2);
        t t4 = s.a(string3);
        t[] tArray = new t[llllllllllIl[0]];
        tArray[s.llllllllllIl[1]] = t2;
        tArray[s.llllllllllIl[2]] = t3;
        tArray[s.llllllllllIl[3]] = t4;
        return s.a(tArray);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean c(String string) {
        void var34;
        t t2 = s.d(string);
        if (s.lIIlIlIllllIlll((Object)t2)) {
            System.out.println(string);
            System.out.println(lllllllllIIl[llllllllllIl[6]]);
            return llllllllllIl[1];
        }
        String[] stringArray = new String[llllllllllIl[2]];
        stringArray[s.llllllllllIl[1]] = lllllllllIIl[llllllllllIl[9]];
        TileObject var35 = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[llllllllllIl[2]];
        stringArray2[s.llllllllllIl[1]] = lllllllllIIl[llllllllllIl[10]];
        TileObject var36 = TileObjects.getNearest((String[])stringArray2);
        String[] stringArray3 = new String[llllllllllIl[2]];
        stringArray3[s.llllllllllIl[1]] = lllllllllIIl[llllllllllIl[11]];
        TileObject var37 = TileObjects.getNearest((String[])stringArray3);
        int var38 = llllllllllIl[12];
        int var39 = llllllllllIl[13];
        int var40 = llllllllllIl[14];
        if (s.lIIlIlIlllllIII(Vars.getBit((int)var38), var34.m()) && s.lIIlIlIllllIIll(Vars.getBit((int)var38))) {
            if (s.lIIlIlIlllllIIl(var34.m(), llllllllllIl[0])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[15]];
                var35.interact(lllllllllIIl[llllllllllIl[16]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(var34.m(), llllllllllIl[2])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[17]];
                var36.interact(lllllllllIIl[llllllllllIl[18]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(var34.m(), llllllllllIl[3])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[19]];
                var37.interact(lllllllllIIl[llllllllllIl[20]]);
                return llllllllllIl[1];
            }
            return llllllllllIl[1];
        }
        if (s.lIIlIlIlllllIII(Vars.getBit((int)var39), var34.k()) && s.lIIlIlIllllIIll(Vars.getBit((int)var39))) {
            if (s.lIIlIlIlllllIIl(var34.k(), llllllllllIl[0])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[21]];
                var35.interact(lllllllllIIl[llllllllllIl[22]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(var34.k(), llllllllllIl[2])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[23]];
                var36.interact(lllllllllIIl[llllllllllIl[24]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(var34.k(), llllllllllIl[3])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[25]];
                var37.interact(lllllllllIIl[llllllllllIl[26]]);
                return llllllllllIl[1];
            }
            return llllllllllIl[1];
        }
        if (s.lIIlIlIlllllIII(Vars.getBit((int)var40), var34.l()) && s.lIIlIlIllllIIll(Vars.getBit((int)var40))) {
            if (s.lIIlIlIlllllIIl(var34.l(), llllllllllIl[0])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[27]];
                var35.interact(lllllllllIIl[llllllllllIl[28]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(var34.l(), llllllllllIl[2])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[29]];
                var36.interact(lllllllllIIl[llllllllllIl[30]]);
                return llllllllllIl[1];
            }
            if (s.lIIlIlIlllllIIl(var34.l(), llllllllllIl[3])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[31]];
                var37.interact(lllllllllIIl[llllllllllIl[32]]);
                return llllllllllIl[1];
            }
            return llllllllllIl[1];
        }
        return llllllllllIl[2];
    }

    private static boolean lIIlIlIllllIIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public static int f(String string) {
        void var41;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int var42 = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(var42, (int)var41)) {
            String var43;
            void var44;
            void var45 = var44[var42];
            if (s.lIIlIlIllllIlIl(var45.a().equalsIgnoreCase(var43) ? 1 : 0)) {
                return var45.n();
            }
            ++var42;

            if (((0x59 ^ 9 ^ (0x7F ^ 0x64)) & (126 + 18 - 54 + 51 ^ 131 + 127 - 122 + 62 ^ -1)) == 0) continue;
            return (34 + 198 - 134 + 124 ^ 64 + 18 - 69 + 115) & (0xF3 ^ 0x96 ^ (0x43 ^ 0x78) ^ -1);
        }
        return llllllllllIl[8];
    }

    private static void lIIlIlIllllIIII() {
        lllllllllIIl = new String[llllllllllIl[43]];
        s.lllllllllIIl[s.llllllllllIl[1]] = "\\s*\\(.*?\\)";
        s.lllllllllIIl[s.llllllllllIl[2]] = s.lIIlIlIlllIIIll("", "ciqDk");
        s.lllllllllIIl[s.llllllllllIl[3]] = "\\s*\\(.*?\\)";
        s.lllllllllIIl[s.llllllllllIl[0]] = s.lIIlIlIlllIIIlI("25wiB9orx6o=", "OlnXD");
        s.lllllllllIIl[s.llllllllllIl[5]] = "\\s*\\(.*?\\)";
        s.lllllllllIIl[s.llllllllllIl[7]] = s.lIIlIlIlllIIIlI("48aqkaJ7YAg=", "UJNMh");
        s.lllllllllIIl[s.llllllllllIl[6]] = "Potion not found!";
        s.lllllllllIIl[s.llllllllllIl[9]] = "Lye lever";
        s.lllllllllIIl[s.llllllllllIl[10]] = "Mox lever";
        s.lllllllllIIl[s.llllllllllIl[11]] = "Aga lever";
        s.lllllllllIIl[s.llllllllllIl[15]] = "Operate lye lever";
        s.lllllllllIIl[s.llllllllllIl[16]] = "Operate";
        s.lllllllllIIl[s.llllllllllIl[17]] = "Operate mox lever";
        s.lllllllllIIl[s.llllllllllIl[18]] = "Operate";
        s.lllllllllIIl[s.llllllllllIl[19]] = "Operate aga lever";
        s.lllllllllIIl[s.llllllllllIl[20]] = "Operate";
        s.lllllllllIIl[s.llllllllllIl[21]] = "Operate lye lever";
        s.lllllllllIIl[s.llllllllllIl[22]] = "Operate";
        s.lllllllllIIl[s.llllllllllIl[23]] = "Operate mox lever";
        s.lllllllllIIl[s.llllllllllIl[24]] = "Operate";
        s.lllllllllIIl[s.llllllllllIl[25]] = "Operate aga lever";
        s.lllllllllIIl[s.llllllllllIl[26]] = "Operate";
        s.lllllllllIIl[s.llllllllllIl[27]] = "Operate lye lever";
        s.lllllllllIIl[s.llllllllllIl[28]] = "Operate";
        s.lllllllllIIl[s.llllllllllIl[29]] = "Operate mox lever";
        s.lllllllllIIl[s.llllllllllIl[30]] = "Operate";
        s.lllllllllIIl[s.llllllllllIl[31]] = "Operate aga lever";
        s.lllllllllIIl[s.llllllllllIl[32]] = "Operate";
        s.lllllllllIIl[s.llllllllllIl[36]] = "Found pot 1 finished, and pot1 = pot 2";
        s.lllllllllIIl[s.llllllllllIl[37]] = "Found pot 1 finished, and pot1 = pot 3";
        s.lllllllllIIl[s.llllllllllIl[38]] = "Found pot 1 finished, and pot1 = pot 3";
        s.lllllllllIIl[s.llllllllllIl[39]] = "Found pot 2 finished and pot 2 is equal to pot 3";
        s.lllllllllIIl[s.llllllllllIl[40]] = "NO pot 3 and found pot 3 unf";
    }

    private static boolean lIIlIlIllllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIllllIllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private static t a(String string) {
        void var46;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int var47 = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(var47, (int)var46)) {
            String var48;
            void var49;
            void var50 = var49[var47];
            if (s.lIIlIlIllllIlIl(var50.a().equalsIgnoreCase(var48) ? 1 : 0)) {
                return var50;
            }
            ++var47;

            if (2 != 0) continue;
            return null;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean a(int n2, int n3, int n4) {
        void var51;
        if (s.lIIlIlIllllIlIl(Players.getLocal().isAnimating() ? 1 : 0) && s.lIIlIlIllllIIll(SquireMixology.A ? 1 : 0)) {
            Static.getClient().getGraphicsObjects().forEach(graphicsObject -> {
                if (s.lIIlIlIlllllIIl(graphicsObject.getId(), n2) && s.lIIlIlIllllIIll(SquireMixology.A ? 1 : 0)) {
                    int[] nArray = new int[llllllllllIl[2]];
                    nArray[s.llllllllllIl[1]] = n4;
                    TileObjects.getNearest((int[])nArray).interact(llllllllllIl[1]);
                    SquireMixology.A = llllllllllIl[2];
                    return;
                }
            });
            return llllllllllIl[1];
        }
        if (s.lIIlIlIlllllIlI(Vars.getBit((int)var51)) && s.lIIlIlIllllIIll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llllllllllIl[2];
        }
        if (s.lIIlIlIllllIIll(s.g() ? 1 : 0)) {
            return llllllllllIl[1];
        }
        return llllllllllIl[2];
    }

    public static boolean e() {
        return af.contains(Players.getLocal().getWorldLocation());
    }

    /*
     * WARNING - void declaration
     */
    public static void j() {
        void var52;
        void var53;
        void var54;
        void var55;
        void var56;
        void var57;
        void var58;
        void var59;
        int n2 = SquireMixology.u;
        int n3 = SquireMixology.v;
        int n4 = SquireMixology.w;
        int n5 = s.f(SquireMixology.m);
        int n6 = s.e(SquireMixology.m);
        int n7 = s.f(SquireMixology.n);
        int n8 = s.e(SquireMixology.n);
        int n9 = s.f(SquireMixology.o);
        int n10 = s.e(SquireMixology.o);
        String string = SquireMixology.m;
        String string2 = SquireMixology.n;
        String string3 = SquireMixology.o;
        int[] nArray = new int[llllllllllIl[2]];
        nArray[s.llllllllllIl[1]] = n6;
        if (s.lIIlIlIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llllllllllIl[2]];
            nArray2[s.llllllllllIl[1]] = n5;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                SquireMixology.x = SquireMixology.r;
                System.out.println("Current: " + SquireMixology.x);
                return;
            }
        }
        int[] nArray3 = new int[llllllllllIl[2]];
        nArray3[s.llllllllllIl[1]] = var59;
        if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray3) ? 1 : 0) && s.lIIlIlIllllIlIl(var58.equalsIgnoreCase((String)var57) ? 1 : 0)) {
            int[] nArray4 = new int[llllllllllIl[2]];
            nArray4[s.llllllllllIl[1]] = var56;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[llllllllllIl[2]];
                nArray5[s.llllllllllIl[1]] = var59;
                if (s.lIIlIlIlllllIIl(Inventory.getCount((int[])nArray5), llllllllllIl[2])) {
                    System.out.println(lllllllllIIl[llllllllllIl[36]]);
                    SquireMixology.x = SquireMixology.s;
                    System.out.println("Current: " + SquireMixology.x);
                    return;
                }
            }
        }
        int[] nArray6 = new int[llllllllllIl[2]];
        nArray6[s.llllllllllIl[1]] = var59;
        if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray6) ? 1 : 0) && s.lIIlIlIllllIlIl(var57.equalsIgnoreCase((String)var55) ? 1 : 0)) {
            int[] nArray7 = new int[llllllllllIl[2]];
            nArray7[s.llllllllllIl[1]] = var54;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[llllllllllIl[2]];
                nArray8[s.llllllllllIl[1]] = var59;
                if (s.lIIlIlIlllllIIl(Inventory.getCount((int[])nArray8), llllllllllIl[2])) {
                    System.out.println(lllllllllIIl[llllllllllIl[37]]);
                    SquireMixology.x = SquireMixology.t;
                    System.out.println("Current: " + SquireMixology.x);
                    return;
                }
            }
        }
        int[] nArray9 = new int[llllllllllIl[2]];
        nArray9[s.llllllllllIl[1]] = var59;
        if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray9) ? 1 : 0) && s.lIIlIlIllllIlIl(var57.equalsIgnoreCase((String)var55) ? 1 : 0)) {
            int[] nArray10 = new int[llllllllllIl[2]];
            nArray10[s.llllllllllIl[1]] = var54;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[llllllllllIl[2]];
                nArray11[s.llllllllllIl[1]] = var59;
                if (s.lIIlIlIlllllIIl(Inventory.getCount((int[])nArray11), llllllllllIl[3])) {
                    System.out.println(lllllllllIIl[llllllllllIl[38]]);
                    SquireMixology.x = SquireMixology.t;
                    System.out.println("Current: " + SquireMixology.x);
                    return;
                }
            }
        }
        int[] nArray12 = new int[llllllllllIl[2]];
        nArray12[s.llllllllllIl[1]] = var53;
        if (s.lIIlIlIllllIIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llllllllllIl[2]];
            nArray13[s.llllllllllIl[1]] = var56;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray13) ? 1 : 0)) {
                SquireMixology.x = SquireMixology.s;
                System.out.println("Current: " + SquireMixology.x);
                return;
            }
        }
        int[] nArray14 = new int[llllllllllIl[2]];
        nArray14[s.llllllllllIl[1]] = var53;
        if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray14) ? 1 : 0) && s.lIIlIlIllllIlIl(var58.equalsIgnoreCase((String)var55) ? 1 : 0)) {
            int[] nArray15 = new int[llllllllllIl[2]];
            nArray15[s.llllllllllIl[1]] = var54;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray15) ? 1 : 0)) {
                System.out.println(lllllllllIIl[llllllllllIl[39]]);
                SquireMixology.x = SquireMixology.t;
                System.out.println("Current: " + SquireMixology.x);
                return;
            }
        }
        int[] nArray16 = new int[llllllllllIl[2]];
        nArray16[s.llllllllllIl[1]] = var52;
        if (s.lIIlIlIllllIIll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
            int[] nArray17 = new int[llllllllllIl[2]];
            nArray17[s.llllllllllIl[1]] = var54;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray17) ? 1 : 0)) {
                System.out.println(lllllllllIIl[llllllllllIl[40]]);
                SquireMixology.x = SquireMixology.t;
                System.out.println("Current: " + SquireMixology.x);
                return;
            }
        }
    }

    private static boolean lIIlIlIllllIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIlllllIlI(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean g() {
        void var60;
        t[] tArray = t.values();
        int n2 = tArray.length;
        int var61 = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(var61, (int)var60)) {
            void var62;
            void var63 = var62[var61];
            int[] nArray = new int[llllllllllIl[2]];
            nArray[s.llllllllllIl[1]] = var63.n();
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllllllllIl[2];
            }
            ++var61;

            if ((1 & ~1) != 3) continue;
            return false;
        }
        return llllllllllIl[1];
    }

    /*
     * WARNING - void declaration
     */
    public static boolean b(String string, String string2, String string3) {
        int var64;
        int var65;
        int var66;
        void var67;
        int n2 = llllllllllIl[1];
        int n3 = llllllllllIl[1];
        int n4 = llllllllllIl[1];
        t[] tArray = t.values();
        int n5 = tArray.length;
        int var68 = llllllllllIl[1];
        while (s.lIIlIlIllllIlII(var68, (int)var67)) {
            void var69;
            void var70;
            String var71;
            void var72;
            void var73 = var72[var68];
            if (s.lIIlIlIllllIlIl(var73.a().equalsIgnoreCase(var71) ? 1 : 0)) {
                var66 = var73.o();

                }
            } else if (s.lIIlIlIllllIlIl(var73.a().equalsIgnoreCase((String)var70) ? 1 : 0)) {
                var65 = var73.o();

                if (((0xC ^ 0x1C ^ (0x22 ^ 0x27)) & (0x65 ^ 0x57 ^ (0x50 ^ 0x77) ^ -1)) != 0) {
                    return ((0xD2 ^ 0xAE ^ (0x93 ^ 0xC0)) & (109 + 41 - 93 + 180 ^ 63 + 153 - 40 + 18 ^ -1)) != 0;
                }
            } else if (s.lIIlIlIllllIlIl(var73.a().equalsIgnoreCase((String)var69) ? 1 : 0)) {
                var64 = var73.o();

                if (1 != 1) {
                    return ((63 + 138 - 193 + 162 ^ 99 + 57 - 71 + 50) & (0x57 ^ 0x26 ^ (0xC9 ^ 0x95) ^ -1)) != 0;
                }
            }
            ++var68;

            if (1 >= ((0x51 ^ 0x3B ^ (0xA ^ 0x58)) & (0x3E ^ 0x67 ^ (0xA1 ^ 0xC0) ^ -1))) continue;
            return ((0xD0 ^ 0xA2 ^ (0xC6 ^ 0xBC)) & (0xC9 ^ 0xAB ^ (0xFB ^ 0x91) ^ -1)) != 0;
        }
        int[] nArray = new int[llllllllllIl[2]];
        nArray[s.llllllllllIl[1]] = var66;
        if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[llllllllllIl[2]];
            nArray2[s.llllllllllIl[1]] = var65;
            if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[llllllllllIl[2]];
                nArray3[s.llllllllllIl[1]] = var64;
                if (s.lIIlIlIllllIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                    return llllllllllIl[2];
                }
            }
        }
        return llllllllllIl[1];
    }
}

