package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Triple;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.i  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/i.class */
public final class EnumC0008i {
    public static final /* synthetic */ EnumC0008i WEST_III_V;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    /* synthetic */ Supplier<WorldArea> dartArea;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ EnumC0008i EAST_III_IV;
    public static final /* synthetic */ EnumC0008i WEST_IV_V;
    public static final /* synthetic */ EnumC0008i WEST_I_IV;
    private static /* synthetic */ int[] lllIIlIllIlI;
    public static final /* synthetic */ EnumC0008i MIDDLE_V_I;
    public /* synthetic */ Supplier<TileObject> object;
    public static final /* synthetic */ EnumC0008i NORTH_I_I;
    public static final /* synthetic */ EnumC0008i NORTH_IV_V;
    public static final /* synthetic */ EnumC0008i WEST_III_I;
    public static final /* synthetic */ EnumC0008i NORTH_II_II;
    public static final /* synthetic */ EnumC0008i SOUTH_II_V;
    public static final /* synthetic */ EnumC0008i EAST_II_V;
    /* synthetic */ Supplier<WorldPoint> dartDestination;
    public static final /* synthetic */ EnumC0008i SOUTH_II_I;
    /* synthetic */ Supplier<WorldPoint> startDestination;
    public static final /* synthetic */ EnumC0008i EAST_IV_III;
    private static /* synthetic */ String[] lllIIlIIIlIl;
    public static final /* synthetic */ EnumC0008i SOUTH_IV_VI;
    public static final /* synthetic */ EnumC0008i BOTTOM_V_I;
    /* synthetic */ EnumC0009j entry;
    public static final /* synthetic */ EnumC0008i SOUTH_I_IV;
    public static final /* synthetic */ EnumC0008i EAST_IV_I;
    public static final /* synthetic */ EnumC0008i NORTH_IV_IX;
    /* synthetic */ EnumC0010k type;
    private static final /* synthetic */ EnumC0008i[] $VALUES;

    private static boolean lIIIlIlIIlIIlll(int i) {
        return i > 0;
    }

    private static boolean lIIIlIlIIlIIIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIlIlIIIlllII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v200, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v207, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v280, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v289, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    public boolean O() {
        Player local = Players.getLocal();
        if (lIIIlIlIIIlllII(local)) {
            return lllIIlIllIlI[0];
        }
        List<WorldPoint> d = d(L());
        System.out.println("Ahead: " + String.valueOf(d));
        List<TileObject> M = M();
        System.out.println("statues size: " + M.size());
        ArrayList arrayList = new ArrayList();
        int i = lllIIlIllIlI[0];
        if (lIIIlIlIIlIIlll(M.size())) {
            System.out.println(lllIIlIIIlIl[lllIIlIllIlI[12]]);
            int i2 = lllIIlIllIlI[0];
            for (TileObject tileObject : M) {
                int a = C0002c.a(tileObject);
                if (lIIIlIlIIlIIIII(a, C0001b.x)) {
                    i++;
                }
                if (lIIIlIlIIlIIIll(a, C0001b.x)) {
                    if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.SOUTH) || !lIIIlIlIIlIIlIl(this.type, EnumC0010k.NORTH) || lIIIlIlIIIlllll(this.type, EnumC0010k.SOUTH_BLADE)) {
                        System.out.println("Blacklisting: " + tileObject.getWorldX());
                        arrayList.add(Integer.valueOf(tileObject.getWorldX()));
                        "".length();
                        "".length();
                        if (" ".length() == "   ".length()) {
                            return ((((8 + 108) - 65) + 79) ^ (((150 + 37) - 131) + 95)) & (((((33 + 60) - 15) + 69) ^ (((44 + 33) - (-48)) + 9)) ^ (-" ".length()));
                        }
                    } else if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.WEST) || lIIIlIlIIIlllll(this.type, EnumC0010k.EAST)) {
                        System.out.println("Blacklisting: " + tileObject.getWorldY());
                        arrayList.add(Integer.valueOf(tileObject.getWorldY()));
                        "".length();
                        "".length();
                        if ((-" ".length()) == (((60 ^ 8) ^ (27 ^ 12)) & (((4 ^ 117) ^ (244 ^ 166)) ^ (-" ".length())))) {
                            return ((146 ^ 176) ^ (92 ^ 71)) & (((((165 + 42) - 64) + 42) ^ (((42 + 109) - 127) + 104)) ^ (-" ".length()));
                        }
                    }
                } else if (lIIIlIlIIIlllIl(a(i) ? 1 : 0)) {
                    System.out.println(lllIIlIIIlIl[lllIIlIllIlI[13]]);
                    Movement.setDestination(this.dartDestination.get());
                    return lllIIlIllIlI[1];
                } else {
                    i++;
                    "".length();
                    if (" ".length() == "  ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
            System.out.println("Blacklisted " + i2 + " elements");
            if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.SOUTH) || !lIIIlIlIIlIIlIl(this.type, EnumC0010k.NORTH) || lIIIlIlIIIlllll(this.type, EnumC0010k.SOUTH_BLADE)) {
                d.removeIf(worldPoint -> {
                    return arrayList.contains(Integer.valueOf(worldPoint.getWorldX()));
                });
                "".length();
                "".length();
                if ("   ".length() <= 0) {
                    return " ".length() & (" ".length() ^ (-1));
                }
            } else if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.WEST) || lIIIlIlIIIlllll(this.type, EnumC0010k.EAST)) {
                d.removeIf(worldPoint2 -> {
                    return arrayList.contains(Integer.valueOf(worldPoint2.getWorldY()));
                });
                "".length();
            }
            if (lIIIlIlIIIlllIl(d.size())) {
                d.sort(Comparator.comparingInt(worldPoint3 -> {
                    return Math.abs(worldPoint3.getWorldX() - local.getWorldX()) + Math.abs(worldPoint3.getWorldY() - local.getWorldY());
                }));
                System.out.println(lllIIlIIIlIl[lllIIlIllIlI[14]]);
                Movement.setDestination(d.get(lllIIlIllIlI[0]));
                return lllIIlIllIlI[1];
            }
            return lllIIlIllIlI[1];
        }
        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[4]]);
        List<NPC> N = N();
        N.sort(Comparator.comparingInt(npc -> {
            return Math.abs(npc.getWorldX() - local.getWorldX()) + Math.abs(npc.getWorldY() - local.getWorldY());
        }));
        arrayList.clear();
        int i3 = lllIIlIllIlI[0];
        while (true) {
            if (!lIIIlIlIIlIIllI(i3, lllIIlIllIlI[5])) {
                break;
            } else if (lIIIlIlIIlIIIlI(N.size(), i3)) {
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                NPC npc2 = N.get(i3);
                if (lIIIlIlIIIlllII(npc2)) {
                    N.remove(i3);
                    "".length();
                    "".length();
                    if ("   ".length() < (-" ".length())) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.SOUTH) || lIIIlIlIIIlllll(this.type, EnumC0010k.SOUTH_BLADE)) {
                        if (lIIIlIlIIlIIllI(npc2.getWorldY(), local.getWorldY())) {
                            arrayList.add(Integer.valueOf(npc2.getWorldX()));
                            "".length();
                            i3++;
                            "".length();
                            if ((-" ".length()) > ((29 ^ 126) & ((122 ^ 25) ^ (-1)))) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        } else {
                            N.remove(i3);
                            "".length();
                        }
                    }
                    if (lIIIlIlIIIlllll(this.type, EnumC0010k.WEST)) {
                        if (lIIIlIlIIlIIllI(npc2.getWorldX(), local.getWorldX())) {
                            arrayList.add(Integer.valueOf(npc2.getWorldY()));
                            "".length();
                            i3++;
                            "".length();
                            if (!(true ^ true)) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        } else {
                            N.remove(i3);
                            "".length();
                        }
                    }
                    if (lIIIlIlIIIlllll(this.type, EnumC0010k.EAST)) {
                        if (lIIIlIlIIlIlIII(npc2.getWorldX(), local.getWorldX())) {
                            arrayList.add(Integer.valueOf(npc2.getWorldY()));
                            "".length();
                            i3++;
                            "".length();
                            if (" ".length() < ((98 ^ 37) & ((215 ^ 144) ^ (-1)))) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        } else {
                            N.remove(i3);
                            "".length();
                        }
                    }
                    if (lIIIlIlIIIlllll(this.type, EnumC0010k.NORTH)) {
                        if (lIIIlIlIIlIlIII(npc2.getWorldY(), local.getWorldY())) {
                            arrayList.add(Integer.valueOf(npc2.getWorldX()));
                            "".length();
                            i3++;
                            "".length();
                            if ((-" ".length()) >= 0) {
                                return ((((143 + 182) - 230) + 101) ^ (((64 + 43) - 71) + 112)) & (((65 ^ 110) ^ (((55 + 9) - 62) + 125)) ^ (-" ".length()));
                            }
                        } else {
                            N.remove(i3);
                            "".length();
                        }
                    }
                    "".length();
                    if ((159 ^ 155) < "   ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
        }
        if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.SOUTH) || !lIIIlIlIIlIIlIl(this.type, EnumC0010k.NORTH) || lIIIlIlIIIlllll(this.type, EnumC0010k.SOUTH_BLADE)) {
            d.removeIf(worldPoint4 -> {
                return arrayList.contains(Integer.valueOf(worldPoint4.getWorldX()));
            });
            "".length();
            "".length();
            if (" ".length() != " ".length()) {
                return ((((206 + 147) - 245) + 116) ^ (((31 + 26) - (-24)) + 97)) & (((52 ^ 32) ^ (213 ^ 147)) ^ (-" ".length()));
            }
        } else if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.WEST) || lIIIlIlIIIlllll(this.type, EnumC0010k.EAST)) {
            d.removeIf(worldPoint5 -> {
                return arrayList.contains(Integer.valueOf(worldPoint5.getWorldY()));
            });
            "".length();
        }
        if (!lIIIlIlIIIlllIl(d.size())) {
            System.out.println(lllIIlIIIlIl[lllIIlIllIlI[16]]);
            return lllIIlIllIlI[0];
        }
        d.sort(Comparator.comparingInt(worldPoint6 -> {
            return Math.abs(worldPoint6.getWorldX() - local.getWorldX()) + Math.abs(worldPoint6.getWorldY() - local.getWorldY());
        }));
        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[15]]);
        Movement.setDestination(d.get(lllIIlIllIlI[0]));
        return lllIIlIllIlI[1];
    }

    private static void lIIIlIlIIIllIlI() {
        lllIIlIIIlIl = new String[lllIIlIllIlI[61]];
        lllIIlIIIlIl[lllIIlIllIlI[0]] = lIIIlIIllllIIIl("vtUDytWzqCGnVa0MPP8Ocg==", "wrAfh");
        lllIIlIIIlIl[lllIIlIllIlI[1]] = lIIIlIIllllIIll("Iw0BBhAcQzsVGRwWDQ==", "hchax");
        lllIIlIIIlIl[lllIIlIllIlI[5]] = lIIIlIIllllIlII("3YQgyFr3/rglJ5n3WzCCsw==", "iMdJR");
        lllIIlIIIlIl[lllIIlIllIlI[6]] = lIIIlIIllllIIll("BBoCFC8TUgsILR4BBUEqBFILAC8EFw==", "wrmaC");
        lllIIlIIIlIl[lllIIlIllIlI[2]] = lIIIlIIllllIlII("9yVBBgzrq+48gRkZK7RBlg==", "EpgXy");
        lllIIlIIIlIl[lllIIlIllIlI[8]] = lIIIlIIllllIIIl("LsaBUv4soZbIZbhV1QeLew==", "yAYSh");
        lllIIlIIIlIl[lllIIlIllIlI[9]] = lIIIlIIllllIIll("Mj8mIh4UM2ctERQ2Iw==", "qWGLy");
        lllIIlIIIlIl[lllIIlIllIlI[10]] = lIIIlIIllllIIIl("5iMgxOprD6Cse8BkVbUvPg==", "WoDUb");
        lllIIlIIIlIl[lllIIlIllIlI[11]] = lIIIlIIllllIlII("u1AVPP/+GSWjg8VSSkl3Ig==", "UaBsC");
        lllIIlIIIlIl[lllIIlIllIlI[12]] = lIIIlIIllllIIIl("ipefsnZbl6o=", "ZHlyp");
        lllIIlIIIlIl[lllIIlIllIlI[13]] = lIIIlIIllllIlII("IG0sXhkJJMqak0mIfcmW+A==", "iASbT");
        lllIIlIIIlIl[lllIIlIllIlI[14]] = lIIIlIIllllIIIl("T2SUtU+C2MJ6WrADPxZBhuNTsPjaF8ih", "oBUYN");
        lllIIlIIIlIl[lllIIlIllIlI[4]] = lIIIlIIllllIIIl("PqsbfdusZhg=", "RnjmT");
        lllIIlIIIlIl[lllIIlIllIlI[15]] = lIIIlIIllllIIll("MiQFHTVMZQAIKh0sGQ5mFy0SCCI=", "vEwiF");
        lllIIlIIIlIl[lllIIlIllIlI[16]] = lIIIlIIllllIIll("LR4lBDBp", "HlWkB");
        lllIIlIIIlIl[lllIIlIllIlI[18]] = lIIIlIIllllIlII("yOfEFpam9CUh+iht7XPHpthyPDj8hsIk", "FjHYG");
        lllIIlIIIlIl[lllIIlIllIlI[19]] = lIIIlIIllllIIIl("BkPocArvNzW4PK7rnLiG8RA//zioXkbY", "znFPE");
        lllIIlIIIlIl[lllIIlIllIlI[20]] = lIIIlIIllllIlII("1qmjJ+Uu19Zboo9rzobmlRBCu37JAtnQ", "gcgis");
        lllIIlIIIlIl[lllIIlIllIlI[17]] = lIIIlIIllllIIIl("170GGqHrJOZcObgloJkeXZ0xtpqrUJXF", "LrwIY");
        lllIIlIIIlIl[lllIIlIllIlI[21]] = lIIIlIIllllIIll("ASUmNiQQIysr", "Ojtbl");
        lllIIlIIIlIl[lllIIlIllIlI[3]] = lIIIlIIllllIIll("JBYgATg6DDoD", "sSsUg");
        lllIIlIIIlIl[lllIIlIllIlI[36]] = lIIIlIIllllIIIl("rKscDzuQ3AuicWAS3G2Kag==", "Wurmk");
        lllIIlIIIlIl[lllIIlIllIlI[38]] = lIIIlIIllllIIIl("15ywSA9eHeglSMuLkvUchw==", "DefOD");
        lllIIlIIIlIl[lllIIlIllIlI[23]] = lIIIlIIllllIlII("wobbdOzAgPXI3S/UtDMPoQ==", "JCRUg");
        lllIIlIIIlIl[lllIIlIllIlI[40]] = lIIIlIIllllIIll("Cw4UAxkHBhgB", "NOGWF");
        lllIIlIIIlIl[lllIIlIllIlI[42]] = lIIIlIIllllIIIl("jPrT2Y6JcC/WK5Ai0E87jQ==", "JiDWs");
        lllIIlIIIlIl[lllIIlIllIlI[27]] = lIIIlIIllllIIIl("MMkAVpsqrbKKKztHbrjZXA==", "ScglZ");
        lllIIlIIIlIl[lllIIlIllIlI[49]] = lIIIlIIllllIIIl("SlcNMWSIwZVH0kF5GbPuaQ==", "FKrhB");
        lllIIlIIIlIl[lllIIlIllIlI[24]] = lIIIlIIllllIIll("IDA7GBk+PCETEA==", "wuhLF");
        lllIIlIIIlIl[lllIIlIllIlI[26]] = lIIIlIIllllIIll("Fx8CPgIbGQE1HA0=", "DPWjJ");
        lllIIlIIIlIl[lllIIlIllIlI[39]] = lIIIlIIllllIIll("GRk4JRsIHzwuBQ==", "WVjqS");
        lllIIlIIIlIl[lllIIlIllIlI[37]] = lIIIlIIllllIlII("AyeB+3NVXTHD/dxhIL2L0g==", "eKiBO");
        lllIIlIIIlIl[lllIIlIllIlI[59]] = lIIIlIIllllIlII("X+nIgns5CjY53wXOclOr0w==", "SViCE");
        lllIIlIIIlIl[lllIIlIllIlI[62]] = lIIIlIIllllIIll("FAMkPT4YFCggKBg=", "QBwia");
        lllIIlIIIlIl[lllIIlIllIlI[47]] = lIIIlIIllllIIll("AS4wFhQfPTwU", "VkcBK");
        lllIIlIIIlIl[lllIIlIllIlI[50]] = lIIIlIIllllIlII("pk9ZLvALBK5i9dc5QvURPQ==", "GwFsf");
        lllIIlIIIlIl[lllIIlIllIlI[51]] = lIIIlIIllllIIIl("dM4RW7XtKwCX23gwY0ntOw==", "mYqwT");
    }

    private static String lIIIlIIllllIIIl(String lllllllllllllllIIllIlIIlllIIlIlI, String lllllllllllllllIIllIlIIlllIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIlllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIIlllIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIlllIIlllI.init(lllIIlIllIlI[5], lllllllllllllllIIllIlIIlllIIllll);
            return new String(lllllllllllllllIIllIlIIlllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlllIIllIl) {
            lllllllllllllllIIllIlIIlllIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIIIlllIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    private boolean a(int i) {
        Player local = Players.getLocal();
        if (lIIIlIlIIIlllII(local)) {
            return lllIIlIllIlI[0];
        }
        int i2 = lllIIlIllIlI[0];
        if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.SOUTH) || lIIIlIlIIIlllll(this.type, EnumC0010k.SOUTH_BLADE)) {
            if (lIIIlIlIIlIIIlI(Q().get().getWorldY(), local.getWorldY())) {
                return lllIIlIllIlI[0];
            }
            Math.abs(this.dartDestination.get().getWorldY() - local.getWorldY());
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.WEST)) {
            if (lIIIlIlIIlIIIlI(Q().get().getWorldX(), local.getWorldX())) {
                return lllIIlIllIlI[0];
            }
            Math.abs(this.dartDestination.get().getWorldX() - local.getWorldX());
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.EAST)) {
            if (lIIIlIlIIlIIIIl(Q().get().getWorldX(), local.getWorldX())) {
                return lllIIlIllIlI[0];
            }
            Math.abs(this.dartDestination.get().getWorldX() - local.getWorldX());
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.NORTH)) {
            if (lIIIlIlIIlIIIIl(Q().get().getWorldY(), local.getWorldY())) {
                return lllIIlIllIlI[0];
            }
            Math.abs(this.dartDestination.get().getWorldY() - local.getWorldY());
        }
        List<TileObject> M = M();
        int i3 = lllIIlIllIlI[0];
        do {
            if (lIIIlIlIIlIIllI(i3, M.size()) && lIIIlIlIIlIIllI(i3, lllIIlIllIlI[6])) {
                if (lIIIlIlIIlIIIIl(i3, M.size())) {
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else if (!lIIIlIlIIlIIIll(C0002c.a(M.get(i3)), C0001b.y) || lIIIlIlIIlIIIII(i, lllIIlIllIlI[6])) {
                    return lllIIlIllIlI[1];
                } else {
                    i3++;
                    "".length();
                }
            }
            System.out.println(lllIIlIIIlIl[lllIIlIllIlI[6]]);
            return lllIIlIllIlI[0];
        } while ("   ".length() <= "   ".length());
        return (true ^ true) & ((true ^ true) ^ true);
    }

    private static boolean lIIIlIlIIlIIIIl(int i, int i2) {
        return i >= i2;
    }

    private List<WorldPoint> L() {
        Player local = Players.getLocal();
        if (lIIIlIlIIIlllII(local)) {
            return null;
        }
        if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.SOUTH) || lIIIlIlIIIlllll(this.type, EnumC0010k.SOUTH_BLADE)) {
            if (lIIIlIlIIIlllll(this.entry, EnumC0009j.WEST)) {
                return new WorldArea(new WorldPoint(this.startPoint.get().getWorldX() + lllIIlIllIlI[1], local.getWorldY() - lllIIlIllIlI[5], local.getPlane()), lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
            if (lIIIlIlIIIlllll(this.entry, EnumC0009j.EAST)) {
                return new WorldArea(new WorldPoint(this.startPoint.get().getWorldX() - lllIIlIllIlI[6], local.getWorldY() - lllIIlIllIlI[5], local.getPlane()), lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.NORTH)) {
            if (lIIIlIlIIIlllll(this.entry, EnumC0009j.WEST)) {
                return new WorldArea(new WorldPoint(this.startPoint.get().getWorldX() + lllIIlIllIlI[1], local.getWorldY() + lllIIlIllIlI[5], local.getPlane()), lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
            if (lIIIlIlIIIlllll(this.entry, EnumC0009j.EAST)) {
                return new WorldArea(new WorldPoint(this.startPoint.get().getWorldX() - lllIIlIllIlI[6], local.getWorldY() + lllIIlIllIlI[5], local.getPlane()), lllIIlIllIlI[6], lllIIlIllIlI[1]).toWorldPointList();
            }
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.WEST)) {
            if (lIIIlIlIIIlllll(this.entry, EnumC0009j.NORTH)) {
                return new WorldArea(new WorldPoint(local.getWorldX() - lllIIlIllIlI[5], this.startPoint.get().getWorldY() - lllIIlIllIlI[6], local.getPlane()), lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
            if (lIIIlIlIIIlllll(this.entry, EnumC0009j.SOUTH)) {
                return new WorldArea(new WorldPoint(local.getWorldX() - lllIIlIllIlI[5], this.startPoint.get().getWorldY() + lllIIlIllIlI[1], local.getPlane()), lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.EAST)) {
            if (lIIIlIlIIIlllll(this.entry, EnumC0009j.NORTH)) {
                return new WorldArea(new WorldPoint(local.getWorldX() + lllIIlIllIlI[5], this.startPoint.get().getWorldY() - lllIIlIllIlI[6], local.getPlane()), lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
            if (lIIIlIlIIIlllll(this.entry, EnumC0009j.SOUTH)) {
                return new WorldArea(new WorldPoint(local.getWorldX() + lllIIlIllIlI[5], this.startPoint.get().getWorldY() + lllIIlIllIlI[1], local.getPlane()), lllIIlIllIlI[1], lllIIlIllIlI[6]).toWorldPointList();
            }
            return null;
        }
        return null;
    }

    private List<NPC> N() {
        Player local = Players.getLocal();
        if (lIIIlIlIIIlllII(local)) {
            return null;
        }
        if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.SOUTH) || lIIIlIlIIIlllll(this.type, EnumC0010k.SOUTH_BLADE)) {
            return NPCs.getAll(npc -> {
                if (lIIIlIlIIIlllIl(C0001b.z.contains(Integer.valueOf(npc.getId())) ? 1 : 0) && lIIIlIlIIlIIllI(npc.getWorldY(), local.getWorldY() + lllIIlIllIlI[1]) && lIIIlIlIIlIIllI(Math.abs(npc.getWorldX() - local.getWorldX()), lllIIlIllIlI[2]) && lIIIlIlIIlIlIII(npc.getWorldY(), local.getWorldY() - lllIIlIllIlI[3]) && lIIIlIlIIlIIIII(npc.getPlane(), local.getPlane())) {
                    ?? r0 = lllIIlIllIlI[1];
                    "".length();
                    return "   ".length() == (-" ".length()) ? ((8 ^ 76) ^ (25 ^ 105)) & (((213 ^ 146) ^ (123 ^ 8)) ^ (-" ".length())) : r0;
                }
                return lllIIlIllIlI[0];
            });
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.WEST)) {
            return NPCs.getAll(npc2 -> {
                if (lIIIlIlIIIlllIl(C0001b.z.contains(Integer.valueOf(npc2.getId())) ? 1 : 0) && lIIIlIlIIlIIllI(npc2.getWorldX(), local.getWorldX() + lllIIlIllIlI[1]) && lIIIlIlIIlIIllI(Math.abs(npc2.getWorldY() - local.getWorldY()), lllIIlIllIlI[2]) && lIIIlIlIIlIlIII(npc2.getWorldX(), local.getWorldX() - lllIIlIllIlI[3]) && lIIIlIlIIlIIIII(npc2.getPlane(), local.getPlane())) {
                    ?? r0 = lllIIlIllIlI[1];
                    "".length();
                    return (-" ".length()) > (-" ".length()) ? ((31 ^ 78) ^ (50 ^ 111)) & (((((40 + 19) - 25) + 99) ^ (((25 + 131) - 58) + 39)) ^ (-" ".length())) : r0;
                }
                return lllIIlIllIlI[0];
            });
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.EAST)) {
            return NPCs.getAll(npc3 -> {
                if (lIIIlIlIIIlllIl(C0001b.z.contains(Integer.valueOf(npc3.getId())) ? 1 : 0) && lIIIlIlIIlIIllI(npc3.getWorldX(), local.getWorldX() + lllIIlIllIlI[3]) && lIIIlIlIIlIIllI(Math.abs(npc3.getWorldY() - local.getWorldY()), lllIIlIllIlI[2]) && lIIIlIlIIlIlIII(npc3.getWorldX(), local.getWorldX() - lllIIlIllIlI[1]) && lIIIlIlIIlIIIII(npc3.getPlane(), local.getPlane())) {
                    ?? r0 = lllIIlIllIlI[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIlIllIlI[0];
            });
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.NORTH)) {
            return NPCs.getAll(npc4 -> {
                if (lIIIlIlIIIlllIl(C0001b.z.contains(Integer.valueOf(npc4.getId())) ? 1 : 0) && lIIIlIlIIlIlIII(npc4.getWorldY(), local.getWorldY() - lllIIlIllIlI[1]) && lIIIlIlIIlIIllI(Math.abs(npc4.getWorldX() - local.getWorldX()), lllIIlIllIlI[2]) && lIIIlIlIIlIIllI(npc4.getWorldY(), local.getWorldY() + lllIIlIllIlI[3]) && lIIIlIlIIlIIIII(npc4.getPlane(), local.getPlane())) {
                    ?? r0 = lllIIlIllIlI[1];
                    "".length();
                    return ((50 ^ 63) ^ (148 ^ 156)) <= 0 ? ((75 ^ 23) ^ (31 ^ 21)) & (((((55 + 90) - (-3)) + 60) ^ (((88 + 70) - 50) + 26)) ^ (-" ".length())) : r0;
                }
                return lllIIlIllIlI[0];
            });
        }
        return null;
    }

    private static String lIIIlIIllllIIll(String lllllllllllllllIIllIlIIllIlIllll, String lllllllllllllllIIllIlIIllIlIlllI) {
        String lllllllllllllllIIllIlIIllIlIllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIllIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIllIlIllIl = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIlIIllIlIlllI.toCharArray();
        int lllllllllllllllIIllIlIIllIlIlIll = lllIIlIllIlI[0];
        char[] charArray2 = lllllllllllllllIIllIlIIllIlIllll2.toCharArray();
        int lllllllllllllllIIllIlIIllIlIIlII = charArray2.length;
        int i = lllIIlIllIlI[0];
        while (lIIIlIlIIlIIllI(i, lllllllllllllllIIllIlIIllIlIIlII)) {
            lllllllllllllllIIllIlIIllIlIllIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIllIlIIllIlIlIll % charArray.length]));
            "".length();
            lllllllllllllllIIllIlIIllIlIlIll++;
            i++;
            "".length();
            if ("  ".length() == ((221 ^ 159) ^ (64 ^ 6))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIlIIllIlIllIl);
    }

    private EnumC0008i(String str, int i, RegionPoint regionPoint, int i2, int i3, RegionPoint regionPoint2, RegionPoint regionPoint3, RegionPoint regionPoint4, int i4, int i5, RegionPoint regionPoint5, EnumC0010k enumC0010k, EnumC0009j enumC0009j) {
        this.startAreas = () -> {
            return List.of(new WorldArea(SquireSepulchre.a(regionPoint), i2, i3));
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.startDestination = () -> {
            return SquireSepulchre.a(regionPoint3);
        };
        this.dartArea = () -> {
            return new WorldArea(SquireSepulchre.a(regionPoint4), i4, i5);
        };
        this.type = enumC0010k;
        this.dartDestination = () -> {
            return SquireSepulchre.a(regionPoint5);
        };
        this.entry = enumC0009j;
    }

    private static boolean lIIIlIlIIlIIllI(int i, int i2) {
        return i < i2;
    }

    public void b(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.dartArea.get()));
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.dartDestination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    public static EnumC0008i[] values() {
        return (EnumC0008i[]) $VALUES.clone();
    }

    private EnumC0008i(String str, int i, List list, RegionPoint regionPoint, RegionPoint regionPoint2, RegionPoint regionPoint3, int i2, int i3, RegionPoint regionPoint4, EnumC0010k enumC0010k, EnumC0009j enumC0009j) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (lIIIlIlIIIlllIl(it.hasNext() ? 1 : 0)) {
                Triple triple = (Triple) it.next();
                arrayList.add(new WorldArea(SquireSepulchre.a((RegionPoint) triple.getFirst()), ((Integer) triple.getSecond()).intValue(), ((Integer) triple.getThird()).intValue()));
                "".length();
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            return arrayList;
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint);
        };
        this.startDestination = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.type = enumC0010k;
        this.dartArea = () -> {
            return new WorldArea(SquireSepulchre.a(regionPoint3), i2, i3);
        };
        this.dartDestination = () -> {
            return SquireSepulchre.a(regionPoint4);
        };
        this.entry = enumC0009j;
    }

    private static boolean lIIIlIlIIlIIIll(int i, int i2) {
        return i != i2;
    }

    private static String lIIIlIIllllIlII(String lllllllllllllllIIllIlIIllIllllll, String lllllllllllllllIIllIlIIllIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIllIlllllI.getBytes(StandardCharsets.UTF_8)), lllIIlIllIlI[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlIllIlI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIIlllIIIIII) {
            lllllllllllllllIIllIlIIlllIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIlIIIlllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    public Supplier<WorldPoint> Q() {
        return this.dartDestination;
    }

    private static void lIIIlIlIIIllIll() {
        lllIIlIllIlI = new int[63];
        lllIIlIllIlI[0] = ((((106 + 149) - 181) + 151) ^ (((154 + 42) - 150) + 138)) & (((72 ^ 33) ^ (102 ^ 86)) ^ (-" ".length()));
        lllIIlIllIlI[1] = " ".length();
        lllIIlIllIlI[2] = 161 ^ 165;
        lllIIlIllIlI[3] = 81 ^ 69;
        lllIIlIllIlI[4] = 3 ^ 15;
        lllIIlIllIlI[5] = "  ".length();
        lllIIlIllIlI[6] = "   ".length();
        lllIIlIllIlI[7] = -" ".length();
        lllIIlIllIlI[8] = (67 ^ 99) ^ (148 ^ 177);
        lllIIlIllIlI[9] = (75 ^ 21) ^ (222 ^ 134);
        lllIIlIllIlI[10] = 164 ^ 163;
        lllIIlIllIlI[11] = 155 ^ 147;
        lllIIlIllIlI[12] = (109 ^ 57) ^ (217 ^ 132);
        lllIIlIllIlI[13] = 40 ^ 34;
        lllIIlIllIlI[14] = (225 ^ 169) ^ (239 ^ 172);
        lllIIlIllIlI[15] = 45 ^ 32;
        lllIIlIllIlI[16] = 160 ^ 174;
        lllIIlIllIlI[17] = 107 ^ 121;
        lllIIlIllIlI[18] = 105 ^ 102;
        lllIIlIllIlI[19] = 154 ^ 138;
        lllIIlIllIlI[20] = 38 ^ 55;
        lllIIlIllIlI[21] = 1 ^ 18;
        lllIIlIllIlI[22] = 82 ^ 104;
        lllIIlIllIlI[23] = (206 ^ 155) ^ (199 ^ 133);
        lllIIlIllIlI[24] = 118 ^ 106;
        lllIIlIllIlI[25] = 127 ^ 64;
        lllIIlIllIlI[26] = (((84 + 99) - 23) + 28) ^ (((83 + 80) - 139) + 137);
        lllIIlIllIlI[27] = (78 ^ 48) ^ (217 ^ 189);
        lllIIlIllIlI[28] = 54 ^ 31;
        lllIIlIllIlI[29] = (90 ^ 81) ^ (77 ^ 122);
        lllIIlIllIlI[30] = (((73 + 174) - 200) + 138) ^ (((50 + 47) - (-24)) + 11);
        lllIIlIllIlI[31] = 78 ^ 102;
        lllIIlIllIlI[32] = (-4) & 8799;
        lllIIlIllIlI[33] = 136 ^ 188;
        lllIIlIllIlI[34] = 163 ^ 144;
        lllIIlIllIlI[35] = 241 ^ 192;
        lllIIlIllIlI[36] = "  ".length() ^ (134 ^ 145);
        lllIIlIllIlI[37] = (225 ^ 144) ^ (68 ^ 42);
        lllIIlIllIlI[38] = (75 ^ 115) ^ (176 ^ 158);
        lllIIlIllIlI[39] = 55 ^ 41;
        lllIIlIllIlI[40] = 45 ^ 53;
        lllIIlIllIlI[41] = (((5 + 117) - (-2)) + 14) ^ (((2 + 125) - 102) + 154);
        lllIIlIllIlI[42] = 86 ^ 79;
        lllIIlIllIlI[43] = (((122 + 24) - 110) + 105) ^ (((40 + 86) - 54) + 110);
        lllIIlIllIlI[44] = (44 ^ 30) ^ (54 ^ 47);
        lllIIlIllIlI[45] = (102 ^ 4) ^ (223 ^ 151);
        lllIIlIllIlI[46] = 58 ^ 2;
        lllIIlIllIlI[47] = 225 ^ 195;
        lllIIlIllIlI[48] = 159 ^ 170;
        lllIIlIllIlI[49] = 69 ^ 94;
        lllIIlIllIlI[50] = 225 ^ 194;
        lllIIlIllIlI[51] = (81 ^ 77) ^ (170 ^ 146);
        lllIIlIllIlI[52] = 164 ^ 130;
        lllIIlIllIlI[53] = (((125 + 143) - 138) + 105) ^ (((183 + 165) - 314) + 162);
        lllIIlIllIlI[54] = 20 ^ 36;
        lllIIlIllIlI[55] = 38 ^ 11;
        lllIIlIllIlI[56] = (103 ^ 36) ^ (232 ^ 133);
        lllIIlIllIlI[57] = (((21 + 71) - (-32)) + 33) ^ (((41 + 160) - 87) + 57);
        lllIIlIllIlI[58] = (233 ^ 173) ^ (68 ^ 44);
        lllIIlIllIlI[59] = 52 ^ 20;
        lllIIlIllIlI[60] = 147 ^ 164;
        lllIIlIllIlI[61] = 106 ^ 79;
        lllIIlIllIlI[62] = 99 ^ 66;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.startDestination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    public boolean c(Locatable locatable) {
        return this.dartArea.get().contains(locatable);
    }

    private static boolean lIIIlIlIIlIlIII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    public boolean a(C0003d c0003d, SquireSepulchre squireSepulchre) {
        Player local = Players.getLocal();
        if (lIIIlIlIIIlllII(local)) {
            return lllIIlIllIlI[0];
        }
        if (lIIIlIlIIIlllIl(b((Locatable) local) ? 1 : 0)) {
            a(squireSepulchre);
            if (lIIIlIlIIIlllIl(b(c0003d) ? 1 : 0)) {
                Movement.setDestination(this.startDestination.get());
                return lllIIlIllIlI[1];
            }
            Movement.setDestination(this.startPoint.get());
            return lllIIlIllIlI[1];
        } else if (lIIIlIlIIIlllIl(c(local) ? 1 : 0)) {
            b(squireSepulchre);
            System.out.println(lllIIlIIIlIl[lllIIlIllIlI[0]]);
            O();
            "".length();
            return lllIIlIllIlI[1];
        } else {
            return lllIIlIllIlI[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v127, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    public boolean b(C0003d c0003d) {
        Player local = Players.getLocal();
        if (!lIIIlIlIIIlllII(local) && !lIIIlIlIIIllllI(local.getWorldLocation().equals(this.startPoint.get()) ? 1 : 0)) {
            if (lIIIlIlIIIlllll(this.type, EnumC0010k.SOUTH_BLADE)) {
                String[] strArr = new String[lllIIlIllIlI[1]];
                strArr[lllIIlIllIlI[0]] = lllIIlIIIlIl[lllIIlIllIlI[1]];
                TileObject nearest = TileObjects.getNearest(strArr);
                if (lIIIlIlIIIlllII(nearest)) {
                    return lllIIlIllIlI[0];
                }
                J b = c0003d.b(nearest);
                System.out.println("ID: " + b.aG() + " | ticks: " + b.aF());
                if ((!lIIIlIlIIlIIIII(b.aG(), C0001b.s) || (lIIIlIlIIlIIIIl(b.aF(), lllIIlIllIlI[2]) && lIIIlIlIIlIIIlI(b.aF(), lllIIlIllIlI[3]))) && lIIIlIlIIlIIIll(b.aG(), C0001b.v) && lIIIlIlIIlIIIll(b.aG(), C0001b.t)) {
                    return lllIIlIllIlI[0];
                }
            }
            List<NPC> N = N();
            N.sort(Comparator.comparingInt(npc -> {
                return Math.abs(npc.getWorldX() - local.getWorldX()) + Math.abs(npc.getWorldY() - local.getWorldY());
            }));
            System.out.println("darts: " + String.valueOf(N));
            if (lIIIlIlIIIllllI(N.size())) {
                return lllIIlIllIlI[1];
            }
            NPC npc2 = N.get(lllIIlIllIlI[0]);
            if (lIIIlIlIIlIIlII(npc2)) {
                if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.SOUTH) || lIIIlIlIIIlllll(this.type, EnumC0010k.SOUTH_BLADE)) {
                    return (lIIIlIlIIlIIIII(npc2.getWorldX(), P().get().getWorldX()) && lIIIlIlIIlIIllI(Math.abs(npc2.getWorldY() - local.getWorldY()), lllIIlIllIlI[4])) ? lllIIlIllIlI[0] : lllIIlIllIlI[1];
                } else if (lIIIlIlIIIlllll(this.type, EnumC0010k.WEST)) {
                    return (lIIIlIlIIlIIIII(npc2.getWorldY(), P().get().getWorldY()) && lIIIlIlIIlIIllI(Math.abs(npc2.getWorldX() - local.getWorldX()), lllIIlIllIlI[4])) ? lllIIlIllIlI[0] : lllIIlIllIlI[1];
                } else if (lIIIlIlIIIlllll(this.type, EnumC0010k.EAST)) {
                    System.out.println(lllIIlIIIlIl[lllIIlIllIlI[5]]);
                    return (lIIIlIlIIlIIIII(npc2.getWorldY(), P().get().getWorldY()) && lIIIlIlIIlIIllI(Math.abs(npc2.getWorldX() - local.getWorldX()), lllIIlIllIlI[4])) ? lllIIlIllIlI[0] : lllIIlIllIlI[1];
                } else if (lIIIlIlIIIlllll(this.type, EnumC0010k.NORTH)) {
                    return (lIIIlIlIIlIIIII(npc2.getWorldX(), P().get().getWorldX()) && lIIIlIlIIlIIllI(Math.abs(npc2.getWorldY() - local.getWorldY()), lllIIlIllIlI[4])) ? lllIIlIllIlI[0] : lllIIlIllIlI[1];
                } else {
                    return lllIIlIllIlI[0];
                }
            }
            return lllIIlIllIlI[0];
        }
        return lllIIlIllIlI[0];
    }

    static {
        lIIIlIlIIIllIll();
        lIIIlIlIIIllIlI();
        NORTH_I_I = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[21]], lllIIlIllIlI[0], List.of(new Triple(new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[22], lllIIlIllIlI[5], C0001b.C), Integer.valueOf(lllIIlIllIlI[23]), Integer.valueOf(lllIIlIllIlI[9])), new Triple(new RegionPoint(lllIIlIllIlI[4], lllIIlIllIlI[0], lllIIlIllIlI[5], C0001b.F), Integer.valueOf(lllIIlIllIlI[6]), Integer.valueOf(lllIIlIllIlI[6]))), new RegionPoint(lllIIlIllIlI[24], lllIIlIllIlI[25], lllIIlIllIlI[5], C0001b.C), new RegionPoint(lllIIlIllIlI[26], lllIIlIllIlI[0], lllIIlIllIlI[5], C0001b.F), new RegionPoint(lllIIlIllIlI[27], lllIIlIllIlI[0], lllIIlIllIlI[5], C0001b.F), lllIIlIllIlI[17], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[28], lllIIlIllIlI[29], lllIIlIllIlI[5], C0001b.C), EnumC0010k.EAST, EnumC0009j.SOUTH);
        WEST_I_IV = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[3]], lllIIlIllIlI[1], List.of(new Triple(new RegionPoint(lllIIlIllIlI[30], lllIIlIllIlI[31], lllIIlIllIlI[5], lllIIlIllIlI[32]), Integer.valueOf(lllIIlIllIlI[6]), Integer.valueOf(lllIIlIllIlI[18])), new Triple(new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[33], lllIIlIllIlI[5], C0001b.C), Integer.valueOf(lllIIlIllIlI[12]), Integer.valueOf(lllIIlIllIlI[6]))), new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[33], lllIIlIllIlI[5], C0001b.C), new RegionPoint(lllIIlIllIlI[10], lllIIlIllIlI[34], lllIIlIllIlI[5], C0001b.C), new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[35], lllIIlIllIlI[5], C0001b.C), lllIIlIllIlI[17], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[28], lllIIlIllIlI[5], C0001b.C), EnumC0010k.EAST, EnumC0009j.NORTH);
        SOUTH_I_IV = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[36]], lllIIlIllIlI[5], new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[21], lllIIlIllIlI[5], C0001b.C), lllIIlIllIlI[6], lllIIlIllIlI[2], new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[38], lllIIlIllIlI[5], C0001b.C), new RegionPoint(lllIIlIllIlI[39], lllIIlIllIlI[23], lllIIlIllIlI[5], C0001b.C), new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[23], lllIIlIllIlI[5], C0001b.C), lllIIlIllIlI[16], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[23], lllIIlIllIlI[37], lllIIlIllIlI[5], C0001b.C), EnumC0010k.WEST, EnumC0009j.SOUTH);
        SOUTH_II_I = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[38]], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[38], lllIIlIllIlI[5], C0001b.G), lllIIlIllIlI[6], lllIIlIllIlI[10], new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[38], lllIIlIllIlI[5], C0001b.G), new RegionPoint(lllIIlIllIlI[39], lllIIlIllIlI[36], lllIIlIllIlI[5], C0001b.G), new RegionPoint(lllIIlIllIlI[20], lllIIlIllIlI[21], lllIIlIllIlI[5], C0001b.G), lllIIlIllIlI[20], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[17], lllIIlIllIlI[12], lllIIlIllIlI[5], C0001b.G), EnumC0010k.WEST, EnumC0009j.NORTH);
        SOUTH_II_V = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[23]], lllIIlIllIlI[2], new RegionPoint(lllIIlIllIlI[16], lllIIlIllIlI[20], lllIIlIllIlI[1], C0001b.G), lllIIlIllIlI[6], lllIIlIllIlI[5], new RegionPoint(lllIIlIllIlI[19], lllIIlIllIlI[17], lllIIlIllIlI[1], C0001b.G), new RegionPoint(lllIIlIllIlI[20], lllIIlIllIlI[21], lllIIlIllIlI[1], C0001b.G), new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[21], lllIIlIllIlI[1], C0001b.G), lllIIlIllIlI[26], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[37], lllIIlIllIlI[24], lllIIlIllIlI[1], C0001b.G), EnumC0010k.EAST, EnumC0009j.SOUTH);
        EAST_II_V = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[40]], lllIIlIllIlI[8], List.of(new Triple(new RegionPoint(lllIIlIllIlI[41], lllIIlIllIlI[23], lllIIlIllIlI[5], C0001b.G), Integer.valueOf(lllIIlIllIlI[1]), Integer.valueOf(lllIIlIllIlI[6])), new Triple(new RegionPoint(lllIIlIllIlI[30], lllIIlIllIlI[23], lllIIlIllIlI[5], C0001b.G), Integer.valueOf(lllIIlIllIlI[1]), Integer.valueOf(lllIIlIllIlI[6]))), new RegionPoint(lllIIlIllIlI[41], lllIIlIllIlI[23], lllIIlIllIlI[5], C0001b.G), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[38], lllIIlIllIlI[5], C0001b.G), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[6], lllIIlIllIlI[5], C0001b.G), lllIIlIllIlI[6], lllIIlIllIlI[36], new RegionPoint(lllIIlIllIlI[41], lllIIlIllIlI[2], lllIIlIllIlI[5], C0001b.G), EnumC0010k.SOUTH, EnumC0009j.WEST);
        NORTH_II_II = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[42]], lllIIlIllIlI[9], new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[41], lllIIlIllIlI[5], C0001b.G), lllIIlIllIlI[6], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[23], lllIIlIllIlI[43], lllIIlIllIlI[5], C0001b.G), new RegionPoint(lllIIlIllIlI[40], lllIIlIllIlI[29], lllIIlIllIlI[5], C0001b.G), new RegionPoint(lllIIlIllIlI[3], lllIIlIllIlI[29], lllIIlIllIlI[5], C0001b.G), lllIIlIllIlI[4], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[26], lllIIlIllIlI[1], lllIIlIllIlI[5], C0001b.H), EnumC0010k.EAST, EnumC0009j.SOUTH);
        EAST_III_IV = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[27]], lllIIlIllIlI[10], new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[44], lllIIlIllIlI[5], C0001b.J), lllIIlIllIlI[14], lllIIlIllIlI[4], new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[44], lllIIlIllIlI[5], C0001b.J), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[45], lllIIlIllIlI[5], C0001b.J), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[16], lllIIlIllIlI[5], C0001b.J), lllIIlIllIlI[6], lllIIlIllIlI[47], new RegionPoint(lllIIlIllIlI[48], lllIIlIllIlI[19], lllIIlIllIlI[5], C0001b.J), EnumC0010k.SOUTH, EnumC0009j.EAST);
        WEST_III_I = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[49]], lllIIlIllIlI[11], new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[37], lllIIlIllIlI[5], C0001b.J), lllIIlIllIlI[11], lllIIlIllIlI[2], new RegionPoint(lllIIlIllIlI[36], lllIIlIllIlI[47], lllIIlIllIlI[5], C0001b.J), new RegionPoint(lllIIlIllIlI[3], lllIIlIllIlI[50], lllIIlIllIlI[5], C0001b.J), new RegionPoint(lllIIlIllIlI[14], lllIIlIllIlI[50], lllIIlIllIlI[5], C0001b.J), lllIIlIllIlI[15], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[15], lllIIlIllIlI[31], lllIIlIllIlI[5], C0001b.J), EnumC0010k.WEST, EnumC0009j.SOUTH);
        WEST_III_V = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[24]], lllIIlIllIlI[12], new RegionPoint(lllIIlIllIlI[2], lllIIlIllIlI[51], lllIIlIllIlI[5], C0001b.J), lllIIlIllIlI[5], lllIIlIllIlI[13], new RegionPoint(lllIIlIllIlI[2], lllIIlIllIlI[51], lllIIlIllIlI[5], C0001b.J), new RegionPoint(lllIIlIllIlI[6], lllIIlIllIlI[50], lllIIlIllIlI[5], C0001b.J), new RegionPoint(lllIIlIllIlI[1], lllIIlIllIlI[36], lllIIlIllIlI[5], C0001b.J), lllIIlIllIlI[6], lllIIlIllIlI[17], new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[23], lllIIlIllIlI[5], C0001b.J), EnumC0010k.SOUTH, EnumC0009j.EAST);
        SOUTH_IV_VI = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[26]], lllIIlIllIlI[13], new RegionPoint(lllIIlIllIlI[38], lllIIlIllIlI[41], lllIIlIllIlI[5], C0001b.M), lllIIlIllIlI[6], lllIIlIllIlI[10], new RegionPoint(lllIIlIllIlI[40], lllIIlIllIlI[25], lllIIlIllIlI[5], C0001b.M), new RegionPoint(lllIIlIllIlI[42], lllIIlIllIlI[0], lllIIlIllIlI[5], C0001b.L), new RegionPoint(lllIIlIllIlI[38], lllIIlIllIlI[0], lllIIlIllIlI[5], C0001b.L), lllIIlIllIlI[52], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[12], lllIIlIllIlI[5], C0001b.L), EnumC0010k.EAST, EnumC0009j.SOUTH);
        NORTH_IV_V = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[39]], lllIIlIllIlI[14], new RegionPoint(lllIIlIllIlI[13], lllIIlIllIlI[22], lllIIlIllIlI[5], C0001b.L), lllIIlIllIlI[6], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[4], lllIIlIllIlI[29], lllIIlIllIlI[5], C0001b.L), new RegionPoint(lllIIlIllIlI[15], lllIIlIllIlI[30], lllIIlIllIlI[5], C0001b.L), new RegionPoint(lllIIlIllIlI[10], lllIIlIllIlI[30], lllIIlIllIlI[5], C0001b.L), lllIIlIllIlI[44], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[53], lllIIlIllIlI[29], lllIIlIllIlI[5], C0001b.L), EnumC0010k.EAST, EnumC0009j.SOUTH);
        NORTH_IV_IX = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[37]], lllIIlIllIlI[4], new RegionPoint(lllIIlIllIlI[16], lllIIlIllIlI[54], lllIIlIllIlI[5], C0001b.L), lllIIlIllIlI[12], lllIIlIllIlI[11], new RegionPoint(lllIIlIllIlI[19], lllIIlIllIlI[54], lllIIlIllIlI[5], C0001b.L), new RegionPoint(lllIIlIllIlI[20], lllIIlIllIlI[53], lllIIlIllIlI[5], C0001b.L), new RegionPoint(lllIIlIllIlI[16], lllIIlIllIlI[55], lllIIlIllIlI[5], C0001b.L), lllIIlIllIlI[56], lllIIlIllIlI[6], new RegionPoint(lllIIlIllIlI[57], lllIIlIllIlI[58], lllIIlIllIlI[5], C0001b.L), EnumC0010k.EAST, EnumC0009j.NORTH);
        EAST_IV_I = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[59]], lllIIlIllIlI[15], new RegionPoint(lllIIlIllIlI[45], lllIIlIllIlI[59], lllIIlIllIlI[1], C0001b.L), lllIIlIllIlI[16], lllIIlIllIlI[12], new RegionPoint(lllIIlIllIlI[60], lllIIlIllIlI[61], lllIIlIllIlI[1], C0001b.L), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[51], lllIIlIllIlI[1], C0001b.L), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[40], lllIIlIllIlI[1], C0001b.L), lllIIlIllIlI[6], lllIIlIllIlI[17], new RegionPoint(lllIIlIllIlI[3], lllIIlIllIlI[23], lllIIlIllIlI[1], C0001b.L), EnumC0010k.SOUTH_BLADE, EnumC0009j.WEST);
        EAST_IV_III = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[62]], lllIIlIllIlI[16], new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0]), lllIIlIllIlI[1], lllIIlIllIlI[1], new RegionPoint(lllIIlIllIlI[60], lllIIlIllIlI[61], lllIIlIllIlI[1], C0001b.L), new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0], lllIIlIllIlI[0]), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[5], lllIIlIllIlI[1], C0001b.L), lllIIlIllIlI[6], lllIIlIllIlI[17], new RegionPoint(lllIIlIllIlI[48], lllIIlIllIlI[10], lllIIlIllIlI[1], C0001b.L), EnumC0010k.SOUTH, EnumC0009j.WEST);
        WEST_IV_V = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[47]], lllIIlIllIlI[18], new RegionPoint(lllIIlIllIlI[6], lllIIlIllIlI[59], lllIIlIllIlI[1], C0001b.L), lllIIlIllIlI[8], lllIIlIllIlI[16], new RegionPoint(lllIIlIllIlI[10], lllIIlIllIlI[59], lllIIlIllIlI[1], C0001b.L), new RegionPoint(lllIIlIllIlI[11], lllIIlIllIlI[37], lllIIlIllIlI[0], C0001b.L), new RegionPoint(lllIIlIllIlI[11], lllIIlIllIlI[8], lllIIlIllIlI[1], C0001b.L), lllIIlIllIlI[6], lllIIlIllIlI[37], new RegionPoint(lllIIlIllIlI[18], lllIIlIllIlI[10], lllIIlIllIlI[1], C0001b.L), EnumC0010k.SOUTH, EnumC0009j.WEST);
        MIDDLE_V_I = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[50]], lllIIlIllIlI[19], new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[5], lllIIlIllIlI[1], C0001b.N), lllIIlIllIlI[13], lllIIlIllIlI[14], new RegionPoint(lllIIlIllIlI[9], lllIIlIllIlI[10], lllIIlIllIlI[1], C0001b.N), new RegionPoint(lllIIlIllIlI[8], lllIIlIllIlI[11], lllIIlIllIlI[0], C0001b.N), new RegionPoint(lllIIlIllIlI[6], lllIIlIllIlI[8], lllIIlIllIlI[1], C0001b.N), lllIIlIllIlI[6], lllIIlIllIlI[59], new RegionPoint(lllIIlIllIlI[0], lllIIlIllIlI[47], lllIIlIllIlI[1], C0001b.N), EnumC0010k.NORTH, EnumC0009j.EAST);
        BOTTOM_V_I = new EnumC0008i(lllIIlIIIlIl[lllIIlIllIlI[51]], lllIIlIllIlI[20], new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[0], lllIIlIllIlI[0], C0001b.N), lllIIlIllIlI[13], lllIIlIllIlI[14], new RegionPoint(lllIIlIllIlI[43], lllIIlIllIlI[2], lllIIlIllIlI[0], C0001b.N), new RegionPoint(lllIIlIllIlI[22], lllIIlIllIlI[8], lllIIlIllIlI[0], C0001b.N), new RegionPoint(lllIIlIllIlI[46], lllIIlIllIlI[5], lllIIlIllIlI[0], C0001b.N), lllIIlIllIlI[6], lllIIlIllIlI[58], new RegionPoint(lllIIlIllIlI[30], lllIIlIllIlI[28], lllIIlIllIlI[0], C0001b.N), EnumC0010k.NORTH, EnumC0009j.EAST);
        EnumC0008i[] enumC0008iArr = new EnumC0008i[lllIIlIllIlI[17]];
        enumC0008iArr[lllIIlIllIlI[0]] = NORTH_I_I;
        enumC0008iArr[lllIIlIllIlI[1]] = WEST_I_IV;
        enumC0008iArr[lllIIlIllIlI[5]] = SOUTH_I_IV;
        enumC0008iArr[lllIIlIllIlI[6]] = SOUTH_II_I;
        enumC0008iArr[lllIIlIllIlI[2]] = SOUTH_II_V;
        enumC0008iArr[lllIIlIllIlI[8]] = EAST_II_V;
        enumC0008iArr[lllIIlIllIlI[9]] = NORTH_II_II;
        enumC0008iArr[lllIIlIllIlI[10]] = EAST_III_IV;
        enumC0008iArr[lllIIlIllIlI[11]] = WEST_III_I;
        enumC0008iArr[lllIIlIllIlI[12]] = WEST_III_V;
        enumC0008iArr[lllIIlIllIlI[13]] = SOUTH_IV_VI;
        enumC0008iArr[lllIIlIllIlI[14]] = NORTH_IV_V;
        enumC0008iArr[lllIIlIllIlI[4]] = NORTH_IV_IX;
        enumC0008iArr[lllIIlIllIlI[15]] = EAST_IV_I;
        enumC0008iArr[lllIIlIllIlI[16]] = EAST_IV_III;
        enumC0008iArr[lllIIlIllIlI[18]] = WEST_IV_V;
        enumC0008iArr[lllIIlIllIlI[19]] = MIDDLE_V_I;
        enumC0008iArr[lllIIlIllIlI[20]] = BOTTOM_V_I;
        $VALUES = enumC0008iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean b(Locatable locatable) {
        for (WorldArea worldArea : this.startAreas.get()) {
            if (lIIIlIlIIIlllIl(worldArea.contains(locatable) ? 1 : 0)) {
                return lllIIlIllIlI[1];
            }
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIIlIllIlI[0];
    }

    private static boolean lIIIlIlIIlIIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIIlIlIIlIIIlI(int i, int i2) {
        return i <= i2;
    }

    public Supplier<WorldPoint> P() {
        return this.startDestination;
    }

    private List<TileObject> M() {
        Player local = Players.getLocal();
        if (lIIIlIlIIIlllII(local)) {
            return null;
        }
        if (!lIIIlIlIIlIIlIl(this.type, EnumC0010k.SOUTH) || lIIIlIlIIIlllll(this.type, EnumC0010k.SOUTH_BLADE)) {
            return TileObjects.getAll(tileObject -> {
                if (lIIIlIlIIlIIllI(local.getWorldY() - tileObject.getWorldY(), lllIIlIllIlI[17]) && lIIIlIlIIlIIllI(Math.abs(local.getWorldX() - tileObject.getWorldX()), lllIIlIllIlI[6]) && lIIIlIlIIlIIIII(local.getPlane(), tileObject.getPlane()) && lIIIlIlIIIlllIl(tileObject.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[17]]) ? 1 : 0)) {
                    ?? r0 = lllIIlIllIlI[1];
                    "".length();
                    return ((((29 + 90) - 111) + 136) ^ (((97 + 116) - 199) + 134)) == 0 ? ((((48 + 127) - 126) + 170) ^ (((158 + 141) - 151) + 50)) & (((69 ^ 84) ^ (42 ^ 38)) ^ (-" ".length())) : r0;
                }
                return lllIIlIllIlI[0];
            });
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.WEST)) {
            return TileObjects.getAll(tileObject2 -> {
                if (lIIIlIlIIlIIllI(local.getWorldX() - tileObject2.getWorldX(), lllIIlIllIlI[17]) && lIIIlIlIIlIIllI(Math.abs(local.getWorldY() - tileObject2.getWorldY()), lllIIlIllIlI[6]) && lIIIlIlIIlIIIII(local.getPlane(), tileObject2.getPlane()) && lIIIlIlIIIlllIl(tileObject2.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[20]]) ? 1 : 0)) {
                    ?? r0 = lllIIlIllIlI[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIlIllIlI[0];
            });
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.EAST)) {
            return TileObjects.getAll(tileObject3 -> {
                if (lIIIlIlIIlIIllI(tileObject3.getWorldX() - local.getWorldX(), lllIIlIllIlI[17]) && lIIIlIlIIlIIllI(Math.abs(local.getWorldY() - tileObject3.getWorldY()), lllIIlIllIlI[6]) && lIIIlIlIIlIIIII(local.getPlane(), tileObject3.getPlane()) && lIIIlIlIIIlllIl(tileObject3.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[19]]) ? 1 : 0)) {
                    ?? r0 = lllIIlIllIlI[1];
                    "".length();
                    return ((214 ^ 192) ^ (17 ^ 3)) < ((106 ^ 111) ^ " ".length()) ? ((88 ^ 25) ^ (244 ^ 140)) & (((84 ^ 65) ^ (103 ^ 75)) ^ (-" ".length())) : r0;
                }
                return lllIIlIllIlI[0];
            });
        }
        if (lIIIlIlIIIlllll(this.type, EnumC0010k.NORTH)) {
            return TileObjects.getAll(tileObject4 -> {
                if (lIIIlIlIIlIIllI(tileObject4.getWorldY() - local.getWorldY(), lllIIlIllIlI[17]) && lIIIlIlIIlIIllI(Math.abs(local.getWorldX() - tileObject4.getWorldX()), lllIIlIllIlI[6]) && lIIIlIlIIlIIIII(local.getPlane(), tileObject4.getPlane()) && lIIIlIlIIIlllIl(tileObject4.getName().equals(lllIIlIIIlIl[lllIIlIllIlI[18]]) ? 1 : 0)) {
                    ?? r0 = lllIIlIllIlI[1];
                    "".length();
                    return (((248 ^ 145) ^ (178 ^ 142)) & (((52 ^ 24) ^ (248 ^ 129)) ^ (-" ".length()))) != 0 ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
                }
                return lllIIlIllIlI[0];
            });
        }
        return null;
    }

    public static EnumC0008i valueOf(String str) {
        return (EnumC0008i) Enum.valueOf(EnumC0008i.class, str);
    }

    private List<WorldPoint> d(List<WorldPoint> list) {
        List<WorldPoint> aC = I.aC();
        ArrayList arrayList = new ArrayList();
        int i = lllIIlIllIlI[0];
        while (lIIIlIlIIlIIllI(i, list.size())) {
            WorldPoint worldPoint = list.get(i);
            if (lIIIlIlIIIlllII(worldPoint)) {
                System.out.println(lllIIlIIIlIl[lllIIlIllIlI[2]]);
                "".length();
                if ((-" ".length()) > 0) {
                    return null;
                }
            } else {
                if (lIIIlIlIIIlllIl(aC.contains(worldPoint) ? 1 : 0)) {
                    if (lIIIlIlIIIlllll(EnumC0010k.NORTH, this.type)) {
                        arrayList.add(worldPoint.dy(lllIIlIllIlI[7]));
                        "".length();
                        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[8]]);
                        "".length();
                        if (" ".length() < 0) {
                            return null;
                        }
                    } else if (lIIIlIlIIIlllll(EnumC0010k.SOUTH, this.type)) {
                        arrayList.add(worldPoint.dy(lllIIlIllIlI[1]));
                        "".length();
                        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[9]]);
                        "".length();
                        if (" ".length() < 0) {
                            return null;
                        }
                    } else if (lIIIlIlIIIlllll(EnumC0010k.EAST, this.type)) {
                        arrayList.add(worldPoint.dx(lllIIlIllIlI[7]));
                        "".length();
                        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[10]]);
                        "".length();
                        if ((-" ".length()) > 0) {
                            return null;
                        }
                    } else if (lIIIlIlIIIlllll(EnumC0010k.WEST, this.type)) {
                        arrayList.add(worldPoint.dx(lllIIlIllIlI[1]));
                        "".length();
                        System.out.println(lllIIlIIIlIl[lllIIlIllIlI[11]]);
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return null;
                        }
                    }
                }
                arrayList.add(worldPoint);
                "".length();
            }
            i++;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        System.out.println("result lengtH: " + arrayList.size() + " | " + String.valueOf(arrayList));
        return arrayList;
    }

    private static boolean lIIIlIlIIlIIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlIlIIIllllI(int i) {
        return i == 0;
    }
}
