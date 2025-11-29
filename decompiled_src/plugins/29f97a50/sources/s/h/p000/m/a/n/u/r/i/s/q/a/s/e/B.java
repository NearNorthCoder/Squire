package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.World;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking to shamans", priority = 10, blocking = true)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.B  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/B.class */
public class B extends Task {
    private final /* synthetic */ SquireShamansPlugin aP;
    private static /* synthetic */ String[] lIIlIllllllIl;
    private final /* synthetic */ c aO;
    private static /* synthetic */ int[] lIIllIIIIlIlI;

    private static boolean lIlIlllIlIlllIl(int i, int i2) {
        return i == i2;
    }

    private static void lIlIlllIlIllIII() {
        lIIllIIIIlIlI = new int[6];
        lIIllIIIIlIlI[0] = ((76 ^ 33) ^ (91 ^ 48)) & (((76 ^ 99) ^ (106 ^ 67)) ^ (-" ".length()));
        lIIllIIIIlIlI[1] = 139 ^ 159;
        lIIllIIIIlIlI[2] = " ".length();
        lIIllIIIIlIlI[3] = -" ".length();
        lIIllIIIIlIlI[4] = "  ".length();
        lIIllIIIIlIlI[5] = 191 ^ 183;
    }

    private static void lIlIlllIIlIIlIl() {
        lIIlIllllllIl = new String[lIIllIIIIlIlI[4]];
        lIIlIllllllIl[lIIllIIIIlIlI[0]] = lIlIlllIIlIIIll("z6fJnT02dHY=", "NuLZe");
        lIIlIllllllIl[lIIllIIIIlIlI[2]] = lIlIlllIIlIIlII("Fx8QGh8qCg==", "Dkqwv");
    }

    private static boolean lIlIlllIllIIIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlllIlIlllII(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIlllIIlIIlII(String llllllllllllllIllllIIlIlIIIlllIl, String llllllllllllllIllllIIlIlIIIlllII) {
        String llllllllllllllIllllIIlIlIIIlllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIlIlIIIllIll = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIlIlIIIlllII.toCharArray();
        int llllllllllllllIllllIIlIlIIIllIIl = lIIllIIIIlIlI[0];
        char[] charArray2 = llllllllllllllIllllIIlIlIIIlllIl2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIllllIIlIlIIIlIIIl = lIIllIIIIlIlI[0];
        while (lIlIlllIllIIIlI(llllllllllllllIllllIIlIlIIIlIIIl, length)) {
            llllllllllllllIllllIIlIlIIIllIll.append((char) (charArray2[llllllllllllllIllllIIlIlIIIlIIIl] ^ charArray[llllllllllllllIllllIIlIlIIIllIIl % charArray.length]));
            "".length();
            llllllllllllllIllllIIlIlIIIllIIl++;
            llllllllllllllIllllIIlIlIIIlIIIl++;
            "".length();
            if ((163 ^ 167) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIIlIlIIIllIll);
    }

    private void H() {
        World first;
        int c = this.aP.c();
        if (lIlIlllIlIlllIl(Worlds.getCurrentId(), c)) {
            this.aP.a(lIIllIIIIlIlI[3]);
            return;
        }
        if (lIlIlllIlIllllI(c, lIIllIIIIlIlI[3])) {
            first = Worlds.getFirst(c);
            "".length();
            if (" ".length() < 0) {
                return;
            }
        } else {
            first = Worlds.getFirst(world -> {
                if (lIlIlllIlIllIIl(world.isNormal() ? 1 : 0) && lIlIlllIlIllIIl(world.isMembers() ? 1 : 0) && lIlIlllIllIIIII(world.getId(), Worlds.getCurrentId())) {
                    ?? r0 = lIIllIIIIlIlI[2];
                    "".length();
                    return 0 != 0 ? (false ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIllIIIIlIlI[0];
            });
        }
        if (lIlIlllIlIlllll(first)) {
            first = Worlds.getFirst(world2 -> {
                if (lIlIlllIlIllIIl(world2.isNormal() ? 1 : 0) && lIlIlllIlIllIIl(world2.isMembers() ? 1 : 0)) {
                    ?? r0 = lIIllIIIIlIlI[2];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIllIIIIlIlI[0];
            });
            if (lIlIlllIlIlllll(first)) {
                return;
            }
        }
        Worlds.hopTo(first);
    }

    private static boolean lIlIlllIllIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlllIlIllIll(int i) {
        return i == 0;
    }

    private static boolean lIlIlllIlIlllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean run() {
        if (lIlIlllIlIllIIl(this.aO.s() ? 1 : 0)) {
            return lIIllIIIIlIlI[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().startsWith(lIIlIllllllIl[lIIllIIIIlIlI[2]]);
        });
        if (lIlIlllIlIllIlI(first) && lIlIlllIlIllIll(Movement.isStaminaBoosted() ? 1 : 0) && lIlIlllIlIlllII(Movement.getRunEnergy(), lIIllIIIIlIlI[1])) {
            first.interact(lIIlIllllllIl[lIIllIIIIlIlI[0]]);
            return lIIllIIIIlIlI[2];
        } else if (lIlIlllIlIllIll(this.aO.r().matchesInventory() ? 1 : 0)) {
            return lIIllIIIIlIlI[0];
        } else {
            g t = this.aO.t();
            if (lIlIlllIlIllIlI(Players.getNearest(player -> {
                if (lIlIlllIlIllIIl(t.x().contains(player) ? 1 : 0) && lIlIlllIllIIIIl(player, Players.getLocal())) {
                    ?? r0 = lIIllIIIIlIlI[2];
                    "".length();
                    return 0 != 0 ? ((((108 + 222) - 176) + 87) ^ (((111 + 29) - 58) + 106)) & (((((196 + 95) - 124) + 41) ^ (((66 + 64) - 114) + 141)) ^ (-" ".length())) : r0;
                }
                return lIIllIIIIlIlI[0];
            }))) {
                H();
                return lIIllIIIIlIlI[0];
            } else if (lIlIlllIlIllIIl(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo(t.A());
                "".length();
                return lIIllIIIIlIlI[2];
            } else {
                return lIIllIIIIlIlI[2];
            }
        }
    }

    private static boolean lIlIlllIlIllllI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIlllIlIllIlI(Object obj) {
        return obj != null;
    }

    static {
        lIlIlllIlIllIII();
        lIlIlllIIlIIlIl();
    }

    private static boolean lIlIlllIlIllIIl(int i) {
        return i != 0;
    }

    @Inject
    public B(c cVar, SquireShamansPlugin squireShamansPlugin) {
        this.aO = cVar;
        this.aP = squireShamansPlugin;
    }

    private static String lIlIlllIIlIIIll(String llllllllllllllIllllIIlIlIIlIllIl, String llllllllllllllIllllIIlIlIIlIllII) {
        try {
            SecretKeySpec llllllllllllllIllllIIlIlIIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlIlIIlIllII.getBytes(StandardCharsets.UTF_8)), lIIllIIIIlIlI[5]), "DES");
            Cipher llllllllllllllIllllIIlIlIIlIllll = Cipher.getInstance("DES");
            llllllllllllllIllllIIlIlIIlIllll.init(lIIllIIIIlIlI[4], llllllllllllllIllllIIlIlIIllIIII);
            return new String(llllllllllllllIllllIIlIlIIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIlIlIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIlIlIIlIlllI) {
            llllllllllllllIllllIIlIlIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIllIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }
}
