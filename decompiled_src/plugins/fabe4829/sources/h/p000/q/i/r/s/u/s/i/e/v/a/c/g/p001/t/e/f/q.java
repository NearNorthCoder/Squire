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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
@TaskDesc(name = "wave 1 to 6 Task", priority = 10)
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.q  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/q.class */
public class q extends Task {
    private static /* synthetic */ int[] llIIlIIIIlII;
    private static /* synthetic */ String[] llIIlIIIIIll;
    private final /* synthetic */ f aA;
    private final /* synthetic */ SquireFightCavesConfig aB;
    private final /* synthetic */ n aC;

    static {
        lllllIIIIIIIll();
        lllllIIIIIIIlI();
    }

    private static boolean lllllIIIIIIlIl(int i) {
        return i == 0;
    }

    private static boolean lllllIIIIIIlII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lllllIIIIIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllllIIIIIlIIl(int i, int i2) {
        return i == i2;
    }

    @Inject
    public q(f fVar, SquireFightCavesConfig squireFightCavesConfig, n nVar) {
        this.aA = fVar;
        this.aB = squireFightCavesConfig;
        this.aC = nVar;
    }

    private static void lllllIIIIIIIlI() {
        llIIlIIIIIll = new String[llIIlIIIIlII[0]];
        llIIlIIIIIll[llIIlIIIIlII[1]] = llllIlllllllll("KEIB0NllfpZOWXXvkyvDPg==", "vBmfm");
        llIIlIIIIIll[llIIlIIIIlII[2]] = lllllIIIIIIIII("FxM9FCk9", "VgIuJ");
        llIIlIIIIIll[llIIlIIIIlII[3]] = llllIlllllllll("NE/pW9oq52OItyaxXbi+2a4+p3l/NZvh", "EQNBh");
        llIIlIIIIIll[llIIlIIIIlII[4]] = lllllIIIIIIIIl("kN8hiUdqwTA=", "bVklF");
        llIIlIIIIIll[llIIlIIIIlII[5]] = llllIlllllllll("yBrFBudMMIYhKzGgSwGnXFP80EoqIr+y", "arBDQ");
        llIIlIIIIIll[llIIlIIIIlII[6]] = lllllIIIIIIIII("Kz8mLBcB", "jKRMt");
    }

