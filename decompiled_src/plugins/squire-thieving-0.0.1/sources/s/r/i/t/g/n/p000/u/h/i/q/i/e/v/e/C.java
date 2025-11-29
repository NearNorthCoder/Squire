package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Banking loot from pickpocketing", priority = 2000, blocking = true, register = true)
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.C  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/C.class */
public class C extends AbstractC0000a {
    private static /* synthetic */ int[] lIIllIlllIlll;
    private static final /* synthetic */ Logger au;
    private static /* synthetic */ String[] lIIllIlllIllI;

    static {
        lIllIIIllllIIll();
        lIllIIIllllIIlI();
        au = LoggerFactory.getLogger(C.class);
    }

    private static boolean lIllIIIlllllIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Override // s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.AbstractC0000a
    public boolean l() {
        if (!lIllIIIllllIlII(this.p.depositSeedVault() ? 1 : 0) && !lIllIIIllllIlIl(this.o.j() ? 1 : 0) && !lIllIIIllllIlIl(Bank.isOpen() ? 1 : 0)) {
            InventorySetup g = this.o.g();
            if (lIllIIIllllIlII(g.matchesInventory() ? 1 : 0)) {
                this.o.b((boolean) lIIllIlllIlll[0]);
            }
            if (lIllIIIllllIlII(this.p.gemBag() ? 1 : 0) && lIllIIIllllIlIl(this.o.k() ? 1 : 0)) {
                Item first = Bank.Inventory.getFirst(item -> {
                    return item.getName().toLowerCase().contains(lIIllIlllIllI[lIIllIlllIlll[2]]);
                });
                if (lIllIIIllllIllI(first)) {
                    first.interact(lIIllIlllIllI[lIIllIlllIlll[0]]);
                    return lIIllIlllIlll[1];
                }
            }
            g.withdraw();
            "".length();
            sleep(lIIllIlllIlll[2]);
            return lIIllIlllIlll[1];
        }
        return lIIllIlllIlll[0];
    }

    @Inject
    public C(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static boolean lIllIIIllllIlII(int i) {
        return i != 0;
    }

    private static void lIllIIIllllIIll() {
        lIIllIlllIlll = new int[5];
        lIIllIlllIlll[0] = ((84 ^ 42) ^ (20 ^ 127)) & (((68 ^ 10) ^ (207 ^ 148)) ^ (-" ".length()));
        lIIllIlllIlll[1] = " ".length();
        lIIllIlllIlll[2] = "  ".length();
        lIIllIlllIlll[3] = "   ".length();
        lIIllIlllIlll[4] = (183 ^ 191) ^ ((48 ^ 120) & ((139 ^ 195) ^ (-1)));
    }

    private static void lIllIIIllllIIlI() {
        lIIllIlllIllI = new String[lIIllIlllIlll[3]];
        lIIllIlllIllI[lIIllIlllIlll[0]] = lIllIIIlllIllll("Fik0Gxw=", "SDDoe");
        lIIllIlllIllI[lIIllIlllIlll[1]] = lIllIIIllllIIII("V2DW07QBZtgZO9tiSRj8nMxLVCy7V5We", "aJPFu");
        lIIllIlllIllI[lIIllIlllIlll[2]] = lIllIIIllllIIIl("vpXuJ9cK0dc=", "VSQCc");
    }

    private static String lIllIIIllllIIIl(String llllllllllllllIlllIllIlllIlIIlIl, String llllllllllllllIlllIllIlllIlIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlllIlIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIlllIlll[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIlllIlll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlllIlIIllI) {
            llllllllllllllIlllIllIlllIlIIllI.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlllIllll(String llllllllllllllIlllIllIlllIIlIlIl, String llllllllllllllIlllIllIlllIIlIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIlllIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIlllIIlIIll = new StringBuilder();
        char[] llllllllllllllIlllIllIlllIIlIIlI = llllllllllllllIlllIllIlllIIlIlII.toCharArray();
        int llllllllllllllIlllIllIlllIIlIIIl = lIIllIlllIlll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int llllllllllllllIlllIllIlllIIIlIIl = lIIllIlllIlll[0];
        while (lIllIIIlllllIII(llllllllllllllIlllIllIlllIIIlIIl, length)) {
            char llllllllllllllIlllIllIlllIIIlIII = charArray[llllllllllllllIlllIllIlllIIIlIIl];
            llllllllllllllIlllIllIlllIIlIIll.append((char) (llllllllllllllIlllIllIlllIIIlIII ^ llllllllllllllIlllIllIlllIIlIIlI[llllllllllllllIlllIllIlllIIlIIIl % llllllllllllllIlllIllIlllIIlIIlI.length]));
            "".length();
            llllllllllllllIlllIllIlllIIlIIIl++;
            llllllllllllllIlllIllIlllIIIlIIl++;
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIllIlllIIlIIll);
    }

    private static String lIllIIIllllIIII(String llllllllllllllIlllIllIlllIllIIlI, String llllllllllllllIlllIllIlllIlIllll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlllIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlllIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIlllIlll[2], llllllllllllllIlllIllIlllIllIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIlllIllIIll) {
            llllllllllllllIlllIllIlllIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIllllIllI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIIllllIlIl(int i) {
        return i == 0;
    }

    private static boolean lIllIIIllllIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        if (!lIllIIIllllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIllIIIllllIlII(chatMessage.getMessage().contains(lIIllIlllIllI[lIIllIlllIlll[1]]) ? 1 : 0)) {
            this.o.c(lIIllIlllIlll[1]);
        }
    }
}
