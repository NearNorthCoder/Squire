package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Bulk opening", register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bB  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bB.class */
public class bB extends Task {
    private final /* synthetic */ ExecutorService gf;
    private static /* synthetic */ int[] lIIIllIll;

    /* renamed from: gg  reason: collision with root package name */
    private /* synthetic */ String f2gg;
    private final /* synthetic */ Client ge;
    private static /* synthetic */ String[] lIIIllIIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean run() {
        return lIIIllIll[0];
    }

    private static boolean llllIllIII(int i2, int i3) {
        return i2 < i3;
    }

    private static String llllIIllll(String llIIlIllIIllIII, String llIIlIllIIlIlll) {
        String str = new String(Base64.getDecoder().decode(llIIlIllIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlIllIIlIllI = new StringBuilder();
        char[] charArray = llIIlIllIIlIlll.toCharArray();
        int llIIlIllIIlIlII = lIIIllIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIllIll[0];
        while (llllIllIII(i2, length)) {
            llIIlIllIIlIllI.append((char) (charArray2[i2] ^ charArray[llIIlIllIIlIlII % charArray.length]));
            "".length();
            llIIlIllIIlIlII++;
            i2++;
            "".length();
            if (((6 ^ 86) & ((243 ^ 163) ^ (-1))) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llIIlIllIIlIllI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    public boolean cN() {
        if (llllIlIlII(this.f2gg)) {
            return lIIIllIll[0];
        }
        String[] strArr = new String[lIIIllIll[1]];
        strArr[lIIIllIll[0]] = this.f2gg;
        List all = Inventory.getAll(strArr);
        int i2 = lIIIllIll[0];
        Iterator it = all.iterator();
        do {
            if (llllIlIlIl(it.hasNext() ? 1 : 0)) {
                Item item = (Item) it.next();
                int i3 = i2;
                i2++;
                if (llllIlIllI(i3, lIIIllIll[2])) {
                    "".length();
                    if ("   ".length() < 0) {
                        return ((((94 + 0) - (-58)) + 5) ^ (((89 + 28) - 20) + 49)) & (((((69 + 25) - 41) + 112) ^ (((103 + 44) - 134) + 157)) ^ (-" ".length()));
                    }
                } else {
                    item.interact(lIIIllIIl[lIIIllIll[0]]);
                    "".length();
                }
            }
            sleep(lIIIllIll[1]);
            this.f2gg = null;
            return lIIIllIll[1];
        } while ("   ".length() != (((((42 + 41) - (-13)) + 50) ^ (((61 + 59) - 78) + 115)) & (((21 ^ 76) ^ (75 ^ 29)) ^ (-" ".length()))));
        return ((88 ^ 23) ^ (13 ^ 1)) & (((((95 + 57) - (-44)) + 9) ^ (((124 + 138) - 190) + 70)) ^ (-" ".length()));
    }

    private static boolean llllIlIlIl(int i2) {
        return i2 != 0;
    }

    private static boolean llllIlIlII(Object obj) {
        return obj == null;
    }

    private static boolean llllIlIllI(int i2, int i3) {
        return i2 > i3;
    }

    private static String llllIIllIl(String llIIlIllIlIlIII, String llIIlIllIlIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlIllIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllIll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlIllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlIllIlIlIIl) {
            llIIlIllIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static void llllIlIIll() {
        lIIIllIll = new int[6];
        lIIIllIll[0] = ((7 ^ 72) ^ (112 ^ 44)) & (((((153 + 120) - 216) + 133) ^ (((46 + 5) - (-47)) + 75)) ^ (-" ".length()));
        lIIIllIll[1] = " ".length();
        lIIIllIll[2] = 83 ^ 91;
        lIIIllIll[3] = "  ".length();
        lIIIllIll[4] = "   ".length();
        lIIIllIll[5] = (91 ^ 6) ^ (210 ^ 139);
    }

    private static boolean llllIlIlll(int i2) {
        return i2 == 0;
    }

    private static void llllIlIIII() {
        lIIIllIIl = new String[lIIIllIll[5]];
        lIIIllIIl[lIIIllIll[0]] = llllIIllIl("+QjqOSEvIH0=", "CSdxY");
        lIIIllIIl[lIIIllIll[1]] = llllIIllIl("I72n/GULN58=", "Ykwco");
        lIIIllIIl[lIIIllIll[3]] = llllIIllll("NzYVKg==", "GWvAm");
        lIIIllIIl[lIIIllIll[4]] = llllIIllIl("/Z99RmM4i4TLupFVpLT9ZGqLizG0uvA0", "ttnke");
    }

    static {
        llllIlIIll();
        llllIlIIII();
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        if (!llllIlIlIl(lIIIllIIl[lIIIllIll[1]].equals(menuEntryAdded.getOption()) ? 1 : 0) || llllIlIlll(menuEntryAdded.getTarget().contains(lIIIllIIl[lIIIllIll[3]]) ? 1 : 0)) {
            return;
        }
        this.ge.createMenuEntry(this.ge.getMenuOptionCount()).setOption(lIIIllIIl[lIIIllIll[4]]).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            this.f2gg = Text.removeTags(menuEntryAdded.getTarget());
            this.gf.submit(this::cN);
            "".length();
        });
        "".length();
    }

    @Inject
    public bB(Client client, ExecutorService executorService) {
        this.ge = client;
        this.gf = executorService;
    }
}
