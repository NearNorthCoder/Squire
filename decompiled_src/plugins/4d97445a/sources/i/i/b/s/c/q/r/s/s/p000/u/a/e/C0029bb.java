package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.query.entities.NPCQuery;
import net.unethicalite.api.query.results.SceneEntityQueryResults;
@TaskDesc(name = "Planting bait", priority = 35, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bb  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bb.class */
public class C0029bb extends Task {
    /* synthetic */ WorldArea fn = new WorldArea(lllIIIII[0], lllIIIII[1], lllIIIII[2], lllIIIII[3], lllIIIII[4]);
    private static /* synthetic */ String[] llIllllI;
    private static /* synthetic */ int[] lllIIIII;

    private static boolean llIIIllIlI(int i2, int i3) {
        return i2 >= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lllIIIII[5]];
        iArr[lllIIIII[4]] = lllIIIII[6];
        if (!llIIIlIlll(Inventory.contains(iArr) ? 1 : 0) && !llIIIllIII(Players.getLocal().getAnimation(), lllIIIII[7]) && !llIIIllIIl(Players.getLocal().getInteracting()) && !llIIIlIlll(Movement.shouldWalk() ? 1 : 0) && !llIIIllIlI(NPCs.getAll(npc -> {
            return npc.getName().equalsIgnoreCase(llIllllI[lllIIIII[5]]);
        }).size(), lllIIIII[8])) {
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            WorldArea[] worldAreaArr = new WorldArea[lllIIIII[5]];
            worldAreaArr[lllIIIII[4]] = this.fn;
            if (llIIIlIlll(worldLocation.isInArea(worldAreaArr) ? 1 : 0)) {
                Movement.walkTo(this.fn.getRandom());
                "".length();
                return lllIIIII[5];
            }
            NPCQuery query = NPCs.query();
            WorldPoint[] worldPointArr = new WorldPoint[lllIIIII[5]];
            worldPointArr[lllIIIII[4]] = Players.getLocal().getWorldLocation();
            if (llIIIllIIl(((SceneEntityQueryResults) query.locations(worldPointArr).results()).nearest())) {
                Movement.walkTo(this.fn.getRandom());
                "".length();
                return lllIIIII[5];
            }
            int[] iArr2 = new int[lllIIIII[5]];
            iArr2[lllIIIII[4]] = lllIIIII[6];
            Inventory.getFirst(iArr2).interact(llIllllI[lllIIIII[4]]);
            sleep(lllIIIII[9]);
            return lllIIIII[5];
        }
        return lllIIIII[4];
    }

    private static String llIIIlIIlI(String llIlIlIIIlllllI, String llIlIlIIIllllIl) {
        try {
            SecretKeySpec llIlIlIIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlIIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIII[9], llIlIlIIlIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIlIIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIlIIIllllll) {
            llIlIlIIIllllll.printStackTrace();
            return null;
        }
    }

    static {
        llIIIlIllI();
        llIIIlIlIl();
    }

    private static boolean llIIIllIII(int i2, int i3) {
        return i2 == i3;
    }

    private static void llIIIlIllI() {
        lllIIIII = new int[10];
        lllIIIII[0] = (-8263) & 10590;
        lllIIIII[1] = (-29710) & 32765;
        lllIIIII[2] = 33 ^ 39;
        lllIIIII[3] = 153 ^ 157;
        lllIIIII[4] = ((23 ^ 55) ^ (196 ^ 181)) & (((59 ^ 18) ^ (69 ^ 61)) ^ (-" ".length()));
        lllIIIII[5] = " ".length();
        lllIIIII[6] = (-((-19393) & 28613)) & (-20673) & 32767;
        lllIIIII[7] = (-16786) & 17811;
        lllIIIII[8] = 91 ^ 94;
        lllIIIII[9] = "  ".length();
    }

    private static boolean llIIIlIlll(int i2) {
        return i2 == 0;
    }

    private static void llIIIlIlIl() {
        llIllllI = new String[lllIIIII[9]];
        llIllllI[lllIIIII[4]] = llIIIlIIlI("/bH3NIRfUZA=", "ubPlv");
        llIllllI[lllIIIII[5]] = llIIIlIIlI("oGHIz3dB16GbbFOaQVZelA==", "mpVAd");
    }

    private static boolean llIIIllIIl(Object obj) {
        return obj != null;
    }
}
