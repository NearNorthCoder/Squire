package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
@TaskDesc(name = "Killing core", priority = 500, blocking = true, register = true)
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.i  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/i.class */
public class i extends a {
    private static /* synthetic */ String[] lIllIIIIIIII;
    private static final /* synthetic */ int u;
    private static /* synthetic */ int[] lIllIIIIIIIl;

    private static void lllIIIllIIlllI() {
        lIllIIIIIIII = new String[lIllIIIIIIIl[9]];
        lIllIIIIIIII[lIllIIIIIIIl[0]] = lllIIIllIIlIll("DDgfJGQtNwg9IzF5DiA2LQ==", "HYmOD");
        lIllIIIIIIII[lIllIIIIIIIl[1]] = lllIIIllIIllII("lE02kIp2m0c=", "VWVWF");
        lIllIIIIIIII[lIllIIIIIIIl[5]] = lllIIIllIIllIl("gq0zoKIIDRk=", "jVejC");
        lIllIIIIIIII[lIllIIIIIIIl[6]] = lllIIIllIIlIll("PRU8JFEcGis9FgBULSADHA==", "ytNOq");
        lIllIIIIIIII[lIllIIIIIIIl[7]] = lllIIIllIIlIll("MBEVGAc=", "gxptc");
        lIllIIIIIIII[lIllIIIIIIIl[8]] = lllIIIllIIllII("00qZ8VAgX1k=", "VFtIN");
    }

    private static void lllIIIllIIllll() {
        lIllIIIIIIIl = new int[11];
        lIllIIIIIIIl[0] = (66 ^ 6) & ((86 ^ 18) ^ (-1));
        lIllIIIIIIIl[1] = " ".length();
        lIllIIIIIIIl[2] = (-((-1713) & 7921)) & (-16897) & 23423;
        lIllIIIIIIIl[3] = (-257) & 12060;
        lIllIIIIIIIl[4] = (((106 + 68) - 168) + 125) ^ (((99 + 128) - 109) + 56);
        lIllIIIIIIIl[5] = "  ".length();
        lIllIIIIIIIl[6] = "   ".length();
        lIllIIIIIIIl[7] = (208 ^ 133) ^ (124 ^ 45);
        lIllIIIIIIIl[8] = (((102 + 48) - 27) + 8) ^ (((124 + 2) - 18) + 26);
        lIllIIIIIIIl[9] = 132 ^ 130;
        lIllIIIIIIIl[10] = (((129 + 151) - 229) + 130) ^ (((180 + 48) - 226) + 187);
    }

