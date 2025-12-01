package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Collecting Snape Grass")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bS  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bS.class */
public class bS extends Task {
    private static final /* synthetic */ WorldPoint gW;
    private static final /* synthetic */ WorldPoint gX;
    private static /* synthetic */ int[] lIIIIIllI;
    private static /* synthetic */ String[] lIIIIIlIl;
    private static final /* synthetic */ WorldArea gU;
    private static final /* synthetic */ int gS;
    @Inject
    private /* synthetic */ SecondariesConfig gK;
    private static final /* synthetic */ int gT;
    private static final /* synthetic */ WorldArea gV;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    protected boolean t(int i2) {
        int[] mapRegions = Static.getClient().getMapRegions();
        int length = mapRegions.length;
        int i3 = lIIIIIllI[0];
        while (lllIlIIIll(i3, length)) {
            if (lllIlIIlII(mapRegions[i3], i2)) {
                return lIIIIIllI[2];
            }
            i3++;
            "".length();
            if ((((255 ^ 150) ^ (234 ^ 164)) & (((209 ^ 182) ^ (19 ^ 83)) ^ (-" ".length()))) != 0) {
                return ((((128 + 127) - 117) + 34) ^ (((33 + 102) - 94) + 114)) & (((174 ^ 167) ^ (178 ^ 140)) ^ (-" ".length()));
            }
        }
        return lIIIIIllI[0];
    }

    private static boolean lllIlIIIlI(int i2) {
        return i2 == 0;
    }

    private static String lllIIllIll(String llIIllIllIIIIIl, String llIIllIllIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIllIllIIIIll = Cipher.getInstance("Blowfish");
            llIIllIllIIIIll.init(lIIIIIllI[14], secretKeySpec);
            return new String(llIIllIllIIIIll.doFinal(Base64.getDecoder().decode(llIIllIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIllIllIIIIlI) {
            llIIllIllIIIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    public boolean run() {
        if (!lllIIllllI(this.gK.secondary(), bO.SNAPE_GRASS) && !lllIIlllll(Inventory.isFull() ? 1 : 0)) {
            if (lllIlIIIII(gX.distanceTo(Players.getLocal()), lIIIIIllI[1])) {
                Movement.walkTo(gX);
                "".length();
                return lIIIIIllI[2];
            }
            TileItem nearest = TileItems.getNearest(tileItem -> {
                if (lllIIlllll(tileItem.getName().equals(lIIIIIlIl[lIIIIIllI[2]]) ? 1 : 0) && lllIIlllll(gV.contains(tileItem.getWorldLocation()) ? 1 : 0)) {
                    ?? r0 = lIIIIIllI[2];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
                }
                return lIIIIIllI[0];
            });
            if (!lllIlIIIIl(nearest)) {
                nearest.interact(lIIIIIlIl[lIIIIIllI[0]]);
                return lIIIIIllI[2];
            } else if (lllIlIIIlI(Players.getLocal().getWorldLocation().equals(gX) ? 1 : 0)) {
                Movement.setDestination(gX);
                return lIIIIIllI[2];
            } else {
                return lIIIIIllI[0];
            }
        }
        return lIIIIIllI[0];
    }

    private static boolean lllIIllllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lllIIlllIl();
        lllIIlllII();
        gS = lIIIIIllI[3];
        gT = lIIIIIllI[4];
        gU = new WorldArea(lIIIIIllI[5], lIIIIIllI[6], lIIIIIllI[7], lIIIIIllI[7], lIIIIIllI[0]);
        gV = new WorldArea(lIIIIIllI[8], lIIIIIllI[9], lIIIIIllI[7], lIIIIIllI[7], lIIIIIllI[0]);
        gW = new WorldPoint(lIIIIIllI[10], lIIIIIllI[11], lIIIIIllI[0]);
        gX = new WorldPoint(lIIIIIllI[12], lIIIIIllI[13], lIIIIIllI[0]);
    }

    private static boolean lllIlIIlII(int i2, int i3) {
        return i2 == i3;
    }

    private static void lllIIlllIl() {
        lIIIIIllI = new int[15];
        lIIIIIllI[0] = ((85 ^ 63) ^ (51 ^ 114)) & (((108 ^ 30) ^ (29 ^ 68)) ^ (-" ".length()));
        lIIIIIllI[1] = (200 ^ 168) ^ (83 ^ 57);
        lIIIIIllI[2] = " ".length();
        lIIIIIllI[3] = (-69) & 10110;
        lIIIIIllI[4] = (-((-7089) & 31735)) & (-385) & 32254;
        lIIIIIllI[5] = (-(84 ^ 80)) & (-29185) & 31727;
        lIIIIIllI[6] = (-8473) & 12222;
        lIIIIIllI[7] = 47 ^ 63;
        lIIIIIllI[8] = (-((-1665) & 30357)) & (-193) & 30718;
        lIIIIIllI[9] = (-((-1957) & 30693)) & (-265) & 32637;
        lIIIIIllI[10] = (-26113) & 28661;
        lIIIIIllI[11] = (-20737) & 24494;
        lIIIIIllI[12] = (-8321) & 10159;
        lIIIIIllI[13] = (-((-9785) & 30715)) & (-6) & 24575;
        lIIIIIllI[14] = "  ".length();
    }

    private static String lllIIllIlI(String llIIllIllIlIllI, String llIIllIllIlIlIl) {
        String llIIllIllIlIllI2 = new String(Base64.getDecoder().decode(llIIllIllIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIllIllIlIlIl.toCharArray();
        int llIIllIllIlIIlI = lIIIIIllI[0];
        char[] charArray2 = llIIllIllIlIllI2.toCharArray();
        int llIIllIllIIlIll = charArray2.length;
        int i2 = lIIIIIllI[0];
        while (lllIlIIIll(i2, llIIllIllIIlIll)) {
            char llIIllIllIlIlll = charArray2[i2];
            sb.append((char) (llIIllIllIlIlll ^ charArray[llIIllIllIlIIlI % charArray.length]));
            "".length();
            llIIllIllIlIIlI++;
            i2++;
            "".length();
            if (((23 ^ 54) & ((141 ^ 172) ^ (-1))) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIlIIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lllIlIIIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lllIlIIIII(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lllIIlllll(int i2) {
        return i2 != 0;
    }

    private static void lllIIlllII() {
        lIIIIIlIl = new String[lIIIIIllI[14]];
        lIIIIIlIl[lIIIIIllI[0]] = lllIIllIlI("BykODA==", "SHeiJ");
        lIIIIIlIl[lIIIIIllI[2]] = lllIIllIll("2WE/8zeDCHLNhqrjPFjkKA==", "Jutkd");
    }
}
