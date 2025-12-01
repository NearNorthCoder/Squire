package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Triple;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.A  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/A.class */
public final class A {
    public static final /* synthetic */ A EAST_I_I;
    public static final /* synthetic */ A EAST_II_X;
    public static final /* synthetic */ A NORTH_II_VIII;
    public static final /* synthetic */ A EAST_III_VII;
    public static final /* synthetic */ A WEST_I_I;
    public static final /* synthetic */ A NORTH_I_II;
    public static final /* synthetic */ A EAST_I_IV;
    public static final /* synthetic */ A MIDDLE_V_VII;
    public static final /* synthetic */ A NORTH_II_IX;
    public /* synthetic */ Supplier<TileObject> object;
    public static final /* synthetic */ A MIDDLE_V_X;
    public static final /* synthetic */ A TOP_V_I;
    public static final /* synthetic */ A SOUTH_IV_II;
    public static final /* synthetic */ A SOUTH_I_III;
    public static final /* synthetic */ A EAST_II_IX;
    public static final /* synthetic */ A MIDDLE_V_IX;
    public static final /* synthetic */ A EAST_II_III;
    public static final /* synthetic */ A EAST_II_XI;
    public static final /* synthetic */ A SOUTH_I_II_EXTEND;
    public static final /* synthetic */ A NORTH_IV_VII;
    public static final /* synthetic */ A WEST_II_V;
    public static final /* synthetic */ A EAST_I_II;
    public static final /* synthetic */ A SOUTH_IV_I;
    public static final /* synthetic */ A WEST_III_II;
    private static final /* synthetic */ A[] $VALUES;
    public static final /* synthetic */ A MIDDLE_V_III;
    public static final /* synthetic */ A EAST_I_V;
    public static final /* synthetic */ A WEST_I_II;
    /* synthetic */ C type;
    public static final /* synthetic */ A EAST_II_VIII;
    public static final /* synthetic */ A NORTH_IV_VIII;
    public static final /* synthetic */ A MIDDLE_V_VI;
    public static final /* synthetic */ A NORTH_II_X;
    public static final /* synthetic */ A EAST_II_II;
    public static final /* synthetic */ A NORTH_I_III;
    public static final /* synthetic */ A EAST_II_I;
    public static final /* synthetic */ A WEST_II_IV;
    private static /* synthetic */ int[] lllIIIIIIllI;
    private static /* synthetic */ String[] lllIIIIIIlIl;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ A SOUTH_I_II;
    public static final /* synthetic */ A EAST_III_VI;
    public static final /* synthetic */ A TOP_V_III;
    public static final /* synthetic */ A NORTH_I_IV;
    /* synthetic */ Supplier<WorldPoint> destination;
    public static final /* synthetic */ A TOP_V_II;
    /* synthetic */ Supplier<WorldPoint> startPoint;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean a(C0003d c0003d, SquireSepulchre squireSepulchre) {
        Player local = Players.getLocal();
        if (!lIIIlIIIIlIlllI(local) && !lIIIlIIIIlIllll(a((Locatable) local) ? 1 : 0)) {
            a(squireSepulchre);
            if (!lIIIlIIIIllIlIl(a(c0003d) ? 1 : 0)) {
                Movement.setDestination(this.startPoint.get());
                return lllIIIIIIllI[2];
            }
            System.out.println(lllIIIIIIlIl[lllIIIIIIllI[2]]);
            Movement.setDestination(this.destination.get());
            return lllIIIIIIllI[2];
        }
        return lllIIIIIIllI[0];
    }

    private static boolean lIIIlIIIIlIllll(int i) {
        return i == 0;
    }

    private static boolean lIIIlIIIIllIlII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v133, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v143, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v154, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v156, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v161, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v166, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v174, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v181, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v189, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v194, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v199, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v203, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v206, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    public boolean a(C0003d c0003d) {
        J b = c0003d.b(this.object.get());
        if (lIIIlIIIIlIlllI(b)) {
            System.out.println(lllIIIIIIlIl[lllIIIIIIllI[0]]);
            return lllIIIIIIllI[0];
        }
        System.out.println("ID: " + b.aG() + " | ticks:" + b.aF());
        Player local = Players.getLocal();
        if (!lIIIlIIIIlIlllI(local) && !lIIIlIIIIlIllll(local.getWorldLocation().equals(this.startPoint.get()) ? 1 : 0)) {
            switch (B.U[this.type.ordinal()]) {
                case 1:
                    return (lIIIlIIIIllIIII(b.aG(), C0001b.o) && lIIIlIIIIllIIII(b.aF(), lllIIIIIIllI[1])) ? lllIIIIIIllI[2] : (lIIIlIIIIllIIII(b.aG(), C0001b.o) && lIIIlIIIIllIIII(b.aF(), lllIIIIIIllI[3])) ? lllIIIIIIllI[2] : lllIIIIIIllI[0];
                case 2:
                    if ((!lIIIlIIIIllIIII(b.aG(), C0001b.o) || !lIIIlIIIIllIIIl(b.aF(), lllIIIIIIllI[1])) && !lIIIlIIIIllIIII(b.aG(), C0001b.n)) {
                        return lllIIIIIIllI[0];
                    }
                    return lllIIIIIIllI[2];
                case 3:
                    if (lIIIlIIIIllIIII(b.aG(), C0001b.o) && lIIIlIIIIllIIII(b.aF(), lllIIIIIIllI[1])) {
                        return lllIIIIIIllI[2];
                    }
                    if ((!lIIIlIIIIllIIII(b.aG(), C0001b.o) || !lIIIlIIIIllIIII(b.aF(), lllIIIIIIllI[3])) && !lIIIlIIIIllIIII(b.aG(), C0001b.n)) {
                        return lllIIIIIIllI[0];
                    }
                    return lllIIIIIIllI[2];
                case 4:
                    return (lIIIlIIIIllIIII(b.aG(), C0001b.o) && lIIIlIIIIllIIII(b.aF(), lllIIIIIIllI[1])) ? lllIIIIIIllI[2] : (!lIIIlIIIIllIIlI(b.aG(), C0001b.p) || lIIIlIIIIllIIII(b.aG(), C0001b.n)) ? lllIIIIIIllI[2] : lllIIIIIIllI[0];
                case 5:
                    if ((!lIIIlIIIIllIIII(b.aG(), C0001b.o) || !lIIIlIIIIllIIII(b.aF(), lllIIIIIIllI[1])) && !lIIIlIIIIllIIII(b.aG(), C0001b.n)) {
                        return lllIIIIIIllI[0];
                    }
                    return lllIIIIIIllI[2];
                case 6:
                    return (lIIIlIIIIllIIII(b.aG(), C0001b.o) && lIIIlIIIIllIIII(b.aF(), lllIIIIIIllI[1])) ? lllIIIIIIllI[2] : lllIIIIIIllI[0];
                case 7:
                    if (lIIIlIIIIllIIII(b.aG(), C0001b.o) && lIIIlIIIIllIIII(b.aF(), lllIIIIIIllI[1])) {
                        return lllIIIIIIllI[2];
                    }
                    if ((!lIIIlIIIIllIIII(b.aG(), C0001b.p) || !lIIIlIIIIllIIll(b.aF(), lllIIIIIIllI[4])) && !lIIIlIIIIllIIII(b.aG(), C0001b.n)) {
                        return lllIIIIIIllI[0];
                    }
                    return lllIIIIIIllI[2];
                case 8:
                    if ((!lIIIlIIIIllIIII(b.aG(), C0001b.o) || !lIIIlIIIIllIIII(b.aF(), lllIIIIIIllI[1])) && !lIIIlIIIIllIIII(b.aG(), C0001b.n)) {
                        return lllIIIIIIllI[0];
                    }
                    return lllIIIIIIllI[2];
                case 9:
                    return (lIIIlIIIIllIIII(b.aG(), C0001b.o) && lIIIlIIIIllIlII(b.aF(), lllIIIIIIllI[2])) ? lllIIIIIIllI[2] : lllIIIIIIllI[0];
                case 10:
                    return (lIIIlIIIIllIIII(b.aG(), C0001b.o) && lIIIlIIIIllIIII(b.aF(), lllIIIIIIllI[2])) ? lllIIIIIIllI[2] : lllIIIIIIllI[0];
                case 11:
                    return ((!lIIIlIIIIllIIII(b.aG(), C0001b.o) || (lIIIlIIIIllIIlI(b.aF(), lllIIIIIIllI[2]) && lIIIlIIIIllIIlI(b.aF(), lllIIIIIIllI[1]))) && !lIIIlIIIIllIIII(b.aG(), C0001b.n)) ? (lIIIlIIIIllIIII(b.aG(), C0001b.p) && lIIIlIIIIllIlII(b.aF(), lllIIIIIIllI[2]) && lIIIlIIIIllIIll(b.aF(), lllIIIIIIllI[4])) ? lllIIIIIIllI[2] : lllIIIIIIllI[0] : lllIIIIIIllI[2];
                default:
                    return lllIIIIIIllI[0];
            }
        }
        return lllIIIIIIllI[0];
    }