    private static boolean lllIIIllIlIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    public boolean run() {
        NPC f = f();
        if (lllIIIllIlIIII(f)) {
            return lIllIIIIIIIl[0];
        }
        String[] strArr = new String[lIllIIIIIIIl[1]];
        strArr[lIllIIIIIIIl[0]] = lIllIIIIIIII[lIllIIIIIIIl[0]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!lllIIIllIlIIIl(nearest) || lllIIIllIlIIlI(Reachable.isInteractable(nearest) ? 1 : 0)) {
            int[] iArr = new int[lIllIIIIIIIl[1]];
            iArr[lIllIIIIIIIl[0]] = lIllIIIIIIIl[2];
            if (lllIIIllIlIIIl(Projectiles.getNearest(iArr))) {
                int[] iArr2 = new int[lIllIIIIIIIl[1]];
                iArr2[lIllIIIIIIIl[0]] = lIllIIIIIIIl[3];
                Item first = Inventory.getFirst(iArr2);
                if (lllIIIllIlIIIl(first)) {
                    first.interact(lIllIIIIIIII[lIllIIIIIIIl[1]]);
                }
                return lIllIIIIIIIl[1];
            }
            return lIllIIIIIIIl[0];
        } else if (lllIIIllIlIIll(Combat.getCurrentHealth(), lIllIIIIIIIl[4])) {
            TeleportLoader.enterHouse();
            "".length();
            return lIllIIIIIIIl[0];
        } else {
            if (lllIIIllIlIIlI(nearest.getWorldLocation().distanceTo(Players.getLocal()))) {
                nearest.interact(lIllIIIIIIII[lIllIIIIIIIl[5]]);
                "".length();
                if ((-" ".length()) >= "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lllIIIllIlIlII(nearest.getWorldLocation().distanceTo(Players.getLocal()), lIllIIIIIIIl[1])) {
                WorldPoint worldPoint = (WorldPoint) Players.getLocal().getWorldLocation().createWorldArea(lIllIIIIIIIl[5]).toWorldPointList().stream().filter(worldPoint2 -> {
                    if (lllIIIllIlIllI(worldPoint2.distanceTo(nearest.getWorldLocation()), lIllIIIIIIIl[5])) {
                        ?? r0 = lIllIIIIIIIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIIIIIIl[0];
                }).filter(worldPoint3 -> {
                    if (lllIIIllIlIIlI(f.getWorldArea().contains(worldPoint3) ? 1 : 0)) {
                        ?? r0 = lIllIIIIIIIl[1];
                        "".length();
                        return "  ".length() < (-" ".length()) ? ((((23 + 148) - 162) + 219) ^ (((50 + 92) - 100) + 134)) & (((((209 + 54) - 87) + 70) ^ (((93 + 98) - 163) + 134)) ^ (-" ".length())) : r0;
                    }
                    return lIllIIIIIIIl[0];
                }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint4 -> {
                    return worldPoint4.distanceTo(Players.getLocal());
                })).orElse(null);
                if (lllIIIllIlIIII(worldPoint)) {
                    return lIllIIIIIIIl[0];
                }
                Movement.setDestination(worldPoint);
            }
            return lIllIIIIIIIl[1];
        }
    }

    private static boolean lllIIIllIlIIII(Object obj) {
        return obj == null;
    }

    private static String lllIIIllIIllII(String lllllllllllllllIllIIIlIllIlIlIIl, String lllllllllllllllIllIIIlIllIlIlIII) {
        try {
            SecretKeySpec lllllllllllllllIllIIIlIllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlIllIlIlIII.getBytes(StandardCharsets.UTF_8)), lIllIIIIIIIl[10]), "DES");
            Cipher lllllllllllllllIllIIIlIllIlIlIll = Cipher.getInstance("DES");
            lllllllllllllllIllIIIlIllIlIlIll.init(lIllIIIIIIIl[5], lllllllllllllllIllIIIlIllIlIllII);
            return new String(lllllllllllllllIllIIIlIllIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlIllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIlIllIlIlIlI) {
            lllllllllllllllIllIIIlIllIlIlIlI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (lllIIIllIlIlIl(npc.getName().equals(lIllIIIIIIII[lIllIIIIIIIl[6]]) ? 1 : 0) || lllIIIllIlIIlI(npc.getWorldLocation().equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return;
        }
        int[] iArr = new int[lIllIIIIIIIl[1]];
        iArr[lIllIIIIIIIl[0]] = lIllIIIIIIIl[3];
        Item first = Inventory.getFirst(iArr);
        if (lllIIIllIlIIIl(first)) {
            first.interact(lIllIIIIIIII[lIllIIIIIIIl[7]]);
        }
        npc.interact(lIllIIIIIIII[lIllIIIIIIIl[8]]);
    }

    private static boolean lllIIIllIlIllI(int i, int i2) {
        return i >= i2;
    }

    private static String lllIIIllIIllIl(String lllllllllllllllIllIIIlIllIllIllI, String lllllllllllllllIllIIIlIllIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlIllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIlIllIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIlIllIlllIII.init(lIllIIIIIIIl[5], secretKeySpec);
            return new String(lllllllllllllllIllIIIlIllIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlIllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIIlIllIllIlll) {
            lllllllllllllllIllIIIlIllIllIlll.printStackTrace();
            return null;
        }
    }

    static {
        lllIIIllIIllll();
        lllIIIllIIlllI();
        u = lIllIIIIIIIl[2];
    }

    private static boolean lllIIIllIlIlIl(int i) {
        return i != 0;
    }

    private static boolean lllIIIllIlIIIl(Object obj) {
        return obj != null;
    }

    private static boolean lllIIIllIlIIlI(int i) {
        return i == 0;
    }

    private static boolean lllIIIllIlIlII(int i, int i2) {
        return i <= i2;
    }

    private static String lllIIIllIIlIll(String lllllllllllllllIllIIIlIllIIllIIl, String lllllllllllllllIllIIIlIllIIllIII) {
        String lllllllllllllllIllIIIlIllIIllIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIlIllIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIlIllIIlIlll = new StringBuilder();
        char[] charArray = lllllllllllllllIllIIIlIllIIllIII.toCharArray();
        int lllllllllllllllIllIIIlIllIIlIlIl = lIllIIIIIIIl[0];
        char[] charArray2 = lllllllllllllllIllIIIlIllIIllIIl2.toCharArray();
        int length = charArray2.length;
        int i = lIllIIIIIIIl[0];
        while (lllIIIllIlIIll(i, length)) {
            lllllllllllllllIllIIIlIllIIlIlll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIIIlIllIIlIlIl % charArray.length]));
            "".length();
            lllllllllllllllIllIIIlIllIIlIlIl++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIIlIllIIlIlll);
    }
}
