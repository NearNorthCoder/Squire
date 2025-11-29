package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking range potion")
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.C  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/C.class */
public class C extends Task {
    private final /* synthetic */ l aF;
    private static /* synthetic */ int[] lIllIIlIlIlII;
    private static /* synthetic */ String[] lIllIIlIlIIII;

    @Inject
    public C(l lVar) {
        this.aF = lVar;
    }

    private static boolean llIIIllIIIIllIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIIllIIIIlllI(int i) {
        return i == 0;
    }

    private static boolean llIIIllIIIIllll(int i, int i2) {
        return i < i2;
    }

    private static void llIIIllIIIIlIIl() {
        lIllIIlIlIlII = new int[6];
        lIllIIlIlIlII[0] = (54 ^ 38) & ((154 ^ 138) ^ (-1));
        lIllIIlIlIlII[1] = "   ".length() ^ (45 ^ 43);
        lIllIIlIlIlII[2] = 22 ^ 16;
        lIllIIlIlIlII[3] = " ".length();
        lIllIIlIlIlII[4] = "  ".length();
        lIllIIlIlIlII[5] = "   ".length();
    }

    static {
        llIIIllIIIIlIIl();
        llIIIllIIIIIlIl();
    }

    private static String llIIIlIllllllll(String llllllllllllllIllIIlIlIIIIIlIllI, String llllllllllllllIllIIlIlIIIIIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIIIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIlIlIlII[4], llllllllllllllIllIIlIlIIIIIllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIIIIIlIlll) {
            llllllllllllllIllIIlIlIIIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static void llIIIllIIIIIlIl() {
        lIllIIlIlIIII = new String[lIllIIlIlIlII[5]];
        lIllIIlIlIIII[lIllIIlIlIlII[0]] = llIIIlIllllllll("8fdw4yRGM6A=", "pRZzS");
        lIllIIlIlIIII[lIllIIlIlIlII[3]] = llIIIllIIIIIlII("ETc9Ah4NMQ==", "cVSew");
        lIllIIlIlIIII[lIllIIlIlIlII[4]] = llIIIllIIIIIlII("IAs/JRotBA==", "BjLQs");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIllIIIIlIlI(this.aF.B() ? 1 : 0) || llIIIllIIIIlIlI(this.aF.A() ? 1 : 0)) {
            return lIllIIlIlIlII[0];
        }
        if (llIIIllIIIIlIll(this.aF.z(), lIllIIlIlIlII[1])) {
            return lIllIIlIlIlII[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (!llIIIllIIIIlllI(item.getName().toLowerCase().contains(lIllIIlIlIIII[lIllIIlIlIlII[3]]) ? 1 : 0) || llIIIllIIIIlIlI(item.getName().toLowerCase().contains(lIllIIlIlIIII[lIllIIlIlIlII[4]]) ? 1 : 0)) {
                ?? r0 = lIllIIlIlIlII[3];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIIlIlIlII[0];
        });
        if (!llIIIllIIIIllIl(first) && !llIIIllIIIIlIll(Skills.getBoostedLevel(Skill.RANGED) - Skills.getLevel(Skill.RANGED), lIllIIlIlIlII[2])) {
            first.interact(lIllIIlIlIIII[lIllIIlIlIlII[0]]);
            return lIllIIlIlIlII[3];
        }
        return lIllIIlIlIlII[0];
    }

    private static String llIIIllIIIIIlII(String llllllllllllllIllIIlIlIIIIIIIllI, String llllllllllllllIllIIlIlIIIIIIIlIl) {
        String llllllllllllllIllIIlIlIIIIIIIllI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIlIIIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIlIIIIIIIlII = new StringBuilder();
        char[] charArray = llllllllllllllIllIIlIlIIIIIIIlIl.toCharArray();
        int llllllllllllllIllIIlIlIIIIIIIIlI = lIllIIlIlIlII[0];
        char[] charArray2 = llllllllllllllIllIIlIlIIIIIIIllI2.toCharArray();
        int length = charArray2.length;
        int i = lIllIIlIlIlII[0];
        while (llIIIllIIIIllll(i, length)) {
            char llllllllllllllIllIIlIlIIIIIIIlll = charArray2[i];
            llllllllllllllIllIIlIlIIIIIIIlII.append((char) (llllllllllllllIllIIlIlIIIIIIIlll ^ charArray[llllllllllllllIllIIlIlIIIIIIIIlI % charArray.length]));
            "".length();
            llllllllllllllIllIIlIlIIIIIIIIlI++;
            i++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlIlIIIIIIIlII);
    }

    private static boolean llIIIllIIIIlIlI(int i) {
        return i != 0;
    }

    private static boolean llIIIllIIIIlIll(int i, int i2) {
        return i > i2;
    }
}
