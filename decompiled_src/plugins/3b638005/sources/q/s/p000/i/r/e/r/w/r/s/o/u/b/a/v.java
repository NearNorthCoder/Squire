package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Attacking monster for potential", priority = 200)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.v  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/v.class */
public class v extends Task {
    private final /* synthetic */ a ai;
    private final /* synthetic */ c aj;
    private static /* synthetic */ String[] llllIlIllIl;
    private final /* synthetic */ SquireBarrows ah;
    private static /* synthetic */ int[] llllIlIllll;

    private static boolean lIllIllIIIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    public boolean run() {
        if (!lIllIllIIIIIIl(this.ah.g() ? 1 : 0) && !lIllIllIIIIIlI(this.ah.h() ? 1 : 0)) {
            Actor interacting = Players.getLocal().getInteracting();
            if ((!lIllIllIIIIIll(interacting) || !lIllIllIIIIIIl(d.a(interacting) ? 1 : 0)) && !lIllIllIIIIIIl(this.ah.v() ? 1 : 0)) {
                int d = this.aj.d();
                Player local = Players.getLocal();
                List all = NPCs.getAll(npc -> {
                    if (lIllIllIIIIllI(npc.getInteracting(), local) && lIllIllIIIIIIl(this.aj.c(d).contains(npc.getName()) ? 1 : 0)) {
                        ?? r0 = llllIlIllll[2];
                        "".length();
                        return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIlIllll[0];
                });
                NPC nearest = NPCs.getNearest(npc2 -> {
                    if (lIllIllIIIIllI(npc2.getInteracting(), local) && lIllIllIIIIIIl(Reachable.isInteractable(npc2) ? 1 : 0)) {
                        ?? r0 = llllIlIllll[2];
                        "".length();
                        return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIlIllll[0];
                });
                if (lIllIllIIIIIll(nearest) && lIllIllIIIIIIl(all.contains(nearest) ? 1 : 0)) {
                    if (lIllIllIIIIIlI(Gear.isEquipped(this.ai.B()) ? 1 : 0)) {
                        Gear.swapTo(this.ai.B());
                        "".length();
                    }
                    if (lIllIllIIIIlII(local.getInteracting(), nearest)) {
                        nearest.interact(llllIlIllIl[llllIlIllll[0]]);
                        sleep(llllIlIllll[1]);
                        return llllIlIllll[2];
                    }
                    return llllIlIllll[0];
                }
                NPC nearest2 = NPCs.getNearest(npc3 -> {
                    if (lIllIllIIIIIIl(all.contains(npc3) ? 1 : 0) && lIllIllIIIIIIl(Reachable.isInteractable(npc3) ? 1 : 0)) {
                        ?? r0 = llllIlIllll[2];
                        "".length();
                        return (((197 ^ 187) ^ (222 ^ 167)) & (((((89 + 81) - 139) + 125) ^ (((35 + 147) - 34) + 7)) ^ (-" ".length()))) != (((121 ^ 64) ^ (123 ^ 2)) & (((((21 + 33) - (-55)) + 20) ^ (((156 + 150) - 251) + 138)) ^ (-" ".length()))) ? ((((91 + 36) - 15) + 15) ^ (111 ^ 83)) & (((72 ^ 83) ^ (124 ^ 36)) ^ (-" ".length())) : r0;
                    }
                    return llllIlIllll[0];
                });
                if (lIllIllIIIIIll(nearest2) && (!lIllIllIIIIIll(nearest) || !lIllIllIIIIIlI(Reachable.isInteractable(nearest) ? 1 : 0))) {
                    nearest2.interact(llllIlIllIl[llllIlIllll[1]]);
                    return llllIlIllll[0];
                }
                TileObject nearest3 = TileObjects.getNearest(tileObject -> {
                    if (lIllIllIIIIIIl(tileObject.getName().equals(llllIlIllIl[llllIlIllll[5]]) ? 1 : 0)) {
                        String[] strArr = new String[llllIlIllll[1]];
                        strArr[llllIlIllll[0]] = llllIlIllIl[llllIlIllll[6]];
                        strArr[llllIlIllll[2]] = llllIlIllIl[llllIlIllll[7]];
                        if (lIllIllIIIIIIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llllIlIllll[2];
                            "".length();
                            return (-" ".length()) >= (((((89 + 147) - 85) + 2) ^ (((29 + 102) - 7) + 71)) & (((((157 + 221) - 256) + 113) ^ (((136 + 21) - 33) + 53)) ^ (-" ".length()))) ? ((85 ^ 105) ^ (29 ^ 107)) & (((13 ^ 35) ^ (231 ^ 131)) ^ (-" ".length())) : r0;
                        }
                    }
                    return llllIlIllll[0];
                });
                if (lIllIllIIIIIll(nearest3) && lIllIllIIIIIlI(Reachable.isInteractable(nearest3) ? 1 : 0)) {
                    return llllIlIllll[0];
                }
                TileObject nearest4 = TileObjects.getNearest(tileObject2 -> {
                    if (lIllIllIIIIIIl(tileObject2.getName().equals(llllIlIllIl[llllIlIllll[3]]) ? 1 : 0)) {
                        String[] strArr = new String[llllIlIllll[2]];
                        strArr[llllIlIllll[0]] = llllIlIllIl[llllIlIllll[4]];
                        if (lIllIllIIIIIIl(tileObject2.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llllIlIllll[2];
                            "".length();
                            return (-" ".length()) == (((9 ^ 112) ^ (177 ^ 171)) & (((117 ^ 103) ^ (117 ^ 4)) ^ (-" ".length()))) ? ((((14 + 124) - 136) + 208) ^ (((14 + 66) - (-27)) + 37)) & (("  ".length() ^ (51 ^ 115)) ^ (-" ".length())) : r0;
                        }
                    }
                    return llllIlIllll[0];
                });
                if (lIllIllIIIIlIl(nearest4)) {
                    return llllIlIllll[0];
                }
                nearest4.interact(llllIlIllIl[llllIlIllll[2]]);
                sleep(llllIlIllll[3]);
                return llllIlIllll[2];
            }
            return llllIlIllll[0];
        }
        return llllIlIllll[0];
    }

    private static String lIllIlIllllIIl(String llllllllllllllllIIIllIIlIIIIIlll, String llllllllllllllllIIIllIIlIIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), llllIlIllll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIllll[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIIlIIIIlIII) {
            llllllllllllllllIIIllIIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIllIllIIIIIII() {
        llllIlIllll = new int[9];
        llllIlIllll[0] = ((197 ^ 192) ^ (20 ^ 38)) & (((28 ^ 110) ^ (196 ^ 129)) ^ (-" ".length()));
        llllIlIllll[1] = "  ".length();
        llllIlIllll[2] = " ".length();
        llllIlIllll[3] = "   ".length();
        llllIlIllll[4] = (((140 + 20) - 59) + 65) ^ (((77 + 107) - 60) + 38);
        llllIlIllll[5] = 37 ^ 32;
        llllIlIllll[6] = 118 ^ 112;
        llllIlIllll[7] = (((152 + 51) - 69) + 34) ^ (((13 + 150) - 66) + 78);
        llllIlIllll[8] = 82 ^ 90;
    }

    private static boolean lIllIllIIIIIlI(int i) {
        return i == 0;
    }

    private static boolean lIllIllIIIIlIl(Object obj) {
        return obj == null;
    }

    static {
        lIllIllIIIIIII();
        lIllIlIllllllI();
    }

    private static String lIllIlIllllIII(String llllllllllllllllIIIllIIlIIIlIlII, String llllllllllllllllIIIllIIlIIIlIIll) {
        try {
            SecretKeySpec llllllllllllllllIIIllIIlIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIlIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIIlIIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIIlIIIlIllI.init(llllIlIllll[1], llllllllllllllllIIIllIIlIIIlIlll);
            return new String(llllllllllllllllIIIllIIlIIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIlIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIIlIIIlIlIl) {
            llllllllllllllllIIIllIIlIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIllIllIIIIlll(int i, int i2) {
        return i < i2;
    }

    private static void lIllIlIllllllI() {
        llllIlIllIl = new String[llllIlIllll[8]];
        llllIlIllIl[llllIlIllll[0]] = lIllIlIllllIII("vVNodsJbOLU=", "gzraj");
        llllIlIllIl[llllIlIllll[2]] = lIllIlIllllIIl("7gUg9c1GTu4=", "ZsXme");
        llllIlIllIl[llllIlIllll[1]] = lIllIlIllllIlI("LDY+KysG", "mBJJH");
        llllIlIllIl[llllIlIllll[3]] = lIllIlIllllIlI("AisgNQ==", "FDOGb");
        llllIlIllIl[llllIlIllll[4]] = lIllIlIllllIIl("Vi3fClargu0=", "HlCEH");
        llllIlIllIl[llllIlIllll[5]] = lIllIlIllllIII("0LUNVJf3LkY=", "VxyVJ");
        llllIlIllIl[llllIlIllll[6]] = lIllIlIllllIII("3srPRqmOQaw=", "xyfOS");
        llllIlIllIl[llllIlIllll[7]] = lIllIlIllllIII("3a3LwFMRM1Q=", "GxerD");
    }

    private static boolean lIllIllIIIIIll(Object obj) {
        return obj != null;
    }

    private static String lIllIlIllllIlI(String llllllllllllllllIIIllIIIllllIlll, String llllllllllllllllIIIllIIIllllIllI) {
        String llllllllllllllllIIIllIIIllllIlll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIIIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIIIllllIlIl = new StringBuilder();
        char[] llllllllllllllllIIIllIIIllllIlII = llllllllllllllllIIIllIIIllllIllI.toCharArray();
        int llllllllllllllllIIIllIIIllllIIll = llllIlIllll[0];
        char[] charArray = llllllllllllllllIIIllIIIllllIlll2.toCharArray();
        int length = charArray.length;
        int i = llllIlIllll[0];
        while (lIllIllIIIIlll(i, length)) {
            char llllllllllllllllIIIllIIIlllllIII = charArray[i];
            llllllllllllllllIIIllIIIllllIlIl.append((char) (llllllllllllllllIIIllIIIlllllIII ^ llllllllllllllllIIIllIIIllllIlII[llllllllllllllllIIIllIIIllllIIll % llllllllllllllllIIIllIIIllllIlII.length]));
            "".length();
            llllllllllllllllIIIllIIIllllIIll++;
            i++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIIllIIIllllIlIl);
    }

    @Inject
    public v(SquireBarrows squireBarrows, a aVar, c cVar) {
        this.ah = squireBarrows;
        this.ai = aVar;
        this.aj = cVar;
    }
}
