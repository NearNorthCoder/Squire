/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.ImmutableSet$Builder
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.hunter.tasks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import gg.squire.hunter.tasks.GameEnum;
import gg.squire.hunter.tasks.KHelper;

public final class GameEnum13
extends Enum<f> {
    public static final  /* enum */ f I_PATCH;
    public static final  /* enum */ f G_MUSHROOM;
    
    private final  WorldPoint location;
    public static final  /* enum */ f C_MUSHROOM;
    public static final  /* enum */ f D_SEAWEED;
    public static final  /* enum */ f F_PATCH;
    public static final  /* enum */ f E_MUSHROOM;
    private static final  ImmutableMultimap<g, f> GROUPS;
    public static final  /* enum */ f G_PATCH;
    public static final  /* enum */ f K_PATCH;
    public static final  /* enum */ f A_MUSHROOM;
    public static final  /* enum */ f E_PATCH;
    public static final  /* enum */ f B_SEAWEED;
    public static final  /* enum */ f J_PATCH;
    public static final  /* enum */ f H_SEAWEED_EAST;
    private static final  f[] $VALUES;
    public static final  /* enum */ f I_MUSHROOM;
    public static final  /* enum */ f D_PATCH;
    private final  List<k> trails;
    public static final  /* enum */ f H_SEAWEED_WEST;
    public static final  /* enum */ f C_PATCH;
    private static final  Set<WorldPoint> SPOTS;
    public static final  /* enum */ f F_MUSHROOM;
    private static final  Set<Integer> TRAILS;
    public static final  /* enum */ f A_PATCH;
    
    private final  g group;

    private GameEnum13(g g2, WorldPoint worldPoint, k ... kArray) {
        this.group = g2;
        this.location = worldPoint;
        this.trails = ImmutableList.copyOf((Object[])kArray);
    }

    private static void lIIIlIlIlllIIIl() {
        lllIIlllIIIl = new String[lllIIlllIIlI[100]];
        f.lllIIlllIIIl[f.lllIIlllIIlI[0]] = "A_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[5]] = "A_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[3]] = "B_SEAWEED";
        f.lllIIlllIIIl[f.lllIIlllIIlI[20]] = "C_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[15]] = "C_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[30]] = "D_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[37]] = "D_SEAWEED";
        f.lllIIlllIIIl[f.lllIIlllIIlI[40]] = "E_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[47]] = "E_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[50]] = "F_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[57]] = "F_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[61]] = "G_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[66]] = "G_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[68]] = "H_SEAWEED_EAST";
        f.lllIIlllIIIl[f.lllIIlllIIlI[75]] = "H_SEAWEED_WEST";
        f.lllIIlllIIIl[f.lllIIlllIIlI[80]] = "I_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[87]] = "I_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[89]] = "J_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[93]] = "K_PATCH";
    }

    private static boolean lIIIlIlIlllIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block2: {
            void var1;
            f.lIIIlIlIlllIIlI();
            f.lIIIlIlIlllIIIl();
            k[] kArray = new k[lllIIlllIIlI[3]];
            kArray[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[4], lllIIlllIIlI[5], lllIIlllIIlI[6]);
            kArray[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[7], lllIIlllIIlI[5], lllIIlllIIlI[8]);
            A_MUSHROOM = new GameEnum13(g.A, new WorldPoint(lllIIlllIIlI[1], lllIIlllIIlI[2], lllIIlllIIlI[0]), kArray);
            k[] kArray2 = new k[lllIIlllIIlI[5]];
            kArray2[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[11], lllIIlllIIlI[3], lllIIlllIIlI[12]);
            A_PATCH = new GameEnum13(g.A, new WorldPoint(lllIIlllIIlI[9], lllIIlllIIlI[10], lllIIlllIIlI[0]), kArray2);
            k[] kArray3 = new k[lllIIlllIIlI[15]];
            kArray3[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[16], lllIIlllIIlI[3], lllIIlllIIlI[17]);
            kArray3[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[4], lllIIlllIIlI[3], lllIIlllIIlI[6]);
            kArray3[f.lllIIlllIIlI[3]] = new KHelper(lllIIlllIIlI[18], lllIIlllIIlI[5], lllIIlllIIlI[19]);
            kArray3[f.lllIIlllIIlI[20]] = new KHelper(lllIIlllIIlI[21], lllIIlllIIlI[5], lllIIlllIIlI[22]);
            B_SEAWEED = new GameEnum13(g.B, new WorldPoint(lllIIlllIIlI[13], lllIIlllIIlI[14], lllIIlllIIlI[0]), kArray3);
            k[] kArray4 = new k[lllIIlllIIlI[5]];
            kArray4[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[25], lllIIlllIIlI[3], lllIIlllIIlI[26]);
            C_MUSHROOM = new GameEnum13(g.C, new WorldPoint(lllIIlllIIlI[23], lllIIlllIIlI[24], lllIIlllIIlI[0]), kArray4);
            k[] kArray5 = new k[lllIIlllIIlI[3]];
            kArray5[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[28], lllIIlllIIlI[5], lllIIlllIIlI[29]);
            kArray5[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[16], lllIIlllIIlI[5], lllIIlllIIlI[17]);
            C_PATCH = new GameEnum13(g.C, new WorldPoint(lllIIlllIIlI[27], lllIIlllIIlI[24], lllIIlllIIlI[0]), kArray5);
            k[] kArray6 = new k[lllIIlllIIlI[3]];
            kArray6[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[33], lllIIlllIIlI[5], lllIIlllIIlI[34]);
            kArray6[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[35], lllIIlllIIlI[5], lllIIlllIIlI[36]);
            D_PATCH = new GameEnum13(g.D, new WorldPoint(lllIIlllIIlI[31], lllIIlllIIlI[32], lllIIlllIIlI[0]), kArray6);
            k[] kArray7 = new k[lllIIlllIIlI[3]];
            kArray7[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[28], lllIIlllIIlI[3], lllIIlllIIlI[29]);
            kArray7[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[21], lllIIlllIIlI[3], lllIIlllIIlI[22]);
            D_SEAWEED = new GameEnum13(g.D, new WorldPoint(lllIIlllIIlI[38], lllIIlllIIlI[39], lllIIlllIIlI[0]), kArray7);
            k[] kArray8 = new k[lllIIlllIIlI[3]];
            kArray8[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[43], lllIIlllIIlI[5], lllIIlllIIlI[44]);
            kArray8[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[45], lllIIlllIIlI[5], lllIIlllIIlI[46]);
            E_MUSHROOM = new GameEnum13(g.E, new WorldPoint(lllIIlllIIlI[41], lllIIlllIIlI[42], lllIIlllIIlI[0]), kArray8);
            k[] kArray9 = new k[lllIIlllIIlI[5]];
            kArray9[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[7], lllIIlllIIlI[3], lllIIlllIIlI[8]);
            E_PATCH = new GameEnum13(g.E, new WorldPoint(lllIIlllIIlI[48], lllIIlllIIlI[49], lllIIlllIIlI[0]), kArray9);
            k[] kArray10 = new k[lllIIlllIIlI[20]];
            kArray10[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[53], lllIIlllIIlI[5], lllIIlllIIlI[54]);
            kArray10[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[55], lllIIlllIIlI[5], lllIIlllIIlI[56]);
            kArray10[f.lllIIlllIIlI[3]] = new KHelper(lllIIlllIIlI[43], lllIIlllIIlI[3], lllIIlllIIlI[44]);
            F_MUSHROOM = new GameEnum13(g.F, new WorldPoint(lllIIlllIIlI[51], lllIIlllIIlI[52], lllIIlllIIlI[0]), kArray10);
            k[] kArray11 = new k[lllIIlllIIlI[5]];
            kArray11[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[59], lllIIlllIIlI[3], lllIIlllIIlI[60]);
            F_PATCH = new GameEnum13(g.F, new WorldPoint(lllIIlllIIlI[51], lllIIlllIIlI[58], lllIIlllIIlI[0]), kArray11);
            k[] kArray12 = new k[lllIIlllIIlI[3]];
            kArray12[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[35], lllIIlllIIlI[3], lllIIlllIIlI[36]);
            kArray12[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[64], lllIIlllIIlI[5], lllIIlllIIlI[65]);
            G_MUSHROOM = new GameEnum13(g.G, new WorldPoint(lllIIlllIIlI[62], lllIIlllIIlI[63], lllIIlllIIlI[0]), kArray12);
            k[] kArray13 = new k[lllIIlllIIlI[5]];
            kArray13[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[55], lllIIlllIIlI[3], lllIIlllIIlI[56]);
            G_PATCH = new GameEnum13(g.G, new WorldPoint(lllIIlllIIlI[67], lllIIlllIIlI[63], lllIIlllIIlI[0]), kArray13);
            k[] kArray14 = new k[lllIIlllIIlI[3]];
            kArray14[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[71], lllIIlllIIlI[5], lllIIlllIIlI[72]);
            kArray14[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[73], lllIIlllIIlI[5], lllIIlllIIlI[74]);
            H_SEAWEED_EAST = new GameEnum13(g.H, new WorldPoint(lllIIlllIIlI[69], lllIIlllIIlI[70], lllIIlllIIlI[0]), kArray14);
            k[] kArray15 = new k[lllIIlllIIlI[3]];
            kArray15[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[33], lllIIlllIIlI[3], lllIIlllIIlI[34]);
            kArray15[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[78], lllIIlllIIlI[5], lllIIlllIIlI[79]);
            H_SEAWEED_WEST = new GameEnum13(g.H, new WorldPoint(lllIIlllIIlI[76], lllIIlllIIlI[77], lllIIlllIIlI[0]), kArray15);
            k[] kArray16 = new k[lllIIlllIIlI[3]];
            kArray16[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[83], lllIIlllIIlI[5], lllIIlllIIlI[84]);
            kArray16[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[85], lllIIlllIIlI[5], lllIIlllIIlI[86]);
            I_MUSHROOM = new GameEnum13(g.I, new WorldPoint(lllIIlllIIlI[81], lllIIlllIIlI[82], lllIIlllIIlI[0]), kArray16);
            k[] kArray17 = new k[lllIIlllIIlI[3]];
            kArray17[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[53], lllIIlllIIlI[3], lllIIlllIIlI[54]);
            kArray17[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[45], lllIIlllIIlI[3], lllIIlllIIlI[46]);
            I_PATCH = new GameEnum13(g.I, new WorldPoint(lllIIlllIIlI[81], lllIIlllIIlI[88], lllIIlllIIlI[0]), kArray17);
            k[] kArray18 = new k[lllIIlllIIlI[3]];
            kArray18[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[71], lllIIlllIIlI[3], lllIIlllIIlI[72]);
            kArray18[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[91], lllIIlllIIlI[5], lllIIlllIIlI[92]);
            J_PATCH = new GameEnum13(g.J, new WorldPoint(lllIIlllIIlI[76], lllIIlllIIlI[90], lllIIlllIIlI[0]), kArray18);
            k[] kArray19 = new k[lllIIlllIIlI[20]];
            kArray19[f.lllIIlllIIlI[0]] = new KHelper(lllIIlllIIlI[83], lllIIlllIIlI[3], lllIIlllIIlI[84]);
            kArray19[f.lllIIlllIIlI[5]] = new KHelper(lllIIlllIIlI[96], lllIIlllIIlI[5], lllIIlllIIlI[97]);
            kArray19[f.lllIIlllIIlI[3]] = new KHelper(lllIIlllIIlI[98], lllIIlllIIlI[5], lllIIlllIIlI[99]);
            K_PATCH = new GameEnum13(g.K, new WorldPoint(lllIIlllIIlI[94], lllIIlllIIlI[95], lllIIlllIIlI[0]), kArray19);
            f[] fArray = new f[lllIIlllIIlI[100]];
            fArray[f.lllIIlllIIlI[0]] = A_MUSHROOM;
            fArray[f.lllIIlllIIlI[5]] = A_PATCH;
            fArray[f.lllIIlllIIlI[3]] = B_SEAWEED;
            fArray[f.lllIIlllIIlI[20]] = C_MUSHROOM;
            fArray[f.lllIIlllIIlI[15]] = C_PATCH;
            fArray[f.lllIIlllIIlI[30]] = D_PATCH;
            fArray[f.lllIIlllIIlI[37]] = D_SEAWEED;
            fArray[f.lllIIlllIIlI[40]] = E_MUSHROOM;
            fArray[f.lllIIlllIIlI[47]] = E_PATCH;
            fArray[f.lllIIlllIIlI[50]] = F_MUSHROOM;
            fArray[f.lllIIlllIIlI[57]] = F_PATCH;
            fArray[f.lllIIlllIIlI[61]] = G_MUSHROOM;
            fArray[f.lllIIlllIIlI[66]] = G_PATCH;
            fArray[f.lllIIlllIIlI[68]] = H_SEAWEED_EAST;
            fArray[f.lllIIlllIIlI[75]] = H_SEAWEED_WEST;
            fArray[f.lllIIlllIIlI[80]] = I_MUSHROOM;
            fArray[f.lllIIlllIIlI[87]] = I_PATCH;
            fArray[f.lllIIlllIIlI[89]] = J_PATCH;
            fArray[f.lllIIlllIIlI[93]] = K_PATCH;
            $VALUES = fArray;
            ImmutableMultimap.Builder builder = new ImmutableMultimap.Builder();
            ImmutableSet.Builder builder2 = new ImmutableSet.Builder();
            ImmutableSet.Builder builder3 = new ImmutableSet.Builder();
            f[] fArray2 = f.values();
            int n2 = fArray2.length;
            int var2 = lllIIlllIIlI[0];
            while (f.lIIIlIlIlllIIll(var2, (int)var1)) {
                void var3;
                void var4;
                void var5;
                void var6 = var5[var2];
                var4.put((Object)var6.k(), (Object)var6);

                var3.add((Object)var6.l());

                Iterator<k> var7 = var6.m().iterator();
                while (f.lIIIlIlIlllIlII(var7.hasNext() ? 1 : 0)) {
                    void var8;
                    k var9 = var7.next();
                    var8.addAll(var9.L());

                    if ((0x68 ^ 0x6C) > 0) continue;
                    break block2;
                }
                ++var2;

                if (-1 <= (0x6F ^ 0x6B)) continue;
                break block2;
            }
            GROUPS = builder.build();
            SPOTS = builder2.build();
            TRAILS = builder3.build();
        }
    }

    static boolean b(WorldPoint worldPoint) {
        return SPOTS.contains(worldPoint);
    }

    public g k() {
        return this.group;
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    static List<WorldPoint> a(g g2) {
        return GROUPS.get((Object)g2).stream().map(f::l).collect(Collectors.toList());
    }

    static boolean b(int n2) {
        return TRAILS.contains(n2);
    }

    private static boolean lIIIlIlIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum13.class, string);
    }

        return String.valueOf(var10);
    }

    public List<k> m() {
        return this.trails;
    }

    public WorldPoint l() {
        return this.location;
    }

}

