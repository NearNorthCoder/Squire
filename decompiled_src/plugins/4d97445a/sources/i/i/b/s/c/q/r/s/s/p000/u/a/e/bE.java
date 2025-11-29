package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.repeat.SquireQuickMenuConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
@TaskDesc(name = "Quick Alching", register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bE  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bE.class */
public class bE extends Task {
    private static /* synthetic */ String[] lIIlIll;
    private final /* synthetic */ Client gj;
    private static /* synthetic */ int[] lIIllII;
    private /* synthetic */ boolean gm;
    private final /* synthetic */ ExecutorService gl;
    private final /* synthetic */ SquireQuickMenuConfig gk;

    private static String lIIllIlIl(String lllIllllIlIIlll, String lllIllllIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIllllIlIlIIl = Cipher.getInstance("Blowfish");
            lllIllllIlIlIIl.init(lIIllII[2], secretKeySpec);
            return new String(lllIllllIlIlIIl.doFinal(Base64.getDecoder().decode(lllIllllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllllIlIlIII) {
            lllIllllIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIII(int i2) {
        return i2 != 0;
    }

    @Inject
    public bE(Client client, SquireQuickMenuConfig squireQuickMenuConfig, ExecutorService executorService) {
        this.gj = client;
        this.gk = squireQuickMenuConfig;
        this.gl = executorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    public boolean run() {
        if (lIIlllIII(this.gm ? 1 : 0) && lIIlllIII(Tabs.isOpen(Tab.MAGIC) ? 1 : 0)) {
            Tabs.open(Tab.INVENTORY);
            this.gm = lIIllII[0];
        }
        return lIIllII[0];
    }

    private static String lIIllIlII(String lllIllllIIllIlI, String lllIllllIIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllllIIllIIl.getBytes(StandardCharsets.UTF_8)), lIIllII[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIllllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllllIIllIll) {
            lllIllllIIllIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        MenuEntry menuEntry = menuEntryAdded.getMenuEntry();
        if (!lIIlllIII(D(menuEntry.getItemId()) ? 1 : 0) || lIIlllIII(menuEntry.getOption().contains(lIIlIll[lIIllII[1]]) ? 1 : 0)) {
            return;
        }
        this.gj.createMenuEntry(this.gj.getMenuOptionCount()).setOption(lIIlIll[lIIllII[2]]).setTarget(menuEntry.getTarget()).setIdentifier(menuEntry.getIdentifier()).setParam1(menuEntry.getParam1()).setParam0(menuEntry.getParam0()).setDeprioritized((boolean) lIIllII[0]).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry2 -> {
            this.gl.submit(() -> {
                SpellBook.Standard standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
                int[] iArr = new int[lIIllII[1]];
                iArr[lIIllII[0]] = menuEntry.getItemId();
                Magic.cast(standard, Inventory.getFirst(iArr));
                this.gm = lIIllII[1];
            });
            "".length();
        });
        "".length();
    }

    private static String lIIllIIll(String lllIllllIllllII, String lllIllllIlllIll) {
        String str = new String(Base64.getDecoder().decode(lllIllllIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIllllIlllIlI = new StringBuilder();
        char[] lllIllllIlllIIl = lllIllllIlllIll.toCharArray();
        int lllIllllIlllIII = lIIllII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIIllII[0];
        while (lIIlllIIl(i2, length)) {
            lllIllllIlllIlI.append((char) (charArray[i2] ^ lllIllllIlllIIl[lllIllllIlllIII % lllIllllIlllIIl.length]));
            "".length();
            lllIllllIlllIII++;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllIllllIlllIlI);
    }

    private static boolean lIIlllIIl(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    private boolean D(int i2) {
        String[] split = this.gk.quickAlch().split(lIIlIll[lIIllII[0]]);
        int length = split.length;
        int i3 = lIIllII[0];
        while (lIIlllIIl(i3, length)) {
            if (lIIlllIII(split[i3].trim().equals(String.valueOf(i2)) ? 1 : 0)) {
                return lIIllII[1];
            }
            i3++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return ((32 ^ 75) ^ (39 ^ 7)) & (((((34 + 154) - 148) + 152) ^ (((32 + 114) - 31) + 24)) ^ (-" ".length())) & ((((53 ^ 99) ^ (56 ^ 86)) & (((((79 + 107) - 170) + 156) ^ (((94 + 78) - 117) + 93)) ^ (-" ".length()))) ^ (-" ".length()));
            }
        }
        return lIIllII[0];
    }

    private static void lIIllIllI() {
        lIIlIll = new String[lIIllII[3]];
        lIIlIll[lIIllII[0]] = lIIllIIll("Zg==", "JGLHo");
        lIIlIll[lIIllII[1]] = lIIllIlII("6JdqVvwujeU=", "DSLNw");
        lIIlIll[lIIllII[2]] = lIIllIlIl("EF4Bozh4tsq1Qe7Nk5MHOcgv9GQLPScA", "WdVum");
    }

    static {
        lIIllIlll();
        lIIllIllI();
    }

    private static void lIIllIlll() {
        lIIllII = new int[5];
        lIIllII[0] = ((19 ^ 28) ^ (31 ^ 115)) & (((((186 + 114) - 112) + 35) ^ (((52 + 77) - 29) + 88)) ^ (-" ".length()));
        lIIllII[1] = " ".length();
        lIIllII[2] = "  ".length();
        lIIllII[3] = "   ".length();
        lIIllII[4] = 102 ^ 110;
    }
}
