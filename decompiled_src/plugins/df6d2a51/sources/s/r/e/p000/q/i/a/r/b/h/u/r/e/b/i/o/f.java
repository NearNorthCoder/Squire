package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.f  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/f.class */
public final class f {
    public static final /* synthetic */ f I_PATCH;
    public static final /* synthetic */ f G_MUSHROOM;
    private static /* synthetic */ String[] lllIIlllIIIl;
    private final /* synthetic */ WorldPoint location;
    public static final /* synthetic */ f C_MUSHROOM;
    public static final /* synthetic */ f D_SEAWEED;
    public static final /* synthetic */ f F_PATCH;
    public static final /* synthetic */ f E_MUSHROOM;
    private static final /* synthetic */ ImmutableMultimap<g, f> GROUPS;
    public static final /* synthetic */ f G_PATCH;
    public static final /* synthetic */ f K_PATCH;
    public static final /* synthetic */ f A_MUSHROOM;
    public static final /* synthetic */ f E_PATCH;
    public static final /* synthetic */ f B_SEAWEED;
    public static final /* synthetic */ f J_PATCH;
    public static final /* synthetic */ f H_SEAWEED_EAST;
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ f I_MUSHROOM;
    public static final /* synthetic */ f D_PATCH;
    private final /* synthetic */ List<k> trails;
    public static final /* synthetic */ f H_SEAWEED_WEST;
    public static final /* synthetic */ f C_PATCH;
    private static final /* synthetic */ Set<WorldPoint> SPOTS;
    public static final /* synthetic */ f F_MUSHROOM;
    private static final /* synthetic */ Set<Integer> TRAILS;
    public static final /* synthetic */ f A_PATCH;
    private static /* synthetic */ int[] lllIIlllIIlI;
    private final /* synthetic */ g group;

    private static String lIIIlIlIlllIIII(String lllllllllllllllIIllIIlllIIllIllI, String lllllllllllllllIIllIIlllIIllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlllIIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlllIIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlllIIlllIII.init(lllIIlllIIlI[3], lllllllllllllllIIllIIlllIIlllIIl);
            return new String(lllllllllllllllIIllIIlllIIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlllIIllIlll) {
            lllllllllllllllIIllIIlllIIllIlll.printStackTrace();
            return null;
        }
    }

    private f(String str, int i, g gVar, WorldPoint worldPoint, k... kVarArr) {
        this.group = gVar;
        this.location = worldPoint;
        this.trails = ImmutableList.copyOf(kVarArr);
    }

