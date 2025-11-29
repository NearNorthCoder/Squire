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
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

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
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.g;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.k;

public final class f
extends Enum<f> {
    public static final /* synthetic */ /* enum */ f I_PATCH;
    public static final /* synthetic */ /* enum */ f G_MUSHROOM;
    private static /* synthetic */ String[] lllIIlllIIIl;
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ /* enum */ f C_MUSHROOM;
    public static final /* synthetic */ /* enum */ f D_SEAWEED;
    public static final /* synthetic */ /* enum */ f F_PATCH;
    public static final /* synthetic */ /* enum */ f E_MUSHROOM;
    private static final /* synthetic */ ImmutableMultimap<g, f> GROUPS;
    public static final /* synthetic */ /* enum */ f G_PATCH;
    public static final /* synthetic */ /* enum */ f K_PATCH;
    public static final /* synthetic */ /* enum */ f A_MUSHROOM;
    public static final /* synthetic */ /* enum */ f E_PATCH;
    public static final /* synthetic */ /* enum */ f B_SEAWEED;
    public static final /* synthetic */ /* enum */ f J_PATCH;
    public static final /* synthetic */ /* enum */ f H_SEAWEED_EAST;
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ /* enum */ f I_MUSHROOM;
    public static final /* synthetic */ /* enum */ f D_PATCH;
    private final /* synthetic */ List<k> trails;
    public static final /* synthetic */ /* enum */ f H_SEAWEED_WEST;
    public static final /* synthetic */ /* enum */ f C_PATCH;
    private static final /* synthetic */ Set<WorldPoint> SPOTS;
    public static final /* synthetic */ /* enum */ f F_MUSHROOM;
    private static final /* synthetic */ Set<Integer> TRAILS;
    public static final /* synthetic */ /* enum */ f A_PATCH;
    private static /* synthetic */ int[] lllIIlllIIlI;
    private final /* synthetic */ g group;

    private static String lIIIlIlIlllIIII(String lllllllllllllllIIllIIlllIIllIllI, String lllllllllllllllIIllIIlllIIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlllIIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlllIIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlllIIlllIII.init(lllIIlllIIlI[3], lllllllllllllllIIllIIlllIIlllIIl);
            return new String(lllllllllllllllIIllIIlllIIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlllIIllIlll) {
            lllllllllllllllIIllIIlllIIllIlll.printStackTrace();
            return null;
        }
    }

    private f(g g2, WorldPoint worldPoint, k ... kArray) {
        this.group = g2;
        this.location = worldPoint;
        this.trails = ImmutableList.copyOf((Object[])kArray);
    }

    private static void lIIIlIlIlllIIIl() {
        lllIIlllIIIl = new String[lllIIlllIIlI[100]];
        f.lllIIlllIIIl[f.lllIIlllIIlI[0]] = f."A_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[5]] = f."A_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[3]] = f."B_SEAWEED";
        f.lllIIlllIIIl[f.lllIIlllIIlI[20]] = f."C_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[15]] = f."C_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[30]] = f."D_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[37]] = f."D_SEAWEED";
        f.lllIIlllIIIl[f.lllIIlllIIlI[40]] = f."E_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[47]] = f."E_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[50]] = f."F_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[57]] = f."F_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[61]] = f."G_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[66]] = f."G_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[68]] = f."H_SEAWEED_EAST";
        f.lllIIlllIIIl[f.lllIIlllIIlI[75]] = f."H_SEAWEED_WEST";
        f.lllIIlllIIIl[f.lllIIlllIIlI[80]] = f."I_MUSHROOM";
        f.lllIIlllIIIl[f.lllIIlllIIlI[87]] = f."I_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[89]] = f."J_PATCH";
        f.lllIIlllIIIl[f.lllIIlllIIlI[93]] = f."K_PATCH";
    }

    private static boolean lIIIlIlIlllIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block2: {
            void lllllllllllllllIIllIIlllIllIIlll;
            f.lIIIlIlIlllIIlI();
            f.lIIIlIlIlllIIIl();
            k[] kArray = new k[lllIIlllIIlI[3]];
            kArray[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[4], lllIIlllIIlI[5], lllIIlllIIlI[6]);
            kArray[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[7], lllIIlllIIlI[5], lllIIlllIIlI[8]);
            A_MUSHROOM = new f(g.A, new WorldPoint(lllIIlllIIlI[1], lllIIlllIIlI[2], lllIIlllIIlI[0]), kArray);
            k[] kArray2 = new k[lllIIlllIIlI[5]];
            kArray2[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[11], lllIIlllIIlI[3], lllIIlllIIlI[12]);
            A_PATCH = new f(g.A, new WorldPoint(lllIIlllIIlI[9], lllIIlllIIlI[10], lllIIlllIIlI[0]), kArray2);
            k[] kArray3 = new k[lllIIlllIIlI[15]];
            kArray3[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[16], lllIIlllIIlI[3], lllIIlllIIlI[17]);
            kArray3[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[4], lllIIlllIIlI[3], lllIIlllIIlI[6]);
            kArray3[f.lllIIlllIIlI[3]] = new k(lllIIlllIIlI[18], lllIIlllIIlI[5], lllIIlllIIlI[19]);
            kArray3[f.lllIIlllIIlI[20]] = new k(lllIIlllIIlI[21], lllIIlllIIlI[5], lllIIlllIIlI[22]);
            B_SEAWEED = new f(g.B, new WorldPoint(lllIIlllIIlI[13], lllIIlllIIlI[14], lllIIlllIIlI[0]), kArray3);
            k[] kArray4 = new k[lllIIlllIIlI[5]];
            kArray4[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[25], lllIIlllIIlI[3], lllIIlllIIlI[26]);
            C_MUSHROOM = new f(g.C, new WorldPoint(lllIIlllIIlI[23], lllIIlllIIlI[24], lllIIlllIIlI[0]), kArray4);
            k[] kArray5 = new k[lllIIlllIIlI[3]];
            kArray5[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[28], lllIIlllIIlI[5], lllIIlllIIlI[29]);
            kArray5[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[16], lllIIlllIIlI[5], lllIIlllIIlI[17]);
            C_PATCH = new f(g.C, new WorldPoint(lllIIlllIIlI[27], lllIIlllIIlI[24], lllIIlllIIlI[0]), kArray5);
            k[] kArray6 = new k[lllIIlllIIlI[3]];
            kArray6[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[33], lllIIlllIIlI[5], lllIIlllIIlI[34]);
            kArray6[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[35], lllIIlllIIlI[5], lllIIlllIIlI[36]);
            D_PATCH = new f(g.D, new WorldPoint(lllIIlllIIlI[31], lllIIlllIIlI[32], lllIIlllIIlI[0]), kArray6);
            k[] kArray7 = new k[lllIIlllIIlI[3]];
            kArray7[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[28], lllIIlllIIlI[3], lllIIlllIIlI[29]);
            kArray7[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[21], lllIIlllIIlI[3], lllIIlllIIlI[22]);
            D_SEAWEED = new f(g.D, new WorldPoint(lllIIlllIIlI[38], lllIIlllIIlI[39], lllIIlllIIlI[0]), kArray7);
            k[] kArray8 = new k[lllIIlllIIlI[3]];
            kArray8[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[43], lllIIlllIIlI[5], lllIIlllIIlI[44]);
            kArray8[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[45], lllIIlllIIlI[5], lllIIlllIIlI[46]);
            E_MUSHROOM = new f(g.E, new WorldPoint(lllIIlllIIlI[41], lllIIlllIIlI[42], lllIIlllIIlI[0]), kArray8);
            k[] kArray9 = new k[lllIIlllIIlI[5]];
            kArray9[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[7], lllIIlllIIlI[3], lllIIlllIIlI[8]);
            E_PATCH = new f(g.E, new WorldPoint(lllIIlllIIlI[48], lllIIlllIIlI[49], lllIIlllIIlI[0]), kArray9);
            k[] kArray10 = new k[lllIIlllIIlI[20]];
            kArray10[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[53], lllIIlllIIlI[5], lllIIlllIIlI[54]);
            kArray10[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[55], lllIIlllIIlI[5], lllIIlllIIlI[56]);
            kArray10[f.lllIIlllIIlI[3]] = new k(lllIIlllIIlI[43], lllIIlllIIlI[3], lllIIlllIIlI[44]);
            F_MUSHROOM = new f(g.F, new WorldPoint(lllIIlllIIlI[51], lllIIlllIIlI[52], lllIIlllIIlI[0]), kArray10);
            k[] kArray11 = new k[lllIIlllIIlI[5]];
            kArray11[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[59], lllIIlllIIlI[3], lllIIlllIIlI[60]);
            F_PATCH = new f(g.F, new WorldPoint(lllIIlllIIlI[51], lllIIlllIIlI[58], lllIIlllIIlI[0]), kArray11);
            k[] kArray12 = new k[lllIIlllIIlI[3]];
            kArray12[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[35], lllIIlllIIlI[3], lllIIlllIIlI[36]);
            kArray12[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[64], lllIIlllIIlI[5], lllIIlllIIlI[65]);
            G_MUSHROOM = new f(g.G, new WorldPoint(lllIIlllIIlI[62], lllIIlllIIlI[63], lllIIlllIIlI[0]), kArray12);
            k[] kArray13 = new k[lllIIlllIIlI[5]];
            kArray13[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[55], lllIIlllIIlI[3], lllIIlllIIlI[56]);
            G_PATCH = new f(g.G, new WorldPoint(lllIIlllIIlI[67], lllIIlllIIlI[63], lllIIlllIIlI[0]), kArray13);
            k[] kArray14 = new k[lllIIlllIIlI[3]];
            kArray14[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[71], lllIIlllIIlI[5], lllIIlllIIlI[72]);
            kArray14[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[73], lllIIlllIIlI[5], lllIIlllIIlI[74]);
            H_SEAWEED_EAST = new f(g.H, new WorldPoint(lllIIlllIIlI[69], lllIIlllIIlI[70], lllIIlllIIlI[0]), kArray14);
            k[] kArray15 = new k[lllIIlllIIlI[3]];
            kArray15[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[33], lllIIlllIIlI[3], lllIIlllIIlI[34]);
            kArray15[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[78], lllIIlllIIlI[5], lllIIlllIIlI[79]);
            H_SEAWEED_WEST = new f(g.H, new WorldPoint(lllIIlllIIlI[76], lllIIlllIIlI[77], lllIIlllIIlI[0]), kArray15);
            k[] kArray16 = new k[lllIIlllIIlI[3]];
            kArray16[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[83], lllIIlllIIlI[5], lllIIlllIIlI[84]);
            kArray16[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[85], lllIIlllIIlI[5], lllIIlllIIlI[86]);
            I_MUSHROOM = new f(g.I, new WorldPoint(lllIIlllIIlI[81], lllIIlllIIlI[82], lllIIlllIIlI[0]), kArray16);
            k[] kArray17 = new k[lllIIlllIIlI[3]];
            kArray17[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[53], lllIIlllIIlI[3], lllIIlllIIlI[54]);
            kArray17[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[45], lllIIlllIIlI[3], lllIIlllIIlI[46]);
            I_PATCH = new f(g.I, new WorldPoint(lllIIlllIIlI[81], lllIIlllIIlI[88], lllIIlllIIlI[0]), kArray17);
            k[] kArray18 = new k[lllIIlllIIlI[3]];
            kArray18[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[71], lllIIlllIIlI[3], lllIIlllIIlI[72]);
            kArray18[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[91], lllIIlllIIlI[5], lllIIlllIIlI[92]);
            J_PATCH = new f(g.J, new WorldPoint(lllIIlllIIlI[76], lllIIlllIIlI[90], lllIIlllIIlI[0]), kArray18);
            k[] kArray19 = new k[lllIIlllIIlI[20]];
            kArray19[f.lllIIlllIIlI[0]] = new k(lllIIlllIIlI[83], lllIIlllIIlI[3], lllIIlllIIlI[84]);
            kArray19[f.lllIIlllIIlI[5]] = new k(lllIIlllIIlI[96], lllIIlllIIlI[5], lllIIlllIIlI[97]);
            kArray19[f.lllIIlllIIlI[3]] = new k(lllIIlllIIlI[98], lllIIlllIIlI[5], lllIIlllIIlI[99]);
            K_PATCH = new f(g.K, new WorldPoint(lllIIlllIIlI[94], lllIIlllIIlI[95], lllIIlllIIlI[0]), kArray19);
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
            int lllllllllllllllIIllIIlllIllIIllI = lllIIlllIIlI[0];
            while (f.lIIIlIlIlllIIll(lllllllllllllllIIllIIlllIllIIllI, (int)lllllllllllllllIIllIIlllIllIIlll)) {
                void lllllllllllllllIIllIIlllIllIlIlI;
                void lllllllllllllllIIllIIlllIllIlIll;
                void lllllllllllllllIIllIIlllIllIlIII;
                void lllllllllllllllIIllIIlllIllIIlIl = lllllllllllllllIIllIIlllIllIlIII[lllllllllllllllIIllIIlllIllIIllI];
                lllllllllllllllIIllIIlllIllIlIll.put((Object)lllllllllllllllIIllIIlllIllIIlIl.k(), (Object)lllllllllllllllIIllIIlllIllIIlIl);
                0;
                lllllllllllllllIIllIIlllIllIlIlI.add((Object)lllllllllllllllIIllIIlllIllIIlIl.l());
                0;
                Iterator<k> lllllllllllllllIIllIIlllIllIIlII = lllllllllllllllIIllIIlllIllIIlIl.m().iterator();
                while (f.lIIIlIlIlllIlII(lllllllllllllllIIllIIlllIllIIlII.hasNext() ? 1 : 0)) {
                    void lllllllllllllllIIllIIlllIllIlIIl;
                    k lllllllllllllllIIllIIlllIllIIIll = lllllllllllllllIIllIIlllIllIIlII.next();
                    lllllllllllllllIIllIIlllIllIlIIl.addAll(lllllllllllllllIIllIIlllIllIIIll.L());
                    0;
                    0;
                    if ((0x68 ^ 0x6C) > 0) continue;
                    break block2;
                }
                ++lllllllllllllllIIllIIlllIllIIllI;
                0;
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
        return Enum.valueOf(f.class, string);
    }

    private static String lIIIlIlIllIllll(String lllllllllllllllIIllIIlllIlIlIIll, String lllllllllllllllIIllIIlllIlIlIIlI) {
        lllllllllllllllIIllIIlllIlIlIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlllIlIlIllI = new StringBuilder();
        char[] lllllllllllllllIIllIIlllIlIlIlIl = lllllllllllllllIIllIIlllIlIlIIlI.toCharArray();
        int lllllllllllllllIIllIIlllIlIlIlII = lllIIlllIIlI[0];
        char[] lllllllllllllllIIllIIlllIlIIlllI = lllllllllllllllIIllIIlllIlIlIIll.toCharArray();
        int lllllllllllllllIIllIIlllIlIIllIl = lllllllllllllllIIllIIlllIlIIlllI.length;
        int lllllllllllllllIIllIIlllIlIIllII = lllIIlllIIlI[0];
        while (f.lIIIlIlIlllIIll(lllllllllllllllIIllIIlllIlIIllII, lllllllllllllllIIllIIlllIlIIllIl)) {
            char lllllllllllllllIIllIIlllIlIllIIl = lllllllllllllllIIllIIlllIlIIlllI[lllllllllllllllIIllIIlllIlIIllII];
            lllllllllllllllIIllIIlllIlIlIllI.append((char)(lllllllllllllllIIllIIlllIlIllIIl ^ lllllllllllllllIIllIIlllIlIlIlIl[lllllllllllllllIIllIIlllIlIlIlII % lllllllllllllllIIllIIlllIlIlIlIl.length]));
            0;
            ++lllllllllllllllIIllIIlllIlIlIlII;
            ++lllllllllllllllIIllIIlllIlIIllII;
            0;
            if (((0xF ^ 0x43) & ~(0x8B ^ 0xC7)) != -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIIlllIlIlIllI);
    }

    public List<k> m() {
        return this.trails;
    }

    private static void lIIIlIlIlllIIlI() {
        lllIIlllIIlI = new int[101];
        f.lllIIlllIIlI[0] = (0x1D ^ 0x1A ^ (0xBC ^ 0x80)) & (0xB6 ^ 0xA8 ^ (0xA5 ^ 0x80) ^ -1);
        f.lllIIlllIIlI[1] = -(0xFFFFFB0E & 0x65FB) & (0xFFFFEFDF & 0x7F7F);
        f.lllIIlllIIlI[2] = -(0xFFFFD6A7 & 0x795F) & (0xFFFFFFFF & 0x5F37);
        f.lllIIlllIIlI[3] = 2;
        f.lllIIlllIIlI[4] = -(0xFFFFE5A2 & 0x7B5F) & (0xFFFFFFFF & 0x776F);
        f.lllIIlllIIlI[5] = 1;
        f.lllIIlllIIlI[6] = 0xFFFFFB7F & 0x7ED6;
        f.lllIIlllIIlI[7] = -(0xFFFFCEFD & 0x7193) & (0xFFFFDEFF & 0x77FF);
        f.lllIIlllIIlI[8] = 0xFFFFFF7D & 0x7ADB;
        f.lllIIlllIIlI[9] = -(0xFFFF904F & 0x7FB3) & (0xFFFFDFFF & 0x3E5A);
        f.lllIIlllIIlI[10] = -(0xFFFFFBCF & 0x74B6) & (0xFFFFFFBF & 0x7FF7);
        f.lllIIlllIIlI[11] = -1 & (0xFFFFB7EF & 0x5E7A);
        f.lllIIlllIIlI[12] = 0xFFFFFA4E & 0x7FFB;
        f.lllIIlllIIlI[13] = -(0xFFFF9977 & 0x67CF) & (0xFFFF9FF7 & 0x6FDE);
        f.lllIIlllIIlI[14] = 0xFFFFFF3D & 0xFF7;
        f.lllIIlllIIlI[15] = 128 + 72 - 172 + 147 ^ 24 + 7 - -120 + 20;
        f.lllIIlllIIlI[16] = -(0xFFFFE757 & 0x39BB) & (0xFFFFBFFF & 0x777F);
        f.lllIIlllIIlI[17] = -(8 ^ 0x29) & (0xFFFFFBF7 & 0x7E7B);
        f.lllIIlllIIlI[18] = -(0xFFFFFF8F & 0x975) & (0xFFFFBFED & 0x5F9F);
        f.lllIIlllIIlI[19] = -(0xFFFFEDC6 & 0x163D) & (0xFFFFFFEF & 0x7E7B);
        f.lllIIlllIIlI[20] = 3;
        f.lllIIlllIIlI[21] = -(0xFFFFFDB3 & 0x437E) & (0xFFFFD7FB & 0x7FBF);
        f.lllIIlllIIlI[22] = -(0xFFFFB3B5 & 0x4DCF) & (0xFFFFFBFF & 0x7FEF);
        f.lllIIlllIIlI[23] = 0xFFFFCE73 & 0x3FFD;
        f.lllIIlllIIlI[24] = -(0xFFFFA35F & 0x7CBD) & (0xFFFFBFBF & 0x6F7F);
        f.lllIIlllIIlI[25] = -(0xFFFFEAFB & 0x1D97) & (0xFFFF9EFF & 0x7FFB);
        f.lllIIlllIIlI[26] = -(0x29 ^ 0x10) & (0xFFFFFF7F & 0x7AFF);
        f.lllIIlllIIlI[27] = 0xFFFFBE7B & 0x4FF7;
        f.lllIIlllIIlI[28] = 0xFFFFB6EC & 0x5F7F;
        f.lllIIlllIIlI[29] = -(0xCC ^ 0xC5) & (0xFFFFFF5F & 0x7AF8);
        f.lllIIlllIIlI[30] = 0xC ^ 9;
        f.lllIIlllIIlI[31] = -(0xFFFFF4E5 & 0x6B9B) & (0xFFFFFEFC & 0x6FFF);
        f.lllIIlllIIlI[32] = 0xFFFFBFFE & 0x4F25;
        f.lllIIlllIIlI[33] = -(0xFFFFFBEE & 0x2597) & (0xFFFFFFFF & 0x37F7);
        f.lllIIlllIIlI[34] = -(0xFFFFE596 & 0x1EFB) & (0xFFFFFEF7 & 0x7FFB);
        f.lllIIlllIIlI[35] = 0xFFFFDFAC & 0x36DB;
        f.lllIIlllIIlI[36] = -(0xFFFF85BF & 0x7FDB) & (0xFFFFFFFF & Short.MAX_VALUE);
        f.lllIIlllIIlI[37] = 1 ^ 7;
        f.lllIIlllIIlI[38] = 0xFFFF8EFE & 0x7F7F;
        f.lllIIlllIIlI[39] = -(0xFFFFBA5B & 0x75A7) & (0xFFFFBF37 & 0x7FEF);
        f.lllIIlllIIlI[40] = 0x98 ^ 0x9F;
        f.lllIIlllIIlI[41] = 0xFFFF9FFD & 0x6E56;
        f.lllIIlllIIlI[42] = 0xFFFFBF1B & 0x4FFD;
        f.lllIIlllIIlI[43] = 0xFFFFFEFF & 0x178B;
        f.lllIIlllIIlI[44] = -(0xFFFF97A3 & 0x6DDE) & (0xFFFFFFEF & Short.MAX_VALUE);
        f.lllIIlllIIlI[45] = 0xFFFFBEDC & 0x57AF;
        f.lllIIlllIIlI[46] = 0xFFFFFFFF & 0x7A71;
        f.lllIIlllIIlI[47] = 2 + 160 - 103 + 123 ^ 85 + 45 - -55 + 5;
        f.lllIIlllIIlI[48] = -(0xFFFFF3EF & 0x3D39) & (0xFFFFBF7B & Short.MAX_VALUE);
        f.lllIIlllIIlI[49] = 0xFFFFCF5E & 0x3FB7;
        f.lllIIlllIIlI[50] = (0x32 ^ 0x64) & ~(0xDF ^ 0x89) ^ (0xAF ^ 0xA6);
        f.lllIIlllIIlI[51] = 0xFFFFEE6F & 0x1FF1;
        f.lllIIlllIIlI[52] = 0xFFFFAFB4 & 0x5F5F;
        f.lllIIlllIIlI[53] = -(0xFFFFE9DD & 0x1FA6) & (0xFFFFDFFF & 0x3FF3);
        f.lllIIlllIIlI[54] = -(0xFFFFF136 & 0xFCD) & (0xFFFFFB5F & Short.MAX_VALUE);
        f.lllIIlllIIlI[55] = -(0xFFFFFD9B & 0x2B6F) & (0xFFFFBF7B & Short.MAX_VALUE);
        f.lllIIlllIIlI[56] = 0xFFFFFAFF & 0x7F5F;
        f.lllIIlllIIlI[57] = 118 + 60 - 162 + 123 ^ 3 + 48 - 16 + 94;
        f.lllIIlllIIlI[58] = -(76 + 6 - 18 + 77) & (0xFFFFDF9F & 0x2FFF);
        f.lllIIlllIIlI[59] = -(0xFFFFABFD & 0x5C87) & (0xFFFFDFFF & 0x3EEF);
        f.lllIIlllIIlI[60] = 0xFFFFFB4D & 0x7EFF;
        f.lllIIlllIIlI[61] = 0x68 ^ 0x63;
        f.lllIIlllIIlI[62] = -(0xFFFFDBC1 & 0x343F) & (0xFFFF9FFF & 0x7E6E);
        f.lllIIlllIIlI[63] = 0xFFFFAFFF & 0x5F07;
        f.lllIIlllIIlI[64] = 0xFFFFB78F & 0x5EFF;
        f.lllIIlllIIlI[65] = -(102 + 51 - 26 + 7) & (0xFFFFFAFF & Short.MAX_VALUE);
        f.lllIIlllIIlI[66] = 0x1B ^ 0x17;
        f.lllIIlllIIlI[67] = -(0xFFFFD88D & 0x67FF) & (0xFFFFEEFE & 0x5FFF);
        f.lllIIlllIIlI[68] = 0x2B ^ 0x26;
        f.lllIIlllIIlI[69] = -(0xFFFFE5CD & 0x5B7F) & (0xFFFFCFEF & 0x7FDF);
        f.lllIIlllIIlI[70] = -(190 + 28 - 85 + 108) & (0xFFFFFFFF & 0xFFB);
        f.lllIIlllIIlI[71] = 0xFFFFBF96 & 0x56F9;
        f.lllIIlllIIlI[72] = 0xFFFFFFFD & 0x7A7F;
        f.lllIIlllIIlI[73] = 0xFFFFBED7 & 0x57B9;
        f.lllIIlllIIlI[74] = -(0xFFFF9F7B & 0x64FD) & (0xFFFFFEF8 & Short.MAX_VALUE);
        f.lllIIlllIIlI[75] = 0x14 ^ 0x1A;
        f.lllIIlllIIlI[76] = -(0xFFFFF41D & 0x6BFF) & (0xFFFFFF9F & 0x6EFD);
        f.lllIIlllIIlI[77] = 0xFFFFAFEF & 0x5F1A;
        f.lllIIlllIIlI[78] = 0xFFFFBEFB & 0x5777;
        f.lllIIlllIIlI[79] = 0xFFFFFE97 & 0x7BEB;
        f.lllIIlllIIlI[80] = 60 + 171 - 202 + 159 ^ 147 + 19 - 129 + 142;
        f.lllIIlllIIlI[81] = 0xFFFFFEF3 & 0xF6C;
        f.lllIIlllIIlI[82] = 0xFFFF9EFF & 0x6FFE;
        f.lllIIlllIIlI[83] = -(0xFFFF935B & 0x6DE7) & (0xFFFFFFFF & 0x17CF);
        f.lllIIlllIIlI[84] = -(0xFFFFC5CF & 0x3B3B) & (0xFFFFFF7F & 0x7BFE);
        f.lllIIlllIIlI[85] = 0xFFFFD69E & 0x3FEF;
        f.lllIIlllIIlI[86] = -(0xFFFFEEEB & 0x1595) & (0xFFFFFFF7 & 0x7EFF);
        f.lllIIlllIIlI[87] = 0xAE ^ 0xBE;
        f.lllIIlllIIlI[88] = -(0xFFFFFBF7 & 0x240A) & (0xFFFFEEFF & 0x3FFD);
        f.lllIIlllIIlI[89] = 0x3C ^ 0x2D;
        f.lllIIlllIIlI[90] = -(0xFFFFF4F2 & 0x7BAD) & (0xFFFFFFFF & 0x7F9F);
        f.lllIIlllIIlI[91] = -(0xFFFFE9FB & 0x778E) & (0xFFFFFFFF & 0x77FF);
        f.lllIIlllIIlI[92] = -(0xFFFFAC7A & 0x57E7) & (0xFFFFFEFD & 0x7FEF);
        f.lllIIlllIIlI[93] = 0x69 ^ 0x7B;
        f.lllIIlllIIlI[94] = -(0xFFFFD9B5 & 0x764F) & (0xFFFFDE7F & 0x7FFE);
        f.lllIIlllIIlI[95] = 0xFFFFEFFF & 0x1EE3;
        f.lllIIlllIIlI[96] = 0xFFFF9EFC & 0x7777;
        f.lllIIlllIIlI[97] = 0xFFFFFFEF & 0x7A96;
        f.lllIIlllIIlI[98] = -(35 + 5 - -34 + 63) & (0xFFFFFFFD & 0x16FF);
        f.lllIIlllIIlI[99] = 0xFFFFFEA9 & 0x7BDF;
        f.lllIIlllIIlI[100] = 0xB6 ^ 0xA5;
    }

    public WorldPoint l() {
        return this.location;
    }

    private static String lIIIlIlIllIlllI(String lllllllllllllllIIllIIlllIlIIIIIl, String lllllllllllllllIIllIIlllIlIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlllIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllIlIIIIII.getBytes(StandardCharsets.UTF_8)), lllIIlllIIlI[47]), "DES");
            Cipher lllllllllllllllIIllIIlllIlIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlllIlIIIlIl.init(lllIIlllIIlI[3], lllllllllllllllIIllIIlllIlIIIllI);
            return new String(lllllllllllllllIIllIIlllIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIlllIlIIIlII) {
            lllllllllllllllIIllIIlllIlIIIlII.printStackTrace();
            return null;
        }
    }
}

