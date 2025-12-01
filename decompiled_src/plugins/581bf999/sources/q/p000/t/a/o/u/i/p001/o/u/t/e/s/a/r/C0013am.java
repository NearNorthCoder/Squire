package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Smelling salts", priority = 100)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.am  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/am.class */
public class C0013am extends Z {
    private static /* synthetic */ int[] lIlllIlllll;
    private final /* synthetic */ C cR;
    private static /* synthetic */ String[] lIlllIlllIl;

    private static boolean lIIllIlIIIlllI(int i) {
        return i != 0;
    }

    private static void lIIllIlIIIlIII() {
        lIlllIlllll = new int[9];
        lIlllIlllll[0] = ((((155 + 43) - 108) + 71) ^ (((112 + 57) - 114) + 74)) & (((95 ^ 77) ^ (182 ^ 132)) ^ (-" ".length()));
        lIlllIlllll[1] = " ".length();
        lIlllIlllll[2] = (-((-24579) & 25978)) & (-129) & 15871;
        lIlllIlllll[3] = 95 ^ 75;
        lIlllIlllll[4] = "  ".length();
        lIlllIlllll[5] = "   ".length();
        lIlllIlllll[6] = (85 ^ 120) ^ (30 ^ 55);
        lIlllIlllll[7] = (31 ^ 7) ^ (49 ^ 44);
        lIlllIlllll[8] = 73 ^ 65;
    }

    @Inject
    protected C0013am(Client client, C c) {
        super(client);
        this.cR = c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    public boolean run() {
        if (lIIllIlIIIlIlI(bc() ? 1 : 0)) {
            return lIlllIlllll[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (lIIllIlIIIlllI(item.getName().contains(lIlllIlllIl[lIlllIlllll[5]]) ? 1 : 0) && lIIllIlIIIlllI(item.getName().contains(lIlllIlllIl[lIlllIlllll[6]]) ? 1 : 0)) {
                ?? r0 = lIlllIlllll[1];
                "".length();
                return " ".length() >= "  ".length() ? ((127 ^ 59) ^ (208 ^ 171)) & (((207 ^ 188) ^ (65 ^ 13)) ^ (-" ".length())) : r0;
            }
            return lIlllIlllll[0];
        });
        if (lIIllIlIIIllII(first)) {
            first = Inventory.getFirst(item2 -> {
                return item2.getName().contains(lIlllIlllIl[lIlllIlllll[4]]);
            });
            if (lIIllIlIIIllII(first)) {
                return lIlllIlllll[0];
            }
        }
        if ((!lIIllIlIIIlllI(first.getName().contains(lIlllIlllIl[lIlllIlllll[0]]) ? 1 : 0) || !lIIllIlIIlIIII(this.cR.av().getOrDefault(EnumC0056e.SMELLING_SALTS, Integer.valueOf(lIlllIlllll[0])).intValue(), lIlllIlllll[1]) || !lIIllIlIIIlIlI(aq() ? 1 : 0) || !lIIllIlIIIlIlI(this.d.dehydration() ? 1 : 0)) && !lIIllIlIIIllII(Players.getLocal().getInteracting()) && !lIIllIlIIlIIll(Vars.getBit(lIlllIlllll[2]))) {
            if (!lIIllIlIIlIlII(Skills.getBoostedLevel(Skill.STRENGTH) - Skills.getLevel(Skill.STRENGTH), lIlllIlllll[3]) || (lIIllIlIIIlllI(aq() ? 1 : 0) && !lIIllIlIIIlIlI(this.d.dehydration() ? 1 : 0))) {
                first.interact(lIlllIlllIl[lIlllIlllll[1]]);
                return lIlllIlllll[1];
            }
            return lIlllIlllll[0];
        }
        return lIlllIlllll[0];
    }

    private static String lIIllIlIIIIIIl(String llllllllllllllllIlIIlIlllIIlIIlI, String llllllllllllllllIlIIlIlllIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlllIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIlllIlllll[8]), "DES");
            Cipher llllllllllllllllIlIIlIlllIIlIlII = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIlllIIlIlII.init(lIlllIlllll[4], secretKeySpec);
            return new String(llllllllllllllllIlIIlIlllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIlllIIlIIll) {
            llllllllllllllllIlIIlIlllIIlIIll.printStackTrace();
            return null;
        }
    }

    private static void lIIllIlIIIIlII() {
        lIlllIlllIl = new String[lIlllIlllll[7]];
        lIlllIlllIl[lIlllIlllll[0]] = lIIllIlIIIIIIl("LyTYlrrmnFU=", "PrmdL");
        lIlllIlllIl[lIlllIlllll[1]] = lIIllIlIIIIIlI("Bgg0BCE=", "EzAwI");
        lIlllIlllIl[lIlllIlllll[4]] = lIIllIlIIIIIlI("MDcCFQk=", "CVnaz");
        lIlllIlllIl[lIlllIlllll[5]] = lIIllIlIIIIIll("6EtKiEB5Ed0=", "BIZjj");
        lIlllIlllIl[lIlllIlllll[6]] = lIIllIlIIIIIlI("Ug==", "cbqTm");
    }

    private static boolean lIIllIlIIIlIlI(int i) {
        return i == 0;
    }

    private static boolean lIIllIlIIIllII(Object obj) {
        return obj == null;
    }

    static {
        lIIllIlIIIlIII();
        lIIllIlIIIIlII();
    }

    private static boolean lIIllIlIIlIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIlIIlIlII(int i, int i2) {
        return i > i2;
    }

    private static String lIIllIlIIIIIll(String llllllllllllllllIlIIlIlllIllIlll, String llllllllllllllllIlIIlIlllIllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlllIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIlllll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIlllIlllIII) {
            llllllllllllllllIlIIlIlllIlllIII.printStackTrace();
            return null;
        }
    }

    private static String lIIllIlIIIIIlI(String llllllllllllllllIlIIlIlllIlIIlll, String llllllllllllllllIlIIlIlllIlIIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIlllIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIlIlllIlIIlIl = new StringBuilder();
        char[] llllllllllllllllIlIIlIlllIlIIlII = llllllllllllllllIlIIlIlllIlIIllI.toCharArray();
        int llllllllllllllllIlIIlIlllIlIIIll = lIlllIlllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlllIlllll[0];
        while (lIIllIlIIlIIII(i, length)) {
            char llllllllllllllllIlIIlIlllIlIlIII = charArray[i];
            llllllllllllllllIlIIlIlllIlIIlIl.append((char) (llllllllllllllllIlIIlIlllIlIlIII ^ llllllllllllllllIlIIlIlllIlIIlII[llllllllllllllllIlIIlIlllIlIIIll % llllllllllllllllIlIIlIlllIlIIlII.length]));
            "".length();
            llllllllllllllllIlIIlIlllIlIIIll++;
            i++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIlIlllIlIIlIl);
    }

    private static boolean lIIllIlIIlIIll(int i) {
        return i > 0;
    }
}
