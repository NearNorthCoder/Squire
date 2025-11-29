package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Chasing fish", priority = 5, register = true)
/* renamed from: u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.d  reason: invalid package */
/* loaded from: squire-drift-net-fishing-0.0.1.jar:u/t/e/e/g/q/r/d/h/r/i/i/n/i/i/-/s/-/f/s/f/-/t/n/d.class */
public class d extends Task {

    /* renamed from: u  reason: collision with root package name */
    private final /* synthetic */ ArrayList<b> f0u = new ArrayList<>();
    private final /* synthetic */ SquireDriftNet s;
    private final /* synthetic */ Client t;
    private static /* synthetic */ String[] lIlIIIIIlIII;
    private static /* synthetic */ int[] lIlIIIIIlIIl;

    private static String llIlIIllIIlIII(String lllllllllllllllIlllIlIIIlIIIIIIl, String lllllllllllllllIlllIlIIIlIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIlIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIl[4]), "DES");
            Cipher lllllllllllllllIlllIlIIIlIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIIlIIIIIll.init(lIlIIIIIlIIl[3], lllllllllllllllIlllIlIIIlIIIIlII);
            return new String(lllllllllllllllIlllIlIIIlIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIlIIIIIlI) {
            lllllllllllllllIlllIlIIIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    public d(SquireDriftNet squireDriftNet, Client client) {
        this.s = squireDriftNet;
        this.t = client;
    }

    private static String llIlIIllIIlIIl(String lllllllllllllllIlllIlIIIlIIIlllI, String lllllllllllllllIlllIlIIIlIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIlIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIlIIlIIII.init(lIlIIIIIlIIl[3], secretKeySpec);
            return new String(lllllllllllllllIlllIlIIIlIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIlIIIllll) {
            lllllllllllllllIlllIlIIIlIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIlIIlI(int i) {
        return i >= 0;
    }

    private static boolean llIlIIllIIllII(int i) {
        return i == 0;
    }

    private static boolean llIlIIllIlIIIl(Object obj) {
        return obj == null;
    }

    static {
        llIlIIllIIlIll();
        llIlIIllIIlIlI();
    }

    private static void llIlIIllIIlIlI() {
        lIlIIIIIlIII = new String[lIlIIIIIlIIl[8]];
        lIlIIIIIlIII[lIlIIIIIlIIl[0]] = llIlIIllIIIlll("KgQ6PA4=", "nvSRe");
        lIlIIIIIlIII[lIlIIIIIlIIl[2]] = llIlIIllIIlIII("Jl7NBbiBHGc=", "hBmxo");
        lIlIIIIIlIII[lIlIIIIIlIIl[3]] = llIlIIllIIlIIl("deHG5eJKOeA=", "bXzCn");
        lIlIIIIIlIII[lIlIIIIIlIIl[5]] = llIlIIllIIIlll("MyodL1AGKwEmHA==", "uCnGp");
        lIlIIIIIlIII[lIlIIIIIlIIl[7]] = llIlIIllIIlIIl("7aXxpKPpyh4=", "fApcw");
    }

    private static boolean llIlIIllIIlllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    public boolean run() {
        if (llIlIIllIIllII(this.t.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlIIl[0];
        }
        if (llIlIIllIIllIl(Movement.getRunEnergy(), lIlIIIIIlIIl[1])) {
            Item first = Inventory.getFirst(item -> {
                return item.getName().contains(lIlIIIIIlIII[lIlIIIIIlIIl[7]]);
            });
            if (llIlIIllIIlllI(first)) {
                first.interact(lIlIIIIIlIII[lIlIIIIIlIIl[0]]);
            }
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if (llIlIIllIIllII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (llIlIIllIIllll(this.s.c() ? 1 : 0)) {
            this.f0u.clear();
            this.s.a((boolean) lIlIIIIIlIIl[0]);
        }
        String[] strArr = new String[lIlIIIIIlIIl[2]];
        strArr[lIlIIIIIlIIl[0]] = lIlIIIIIlIII[lIlIIIIIlIIl[2]];
        TileObject nearest = TileObjects.getNearest(strArr);
        this.f0u.removeIf(bVar -> {
            if (llIlIIllIlIIIl(bVar.j())) {
                return lIlIIIIIlIIl[2];
            }
            if (llIlIIllIIlllI(nearest) && llIlIIllIIllll(new WorldArea(new WorldPoint(nearest.getX() - lIlIIIIIlIIl[5], nearest.getY() - lIlIIIIIlIIl[6], nearest.getPlane()), new WorldPoint(nearest.getX() + lIlIIIIIlIIl[7], nearest.getY(), nearest.getPlane())).contains(bVar.j()) ? 1 : 0)) {
                if (llIlIIllIlIIlI(llIlIIllIlIIII(bVar.l().getElapsed().getSeconds(), 24L))) {
                    ?? r0 = lIlIIIIIlIIl[2];
                    "".length();
                    return (-((((98 + 26) - 75) + 78) ^ (56 ^ 67))) >= 0 ? ((40 ^ 18) ^ (142 ^ 158)) & (((249 ^ 138) ^ (198 ^ 159)) ^ (-" ".length())) : r0;
                }
                return lIlIIIIIlIIl[0];
            } else if (llIlIIllIlIIlI(llIlIIllIlIIII(bVar.l().getElapsed().getSeconds(), 12L))) {
                ?? r02 = lIlIIIIIlIIl[2];
                "".length();
                return (-(69 ^ 64)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
            } else {
                return lIlIIIIIlIIl[0];
            }
        });
        "".length();
        NPC nearest2 = NPCs.getNearest(npc -> {
            if (llIlIIllIIllII(npc.getName().contains(lIlIIIIIlIII[lIlIIIIIlIIl[5]]) ? 1 : 0)) {
                return lIlIIIIIlIIl[0];
            }
            Iterator<b> it = this.f0u.iterator();
            while (llIlIIllIIllll(it.hasNext() ? 1 : 0)) {
                if (llIlIIllIIllll(npc.equals(it.next().j()) ? 1 : 0)) {
                    return lIlIIIIIlIIl[0];
                }
                "".length();
                if ((-"  ".length()) > 0) {
                    return ((215 ^ 179) ^ (208 ^ 147)) & (((((116 + 132) - 198) + 136) ^ (((15 + 148) - 30) + 24)) ^ (-" ".length()));
                }
            }
            return lIlIIIIIlIIl[2];
        });
        if (llIlIIllIIlllI(nearest2)) {
            nearest2.interact(lIlIIIIIlIII[lIlIIIIIlIIl[3]]);
            sleepWhile(lIlIIIIIlIIl[4], () -> {
                if (llIlIIllIIlllI(Players.getLocal().getInteracting())) {
                    ?? r0 = lIlIIIIIlIIl[2];
                    "".length();
                    return " ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIIIlIIl[0];
            });
            if (llIlIIllIIllll(this.s.e() ? 1 : 0)) {
                b bVar2 = new b(nearest2);
                bVar2.k();
                this.f0u.add(bVar2);
                "".length();
                this.s.b((boolean) lIlIIIIIlIIl[0]);
            }
        }
        return lIlIIIIIlIIl[2];
    }

    private static void llIlIIllIIlIll() {
        lIlIIIIIlIIl = new int[9];
        lIlIIIIIlIIl[0] = (108 ^ 123) & ((148 ^ 131) ^ (-1));
        lIlIIIIIlIIl[1] = (((70 + 121) - 183) + 155) ^ (((132 + 36) - 62) + 39);
        lIlIIIIIlIIl[2] = " ".length();
        lIlIIIIIlIIl[3] = "  ".length();
        lIlIIIIIlIIl[4] = 144 ^ 152;
        lIlIIIIIlIIl[5] = "   ".length();
        lIlIIIIIlIIl[6] = (((20 + 55) - (-72)) + 34) ^ (((1 + 148) - 3) + 32);
        lIlIIIIIlIIl[7] = (((188 + 55) - 92) + 43) ^ (((161 + 21) - 28) + 44);
        lIlIIIIIlIIl[8] = (((14 + 75) - 1) + 40) ^ (((41 + 20) - (-36)) + 36);
    }

    private static String llIlIIllIIIlll(String lllllllllllllllIlllIlIIIIlllIIIl, String lllllllllllllllIlllIlIIIIlllIIII) {
        String lllllllllllllllIlllIlIIIIlllIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIIIllIllll = new StringBuilder();
        char[] lllllllllllllllIlllIlIIIIllIlllI = lllllllllllllllIlllIlIIIIlllIIII.toCharArray();
        int lllllllllllllllIlllIlIIIIllIllIl = lIlIIIIIlIIl[0];
        char[] charArray = lllllllllllllllIlllIlIIIIlllIIIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIlIIl[0];
        while (llIlIIllIIllIl(i, length)) {
            char lllllllllllllllIlllIlIIIIllIIlII = charArray[i];
            lllllllllllllllIlllIlIIIIllIllll.append((char) (lllllllllllllllIlllIlIIIIllIIlII ^ lllllllllllllllIlllIlIIIIllIlllI[lllllllllllllllIlllIlIIIIllIllIl % lllllllllllllllIlllIlIIIIllIlllI.length]));
            "".length();
            lllllllllllllllIlllIlIIIIllIllIl++;
            i++;
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIlIIIIllIllll);
    }

    private static boolean llIlIIllIIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIIllIIllll(int i) {
        return i != 0;
    }

    private static int llIlIIllIlIIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
