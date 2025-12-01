package h.p000.q.i.r.s.u.s.i.e.v.a.c.g.p001.t.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireFightCavesConfig;
import gg.squire.minigames.SquireFightCavesPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "jad fight", priority = 10)
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.o  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/o.class */
public class o extends Task {
    private final /* synthetic */ f au;
    private static /* synthetic */ int[] llIIIllIllII;
    private final /* synthetic */ n aw;
    private static /* synthetic */ String[] llIIIllIlIlI;
    private final /* synthetic */ SquireFightCavesConfig av;

    private static boolean llllIllIIllIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llllIllIIllIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llllIllIIllIlI(int i) {
        return i != 0;
    }

    private static boolean llllIllIIlllII(int i) {
        return i == 0;
    }

    @Inject
    public o(f fVar, SquireFightCavesConfig squireFightCavesConfig, n nVar) {
        this.au = fVar;
        this.av = squireFightCavesConfig;
        this.aw = nVar;
    }

    private static String llllIllIIIlIlI(String lllllllllllllllIlIlIIIlllIIlIIll, String lllllllllllllllIlIlIIIlllIIlIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlllIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIlllIIlIIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIIIlllIIlIIlI.toCharArray();
        int lllllllllllllllIlIlIIIlllIIIllll = llIIIllIllII[0];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllIlIlIIIlllIIIlIII = charArray2.length;
        int i = llIIIllIllII[0];
        while (llllIllIlIIIII(i, lllllllllllllllIlIlIIIlllIIIlIII)) {
            char lllllllllllllllIlIlIIIlllIIlIlII = charArray2[i];
            lllllllllllllllIlIlIIIlllIIlIIIl.append((char) (lllllllllllllllIlIlIIIlllIIlIlII ^ charArray[lllllllllllllllIlIlIIIlllIIIllll % charArray.length]));
            "".length();
            lllllllllllllllIlIlIIIlllIIIllll++;
            i++;
            "".length();
            if ((-((107 ^ 120) ^ (146 ^ 132))) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlIIIlllIIlIIIl);
    }

    private static boolean llllIllIIlllIl(int i, int i2) {
        return i != i2;
    }

    private static boolean llllIllIIlIlll(Object obj) {
        return obj == null;
    }

    private static boolean llllIllIlIIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    public boolean run() {
        NPC nearest = NPCs.getNearest(c.v);
        if (llllIllIIlIlll(nearest)) {
            return llIIIllIllII[0];
        }
        SquireFightCavesPlugin.f = llIIIllIllII[1];
        NPC nearest2 = NPCs.getNearest(npc -> {
            if (!(llllIllIIlllIl(npc.getId(), llIIIllIllII[7]) && llllIllIIlllIl(npc.getId(), llIIIllIllII[8]) && llllIllIIlllIl(npc.getId(), llIIIllIllII[9]) && llllIllIIlllIl(npc.getId(), llIIIllIllII[10]) && !llllIllIIllllI(npc.getId(), llIIIllIllII[7])) && llllIllIIllIll(npc.getWorldLocation().distanceTo(nearest.getWorldLocation()), llIIIllIllII[11]) && llllIllIIlllII(npc.isDead() ? 1 : 0) && llllIllIIllIIl(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = llIIIllIllII[1];
                "".length();
                return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIllIllII[0];
        });
        NPC nearest3 = NPCs.getNearest(npc2 -> {
            if (!(llllIllIIlllIl(npc2.getId(), llIIIllIllII[7]) && llllIllIIlllIl(npc2.getId(), llIIIllIllII[8]) && llllIllIIlllIl(npc2.getId(), llIIIllIllII[9]) && llllIllIIlllIl(npc2.getId(), llIIIllIllII[10]) && !llllIllIIllllI(npc2.getId(), llIIIllIllII[7])) && llllIllIIlllII(npc2.isDead() ? 1 : 0) && llllIllIIlllll(npc2.getInteracting(), Players.getLocal())) {
                ?? r0 = llIIIllIllII[1];
                "".length();
                return "  ".length() < 0 ? ((197 ^ 175) ^ (54 ^ 23)) & (((64 ^ 60) ^ (134 ^ 177)) ^ (-" ".length())) : r0;
            }
            return llIIIllIllII[0];
        });
        if (llllIllIIlIlll(nearest2) && llllIllIIllIII(nearest3)) {
            SquireFightCavesPlugin.f0h = llIIIllIlIlI[llIIIllIllII[0]];
            if (llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle(Combat.AttackStyle.SECOND);
            }
            nearest3.interact(llIIIllIlIlI[llIIIllIllII[1]]);
            return llIIIllIllII[0];
        } else if (llllIllIIlIlll(nearest2) && llllIllIIlIlll(Players.getLocal().getInteracting())) {
            SquireFightCavesPlugin.f0h = llIIIllIlIlI[llIIIllIllII[2]];
            if (llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle(Combat.AttackStyle.SECOND);
            }
            nearest.interact(llIIIllIlIlI[llIIIllIllII[3]]);
            return llIIIllIllII[0];
        } else {
            List worldPointList = nearest.getWorldArea().toWorldPointList();
            if (llllIllIIllIlI(n.c(worldPointList) ? 1 : 0)) {
                WorldPoint worldPoint = (WorldPoint) Players.getLocal().getWorldLocation().createWorldArea(llIIIllIllII[4]).toWorldPointList().stream().filter(worldPoint2 -> {
                    if (llllIllIIllIlI(Reachable.isWalkable(worldPoint2) ? 1 : 0) && llllIllIIlllII(worldPointList.contains(worldPoint2) ? 1 : 0) && llllIllIIlllII(n.a(worldPoint2) ? 1 : 0)) {
                        ?? r0 = llIIIllIllII[1];
                        "".length();
                        return "   ".length() == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIllIllII[0];
                }).min(Comparator.comparingInt(worldPoint3 -> {
                    return worldPoint3.distanceTo(Players.getLocal().getWorldLocation());
                })).orElse(null);
                if (llllIllIIllIII(worldPoint)) {
                    Movement.setDestination(worldPoint);
                    return llIIIllIllII[0];
                }
            }
            if (!llllIllIIllIII(nearest2) || (llllIllIIllIlI(nearest2.isMoving() ? 1 : 0) && !llllIllIIllIll(nearest2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIIllIllII[4]))) {
                return llIIIllIllII[0];
            }
            SquireFightCavesPlugin.f0h = llIIIllIlIlI[llIIIllIllII[5]];
            if (llllIllIIllIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH) && llllIllIIlllII(this.av.avoidDefXp() ? 1 : 0)) {
                Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
            }
            nearest2.interact(llIIIllIlIlI[llIIIllIllII[6]]);
            return llIIIllIllII[0];
        }
    }

    private static boolean llllIllIIllIII(Object obj) {
        return obj != null;
    }

    private static boolean llllIllIIllllI(int i, int i2) {
        return i == i2;
    }

    static {
        llllIllIIlIllI();
        llllIllIIIlIll();
    }

    private static boolean llllIllIIlllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void llllIllIIlIllI() {
        llIIIllIllII = new int[13];
        llIIIllIllII[0] = (158 ^ 163) & ((74 ^ 119) ^ (-1));
        llIIIllIllII[1] = " ".length();
        llIIIllIllII[2] = "  ".length();
        llIIIllIllII[3] = "   ".length();
        llIIIllIllII[4] = (211 ^ 184) ^ (39 ^ 74);
        llIIIllIllII[5] = (16 ^ 51) ^ (150 ^ 177);
        llIIIllIllII[6] = (((57 + 19) - 2) + 81) ^ (((40 + 141) - 168) + 145);
        llIIIllIllII[7] = (-28871) & 31998;
        llIIIllIllII[8] = (-((-5143) & 30175)) & (-3) & 32735;
        llIIIllIllII[9] = (-8679) & 16383;
        llIIIllIllII[10] = (-((-2753) & 24285)) & (-100) & 32255;
        llIIIllIllII[11] = 64 ^ 79;
        llIIIllIllII[12] = 135 ^ 143;
    }

    private static void llllIllIIIlIll() {
        llIIIllIlIlI = new String[llIIIllIllII[4]];
        llIIIllIlIlI[llIIIllIllII[0]] = llllIllIIIlIII("V1pqegEiyDqBqiz99OLvFQ==", "pUFNl");
        llIIIllIlIlI[llIIIllIllII[1]] = llllIllIIIlIIl("Q88nago86Yk=", "VmLeM");
        llIIIllIlIlI[llIIIllIllII[2]] = llllIllIIIlIII("dUpTQFwWYNThHDxebHKmag==", "jxfKz");
        llIIIllIlIlI[llIIIllIllII[3]] = llllIllIIIlIII("UvoszjihEn8=", "WXBhX");
        llIIIllIlIlI[llIIIllIllII[5]] = llllIllIIIlIlI("OAMQIg8TVgouABgTEA==", "tvbKa");
        llIIIllIlIlI[llIIIllIllII[6]] = llllIllIIIlIlI("OQUsERAT", "xqXps");
    }

    private static String llllIllIIIlIIl(String lllllllllllllllIlIlIIIllIlllIIIl, String lllllllllllllllIlIlIIIllIlllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllIlllIIII.getBytes(StandardCharsets.UTF_8)), llIIIllIllII[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIllIllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIllIlllIIlI) {
            lllllllllllllllIlIlIIIllIlllIIlI.printStackTrace();
            return null;
        }
    }

    private static String llllIllIIIlIII(String lllllllllllllllIlIlIIIllIllllllI, String lllllllllllllllIlIlIIIllIlllllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIlllIIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIllIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIlllIIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIlllIIIIIII.init(llIIIllIllII[2], lllllllllllllllIlIlIIIlllIIIIIIl);
            return new String(lllllllllllllllIlIlIIIlllIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIllIlllllll) {
            lllllllllllllllIlIlIIIllIlllllll.printStackTrace();
            return null;
        }
    }
}
