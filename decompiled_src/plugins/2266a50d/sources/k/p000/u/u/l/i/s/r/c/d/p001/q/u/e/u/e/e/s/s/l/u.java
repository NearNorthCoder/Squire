package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Drinking boost", priority = 9999)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.u  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/u.class */
public class u extends Task {
    private final /* synthetic */ SquireDukeSucellus aK;
    private static /* synthetic */ String[] lIllIIlIllll;
    private static /* synthetic */ int[] lIllIIllIIII;
    private final /* synthetic */ SquireDukeSucellusConfig aL;
    private final /* synthetic */ Client aJ;

    private static boolean lllIIlIllIllIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        return lllIIlIllIllII(NPCs.getNearest(npc -> {
            if (lllIIlIllIllIl(npc.getName().equals(lIllIIlIllll[lIllIIllIIII[0]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIIllIIII[2]];
                strArr[lIllIIllIIII[0]] = lIllIIlIllll[lIllIIllIIII[2]];
                if (lllIIlIllIllIl(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIIllIIII[2];
                    "".length();
                    return ((185 ^ 133) & ((77 ^ 113) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIIllIIII[0];
        })) ? lIllIIllIIII[0] : Combat.drinkBoostingPotion(lIllIIllIIII[1]);
    }

    @Inject
    public u(Client client, SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aJ = client;
        this.aK = squireDukeSucellus;
        this.aL = squireDukeSucellusConfig;
    }

    private static void lllIIlIllIlIlI() {
        lIllIIlIllll = new String[lIllIIllIIII[3]];
        lIllIIlIllll[lIllIIllIIII[0]] = lllIIlIllIlIIl("EScTNEQGJxs0CDknCw==", "URxQd");
        lIllIIlIllll[lIllIIllIIII[2]] = lllIIlIllIlIIl("BB8ZDw8u", "Ekmnl");
    }

    private static boolean lllIIlIllIlllI(int i, int i2) {
        return i < i2;
    }

    private static void lllIIlIllIlIll() {
        lIllIIllIIII = new int[4];
        lIllIIllIIII[0] = (13 ^ 22) & ((118 ^ 109) ^ (-1));
        lIllIIllIIII[1] = (((30 + 18) - (-37)) + 90) ^ (((153 + 126) - 219) + 97);
        lIllIIllIIII[2] = " ".length();
        lIllIIllIIII[3] = "  ".length();
    }

    private static boolean lllIIlIllIllII(Object obj) {
        return obj == null;
    }

    static {
        lllIIlIllIlIll();
        lllIIlIllIlIlI();
    }

    private static String lllIIlIllIlIIl(String lllllllllllllllIllIIIIIllIllIlIl, String lllllllllllllllIllIIIIIllIllIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIllIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIIIIllIllIIll = new StringBuilder();
        char[] lllllllllllllllIllIIIIIllIllIIlI = lllllllllllllllIllIIIIIllIllIlII.toCharArray();
        int lllllllllllllllIllIIIIIllIllIIIl = lIllIIllIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIllIIII[0];
        while (lllIIlIllIlllI(i, length)) {
            lllllllllllllllIllIIIIIllIllIIll.append((char) (charArray[i] ^ lllllllllllllllIllIIIIIllIllIIlI[lllllllllllllllIllIIIIIllIllIIIl % lllllllllllllllIllIIIIIllIllIIlI.length]));
            "".length();
            lllllllllllllllIllIIIIIllIllIIIl++;
            i++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIIIIllIllIIll);
    }
}
