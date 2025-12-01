package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking brews", priority = 25)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.v  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/v.class */
public class v extends u {
    private /* synthetic */ w ae = w.NONE;
    private static /* synthetic */ String[] lIlIllIlllllI;
    private static /* synthetic */ int[] lIlIllIllllll;

    private static boolean llIIIIIlllIllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String llIIIIIlllIIlll(String llllllllllllllIllIlIIIIllIIIIIIl, String llllllllllllllIllIlIIIIllIIIIIII) {
        String llllllllllllllIllIlIIIIllIIIIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIIIIllIIIIIII.toCharArray();
        int llllllllllllllIllIlIIIIlIlllllIl = lIlIllIllllll[0];
        char[] charArray2 = llllllllllllllIllIlIIIIllIIIIIIl2.toCharArray();
        int llllllllllllllIllIlIIIIlIlllIllI = charArray2.length;
        int i = lIlIllIllllll[0];
        while (llIIIIIlllIlIlI(i, llllllllllllllIllIlIIIIlIlllIllI)) {
            char llllllllllllllIllIlIIIIllIIIIIlI = charArray2[i];
            sb.append((char) (llllllllllllllIllIlIIIIllIIIIIlI ^ charArray[llllllllllllllIllIlIIIIlIlllllIl % charArray.length]));
            "".length();
            llllllllllllllIllIlIIIIlIlllllIl++;
            i++;
            "".length();
            if ((100 ^ 96) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIIIIlllIllII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        if (llIIIIIlllIlIlI(Combat.getCurrentHealth(), this.i.eatAt())) {
            this.ae = w.BREWING;
            "".length();
            if ((((((30 + 177) - 99) + 145) ^ (((22 + 29) - (-37)) + 93)) & (((((150 + 177) - 280) + 185) ^ (((105 + 118) - 186) + 123)) ^ (-" ".length()))) != 0) {
                return ((109 ^ 1) ^ (192 ^ 171)) & (((((158 + 147) - 140) + 1) ^ (((102 + 67) - 80) + 72)) ^ (-" ".length()));
            }
        } else if (llIIIIIlllIlIll(Combat.getMissingHealth()) && llIIIIIlllIllII(Skills.getLevel(Skill.STRENGTH), Skills.getBoostedLevel(Skill.STRENGTH))) {
            this.ae = w.RESTORING;
            "".length();
            if ((-((122 ^ 114) ^ (35 ^ 47))) > 0) {
                return ((26 ^ 126) ^ (70 ^ 30)) & (((26 ^ 116) ^ (50 ^ 96)) ^ (-" ".length()));
            }
        } else if (llIIIIIlllIllIl(this.ae, w.RESTORING)) {
            this.ae = w.NONE;
        }
        if (llIIIIIlllIllIl(this.ae, w.NONE)) {
            return lIlIllIllllll[0];
        }
        Item first = Inventory.getFirst(item -> {
            String str;
            String name = item.getName();
            if (llIIIIIlllIllIl(this.ae, w.BREWING)) {
                str = lIlIllIlllllI[lIlIllIllllll[1]];
                "".length();
                if (" ".length() <= (-" ".length())) {
                    return ((((173 + 173) - 312) + 162) ^ (((157 + 138) - 111) + 11)) & (((99 ^ 100) ^ ((47 ^ 9) & ((123 ^ 93) ^ (-1)))) ^ (-" ".length()));
                }
            } else {
                str = lIlIllIlllllI[lIlIllIllllll[2]];
            }
            return name.contains(str);
        });
        if (llIIIIIlllIlllI(first)) {
            return lIlIllIllllll[0];
        }
        first.interact(lIlIllIlllllI[lIlIllIllllll[0]]);
        return lIlIllIllllll[1];
    }

    private static void llIIIIIlllIlIII() {
        lIlIllIlllllI = new String[lIlIllIllllll[3]];
        lIlIllIlllllI[lIlIllIllllll[0]] = llIIIIIlllIIllI("JPQfwE3LB1g=", "GFFCl");
        lIlIllIlllllI[lIlIllIllllll[1]] = llIIIIIlllIIllI("MTUe0w1E9ZEHAhVDYHvJQQ==", "mMbnE");
        lIlIllIlllllI[lIlIllIllllll[2]] = llIIIIIlllIIlll("FQQ/FAJmAyoCBCkDKg==", "FqOqp");
    }

    private static String llIIIIIlllIIllI(String llllllllllllllIllIlIIIIlIllIllII, String llllllllllllllIllIlIIIIlIllIlIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIIlIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIIlIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIIlIllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIIlIllIlllI.init(lIlIllIllllll[2], llllllllllllllIllIlIIIIlIllIllll);
            return new String(llllllllllllllIllIlIIIIlIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIIlIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIIlIllIllIl) {
            llllllllllllllIllIlIIIIlIllIllIl.printStackTrace();
            return null;
        }
    }

    static {
        llIIIIIlllIlIIl();
        llIIIIIlllIlIII();
    }

    private static void llIIIIIlllIlIIl() {
        lIlIllIllllll = new int[4];
        lIlIllIllllll[0] = ((191 ^ 193) ^ (173 ^ 195)) & (((67 ^ 2) ^ (83 ^ 2)) ^ (-" ".length()));
        lIlIllIllllll[1] = " ".length();
        lIlIllIllllll[2] = "  ".length();
        lIlIllIllllll[3] = "   ".length();
    }

    private static boolean llIIIIIlllIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIIlllIlllI(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIIlllIlIll(int i) {
        return i <= 0;
    }
}
