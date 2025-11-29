package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Ice Demon", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bj  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/bj.class */
public class bj extends U {
    private final /* synthetic */ int eo = 29742;
    private /* synthetic */ C0039n al;
    private /* synthetic */ C0039n ak;
    private static /* synthetic */ int[] lIlIIIllIlll;
    private final /* synthetic */ int ep = 7603;
    private final /* synthetic */ int eq = 1324;
    private /* synthetic */ int am;
    private static /* synthetic */ String[] lIlIIIllIllI;

    private static boolean llIlIlllIIIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIlIlllIIIlIl(this.ak.bw, N.ICE_DEMON)) {
            ?? r0 = lIlIIIllIlll[7];
            "".length();
            return "  ".length() < (((((226 + 138) - 174) + 41) ^ (((115 + 20) - 86) + 121)) & (((90 ^ 79) ^ (59 ^ 99)) ^ (-" ".length()))) ? ((((79 + 106) - 72) + 29) ^ (((137 + 56) - 83) + 75)) & (((225 ^ 189) ^ (234 ^ 129)) ^ (-" ".length())) : r0;
        }
        return lIlIIIllIlll[8];
    }

    @Inject
    protected bj(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIIllIlll[0];
        this.eo = lIlIIIllIlll[1];
        this.ep = lIlIIIllIlll[2];
        this.eq = lIlIIIllIlll[3];
    }

    private static boolean llIlIlllIIIIIl(Object obj) {
        return obj != null;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        ArrayList arrayList = new ArrayList();
        NPC nearest = NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIIIllIllI[lIlIIIllIlll[31]]);
        });
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            return npc2.getName().contains(lIlIIIllIllI[lIlIIIllIlll[30]]);
        });
        if (llIlIlllIIIIII(nearest) && llIlIlllIIIIIl(nearest2)) {
            arrayList.addAll(Prayers.getOffensive());
            "".length();
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean ex() {
        if (llIlIlllIIIlII(Inventory.contains(item -> {
            if (llIlIllIllllll(item.getName().contains(lIlIIIllIllI[lIlIIIllIlll[25]]) ? 1 : 0) && llIlIlllIIIlII(item.getName().contains(lIlIIIllIllI[lIlIIIllIlll[26]]) ? 1 : 0) && llIlIlllIIIllI(item.getId(), lIlIIIllIlll[27])) {
                ?? r0 = lIlIIIllIlll[7];
                "".length();
                return 0 != 0 ? ((94 ^ 31) ^ (28 ^ 25)) & (((51 ^ 71) ^ (119 ^ 71)) ^ (-" ".length())) : r0;
            }
            return lIlIIIllIlll[8];
        }) ? 1 : 0)) {
            if (llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                this.co.x();
                "".length();
                return lIlIIIllIlll[7];
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[24]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIIIllIlll[7]];
                    strArr[lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[14]];
                    if (llIlIllIllllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIlIIIllIlll[7];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIlIIIllIlll[8];
            });
            if (llIlIlllIIIIII(nearest)) {
                return lIlIIIllIlll[8];
            }
            nearest.interact(lIlIIIllIllI[lIlIIIllIlll[20]]);
            return lIlIIIllIlll[7];
        }
        String[] strArr = new String[lIlIIIllIlll[7]];
        strArr[lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[21]];
        if (llIlIlllIIIlII(Inventory.contains(strArr) ? 1 : 0)) {
            if (llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                this.co.x();
                "".length();
                return lIlIIIllIlll[7];
            }
            TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                if (llIlIllIllllll(tileObject2.getName().contains(lIlIIIllIllI[lIlIIIllIlll[22]]) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIIIllIlll[7]];
                    strArr2[lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[23]];
                    if (llIlIllIllllll(tileObject2.hasAction(strArr2) ? 1 : 0)) {
                        ?? r0 = lIlIIIllIlll[7];
                        "".length();
                        return " ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIlIIIllIlll[8];
            });
            if (llIlIlllIIIIII(nearest2)) {
                return lIlIIIllIlll[8];
            }
            nearest2.interact(lIlIIIllIllI[lIlIIIllIlll[19]]);
            return lIlIIIllIlll[7];
        }
        return lIlIIIllIlll[8];
    }

    static {
        llIlIllIllllIl();
        llIlIllIllllII();
    }

    private static String llIlIllIlllIlI(String lllllllllllllllIllIlllllIIIIlIlI, String lllllllllllllllIllIlllllIIIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIllIlll[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIllIlll[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllllIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllllIIIIlIll) {
            lllllllllllllllIllIlllllIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static String llIlIllIlllIIl(String lllllllllllllllIllIlllllIIIlIlll, String lllllllllllllllIllIlllllIIIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIllIlllllIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllllIIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlllllIIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlllllIIIllIIl.init(lIlIIIllIlll[9], lllllllllllllllIllIlllllIIIllIlI);
            return new String(lllllllllllllllIllIlllllIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllllIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllllIIIllIII) {
            lllllllllllllllIllIlllllIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlllIIIlII(int i) {
        return i == 0;
    }

    private static boolean llIlIlllIIIIII(Object obj) {
        return obj == null;
    }

    private static void llIlIllIllllII() {
        lIlIIIllIllI = new String[lIlIIIllIlll[37]];
        lIlIIIllIllI[lIlIIIllIlll[8]] = llIlIllIlllIIl("4qLDo9u2whoilSBEPU1GjLqpoIcp5t3l0+ssa6TyQuMolqXVa/tOladwJ9X2JI/qXU1Cc6tVXHY=", "MZsVS");
        lIlIIIllIllI[lIlIIIllIlll[7]] = llIlIllIlllIlI("hI1YSyXY5C5c5Q4etUN9Rw==", "cIkPR");
        lIlIIIllIllI[lIlIIIllIlll[9]] = llIlIllIlllIll("AjUELwso", "CApNh");
        lIlIIIllIllI[lIlIIIllIlll[12]] = llIlIllIlllIll("JjgeJjA=", "jQyND");
        lIlIIIllIllI[lIlIIIllIlll[13]] = llIlIllIlllIll("IBoVMw==", "crzCC");
        lIlIIIllIllI[lIlIIIllIlll[6]] = llIlIllIlllIll("CQUHBCY=", "LksaT");
        lIlIIIllIllI[lIlIIIllIlll[15]] = llIlIllIlllIlI("AEP0YofuZseh8GMlCbAk8jRp6pCeK8vM", "rxbDr");
        lIlIIIllIllI[lIlIIIllIlll[16]] = llIlIllIlllIIl("vY3/GDekR4jZNc5OARVM7Q==", "ztrAA");
        lIlIIIllIllI[lIlIIIllIlll[20]] = llIlIllIlllIll("ES07IA==", "ELPEF");
        lIlIIIllIllI[lIlIIIllIlll[21]] = llIlIllIlllIIl("X8V6J2pUyWVygrPVDQNH7A==", "gCLeq");
        lIlIIIllIllI[lIlIIIllIlll[19]] = llIlIllIlllIll("EC4BPQ==", "DOjXJ");
        lIlIIIllIllI[lIlIIIllIlll[22]] = llIlIllIlllIlI("88fF9JJzW/zpdvQsd3KDSw==", "tUiAZ");
        lIlIIIllIllI[lIlIIIllIlll[23]] = llIlIllIlllIlI("Fs+FXGLWMoQ=", "zSCrm");
        lIlIIIllIllI[lIlIIIllIlll[24]] = llIlIllIlllIIl("lBeobI3NEGE2cf1OH3fG/w==", "KWNyO");
        lIlIIIllIllI[lIlIIIllIlll[14]] = llIlIllIlllIlI("GRjOLA0MV3M=", "NfPwk");
        lIlIIIllIllI[lIlIIIllIlll[25]] = llIlIllIlllIIl("OsbPnNcsgVI=", "CQAdP");
        lIlIIIllIllI[lIlIIIllIlll[26]] = llIlIllIlllIlI("ZYECeKu8+Jk=", "HZTYK");
        lIlIIIllIllI[lIlIIIllIlll[28]] = llIlIllIlllIll("BwUpBzYwAQ==", "WdZtW");
        lIlIIIllIllI[lIlIIIllIlll[29]] = llIlIllIlllIIl("jCzrYnUmBmg=", "YosJY");
        lIlIIIllIllI[lIlIIIllIlll[30]] = llIlIllIlllIIl("TjLYGL1R9+MO+pm2/HLUxw==", "myfEe");
        lIlIIIllIllI[lIlIIIllIlll[31]] = llIlIllIlllIll("GBIIIDk0Hwk=", "QqmFP");
        lIlIIIllIllI[lIlIIIllIlll[32]] = llIlIllIlllIlI("P9yv7ybkzAU=", "HTlsG");
        lIlIIIllIllI[lIlIIIllIlll[33]] = llIlIllIlllIlI("j8afJQrBK/Y=", "gCPlN");
        lIlIIIllIllI[lIlIIIllIlll[34]] = llIlIllIlllIlI("xsX8zuv5qL4=", "DYgAR");
        lIlIIIllIllI[lIlIIIllIlll[35]] = llIlIllIlllIll("DyYkPSI=", "COCUV");
        lIlIIIllIllI[lIlIIIllIlll[36]] = llIlIllIlllIIl("MNAk9DbH94sPJm88DNzfXg==", "nCSyG");
        lIlIIIllIllI[lIlIIIllIlll[11]] = llIlIllIlllIll("OyYfJQsXKx4=", "rEzCb");
    }

    private TileObject cR() {
        return TileObjects.getNearest(tileObject -> {
            if (llIlIllIllllll(tileObject.getName().equals(lIlIIIllIllI[lIlIIIllIlll[28]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIIIllIlll[7]];
                strArr[lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[29]];
                if (llIlIllIllllll(tileObject.hasAction(strArr) ? 1 : 0) && llIlIllIllllll(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                    ?? r0 = lIlIIIllIlll[7];
                    "".length();
                    return (((((135 + 79) - 141) + 67) ^ (((154 + 172) - 152) + 8)) & (((19 ^ 21) ^ (134 ^ 186)) ^ (-" ".length()))) >= " ".length() ? ((((78 + 84) - 144) + 180) ^ (((19 + 144) - 47) + 31)) & (((((64 + 87) - 38) + 36) ^ (((130 + 73) - 196) + 185)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIIIllIlll[8];
        });
    }

    private static boolean llIlIlllIIIllI(int i, int i2) {
        return i != i2;
    }

    private static boolean llIlIllIllllll(int i) {
        return i != 0;
    }

    private static boolean llIlIllIlllllI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    private boolean cS() {
        if (llIlIllIllllll(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            if (llIlIlllIIIIIl(Movement.getDestination()) && llIlIllIllllll(Movement.getDestination().equals(this.al.bt) ? 1 : 0)) {
                return lIlIIIllIlll[8];
            }
            Movement.setDestination(this.al.bs);
            return lIlIIIllIlll[7];
        }
        TileObject cR = cR();
        if (llIlIlllIIIIII(cR)) {
            Movement.setDestination(this.ak.bq.dx(lIlIIIllIlll[14]).dy(lIlIIIllIlll[14]));
            return lIlIIIllIlll[7];
        } else if (!llIlIlllIIIlII(this.bS.isMoving() ? 1 : 0) || llIlIllIllllll(this.bS.isAnimating() ? 1 : 0)) {
            return lIlIIIllIlll[8];
        } else {
            cR.interact(lIlIIIllIllI[lIlIIIllIlll[6]]);
            return lIlIIIllIlll[7];
        }
    }

    private static boolean llIlIlllIIIIll(int i, int i2) {
        return i >= i2;
    }

    private static String llIlIllIlllIll(String lllllllllllllllIllIllllIllllIlIl, String lllllllllllllllIllIllllIlllllIIl) {
        String lllllllllllllllIllIllllIllllIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllllIllllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllllIlllllIII = new StringBuilder();
        char[] lllllllllllllllIllIllllIllllIlll = lllllllllllllllIllIllllIlllllIIl.toCharArray();
        int lllllllllllllllIllIllllIllllIllI = lIlIIIllIlll[8];
        char[] charArray = lllllllllllllllIllIllllIllllIlIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIllIlll[8];
        while (llIlIlllIIIIlI(i, length)) {
            lllllllllllllllIllIllllIlllllIII.append((char) (charArray[i] ^ lllllllllllllllIllIllllIllllIlll[lllllllllllllllIllIllllIllllIllI % lllllllllllllllIllIllllIllllIlll.length]));
            "".length();
            lllllllllllllllIllIllllIllllIllI++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIllllIlllllIII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        NPC nearest = NPCs.getNearest(npc -> {
            return npc.getName().contains(lIlIIIllIllI[lIlIIIllIlll[11]]);
        });
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            return npc2.getName().contains(lIlIIIllIllI[lIlIIIllIlll[36]]);
        });
        int K = (lIlIIIllIlll[4] - this.co.K()) + ((lIlIIIllIlll[5] - Skills.getLevel(Skill.WOODCUTTING)) / lIlIIIllIlll[6]);
        if (llIlIllIlllllI(K) && llIlIllIllllll(ex() ? 1 : 0)) {
            return lIlIIIllIlll[7];
        }
        if (llIlIlllIIIIII(nearest) && llIlIlllIIIIII(nearest2)) {
            return cS();
        }
        if (llIlIlllIIIIIl(nearest2) && llIlIllIllllll(nearest2.isDead() ? 1 : 0)) {
            System.out.println(lIlIIIllIllI[lIlIIIllIlll[8]]);
            this.co.g(lIlIIIllIlll[5]);
        }
        if (llIlIlllIIIIII(nearest)) {
            Projectile nearest3 = Projectiles.getNearest(projectile -> {
                if (llIlIlllIIIlll(projectile.getId(), lIlIIIllIlll[3]) && llIlIllIllllll(this.bS.getWorldLocation().createWorldArea(lIlIIIllIlll[7]).toWorldPointList().contains(WorldPoint.fromLocal(this.cq, projectile.getTarget())) ? 1 : 0)) {
                    ?? r0 = lIlIIIllIlll[7];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIllIlll[8];
            });
            if (!llIlIlllIIIIII(nearest3)) {
                System.out.println(WorldPoint.fromLocal(this.cq, nearest3.getTarget()));
                System.out.println(this.bS.getWorldLocation());
                Movement.setDestination(cX());
                return lIlIIIllIlll[7];
            } else if (llIlIlllIIIIIl(this.bS.getInteracting()) && llIlIllIllllll(this.bS.getInteracting().getName().contains(lIlIIIllIllI[lIlIIIllIlll[7]]) ? 1 : 0)) {
                return lIlIIIllIlll[8];
            } else {
                nearest2.interact(lIlIIIllIllI[lIlIIIllIlll[9]]);
                return lIlIIIllIlll[7];
            }
        }
        if (llIlIllIlllllI(K)) {
            ?? r0 = lIlIIIllIlll[7];
            int[] iArr = new int[lIlIIIllIlll[7]];
            iArr[lIlIIIllIlll[8]] = lIlIIIllIlll[10];
            int lllllllllllllllIllIlllllIlIIllII = Inventory.getCount((boolean) r0, iArr);
            if (!llIlIlllIIIIlI(lllllllllllllllIllIlllllIlIIllII, K) || llIlIlllIIIIll(lllllllllllllllIllIlllllIlIIllII, lIlIIIllIlll[11])) {
                TileObject nearest4 = TileObjects.getNearest(tileObject -> {
                    if (llIlIllIllllll(tileObject.getName().contains(lIlIIIllIllI[lIlIIIllIlll[34]]) ? 1 : 0)) {
                        String[] strArr = new String[lIlIIIllIlll[7]];
                        strArr[lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[35]];
                        if (llIlIllIllllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                            ?? r02 = lIlIIIllIlll[7];
                            "".length();
                            return (-"  ".length()) > 0 ? ((29 ^ 88) ^ (76 ^ 27)) & (((84 ^ 5) ^ (39 ^ 100)) ^ (-" ".length())) : r02;
                        }
                    }
                    return lIlIIIllIlll[8];
                });
                if (llIlIlllIIIIII(nearest4)) {
                    return lIlIIIllIlll[8];
                }
                if (!llIlIlllIIIlII(this.bS.isMoving() ? 1 : 0) || llIlIllIllllll(this.bS.isAnimating() ? 1 : 0)) {
                    return lIlIIIllIlll[8];
                }
                nearest4.interact(lIlIIIllIllI[lIlIIIllIlll[12]]);
                return lIlIIIllIlll[7];
            }
            if (llIlIllIllllll(Inventory.isFull() ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIIllIlll[7]];
                iArr2[lIlIIIllIlll[8]] = lIlIIIllIlll[10];
                if (llIlIlllIIIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                    this.co.x();
                    "".length();
                    return lIlIIIllIlll[7];
                }
            }
            TileObject nearest5 = TileObjects.getNearest(tileObject2 -> {
                if (llIlIllIllllll(tileObject2.getName().contains(lIlIIIllIllI[lIlIIIllIlll[32]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIIIllIlll[7]];
                    strArr[lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[33]];
                    if (llIlIllIllllll(tileObject2.hasAction(strArr) ? 1 : 0)) {
                        ?? r02 = lIlIIIllIlll[7];
                        "".length();
                        return "   ".length() <= "  ".length() ? ((166 ^ 170) ^ (77 ^ 9)) & (((((7 + 31) - 1) + 215) ^ (((23 + 167) - 123) + 113)) ^ (-" ".length())) : r02;
                    }
                }
                return lIlIIIllIlll[8];
            });
            if (llIlIlllIIIIII(nearest5)) {
                return lIlIIIllIlll[8];
            }
            if (!llIlIlllIIIlII(this.bS.isMoving() ? 1 : 0) || llIlIllIllllll(this.bS.isAnimating() ? 1 : 0)) {
                return lIlIIIllIlll[8];
            }
            nearest5.interact(lIlIIIllIllI[lIlIIIllIlll[13]]);
        }
        return lIlIIIllIlll[7];
    }

    private static boolean llIlIlllIIIlll(int i, int i2) {
        return i == i2;
    }

    private WorldPoint cX() {
        System.out.println(lIlIIIllIllI[lIlIIIllIlll[15]]);
        String[] strArr = new String[lIlIIIllIlll[7]];
        strArr[lIlIIIllIlll[8]] = lIlIIIllIllI[lIlIIIllIlll[16]];
        NPC nearest = NPCs.getNearest(strArr);
        List worldPointList = new WorldArea(nearest.getWorldLocation().dx(lIlIIIllIlll[17]).dy(lIlIIIllIlll[17]), lIlIIIllIlll[15], lIlIIIllIlll[15]).toWorldPointList();
        List worldPointList2 = new WorldArea(nearest.getWorldLocation().dx(lIlIIIllIlll[18]).dy(lIlIIIllIlll[18]), lIlIIIllIlll[19], lIlIIIllIlll[19]).toWorldPointList();
        worldPointList2.removeIf(worldPoint -> {
            return worldPointList.contains(worldPoint);
        });
        "".length();
        WorldPoint worldPoint2 = (WorldPoint) worldPointList2.stream().filter(worldPoint3 -> {
            if (llIlIllIllllll(Reachable.isWalkable(worldPoint3) ? 1 : 0) && llIlIlllIIIIIl(Projectiles.getNearest(projectile -> {
                if (llIlIlllIIIlll(projectile.getId(), lIlIIIllIlll[3]) && llIlIlllIIIlII(worldPoint3.createWorldArea(lIlIIIllIlll[7]).contains(WorldPoint.fromLocal(this.cq, projectile.getTarget())) ? 1 : 0)) {
                    ?? r0 = lIlIIIllIlll[7];
                    "".length();
                    return "   ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIllIlll[8];
            }))) {
                ?? r0 = lIlIIIllIlll[7];
                "".length();
                return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIllIlll[8];
        }).min(Comparator.comparingInt(worldPoint4 -> {
            return worldPoint4.distanceTo(this.bS);
        })).orElse(null);
        System.out.println("Safespot: " + String.valueOf(worldPoint2) + " | player: " + String.valueOf(this.bS.getWorldLocation()));
        return worldPoint2;
    }

    private static boolean llIlIlllIIIIlI(int i, int i2) {
        return i < i2;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return C0044s.b(C0044s.e(N.ICE_DEMON));
    }

    private static void llIlIllIllllIl() {
        lIlIIIllIlll = new int[38];
        lIlIIIllIlll[0] = -" ".length();
        lIlIIIllIlll[1] = (-((-9253) & 12134)) & (-129) & 32751;
        lIlIIIllIlll[2] = (-585) & 8187;
        lIlIIIllIlll[3] = (-((-10863) & 14975)) & (-16515) & 21950;
        lIlIIIllIlll[4] = (((2 + 157) - 136) + 158) ^ (((130 + 112) - 121) + 10);
        lIlIIIllIlll[5] = (((157 + 246) - 368) + 217) ^ (((114 + 137) - 114) + 15);
        lIlIIIllIlll[6] = (((0 + 41) - 39) + 138) ^ (((41 + 52) - 17) + 61);
        lIlIIIllIlll[7] = " ".length();
        lIlIIIllIlll[8] = ((((165 + 96) - 188) + 108) ^ (((100 + 17) - (-10)) + 58)) & (((((87 + 57) - 8) + 50) ^ (((169 + 28) - 129) + 114)) ^ (-" ".length()));
        lIlIIIllIlll[9] = "  ".length();
        lIlIIIllIlll[10] = (-3073) & 23871;
        lIlIIIllIlll[11] = 102 ^ 124;
        lIlIIIllIlll[12] = "   ".length();
        lIlIIIllIlll[13] = (((159 + 87) - 196) + 125) ^ (((147 + 49) - 59) + 34);
        lIlIIIllIlll[14] = (((67 + 151) - 183) + 134) ^ (((138 + 56) - 117) + 90);
        lIlIIIllIlll[15] = (((37 + 34) - (-43)) + 69) ^ (((90 + 5) - 86) + 168);
        lIlIIIllIlll[16] = (((93 + 20) - 73) + 101) ^ (((4 + 15) - 18) + 137);
        lIlIIIllIlll[17] = -"  ".length();
        lIlIIIllIlll[18] = -((169 ^ 177) ^ (49 ^ 45));
        lIlIIIllIlll[19] = 38 ^ 44;
        lIlIIIllIlll[20] = 181 ^ 189;
        lIlIIIllIlll[21] = 119 ^ 126;
        lIlIIIllIlll[22] = 88 ^ 83;
        lIlIIIllIlll[23] = (79 ^ 86) ^ (85 ^ 64);
        lIlIIIllIlll[24] = 100 ^ 105;
        lIlIIIllIlll[25] = (57 ^ 124) ^ (127 ^ 53);
        lIlIIIllIlll[26] = 177 ^ 161;
        lIlIIIllIlll[27] = (-562) & 29371;
        lIlIIIllIlll[28] = 185 ^ 168;
        lIlIIIllIlll[29] = (((98 + 5) - 90) + 128) ^ (((104 + 23) - 47) + 79);
        lIlIIIllIlll[30] = (22 ^ 54) ^ (143 ^ 188);
        lIlIIIllIlll[31] = (((29 + 104) - 129) + 126) ^ (((35 + 59) - 71) + 127);
        lIlIIIllIlll[32] = 1 ^ 20;
        lIlIIIllIlll[33] = 142 ^ 152;
        lIlIIIllIlll[34] = 83 ^ 68;
        lIlIIIllIlll[35] = 108 ^ 116;
        lIlIIIllIlll[36] = (((64 + 72) - 71) + 79) ^ (((82 + 22) - 71) + 104);
        lIlIIIllIlll[37] = 153 ^ 130;
    }
}
