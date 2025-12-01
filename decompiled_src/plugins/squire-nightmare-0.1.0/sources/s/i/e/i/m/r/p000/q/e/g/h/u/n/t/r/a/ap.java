package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking boost", priority = 11)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ap  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ap.class */
public class ap extends C {
    private static /* synthetic */ int[] llllIlIlIIII;
    private static /* synthetic */ String[] llllIlIIllII;

    @Inject
    protected ap(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin);
    }

    private static boolean lIIlIIIIllIlIIl(int i, int i2) {
        return i >= i2;
    }

    private static String lIIlIIIIlIlIIIl(String lllllllllllllllIIlIllIlIIIlIlIII, String lllllllllllllllIIlIllIlIIIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIlIIIlIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIlIIIlIlIlI.init(llllIlIlIIII[3], lllllllllllllllIIlIllIlIIIlIlIll);
            return new String(lllllllllllllllIIlIllIlIIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlIIIlIlIIl) {
            lllllllllllllllIIlIllIlIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIIlIlIIll(String lllllllllllllllIIlIllIlIIlIIlIlI, String lllllllllllllllIIlIllIlIIlIIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIlIIlIIlIII = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIlIIlIIlIIl.toCharArray();
        int lllllllllllllllIIlIllIlIIlIIIllI = llllIlIlIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIlIlIIII[0];
        while (lIIlIIIIllIlIlI(i, length)) {
            lllllllllllllllIIlIllIlIIlIIlIII.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIllIlIIlIIIllI % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIlIIlIIIllI++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllIlIIlIIlIII);
    }

    private static boolean lIIlIIIIllIIllI(int i) {
        return i == 0;
    }

    private static void lIIlIIIIllIIlIl() {
        llllIlIlIIII = new int[11];
        llllIlIlIIII[0] = ((4 ^ 120) ^ (99 ^ 37)) & (((((89 + 54) - (-32)) + 14) ^ (((42 + 113) - 41) + 21)) ^ (-" ".length()));
        llllIlIlIIII[1] = " ".length();
        llllIlIlIIII[2] = "   ".length();
        llllIlIlIIII[3] = "  ".length();
        llllIlIlIIII[4] = 139 ^ 142;
        llllIlIlIIII[5] = (((148 + 97) - 213) + 145) ^ (((58 + 42) - 40) + 130);
        llllIlIlIIII[6] = (72 ^ 44) ^ ((93 ^ 78) & ((29 ^ 14) ^ (-1)));
        llllIlIlIIII[7] = 102 ^ 98;
        llllIlIlIIII[8] = (((135 + 19) - 24) + 59) ^ (((36 + 177) - 60) + 34);
        llllIlIlIIII[9] = 186 ^ 189;
        llllIlIlIIII[10] = 107 ^ 99;
    }

    private static boolean lIIlIIIIllIIlll(int i) {
        return i != 0;
    }

    public int a(Skill skill) {
        return llllIlIlIIII[4] + ((Skills.getLevel(skill) * llllIlIlIIII[5]) / llllIlIlIIII[6]);
    }

    private static boolean lIIlIIIIllIlIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIIIIlIlIlIl() {
        llllIlIIllII = new String[llllIlIlIIII[9]];
        llllIlIIllII[llllIlIlIIII[0]] = lIIlIIIIlIIllIl("MNKJkTKpztg=", "HTVbf");
        llllIlIIllII[llllIlIlIIII[1]] = lIIlIIIIlIlIIIl("T+rWIUUwsKY=", "uPicB");
        llllIlIIllII[llllIlIlIIII[3]] = lIIlIIIIlIlIIIl("Hu//aztyvhs=", "JBbJr");
        llllIlIIllII[llllIlIlIIII[2]] = lIIlIIIIlIlIIll("GCc6JydLMz42NAg5", "kRJBU");
        llllIlIIllII[llllIlIlIIII[7]] = lIIlIIIIlIlIIll("EA81ERNDGzEAAAAR", "czEta");
        llllIlIIllII[llllIlIlIIII[4]] = lIIlIIIIlIlIIIl("VBP6wS6XdtKXobSUDV2leg==", "aaMvQ");
        llllIlIIllII[llllIlIlIIII[8]] = lIIlIIIIlIlIIll("BDknCwBXPyMcFxkrIwY=", "wLWnr");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C
    public boolean bY() {
        if (!lIIlIIIIllIIllI(this.cL.isInInstancedRegion() ? 1 : 0) && !lIIlIIIIllIIlll(this.cM.aq() ? 1 : 0) && !lIIlIIIIllIIllI(bZ() ? 1 : 0)) {
            NPC d = SquireNightmarePlugin.d();
            if (lIIlIIIIllIlIII(d)) {
                return llllIlIlIIII[0];
            }
            String[] strArr = new String[llllIlIlIIII[1]];
            strArr[llllIlIlIIII[0]] = llllIlIIllII[llllIlIlIIII[0]];
            if (lIIlIIIIllIIllI(d.hasAction(strArr) ? 1 : 0)) {
                return llllIlIlIIII[0];
            }
            Item first = Inventory.getFirst(item -> {
                if (!lIIlIIIIllIIllI(item.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[4]]) ? 1 : 0) || lIIlIIIIllIIlll(item.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[8]]) ? 1 : 0)) {
                    ?? r0 = llllIlIlIIII[1];
                    "".length();
                    return ((((49 + 4) - 34) + 132) ^ (((94 + 50) - 99) + 101)) <= 0 ? ((211 ^ 154) ^ (106 ^ 115)) & (((228 ^ 131) ^ (176 ^ 135)) ^ (-" ".length())) : r0;
                }
                return llllIlIlIIII[0];
            });
            if (lIIlIIIIllIlIII(first)) {
                return llllIlIlIIII[0];
            }
            if (lIIlIIIIllIlIIl(Skills.getLevel(Skill.STRENGTH) + ((int) (0.5d * a(Skill.STRENGTH))), Skills.getBoostedLevel(Skill.STRENGTH))) {
                first.interact(llllIlIIllII[llllIlIlIIII[1]]);
                sleep(llllIlIlIIII[2]);
                return llllIlIlIIII[1];
            }
            int a = (int) (0.5d * a(Skill.ATTACK));
            if (lIIlIIIIllIIlll(Inventory.contains(item2 -> {
                if (lIIlIIIIllIIlll(item2.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[7]]) ? 1 : 0) && lIIlIIIIllIlIIl(Skills.getLevel(Skill.ATTACK) + a, Skills.getBoostedLevel(Skill.ATTACK))) {
                    ?? r0 = llllIlIlIIII[1];
                    "".length();
                    return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llllIlIlIIII[0];
            }) ? 1 : 0)) {
                Inventory.getFirst(item3 -> {
                    return item3.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[2]]);
                }).interact(llllIlIIllII[llllIlIlIIII[3]]);
                sleep(llllIlIlIIII[2]);
                return llllIlIlIIII[1];
            }
            return llllIlIlIIII[0];
        }
        return llllIlIlIIII[0];
    }

    private static String lIIlIIIIlIIllIl(String lllllllllllllllIIlIllIlIIIllIlIl, String lllllllllllllllIIlIllIlIIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIIIllIlII.getBytes(StandardCharsets.UTF_8)), llllIlIlIIII[10]), "DES");
            Cipher lllllllllllllllIIlIllIlIIIllIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIlIIIllIlll.init(llllIlIlIIII[3], lllllllllllllllIIlIllIlIIIlllIII);
            return new String(lllllllllllllllIIlIllIlIIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlIIIllIllI) {
            lllllllllllllllIIlIllIlIIIllIllI.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIIIIllIIlIl();
        lIIlIIIIlIlIlIl();
    }

    private static boolean lIIlIIIIllIlIII(Object obj) {
        return obj == null;
    }
}