    private static void lIIIlIlIlllIIIl() {
        lllIIlllIIIl = new String[lllIIlllIIlI[100]];
        lllIIlllIIIl[lllIIlllIIlI[0]] = lIIIlIlIllIlllI("I+gRVoVZTi+8jefxcKdtdw==", "nUFeF");
        lllIIlllIIIl[lllIIlllIIlI[5]] = lIIIlIlIllIlllI("6aZUhugZW9w=", "VJvDD");
        lllIIlllIIIl[lllIIlllIIlI[3]] = lIIIlIlIllIlllI("XWJgSgTOkFCRKLBzPuct9A==", "PnoIS");
        lllIIlllIIIl[lllIIlllIIlI[20]] = lIIIlIlIllIllll("EAs1ARsbBjcbBQ==", "STxTH");
        lllIIlllIIIl[lllIIlllIIlI[15]] = lIIIlIlIllIllll("OQYgGzk5EQ==", "zYpZm");
        lllIIlllIIIl[lllIIlllIIlI[30]] = lIIIlIlIlllIIII("OjetgdD3OsI=", "kwRyx");
        lllIIlllIIIl[lllIIlllIIlI[37]] = lIIIlIlIllIlllI("X6SluXuJv25kjOGXfJUBBQ==", "RFAEo");
        lllIIlllIIIl[lllIIlllIIlI[40]] = lIIIlIlIllIlllI("Qy9Nm6xSSc8n+LoXIq02Zg==", "XtzwZ");
        lllIIlllIIIl[lllIIlllIIlI[47]] = lIIIlIlIllIlllI("KE0TNGQDf24=", "aWEhf");
        lllIIlllIIIl[lllIIlllIIlI[50]] = lIIIlIlIllIlllI("vEvA6cO13FZR3jzMzfLjTQ==", "dxPMm");
        lllIIlllIIIl[lllIIlllIIlI[57]] = lIIIlIlIlllIIII("ybi07wWlTys=", "XqMfs");
        lllIIlllIIIl[lllIIlllIIlI[61]] = lIIIlIlIlllIIII("SjXxAKhFN1WMS8YZahc4oA==", "osNLB");
        lllIIlllIIIl[lllIIlllIIlI[66]] = lIIIlIlIllIllll("PwobJxc7HQ==", "xUKfC");
        lllIIlllIIIl[lllIIlllIIlI[68]] = lIIIlIlIllIllll("IjsnLiY9ITEvOC8lJz8=", "jdtkg");
        lllIIlllIIIl[lllIIlllIIlI[75]] = lIIIlIlIlllIIII("CdnH6Kxtzj4/TteMhP7byQ==", "kFbBP");
        lllIIlllIIIl[lllIIlllIIlI[80]] = lIIIlIlIlllIIII("DVJrVcWUi70dCpE3I7UDlg==", "xqaIu");
        lllIIlllIIIl[lllIIlllIIlI[87]] = lIIIlIlIllIlllI("lwJ9kadPBek=", "MfpMj");
        lllIIlllIIIl[lllIIlllIIlI[89]] = lIIIlIlIllIllll("Egk2LCYbHg==", "XVfmr");
        lllIIlllIIIl[lllIIlllIIlI[93]] = lIIIlIlIllIlllI("5K3owGN5gs8=", "nKOdC");
    }

    private static boolean lIIIlIlIlllIlII(int i) {
        return i != 0;
    }

