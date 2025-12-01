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
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "wave 7 to 14 Task", priority = 10)
/* renamed from: h.-.q.i.r.s.u.s.i.e.v.a.c.g.-.t.e.f.s  reason: invalid package */
/* loaded from: fabe4829-ed55-47a3-b654-ca361772d01e.jar:h/-/q/i/r/s/u/s/i/e/v/a/c/g/-/t/e/f/s.class */
public class s extends Task {
    private final /* synthetic */ SquireFightCavesConfig aH;
    private static /* synthetic */ String[] llIIlIIIlIll;
    private final /* synthetic */ n aI;
    private final /* synthetic */ f aG;
    private static /* synthetic */ int[] llIIlIIIllIl;

    private static boolean lllllIIIllIIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Inject
    public s(f fVar, SquireFightCavesConfig squireFightCavesConfig, n nVar) {
        this.aG = fVar;
        this.aH = squireFightCavesConfig;
        this.aI = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    public boolean run() {
        int p = f.p();
        if (!lllllIIIllIIIl(p, llIIlIIIllIl[0]) || lllllIIIllIIlI(p, llIIlIIIllIl[1])) {
            return llIIlIIIllIl[2];
        }
        SquireFightCavesPlugin.f = llIIlIIIllIl[3];
        if (lllllIIIllIIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        n.G();
        NPC nearest = NPCs.getNearest(npc -> {
            if ((!lllllIIIlllIII(npc.getId(), llIIlIIIllIl[14]) || lllllIIIlllIIl(npc.getId(), llIIlIIIllIl[15])) && lllllIIIllIlIl(npc.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllIl[4]) && lllllIIIllIllI(npc.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIllIl[3];
                "".length();
                return " ".length() == (53 ^ 49) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIIllIl[2];
        });
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            if ((!lllllIIIlllIII(npc2.getId(), llIIlIIIllIl[12]) || lllllIIIlllIIl(npc2.getId(), llIIlIIIllIl[13])) && lllllIIIllIllI(npc2.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIllIl[3];
                "".length();
                return ((((123 + 140) - 233) + 112) ^ (((65 + 20) - 2) + 55)) > ((76 ^ 50) ^ (244 ^ 142)) ? ((17 ^ 44) ^ (201 ^ 194)) & (((77 ^ 28) ^ (9 ^ 110)) ^ (-" ".length())) : r0;
            }
            return llIIlIIIllIl[2];
        });
        NPC nearest3 = NPCs.getNearest(npc3 -> {
            if (lllllIIIlllIIl(npc3.getId(), llIIlIIIllIl[11]) && lllllIIIllIllI(npc3.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIllIl[3];
                "".length();
                return (194 ^ 198) > (78 ^ 74) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIIllIl[2];
        });
        NPC nearest4 = NPCs.getNearest(npc4 -> {
            if ((!lllllIIIlllIII(npc4.getId(), llIIlIIIllIl[9]) || lllllIIIlllIIl(npc4.getId(), llIIlIIIllIl[10])) && lllllIIIllIllI(npc4.isDead() ? 1 : 0)) {
                ?? r0 = llIIlIIIllIl[3];
                "".length();
                return "   ".length() < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIIllIl[2];
        });
        if (lllllIIIllIlII(nearest) && lllllIIIllIlIl(nearest.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIlIIIllIl[4]) && ((!lllllIIIllIlII(Players.getLocal().getInteracting()) || (lllllIIIllIlII(Players.getLocal().getInteracting()) && lllllIIIllIIll(Players.getLocal().getInteracting().getName(), nearest.getName()))) && lllllIIIllIllI(nearest.isDead() ? 1 : 0))) {
            SquireFightCavesPlugin.f0h = llIIlIIIlIll[llIIlIIIllIl[2]];
            nearest.interact(llIIlIIIlIll[llIIlIIIllIl[3]]);
            return llIIlIIIllIl[2];
        } else if (lllllIIIllIlII(nearest4) && lllllIIIllIlll(nearest) && lllllIIIllIlll(Players.getLocal().getInteracting()) && lllllIIIllIllI(nearest4.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.f0h = llIIlIIIlIll[llIIlIIIllIl[5]];
            nearest4.interact(llIIlIIIlIll[llIIlIIIllIl[6]]);
            return llIIlIIIllIl[2];
        } else if (lllllIIIllIlII(nearest3) && lllllIIIllIlll(nearest) && ((!lllllIIIllIlII(Players.getLocal().getInteracting()) || (lllllIIIllIlII(Players.getLocal().getInteracting()) && lllllIIIllIIll(Players.getLocal().getInteracting().getName(), nearest3.getName()))) && lllllIIIllIllI(nearest3.isDead() ? 1 : 0))) {
            SquireFightCavesPlugin.f0h = llIIlIIIlIll[llIIlIIIllIl[7]];
            nearest3.interact(llIIlIIIlIll[llIIlIIIllIl[8]]);
            return llIIlIIIllIl[2];
        } else if (lllllIIIllIlII(nearest2) && lllllIIIllIlll(nearest) && lllllIIIllIlll(Players.getLocal().getInteracting()) && lllllIIIllIllI(nearest2.isDead() ? 1 : 0)) {
            SquireFightCavesPlugin.f0h = llIIlIIIlIll[llIIlIIIllIl[4]];
            nearest2.interact(llIIlIIIlIll[llIIlIIIllIl[0]]);
            return llIIlIIIllIl[2];
        } else {
            return llIIlIIIllIl[2];
        }
    }

    private static boolean lllllIIIllIIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllllIIIlllIII(int i, int i2) {
        return i != i2;
    }

    private static String lllllIIIlIIIII(String lllllllllllllllIlIIllllIlIllllll, String lllllllllllllllIlIIllllIlIlllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllllIlIlllllI.toCharArray();
        int lllllllllllllllIlIIllllIlIlllIIl = llIIlIIIllIl[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIIllIl[2];
        while (lllllIIIlllIlI(i, length)) {
            char lllllllllllllllIlIIllllIllIIIIIl = charArray2[i];
            sb.append((char) (lllllllllllllllIlIIllllIllIIIIIl ^ charArray[lllllllllllllllIlIIllllIlIlllIIl % charArray.length]));
            "".length();
            lllllllllllllllIlIIllllIlIlllIIl++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllllIIIllIllI(int i) {
        return i == 0;
    }

    private static boolean lllllIIIlllIlI(int i, int i2) {
        return i < i2;
    }

    private static String lllllIIIlIIIIl(String lllllllllllllllIlIIllllIlllIIIlI, String lllllllllllllllIlIIllllIlllIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIlllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIlllIIIII.getBytes(StandardCharsets.UTF_8)), llIIlIIIllIl[16]), "DES");
            Cipher lllllllllllllllIlIIllllIlllIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllllIlllIIlIl.init(llIIlIIIllIl[5], lllllllllllllllIlIIllllIlllIlIII);
            return new String(lllllllllllllllIlIIllllIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllIlllIIIll) {
            lllllllllllllllIlIIllllIlllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIllIlII(Object obj) {
        return obj != null;
    }

    static {
        lllllIIIlIllll();
        lllllIIIlIIIlI();
    }

    private static boolean lllllIIIllIlll(Object obj) {
        return obj == null;
    }

    private static void lllllIIIlIllll() {
        llIIlIIIllIl = new int[17];
        llIIlIIIllIl[0] = (219 ^ 173) ^ (13 ^ 124);
        llIIlIIIllIl[1] = 53 ^ 59;
        llIIlIIIllIl[2] = (113 ^ 71) & ((191 ^ 137) ^ (-1));
        llIIlIIIllIl[3] = " ".length();
        llIIlIIIllIl[4] = (((123 + 110) - 69) + 21) ^ (((94 + 164) - 248) + 181);
        llIIlIIIllIl[5] = "  ".length();
        llIIlIIIllIl[6] = "   ".length();
        llIIlIIIllIl[7] = (((154 + 17) - 36) + 38) ^ (((126 + 57) - 43) + 29);
        llIIlIIIllIl[8] = 82 ^ 87;
        llIIlIIIllIl[9] = (-((-13601) & 30113)) & (-841) & 20473;
        llIIlIIIllIl[10] = (-8197) & 11318;
        llIIlIIIllIl[11] = (-29004) & 32123;
        llIIlIIIllIl[12] = (-((-4093) & 12286)) & (-577) & 11887;
        llIIlIIIllIl[13] = (-25425) & 28543;
        llIIlIIIllIl[14] = (-20738) & 23853;
        llIIlIIIllIl[15] = (-((-7211) & 15675)) & (-21059) & 32639;
        llIIlIIIllIl[16] = (((173 + 60) - 230) + 199) ^ (((141 + 0) - 45) + 98);
    }

    private static boolean lllllIIIlllIIl(int i, int i2) {
        return i == i2;
    }

    private static void lllllIIIlIIIlI() {
        llIIlIIIlIll = new String[llIIlIIIllIl[16]];
        llIIlIIIlIll[llIIlIIIllIl[2]] = lllllIIIIlllll("v5UZosv7lF7V1IaRedk3GQ==", "HhWot");
        llIIlIIIlIll[llIIlIIIllIl[3]] = lllllIIIlIIIII("Jw4NDhIN", "fzyoq");
        llIIlIIIlIll[llIIlIIIllIl[5]] = lllllIIIlIIIIl("rHaN3rg+dTQr+bQJ0RQ92g==", "OvenP");
        llIIlIIIlIll[llIIlIIIllIl[6]] = lllllIIIIlllll("IM1L0W/OxlU=", "DLmFs");
        llIIlIIIlIll[llIIlIIIllIl[7]] = lllllIIIlIIIII("Nxo3NRUdBy0zVgUDIjgaVgwvOxQ=", "vnCTv");
        llIIlIIIlIll[llIIlIIIllIl[8]] = lllllIIIlIIIII("NjcgOC0c", "wCTYN");
        llIIlIIIlIll[llIIlIIIllIl[4]] = lllllIIIlIIIII("NhACCw4cDRgNTRUNEUoPGwsU", "wdvjm");
        llIIlIIIlIll[llIIlIIIllIl[0]] = lllllIIIIlllll("P4QNypim2MA=", "uIasW");
    }

    private static boolean lllllIIIllIIlI(int i, int i2) {
        return i > i2;
    }

    private static String lllllIIIIlllll(String lllllllllllllllIlIIllllIlllllIIl, String lllllllllllllllIlIIllllIllllIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIIIllIl[5], lllllllllllllllIlIIllllIllllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllIlllllIll) {
            lllllllllllllllIlIIllllIlllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIIllIlIl(int i, int i2) {
        return i <= i2;
    }
}
