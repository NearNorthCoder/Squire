package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking restore", priority = 85)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ah  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ah.class */
public class C0008ah extends Z {
    private static /* synthetic */ int[] llIIIllIIll;
    private static /* synthetic */ String[] llIIIllIIlI;
    private final /* synthetic */ C cL;

    private static void lIIllllIllllII() {
        llIIIllIIll = new int[7];
        llIIIllIIll[0] = "   ".length();
        llIIIllIIll[1] = ((152 ^ 179) ^ (84 ^ 106)) & (((((109 + 103) - 137) + 135) ^ (((12 + 43) - 1) + 145)) ^ (-" ".length()));
        llIIIllIIll[2] = " ".length();
        llIIIllIIll[3] = "  ".length();
        llIIIllIIll[4] = (71 ^ 8) ^ (117 ^ 46);
        llIIIllIIll[5] = (-((-10755) & 11975)) & (-16401) & 31964;
        llIIIllIIll[6] = 184 ^ 188;
    }

    private static String lIIllllIlllIIl(String llllllllllllllllIlIIIIllIlIIIlIl, String llllllllllllllllIlIIIIllIlIIIlII) {
        String llllllllllllllllIlIIIIllIlIIIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIIllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIIIllIlIIIlII.toCharArray();
        int llllllllllllllllIlIIIIllIlIIIIIl = llIIIllIIll[1];
        char[] charArray2 = llllllllllllllllIlIIIIllIlIIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = llIIIllIIll[1];
        while (lIIllllIlllllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIlIIIIllIlIIIIIl % charArray.length]));
            "".length();
            llllllllllllllllIlIIIIllIlIIIIIl++;
            i++;
            "".length();
            if ((195 ^ 199) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlllllIIIIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlllllIIIIlI(int i) {
        return i > 0;
    }

    private static boolean lIIllllIllllll(int i) {
        return i == 0;
    }

    static {
        lIIllllIllllII();
        lIIllllIlllIll();
    }

    private static boolean lIIllllIlllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllllIllllIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlllllIIIIII(int i) {
        return i <= 0;
    }

    private static boolean lIIlllllIIIIll(int i) {
        return i != 0;
    }

    @Inject
    protected C0008ah(Client client, C c) {
        super(client);
        this.cL = c;
    }

    private static void lIIllllIlllIll() {
        llIIIllIIlI = new String[llIIIllIIll[6]];
        llIIIllIIlI[llIIIllIIll[1]] = lIIllllIlllIIl("HQgQLx0=", "YzyAv");
        llIIIllIIlI[llIIIllIIll[2]] = lIIllllIlllIlI("bV2ODZGZw28=", "EGptN");
        llIIIllIIlI[llIIIllIIll[3]] = lIIllllIlllIIl("NTMoABER", "fRFft");
        llIIIllIIlI[llIIIllIIll[0]] = lIIllllIlllIlI("FOXYuzj3NGU=", "ItXsJ");
    }

    private static String lIIllllIlllIlI(String llllllllllllllllIlIIIIllIlIlIlIl, String llllllllllllllllIlIIIIllIlIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIllIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIIllIlIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIIllIlIlIlll.init(llIIIllIIll[3], secretKeySpec);
            return new String(llllllllllllllllIlIIIIllIlIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIllIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIllIlIlIllI) {
            llllllllllllllllIlIIIIllIlIlIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    public boolean run() {
        int i;
        int i2;
        Skill[] skillArr = new Skill[llIIIllIIll[0]];
        skillArr[llIIIllIIll[1]] = Skill.STRENGTH;
        skillArr[llIIIllIIll[2]] = Skill.MAGIC;
        skillArr[llIIIllIIll[3]] = Skill.RANGED;
        if (lIIllllIllllIl(Skills.getBoostedLevel(Skill.PRAYER), llIIIllIIll[4])) {
            i = llIIIllIIll[2];
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIIIllIIll[1];
        }
        int i3 = i;
        int length = skillArr.length;
        int i4 = llIIIllIIll[1];
        do {
            if (lIIllllIlllllI(i4, length)) {
                Skill skill = skillArr[i4];
                if (lIIllllIlllllI(this.cu.getBoostedSkillLevel(skill), this.cu.getRealSkillLevel(skill))) {
                    i3 = llIIIllIIll[2];
                    "".length();
                    if (((93 ^ 123) & ((74 ^ 108) ^ (-1))) < 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    i4++;
                    "".length();
                }
            }
            if (lIIllllIllllll(i3)) {
                return llIIIllIIll[1];
            }
            if (!lIIlllllIIIIII(aX()) || lIIlllllIIIIIl(NPCs.getNearest(npc -> {
                String[] strArr = new String[llIIIllIIll[2]];
                strArr[llIIIllIIll[1]] = llIIIllIIlI[llIIIllIIll[0]];
                return npc.hasAction(strArr);
            }))) {
                i2 = llIIIllIIll[2];
                "".length();
                if ((-"  ".length()) > 0) {
                    return ((228 ^ 170) ^ (95 ^ 58)) & (((((21 + 128) - 106) + 89) ^ (((3 + 8) - (-37)) + 127)) ^ (-" ".length()));
                }
            } else {
                i2 = llIIIllIIll[1];
            }
            if (lIIllllIllllll(i2)) {
                return llIIIllIIll[1];
            }
            if ((!lIIlllllIIIIlI(aX()) || !lIIlllllIIIIII(aY())) && !lIIlllllIIIIlI(Vars.getBit(llIIIllIIll[5]))) {
                Item first = Inventory.getFirst(item -> {
                    if (lIIllllIllllll(EnumC0056e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) && lIIllllIllllll(item.getName().contains(llIIIllIIlI[llIIIllIIll[2]]) ? 1 : 0) && !lIIlllllIIIIll(item.getName().contains(llIIIllIIlI[llIIIllIIll[3]]) ? 1 : 0)) {
                        return llIIIllIIll[1];
                    }
                    ?? r0 = llIIIllIIll[2];
                    "".length();
                    return ((140 ^ 170) & ((55 ^ 17) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                });
                if (lIIlllllIIIIIl(first) && lIIlllllIIIIll(this.cL.am() ? 1 : 0)) {
                    first.interact(llIIIllIIlI[llIIIllIIll[1]]);
                    this.cL.ao();
                    return llIIIllIIll[2];
                }
                return llIIIllIIll[1];
            }
            return llIIIllIIll[1];
        } while (" ".length() == " ".length());
        return ((79 ^ 103) ^ (20 ^ 54)) & (((139 ^ 140) ^ (138 ^ 135)) ^ (-" ".length()));
    }
}