    private static String lllllIIIIIIIIl(String lllllllllllllllIlIlIIIIIIIIlIIll, String lllllllllllllllIlIlIIIIIIIIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), llIIlIIIIlII[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIIIlII[3], lllllllllllllllIlIlIIIIIIIIlIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIIIIIlIlII) {
            lllllllllllllllIlIlIIIIIIIIlIlII.printStackTrace();
            return null;
        }
    }

    private static String lllllIIIIIIIII(String lllllllllllllllIlIIlllllllllIllI, String lllllllllllllllIlIIlllllllllIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllllllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllllllllIlII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIlllllllllIlIl.toCharArray();
        int lllllllllllllllIlIIlllllllllIIlI = llIIlIIIIlII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIIIlII[1];
        while (lllllIIIIIlIll(i, length)) {
            lllllllllllllllIlIIlllllllllIlII.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIlllllllllIIlI % charArray.length]));
            "".length();
            lllllllllllllllIlIIlllllllllIIlI++;
            i++;
            "".length();
            if (((110 ^ 21) ^ (37 ^ 91)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlllllllllIlII);
    }

    private static void lllllIIIIIIIll() {
        llIIlIIIIlII = new int[13];
        llIIlIIIIlII[0] = 161 ^ 167;
        llIIlIIIIlII[1] = ((56 ^ 44) ^ (93 ^ 84)) & (((127 ^ 98) ^ ((101 ^ 79) & ((61 ^ 23) ^ (-1)))) ^ (-" ".length())) & ((((37 ^ 3) ^ (169 ^ 152)) & (((81 ^ 36) ^ (231 ^ 133)) ^ (-" ".length()))) ^ (-" ".length()));
        llIIlIIIIlII[2] = " ".length();
        llIIlIIIIlII[3] = "  ".length();
        llIIlIIIIlII[4] = "   ".length();
        llIIlIIIIlII[5] = 78 ^ 74;
        llIIlIIIIlII[6] = (((36 + 132) - 69) + 51) ^ (((133 + 124) - 200) + 90);
        llIIlIIIIlII[7] = (-((-3073) & 24195)) & (-8521) & 32762;
        llIIlIIIIlII[8] = (-((-25102) & 25551)) & (-24577) & 28143;
        llIIlIIIIlII[9] = (-((-8209) & 25169)) & (-4241) & 24319;
        llIIlIIIIlII[10] = (-4675) & 7790;
        llIIlIIIIlII[11] = (-((-17613) & 30687)) & (-129) & 16319;
        llIIlIIIIlII[12] = (43 ^ 94) ^ (5 ^ 120);
    }

    private static boolean lllllIIIIIlIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllllIIIIIlIII(Object obj) {
        return obj == null;
    }

    private static boolean lllllIIIIIIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (!lllllIIIIIIlII(f.p(), llIIlIIIIlII[0]) || lllllIIIIIIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llIIlIIIIlII[1];
        }
        SquireFightCavesPlugin.f = llIIlIIIIlII[2];
        NPC nearest = NPCs.getNearest(npc -> {
            if ((!lllllIIIIIlIlI(npc.getId(), llIIlIIIIlII[10]) || lllllIIIIIlIIl(npc.getId(), llIIlIIIIlII[11])) && lllllIIIIIIlIl(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIIlII[2];
                "".length();
                return 0 != 0 ? ((26 ^ 40) ^ "   ".length()) & (((128 ^ 180) ^ (49 ^ 52)) ^ (-" ".length())) : r0;
            }
            return llIIlIIIIlII[1];
        });
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            if ((!lllllIIIIIlIlI(npc2.getId(), llIIlIIIIlII[8]) || lllllIIIIIlIIl(npc2.getId(), llIIlIIIIlII[9])) && lllllIIIIIIlIl(npc2.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIIlII[2];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIIIlII[1];
        });
        NPC nearest3 = NPCs.getNearest(npc3 -> {
            if (lllllIIIIIlIIl(npc3.getId(), llIIlIIIIlII[7]) && lllllIIIIIIlIl(npc3.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIIlII[2];
                "".length();
                return "  ".length() == ((66 ^ 78) ^ (89 ^ 81)) ? ((((87 + 132) - 160) + 187) ^ (((65 + 84) - 110) + 124)) & (((142 ^ 199) ^ (48 ^ 44)) ^ (-" ".length())) : r0;
            }
            return llIIlIIIIlII[1];
        });
        if (lllllIIIIIIllI(nearest) && ((!lllllIIIIIIllI(Players.getLocal().getInteracting()) || (lllllIIIIIIllI(Players.getLocal().getInteracting()) && lllllIIIIIIlll(Players.getLocal().getInteracting().getName(), nearest.getName()))) && lllllIIIIIIlIl(nearest.isDead() ? 1 : 0))) {
            SquireFightCavesPlugin.f0h = llIIlIIIIIll[llIIlIIIIlII[1]];
            nearest.interact(llIIlIIIIIll[llIIlIIIIlII[2]]);
            return llIIlIIIIlII[1];
        } else if (lllllIIIIIIllI(nearest3) && lllllIIIIIlIII(Players.getLocal().getInteracting()) && lllllIIIIIIlIl(nearest3.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.f0h = llIIlIIIIIll[llIIlIIIIlII[3]];
            nearest3.interact(llIIlIIIIIll[llIIlIIIIlII[4]]);
            return llIIlIIIIlII[1];
        } else if (lllllIIIIIIllI(nearest2) && lllllIIIIIlIII(Players.getLocal().getInteracting()) && lllllIIIIIIlIl(nearest2.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.f0h = llIIlIIIIIll[llIIlIIIIlII[5]];
            nearest2.interact(llIIlIIIIIll[llIIlIIIIlII[6]]);
            return llIIlIIIIlII[1];
        } else {
            return llIIlIIIIlII[1];
        }
    }

    private static String llllIlllllllll(String lllllllllllllllIlIlIIIIIIIIIIllI, String lllllllllllllllIlIlIIIIIIIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIIIIlII[3], lllllllllllllllIlIlIIIIIIIIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIIIIIIIlll) {
            lllllllllllllllIlIlIIIIIIIIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIIIlIlI(int i, int i2) {
        return i != i2;
    }
}