    static {
        lIIIlIlIlllIIlI();
        lIIIlIlIlllIIIl();
        String str = lllIIlllIIIl[lllIIlllIIlI[0]];
        int i = lllIIlllIIlI[0];
        g gVar = g.A;
        WorldPoint worldPoint = new WorldPoint(lllIIlllIIlI[1], lllIIlllIIlI[2], lllIIlllIIlI[0]);
        k[] kVarArr = new k[lllIIlllIIlI[3]];
        kVarArr[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[4], lllIIlllIIlI[5], lllIIlllIIlI[6]);
        kVarArr[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[7], lllIIlllIIlI[5], lllIIlllIIlI[8]);
        A_MUSHROOM = new f(str, i, gVar, worldPoint, kVarArr);
        String str2 = lllIIlllIIIl[lllIIlllIIlI[5]];
        int i2 = lllIIlllIIlI[5];
        g gVar2 = g.A;
        WorldPoint worldPoint2 = new WorldPoint(lllIIlllIIlI[9], lllIIlllIIlI[10], lllIIlllIIlI[0]);
        k[] kVarArr2 = new k[lllIIlllIIlI[5]];
        kVarArr2[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[11], lllIIlllIIlI[3], lllIIlllIIlI[12]);
        A_PATCH = new f(str2, i2, gVar2, worldPoint2, kVarArr2);
        String str3 = lllIIlllIIIl[lllIIlllIIlI[3]];
        int i3 = lllIIlllIIlI[3];
        g gVar3 = g.B;
        WorldPoint worldPoint3 = new WorldPoint(lllIIlllIIlI[13], lllIIlllIIlI[14], lllIIlllIIlI[0]);
        k[] kVarArr3 = new k[lllIIlllIIlI[15]];
        kVarArr3[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[16], lllIIlllIIlI[3], lllIIlllIIlI[17]);
        kVarArr3[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[4], lllIIlllIIlI[3], lllIIlllIIlI[6]);
        kVarArr3[lllIIlllIIlI[3]] = new k(lllIIlllIIlI[18], lllIIlllIIlI[5], lllIIlllIIlI[19]);
        kVarArr3[lllIIlllIIlI[20]] = new k(lllIIlllIIlI[21], lllIIlllIIlI[5], lllIIlllIIlI[22]);
        B_SEAWEED = new f(str3, i3, gVar3, worldPoint3, kVarArr3);
        String str4 = lllIIlllIIIl[lllIIlllIIlI[20]];
        int i4 = lllIIlllIIlI[20];
        g gVar4 = g.C;
        WorldPoint worldPoint4 = new WorldPoint(lllIIlllIIlI[23], lllIIlllIIlI[24], lllIIlllIIlI[0]);
        k[] kVarArr4 = new k[lllIIlllIIlI[5]];
        kVarArr4[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[25], lllIIlllIIlI[3], lllIIlllIIlI[26]);
        C_MUSHROOM = new f(str4, i4, gVar4, worldPoint4, kVarArr4);
        String str5 = lllIIlllIIIl[lllIIlllIIlI[15]];
        int i5 = lllIIlllIIlI[15];
        g gVar5 = g.C;
        WorldPoint worldPoint5 = new WorldPoint(lllIIlllIIlI[27], lllIIlllIIlI[24], lllIIlllIIlI[0]);
        k[] kVarArr5 = new k[lllIIlllIIlI[3]];
        kVarArr5[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[28], lllIIlllIIlI[5], lllIIlllIIlI[29]);
        kVarArr5[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[16], lllIIlllIIlI[5], lllIIlllIIlI[17]);
        C_PATCH = new f(str5, i5, gVar5, worldPoint5, kVarArr5);
        String str6 = lllIIlllIIIl[lllIIlllIIlI[30]];
        int i6 = lllIIlllIIlI[30];
        g gVar6 = g.D;
        WorldPoint worldPoint6 = new WorldPoint(lllIIlllIIlI[31], lllIIlllIIlI[32], lllIIlllIIlI[0]);
        k[] kVarArr6 = new k[lllIIlllIIlI[3]];
        kVarArr6[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[33], lllIIlllIIlI[5], lllIIlllIIlI[34]);
        kVarArr6[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[35], lllIIlllIIlI[5], lllIIlllIIlI[36]);
        D_PATCH = new f(str6, i6, gVar6, worldPoint6, kVarArr6);
        String str7 = lllIIlllIIIl[lllIIlllIIlI[37]];
        int i7 = lllIIlllIIlI[37];
        g gVar7 = g.D;
        WorldPoint worldPoint7 = new WorldPoint(lllIIlllIIlI[38], lllIIlllIIlI[39], lllIIlllIIlI[0]);
        k[] kVarArr7 = new k[lllIIlllIIlI[3]];
        kVarArr7[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[28], lllIIlllIIlI[3], lllIIlllIIlI[29]);
        kVarArr7[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[21], lllIIlllIIlI[3], lllIIlllIIlI[22]);
        D_SEAWEED = new f(str7, i7, gVar7, worldPoint7, kVarArr7);
        String str8 = lllIIlllIIIl[lllIIlllIIlI[40]];
        int i8 = lllIIlllIIlI[40];
        g gVar8 = g.E;
        WorldPoint worldPoint8 = new WorldPoint(lllIIlllIIlI[41], lllIIlllIIlI[42], lllIIlllIIlI[0]);
        k[] kVarArr8 = new k[lllIIlllIIlI[3]];
        kVarArr8[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[43], lllIIlllIIlI[5], lllIIlllIIlI[44]);
        kVarArr8[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[45], lllIIlllIIlI[5], lllIIlllIIlI[46]);
        E_MUSHROOM = new f(str8, i8, gVar8, worldPoint8, kVarArr8);
        String str9 = lllIIlllIIIl[lllIIlllIIlI[47]];
        int i9 = lllIIlllIIlI[47];
        g gVar9 = g.E;
        WorldPoint worldPoint9 = new WorldPoint(lllIIlllIIlI[48], lllIIlllIIlI[49], lllIIlllIIlI[0]);
        k[] kVarArr9 = new k[lllIIlllIIlI[5]];
        kVarArr9[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[7], lllIIlllIIlI[3], lllIIlllIIlI[8]);
        E_PATCH = new f(str9, i9, gVar9, worldPoint9, kVarArr9);
        String str10 = lllIIlllIIIl[lllIIlllIIlI[50]];
        int i10 = lllIIlllIIlI[50];
        g gVar10 = g.F;
        WorldPoint worldPoint10 = new WorldPoint(lllIIlllIIlI[51], lllIIlllIIlI[52], lllIIlllIIlI[0]);
        k[] kVarArr10 = new k[lllIIlllIIlI[20]];
        kVarArr10[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[53], lllIIlllIIlI[5], lllIIlllIIlI[54]);
        kVarArr10[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[55], lllIIlllIIlI[5], lllIIlllIIlI[56]);
        kVarArr10[lllIIlllIIlI[3]] = new k(lllIIlllIIlI[43], lllIIlllIIlI[3], lllIIlllIIlI[44]);
        F_MUSHROOM = new f(str10, i10, gVar10, worldPoint10, kVarArr10);
        String str11 = lllIIlllIIIl[lllIIlllIIlI[57]];
        int i11 = lllIIlllIIlI[57];
        g gVar11 = g.F;
        WorldPoint worldPoint11 = new WorldPoint(lllIIlllIIlI[51], lllIIlllIIlI[58], lllIIlllIIlI[0]);
        k[] kVarArr11 = new k[lllIIlllIIlI[5]];
        kVarArr11[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[59], lllIIlllIIlI[3], lllIIlllIIlI[60]);
        F_PATCH = new f(str11, i11, gVar11, worldPoint11, kVarArr11);
        String str12 = lllIIlllIIIl[lllIIlllIIlI[61]];
        int i12 = lllIIlllIIlI[61];
        g gVar12 = g.G;
        WorldPoint worldPoint12 = new WorldPoint(lllIIlllIIlI[62], lllIIlllIIlI[63], lllIIlllIIlI[0]);
        k[] kVarArr12 = new k[lllIIlllIIlI[3]];
        kVarArr12[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[35], lllIIlllIIlI[3], lllIIlllIIlI[36]);
        kVarArr12[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[64], lllIIlllIIlI[5], lllIIlllIIlI[65]);
        G_MUSHROOM = new f(str12, i12, gVar12, worldPoint12, kVarArr12);
        String str13 = lllIIlllIIIl[lllIIlllIIlI[66]];
        int i13 = lllIIlllIIlI[66];
        g gVar13 = g.G;
        WorldPoint worldPoint13 = new WorldPoint(lllIIlllIIlI[67], lllIIlllIIlI[63], lllIIlllIIlI[0]);
        k[] kVarArr13 = new k[lllIIlllIIlI[5]];
        kVarArr13[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[55], lllIIlllIIlI[3], lllIIlllIIlI[56]);
        G_PATCH = new f(str13, i13, gVar13, worldPoint13, kVarArr13);
        String str14 = lllIIlllIIIl[lllIIlllIIlI[68]];
        int i14 = lllIIlllIIlI[68];
        g gVar14 = g.H;
        WorldPoint worldPoint14 = new WorldPoint(lllIIlllIIlI[69], lllIIlllIIlI[70], lllIIlllIIlI[0]);
        k[] kVarArr14 = new k[lllIIlllIIlI[3]];
        kVarArr14[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[71], lllIIlllIIlI[5], lllIIlllIIlI[72]);
        kVarArr14[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[73], lllIIlllIIlI[5], lllIIlllIIlI[74]);
        H_SEAWEED_EAST = new f(str14, i14, gVar14, worldPoint14, kVarArr14);
        String str15 = lllIIlllIIIl[lllIIlllIIlI[75]];
        int i15 = lllIIlllIIlI[75];
        g gVar15 = g.H;
        WorldPoint worldPoint15 = new WorldPoint(lllIIlllIIlI[76], lllIIlllIIlI[77], lllIIlllIIlI[0]);
        k[] kVarArr15 = new k[lllIIlllIIlI[3]];
        kVarArr15[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[33], lllIIlllIIlI[3], lllIIlllIIlI[34]);
        kVarArr15[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[78], lllIIlllIIlI[5], lllIIlllIIlI[79]);
        H_SEAWEED_WEST = new f(str15, i15, gVar15, worldPoint15, kVarArr15);
        String str16 = lllIIlllIIIl[lllIIlllIIlI[80]];
        int i16 = lllIIlllIIlI[80];
        g gVar16 = g.I;
        WorldPoint worldPoint16 = new WorldPoint(lllIIlllIIlI[81], lllIIlllIIlI[82], lllIIlllIIlI[0]);
        k[] kVarArr16 = new k[lllIIlllIIlI[3]];
        kVarArr16[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[83], lllIIlllIIlI[5], lllIIlllIIlI[84]);
        kVarArr16[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[85], lllIIlllIIlI[5], lllIIlllIIlI[86]);
        I_MUSHROOM = new f(str16, i16, gVar16, worldPoint16, kVarArr16);
        String str17 = lllIIlllIIIl[lllIIlllIIlI[87]];
        int i17 = lllIIlllIIlI[87];
        g gVar17 = g.I;
        WorldPoint worldPoint17 = new WorldPoint(lllIIlllIIlI[81], lllIIlllIIlI[88], lllIIlllIIlI[0]);
        k[] kVarArr17 = new k[lllIIlllIIlI[3]];
        kVarArr17[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[53], lllIIlllIIlI[3], lllIIlllIIlI[54]);
        kVarArr17[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[45], lllIIlllIIlI[3], lllIIlllIIlI[46]);
        I_PATCH = new f(str17, i17, gVar17, worldPoint17, kVarArr17);
        String str18 = lllIIlllIIIl[lllIIlllIIlI[89]];
        int i18 = lllIIlllIIlI[89];
        g gVar18 = g.J;
        WorldPoint worldPoint18 = new WorldPoint(lllIIlllIIlI[76], lllIIlllIIlI[90], lllIIlllIIlI[0]);
        k[] kVarArr18 = new k[lllIIlllIIlI[3]];
        kVarArr18[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[71], lllIIlllIIlI[3], lllIIlllIIlI[72]);
        kVarArr18[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[91], lllIIlllIIlI[5], lllIIlllIIlI[92]);
        J_PATCH = new f(str18, i18, gVar18, worldPoint18, kVarArr18);
        String str19 = lllIIlllIIIl[lllIIlllIIlI[93]];
        int i19 = lllIIlllIIlI[93];
        g gVar19 = g.K;
        WorldPoint worldPoint19 = new WorldPoint(lllIIlllIIlI[94], lllIIlllIIlI[95], lllIIlllIIlI[0]);
        k[] kVarArr19 = new k[lllIIlllIIlI[20]];
        kVarArr19[lllIIlllIIlI[0]] = new k(lllIIlllIIlI[83], lllIIlllIIlI[3], lllIIlllIIlI[84]);
        kVarArr19[lllIIlllIIlI[5]] = new k(lllIIlllIIlI[96], lllIIlllIIlI[5], lllIIlllIIlI[97]);
        kVarArr19[lllIIlllIIlI[3]] = new k(lllIIlllIIlI[98], lllIIlllIIlI[5], lllIIlllIIlI[99]);
        K_PATCH = new f(str19, i19, gVar19, worldPoint19, kVarArr19);
        f[] fVarArr = new f[lllIIlllIIlI[100]];
        fVarArr[lllIIlllIIlI[0]] = A_MUSHROOM;
        fVarArr[lllIIlllIIlI[5]] = A_PATCH;
        fVarArr[lllIIlllIIlI[3]] = B_SEAWEED;
        fVarArr[lllIIlllIIlI[20]] = C_MUSHROOM;
        fVarArr[lllIIlllIIlI[15]] = C_PATCH;
        fVarArr[lllIIlllIIlI[30]] = D_PATCH;
        fVarArr[lllIIlllIIlI[37]] = D_SEAWEED;
        fVarArr[lllIIlllIIlI[40]] = E_MUSHROOM;
        fVarArr[lllIIlllIIlI[47]] = E_PATCH;
        fVarArr[lllIIlllIIlI[50]] = F_MUSHROOM;
        fVarArr[lllIIlllIIlI[57]] = F_PATCH;
        fVarArr[lllIIlllIIlI[61]] = G_MUSHROOM;
        fVarArr[lllIIlllIIlI[66]] = G_PATCH;
        fVarArr[lllIIlllIIlI[68]] = H_SEAWEED_EAST;
        fVarArr[lllIIlllIIlI[75]] = H_SEAWEED_WEST;
        fVarArr[lllIIlllIIlI[80]] = I_MUSHROOM;
        fVarArr[lllIIlllIIlI[87]] = I_PATCH;
        fVarArr[lllIIlllIIlI[89]] = J_PATCH;
        fVarArr[lllIIlllIIlI[93]] = K_PATCH;
        $VALUES = fVarArr;
        ImmutableMultimap.Builder builder = new ImmutableMultimap.Builder();
        ImmutableSet.Builder builder2 = new ImmutableSet.Builder();
        ImmutableSet.Builder builder3 = new ImmutableSet.Builder();
        f[] values = values();
        int length = values.length;
        int i20 = lllIIlllIIlI[0];
        while (lIIIlIlIlllIIll(i20, length)) {
            f fVar = values[i20];
            builder.put(fVar.k(), fVar);
            "".length();
            builder2.add(fVar.l());
            "".length();
            for (k kVar : fVar.m()) {
                builder3.addAll(kVar.L());
                "".length();
                "".length();
                if ((104 ^ 108) <= 0) {
                    return;
                }
            }
            i20++;
            "".length();
            if ((-" ".length()) > (111 ^ 107)) {
                return;
            }
        }
        GROUPS = builder.build();
        SPOTS = builder2.build();
        TRAILS = builder3.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(WorldPoint worldPoint) {
        return SPOTS.contains(worldPoint);
    }

    public g k() {
        return this.group;
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    static List<WorldPoint> a(g gVar) {
        return (List) GROUPS.get(gVar).stream().map((v0) -> {
            return v0.l();
        }).collect(Collectors.toList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(int i) {
        return TRAILS.contains(Integer.valueOf(i));
    }

    private static boolean lIIIlIlIlllIIll(int i, int i2) {
        return i < i2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    private static String lIIIlIlIllIllll(String lllllllllllllllIIllIIlllIlIllIII, String lllllllllllllllIIllIIlllIlIlIlll) {
        String lllllllllllllllIIllIIlllIlIllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIIlllIlIlIlIl = lllllllllllllllIIllIIlllIlIlIlll.toCharArray();
        int lllllllllllllllIIllIIlllIlIlIlII = lllIIlllIIlI[0];
        char[] charArray = lllllllllllllllIIllIIlllIlIllIII2.toCharArray();
        int length = charArray.length;
        int i = lllIIlllIIlI[0];
        while (lIIIlIlIlllIIll(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIllIIlllIlIlIlIl[lllllllllllllllIIllIIlllIlIlIlII % lllllllllllllllIIllIIlllIlIlIlIl.length]));
            "".length();
            lllllllllllllllIIllIIlllIlIlIlII++;
            i++;
            "".length();
            if (((15 ^ 67) & ((139 ^ 199) ^ (-1))) == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public List<k> m() {
        return this.trails;
    }

    private static void lIIIlIlIlllIIlI() {
        lllIIlllIIlI = new int[101];
        lllIIlllIIlI[0] = ((29 ^ 26) ^ (188 ^ 128)) & (((182 ^ 168) ^ (165 ^ 128)) ^ (-" ".length()));
        lllIIlllIIlI[1] = (-((-1266) & 26107)) & (-4129) & 32639;
        lllIIlllIIlI[2] = (-((-10585) & 31071)) & (-1) & 24375;
        lllIIlllIIlI[3] = "  ".length();
        lllIIlllIIlI[4] = (-((-6750) & 31583)) & (-1) & 30575;
        lllIIlllIIlI[5] = " ".length();
        lllIIlllIIlI[6] = (-1153) & 32470;
        lllIIlllIIlI[7] = (-((-12547) & 29075)) & (-8449) & 30719;
        lllIIlllIIlI[8] = (-131) & 31451;
        lllIIlllIIlI[9] = (-((-28593) & 32691)) & (-8193) & 15962;
        lllIIlllIIlI[10] = (-((-1073) & 29878)) & (-65) & 32759;
        lllIIlllIIlI[11] = (-" ".length()) & (-18449) & 24186;
        lllIIlllIIlI[12] = (-1458) & 32763;
        lllIIlllIIlI[13] = (-((-26249) & 26575)) & (-24585) & 28638;
        lllIIlllIIlI[14] = (-195) & 4087;
        lllIIlllIIlI[15] = (((128 + 72) - 172) + 147) ^ (((24 + 7) - (-120)) + 20);
        lllIIlllIIlI[16] = (-((-6313) & 14779)) & (-16385) & 30591;
        lllIIlllIIlI[17] = (-(8 ^ 41)) & (-1033) & 32379;
        lllIIlllIIlI[18] = (-((-113) & 2421)) & (-16403) & 24479;
        lllIIlllIIlI[19] = (-((-4666) & 5693)) & (-17) & 32379;
        lllIIlllIIlI[20] = "   ".length();
        lllIIlllIIlI[21] = (-((-589) & 17278)) & (-10245) & 32703;
        lllIIlllIIlI[22] = (-((-19531) & 19919)) & (-1025) & 32751;
        lllIIlllIIlI[23] = (-12685) & 16381;
        lllIIlllIIlI[24] = (-((-23713) & 31933)) & (-16449) & 28543;
        lllIIlllIIlI[25] = (-((-5381) & 7575)) & (-24833) & 32763;
        lllIIlllIIlI[26] = (-(41 ^ 16)) & (-129) & 31487;
        lllIIlllIIlI[27] = (-16773) & 20471;
        lllIIlllIIlI[28] = (-18708) & 24447;
        lllIIlllIIlI[29] = (-(204 ^ 197)) & (-161) & 31480;
        lllIIlllIIlI[30] = 12 ^ 9;
        lllIIlllIIlI[31] = (-((-2843) & 27547)) & (-260) & 28671;
        lllIIlllIIlI[32] = (-16386) & 20261;
        lllIIlllIIlI[33] = (-((-1042) & 9623)) & (-1) & 14327;
        lllIIlllIIlI[34] = (-((-6762) & 7931)) & (-265) & 32763;
        lllIIlllIIlI[35] = (-8276) & 14043;
        lllIIlllIIlI[36] = (-((-31297) & 32731)) & (-1) & 32767;
        lllIIlllIIlI[37] = 1 ^ 7;
        lllIIlllIIlI[38] = (-28930) & 32639;
        lllIIlllIIlI[39] = (-((-17829) & 30119)) & (-16585) & 32751;
        lllIIlllIIlI[40] = 152 ^ 159;
        lllIIlllIIlI[41] = (-24579) & 28246;
        lllIIlllIIlI[42] = (-16613) & 20477;
        lllIIlllIIlI[43] = (-257) & 6027;
        lllIIlllIIlI[44] = (-((-26717) & 28126)) & (-17) & 32767;
        lllIIlllIIlI[45] = (-16676) & 22447;
        lllIIlllIIlI[46] = (-1) & 31345;
        lllIIlllIIlI[47] = (((2 + 160) - 103) + 123) ^ (((85 + 45) - (-55)) + 5);
        lllIIlllIIlI[48] = (-((-3089) & 15673)) & (-16517) & 32767;
        lllIIlllIIlI[49] = (-12450) & 16311;
        lllIIlllIIlI[50] = ((50 ^ 100) & ((223 ^ 137) ^ (-1))) ^ (175 ^ 166);
        lllIIlllIIlI[51] = (-4497) & 8177;
        lllIIlllIIlI[52] = (-20556) & 24415;
        lllIIlllIIlI[53] = (-((-5667) & 8102)) & (-8193) & 16371;
        lllIIlllIIlI[54] = (-((-3786) & 4045)) & (-1185) & 32767;
        lllIIlllIIlI[55] = (-((-613) & 11119)) & (-16517) & 32767;
        lllIIlllIIlI[56] = (-1281) & 32607;
        lllIIlllIIlI[57] = (((118 + 60) - 162) + 123) ^ (((3 + 48) - 16) + 94);
        lllIIlllIIlI[58] = (-(((76 + 6) - 18) + 77)) & (-8289) & 12287;
        lllIIlllIIlI[59] = (-((-21507) & 23687)) & (-8193) & 16111;
        lllIIlllIIlI[60] = (-1203) & 32511;
        lllIIlllIIlI[61] = 104 ^ 99;
        lllIIlllIIlI[62] = (-((-9279) & 13375)) & (-24577) & 32366;
        lllIIlllIIlI[63] = (-20481) & 24327;
        lllIIlllIIlI[64] = (-18545) & 24319;
        lllIIlllIIlI[65] = (-(((102 + 51) - 26) + 7)) & (-1281) & 32767;
        lllIIlllIIlI[66] = 27 ^ 23;
        lllIIlllIIlI[67] = (-((-10099) & 26623)) & (-4354) & 24575;
        lllIIlllIIlI[68] = 43 ^ 38;
        lllIIlllIIlI[69] = (-((-6707) & 23423)) & (-12305) & 32735;
        lllIIlllIIlI[70] = (-(((190 + 28) - 85) + 108)) & (-1) & 4091;
        lllIIlllIIlI[71] = (-16490) & 22265;
        lllIIlllIIlI[72] = (-3) & 31359;
        lllIIlllIIlI[73] = (-16681) & 22457;
        lllIIlllIIlI[74] = (-((-24709) & 25853)) & (-264) & 32767;
        lllIIlllIIlI[75] = 20 ^ 26;
        lllIIlllIIlI[76] = (-((-3043) & 27647)) & (-97) & 28413;
        lllIIlllIIlI[77] = (-20497) & 24346;
        lllIIlllIIlI[78] = (-16645) & 22391;
        lllIIlllIIlI[79] = (-361) & 31723;
        lllIIlllIIlI[80] = (((60 + 171) - 202) + 159) ^ (((147 + 19) - 129) + 142);
        lllIIlllIIlI[81] = (-269) & 3948;
        lllIIlllIIlI[82] = (-24833) & 28670;
        lllIIlllIIlI[83] = (-((-27813) & 28135)) & (-1) & 6095;
        lllIIlllIIlI[84] = (-((-14897) & 15163)) & (-129) & 31742;
        lllIIlllIIlI[85] = (-10594) & 16367;
        lllIIlllIIlI[86] = (-((-4373) & 5525)) & (-9) & 32511;
        lllIIlllIIlI[87] = 174 ^ 190;
        lllIIlllIIlI[88] = (-((-1033) & 9226)) & (-4353) & 16381;
        lllIIlllIIlI[89] = 60 ^ 45;
        lllIIlllIIlI[90] = (-((-2830) & 31661)) & (-1) & 32671;
        lllIIlllIIlI[91] = (-((-5637) & 30606)) & (-1) & 30719;
        lllIIlllIIlI[92] = (-((-21382) & 22503)) & (-259) & 32751;
        lllIIlllIIlI[93] = 105 ^ 123;
        lllIIlllIIlI[94] = (-((-9803) & 30287)) & (-8577) & 32766;
        lllIIlllIIlI[95] = (-4097) & 7907;
        lllIIlllIIlI[96] = (-24836) & 30583;
        lllIIlllIIlI[97] = (-17) & 31382;
        lllIIlllIIlI[98] = (-(((35 + 5) - (-34)) + 63)) & (-3) & 5887;
        lllIIlllIIlI[99] = (-343) & 31711;
        lllIIlllIIlI[100] = 182 ^ 165;
    }

    public WorldPoint l() {
        return this.location;
    }

    private static String lIIIlIlIllIlllI(String lllllllllllllllIIllIIlllIlIIIIll, String lllllllllllllllIIllIIlllIlIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIlllIIlI[47]), "DES");
            Cipher lllllllllllllllIIllIIlllIlIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlllIlIIIlIl.init(lllIIlllIIlI[3], secretKeySpec);
            return new String(lllllllllllllllIIllIIlllIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlllIlIIIlII) {
            lllllllllllllllIIllIIlllIlIIIlII.printStackTrace();
            return null;
        }
    }
}
