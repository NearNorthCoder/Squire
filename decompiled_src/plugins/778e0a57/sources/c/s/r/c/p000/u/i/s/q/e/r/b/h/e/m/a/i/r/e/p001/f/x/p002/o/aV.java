package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Scavangers (Prep)", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aV  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aV.class */
public class aV extends U {
    private /* synthetic */ C0039n al;
    private /* synthetic */ C0039n ak;
    private static /* synthetic */ String[] lIlIIlIIllII;
    private /* synthetic */ int am;
    private static /* synthetic */ int[] lIlIIlIIllIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (llIllIIIllIlII(e(this.ak) ? 1 : 0)) {
            return lIlIIlIIllIl[1];
        }
        ?? r0 = lIlIIlIIllIl[1];
        int[] iArr = new int[lIlIIlIIllIl[1]];
        iArr[lIlIIlIIllIl[2]] = lIlIIlIIllIl[3];
        if (llIllIIIllIlIl(Inventory.getCount((boolean) r0, iArr), lIlIIlIIllIl[4])) {
            ?? r02 = lIlIIlIIllIl[1];
            int[] iArr2 = new int[lIlIIlIIllIl[1]];
            iArr2[lIlIIlIIllIl[2]] = lIlIIlIIllIl[5];
            if (llIllIIIllIlIl(Inventory.getCount((boolean) r02, iArr2), lIlIIlIIllIl[6])) {
                if (llIllIIIllIlII(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
                    Movement.setDestination(this.al.bs);
                    return lIlIIlIIllIl[1];
                } else if (llIllIIIllIlII(Reachable.isWalkable(this.ak.bs) ? 1 : 0)) {
                    Movement.setDestination(this.ak.bt);
                    System.out.println(lIlIIlIIllII[lIlIIlIIllIl[2]]);
                    return lIlIIlIIllIl[1];
                } else {
                    return lIlIIlIIllIl[2];
                }
            }
        }
        if (llIllIIIllIlII(Inventory.isFull() ? 1 : 0)) {
            this.co.x();
            "".length();
            return lIlIIlIIllIl[1];
        }
        TileItem nearest = TileItems.getNearest(tileItem -> {
            if (!llIllIIIllIlII(this.ak.a((Locatable) tileItem) ? 1 : 0) || (llIllIIIlllIIl(tileItem.getId(), lIlIIlIIllIl[3]) && !llIllIIIlllIll(tileItem.getId(), lIlIIlIIllIl[5]))) {
                return lIlIIlIIllIl[2];
            }
            ?? r03 = lIlIIlIIllIl[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
        });
        if (llIllIIIllIllI(nearest)) {
            if (llIllIIIllIlII(this.bS.isMoving() ? 1 : 0)) {
                return lIlIIlIIllIl[2];
            }
            nearest.interact(lIlIIlIIllII[lIlIIlIIllIl[1]]);
            return lIlIIlIIllIl[1];
        }
        String[] strArr = new String[lIlIIlIIllIl[1]];
        strArr[lIlIIlIIllIl[2]] = lIlIIlIIllII[lIlIIlIIllIl[7]];
        NPC nearest2 = NPCs.getNearest(strArr);
        if (llIllIIIllIlll(nearest2)) {
            WorldPoint center = this.ak.br.getCenter();
            if (llIllIIIlllIII(center.distanceTo(this.bS), lIlIIlIIllIl[8])) {
                return lIlIIlIIllIl[2];
            }
            System.out.println(lIlIIlIIllII[lIlIIlIIllIl[9]]);
            Movement.setDestination(center);
            return lIlIIlIIllIl[1];
        } else if (llIllIIIllIllI(this.bS.getInteracting()) && llIllIIIllIlII(this.bS.getInteracting().getName().contains(lIlIIlIIllII[lIlIIlIIllIl[6]]) ? 1 : 0)) {
            return lIlIIlIIllIl[2];
        } else {
            nearest2.interact(lIlIIlIIllII[lIlIIlIIllIl[10]]);
            System.out.println(lIlIIlIIllII[lIlIIlIIllIl[11]]);
            return lIlIIlIIllIl[1];
        }
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return C0044s.bb();
    }

    private static boolean llIllIIIlllIIl(int i, int i2) {
        return i != i2;
    }

    @Inject
    protected aV(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIlIIllIl[0];
    }

    private static boolean llIllIIIllIlII(int i) {
        return i != 0;
    }

    private static boolean llIllIIIllIlll(Object obj) {
        return obj == null;
    }

    private static boolean llIllIIIlllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void llIllIIIllIIll() {
        lIlIIlIIllIl = new int[14];
        lIlIIlIIllIl[0] = -" ".length();
        lIlIIlIIllIl[1] = " ".length();
        lIlIIlIIllIl[2] = ((63 ^ 99) ^ (47 ^ 117)) & (((255 ^ 153) ^ (198 ^ 166)) ^ (-" ".length()));
        lIlIIlIIllIl[3] = (-((-17287) & 28631)) & (-513) & 32767;
        lIlIIlIIllIl[4] = 25 ^ 9;
        lIlIIlIIllIl[5] = (-8786) & 29695;
        lIlIIlIIllIl[6] = 156 ^ 152;
        lIlIIlIIllIl[7] = "  ".length();
        lIlIIlIIllIl[8] = (((54 + 60) - (-12)) + 54) ^ (((48 + 49) - 60) + 153);
        lIlIIlIIllIl[9] = "   ".length();
        lIlIIlIIllIl[10] = 10 ^ 15;
        lIlIIlIIllIl[11] = ((146 ^ 192) & ((105 ^ 59) ^ (-1))) ^ (106 ^ 108);
        lIlIIlIIllIl[12] = (((15 + 46) - (-105)) + 17) ^ (((153 + 20) - 48) + 51);
        lIlIIlIIllIl[13] = 49 ^ 57;
    }

    static {
        llIllIIIllIIll();
        llIllIIIllIIlI();
    }

    private static String llIllIIIllIIII(String lllllllllllllllIllIllIllIIIlIlIl, String lllllllllllllllIllIllIllIIIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIllIllIllIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIllIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIllIIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIllIIIlIlll.init(lIlIIlIIllIl[7], lllllllllllllllIllIllIllIIIllIII);
            return new String(lllllllllllllllIllIllIllIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIllIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIllIIIlIllI) {
            lllllllllllllllIllIllIllIIIlIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        if (llIllIIIlllIIl(this.bS.getPlane(), lIlIIlIIllIl[7])) {
            return lIlIIlIIllIl[2];
        }
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIllIIIlllIlI(this.ak.bw, N.SCAVENGERS)) {
            ?? r0 = lIlIIlIIllIl[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIlIIllIl[2];
    }

    private static boolean llIllIIIllIllI(Object obj) {
        return obj != null;
    }

    private static boolean llIllIIIllIlIl(int i, int i2) {
        return i >= i2;
    }

    private static String llIllIIIllIIIl(String lllllllllllllllIllIllIllIIllIlll, String lllllllllllllllIllIllIllIIllIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIllIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIllIllIIllIllI.toCharArray();
        int lllllllllllllllIllIllIllIIllIIll = lIlIIlIIllIl[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIIllIl[2];
        while (llIllIIIlllIII(i, length)) {
            char lllllllllllllllIllIllIllIIlllIII = charArray2[i];
            sb.append((char) (lllllllllllllllIllIllIllIIlllIII ^ charArray[lllllllllllllllIllIllIllIIllIIll % charArray.length]));
            "".length();
            lllllllllllllllIllIllIllIIllIIll++;
            i++;
            "".length();
            if (((140 ^ 194) ^ (109 ^ 38)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIllIIIllIIlI() {
        lIlIIlIIllII = new String[lIlIIlIIllIl[13]];
        lIlIIlIIllII[lIlIIlIIllIl[2]] = llIllIIIlIllll("e9VjIpTPNkeI/92Nu0w9ow==", "kTLel");
        lIlIIlIIllII[lIlIIlIIllIl[1]] = llIllIIIlIllll("skD3jVgV+VA=", "KLaha");
        lIlIIlIIllII[lIlIIlIIllIl[7]] = llIllIIIlIllll("zBOBJRN6dzvQ8uYP9s96zg==", "ttamS");
        lIlIIlIIllII[lIlIIlIIllIl[9]] = llIllIIIllIIII("5Gr2LuvbBSQXEc/CkWxKHOxQl5iI9rDJ", "EOSqG");
        lIlIIlIIllII[lIlIIlIIllIl[6]] = llIllIIIllIIII("4paDAh3b95rqOYk1+H26Dg==", "GvaSh");
        lIlIIlIIllII[lIlIIlIIllIl[10]] = llIllIIIllIIIl("DwMCAjsl", "NwvcX");
        lIlIIlIIllII[lIlIIlIIllIl[11]] = llIllIIIlIllll("ZUNeOSrvJRj00zZ3kXMaRQ==", "tgEFX");
        lIlIIlIIllII[lIlIIlIIllIl[12]] = llIllIIIlIllll("9kMb51Mk9CG8nSzIYq+hPw==", "LsiJt");
    }

    private static boolean llIllIIIlllIII(int i, int i2) {
        return i < i2;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        String[] strArr = new String[lIlIIlIIllIl[1]];
        strArr[lIlIIlIIllIl[2]] = lIlIIlIIllII[lIlIIlIIllIl[12]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!llIllIIIllIlll(nearest) && llIllIIIlllIII(this.bS.distanceTo(nearest), lIlIIlIIllIl[10])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    private static boolean llIllIIIlllIll(int i, int i2) {
        return i == i2;
    }

    private static String llIllIIIlIllll(String lllllllllllllllIllIllIllIIlIIIlI, String lllllllllllllllIllIllIllIIlIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIIllIl[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIIllIl[7], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIllIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIllIIlIIIll) {
            lllllllllllllllIllIllIllIIlIIIll.printStackTrace();
            return null;
        }
    }
}
