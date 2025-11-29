package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Going to house (mid trip)", priority = 300, blocking = true)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.s  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/s.class */
public class s extends Task {
    private final /* synthetic */ SquireBarrowsConfig ac;
    private final /* synthetic */ Client ae;
    private final /* synthetic */ SquireBarrows ab;
    private static /* synthetic */ String[] llllIllIIll;
    private final /* synthetic */ c ad;
    private static /* synthetic */ int[] llllIllIlII;

    private static boolean lIllIllIIllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIllIllIIIllIl(String llllllllllllllllIIIllIIIIlllllIl, String llllllllllllllllIIIllIIIIlllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIIIlllllII.getBytes(StandardCharsets.UTF_8)), llllIllIlII[7]), "DES");
            Cipher llllllllllllllllIIIllIIIIlllllll = Cipher.getInstance("DES");
            llllllllllllllllIIIllIIIIlllllll.init(llllIllIlII[6], secretKeySpec);
            return new String(llllllllllllllllIIIllIIIIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIIIIllllIIl) {
            llllllllllllllllIIIllIIIIllllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIlIllI(int i) {
        return i > 0;
    }

    private static void lIllIllIIlIIII() {
        llllIllIlII = new int[8];
        llllIllIlII[0] = (19 ^ 94) & ((55 ^ 122) ^ (-1));
        llllIllIlII[1] = (((130 + 124) - 167) + 75) ^ (((3 + 120) - 26) + 67);
        llllIllIlII[2] = (233 ^ 165) ^ (103 ^ 46);
        llllIllIlII[3] = 154 ^ 131;
        llllIllIlII[4] = " ".length();
        llllIllIlII[5] = (51 ^ 101) ^ (54 ^ 106);
        llllIllIlII[6] = "  ".length();
        llllIllIlII[7] = (219 ^ 193) ^ (110 ^ 124);
    }

    private static boolean lIllIllIIlIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lIllIllIIlIIII();
        lIllIllIIIllll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean N() {
        if (lIllIllIIlIIll(this.ac.neverRisk() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        if (!lIllIllIIlIIll(this.ab.m() ? 1 : 0) || lIllIllIIlIIlI(this.ab.h() ? 1 : 0)) {
            return llllIllIlII[0];
        }
        NPC interacting = Players.getLocal().getInteracting();
        if (lIllIllIIllIII(interacting)) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIllIllIIllIlI(npc.getInteracting(), Players.getLocal())) {
                    ?? r0 = llllIllIlII[4];
                    "".length();
                    return " ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIllIlII[0];
            });
            if (lIllIllIIllIII(nearest)) {
                return llllIllIlII[4];
            }
            if (!lIllIllIIlIIll(d.a(nearest) ? 1 : 0) || lIllIllIIllIIl(nearest.getHealthRatio(), llllIllIlII[5])) {
                ?? r0 = llllIllIlII[4];
                "".length();
                return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIllIlII[0];
        } else if (lIllIllIIlIIll(interacting instanceof Player ? 1 : 0)) {
            return llllIllIlII[0];
        } else {
            if (lIllIllIIlIIll(this.ad.b(this.ab.d()).contains(interacting) ? 1 : 0)) {
                return llllIllIlII[4];
            }
            if (lIllIllIIlIIll(interacting.getName().equals(d.DHAROK.C()) ? 1 : 0)) {
                return llllIllIlII[0];
            }
            if (!lIllIllIIlIIll(d.a(interacting) ? 1 : 0) || lIllIllIIllIIl(interacting.getHealthRatio(), llllIllIlII[5])) {
                ?? r02 = llllIllIlII[4];
                "".length();
                return "  ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
            }
            return llllIllIlII[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public boolean run() {
        if (!lIllIllIIlIIIl(Game.getState(), GameState.LOGGED_IN) && !lIllIllIIlIIlI(this.ac.restoreMidTrip() ? 1 : 0) && !lIllIllIIlIIll(this.ae.isInInstancedRegion() ? 1 : 0) && !lIllIllIIlIlII(this.ab.e(), llllIllIlII[1]) && !lIllIllIIlIIll(N() ? 1 : 0)) {
            int points = Prayers.getPoints();
            int llllllllllllllllIIIllIIIlIIlIIIl = Skills.getLevel(Skill.PRAYER) - points;
            if (lIllIllIIlIlII(this.ab.e(), llllIllIlII[2]) && lIllIllIIlIlIl(llllllllllllllllIIIllIIIlIIlIIIl, llllIllIlII[3]) && lIllIllIIlIIlI(this.ab.h() ? 1 : 0)) {
                Log.info(llllIllIIll[llllIllIlII[0]]);
                TeleportLoader.enterHouse();
                "".length();
                return llllIllIlII[4];
            } else if (lIllIllIIlIllI(points)) {
                return llllIllIlII[0];
            } else {
                Item first = Inventory.getFirst(item -> {
                    return item.getName().startsWith(llllIllIIll[llllIllIlII[4]]);
                });
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIllIllIIllIlI(npc.getInteracting(), Players.getLocal()) && lIllIllIIlIIll(d.a(npc) ? 1 : 0)) {
                        ?? r0 = llllIllIlII[4];
                        "".length();
                        return " ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIllIlII[0];
                });
                if (lIllIllIIlIlll(first) && lIllIllIIlIlll(nearest)) {
                    return llllIllIlII[0];
                }
                TeleportLoader.enterHouse();
                "".length();
                return llllIllIlII[4];
            }
        }
        return llllIllIlII[0];
    }

    private static void lIllIllIIIllll() {
        llllIllIIll = new String[llllIllIlII[6]];
        llllIllIIll[llllIllIlII[0]] = lIllIllIIIllIl("0eQeINsyhCr1YcKR8GDWh4EzmJZ2ASSKythSXrEu3as=", "WZoZb");
        llllIllIIll[llllIllIlII[4]] = lIllIllIIIlllI("D7JR62OTVzY=", "TicOx");
    }

    private static boolean lIllIllIIllIIl(int i, int i2) {
        return i <= i2;
    }

    @Inject
    public s(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig, c cVar, Client client) {
        this.ab = squireBarrows;
        this.ac = squireBarrowsConfig;
        this.ad = cVar;
        this.ae = client;
    }

    private static boolean lIllIllIIlIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIllIllIIlIIll(int i) {
        return i != 0;
    }

    private static boolean lIllIllIIlIIlI(int i) {
        return i == 0;
    }

    private static boolean lIllIllIIlIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIllIIllIII(Object obj) {
        return obj == null;
    }

    private static String lIllIllIIIlllI(String llllllllllllllllIIIllIIIIlllIIII, String llllllllllllllllIIIllIIIIllIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIIIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIllIlII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIIIIlllIIIl) {
            llllllllllllllllIIIllIIIIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIlIlII(int i, int i2) {
        return i == i2;
    }
}
