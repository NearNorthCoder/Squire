package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Using Bankloadout", priority = 80, blocking = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/n.class */
public class C0013n extends AbstractC0014o {
    private static /* synthetic */ int[] lIlIllIIIlIll;
    private static /* synthetic */ String[] lIlIllIIIlIlI;

    private static String llIIIIIIIlIlIIl(String llllllllllllllIllIlIIllIllIIIIll, String llllllllllllllIllIlIIllIllIIIIlI) {
        String llllllllllllllIllIlIIllIllIIIIll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIllIllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIIllIllIIIIlI.toCharArray();
        int llllllllllllllIllIlIIllIlIllllll = lIlIllIIIlIll[0];
        char[] charArray2 = llllllllllllllIllIlIIllIllIIIIll2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIllIIIlIll[0];
        while (llIIIIIIIlIllIl(i2, length)) {
            char llllllllllllllIllIlIIllIllIIIlII = charArray2[i2];
            sb.append((char) (llllllllllllllIllIlIIllIllIIIlII ^ charArray[llllllllllllllIllIlIIllIlIllllll % charArray.length]));
            "".length();
            llllllllllllllIllIlIIllIlIllllll++;
            i2++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void llIIIIIIIlIlIlI() {
        lIlIllIIIlIlI = new String[lIlIllIIIlIll[2]];
        lIlIllIIIlIlI[lIlIllIIIlIll[0]] = llIIIIIIIlIlIIl("LAMjIQ8ABW0sBwcOKC5GW0I5IwsLEW0jCE4DbTgJGU5tORIBEj0jCAk=", "nbMJf");
    }

    private static boolean llIIIIIIIlIllIl(int i2, int i3) {
        return i2 < i3;
    }

    private static void llIIIIIIIlIlIll() {
        lIlIllIIIlIll = new int[3];
        lIlIllIIIlIll[0] = (75 ^ 43) & ((220 ^ 188) ^ (-1));
        lIlIllIIIlIll[1] = (((82 + 14) - 51) + 122) ^ (((128 + 122) - 102) + 14);
        lIlIllIIIlIll[2] = " ".length();
    }

    private static boolean llIIIIIIIlIllII(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.AbstractC0014o
    public boolean Q() {
        if (llIIIIIIIlIllII(R() ? 1 : 0)) {
            return lIlIllIIIlIll[0];
        }
        if (llIIIIIIIlIllII(T().needsToBank() ? 1 : 0)) {
            Bank.close();
            return lIlIllIIIlIll[0];
        } else if (llIIIIIIIlIllII(BankLoadouts.withdrawWithRetries(T(), lIlIllIIIlIll[1]).booleanValue() ? 1 : 0)) {
            Log.info(lIlIllIIIlIlI[lIlIllIIIlIll[0]]);
            return lIlIllIIIlIll[0];
        } else {
            return lIlIllIIIlIll[2];
        }
    }

    @Inject
    protected C0013n(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    static {
        llIIIIIIIlIlIll();
        llIIIIIIIlIlIlI();
    }
}
