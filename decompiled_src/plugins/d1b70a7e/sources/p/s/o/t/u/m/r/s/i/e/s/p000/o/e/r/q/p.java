package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Depositing fish into cannon", priority = 15, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.p  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/p.class */
public class p extends o {
    private static /* synthetic */ String[] lIIlllIIIIllI;
    private static /* synthetic */ int[] lIIlllIIIlIIl;

    @Inject
    protected p(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIlIIlIlIll(int i) {
        return i != 0;
    }

    private static String lIllIIlIIIllIlI(String llllllllllllllIlllIllIIIlllllIIl, String llllllllllllllIlllIllIIIlllllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIIlIIl[2], llllllllllllllIlllIllIIIllllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIIlllllIlI) {
            llllllllllllllIlllIllIIIlllllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlIlllI(int i, int i2) {
        return i < i2;
    }

    private static String lIllIIlIIIllllI(String llllllllllllllIlllIllIIlIIIIIllI, String llllllllllllllIlllIllIIlIIIIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIlllIIIlIIl[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIIlIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIlIIIIIlll) {
            llllllllllllllIlllIllIIlIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIIlIllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        if (!lIllIIlIIlIlIll(this.as.solo() ? 1 : 0)) {
            if (lIllIIlIIlIllIl(this.ar.L() ? 1 : 0)) {
                ?? r0 = lIIlllIIIlIIl[0];
                "".length();
                return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlllIIIlIIl[3];
        }
        if (!lIllIIlIIlIllII(this.ar.E(), lIIlllIIIlIIl[0]) || ((lIllIIlIIlIllIl(NPCs.getAll(npc -> {
            if (lIllIIlIIllIIlI(npc.getId(), lIIlllIIIlIIl[9])) {
                String[] strArr = new String[lIIlllIIIlIIl[0]];
                strArr[lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[16]];
                if (lIllIIlIIlIlIll(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r02 = lIIlllIIIlIIl[0];
                    "".length();
                    return (-(80 ^ 85)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
            return lIIlllIIIlIIl[3];
        }).size()) && !lIllIIlIIlIlIll(this.ar.I() ? 1 : 0)) || !lIllIIlIIlIlllI(this.au.b(), lIIlllIIIlIIl[1]) || lIllIIlIIlIllIl(this.au.b()))) {
            int[] iArr = new int[lIIlllIIIlIIl[2]];
            iArr[lIIlllIIIlIIl[3]] = lIIlllIIIlIIl[4];
            iArr[lIIlllIIIlIIl[0]] = lIIlllIIIlIIl[5];
            if (lIllIIlIIlIlIll(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r02 = lIIlllIIIlIIl[0];
                "".length();
                return (((136 ^ 141) ^ (64 ^ 6)) & (((253 ^ 174) ^ (140 ^ 156)) ^ (-" ".length()))) < 0 ? ((((73 + 87) - 137) + 125) ^ (((2 + 72) - (-46)) + 70)) & (((95 ^ 25) ^ (96 ^ 12)) ^ (-" ".length())) : r02;
            }
        }
        return lIIlllIIIlIIl[3];
    }

    private static String lIllIIlIIlIIIII(String llllllllllllllIlllIllIIIlllIlIIl, String llllllllllllllIlllIllIIIlllIlIII) {
        String llllllllllllllIlllIllIIIlllIlIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIllIIIlllIIllI = llllllllllllllIlllIllIIIlllIlIII.toCharArray();
        int llllllllllllllIlllIllIIIlllIIlIl = lIIlllIIIlIIl[3];
        char[] charArray = llllllllllllllIlllIllIIIlllIlIIl2.toCharArray();
        int llllllllllllllIlllIllIIIllIllllI = charArray.length;
        int i = lIIlllIIIlIIl[3];
        while (lIllIIlIIlIlllI(i, llllllllllllllIlllIllIIIllIllllI)) {
            char llllllllllllllIlllIllIIIlllIlIlI = charArray[i];
            sb.append((char) (llllllllllllllIlllIllIIIlllIlIlI ^ llllllllllllllIlllIllIIIlllIIllI[llllllllllllllIlllIllIIIlllIIlIl % llllllllllllllIlllIllIIIlllIIllI.length]));
            "".length();
            llllllllllllllIlllIllIIIlllIIlIl++;
            i++;
            "".length();
            if (((((117 + 46) - 66) + 34) ^ (((23 + 5) - (-64)) + 42)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIlIIllIIII(int i, int i2) {
        return i <= i2;
    }

    private static void lIllIIlIIlIIIIl() {
        lIIlllIIIIllI = new String[lIIlllIIIlIIl[17]];
        lIIlllIIIIllI[lIIlllIIIlIIl[3]] = lIllIIlIIIllIlI("QNt1oC1oBz7JY3Faf2ECS3fjBox7mGdqWyh7duX+xdE=", "AvwqO");
        lIIlllIIIIllI[lIIlllIIIlIIl[0]] = lIllIIlIIIllIlI("pbX8cn2bom8=", "XIjPC");
        lIIlllIIIIllI[lIIlllIIIlIIl[2]] = lIllIIlIIIllllI("rMJxYkDCYxI=", "LWboX");
        lIIlllIIIIllI[lIIlllIIIlIIl[10]] = lIllIIlIIIllIlI("kvOPzMhGFeY=", "xzzIK");
        lIIlllIIIIllI[lIIlllIIIlIIl[11]] = lIllIIlIIIllllI("OTRItLH4Va0=", "lBcMD");
        lIIlllIIIIllI[lIIlllIIIlIIl[13]] = lIllIIlIIlIIIII("ICUkIQ9OLCwvCw==", "cMABd");
        lIIlllIIIIllI[lIIlllIIIlIIl[14]] = lIllIIlIIIllIlI("q7s0K5G/iAwIv1HzJCLKXQ==", "MyrGZ");
        lIIlllIIIIllI[lIIlllIIIlIIl[16]] = lIllIIlIIIllllI("LJmCDwVGm5M=", "wYeBs");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.o, p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        WorldPoint dx;
        c N = this.ar.N();
        NPC nearest = NPCs.getNearest(npc -> {
            String[] strArr = new String[lIIlllIIIlIIl[0]];
            strArr[lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[11]];
            if (lIllIIlIIlIlIll(npc.hasAction(strArr) ? 1 : 0) && lIllIIlIIllIIII(npc.getWorldLocation().distanceTo(N.Z()), lIIlllIIIlIIl[12])) {
                String[] strArr2 = new String[lIIlllIIIlIIl[0]];
                strArr2[lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[13]];
                if (lIllIIlIIlIlIll(npc.hasAction(strArr2) ? 1 : 0) && ((lIllIIlIIlIlIll(N.aj() ? 1 : 0) && !lIllIIlIIlIllIl(this.au.c(npc.getWorldLocation().dx(lIIlllIIIlIIl[8])) ? 1 : 0)) || (lIllIIlIIlIllIl(N.aj() ? 1 : 0) && lIllIIlIIlIlIll(this.au.c(npc.getWorldLocation().dx(lIIlllIIIlIIl[0])) ? 1 : 0)))) {
                    WorldPoint worldLocation = npc.getWorldLocation();
                    String[] strArr3 = new String[lIIlllIIIlIIl[0]];
                    strArr3[lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[14]];
                    NPC nearest2 = NPCs.getNearest(worldLocation, strArr3);
                    if (!lIllIIlIIllIIIl(nearest2) || lIllIIlIIlIllII(nearest2.getAnimation(), lIIlllIIIlIIl[15])) {
                        ?? r0 = lIIlllIIIlIIl[0];
                        "".length();
                        return " ".length() != " ".length() ? ((152 ^ 167) ^ (141 ^ 181)) & (((((140 + 15) - 110) + 131) ^ (((150 + 70) - 42) + 5)) ^ (-" ".length())) : r0;
                    }
                    return lIIlllIIIlIIl[3];
                }
            }
            return lIIlllIIIlIIl[3];
        });
        if (lIllIIlIIlIllll(nearest)) {
            System.out.println(lIIlllIIIIllI[lIIlllIIIlIIl[3]]);
            return lIIlllIIIlIIl[3];
        } else if (lIllIIlIIlIlIll(this.au.a(N.ai()) ? 1 : 0)) {
            return this.au.e(N.ai());
        } else {
            Player local = Players.getLocal();
            if (lIllIIlIIlIlIll(nearest.equals(local.getInteracting()) ? 1 : 0)) {
                if (lIllIIlIIllIIII(this.au.a(), lIIlllIIIlIIl[6])) {
                    NPC nearest2 = NPCs.getNearest(npc2 -> {
                        if (lIllIIlIIlIllII(npc2.getId(), lIIlllIIIlIIl[7])) {
                            if (lIllIIlIIllIIlI(npc2.getId(), lIIlllIIIlIIl[9])) {
                                String[] strArr = new String[lIIlllIIIlIIl[0]];
                                strArr[lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[10]];
                            }
                            return lIIlllIIIlIIl[3];
                        }
                        ?? r0 = lIIlllIIIlIIl[0];
                        "".length();
                        return 0 != 0 ? ((238 ^ 175) ^ (222 ^ 131)) & (((86 ^ 20) ^ (229 ^ 187)) ^ (-" ".length())) : r0;
                    });
                    if (lIllIIlIIlIllIl(Movement.shouldWalk() ? 1 : 0)) {
                        return lIIlllIIIlIIl[3];
                    }
                    if (lIllIIlIIllIIIl(nearest2)) {
                        Movement.walk(local.getWorldLocation());
                        return lIIlllIIIlIIl[0];
                    }
                    int[] iArr = new int[lIIlllIIIlIIl[0]];
                    iArr[lIIlllIIIlIIl[3]] = lIIlllIIIlIIl[7];
                    if (lIllIIlIIllIIIl(TileObjects.getNearest(iArr))) {
                        Movement.walk(local.getWorldLocation());
                        return lIIlllIIIlIIl[0];
                    }
                    return lIIlllIIIlIIl[0];
                }
                return lIIlllIIIlIIl[0];
            }
            if (!lIllIIlIIlIlIll(this.as.solo() ? 1 : 0)) {
                if (lIllIIlIIlIlIll(N.aj() ? 1 : 0)) {
                    dx = nearest.getWorldLocation().dx(lIIlllIIIlIIl[8]);
                    "".length();
                    if (" ".length() <= ("  ".length() & ("  ".length() ^ (-" ".length())))) {
                        return ((200 ^ 158) ^ (125 ^ 52)) & (((((70 + 96) - 159) + 122) ^ (((137 + 135) - 188) + 74)) ^ (-" ".length()));
                    }
                } else {
                    dx = nearest.getWorldLocation().dx(lIIlllIIIlIIl[0]);
                }
                if (lIllIIlIIlIllIl(dx.equals(local.getWorldLocation()) ? 1 : 0)) {
                    return this.au.b(dx);
                }
            } else if (lIllIIlIIlIllIl(N.ai().equals(local.getWorldLocation()) ? 1 : 0)) {
                return this.au.b(N.ai());
            }
            if (lIllIIlIIlIlIll(this.as.solo() ? 1 : 0) && lIllIIlIIllIIII(this.au.a(), this.ar.H())) {
                if (lIllIIlIIllIIIl(NPCs.getNearest(npc3 -> {
                    if (lIllIIlIIllIIlI(npc3.getId(), lIIlllIIIlIIl[9])) {
                        String[] strArr = new String[lIIlllIIIlIIl[0]];
                        strArr[lIIlllIIIlIIl[3]] = lIIlllIIIIllI[lIIlllIIIlIIl[2]];
                        if (lIllIIlIIlIlIll(npc3.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = lIIlllIIIlIIl[0];
                            "".length();
                            return " ".length() < 0 ? ((111 ^ 58) ^ (21 ^ 104)) & (((((39 + 231) - 263) + 232) ^ (((15 + 85) - 98) + 197)) ^ (-" ".length())) : r0;
                        }
                    }
                    return lIIlllIIIlIIl[3];
                }))) {
                    return lIIlllIIIlIIl[0];
                }
                int[] iArr2 = new int[lIIlllIIIlIIl[0]];
                iArr2[lIIlllIIIlIIl[3]] = lIIlllIIIlIIl[7];
                if (lIllIIlIIllIIIl(TileObjects.getNearest(iArr2))) {
                    return lIIlllIIIlIIl[0];
                }
            }
            nearest.interact(lIIlllIIIIllI[lIIlllIIIlIIl[0]]);
            return lIIlllIIIlIIl[0];
        }
    }

    private static boolean lIllIIlIIllIIIl(Object obj) {
        return obj != null;
    }

    static {
        lIllIIlIIlIlIlI();
        lIllIIlIIlIIIIl();
    }

    private static boolean lIllIIlIIlIllIl(int i) {
        return i == 0;
    }

    private static boolean lIllIIlIIlIllII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIIlIIllIIlI(int i, int i2) {
        return i == i2;
    }

    private static void lIllIIlIIlIlIlI() {
        lIIlllIIIlIIl = new int[18];
        lIIlllIIIlIIl[0] = " ".length();
        lIIlllIIIlIIl[1] = 179 ^ 137;
        lIIlllIIIlIIl[2] = "  ".length();
        lIIlllIIIlIIl[3] = ((116 ^ 103) ^ (76 ^ 69)) & (((154 ^ 174) ^ (156 ^ 178)) ^ (-" ".length()));
        lIIlllIIIlIIl[4] = (-5123) & 30687;
        lIIlllIIIlIIl[5] = (-4100) & 29663;
        lIIlllIIIlIIl[6] = (((69 + 3) - 71) + 145) ^ (((131 + 95) - 164) + 78);
        lIIlllIIIlIIl[7] = (-514) & 41519;
        lIIlllIIIlIIl[8] = -" ".length();
        lIIlllIIIlIIl[9] = (-17953) & 26595;
        lIIlllIIIlIIl[10] = "   ".length();
        lIIlllIIIlIIl[11] = (90 ^ 35) ^ (192 ^ 189);
        lIIlllIIIlIIl[12] = (102 ^ 124) ^ (186 ^ 170);
        lIIlllIIIlIIl[13] = (((139 + 43) - 163) + 167) ^ (((175 + 72) - 85) + 29);
        lIIlllIIIlIIl[14] = (129 ^ 171) ^ (13 ^ 33);
        lIIlllIIIlIIl[15] = (-8405) & 15615;
        lIIlllIIIlIIl[16] = 72 ^ 79;
        lIIlllIIIlIIl[17] = 111 ^ 103;
    }
}