    private static String lIIIlIIIIIIllll(String lllllllllllllllIIlllIIlIIlIlIlII, String lllllllllllllllIIlllIIlIIlIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlIIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lllIIIIIIllI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIIIllI[1], lllllllllllllllIIlllIIlIIlIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIlIIlIlIlIl) {
            lllllllllllllllIIlllIIlIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIIllIlIl(int i) {
        return i != 0;
    }

    public Supplier<WorldPoint> al() {
        return this.startPoint;
    }

    private A(String str, int i, RegionPoint regionPoint, int i2, int i3, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier supplier, C c) {
        this.startAreas = () -> {
            return List.of(new WorldArea(SquireSepulchre.a(regionPoint), i2, i3));
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.destination = () -> {
            return SquireSepulchre.a(regionPoint3);
        };
        this.object = supplier;
        this.type = c;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    private static String lIIIlIIIIIIlllI(String lllllllllllllllIIlllIIlIIllIIIIl, String lllllllllllllllIIlllIIlIIllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIIllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIIIllI[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIlIIllIIIlI) {
            lllllllllllllllIIlllIIlIIllIIIlI.printStackTrace();
            return null;
        }
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    private static boolean lIIIlIIIIllIIlI(int i, int i2) {
        return i != i2;
    }

    private static void lIIIlIIIIIlIIIl() {
        lllIIIIIIlIl = new String[lllIIIIIIllI[80]];
        lllIIIIIIlIl[lllIIIIIIllI[0]] = lIIIlIIIIIIlllI("u+Xr1skgqiqVf4F9ZP2KFQ==", "pVuKH");
        lllIIIIIIlIl[lllIIIIIIllI[2]] = lIIIlIIIIIIllll("+P8botyFYWiqzg86LGlxDgfVbaWK3hre", "VRsLB");
        lllIIIIIIlIl[lllIIIIIIllI[1]] = lIIIlIIIIIIlllI("vZJ6w6SzHZxNL82A8lJeAw==", "Mjugh");
        lllIIIIIIlIl[lllIIIIIIllI[3]] = lIIIlIIIIIlIIII("GjkNLycpcCQ6NDklEg==", "MPwNU");
        lllIIIIIIlIl[lllIIIIIIllI[4]] = lIIIlIIIIIIlllI("3/koMhjbCql8KahRDa5VJA==", "whNBi");
        lllIIIIIIlIl[lllIIIIIIllI[10]] = lIIIlIIIIIIllll("H6/TpI6DUx12Fpmx60GP+Q==", "ZjWHj");
        lllIIIIIIlIl[lllIIIIIIllI[12]] = lIIIlIIIIIIllll("Ou7i2hmAWZa+jbuj9tr6lA==", "wrVAA");
        lllIIIIIIlIl[lllIIIIIIllI[14]] = lIIIlIIIIIIlllI("4YKSD4bBK+ISut0tNJ/w8A==", "aSQpW");
        lllIIIIIIlIl[lllIIIIIIllI[16]] = lIIIlIIIIIIlllI("LPAZac1lt87mkRQvFuTC/Q==", "bSBWa");
        lllIIIIIIlIl[lllIIIIIIllI[18]] = lIIIlIIIIIIllll("SkEr4pFFevO20bGI0nRrPQ==", "fncYE");
        lllIIIIIIlIl[lllIIIIIIllI[21]] = lIIIlIIIIIIlllI("AIFHUt7EaKDxHHiQ4/3zvA==", "FQnQA");
        lllIIIIIIlIl[lllIIIIIIllI[23]] = lIIIlIIIIIIllll("UOIXidoWmNKi6qbBQv4KAw==", "rdQVF");
        lllIIIIIIlIl[lllIIIIIIllI[25]] = lIIIlIIIIIIllll("BCME/EFFcZKXZ0dxXv6C3Q==", "OyALQ");
        lllIIIIIIlIl[lllIIIIIIllI[11]] = lIIIlIIIIIlIIII("PwcICDoMTiEdKRwbFw==", "hnriH");
        lllIIIIIIlIl[lllIIIIIIllI[27]] = lIIIlIIIIIlIIII("ODMpJhELegAzAhsvNg==", "oZSGc");
        lllIIIIIIlIl[lllIIIIIIllI[9]] = lIIIlIIIIIIlllI("zlar86atodpl+ARg0FD4bw==", "eMCxY");
        lllIIIIIIlIl[lllIIIIIIllI[30]] = lIIIlIIIIIIllll("IVE2YyIVCxPWd49wWZVovA==", "NcfOx");
        lllIIIIIIlIl[lllIIIIIIllI[29]] = lIIIlIIIIIIlllI("TKNNWaBYhFI7hQdVbBwHug==", "XEIZv");
        lllIIIIIIlIl[lllIIIIIIllI[32]] = lIIIlIIIIIIlllI("E7og4L0lHAvFEgj4Vz5xVQ==", "mPsKm");
        lllIIIIIIlIl[lllIIIIIIllI[33]] = lIIIlIIIIIIlllI("YmWbGgI9hNeLfgqLK73jtw==", "FpwSL");
        lllIIIIIIlIl[lllIIIIIIllI[34]] = lIIIlIIIIIIllll("LpeGzO/WbjGPGgA/kNmM3g==", "yZqQM");
        lllIIIIIIlIl[lllIIIIIIllI[13]] = lIIIlIIIIIIllll("tjyIF/NBNOUFRdY9PPXwrw==", "CEPAN");
        lllIIIIIIlIl[lllIIIIIIllI[35]] = lIIIlIIIIIIlllI("X6xuGWVvp7qkaUKChkKlog==", "gOOgE");
        lllIIIIIIlIl[lllIIIIIIllI[8]] = lIIIlIIIIIlIIII("IysRDQsQYjgYGAA3Dg==", "tBkly");
        lllIIIIIIlIl[lllIIIIIIllI[24]] = lIIIlIIIIIIllll("T0IEua0zPA0/GlWxQM87gA==", "DUGzD");
        lllIIIIIIlIl[lllIIIIIIllI[15]] = lIIIlIIIIIIllll("+M/Rcx9T9elJHl1fr5bZNw==", "JiDYC");
        lllIIIIIIlIl[lllIIIIIIllI[37]] = lIIIlIIIIIlIIII("FCYjCTMnbwocIDc6PA==", "COYhA");
        lllIIIIIIlIl[lllIIIIIIllI[17]] = lIIIlIIIIIIllll("BhcigGKuB+vK6lTS1/T0qA==", "jeBqr");
        lllIIIIIIlIl[lllIIIIIIllI[40]] = lIIIlIIIIIIlllI("mSID7laa+rEcCIO+KWx/gQ==", "KvGIY");
        lllIIIIIIlIl[lllIIIIIIllI[31]] = lIIIlIIIIIlIIII("JA4XJxYXRz4yBQcSCA==", "sgmFd");
        lllIIIIIIlIl[lllIIIIIIllI[42]] = lIIIlIIIIIlIIII("IC4TCDYTZzodJQMyDA==", "wGiiD");
        lllIIIIIIlIl[lllIIIIIIllI[43]] = lIIIlIIIIIIlllI("I6hLS/3zbc1bgL51GgHxcw==", "JJNQH");
        lllIIIIIIlIl[lllIIIIIIllI[44]] = lIIIlIIIIIlIIII("JiITCTUVazocJgU+DA==", "qKihG");
        lllIIIIIIlIl[lllIIIIIIllI[39]] = lIIIlIIIIIlIIII("JCcPLDYXbiY5JQc7EA==", "sNuMD");
        lllIIIIIIlIl[lllIIIIIIllI[45]] = lIIIlIIIIIIllll("4M2xyI9X6MtFKVrI2J77Qg==", "mRGth");
        lllIIIIIIlIl[lllIIIIIIllI[46]] = lIIIlIIIIIIlllI("oFrVS/TJiX2MeGjnrKSEiA==", "ojBeg");
        lllIIIIIIlIl[lllIIIIIIllI[19]] = lIIIlIIIIIIllll("TkqRyZ/sQoWmrXOUrUThPQ==", "vHwBv");
        lllIIIIIIlIl[lllIIIIIIllI[48]] = lIIIlIIIIIIlllI("JFLca+IR3Uv/+7jPB30xig==", "ZHbTe");
        lllIIIIIIlIl[lllIIIIIIllI[49]] = lIIIlIIIIIIlllI("8cNgBVZw9Ptd522RTYya1A==", "QjGUH");
        lllIIIIIIlIl[lllIIIIIIllI[50]] = lIIIlIIIIIlIIII("JRwxMCAWVRglMwYALg==", "ruKQR");
        lllIIIIIIlIl[lllIIIIIIllI[28]] = lIIIlIIIIIlIIII("OwYZORgITzAsCxgaBg==", "locXj");
        lllIIIIIIlIl[lllIIIIIIllI[36]] = lIIIlIIIIIIlllI("Y6hYSy+ar4SRmu/WleZweg==", "Ebkal");
        lllIIIIIIlIl[lllIIIIIIllI[7]] = lIIIlIIIIIlIIII("EzYWAh0NLAwf", "DsEVB");
        lllIIIIIIlIl[lllIIIIIIllI[52]] = lIIIlIIIIIIlllI("r0/IKvx61IL78RTYTobt7g==", "pBeDK");
        lllIIIIIIlIl[lllIIIIIIllI[5]] = lIIIlIIIIIIlllI("jIAtCocyaiX3yF+gfGya5A==", "Reitc");
        lllIIIIIIlIl[lllIIIIIIllI[54]] = lIIIlIIIIIIllll("xXxNy6fxMS1405/evpBGKw==", "hhhCy");
        lllIIIIIIlIl[lllIIIIIIllI[55]] = lIIIlIIIIIIllll("MB2EDsypSQFwJhA+YL2IUA==", "HYhhX");
        lllIIIIIIlIl[lllIIIIIIllI[56]] = lIIIlIIIIIIlllI("6PN939CK/lNXQMeP9EgBg+JHqEU1Jl25", "FjtSu");
        lllIIIIIIlIl[lllIIIIIIllI[57]] = lIIIlIIIIIIlllI("EKAFkC+T7CjmUZvLaKkoPQ==", "xDvNg");
        lllIIIIIIlIl[lllIIIIIIllI[58]] = lIIIlIIIIIIllll("AyfE/GswV8R6zxg2JHfBMw==", "xPIUX");
        lllIIIIIIlIl[lllIIIIIIllI[26]] = lIIIlIIIIIlIIII("FhQLDDkaChER", "SUXXf");
        lllIIIIIIlIl[lllIIIIIIllI[22]] = lIIIlIIIIIlIIII("Iw80NhsvES40", "fNgbD");
        lllIIIIIIlIl[lllIIIIIIllI[61]] = lIIIlIIIIIlIIII("JxImHB0rDCM=", "bSuHB");
        lllIIIIIIlIl[lllIIIIIIllI[41]] = lIIIlIIIIIlIIII("JyM8ASU5LzAcLA==", "pfoUz");
        lllIIIIIIlIl[lllIIIIIIllI[6]] = lIIIlIIIIIIlllI("4ZcXwgnznFdup908KhvYDw==", "FMsEZ");
        lllIIIIIIlIl[lllIIIIIIllI[62]] = lIIIlIIIIIIllll("7Eiqp0tDd1jaq5Vu5zh5Cg==", "wfpOo");
        lllIIIIIIlIl[lllIIIIIIllI[20]] = lIIIlIIIIIlIIII("FycVMC8bLxktOQ==", "RfFdp");
        lllIIIIIIlIl[lllIIIIIIllI[51]] = lIIIlIIIIIlIIII("DjUhPCsCPS0hPQI=", "Ktrht");
        lllIIIIIIlIl[lllIIIIIIllI[38]] = lIIIlIIIIIIlllI("xkYoKWTv6HBw+ThEHd8L4w==", "GExAr");
        lllIIIIIIlIl[lllIIIIIIllI[47]] = lIIIlIIIIIlIIII("LBg4ExogEDQOHQ==", "iYkGE");
        lllIIIIIIlIl[lllIIIIIIllI[53]] = lIIIlIIIIIIllll("E1HpUe/LJKASLgG9TyecNA==", "wNNME");
        lllIIIIIIlIl[lllIIIIIIllI[63]] = lIIIlIIIIIlIIII("CiQkMCoGLCg8PA==", "Oewdu");
        lllIIIIIIlIl[lllIIIIIIllI[59]] = lIIIlIIIIIIllll("yudMnq4vrpKPOmdYct18aw==", "Gfjjg");
        lllIIIIIIlIl[lllIIIIIIllI[60]] = lIIIlIIIIIlIIII("HCU0GzoNIy8QOwo=", "RjfOr");
        lllIIIIIIlIl[lllIIIIIIllI[64]] = lIIIlIIIIIIllll("CMZatizP3wHWJJ+IWSS83g==", "CIGEc");
        lllIIIIIIlIl[lllIIIIIIllI[65]] = lIIIlIIIIIIlllI("pqHSq8CLGF/u7idJhIiNxw==", "pLNuP");
        lllIIIIIIlIl[lllIIIIIIllI[66]] = lIIIlIIIIIIlllI("yoy4Cs83vF8PMv+2HYgnVw==", "yURKs");
        lllIIIIIIlIl[lllIIIIIIllI[67]] = lIIIlIIIIIIllll("PAA5dawXX5TlhAktI85Plw==", "BNQxa");
        lllIIIIIIlIl[lllIIIIIIllI[68]] = lIIIlIIIIIlIIII("HCwMDAAQKg8HAQ==", "OcYXH");
        lllIIIIIIlIl[lllIIIIIIllI[69]] = lIIIlIIIIIlIIII("EQgSGgsdDhERCgs=", "BGGNC");
        lllIIIIIIlIl[lllIIIIIIllI[70]] = lIIIlIIIIIlIIII("Pj43OTEvODMyLzk4", "pqemy");
        lllIIIIIIlIl[lllIIIIIIllI[71]] = lIIIlIIIIIIlllI("djsfsEQb7hmmojIkLli0IQ==", "YYIPo");
        lllIIIIIIlIl[lllIIIIIIllI[72]] = lIIIlIIIIIIlllI("LFsSiSxBMLY=", "YRnho");
        lllIIIIIIlIl[lllIIIIIIllI[73]] = lIIIlIIIIIIlllI("HBk5EY/eMd7ntjLLmRJ6vw==", "HQGSK");
        lllIIIIIIlIl[lllIIIIIIllI[74]] = lIIIlIIIIIlIIII("DRkHEDAGHx4G", "YVWOf");
        lllIIIIIIlIl[lllIIIIIIllI[75]] = lIIIlIIIIIlIIII("LAQnKz4kEjUwOygE", "aMcor");
        lllIIIIIIlIl[lllIIIIIIllI[76]] = lIIIlIIIIIIllll("hfuOENQkzxwH0NZhpqGXhA==", "SuWbh");
        lllIIIIIIlIl[lllIIIIIIllI[77]] = lIIIlIIIIIIllll("+MKPaL/kIVkpXmHxdMyNgw==", "hLgwn");
        lllIIIIIIlIl[lllIIIIIIllI[78]] = lIIIlIIIIIlIIII("PD8WDy40KQQUKyk=", "qvRKb");
        lllIIIIIIlIl[lllIIIIIIllI[79]] = lIIIlIIIIIlIIII("PD0NIhY0Kx85Ag==", "qtIfZ");
    }

    private static boolean lIIIlIIIIlIlllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(Locatable locatable) {
        for (WorldArea worldArea : this.startAreas.get()) {
            if (lIIIlIIIIllIlIl(worldArea.contains(locatable) ? 1 : 0)) {
                return lllIIIIIIllI[2];
            }
            "".length();
            if (0 != 0) {
                return ((((85 + 111) - 102) + 63) ^ (((14 + 20) - (-90)) + 27)) & (((22 ^ 24) ^ (18 ^ 22)) ^ (-" ".length()));
            }
        }
        return lllIIIIIIllI[0];
    }

    private static boolean lIIIlIIIIllIIIl(int i, int i2) {
        return i >= i2;
    }

    private A(String str, int i, List list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier supplier, C c) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (lIIIlIIIIllIlIl(it.hasNext() ? 1 : 0)) {
                Triple triple = (Triple) it.next();
                arrayList.add(new WorldArea(SquireSepulchre.a((RegionPoint) triple.getFirst()), ((Integer) triple.getSecond()).intValue(), ((Integer) triple.getThird()).intValue()));
                "".length();
                "".length();
                if ("   ".length() >= (131 ^ 135)) {
                    return null;
                }
            }
            return arrayList;
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint);
        };
        this.destination = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.object = supplier;
        this.type = c;
    }

    static {
        lIIIlIIIIlIllIl();
        lIIIlIIIIIlIIIl();
        WEST_I_I = new A(lllIIIIIIlIl[lllIIIIIIllI[36]], lllIIIIIIllI[0], new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[14], lllIIIIIIllI[1], C0001b.D), lllIIIIIIllI[11], lllIIIIIIllI[33], new RegionPoint(lllIIIIIIllI[4], lllIIIIIIllI[15], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[4], lllIIIIIIllI[19], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[37], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[28]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE);
        WEST_I_II = new A(lllIIIIIIlIl[lllIIIIIIllI[7]], lllIIIIIIllI[2], new RegionPoint(lllIIIIIIllI[3], lllIIIIIIllI[37], lllIIIIIIllI[1], C0001b.C), lllIIIIIIllI[3], lllIIIIIIllI[23], new RegionPoint(lllIIIIIIllI[4], lllIIIIIIllI[19], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[0], lllIIIIIIllI[5], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[37], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[50]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE);
        NORTH_I_II = new A(lllIIIIIIlIl[lllIIIIIIllI[52]], lllIIIIIIllI[1], new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[53], lllIIIIIIllI[1], C0001b.C), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[53], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[22], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[47], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[49]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE);
        NORTH_I_III = new A(lllIIIIIIlIl[lllIIIIIIllI[5]], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[22], lllIIIIIIllI[1], C0001b.C), lllIIIIIIllI[3], lllIIIIIIllI[18], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[22], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[7], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[47], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[48]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE);
        NORTH_I_IV = new A(lllIIIIIIlIl[lllIIIIIIllI[54]], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[7], lllIIIIIIllI[1], C0001b.C), lllIIIIIIllI[3], lllIIIIIIllI[18], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[7], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[48], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[47], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[19]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE);
        SOUTH_I_II = new A(lllIIIIIIlIl[lllIIIIIIllI[55]], lllIIIIIIllI[10], List.of(new Triple(new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[0], lllIIIIIIllI[1], C0001b.C), Integer.valueOf(lllIIIIIIllI[37]), Integer.valueOf(lllIIIIIIllI[3])), new Triple(new RegionPoint(lllIIIIIIllI[35], lllIIIIIIllI[3], lllIIIIIIllI[1], C0001b.C), Integer.valueOf(lllIIIIIIllI[30]), Integer.valueOf(lllIIIIIIllI[16]))), new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[21], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[27], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[23], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[46]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        SOUTH_I_II_EXTEND = new A(lllIIIIIIlIl[lllIIIIIIllI[56]], lllIIIIIIllI[12], new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[23], lllIIIIIIllI[1], C0001b.C), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[27], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[32], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[23], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[45]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        SOUTH_I_III = new A(lllIIIIIIlIl[lllIIIIIIllI[57]], lllIIIIIIllI[14], new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[9], lllIIIIIIllI[1], C0001b.C), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[32], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[35], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[23], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[39]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        EAST_I_I = new A(lllIIIIIIlIl[lllIIIIIIllI[58]], lllIIIIIIllI[16], new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[41], lllIIIIIIllI[1], C0001b.C), lllIIIIIIllI[25], lllIIIIIIllI[16], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[41], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[54], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[22], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[44]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE);
        EAST_I_II = new A(lllIIIIIIlIl[lllIIIIIIllI[26]], lllIIIIIIllI[18], new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[54], lllIIIIIIllI[1], C0001b.C), lllIIIIIIllI[3], lllIIIIIIllI[16], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[54], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[59], lllIIIIIIllI[45], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[22], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[43]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE);
        EAST_I_IV = new A(lllIIIIIIlIl[lllIIIIIIllI[22]], lllIIIIIIllI[21], List.of(new Triple(new RegionPoint(lllIIIIIIllI[60], lllIIIIIIllI[35], lllIIIIIIllI[1], C0001b.C), Integer.valueOf(lllIIIIIIllI[4]), Integer.valueOf(lllIIIIIIllI[30])), new Triple(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[30], lllIIIIIIllI[1], C0001b.C), Integer.valueOf(lllIIIIIIllI[14]), Integer.valueOf(lllIIIIIIllI[25]))), new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[32], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[22], lllIIIIIIllI[32], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[41], lllIIIIIIllI[27], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[42]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        EAST_I_V = new A(lllIIIIIIlIl[lllIIIIIIllI[61]], lllIIIIIIllI[23], new RegionPoint(lllIIIIIIllI[22], lllIIIIIIllI[30], lllIIIIIIllI[1], C0001b.C), lllIIIIIIllI[10], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[22], lllIIIIIIllI[32], lllIIIIIIllI[1], C0001b.C), new RegionPoint(lllIIIIIIllI[54], lllIIIIIIllI[42], lllIIIIIIllI[1], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[41], lllIIIIIIllI[9], lllIIIIIIllI[1], C0001b.C));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[31]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        WEST_II_IV = new A(lllIIIIIIlIl[lllIIIIIIllI[41]], lllIIIIIIllI[25], new RegionPoint(lllIIIIIIllI[62], lllIIIIIIllI[19], lllIIIIIIllI[1], C0001b.I), lllIIIIIIllI[16], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[19], lllIIIIIIllI[1], C0001b.I), new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[44], lllIIIIIIllI[1], C0001b.I), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[39], lllIIIIIIllI[1], C0001b.I));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[40]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        WEST_II_V = new A(lllIIIIIIlIl[lllIIIIIIllI[6]], lllIIIIIIllI[11], new RegionPoint(lllIIIIIIllI[62], lllIIIIIIllI[44], lllIIIIIIllI[1], C0001b.I), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[44], lllIIIIIIllI[1], C0001b.I), new RegionPoint(lllIIIIIIllI[63], lllIIIIIIllI[13], lllIIIIIIllI[1], C0001b.I), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[39], lllIIIIIIllI[1], C0001b.I));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[17]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_4);
        EAST_II_I = new A(lllIIIIIIlIl[lllIIIIIIllI[62]], lllIIIIIIllI[27], new RegionPoint(lllIIIIIIllI[19], lllIIIIIIllI[43], lllIIIIIIllI[1], C0001b.G), lllIIIIIIllI[10], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[28], lllIIIIIIllI[44], lllIIIIIIllI[1], C0001b.G), new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[44], lllIIIIIIllI[1], C0001b.G), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[31], lllIIIIIIllI[1], C0001b.G));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[37]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        EAST_II_II = new A(lllIIIIIIlIl[lllIIIIIIllI[20]], lllIIIIIIllI[9], new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[43], lllIIIIIIllI[1], C0001b.G), lllIIIIIIllI[4], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[44], lllIIIIIIllI[1], C0001b.G), new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[1], C0001b.G), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[31], lllIIIIIIllI[1], C0001b.G));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[15]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_4);
        EAST_II_III = new A(lllIIIIIIlIl[lllIIIIIIllI[51]], lllIIIIIIllI[30], new RegionPoint(lllIIIIIIllI[54], lllIIIIIIllI[43], lllIIIIIIllI[1], C0001b.G), lllIIIIIIllI[12], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[1], C0001b.G), new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[8], lllIIIIIIllI[1], C0001b.G), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[31], lllIIIIIIllI[1], C0001b.G));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[24]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        EAST_II_VIII = new A(lllIIIIIIlIl[lllIIIIIIllI[38]], lllIIIIIIllI[29], new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[12], lllIIIIIIllI[2], C0001b.G), lllIIIIIIllI[3], lllIIIIIIllI[11], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[32], lllIIIIIIllI[2], C0001b.G), new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[15], lllIIIIIIllI[2], C0001b.G), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], C0001b.G));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[8]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_4);
        EAST_II_IX = new A(lllIIIIIIlIl[lllIIIIIIllI[47]], lllIIIIIIllI[32], new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[33], lllIIIIIIllI[2], C0001b.G), lllIIIIIIllI[3], lllIIIIIIllI[14], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[15], lllIIIIIIllI[2], C0001b.G), new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[2], C0001b.G), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], C0001b.G));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[35]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_4);
        EAST_II_X = new A(lllIIIIIIlIl[lllIIIIIIllI[53]], lllIIIIIIllI[33], new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[37], lllIIIIIIllI[2], C0001b.G), lllIIIIIIllI[33], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[2], C0001b.G), new RegionPoint(lllIIIIIIllI[55], lllIIIIIIllI[44], lllIIIIIIllI[2], C0001b.G), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], C0001b.G));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[13]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        EAST_II_XI = new A(lllIIIIIIlIl[lllIIIIIIllI[63]], lllIIIIIIllI[34], new RegionPoint(lllIIIIIIllI[55], lllIIIIIIllI[43], lllIIIIIIllI[2], C0001b.G), lllIIIIIIllI[4], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[55], lllIIIIIIllI[44], lllIIIIIIllI[2], C0001b.G), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[44], lllIIIIIIllI[2], C0001b.G), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], C0001b.G));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[34]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        NORTH_II_VIII = new A(lllIIIIIIlIl[lllIIIIIIllI[59]], lllIIIIIIllI[13], new RegionPoint(lllIIIIIIllI[35], lllIIIIIIllI[38], lllIIIIIIllI[2], C0001b.G), lllIIIIIIllI[27], lllIIIIIIllI[10], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[38], lllIIIIIIllI[2], C0001b.G), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[41], lllIIIIIIllI[2], C0001b.G), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.G));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[33]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        NORTH_II_IX = new A(lllIIIIIIlIl[lllIIIIIIllI[60]], lllIIIIIIllI[35], new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[41], lllIIIIIIllI[2], C0001b.G), lllIIIIIIllI[3], lllIIIIIIllI[10], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[41], lllIIIIIIllI[2], C0001b.G), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[58], lllIIIIIIllI[2], C0001b.G), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.G));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[32]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        NORTH_II_X = new A(lllIIIIIIlIl[lllIIIIIIllI[64]], lllIIIIIIllI[8], new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[58], lllIIIIIIllI[2], C0001b.G), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[58], lllIIIIIIllI[2], C0001b.G), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[36], lllIIIIIIllI[2], C0001b.G), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.G));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[29]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        EAST_III_VI = new A(lllIIIIIIlIl[lllIIIIIIllI[65]], lllIIIIIIllI[24], List.of(new Triple(new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[27], lllIIIIIIllI[1], C0001b.J), Integer.valueOf(lllIIIIIIllI[3]), Integer.valueOf(lllIIIIIIllI[9])), new Triple(new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[13], lllIIIIIIllI[1], C0001b.J), Integer.valueOf(lllIIIIIIllI[16]), Integer.valueOf(lllIIIIIIllI[10]))), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[13], lllIIIIIIllI[1], C0001b.J), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[29], lllIIIIIIllI[1], C0001b.J), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[28], lllIIIIIIllI[29], lllIIIIIIllI[1], C0001b.J));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[30]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_GOLD_SHORT);
        EAST_III_VII = new A(lllIIIIIIlIl[lllIIIIIIllI[66]], lllIIIIIIllI[15], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[29], lllIIIIIIllI[1], C0001b.J), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[29], lllIIIIIIllI[1], C0001b.J), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[18], lllIIIIIIllI[1], C0001b.J), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[28], lllIIIIIIllI[23], lllIIIIIIllI[1], C0001b.J));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[9]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_GOLD_6);
        WEST_III_II = new A(lllIIIIIIlIl[lllIIIIIIllI[67]], lllIIIIIIllI[37], new RegionPoint(lllIIIIIIllI[23], lllIIIIIIllI[49], lllIIIIIIllI[1], C0001b.J), lllIIIIIIllI[18], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[23], lllIIIIIIllI[56], lllIIIIIIllI[1], C0001b.J), new RegionPoint(lllIIIIIIllI[23], lllIIIIIIllI[51], lllIIIIIIllI[1], C0001b.J), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[18], lllIIIIIIllI[26], lllIIIIIIllI[1], C0001b.J));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[27]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE);
        SOUTH_IV_I = new A(lllIIIIIIlIl[lllIIIIIIllI[68]], lllIIIIIIllI[17], new RegionPoint(lllIIIIIIllI[37], lllIIIIIIllI[29], lllIIIIIIllI[1], C0001b.L), lllIIIIIIllI[18], lllIIIIIIllI[25], new RegionPoint(lllIIIIIIllI[37], lllIIIIIIllI[33], lllIIIIIIllI[1], C0001b.L), new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[33], lllIIIIIIllI[1], C0001b.L), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[24], lllIIIIIIllI[9], lllIIIIIIllI[1], C0001b.L));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[11]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_GOLD_6);
        SOUTH_IV_II = new A(lllIIIIIIlIl[lllIIIIIIllI[69]], lllIIIIIIllI[40], new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[29], lllIIIIIIllI[1], C0001b.L), lllIIIIIIllI[14], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[33], lllIIIIIIllI[1], C0001b.L), new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[9], lllIIIIIIllI[1], C0001b.L), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[24], lllIIIIIIllI[9], lllIIIIIIllI[1], C0001b.L));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[25]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_GOLD_6);
        NORTH_IV_VII = new A(lllIIIIIIlIl[lllIIIIIIllI[70]], lllIIIIIIllI[31], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[41], lllIIIIIIllI[1], C0001b.L), lllIIIIIIllI[21], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[6], lllIIIIIIllI[1], C0001b.L), new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[6], lllIIIIIIllI[1], C0001b.L), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[19], lllIIIIIIllI[22], lllIIIIIIllI[1], C0001b.L));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[23]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_STRICT);
        NORTH_IV_VIII = new A(lllIIIIIIlIl[lllIIIIIIllI[71]], lllIIIIIIllI[42], new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[41], lllIIIIIIllI[1], C0001b.L), lllIIIIIIllI[21], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[6], lllIIIIIIllI[1], C0001b.L), new RegionPoint(lllIIIIIIllI[30], lllIIIIIIllI[57], lllIIIIIIllI[1], C0001b.L), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[19], lllIIIIIIllI[20], lllIIIIIIllI[1], C0001b.L));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[21]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_SHORT);
        TOP_V_I = new A(lllIIIIIIlIl[lllIIIIIIllI[72]], lllIIIIIIllI[43], new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[22], lllIIIIIIllI[1], C0001b.N), lllIIIIIIllI[12], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[51], lllIIIIIIllI[1], C0001b.N), new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[51], lllIIIIIIllI[1], C0001b.N), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[6], lllIIIIIIllI[1], C0001b.N));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[18]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_BLUE_I);
        TOP_V_II = new A(lllIIIIIIlIl[lllIIIIIIllI[73]], lllIIIIIIllI[44], new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[20], lllIIIIIIllI[1], C0001b.N), lllIIIIIIllI[1], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[51], lllIIIIIIllI[1], C0001b.N), new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[51], lllIIIIIIllI[1], C0001b.N), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[15], lllIIIIIIllI[6], lllIIIIIIllI[1], C0001b.N));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[16]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_BLUE_III);
        TOP_V_III = new A(lllIIIIIIlIl[lllIIIIIIllI[74]], lllIIIIIIllI[39], new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[20], lllIIIIIIllI[1], C0001b.N), lllIIIIIIllI[4], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[51], lllIIIIIIllI[1], C0001b.N), new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[41], lllIIIIIIllI[1], C0001b.N), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[13], lllIIIIIIllI[6], lllIIIIIIllI[1], C0001b.N));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[14]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_III = new A(lllIIIIIIlIl[lllIIIIIIllI[75]], lllIIIIIIllI[45], new RegionPoint(lllIIIIIIllI[3], lllIIIIIIllI[49], lllIIIIIIllI[2], C0001b.N), lllIIIIIIllI[21], lllIIIIIIllI[13], new RegionPoint(lllIIIIIIllI[25], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), new RegionPoint(lllIIIIIIllI[9], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[11], lllIIIIIIllI[6], lllIIIIIIllI[2], C0001b.N));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[12]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_BLUE_SHORT);
        MIDDLE_V_VI = new A(lllIIIIIIlIl[lllIIIIIIllI[76]], lllIIIIIIllI[46], new RegionPoint(lllIIIIIIllI[11], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), lllIIIIIIllI[3], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[9], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[9], lllIIIIIIllI[6], lllIIIIIIllI[2], C0001b.N));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[10]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_VII = new A(lllIIIIIIlIl[lllIIIIIIllI[77]], lllIIIIIIllI[19], new RegionPoint(lllIIIIIIllI[30], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), lllIIIIIIllI[16], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[6], lllIIIIIIllI[2], C0001b.N));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[4]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_IX = new A(lllIIIIIIlIl[lllIIIIIIllI[78]], lllIIIIIIllI[48], new RegionPoint(lllIIIIIIllI[24], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), lllIIIIIIllI[27], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[48], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), new RegionPoint(lllIIIIIIllI[52], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[6], lllIIIIIIllI[2], C0001b.N));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[3]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_X = new A(lllIIIIIIlIl[lllIIIIIIllI[79]], lllIIIIIIllI[49], new RegionPoint(lllIIIIIIllI[49], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), lllIIIIIIllI[12], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[52], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), new RegionPoint(lllIIIIIIllI[6], lllIIIIIIllI[20], lllIIIIIIllI[2], C0001b.N), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[6], lllIIIIIIllI[2], C0001b.N));
            String[] strArr = new String[lllIIIIIIllI[2]];
            strArr[lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[1]];
            return TileObjects.getNearest(a, strArr);
        }, C.STATUE_BLUE_STRICT);
        A[] aArr = new A[lllIIIIIIllI[50]];
        aArr[lllIIIIIIllI[0]] = WEST_I_I;
        aArr[lllIIIIIIllI[2]] = WEST_I_II;
        aArr[lllIIIIIIllI[1]] = NORTH_I_II;
        aArr[lllIIIIIIllI[3]] = NORTH_I_III;
        aArr[lllIIIIIIllI[4]] = NORTH_I_IV;
        aArr[lllIIIIIIllI[10]] = SOUTH_I_II;
        aArr[lllIIIIIIllI[12]] = SOUTH_I_II_EXTEND;
        aArr[lllIIIIIIllI[14]] = SOUTH_I_III;
        aArr[lllIIIIIIllI[16]] = EAST_I_I;
        aArr[lllIIIIIIllI[18]] = EAST_I_II;
        aArr[lllIIIIIIllI[21]] = EAST_I_IV;
        aArr[lllIIIIIIllI[23]] = EAST_I_V;
        aArr[lllIIIIIIllI[25]] = WEST_II_IV;
        aArr[lllIIIIIIllI[11]] = WEST_II_V;
        aArr[lllIIIIIIllI[27]] = EAST_II_I;
        aArr[lllIIIIIIllI[9]] = EAST_II_II;
        aArr[lllIIIIIIllI[30]] = EAST_II_III;
        aArr[lllIIIIIIllI[29]] = EAST_II_VIII;
        aArr[lllIIIIIIllI[32]] = EAST_II_IX;
        aArr[lllIIIIIIllI[33]] = EAST_II_X;
        aArr[lllIIIIIIllI[34]] = EAST_II_XI;
        aArr[lllIIIIIIllI[13]] = NORTH_II_VIII;
        aArr[lllIIIIIIllI[35]] = NORTH_II_IX;
        aArr[lllIIIIIIllI[8]] = NORTH_II_X;
        aArr[lllIIIIIIllI[24]] = EAST_III_VI;
        aArr[lllIIIIIIllI[15]] = EAST_III_VII;
        aArr[lllIIIIIIllI[37]] = WEST_III_II;
        aArr[lllIIIIIIllI[17]] = SOUTH_IV_I;
        aArr[lllIIIIIIllI[40]] = SOUTH_IV_II;
        aArr[lllIIIIIIllI[31]] = NORTH_IV_VII;
        aArr[lllIIIIIIllI[42]] = NORTH_IV_VIII;
        aArr[lllIIIIIIllI[43]] = TOP_V_I;
        aArr[lllIIIIIIllI[44]] = TOP_V_II;
        aArr[lllIIIIIIllI[39]] = TOP_V_III;
        aArr[lllIIIIIIllI[45]] = MIDDLE_V_III;
        aArr[lllIIIIIIllI[46]] = MIDDLE_V_VI;
        aArr[lllIIIIIIllI[19]] = MIDDLE_V_VII;
        aArr[lllIIIIIIllI[48]] = MIDDLE_V_IX;
        aArr[lllIIIIIIllI[49]] = MIDDLE_V_X;
        $VALUES = aArr;
    }

    private static void lIIIlIIIIlIllIl() {
        lllIIIIIIllI = new int[81];
        lllIIIIIIllI[0] = ((196 ^ 181) ^ (117 ^ 24)) & (((((163 + 147) - 188) + 99) ^ (((181 + 134) - 128) + 6)) ^ (-" ".length()));
        lllIIIIIIllI[1] = "  ".length();
        lllIIIIIIllI[2] = " ".length();
        lllIIIIIIllI[3] = "   ".length();
        lllIIIIIIllI[4] = (13 ^ 42) ^ (176 ^ 147);
        lllIIIIIIllI[5] = 40 ^ 4;
        lllIIIIIIllI[6] = 67 ^ 117;
        lllIIIIIIllI[7] = (((62 + 9) - (-2)) + 73) ^ (((67 + 22) - 41) + 136);
        lllIIIIIIllI[8] = 215 ^ 192;
        lllIIIIIIllI[9] = 23 ^ 24;
        lllIIIIIIllI[10] = (((71 + 56) - 68) + 121) ^ (((48 + 153) - 72) + 48);
        lllIIIIIIllI[11] = (((177 + 18) - 92) + 80) ^ (((152 + 43) - 105) + 96);
        lllIIIIIIllI[12] = 186 ^ 188;
        lllIIIIIIllI[13] = (((113 + 142) - 133) + 57) ^ (((148 + 30) - 138) + 126);
        lllIIIIIIllI[14] = 179 ^ 180;
        lllIIIIIIllI[15] = (((63 + 26) - (-6)) + 45) ^ (((122 + 31) - 140) + 136);
        lllIIIIIIllI[16] = 75 ^ 67;
        lllIIIIIIllI[17] = (((145 + 38) - 44) + 11) ^ (((90 + 107) - 186) + 130);
        lllIIIIIIllI[18] = 26 ^ 19;
        lllIIIIIIllI[19] = (12 ^ 83) ^ (41 ^ 82);
        lllIIIIIIllI[20] = (((53 + 7) - 50) + 129) ^ (((127 + 51) - 153) + 154);
        lllIIIIIIllI[21] = (((138 + 101) - 183) + 106) ^ (((36 + 153) - 58) + 37);
        lllIIIIIIllI[22] = 150 ^ 165;
        lllIIIIIIllI[23] = 49 ^ 58;
        lllIIIIIIllI[24] = 0 ^ 24;
        lllIIIIIIllI[25] = (35 ^ 44) ^ "   ".length();
        lllIIIIIIllI[26] = 165 ^ 151;
        lllIIIIIIllI[27] = (89 ^ 116) ^ (172 ^ 143);
        lllIIIIIIllI[28] = 4 ^ 44;
        lllIIIIIIllI[29] = (((176 + 58) - 165) + 120) ^ (((130 + 132) - 259) + 169);
        lllIIIIIIllI[30] = 17 ^ 1;
        lllIIIIIIllI[31] = (93 ^ 90) ^ (33 ^ 59);
        lllIIIIIIllI[32] = (((95 + 97) - 126) + 94) ^ (((118 + 36) - 45) + 69);
        lllIIIIIIllI[33] = 8 ^ 27;
        lllIIIIIIllI[34] = (((133 + 122) - 78) + 38) ^ (((114 + 118) - 178) + 141);
        lllIIIIIIllI[35] = (177 ^ 138) ^ (158 ^ 179);
        lllIIIIIIllI[36] = (31 ^ 39) ^ (30 ^ 15);
        lllIIIIIIllI[37] = 59 ^ 33;
        lllIIIIIIllI[38] = 154 ^ 160;
        lllIIIIIIllI[39] = 92 ^ 125;
        lllIIIIIIllI[40] = (((44 + 44) - 61) + 107) ^ (((125 + 49) - 163) + 143);
        lllIIIIIIllI[41] = (77 ^ 26) ^ (5 ^ 103);
        lllIIIIIIllI[42] = 102 ^ 120;
        lllIIIIIIllI[43] = 12 ^ 19;
        lllIIIIIIllI[44] = 190 ^ 158;
        lllIIIIIIllI[45] = (162 ^ 151) ^ (209 ^ 198);
        lllIIIIIIllI[46] = (110 ^ 107) ^ (29 ^ 59);
        lllIIIIIIllI[47] = 112 ^ 75;
        lllIIIIIIllI[48] = 65 ^ 100;
        lllIIIIIIllI[49] = (((29 + 110) - 111) + 160) ^ (((10 + 121) - 88) + 111);
        lllIIIIIIllI[50] = (((61 + 27) - 70) + 113) ^ (((17 + 11) - 17) + 153);
        lllIIIIIIllI[51] = 181 ^ 140;
        lllIIIIIIllI[52] = (19 ^ 57) ^ " ".length();
        lllIIIIIIllI[53] = 49 ^ 13;
        lllIIIIIIllI[54] = 29 ^ 48;
        lllIIIIIIllI[55] = 104 ^ 70;
        lllIIIIIIllI[56] = (162 ^ 173) ^ (136 ^ 168);
        lllIIIIIIllI[57] = 41 ^ 25;
        lllIIIIIIllI[58] = (211 ^ 128) ^ (205 ^ 175);
        lllIIIIIIllI[59] = 0 ^ 62;
        lllIIIIIIllI[60] = 70 ^ 121;
        lllIIIIIIllI[61] = (((78 + 72) - 63) + 96) ^ (((88 + 19) - 70) + 94);
        lllIIIIIIllI[62] = 242 ^ 197;
        lllIIIIIIllI[63] = 124 ^ 65;
        lllIIIIIIllI[64] = (106 ^ 18) ^ (47 ^ 23);
        lllIIIIIIllI[65] = (78 ^ 65) ^ (96 ^ 46);
        lllIIIIIIllI[66] = 42 ^ 104;
        lllIIIIIIllI[67] = (62 ^ 15) ^ (201 ^ 187);
        lllIIIIIIllI[68] = (63 ^ 86) ^ (138 ^ 167);
        lllIIIIIIllI[69] = 86 ^ 19;
        lllIIIIIIllI[70] = (((93 + 60) - 47) + 100) ^ (((19 + 7) - (-6)) + 104);
        lllIIIIIIllI[71] = (235 ^ 147) ^ (109 ^ 82);
        lllIIIIIIllI[72] = (((24 + 42) - 64) + 195) ^ (((123 + 137) - 150) + 31);
        lllIIIIIIllI[73] = 15 ^ 70;
        lllIIIIIIllI[74] = (88 ^ 110) ^ (238 ^ 146);
        lllIIIIIIllI[75] = 5 ^ 78;
        lllIIIIIIllI[76] = 72 ^ 4;
        lllIIIIIIllI[77] = 62 ^ 115;
        lllIIIIIIllI[78] = 201 ^ 135;
        lllIIIIIIllI[79] = (104 ^ 21) ^ (22 ^ 36);
        lllIIIIIIllI[80] = 37 ^ 117;
    }

    private static boolean lIIIlIIIIllIIII(int i, int i2) {
        return i == i2;
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }

    private static boolean lIIIlIIIIllIIll(int i, int i2) {
        return i < i2;
    }

    private static String lIIIlIIIIIlIIII(String lllllllllllllllIIlllIIlIIlllIIIl, String lllllllllllllllIIlllIIlIIlllIlIl) {
        String lllllllllllllllIIlllIIlIIlllIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlllIIlIIlllIlIl.toCharArray();
        int lllllllllllllllIIlllIIlIIlllIIlI = lllIIIIIIllI[0];
        char[] charArray2 = lllllllllllllllIIlllIIlIIlllIIIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIIIIllI[0];
        while (lIIIlIIIIllIIll(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlllIIlIIlllIIlI % charArray.length]));
            "".length();
            lllllllllllllllIIlllIIlIIlllIIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
