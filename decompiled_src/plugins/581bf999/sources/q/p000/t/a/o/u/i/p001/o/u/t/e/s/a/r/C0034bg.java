package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Killing annoying egg", priority = 20, register = true, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bg  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bg.class */
public class C0034bg extends AbstractC0035bh {
    private static /* synthetic */ String[] llIlIllIlll;
    private static /* synthetic */ int[] llIlIlllIII;
    private static final /* synthetic */ int eM;
    private static final /* synthetic */ Point eL;

    private static void lIlIlIIIIIIIIl() {
        llIlIllIlll = new String[llIlIlllIII[8]];
        llIlIllIlll[llIlIlllIII[1]] = lIlIIllllllllI("CGJohn7fhOc=", "TfeXj");
        llIlIllIlll[llIlIlllIII[3]] = lIlIIllllllllI("uwcoeCmkBwk=", "CDZLw");
        llIlIllIlll[llIlIlllIII[2]] = lIlIIlllllllll("I4TN4HH16Xk=", "KshMd");
        llIlIllIlll[llIlIlllIII[4]] = lIlIlIIIIIIIII("LQ0l", "HjBdr");
        llIlIllIlll[llIlIlllIII[0]] = lIlIIllllllllI("f7VHvueCUf8=", "yMgZs");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh
    protected boolean bL() {
        if (!lIlIlIIIIIIIll(bV() ? 1 : 0) || lIlIlIIIIIIlII(bR() ? 1 : 0)) {
            sleep(llIlIlllIII[0]);
            return llIlIlllIII[1];
        }
        WorldPoint a = a(eL);
        NPC npc = (NPC) NPCs.getAll(npc2 -> {
            if (lIlIlIIIIIIlII(npc2.getName().toLowerCase().contains(llIlIllIlll[llIlIlllIII[4]]) ? 1 : 0)) {
                String[] strArr = new String[llIlIlllIII[3]];
                strArr[llIlIlllIII[1]] = llIlIllIlll[llIlIlllIII[0]];
                if (lIlIlIIIIIIlII(npc2.hasAction(strArr) ? 1 : 0) && lIlIlIIIIIIlII(npc2.getWorldLocation().equals(a) ? 1 : 0) && lIlIlIIIIIIlll(npc2.getId(), llIlIlllIII[5]) && lIlIlIIIIIIIll(npc2.isDead() ? 1 : 0)) {
                    ?? r0 = llIlIlllIII[3];
                    "".length();
                    return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return llIlIlllIII[1];
        }).stream().findFirst().orElse(null);
        if (!lIlIlIIIIIIlIl(npc) && !lIlIlIIIIIIIll(npc.getWorldArea().offset(llIlIlllIII[2]).contains(Players.getLocal()) ? 1 : 0)) {
            Set<WorldPoint> bU = bU();
            WorldArea offset = npc.getWorldArea().offset(llIlIlllIII[3]);
            if (lIlIlIIIIIIlII(bU.stream().anyMatch(worldPoint -> {
                return npc.getWorldArea().offset(llIlIlllIII[3]).contains(worldPoint);
            }) ? 1 : 0)) {
                WorldPoint worldPoint2 = (WorldPoint) offset.toWorldPointList().stream().filter(worldPoint3 -> {
                    return worldPoint3.toWorldArea().isInMeleeDistance(npc.getWorldLocation());
                }).filter(worldPoint4 -> {
                    if (lIlIlIIIIIIIll(bU.contains(worldPoint4) ? 1 : 0)) {
                        ?? r0 = llIlIlllIII[3];
                        "".length();
                        return ((75 ^ 83) ^ (109 ^ 113)) <= "  ".length() ? ((111 ^ 39) ^ (247 ^ 154)) & (((((28 + 65) - 38) + 99) ^ (((27 + 126) - 20) + 58)) ^ (-" ".length())) : r0;
                    }
                    return llIlIlllIII[1];
                }).findFirst().orElse(null);
                if (lIlIlIIIIIIlIl(worldPoint2)) {
                    return llIlIlllIII[1];
                }
                Movement.setDestination(worldPoint2);
                return llIlIlllIII[1];
            }
            bp();
            Item first = Inventory.getFirst(item -> {
                return item.getName().toLowerCase().contains(llIlIllIlll[llIlIlllIII[2]]);
            });
            if (lIlIlIIIIIIllI(first)) {
                first.interact(llIlIllIlll[llIlIlllIII[1]]);
            }
            npc.interact(llIlIllIlll[llIlIlllIII[3]]);
            return llIlIlllIII[3];
        }
        return llIlIlllIII[1];
    }

    private static String lIlIIllllllllI(String llllllllllllllllIIllIIIIlllIIIlI, String llllllllllllllllIIllIIIIlllIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIIlllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIlllIIIIl.getBytes(StandardCharsets.UTF_8)), llIlIlllIII[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIlllIII[2], llllllllllllllllIIllIIIIlllIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIIIlllIIIll) {
            llllllllllllllllIIllIIIIlllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIIIlIII(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlIIIIIIIII(String llllllllllllllllIIllIIIlIIIIIlII, String llllllllllllllllIIllIIIIlllllllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIllIIIlIIIIIIIl = llllllllllllllllIIllIIIIlllllllI.toCharArray();
        int llllllllllllllllIIllIIIlIIIIIIII = llIlIlllIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlIlllIII[1];
        while (lIlIlIIIIIlIII(i, length)) {
            char llllllllllllllllIIllIIIIllllIlll = charArray[i];
            sb.append((char) (llllllllllllllllIIllIIIIllllIlll ^ llllllllllllllllIIllIIIlIIIIIIIl[llllllllllllllllIIllIIIlIIIIIIII % llllllllllllllllIIllIIIlIIIIIIIl.length]));
            "".length();
            llllllllllllllllIIllIIIlIIIIIIII++;
            i++;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public C0034bg(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static void lIlIlIIIIIIIlI() {
        llIlIlllIII = new int[10];
        llIlIlllIII[0] = (103 ^ 12) ^ (101 ^ 10);
        llIlIlllIII[1] = (148 ^ 190) & ((18 ^ 56) ^ (-1));
        llIlIlllIII[2] = "  ".length();
        llIlIlllIII[3] = " ".length();
        llIlIlllIII[4] = "   ".length();
        llIlIlllIII[5] = (-((-7881) & 24303)) & (-10) & 28159;
        llIlIlllIII[6] = 109 ^ 114;
        llIlIlllIII[7] = (107 ^ 52) ^ (37 ^ 94);
        llIlIlllIII[8] = 132 ^ 129;
        llIlIlllIII[9] = 23 ^ 31;
    }

    private static boolean lIlIlIIIIIIllI(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIIIIIIIll(int i) {
        return i == 0;
    }

    private static boolean lIlIlIIIIIIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIlIIIIIIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIIIIIIlII(int i) {
        return i != 0;
    }

    static {
        lIlIlIIIIIIIlI();
        lIlIlIIIIIIIIl();
        eM = llIlIlllIII[5];
        eL = new Point(llIlIlllIII[6], llIlIlllIII[7]);
    }

    private static String lIlIIlllllllll(String llllllllllllllllIIllIIIIlllIllll, String llllllllllllllllIIllIIIIlllIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIlllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIlllIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllIIIIllllIIII) {
            llllllllllllllllIIllIIIIllllIIII.printStackTrace();
            return null;
        }
    }
}
