package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Killing zombified spawn", priority = 50)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.y  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/y.class */
public class y extends w {
    private static /* synthetic */ String[] lIlIlIlIIlIll;
    private static /* synthetic */ int[] lIlIlIlIIlllI;

    private static boolean lIlllllIllIIIll(int i2) {
        return i2 != 0;
    }

    @Inject
    protected y(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private static void lIlllllIllIIIII() {
        lIlIlIlIIlllI = new int[6];
        lIlIlIlIIlllI[0] = ((93 ^ 71) ^ (5 ^ 56)) & (((29 ^ 62) ^ (43 ^ 47)) ^ (-" ".length()));
        lIlIlIlIIlllI[1] = " ".length();
        lIlIlIlIIlllI[2] = (-8758) & 12927;
        lIlIlIlIIlllI[3] = "  ".length();
        lIlIlIlIIlllI[4] = "   ".length();
        lIlIlIlIIlllI[5] = 124 ^ 116;
    }

    private static boolean lIlllllIllIIlIl(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlllllIlIlIIII(String llllllllllllllIllIlIllIIIllIIIll, String llllllllllllllIllIlIllIIIllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIIIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIllIIIllIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIllIIIllIIlIl.init(lIlIlIlIIlllI[3], secretKeySpec);
            return new String(llllllllllllllIllIlIllIIIllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIIIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIllIIIllIIlII) {
            llllllllllllllIllIlIllIIIllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIllIIIIl(int i2) {
        return i2 == 0;
    }

    private static String lIlllllIlIlIlII(String llllllllllllllIllIlIllIIIlIIIllI, String llllllllllllllIllIlIllIIIlIIIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIllIIIlIIIlIl.toCharArray();
        int llllllllllllllIllIlIllIIIlIIIIlI = lIlIlIlIIlllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIllIlIllIIIIlllIlI = lIlIlIlIIlllI[0];
        while (lIlllllIllIIlIl(llllllllllllllIllIlIllIIIIlllIlI, length)) {
            sb.append((char) (charArray2[llllllllllllllIllIlIllIIIIlllIlI] ^ charArray[llllllllllllllIllIlIllIIIlIIIIlI % charArray.length]));
            "".length();
            llllllllllllllIllIlIllIIIlIIIIlI++;
            llllllllllllllIllIlIllIIIIlllIlI++;
            "".length();
            if ((((((138 + 15) - 133) + 202) ^ (((128 + 61) - 163) + 119)) & (((3 ^ 73) ^ (43 ^ 46)) ^ (-" ".length()))) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlllllIlIlIlIl(String llllllllllllllIllIlIllIIIlIlIllI, String llllllllllllllIllIlIllIIIlIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIIIlIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIlllI[5]), "DES");
            Cipher llllllllllllllIllIlIllIIIlIllIII = Cipher.getInstance("DES");
            llllllllllllllIllIlIllIIIlIllIII.init(lIlIlIlIIlllI[3], llllllllllllllIllIlIllIIIlIllIIl);
            return new String(llllllllllllllIllIlIllIIIlIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIIIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIllIIIlIlIlll) {
            llllllllllllllIllIlIllIIIlIlIlll.printStackTrace();
            return null;
        }
    }

    static {
        lIlllllIllIIIII();
        lIlllllIlIlIllI();
    }

    private static boolean lIlllllIllIIlII(Object obj) {
        return obj == null;
    }

    private static void lIlllllIlIlIllI() {
        lIlIlIlIIlIll = new String[lIlIlIlIIlllI[4]];
        lIlIlIlIIlIll[lIlIlIlIIlllI[0]] = lIlllllIlIlIIII("esZwmxxl1xk=", "ELaId");
        lIlIlIlIIlIll[lIlIlIlIIlllI[1]] = lIlllllIlIlIlII("BSArAQ4=", "RINmj");
        lIlIlIlIIlIll[lIlIlIlIIlllI[3]] = lIlllllIlIlIlIl("yBgvHBEpTV4=", "NuHbJ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        if (lIlllllIllIIIIl(this.cg.I() ? 1 : 0)) {
            return lIlIlIlIIlllI[0];
        }
        NPC A = this.cg.A();
        if ((!lIlllllIllIIIlI(A) || lIlllllIllIIIll(A.isDead() ? 1 : 0)) && lIlllllIllIIIlI(Players.getLocal().getInteracting())) {
            Movement.setDestination(Players.getLocal().getWorldLocation());
            return lIlIlIlIIlllI[0];
        }
        int[] iArr = new int[lIlIlIlIIlllI[1]];
        iArr[lIlIlIlIIlllI[0]] = lIlIlIlIIlllI[2];
        if (lIlllllIllIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIlIlIIlllI[1]];
            iArr2[lIlIlIlIIlllI[0]] = lIlIlIlIIlllI[2];
            Inventory.getFirst(iArr2).interact(lIlIlIlIIlIll[lIlIlIlIIlllI[0]]);
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return ((192 ^ 130) ^ (218 ^ 191)) & (((69 ^ 12) ^ (12 ^ 98)) ^ (-" ".length()));
            }
        } else {
            Inventory.interact(item -> {
                return item.getName().toLowerCase().contains(lIlIlIlIIlIll[lIlIlIlIIlllI[3]]);
            }, lIlIlIlIIlIll[lIlIlIlIIlllI[1]]);
            "".length();
        }
        if (lIlllllIllIIlII(A)) {
            return lIlIlIlIIlllI[1];
        }
        Magic.cast(SpellBook.Standard.CRUMBLE_UNDEAD, A);
        return lIlIlIlIIlllI[1];
    }

    private static boolean lIlllllIllIIIlI(Object obj) {
        return obj != null;
    }
}
